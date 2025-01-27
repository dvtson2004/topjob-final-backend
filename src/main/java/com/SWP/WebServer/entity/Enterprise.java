package com.SWP.WebServer.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    private String enterprise_name;
    private String founder;
    //
    private String avatar_url;
    @Column(length = 45)
    private String phone;
    private String city;
    private String state;
    private String web_url;
    private String employees;
    //
    private String headquarter;
    private String founded;
    @Column(columnDefinition = "MEDIUMTEXT")
    private String companyStory;
    private Date created_at;
    private Date updated_at;
    //
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "userId",
            referencedColumnName = "uid"
    )
    private User user;


    public Enterprise(User user) {
        this.user = user;
        this.enterprise_name = "";
        this.founder = "";
        this.founded = "";
        this.companyStory = "";
        this.avatar_url = "https://res.cloudinary.com/dz9kynjwb/image/upload/v1717770585/OIP_bsmlku.jpg";
        this.created_at = new Date();
        this.updated_at = new Date();
        this.employees = "";
        this.web_url = "";
        this.phone = "";
        this.state = "";
    }

}
