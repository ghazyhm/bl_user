package com.bergerlevrault.bl_user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Role {
    @Id
    private String code_role;
    @Column
    private String libelle_code ;
    @Column
    private Boolean status_role ;
    @OneToMany(mappedBy = "id_Droit")
    private List<Droit> listDroit;
}
