package C13_2.DataStructure;

public class Person {
    int ssn;
    String name;
    String addr;

    public int getSsn() {
        return this.ssn;
    }

    public void showPersonInfo() {
        System.out.println("주민번호 : " + this.ssn);
        System.out.println("이름 : " + this.name);
        System.out.println("주소 : " + this.addr);
    }

    public void makePersonData(int ssn, String name, String addr) {
        this.ssn=ssn;
        this.name=name;
        this.addr=addr;
    }

}
