import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Categoria } from '../model/Categoria';
import { Produtos } from '../model/Produtos';
import { AlertService } from '../service/alert.service';
import { CategoriaService } from '../service/categoria.service';
import { ProdutosService } from '../service/produtos.service';

@Component({
  selector: 'app-put-produto',
  templateUrl: './put-produto.component.html',
  styleUrls: ['./put-produto.component.css']
})
export class PutProdutoComponent implements OnInit {

  produtos: Produtos = new Produtos()
  idProduto: number

  categoria: Categoria = new Categoria()
  listaCategoria: Categoria[]
  idCategoria: number

  constructor(
    private categoriaService: CategoriaService,
    private produtoService: ProdutosService,
    private router: Router,
    private route: ActivatedRoute,
    private alert: AlertService
  ) { }

  ngOnInit() {
    window.scroll(0,0)

    this.idProduto = this.route.snapshot.params["id"]
    this.findByIdProduto(this.idProduto)


    this.findAllCategoria()
  }
  findByIdProduto(id: number){
    this.produtoService.getByIdProduto(id).subscribe((resp: Produtos) => {
      this.produtos = resp
    })
  }

  findByIdCategoria(){
    this.categoriaService.getByIdCategoria(this.idCategoria).subscribe((resp: Categoria) => {
      this.categoria = resp
    })
  }

  findAllCategoria(){
    this.categoriaService.getAllCategoria().subscribe((resp: Categoria[]) => {
      this.listaCategoria = resp
    })
  }

  salvar(){
    this.produtoService.putProdutos(this.produtos).subscribe((resp: Produtos) => {
      this.produtos = resp
      this.router.navigate(['/cadastroAdm'])
      this.alert.showAlertSuccess('Produto alterado com sucesso!')
    })
  }

}
