package com.aluracursos.screenmatch.principal;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;


public class ConsultaGemini {
    public static String obtenerTraduccion(String texto) {
        String modelo = "gemini-2.0-flash-lite";
        String prompt = "Traduce el siguiente texto al español: " + texto;

        Client cliente = new Client.Builder().apiKey("AIzaSyDE5CmMfM0Fp6AftOX76H-M2CxvFUycthY").build();

        try {
            GenerateContentResponse respuesta = cliente.models.generateContent(
                    modelo,
                    prompt,
                    null // Parámetro para configuraciones adicionales
            );

            if (!respuesta.text().isEmpty()) {
                return respuesta.text();
            }
        } catch (Exception e) {
            System.err.println("Error al llamar a la API de Gemini para traducción: " + e.getMessage());
        }

        return null;
    }
}
