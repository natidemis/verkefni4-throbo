public class CustomerMock implements Customer {
    private String name;
    private String email;
    private String password;
    public CustomerMock(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return email;
    }

    @Override
    public void setEmail(String email) {
        // TODO Auto-generated method stub
        this.email = email;
    }
    

}
