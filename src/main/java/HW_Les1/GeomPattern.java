package HW_Les1;

public abstract class GeomPattern {
    private String color;

    abstract void square();
    abstract void perimeter ();

}

class Triangle extends GeomPattern {

    @Override
    void square() {
        int a = 3;
        int h = 2;
        int square = (h * a) / 2;
    }

    @Override
    void perimeter() {
        int a, b, c;
        a = 2; b = 3; c = 4;
        int perimeter = a + b + c;
    }

    class Circle extends GeomPattern {

        @Override
        void square() {
            int r = 1;
            double p = 3.14;
            double square = p * r * r;
        }

        @Override
        void perimeter() {
            int r = 1;
            double p = 3.14;
            double perimeter = 2 * 3.14 * r;

        }
    }

    class Tetragon extends GeomPattern {
        @Override
        void square() {
            int a = 2;
            int square = a * a;
        }

        @Override
        void perimeter() {
            int a = 2;
            int perimeter = a * 4;
        }
    }
}



