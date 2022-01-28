package com.fedy.GestionDeStock.dto;

import com.fedy.GestionDeStock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Builder
@Data
public class UtilisateurDto {
    private String nom;
    private String prenom;
    private Instant dateDeNaissance;
    private String password;
    private AdresseDto adresse;
    private String photo;
    private String mail;
    private String numTel;
    private EntrepriseDto entreprise;
    private List<RolesDto> roles;

    public UtilisateurDto fromEntity(Utilisateur utilisateur){
       if (utilisateur == null){
           return null;
       }
       return UtilisateurDto.builder()
               .nom(utilisateur.getNom())
               .prenom(utilisateur.getPrenom())
               .dateDeNaissance(utilisateur.getDateDeNaissance())
               .password(utilisateur.getPassword())
               .photo(utilisateur.getPhoto())
               .mail(utilisateur.getMail())
               .numTel(utilisateur.getNumTel())
               .build();
    }

    public Utilisateur toEntity(UtilisateurDto utilisateurDto){
        if (utilisateurDto==null){
            return null;
        }
        Utilisateur utilisateur=new Utilisateur();
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setDateDeNaissance(utilisateurDto.getDateDeNaissance());
        utilisateur.setPassword(utilisateurDto.getPassword());
        utilisateur.setPhoto(utilisateurDto.getPhoto());
        utilisateur.setMail(utilisateurDto.getMail());
        utilisateur.setNumTel(utilisateurDto.getNumTel());
        return utilisateur;
    }
}
