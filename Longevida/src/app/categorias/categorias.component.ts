import { Component, OnInit } from '@angular/core';
import { Categoria } from '../model/Categoria';
import { AlertService } from '../service/alert.service';
import { CategoriaService } from '../service/categoria.service';

@Component({
  selector: 'app-categorias',
  templateUrl: './categorias.component.html',
  styleUrls: ['./categorias.component.css']
})
export class CategoriasComponent implements OnInit {
  
  key = 'data'
  reverse = true

  categoria: Categoria = new Categoria
  listaCategoria: Categoria[] 
  idCategoria: number

  constructor(
    private categoriaService: CategoriaService
  
    ) { }

  ngOnInit(){
    window.scroll(0,0)
    this.findAllCategoria()
  }

  findAllCategoria(){
    this.categoriaService.getAllCategoria().subscribe((resp: Categoria[])=>{
      this.listaCategoria = resp
    })
  }

  findByIdCategoria(){
    this.categoriaService.getByIdCategoria(this.idCategoria).subscribe((resp: Categoria)=>{
      this.categoria = resp
    })
  }

}
