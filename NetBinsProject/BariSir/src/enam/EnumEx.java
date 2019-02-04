/*
 * An Enum is a data type which contains fixed set of constants
 * the enum constants are static and  final implicitely
 * it improves type safty, can have fields,constructor and methods
 * enum may implement many interfaces but cannot extend any calass
  because it internally extends Enum class.
 * enum can be defined within or outside the class
 * because it is similar to a class.
 */
package enam;

/**
 *
 * @author Md Yasin Arif
 */
public class EnumEx {
    public enum Day{
        SAT,SUN,MON,TUE,THU,FRI
    };// semicolon is optional here
    
    public static void main(String[] args) {
        for (Day s : Day.values()) {
            System.out.println(s);
        }
    }
}
