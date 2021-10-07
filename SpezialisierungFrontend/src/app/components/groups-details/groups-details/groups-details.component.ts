import { Component, OnInit } from '@angular/core';
import { Group } from 'src/app/models/group';
import { GroupListService } from 'src/app/services/group-list.service';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';

@Component({
  selector: 'app-groups-details',
  templateUrl: './groups-details.component.html',
  styleUrls: ['./groups-details.component.css']
})
export class GroupsDetailsComponent implements OnInit {
  group: Group[] = [];
  groupName: String | undefined;
  groups: Group | undefined;
  pageRequested = 1;

  constructor(private groupListService: GroupListService, private activatedRoute: ActivatedRoute,
    private location: Location) { }

  // ngOnInit(): void {
  //   this.groupListService.findByGroupId().subscribe(data => {
  //     this.group = data;

  //   })
  // }
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

onPageChange(page: number) {
  this.pageRequested = page;
  console.log(this.pageRequested);
}


}
