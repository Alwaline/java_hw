package ru.itis.spring.users.data;

public class ContactData {

    private final Long userId;

    private final String email;
    private final String phone;
    private final String pushId;

    public ContactData(Long userId, String email, String phone, String pushId) {
        this.userId = userId;
        this.email = email;
        this.phone = phone;
        this.pushId = pushId;
    }

    public Long getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPushId() {
        return pushId;
    }
}
