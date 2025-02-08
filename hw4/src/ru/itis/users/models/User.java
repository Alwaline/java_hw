package ru.itis.users.models;

/**
 * Lesson_4
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class User {

    private final String uuid;

    private final String email;

    private final String password;

    private final String phone;

    
    public User(String uuid, String email, String password, String phone) {
        this.uuid = uuid;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }
    
    public String getUuid() {
        return uuid;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getPhone() {
        return phone;
    }
}
