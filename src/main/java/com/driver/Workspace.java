

//package com.driver;
//
//import org.apache.commons.lang3.tuple.Pair;
//
//import java.time.LocalTime;
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Workspace extends Gmail{
//
//    private ArrayList<Meeting> calendar; // Stores all the meetings
//
//    public Workspace(String emailId) {
//        // The inboxCapacity is equal to the maximum value an integer can store.
//
//    }
//
//    public void addMeeting(Meeting meeting){
//        //add the meeting to calendar
//
//    }
//
//    public int findMaxMeetings(){
//        // find the maximum number of meetings you can attend
//        // 1. At a particular time, you can be present in at most one meeting
//        // 2. If you want to attend a meeting, you must join it at its start time and leave at end time.
//        // Example: If a meeting ends at 10:00 am, you cannot attend another meeting starting at 10:00 am
//
//    }
//}
//



package com.driver;
import org.apache.commons.lang3.tuple.Pair;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

public class Workspace extends Gmail{


    private ArrayList<Meeting> calendar; // Stores all the meetings

    public Workspace(String emailId) {
        super(emailId, Integer.MAX_VALUE); // The inboxCapacity is equal to the maximum value an integer can store.
        calendar = new ArrayList<>();
    }

    public void addMeeting(Meeting meeting){
        calendar.add(meeting); // add the meeting to calendar
    }

    public int findMaxMeetings(){
        int maxMeetings = 0;
        ArrayList<Pair<LocalTime, Boolean>> timeSlots = new ArrayList<>();

        for(Meeting meeting : calendar) {
            timeSlots.add(Pair.of(meeting.getStartTime(), true));
            timeSlots.add(Pair.of(meeting.getEndTime(), false));
        }

        Collections.sort(timeSlots, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        int currentMeetings = 0;
        for(Pair<LocalTime, Boolean> timeSlot : timeSlots) {
            if(timeSlot.getValue()) { // A new meeting is starting
                currentMeetings++;
                maxMeetings = Math.max(maxMeetings, currentMeetings);
            } else { // A meeting is ending
                currentMeetings--;
            }
        }

        return maxMeetings;
    }
}














//
//package com.driver;
//
//import org.apache.commons.lang3.tuple.Pair;
//
//import java.time.LocalTime;
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Workspace extends Gmail{
//
//    private ArrayList<Meeting> calendar; // Stores all the meetings
//
//    public Workspace(String emailId) {
//        // The inboxCapacity is equal to the maximum value an integer can store.
//
//    }
//
//    public void addMeeting(Meeting meeting){
//        //add the meeting to calendar
//
//    }
//
//    public int findMaxMeetings(){
//        // find the maximum number of meetings you can attend
//        // 1. At a particular time, you can be present in at most one meeting
//        // 2. If you want to attend a meeting, you must join it at its start time and leave at end time.
//        // Example: If a meeting ends at 10:00 am, you cannot attend another meeting starting at 10:00 am
//
//    }
//}





