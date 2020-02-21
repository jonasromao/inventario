import { Component } from '@angular/core';
import { Column } from 'src/app/shared/components/table/column.model';
import { Action } from 'src/app/shared/components/table/action.model';
import { PersonTO } from 'src/app/models/person.to';
import { PersonService } from 'src/app/services/person.service';
import { PagedResult } from 'src/app/shared/components/table/paged-result.model';
import { Observable } from 'rxjs';
import { UsuarioService } from 'src/app/services/usuario.service';
import { UsuarioTO } from 'src/app/models/usaurio.to';

@Component({
  selector: 'app-crud-page',
  templateUrl: './usuarios.component.html',
  styleUrls: ['./usuarios.component.scss'],
})
export class UsuarioPageComponent {
  columns: Column[] = [
    { header: 'Name', field: 'nome' },
  ];
  actions: Action<PersonTO>[] = [
    { title: 'Edit', icon: 'pi pi-pencil', handler: p => this.editPerson(p) },
    { title: 'Remove', icon: 'pi pi-trash', handler: p => this.removePerson(p) },
  ];

  getObservable: Observable<PagedResult<UsuarioTO>>;

  constructor(
    private usuarioService: UsuarioService,
  ) { }

  ngOnInit() {
    this.getObservable = this.usuarioService.get();
  }

  editPerson(p: PersonTO) {
    alert('edit ' + p.name);
  }

  removePerson(p: PersonTO) {
    alert('remove ' + p.name);
  }
}