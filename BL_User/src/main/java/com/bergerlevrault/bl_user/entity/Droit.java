package com.bergerlevrault.bl_user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Droit {
    @Id
    private String id_Droit;
    @Column
    private String name_Droit;
    @Column
    private String Application;
}
