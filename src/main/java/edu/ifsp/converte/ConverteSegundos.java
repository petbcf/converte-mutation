package edu.ifsp.converte;

public class ConverteSegundos {
		
	public int converteSegundos(int horas, int minutos, int segundos) {
		int resultado = 0;
		
		if ((horas < 0) || (minutos < 0) || (segundos < 0)) {
			throw new IllegalArgumentException("Não existe numero negativo para tempo.");
		}
				
		if((horas >= 0) && (horas<=23)) {
			if ((minutos >= 0) && (minutos <= 59)) {
				if((segundos >= 0) && (segundos <= 59)) {
					resultado = (segundos + (minutos * 60) + (horas * (60 * 60)));
				}
			}
		}
		return resultado;
	}

}
