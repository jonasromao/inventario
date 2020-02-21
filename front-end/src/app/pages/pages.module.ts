import { NgModule } from '@angular/core';

import { SharedModule } from '../shared/shared.module';

import { LoginComponent } from './login/login.component';
import { RegistrarComponent } from './registrar/registrar.component';
import { HomeComponent } from './home/home.component';
import { CrudPageModule } from './crud-page/crud-page.module';
import { UsuarioPageModule } from './usuarios/usuarios.module';

@NgModule({
  imports: [
    SharedModule,
    CrudPageModule,
    UsuarioPageModule,
  ],
  declarations: [
    LoginComponent,
    RegistrarComponent,
    HomeComponent,
  ],
})
export class PagesModule { }