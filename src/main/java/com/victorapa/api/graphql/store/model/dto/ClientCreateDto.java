package com.victorapa.api.graphql.store.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientCreateDto {
    private String name;
    private String email;
}
