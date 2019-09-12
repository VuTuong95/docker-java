package docker.demo.app


class PersonForm {

    private String firstName
    private String lastName
    private Long phone

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
