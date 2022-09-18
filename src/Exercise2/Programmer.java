package Exercise2;

import java.util.Date;

public class Programmer extends Employee {
    protected String language;

    public Programmer(String firstName, String lastName, Date birthday, String adress, Date dateOfEmployment,
                      String position) {
        super(firstName, lastName, birthday, adress, dateOfEmployment, position);
    }

    public String getPosition() {
        this.position = "programmer";
        return this.position;
    }

}
