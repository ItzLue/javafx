package Data;

public record Devs(String firstName, String lastName) {

    public String id() {
        String id = firstName.toUpperCase().substring(0,2) + lastName.toUpperCase().substring(0,2);
        return id;
    }
}