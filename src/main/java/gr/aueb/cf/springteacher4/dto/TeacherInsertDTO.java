package gr.aueb.cf.springteacher4.dto;

public class TeacherInsertDTO {
    private String firstname;
    private String lastname;

    public TeacherInsertDTO() {}

    public TeacherInsertDTO(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
