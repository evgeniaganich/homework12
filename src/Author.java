public class Author {
    String firstName;
    String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;



    }
    public String getfirstName(String firstName) {
        return firstName;
    }
    public String getLastName(String lastName) {
        return lastName;
            }


    public String getAuthorName() {
        return firstName + " " + lastName;
    }

    }



