package org.example._2023_10_26.taski;

import com.github.javafaker.Faker;
import java.util.Random;

public class Main {
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        PupilPlayer p1 = new PupilPlayer(FAKER.name().name(), RANDOM.nextInt(21));
        PupilPlayer p2 = new PupilPlayer(FAKER.name().name(), RANDOM.nextInt(21));

        StudentPlayer s1 = new StudentPlayer(FAKER.name().name(), RANDOM.nextInt(34));
        StudentPlayer s2 = new StudentPlayer(FAKER.name().name(), RANDOM.nextInt(34));

        AdultPlayer a1 = new AdultPlayer(FAKER.name().name(), RANDOM.nextInt(75));
        AdultPlayer a2 = new AdultPlayer(FAKER.name().name(), RANDOM.nextInt(75));

        Team<PupilPlayer> pt1 = new Team(FAKER.team().name());
        Team<PupilPlayer> pt2 = new Team(FAKER.team().name());

        Team<StudentPlayer> st1 = new Team(FAKER.team().name());
        Team<StudentPlayer> st2 = new Team(FAKER.team().name());

        Team<AdultPlayer> at1 = new Team(FAKER.team().name());
        Team<AdultPlayer> at2 = new Team(FAKER.team().name());

        pt1.addNewParticipant(p1);
        pt2.addNewParticipant(p2);

        st1.addNewParticipant(s1);
        st2.addNewParticipant(s2);

        at1.addNewParticipant(a1);
        at2.addNewParticipant(a2);

        pt1.play(pt2);
    }
}