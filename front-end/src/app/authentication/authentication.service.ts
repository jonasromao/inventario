import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { of as observableOf } from 'rxjs';

import { LoginTO } from '../models/login.to';

@Injectable()
export class AuthenticationService {

  constructor(
    private httpClient: HttpClient,
  ) { }

  login(loginTO: LoginTO) {
    // TODO: implementar chamada ao login
    return observableOf(loginTO.email === 'admin' && loginTO.senha === 'admin');    
  }

  logout() {
    
  }
}