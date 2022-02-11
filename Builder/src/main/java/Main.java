import com.braz.notafiscal.NotaFiscal;
import com.braz.notafiscal.NotaFiscalBuilder;

public class Main {

	public static void main(String[] args) {
		
		NotaFiscal notaFiscal = new NotaFiscalBuilder().notaFiscalPessoaFisicaBuild()
				.data("02/02/2022")
				.itemProduto("Monitor 24 polegadas", 1, "1200")
				.builder();
		
		notaFiscal.gerarNota();

	}

}
