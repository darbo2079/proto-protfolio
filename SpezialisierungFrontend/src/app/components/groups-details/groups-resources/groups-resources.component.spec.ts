import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GroupsResourcesComponent } from './groups-resources.component';

describe('GroupsResourcesComponent', () => {
  let component: GroupsResourcesComponent;
  let fixture: ComponentFixture<GroupsResourcesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GroupsResourcesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GroupsResourcesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
