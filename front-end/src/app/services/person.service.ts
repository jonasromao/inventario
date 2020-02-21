import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of as observableOf } from 'rxjs';
import { PagedResult } from '../shared/components/table/paged-result.model';
import { PersonTO } from '../models/person.to';

@Injectable({
  providedIn: 'root',
})
export class PersonService {
  
  constructor(
    private httpClient: HttpClient,
  ) { }


  getPeople(): Observable<PagedResult<PersonTO>> {
    return observableOf({
      qtRegistros: 2,
      registros: [
        { name: 'César', email: 'cbterceiro@gmail.com', address: 'R. Fortaleza, 285, Pq Jacaraípe', phone: '998586955' },
        { name: 'Jonas', email: 'jonasromao@gmail.com', address: 'Rua da Rataria, Cariacica', phone: '999999999' },  
      ],
    });
  }
}