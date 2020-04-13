package Data;

public class Developer {


    private String firstName,lastName,id;
    final boolean projectLeader = false;

    public Developer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = firstName.toUpperCase().substring(0,2) + lastName.toUpperCase().substring(0,2);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public boolean isProjectLeader(){
        return projectLeader;
    }
}
