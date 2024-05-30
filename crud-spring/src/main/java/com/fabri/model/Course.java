package com.fabri.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {

    @Id //CHAVE PRIMARIA
    @GeneratedValue(strategy = GenerationType.AUTO)//IRA UTILIZAR O BANCO AUTOMATICO
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private String category;

}
