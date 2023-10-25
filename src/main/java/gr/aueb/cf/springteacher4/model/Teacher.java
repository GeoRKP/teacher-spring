package gr.aueb.cf.springteacher4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TEACHERS")
public class Teacher {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRSTNAME", length = 50, nullable = false)
    private String firstname;
    @Column(name = "LASTNAME", length = 50, nullable = false)
    private String lastname;


}
