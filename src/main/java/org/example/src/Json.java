package org.example.src;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Json {
    public static void main(String[] args) throws IOException {
        Usuario usuario1 = new Usuario();
        usuario1.setNome("João");
        usuario1.setCpf("432543252");
        usuario1.setLogin("joao");
        usuario1.setSenha("123456");

        Usuario usuario2 = new Usuario();
        usuario2.setNome("André");
        usuario2.setCpf("4513257879");
        usuario2.setLogin("andre");
        usuario2.setSenha("654321");

        List<Usuario> usuarios = new ArrayList<>(List.of(usuario1, usuario2));
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //String jsonUser = new Gson().toJson(usuarios);
        String jsonUser = gson.toJson(usuarios);

        FileWriter writer = new FileWriter("./src/main/java/org/example/src/users.json", StandardCharsets.UTF_8);
        writer.write(jsonUser);
        writer.flush();
        writer.close();
    }
}
