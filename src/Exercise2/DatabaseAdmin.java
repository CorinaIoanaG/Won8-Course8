package Exercise2;

import java.util.Date;

public class DatabaseAdmin extends Employee {
    protected String dbTechnology;

    public DatabaseAdmin(String firstName, String lastName, Date birthday, String adress, Date dateOfEmployment,
                         String position) {
        super(firstName, lastName, birthday, adress, dateOfEmployment, position);
    }

    public String getAdress() {
        this.adress = "db admin " + this.adress;
        return this.adress;
    }
}
