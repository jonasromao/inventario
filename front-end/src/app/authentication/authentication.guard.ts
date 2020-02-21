import { Injectable } from '@angular/core';
import { CanActivateChild, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';

@Injectable()
export class AuthenticationGuard implements CanActivateChild {
  
  canActivateChild(childRoute: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    // TODO: implementar lógica de obter dados do usuário logado
    return true;
  }
  
}