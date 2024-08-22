package br.com.alura.estudoapi.principal;

import br.com.alura.estudoapi.modelos.Titulos;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        Titulos titulo = new Titulos();
        titulo.setNome("Velozes e Furiosos");
        titulo.setDuracao(90);


        try {
            FileWriter escrita = new FileWriter("arquivo.txt");
            escrita.write(gson.toJson(titulo));
            escrita.close();
        } catch(IOException e){
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
        System.out.println("Gravado com Sucesso");
    }



}
