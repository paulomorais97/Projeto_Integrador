import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../model/User';
import { AlertService } from '../service/alert.service';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {
 
  user: User = new User()
  senha: string

  constructor(
    private authService: AuthService,
    private router: Router,
    private alert: AlertService
  ) { }

  ngOnInit(){
    window.scroll(0,0)

   
  }

  conferirSenha(event: any){
    this.senha = event.target.value
  }

  cadastrar(){

    if(this.senha === this.user.senha){
      this.authService.cadastrar(this.user).subscribe((resp: User) =>{
        this.user = resp
        this.router.navigate(['/login'])
        this.alert.showAlertSuccess('Usuario cadastrado com sucesso')
      })

    }else{
      this.alert.showAlertDanger('Suas senhas não conferem')
    }



  }

}

