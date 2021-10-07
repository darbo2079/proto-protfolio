import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GroupsMembersComponent } from './groups-members.component';

describe('GroupsMembersComponent', () => {
  let component: GroupsMembersComponent;
  let fixture: ComponentFixture<GroupsMembersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GroupsMembersComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GroupsMembersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
