import { NgModule } from '@angular/core';

import { SharedModule } from '../shared/shared.module';

import { LoginComponent } from './login/login.component';
import { RegistrarComponent } from './registrar/registrar.component';
import { HomeComponent } from './home/home.component';
import { CrudPageModule } from './crud-page/crud-page.module';
import { UsuarioPageComponent } from './usuarios/usuarios.component';

@NgModule({
  imports: [
    SharedModule,
    CrudPageModule,
  ],
  declarations: [
    LoginComponent,
    RegistrarComponent,
    HomeComponent,
    UsuarioPageComponent,
  ],
})
export class PagesModule { }