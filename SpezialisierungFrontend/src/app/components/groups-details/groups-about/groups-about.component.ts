import { Component, OnInit } from '@angular/core';
import { GroupListService } from '../../../services/group-list.service';
import { Group } from '../../../models/group';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-groups-about',
  templateUrl: './groups-about.component.html',
  styleUrls: ['./groups-about.component.css']
})
export class GroupsAboutComponent implements OnInit {
  group: Group[] = [];
  groupName: String | undefined;
  groups: Group | undefined;

  constructor(private groupListService: GroupListService, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.groupListService.findByGroupId().subscribe(data => {
      this.group = data;
      console.log(data);

      const id = this.activatedRoute.snapshot.paramMap.get('groupId');
    console.log(id);
    // var name = this.group.find(x => x.groupId == id);

     this.groups = data.find(x => x.groupId === id);
    console.log(this.groups);
    // console.log(Group);
    })
}

}
