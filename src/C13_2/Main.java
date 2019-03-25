package C13_2;

import C13_1.DataStructure.HashFunctionType;
import C13_2.DataStructure.Person;
import C13_2.DataStructure.Table;
import C13_2.DataStructure.TableImpl;

public class Main {

    public static void main(String[] args) {
        Table table = new TableImpl();
        table.init(HashFunctionType.DEVIDE100);

        System.out.println("■■■사람 추가■■■");

        Person person = new Person();
        person.makePersonData(900254, "Lee", "Seoul");
        table.insert(person.getSsn(), person);

        person = new Person();
        person.makePersonData(800254, "Park", "Seoungnam");
        table.insert(person.getSsn(), person);

        person = new Person();
        person.makePersonData(900139, "Kim", "Jeju");
        table.insert(person.getSsn(), person);

        person = new Person();
        person.makePersonData(900827, "Han", "Kangwon");
        table.insert(person.getSsn(), person);

        System.out.println("■■■사람 찾기■■■");
        person = table.search(900254);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

        person = table.search(800254);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

        person = table.search(900139);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

        person = table.search(900827);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

        System.out.println("■■■사람 삭제■■■");
        table.delete(900254);
        table.delete(900139);
        table.delete(900827);

        System.out.println("■■■사람 찾기■■■");
        person = table.search(900254);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

        person = table.search(800254);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

        person = table.search(900139);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

        person = table.search(900827);
        if(person!=null)
            person.showPersonInfo();
        else
            System.out.println("그런 사람 없어요");

    }

}
