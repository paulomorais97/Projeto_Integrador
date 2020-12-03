import { Component, OnInit } from '@angular/core';
import { AlertService } from '../service/alert.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private alert: AlertService) { }

  ngOnInit(){
    window.scroll(0,0)
  }
  venda(){
    this.alert.showAlertInfo('Item adicionado ao carrinho')
  }

}
