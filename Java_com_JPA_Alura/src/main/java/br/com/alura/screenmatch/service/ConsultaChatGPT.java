package br.com.alura.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("sk-kEaQCYy4hSdKf8f06mIiDQk_7ia3_C1Ot5f_IFsEy1T3BlbkFJur1rNobHJJHDEgnQ8x4EQcQp63UkkoGGAfGOrD5X0A");


        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();


        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
