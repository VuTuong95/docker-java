package docker.demo.app


class PersonForm {

    private String firstName
    private String lastName
    private String phone

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
