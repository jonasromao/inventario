import { Component } from '@angular/core';

import { RouterService } from '../../services/router.service';

@Component({
  selector: 'app-registrar',
  templateUrl: './registrar.component.html',
  styleUrls: ['./registrar.component.scss', '../../styles/flat-page.scss'],
})
export class RegistrarComponent {
  
  nomeCompleto: string;
  email: string;
  senha: string;
  confirmarSenha: string;

  constructor(
    private router: RouterService,
  ) { }
  
  login() {
    this.router.navigateToLogin();
  }

  registrar() {
    // TODO: chamar serviço de criar usuário?
  }

}