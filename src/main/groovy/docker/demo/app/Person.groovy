package docker.demo.app


class Person {

    private String firstName
    private String lastName
    private String phone

    Person() {

    }

    Person(String firstName, String lastName, String phone) {
        this.firstName = firstName
        this.lastName = lastName
        this.phone = phone
    }

    String getFirstName() {
        return firstName
    }

    void setFirstName(String firstName) {
        this.firstName = firstName
    }

    String getLastName() {
        return lastName
    }

    void setLastName(String lastName) {
        this.lastName = lastName
    }

    String getPhone() {
        return phone
    }

    void setPhone(String phone) {
        this.phone = phone
    }
}