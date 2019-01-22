/*Nested interface must be public

* if it is declared inside the interface but it can have any access
modifier if declared within the class.
* Nested intrfaces are declared static implicitely
*/
package nestedInterface;


public interface Displayable {//implement by TestNestedInterface
    void show();
    interface Massage{
        void msg();
    }
    
}
