package dir_004_java_exercises.chapter_001_java_basic.section_001_basic_part_1.exercise_011_gr_a;
public class Exercise11 {
    // Define a constant for the radius of the circle
    private static final double radius = 7.5;

    // private: only accessible within the class
    // static: belongs to the class, not an instance of the class
    // final: cannot be changed after initialization
    // double: data type for floating-point numbers

    public static void main(String[] args) {
        // Calculate the perimeter of the circle using the constant radius
        double perimeter = 2 * Math.PI * radius;

        // Calculate the area of the circle using the constant radius
        double area = Math.PI * radius * radius;

        // Print the calculated perimeter and area
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
