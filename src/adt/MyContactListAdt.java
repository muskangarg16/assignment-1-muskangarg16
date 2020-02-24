package adt;

import definition.Person;

public interface MyContactListAdt {
    public void add(Person data);

    public void remove(int item);

    public void search(String first);

    public void view();


}
