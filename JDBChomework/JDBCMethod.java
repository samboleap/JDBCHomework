package JDBChomework;

public class JDBCMethod {
    private Integer id;
    private String username;
    private String description;
    private String pwd;



    public JDBCMethod(Integer id, String username, String description, String email, String pwd) {

    }

    public JDBCMethod() {

    }


    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    @Override
    public String toString() {
        return "JDBCMethod{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                '}';
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public void setName(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }





    public String getUsername() {
        return username;
    }
}
