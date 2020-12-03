import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Categoria } from '../model/Categoria';

@Injectable({
  providedIn: 'root'
})
export class CategoriaService {

  constructor(private http: HttpClient) { }

  token ={
    headers: new HttpHeaders().set('Authorization', localStorage.getItem('token'))
  }

  getAllCategoria(){
    return this.http.get('https://longevida.herokuapp.com/categorias', this.token)
  }

  getByIdCategoria(id: number){
    return this.http.get(`https://longevida.herokuapp.com/categorias/${id}`, this.token)
  }

  getByNameCategoria(nome: string){
    return this.http.get(`https://longevida.herokuapp.com/categorias/categoria/${nome}`, this.token)
  }
  postCategoria(categoria: Categoria){
    return this.http.post('https://longevida.herokuapp.com/categorias', categoria, this.token)
  }
  putCategoria(categoria: Categoria){
    return this.http.put(`https://longevida.herokuapp.com/categorias/${categoria.id}`, categoria, this.token)
  }
  deleteCategoria(id: number){
    return this.http.delete(`https://longevida.herokuapp.com/categorias/${id}`, this.token)
  }

}
