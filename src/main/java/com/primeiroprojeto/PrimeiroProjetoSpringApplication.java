package com.primeiroprojeto;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.primeiroprojeto.domain.Categoria;
import com.primeiroprojeto.domain.Cidade;
import com.primeiroprojeto.domain.Cliente;
import com.primeiroprojeto.domain.Endereco;
import com.primeiroprojeto.domain.Estado;
import com.primeiroprojeto.domain.ItemPedido;
import com.primeiroprojeto.domain.Pagamento;
import com.primeiroprojeto.domain.PagamentoComBoleto;
import com.primeiroprojeto.domain.PagamentoComCartao;
import com.primeiroprojeto.domain.Pedido;
import com.primeiroprojeto.domain.Produto;
import com.primeiroprojeto.domain.enums.EstadoPagamento;
import com.primeiroprojeto.domain.enums.TipoCliente;
import com.primeiroprojeto.repositories.CategoriaRepository;
import com.primeiroprojeto.repositories.CidadeRepository;
import com.primeiroprojeto.repositories.ClienteRepository;
import com.primeiroprojeto.repositories.EnderecoRepository;
import com.primeiroprojeto.repositories.EstadoRepository;
import com.primeiroprojeto.repositories.ItemPedidoRepository;
import com.primeiroprojeto.repositories.PagamentoRepository;
import com.primeiroprojeto.repositories.PedidoRepository;
import com.primeiroprojeto.repositories.ProdutoRepository;

@SpringBootApplication
public class PrimeiroProjetoSpringApplication implements CommandLineRunner {

	

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
