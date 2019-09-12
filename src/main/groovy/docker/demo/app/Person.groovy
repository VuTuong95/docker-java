package docker.demo.app


class Person {

    private String firstName
    private String lastName
    private Long phone

    Person() {

    }

    Person(String firstName, String lastName, Long phone) {
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

    Long getPhone() {
        return phone
    }

    void setPhone(Long phone) {
        this.phone = phone
    }
}