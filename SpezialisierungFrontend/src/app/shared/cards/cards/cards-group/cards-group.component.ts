import { Component, OnInit } from '@angular/core';
import { Group } from 'src/app/models/group';
import { GroupListService } from 'src/app/services/group-list.service';

@Component({
  selector: 'app-cards-group',
  templateUrl: './cards-group.component.html',
  styleUrls: ['./cards-group.component.css']
})
export class CardsGroupComponent implements OnInit {
  group: Group[] = [];


  constructor(private groupListService: GroupListService) { }

  public getGroupId() {

  }

  ngOnInit(): void {
    this.groupListService.findAll().subscribe(data => {
      this.group = data;
      console.log(this.group);
    })
  }

}
