package com.fedy.GestionDeStock.dto;
import com.fedy.GestionDeStock.model.Roles;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RolesDto {
    private String rolename;
    private UtilisateurDto utilisateur;

    public RolesDto fromEntity(Roles roles){
        if (roles==null){
            return null;
        }
        return RolesDto.builder().rolename(roles.getRolename()).build();
    }

    public  Roles toEntity(RolesDto rolesDto){
        if (rolesDto==null){
            return null;
        }
        Roles roles=new Roles();
        roles.setRolename(rolesDto.getRolename());
        return roles;
    }
}
