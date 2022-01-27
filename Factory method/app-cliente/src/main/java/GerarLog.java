import com.braz.logger.Logger;
import com.braz.registro.txt.LoggerTxt;

public class GerarLog {
	
	public static void main(String[] args) {
		Logger logger = new LoggerTxt();
		
		logger.log("Testando mensagem");
	}
	
}
