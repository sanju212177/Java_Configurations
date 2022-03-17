package com.capg;
import java. util. List;
import java. util. Map;
import java. util. Set;

public class Student {
    private List <String> emails;
    private Set<String> contacts;
    private Map<String, Integer> marks;

    public Student() {
    }

    public Student(List<String> emails, Set<String> contacts, Map<String, Integer> marks) {
        this.emails = emails;
        this.contacts = contacts;
        this.marks = marks;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public Set<String> getContacts() {
        return contacts;
    }

    public void setContacts(Set<String> contacts) {
        this.contacts = contacts;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student:\n" +
                "emails=" + emails +
                "\ncontacts=" + contacts +
                "\nmarks=" + marks +
                '\n';
    }
}
