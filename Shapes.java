public class Shapes {
    public static void main(String[] args) {
     int sides = 10;
     int count = 1;
     int turn = 360/sides;
     int x=0;
     int y=0;
     int z=0;
        // Task 1: Draw a regular shape
      Turtle t = new Turtle();
      while (count <= sides) {
             t.forward(100/(sides / 2));
             t.right(360/sides);
             count++;
      }
        // Task 2: Draw a regular shape many times
         for (int i = 1; i <= 4; i++) {
            while (count <= sides) {
             t.setPosition(x+100,y+100,z+100);
             t.forward(100/(sides / 2));
             t.right(360/sides);
             count++;
            }
             
         } 
         

        // Task 3: How many times does Turtle turn!


        // Extension 1:


        // Extension 2:

    }
    
}
