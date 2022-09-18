package Exercise2;

import java.util.Date;

import java.time.LocalDateTime;


public class Employee implements Person {
    private String firstName;

    private String lastName;
    private Date birthday;
    protected String adress;
    private Date dateOfEmployment;
    protected String position;

    public Employee(String firstName, String lastName, Date birthday, String adress, Date dateOfEmployment, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.adress = adress;
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public Date getBirthday() {
        return this.birthday;
    }

    @Override
    public String getAdress() {
        return this.adress;
    }

    public Date getDateOfEmployment() {
        return this.dateOfEmployment;
    }

    public String getPosition() {
        return this.position;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public int getAge() {
        LocalDateTime localDateTime = LocalDateTime.now();
        if (this.birthday.getMonth() == localDateTime.getMonthValue() && localDateTime.getDayOfMonth() < this.birthday.getDate()) {
            return localDateTime.getYear() - this.birthday.getYear() - 1;
        }
        return localDateTime.getYear() - this.birthday.getYear();
    }
}
