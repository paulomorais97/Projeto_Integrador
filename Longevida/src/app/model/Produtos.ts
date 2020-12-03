import { Categoria } from './Categoria';

export class Produtos{
    public id: number;
    public nameProduto: string;
    public quantidadeProduto: number;
    public descricaoProduto: string;
    public precoProduto: number;
    public categoria: Categoria;
}