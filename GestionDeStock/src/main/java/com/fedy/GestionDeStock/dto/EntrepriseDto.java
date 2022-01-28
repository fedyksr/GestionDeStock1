package com.fedy.GestionDeStock.dto;

import com.fedy.GestionDeStock.model.Entreprise;
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

    public EntrepriseDto fromEntity(Entreprise entreprise){
        if (entreprise == null){
            return null;
        }
        return EntrepriseDto.builder()
                .nom(entreprise.getNom())
                .description(entreprise.getDescription())
                .codefiscale(entreprise.getCodefiscale())
                .photo(entreprise.getPhoto())
                .email(entreprise.getEmail())
                .numTel(entreprise.getNumTel())
                .siteWeb(entreprise.getSiteWeb())
                .build();
    }

    public Entreprise toEntity(EntrepriseDto entrepriseDto){
        if (entrepriseDto==null){
            return null;
        }
        Entreprise entreprise = new Entreprise();
        entreprise.setNom(entrepriseDto.getNom());
        entreprise.setDescription(entrepriseDto.getDescription());
        entreprise.setCodefiscale(entrepriseDto.getCodefiscale());
        entreprise.setPhoto(entrepriseDto.getPhoto());
        entreprise.setEmail(entrepriseDto.getEmail());
        entreprise.setNumTel(entrepriseDto.getNumTel());
        entreprise.setSiteWeb(entrepriseDto.getSiteWeb());
        return entreprise;
    }
}
