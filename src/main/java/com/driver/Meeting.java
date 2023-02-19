package com.driver;

import java.time.LocalTime;

public class Meeting {
    private LocalTime startTime;
    private LocalTime endTime;

    public Meeting(LocalTime startTime, LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

}




//package com.driver;
//
//import java.time.LocalTime;
//
//public class Meeting {
//    private LocalTime startTime;
//    private LocalTime endTime;
//
//
//    public Meeting(LocalTime startTime, LocalTime endTime){
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }
//
//    public LocalTime getStartTime() {
//        // return the start time of the meeting
//        return startTime;
//    }
//
//    public LocalTime getEndTime() {
//        // return the end time of the meeting
//        return endTime;
//    }
//
//    public int getDuration() {
//        // return the duration of the meeting in minutes
//        return endTime.getHour() * 60 + endTime.getMinute() - startTime.getHour() * 60 - startTime.getMinute();
//    }
//
//    public boolean overlaps(Meeting other) {
//        // return true if this meeting overlaps with the other meeting, false otherwise
//        if (this.getStartTime().isBefore(other.getEndTime()) && this.getEndTime().isAfter(other.getStartTime())) {
//            return true;
//        }
//        return false;
//    }
//}






//
//package com.driver;
//
//import java.time.LocalTime;
//
//public class Meeting {
//    private LocalTime startTime;
//    private LocalTime endTime;
//
//    public Meeting(LocalTime startTime, LocalTime endTime){
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }
//
//}



//package com.driver;
//
//        import java.time.LocalTime;
//
//public class Meeting {
//    private LocalTime startTime;
//    private LocalTime endTime;
//
//    public Meeting(LocalTime startTime, LocalTime endTime){
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }
//
//}
