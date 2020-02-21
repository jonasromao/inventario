import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AuthenticationGuard } from './authentication/authentication.guard';

import { LoginComponent } from './pages/login/login.component';
import { RegistrarComponent } from './pages/registrar/registrar.component';
import { HomeComponent } from './pages/home/home.component';
import { LayoutComponent } from './layout/layout.component';
import { CrudPageComponent } from './pages/crud-page/crud-page.component';
import { UsuarioPageComponent } from './pages/usuarios/usuarios.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent, },
  { path: 'registrar', component: RegistrarComponent, },
  {
    path: '', canActivateChild: [AuthenticationGuard], component: LayoutComponent, children: [
      { path: '', redirectTo: 'home', pathMatch: 'full', },
      { path: 'home', component: HomeComponent, },
      { path: 'crud-page', component: CrudPageComponent, },
      { path: 'usuarios', component: UsuarioPageComponent, },
    ]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
