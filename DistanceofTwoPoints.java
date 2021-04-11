package cse215_lab_tasks_07;

import java.util.Scanner;

class Point {
    private int x;
    private int y;
   
    public Point() {
        
    }
      
   public Point(int x, int y) {
       this.x = x;
       this.y = y;
   }
   public int getX()
   {
       return  this.x ;
   } 
   public int getY()
   {
       return  this.y ;
   }

   public void setX(int x) {
       this.x = x;
   }

   public void setY(int y) {
       this.y = y;
   }

   public double distance(Point p) {
       return Math.sqrt((Math.pow(x-p.getX(),2))+(Math.pow(y-p.getY(),2)));
   }    
}


class Line {
   private Point start;
   private Point end;
   
   public Line() {      
 
   }
   
   public Line(Point start, Point end) {      
       this.start = start;
       this.end = end;
   }
   
   public Point getStart() {
       return start;
   }

   public void setStart(Point start) {
       this.start = start;
   }

   public Point getEnd() {
       return end;
   }

   public void setEnd(Point end) {
       this.end = end;
   }

   public Line(int x1, int y1, int x2, int y2) {
       this.start = new Point(x1, y1);
       this.end = new Point(x2, y2);
       }
   public double length() {
       return start.distance(this.end);
   }   
}

public class DistanceofTwoPoints {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		int x01 = input.nextInt();
		int y01 = input.nextInt();
		int x02 = input.nextInt();
		int y02 = input.nextInt();
        Point p1 = new Point(x01,y01);
        Point p2 = new Point(x02, y02);
        Line line = new Line(p1, p2);
        System.out.printf("%.2f",line.length());

        input.close();
    }
}
