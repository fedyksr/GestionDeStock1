package com.fedy.GestionDeStock.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @CreatedDate
    @Column(name="creationDate" nullabel= false)
    private Instant creationDate;
    @LastModifiedDate
    @Column(name ="lastModifierDate"nullable = false)
    private Instant lastModifierDate;

}
