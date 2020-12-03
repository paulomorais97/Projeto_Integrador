import { HttpClient, HttpHandler, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Produtos } from '../model/Produtos';

@Injectable({
  providedIn: 'root'
})
export class ProdutosService {

  constructor(private http: HttpClient) { }


  token = {
    headers: new HttpHeaders().set('Authorization', localStorage.getItem('token'))
  }

  getAllProdutos(){
    return this.http.get('https://longevida.herokuapp.com/produtos', this.token)
  }

  getByIdProduto(id: number){
    return this.http.get(`https://longevida.herokuapp.com/produtos/${id}`, this.token)
  }

  getProdutoByName(nome: string){
    return this.http.get(`https://longevida.herokuapp.com/produtos/produto/${nome}`, this.token)
  }

  postProdutos(produtos: Produtos){
    return this.http.post('https://longevida.herokuapp.com/produtos',produtos, this.token)
  }
  putProdutos(produtos: Produtos){
    return this.http.put(`https://longevida.herokuapp.com/produtos/${produtos.id}`, produtos, this.token)
  }

  deleteProdutos(id: number){
    return this.http.delete(`https://longevida.herokuapp.com/produtos/${id}`, this.token)
  }
}
