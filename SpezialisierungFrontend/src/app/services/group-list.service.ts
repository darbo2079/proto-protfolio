import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Group } from '../models/group';

@Injectable({
  providedIn: 'root'
})
export class GroupListService {

  private groupsUrl: string;




  constructor(private http: HttpClient) {
    this.groupsUrl = 'http://localhost:8080';
   }

  public findAll(): Observable<Group[]> {
    return this.http.get<Group[]>(this.groupsUrl)
  }



  public findByGroupId(): Observable<Group[]> {
    return this.http.get<Group[]>(this.groupsUrl)
  }


}
