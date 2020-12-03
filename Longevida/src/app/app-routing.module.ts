import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CadastroComponent } from './cadastro/cadastro.component';
import { ContatoComponent } from './contato/contato.component';
import { CrudProdutoComponent } from './crud-produto/crud-produto.component';
import { DeleteCategoriaComponent } from './delete-categoria/delete-categoria.component';
import { DeleteProdutoComponent } from './delete-produto/delete-produto.component';
import { EmpresaComponent } from './empresa/empresa.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ProdutosComponent } from './produtos/produtos.component';
import { PutCategoriaComponent } from './put-categoria/put-categoria.component';
import { PutProdutoComponent } from './put-produto/put-produto.component';

const routes: Routes = [
{path: '', redirectTo: 'home',pathMatch:'full'}, 
{path:'home', component: HomeComponent},
{path:'produtos', component: ProdutosComponent},
{path:'contato', component: ContatoComponent},
{path:'cadastro', component: CadastroComponent},
{path:'login', component: LoginComponent},
{path: 'empresa',component: EmpresaComponent},
{path: 'cadastroAdm', component: CrudProdutoComponent},
{path: 'editarCategoria/:id', component: PutCategoriaComponent},
{path: 'deleteCategoria/:id', component: DeleteCategoriaComponent},
{path: 'put-produto/:id', component: PutProdutoComponent},
{path: 'delete-produto/:id', component: DeleteProdutoComponent}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
