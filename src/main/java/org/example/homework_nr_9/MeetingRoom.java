package org.example.homework_nr_9;

import java.util.List;

public class MeetingRoom {
    List<AttenTraining> attendees;

    public MeetingRoom(List<AttenTraining> attendees) {
        this.attendees = attendees;
    }
    public void conductTraining() {
        System.out.println("Training session started in the meeting room...");
        for (AttenTraining attendee : attendees) {
            attendee.conductTraining();
        }
        System.out.println("Training session ended.");
    }

}

