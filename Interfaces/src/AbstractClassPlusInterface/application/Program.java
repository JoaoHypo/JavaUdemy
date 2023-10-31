package AbstractClassPlusInterface.application;

import AbstractClassPlusInterface.entitites.Circle;
import AbstractClassPlusInterface.entitites.Rectangle;
import AbstractClassPlusInterface.entitites.Shape;
import AbstractClassPlusInterface.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {{}
        Scanner sc = new Scanner(System.in);
        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of Shapes: ");
        int shapes = sc.nextInt();
        sc.nextLine();

        for (int i = 0  ; i < shapes ; i++){
            System.out.printf("Shape #%d data: %n",i+1);
            System.out.print("Rectangle or Circle? (r/c) ");
            char shape = sc.nextLine().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());
            if (shape == 'r'){
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                sc.nextLine();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                sc.nextLine();
                shapeList.add(new Rectangle(color,width,height));
            } else if (shape == 'c') {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                sc.nextLine();
                shapeList.add(new Circle(color,radius));
            }
        }
        System.out.println("SHAPE AREAS: ");
        for(Shape shape : shapeList){
            System.out.printf("%.2f%n",shape.area());
        }
        sc.close();
    }
}