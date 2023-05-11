//package LoginSystem;
//
//import Main.Board;
//import Main.BoardGui;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.text.DecimalFormat;
//
//public class PersonalTimer {
//    private Timer timer;
//    private int second,minute;
//    private DecimalFormat dFormat=new DecimalFormat("00");
//    private String ddSecond;
//    private String  ddMinute;
//
//    public String getDdSecond() {
//        return ddSecond;
//    }
//
//    public String getDdMinute() {
//        return ddMinute;
//    }
//
//    public PersonalTimer (int time, BoardGui boardGui){
//        minute=time;
//        second=0;
//        timer=new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                second--;
//                ddSecond=dFormat.format(second);
//                ddMinute=dFormat.format(minute);
////                boardGui.time1.setText(ddMinute+":"+ddSecond);
////                boardGui.time2.setText(ddMinute+":"+ddSecond);
//
//                if(second==-1){
//                    second=59;
//                    minute--;
//                    ddSecond=dFormat.format(second);
//                    ddMinute=dFormat.format(minute);
////                    boardGui.time1.setText(ddMinute+":"+ddSecond);
////                    boardGui.time2.setText(ddMinute+":"+ddSecond);
//                }
//                if(minute==0 && second==0){
//                    timer.stop();
//                }
//
//            }
//        });
//
//
//
//
//    }
//    public void stop(){
//        timer.stop();
//    }
//    public void start(){
//        timer.start();
//    }
//}
