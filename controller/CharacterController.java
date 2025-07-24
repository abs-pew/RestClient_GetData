package de.neuefische.restclient_getdata.controller;

import de.neuefische.restclient_getdata.model.Character;
import de.neuefische.restclient_getdata.service.CharacterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {

    private final CharacterService service;

    public CharacterController(CharacterService service) {
        this.service = service;
    }

    @GetMapping
    public List<Character> getAllCharacters(){
        return service.getAllCharacters();
    }

    @PostMapping
    public Character createCharacter(@RequestBody Character character){
return service.createCharacter(character);
    }

}
