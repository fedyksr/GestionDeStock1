package com.fedy.GestionDeStock.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdresseDto {
    private String address1;
    private String address2;
    private String ville;
    private String codePostale;
    private String pays;
}
