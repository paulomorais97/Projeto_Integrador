import { Component, OnInit } from '@angular/core';
import { Categoria } from '../model/Categoria';
import { Produtos } from '../model/Produtos';
import { AlertService } from '../service/alert.service';
import { CategoriaService } from '../service/categoria.service';
import { ProdutosService } from '../service/produtos.service';

@Component({
  selector: 'app-produtos',
  templateUrl: './produtos.component.html',
  styleUrls: ['./produtos.component.css']
})
export class ProdutosComponent implements OnInit {
  
  key = 'data'
  reverse = true

  produto: Produtos = new Produtos()
  listaProdutos: Produtos[] 
  idProduto: number
  nomeProduto: string

  listaProdutosCat: Categoria[]
  nomeCategoria: string
  listaCategoria: Categoria[]


  constructor(
    private produtosService: ProdutosService,
    private alert: AlertService,
    private categoriaService: CategoriaService
    ) { }

  ngOnInit(){
    window.scroll(0,0)
    this.findAllProdutos()
    this.findAllCategoria()
  }

  findAllProdutos(){
    this.produtosService.getAllProdutos().subscribe((resp: Produtos[])=>{
      this.listaProdutos = resp
    })
  }

  findByIdProduto(){
    this.produtosService.getByIdProduto(this.idProduto).subscribe((resp: Produtos) =>{
      this.produto = resp
    })
  }

  getProdutoByName() {
    if (this.nomeProduto === ''){
      this.findAllProdutos()
    } else {
      this.produtosService.getProdutoByName(this.nomeProduto).subscribe((resp: Produtos[]) => {
        this.listaProdutos = resp
      })
    }
  }

  getProdutoByCategoria(){
    if (this.nomeCategoria === ''){
      this.findAllProdutos()
    } else {
      this.categoriaService.getByNameCategoria(this.nomeCategoria).subscribe((resp: Categoria[]) => {
        this.listaProdutosCat = resp
      })
    }
  }

  findAllCategoria(){
    this.categoriaService.getAllCategoria().subscribe((resp: Categoria[])=>{
      this.listaCategoria = resp
    })
  }
  venda(){
    this.alert.showAlertSuccess('Item adicionado ao carrinho')
  }
  
}
