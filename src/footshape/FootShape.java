/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footshape;

import java.util.Scanner;

/**
 *
 * @author Siraphob.B
 */
public class FootShape {
    
    private Foot foot;
    
    public void drawAsEllipse() {
        foot = new Ellipse();
        System.out.println(foot.draw());
    }
    
    public void drawRectangle() {
        foot = new Rectangle();
        System.out.println(foot.draw());
    }
    
    public static void main(String[] args) {
        FootShape app = new FootShape();
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle: ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                app.drawAsEllipse();
                break;
            case 2:
                app.drawRectangle();
                break;
        } 
    }
    
}
