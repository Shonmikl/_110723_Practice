package org.example._2023_10_26.taski;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private String name;
    private List<Participant> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(Participant participant) {
        participants.add(participant);
        System.out.println("Participant: " + participant.getName() + " was added to the Team");
    }

    // t1.play(t2);
    public void play(Team teamWith) {
        String winner = null;
        int i  = new Random().nextInt(2);
        if(i == 0) {
            winner = this.name;
        } else  {
            winner = teamWith.name;
        }
        System.out.println("WINNER TEAM: " + winner);
    }
}