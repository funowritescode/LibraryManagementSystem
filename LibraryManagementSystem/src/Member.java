public class Member {
    private String memberId;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    public Member(String memberId, String name, String surname, String phoneNumber, String email) {
        this.memberId = memberId;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getMemberId() {
        return memberId;
    }
    public void displayMember() {
        System.out.println("--------------------");
        System.out.println("Member ID : " + memberId);
        System.out.println("Name : " + name);
        System.out.println("Surname : " + surname);
        System.out.println("Phone : " + phoneNumber);
        System.out.println("Email : " + email);
    }
}