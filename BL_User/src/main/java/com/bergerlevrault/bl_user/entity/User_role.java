package com.bergerlevrault.bl_user.entity;

import jakarta.persistence.*;

@Entity
public class User_role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String etablissement;
    private Long Nbr_role;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    @ManyToOne
    @JoinColumn(name = "code_role")
    private Role role;

}
