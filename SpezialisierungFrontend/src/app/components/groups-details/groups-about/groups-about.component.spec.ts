import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GroupsAboutComponent } from './groups-about.component';

describe('GroupsAboutComponent', () => {
  let component: GroupsAboutComponent;
  let fixture: ComponentFixture<GroupsAboutComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GroupsAboutComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GroupsAboutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
