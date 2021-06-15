package co.johnsasn.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Customer {

    @Id
    private String id;


    @Column(name = "nombre")
    private String name;

    @Column(name = "apellidos")
    private String surname;

    @Column(name = "celular")
    private Long cellphone;

    @Column(name = "direccion")
    private String address;

    @Column(name = "correo_electronico")
    private String email;
}
