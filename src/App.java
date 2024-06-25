public class App {
    public static void main(String[] args) throws Exception {
        Cliente joaoVictor = new Cliente();
		joaoVictor.setNome("João victor");
		
		Conta cc = new ContaCorrente(joaoVictor);
		Conta poupanca = new ContaPoupanca(joaoVictor);

		cc.depositar(5000);
		cc.transferir(1000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
