public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString(){
        return "The author's name is: " + firstName + lastName;
    }

    @Override
    public boolean equals(Object otherAuthor){
        if(this.getClass() != otherAuthor.getClass()){
            return false;
        }
        Author author2 = (Author) otherAuthor;
        String name = firstName + lastName;
        return name.equals(author2.getFirstName() + author2.getLastName());

    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(firstName + lastName);
    }

}