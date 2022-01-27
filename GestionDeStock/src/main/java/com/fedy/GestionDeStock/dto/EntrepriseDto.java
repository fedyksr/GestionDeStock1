package com.fedy.GestionDeStock.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class EntrepriseDto {
    private String nom;
    private String description;
    private AdresseDto adresse;
    private String codefiscale;
    private String photo;
    private String email;
    private String numTel;
    private String siteWeb;
    private List<UtilisateurDto> utilisateurs;
}
