package br.com.moeda.sourcer;

import br.com.model.entity.Account;

public interface IReader {
	Account findByCoin(String coin) throws Exception;
}
