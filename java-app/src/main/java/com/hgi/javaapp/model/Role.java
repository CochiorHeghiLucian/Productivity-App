package com.hgi.javaapp.model;

import com.hgi.javaapp.db.dbtype.PostgreSqlEnumType;
import lombok.Data;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity
@Table(schema = "user_central", name = "role")
@TypeDef(name = "pgsql_enum", typeClass = PostgreSqlEnumType.class)
@Data
public class Role {
    @Id
    @SequenceGenerator(name = "role_seq", schema = "user_central", sequenceName = "role_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq")
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Type(type = "pgsql_enum")
    @Column(length = 60)
    private RoleName name;
}
