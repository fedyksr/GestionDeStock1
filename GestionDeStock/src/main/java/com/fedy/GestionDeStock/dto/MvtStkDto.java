package com.fedy.GestionDeStock.dto;

import com.fedy.GestionDeStock.model.MvtStk;
import com.fedy.GestionDeStock.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Builder
@Data
public class MvtStkDto {
    private Instant dateMvt;
    private BigDecimal quantite;
    private ArticleDto article;
    private TypeMvtStk typemvt;

    public MvtStkDto fromEntity(MvtStk mvtStk){
        if (mvtStk==null){
            return null;
        }
        return MvtStkDto.builder()
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())
                .build();
    }

    public MvtStk toEntity(MvtStkDto mvtStkDto){
        if (mvtStkDto==null){
            return null;
        }
        MvtStk mvtStk = new MvtStk();
        mvtStk.setDateMvt(mvtStkDto.getDateMvt());
        mvtStk.setQuantite(mvtStkDto.getQuantite());
        return mvtStk;
    }
}
