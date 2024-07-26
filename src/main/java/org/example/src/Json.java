package org.example.src;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Json {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./src/main/java/org/example/src/users.json");
        JsonArray array = (JsonArray) JsonParser.parseReader(reader);

        List<Usuario> usuarios = new ArrayList<>();

        for (JsonElement jsonElement : array) {
            Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
            usuarios.add(usuario);
        }

        System.out.println(usuarios);
    }
}
