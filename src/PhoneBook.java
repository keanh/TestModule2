public class PhoneBook {
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private String sex;
    private String birthday;

    public PhoneBook(String name, String phoneNumber, String birthday, String address, String email, String sex) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
        this.sex = sex;
    }

    public PhoneBook() {
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return this.name + "," + this.phoneNumber + "," + this.birthday + "," + this.address + "," + this.email + "," + this.sex;
    }
}
