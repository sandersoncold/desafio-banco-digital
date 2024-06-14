pupublic class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Sandro");
		
		Conta cc = new ContaCorrente(sandro);
		Conta poupanca = new ContaPoupanca(sandro);

		cc.depositar(500);
		cc.transferir(500, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}