import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Transformers {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //System.out.println("How many triangles would you like to create?");

        ArrayList<Matrix> transformation = new ArrayList<Matrix>();
        int maxp = 1000;
        //int numTri = scan.nextInt();

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        DrawingComponent draw = new DrawingComponent(maxp, maxp);
        draw.drawLineBrz(Color.BLUE, 50, 50, 50, 300);
        double [][] begin = {{50}, {50}, {1}};
        double [][] end = {{50}, {100}, {1}};
        Matrix startPt = new Matrix(begin);
        Matrix endPt = new Matrix(end);


        Scanner scan = new Scanner(System.in);
        System.out.println("How would you like to transform this line?");

        String answer = scan.nextLine();
        switch(answer){
            case "Translate":
                System.out.println("X and Y components of translation?");
                int tx = scan.nextInt();
                int ty = scan.nextInt();
                //Matrix trans = new Matrix(BasicTranslate(tx, ty));
                //transformation.add(trans);
                    break;
        }

        /*
        test.drawLineBrz(Color.BLACK, 50, 50, 50, 300);
        test.drawLineBrz(Color.BLACK, 50, 50, 300, 50);
        test.drawLineBrz(Color.BLACK, 100, 100,300, 300);
        test.drawLineBrz(Color.BLACK, 100, 50,300, 150);
        test.drawLineBrz(Color.BLACK, 100, 50,150, 300);
        */
        int counter = 0;
        /*

        final long startTime = System.currentTimeMillis();
        while (counter < numTri) {
            int x0 = (int) (Math.random() * maxp);
            int y0 = (int) (Math.random() * maxp);
            int x1 = (int) (Math.random() * maxp);
            int y1 = (int) (Math.random() * maxp);
            int x2 = (int) (Math.random() * maxp);
            int y2 = (int) (Math.random() * maxp);
            test.drawTriangle(Color.BLACK, x0, y0, x1, y1, x2, y2);

            counter++;
        }
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time (naive algorithm): " + (endTime - startTime) + " millisecond(s).");
        */
    /*
        counter = 0;
        final long startTimeBrz = System.currentTimeMillis();
        while (counter < numTri) {
            int x0 = (int) (Math.random() * maxp);
            int y0 = (int) (Math.random() * maxp);
            int x1 = (int) (Math.random() * maxp);
            int y1 = (int) (Math.random() * maxp);
            int x2 = (int) (Math.random() * maxp);
            int y2 = (int) (Math.random() * maxp);
            test.drawTriangleBrz(Color.BLACK, x0, y0, x1, y1, x2, y2);

            counter++;
        }
        final long endTimeBrz = System.currentTimeMillis();
        System.out.println("Total execution time (Bresenham's algorithm): " + (endTimeBrz - startTimeBrz) + " millisecond(s).");
        */


        panel.add(draw);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}