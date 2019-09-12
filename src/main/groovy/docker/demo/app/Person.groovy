package docker.demo.app


class Person {

    private String firstName
    private String lastName

    Person() {

    }

    Person(String firstName, String lastName) {
        this.firstName = firstName
        this.lastName = lastName
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

}