package com.bergerlevrault.bl_user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class User {
    @Id
    private String id_user;
    @Column
    private String name_user;
    @Column
    private String last_name;
    @Column
    private String Email;
    @Column
    private Boolean Activity_user;
    @Column
    private String Civility;


}
