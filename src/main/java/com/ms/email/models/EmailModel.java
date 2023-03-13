package com.ms.email.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "TB_EMAIL")
public class EmailModel {
    public class EmailModel implements Serializable {
        @Serial
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long emailId;
        private String ownerRef;
        private String emailFrom;
        private String emailTo;
        private String subject;
        @Column(columnDefinition = "TEXT") // para que o banco aceite mais de 255 caracteres
        private String text;

        private LocalDateTime sendDateEmail;
        private StatusEmail statusEmail;
    }


}
