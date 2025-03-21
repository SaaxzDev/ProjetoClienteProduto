package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;

public class TesteSistema {

    public static void main(String[] args) {


        // Instanciar objetos
        Cliente objCliente = new Cliente();
        Produto objProduto = new Produto();

        // entradas
        objCliente.setIdade(25);
        objCliente.setNome("Gabriel");
        objCliente.setEmail("gbr@gmail.com");
        objCliente.setRenda(7.055);

        //entrada do produto
        objProduto.setCodigo(123);
        objProduto.setMarca("Nike");
        objProduto.setTipo("Camiseta");
        objProduto.setValor(149.99);

        // saídas
        System.out.println( "INFORMAÇÕES DO CLIENTE" +
              "\nIdade: " + objCliente.getIdade() +
                      "\nNome: " + objCliente.getNome() +
                      "\nEmail: " + objCliente.getEmail() +
                      "\nRenda: " + objCliente.getRenda()
        );
        //saidas do produto
        System.out.println( "\nINFORMAÇÕES DO PRODUTO" +
        "\nCódigo: " + objProduto.getCodigo() +
          "\nMarca: " + objProduto.getMarca() +
                "\nTipo: " + objProduto.getTipo() +
                "\nValor: " + objProduto.getValor()
                );

    }

}
