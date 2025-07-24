package de.neuefische.restclient_getdata.service;

import de.neuefische.restclient_getdata.model.CharactersList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import de.neuefische.restclient_getdata.model.Character;

import javax.xml.stream.events.Characters;
import java.util.List;

@Service
public class CharacterService {

    private final RestClient restClient;
    public CharacterService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder
                .baseUrl("https://rickandmortyapi.com/api")
                .build();
    }

    public List<Character> getAllCharacters() {
        List<Character> allCharacters =
                restClient.get()
                        .uri("/character")
                        .retrieve()
                        .body(CharactersList.class)
                        .results();  // name of object in server api storing character objects

        return allCharacters;
    }

    public Character createCharacter(Character character) {
        return null;
    }
}
