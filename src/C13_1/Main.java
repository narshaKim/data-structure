package C13_1;

import C13_1.DataStructure.HashFunctionType;
import C13_1.DataStructure.Person;
import C13_1.DataStructure.Table;
import C13_1.DataStructure.TableImpl;

public class Main {

    public static void main(String[] args) {
        Table table = new TableImpl();
        table.init(HashFunctionType.DEVIDE100);

        System.out.println("■■■사람 추가■■■");

        Person person = new Person();
        person.makePersonData(20120003, "Lee", "Seoul");
        table.insert(person.getSsn(), person);

        person = new Person();
        person.makePersonData(20120012, "Kim", "Jeju");
        table.insert(person.getSsn(), person);

        person = new Person();
        person.makePersonData(20170049, "Han", "Kangwon");
        table.insert(person.getSsn(), person);

        System.out.println("■■■사람 찾기■■■");
        person = table.search(20120003);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

        person = table.search(20130012);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

        person = table.search(20170049);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

        System.out.println("■■■사람 삭제■■■");
        table.delete(20120003);
        table.delete(20130012);
        table.delete(20170049);

        System.out.println("■■■사람 찾기■■■");
        person = table.search(20120003);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

        person = table.search(20130012);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

        person = table.search(20170049);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

    }

}
