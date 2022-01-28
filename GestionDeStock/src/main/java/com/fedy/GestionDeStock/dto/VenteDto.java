package com.fedy.GestionDeStock.dto;

import com.fedy.GestionDeStock.model.Ventes;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Builder
@Data
public class VenteDto {
    private String code;
    private Instant dateVente;
    private String commentaire;

    public VenteDto fromEntity(Ventes ventes) {
        if (ventes == null) {
            return null;
        }
        return VenteDto.builder()
                .code(ventes.getCode())
                .dateVente(ventes.getDateVente())
                .commentaire(ventes.getCommentaire())
                .build();
    }
    public Ventes toEntity(VenteDto venteDto){
        if (venteDto==null){
            return null;
        }
        Ventes ventes = new Ventes();
        ventes.setCode(venteDto.getCode());
        ventes.setDateVente(venteDto.getDateVente());
        ventes.setCommentaire(venteDto.getCommentaire());
        return ventes;
    }

}
