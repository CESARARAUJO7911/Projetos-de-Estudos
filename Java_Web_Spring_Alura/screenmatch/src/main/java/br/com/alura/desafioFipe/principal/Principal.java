package br.com.alura.desafioFipe.principal;

import br.com.alura.desafioFipe.DesafioFipeApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Principal implements CommandLineRunner {

    public static void main(String[] args) {SpringApplication.run(Principal.class, args);}

    @Override
    public void run(String... args) throws Exception{
        DesafioFipeApplication desafioFipeApplication = new DesafioFipeApplication();
        desafioFipeApplication.exibeMenu();
    }
}
