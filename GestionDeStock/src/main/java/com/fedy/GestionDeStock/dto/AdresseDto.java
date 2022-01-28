package com.fedy.GestionDeStock.dto;

import com.fedy.GestionDeStock.model.Adresse;
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

    public AdresseDto fromEntity(Adresse adresse){
    if (adresse == null){
        return null;
    }
    return AdresseDto.builder()
            .address1(adresse.getAddress1())
            .address2(adresse.getAddress2())
            .codePostale(adresse.getCodePostale())
            .ville(adresse.getVille())
            .pays(adresse.getPays())
            .build();
    }

    public Adresse toEntity(AdresseDto adresseDto){
        if (adresseDto == null){
            return null;
        }
        Adresse adresse = new Adresse();
        adresse.setAddress1(adresseDto.getAddress1());
        adresse.setAddress2(adresseDto.getAddress2());
        adresse.setCodePostale(adresseDto.getCodePostale());
        adresse.setVille(adresseDto.getVille());
        adresse.setPays(adresseDto.getPays());
        return adresse;
    }
}