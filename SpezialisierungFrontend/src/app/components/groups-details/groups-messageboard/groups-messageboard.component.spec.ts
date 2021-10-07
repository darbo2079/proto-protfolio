import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GroupsMessageboardComponent } from './groups-messageboard.component';

describe('GroupsMessageboardComponent', () => {
  let component: GroupsMessageboardComponent;
  let fixture: ComponentFixture<GroupsMessageboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GroupsMessageboardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GroupsMessageboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
