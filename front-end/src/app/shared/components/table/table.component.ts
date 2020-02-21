import { Component, Input, SimpleChanges } from '@angular/core';

import { Observable, Subscription } from 'rxjs';

import { Column } from './column.model';
import { Action } from './action.model';
import { PagedResult } from './paged-result.model';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.scss'],
})
export class TableComponent {
  @Input() columns: Column[];
  @Input() actions: Action<any>[];
  
  @Input() sourceObservable: Observable<PagedResult<any>>;

  @Input() rows: number = 10;

  value: any[];
  totalRecords: number;

  loading: boolean;

  hasActions: boolean;
  
  subscription: Subscription;

  ngOnChanges(changes: SimpleChanges) {
    if (changes.sourceObservable) {
      this.resubscribe();
    }
    if (changes.actions) {
      this.setHasActions();
    }
  }

  setHasActions() {
    this.hasActions = Boolean(this.actions && this.actions.length);
  }

  resubscribe() { 
    this.unsubscribe();
    this.subscribe();
  }

  subscribe() {
    if (this.sourceObservable) {
      this.loading = true;
      this.subscription = this.sourceObservable.subscribe(result => {
        this.value = result.registros;
        this.totalRecords = result.qtRegistros;
        this.loading = false;
      }, error => {
        this.loading = false;
        throw error;
      });
    }
  }

  unsubscribe() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
}