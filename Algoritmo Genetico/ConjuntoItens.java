
public class ConjuntoItens { 
   String produto;
   int peso;
   int valor;
   Integer necessidade;

   ConjuntoItens(String produto, int i, int j, Integer necessidade){ 
    this.produto = produto;
    this.peso = i;
    this.valor = j;
    this.necessidade = necessidade;

   }

   ConjuntoItens[] produtos = {new ConjuntoItens("Arroz",5,22,10)};

}