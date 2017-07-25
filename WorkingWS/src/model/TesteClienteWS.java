package model;

import java.util.ArrayList;
import java.util.List;

public class TesteClienteWS {

	public static void main(String[] args) {
		ClienteWebService webService = new ClienteWebService();
		List<Negociacao> listaNegociacoes = new ArrayList<>();

		listaNegociacoes = webService.getNegociacoes();

		// System.out.println(listaNegociacoes.get(1));

	}
}
