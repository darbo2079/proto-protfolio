import { Component, OnInit } from '@angular/core';
import { GroupListService } from 'src/app/services/group-list.service';
import { Group } from 'src/app/models/group';
@Component({
  selector: 'app-content-group',
  templateUrl: './content-group.component.html',
  styleUrls: ['./content-group.component.css']
})
export class ContentGroupComponent implements OnInit {
  group: Group[] = [];

  constructor(private groupListService: GroupListService) { }

  ngOnInit(): void {
    this.groupListService.findAll().subscribe(data => {
      this.group = data;
      console.log(this.group);
    })
  }

}
