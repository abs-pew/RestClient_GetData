package de.neuefische.restclient_getdata.model;

import lombok.With;

@With
public record Character(
        String id,
        String name,
        String species
) {
}
