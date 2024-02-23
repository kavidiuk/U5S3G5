package it.epicode.be.U5S3G5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class U5S3G5Application {

	public static void main(String[] args) {
		SpringApplication.run(U5S3G5Application.class, args);

		OrganizzatoreDiEventi primoEvento = new OrganizzatoreDiEventi();
		primoEvento.titolo = "nome_dell'_Evento";
		primoEvento.descrizione = "Carnevale";
		primoEvento.data = 23/02/2024;
		primoEvento.luogo = "centro_città";
		primoEvento.numeroDiPosti = 100;
		System.out.println(primoEvento);
	}

}
