import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of as observableOf } from 'rxjs';
import { environment } from 'src/environments/environment';
import { UsuarioTO } from '../models/usaurio.to';

@Injectable({
   providedIn: 'root',
})
export class UsuarioService {

    constructor(
        private httpClient: HttpClient,
    ) { }

    get():any {
       let url = environment.baseUrl + '/usuario'
       this.httpClient.get( url ).subscribe( retorno => {
        console.log(retorno);
        return retorno;
       }, error => {
           return null;
       } );
    }

}