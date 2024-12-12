import java.util.Scanner;

// Base class: Quadrilateral
class Quadrilateral {
    public void showDescription() {
        System.out.println("- is a quadrilateral");
    }
}

// Parallelogram class (New parent for Rectangle)
class Parallelogram extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 2 pairs of parallel sides");
    }
}

// Rectangle class (inherits from Parallelogram)
class Rectangle extends Parallelogram {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 right angles");
    }
}

// Square class (inherits from Rectangle)
class Square extends Rectangle {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 equal sides");
    }
}

// Rhombus class (inherits from Parallelogram)
class Rhombus extends Parallelogram {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 congruent sides");
    }
}

// Trapezoid class (inherits from Quadrilateral)
class Trapezoid extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 1 pair of parallel sides");
    }
}

// Main class: RunQuad
public class RunQuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to display its description:");
        System.out.println("R - Rectangle");
        System.out.println("S - Square");
        System.out.println("P - Parallelogram");
        System.out.println("H - Rhombus");
        System.out.println("T - Trapezoid");

        System.out.print("Enter your choice: ");
        char choice = scanner.next().toUpperCase().charAt(0);

        Quadrilateral shape;
        switch (choice) {
            case 'R':
                shape = new Rectangle();
                break;
            case 'S':
                shape = new Square();
                break;
            case 'P':
                shape = new Parallelogram();
                break;
            case 'H':
                shape = new Rhombus();
                break;
            case 'T':
                shape = new Trapezoid();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        shape.showDescription();
    }
}
