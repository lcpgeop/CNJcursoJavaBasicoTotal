package curso.cnj.javabasico;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class modulo8 {
	
	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();
		LocalTime hora = LocalTime.now();
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter dataHoraFormatada = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		System.out.println(data);
		System.out.println(hora);
		System.out.println(dataHora);
		System.out.println("+----------------------------------------------------------------------------+");
		
		System.out.println(data.format(dataFormatada));
		System.out.println(hora.format(horaFormatada));
		System.out.println(dataHora.format(dataHoraFormatada));


	}

}
