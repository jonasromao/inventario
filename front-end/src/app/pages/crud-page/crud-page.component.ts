import { Component } from '@angular/core';
import { Column } from 'src/app/shared/components/table/column.model';
import { Action } from 'src/app/shared/components/table/action.model';
import { PersonTO } from 'src/app/models/person.to';
import { PersonService } from 'src/app/services/person.service';
import { PagedResult } from 'src/app/shared/components/table/paged-result.model';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-crud-page',
  templateUrl: './crud-page.component.html',
  styleUrls: ['./crud-page.component.scss'],
})
export class CrudPageComponent {
  columns: Column[] = [
    { header: 'Name', field: 'name' },
    { header: 'Email', field: 'email' },
    { header: 'Address', field: 'address' },
    { header: 'Phone', field: 'phone' },
  ];
  actions: Action<PersonTO>[] = [
    { title: 'Edit', icon: 'pi pi-pencil', handler: p => this.editPerson(p) },
    { title: 'Remove', icon: 'pi pi-trash', handler: p => this.removePerson(p) },
  ];

  getPeopleObservable: Observable<PagedResult<PersonTO>>;

  constructor(
    private personService: PersonService,
  ) { }

  ngOnInit() {
    this.getPeopleObservable = this.personService.getPeople();
  }

  editPerson(p: PersonTO) {
    alert('edit ' + p.name);
  }

  removePerson(p: PersonTO) {
    alert('remove ' + p.name);
  }
}