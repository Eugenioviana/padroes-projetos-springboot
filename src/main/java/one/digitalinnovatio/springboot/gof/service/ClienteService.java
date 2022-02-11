package one.digitalinnovation.springboot.gof.springBoot.gof.service;

import one.digitalinnovation.springboot.gof.springBoot.gof.model.Cliente;


public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
