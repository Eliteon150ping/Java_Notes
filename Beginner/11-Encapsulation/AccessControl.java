package Beginner;

import java.beans.Customizer;

public class AccessControl {

    public static void main(String[] args) {

    }

    // Access Modifiers

    /* These are private to this class only and cannot be accessed without
       making getter and setter methods                                                                               */
    private String make;
    private String model;
    private int year;

    AccessControl(String make,String model,int year){

        this.setMake(make);                                 // The setter methods are used here to make updating/
                                                            // recieving arguments alot easier instead of using
                                                            // 'this.make = make;'
        this.setModel(model);                               // since the setter method has the 'this.make = make;' in it
        this.setYear(year);
    }

    // Getters(A getter is a method used to retrieve the value of a private field.)
    // NB: Purpose: To provide controlled read access.

    public String getMake() {
        return this.make;                                    /* Typical Naming: The method name usually starts with
                                                                'get' followed by the field name in camel case
                                                                (e.g., getName).                                      */
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    // Setters(A setter is a method used to set or modify the value of a private field.)
    // NB: Purpose: To provide controlled write access, often including validation or additional processing.

    public void setMake(String make) {
                                                               /* Typical Naming: The method name usually starts with
                                                                  'set' followed by the field name in camel case
                                                                  (e.g., setName).                                    */
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

/*    // • private: Accessible only within the class
      private double price = 15.50;

      // • public: Accessible by anyone
      public void setPrice(Customer cust){
          if (cust.hasLoyaltyDiscount()){
              price = price*.85;
          }
      }                                                                                                               */



}

/*

Access control allows you to:

• Hide fields and methods from other classes
• Determine how internal data gets changed
• Keep the implementation separate from the public interface

– Public interface:
    setPrice( Customer cust)

– Implementation:

public void setPrice(Customer cust){

// set price discount relative to customer

}

Why Use Them?
1. Encapsulation: Protects the internal state of the object.
2. Validation: Enables validation before setting a value.
3. Abstraction: Hides the internal implementation from the outside.
4. Maintainability: Easier to modify the code without affecting external classes using the object.

| Aspect         | Getter                            | Setter                          |
|----------------|-----------------------------------|----------------------------------|
| Function       | Retrieves the value of a field.  | Modifies the value of a field.  |
| Access         | Read access.                     | Write access.                   |
| Return Type    | Matches the field's type.        | Usually void.                   |
| Parameters     | None.                            | Typically accepts one parameter.|
| Use Case       | When you need to view data.      | When you need to update data.   |

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

Access level modifiers determine whether other classes can
use a particular field or invoke a particular method

• At the top level—public, or package-private (no explicit
modifier).

• At the member level—public, private, protected, or
package-private (no explicit modifier).

+-------------+---------+---------+---------+-------+
| Modifier    | Class   | Package | Subclass| World |                Stronger access privileges going downwards
+-------------+---------+---------+---------+-------+                            |
| public      | Y       | Y       | Y       | Y     |                            |
| protected   | Y       | Y       | Y       | N     |                            |
| No modifier | Y       | Y       | N       | N     |                            v
| private     | Y       | N       | N       | N     |
+-------------+---------+---------+---------+-------+

NB: Protected members are accessible in subclasses even in different packages

public: visible in all classes in all packages
protected: visible to all classes in the same package or classes in other packages that are a subclass
default: visible to all classes in the same package
private: visible only in the same class




*/
