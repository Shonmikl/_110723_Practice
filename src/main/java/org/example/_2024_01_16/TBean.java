package org.example._2024_01_16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bean")
public class TBean {
    private Person person;
    private Cat cat;

    public TBean() {
    }

    public Person getPerson() {
        return person;
    }

    @Autowired
    public void setPerson(@Qualifier("person") Person person) {
        this.person = person;
    }


    public Cat getCat() {
        return cat;
    }

    @Autowired
    public void setCat(@Qualifier("cat") Cat cat) {
        this.cat = cat;
    }
}
