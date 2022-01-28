package com.fedy.GestionDeStock.dto;
import com.fedy.GestionDeStock.model.LigneVente;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Builder
@Data
public class LigneVenteDto {
    private VenteDto vente;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;

    public LigneVenteDto fromEntity(LigneVente ligneVente){
        if (ligneVente==null){
            return null;
        }
        return LigneVenteDto.builder()
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .build();
    }

    public LigneVente toEntity(LigneVenteDto ligneVenteDto){
        if (ligneVenteDto==null){
            return null;
        }
        LigneVente ligneVente=new LigneVente();
        ligneVente.setQuantite(ligneVenteDto.getQuantite());
        ligneVente.setPrixUnitaire(ligneVenteDto.getPrixUnitaire());
        return ligneVente;
    }
}
