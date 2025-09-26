/*

📦 What a Package Is:

-A package groups related classes, interfaces and sub-packages together.
-Think of it like a folder on your computer for Java code.

📦 Declaring a Package

-First line of the .java file:
package myPackage;
-The file must be stored in a directory matching the package name (e.g. /myPackage/YourClass.java).

📦 Using import to Access Other Packages

-To use a class from another package:
import myPackage.MyClass;          // imports one class
import myPackage.*;                // imports all classes in the package

-After importing, you can create objects:
MyClass obj = new MyClass();

-You can skip import and fully qualify:
myPackage.MyClass obj = new myPackage.MyClass();

📦 Default Package

-If you don’t write package ...; at the top, the class is in the default package.
-Classes in the default package cannot be imported into classes in named packages.

📦 Access Modifiers and Packages

-public class → visible to all packages.
-No modifier (package-private) → visible only inside the same package.
-protected → visible to subclasses in other packages.
-private → visible only inside the class itself.

📦 Sub-Packages

-A package name with dots creates nested directories:
package com.example.utils; // /com/example/utils/YourClass.java

📦 Built-in Packages

-java.lang is auto-imported (String, Math, Object, etc.).
-Other standard packages need import:
-java.util (Scanner, ArrayList)
-java.io (Input/Output classes)

📦 Static Imports (optional)

-Import static members so you can use them without the class name:
import static java.lang.Math.*; // now you can call sqrt(9) directly

📝 Exam “Gotchas”

-The package statement must be the first line (after comments).
-Only one public class per file, and the file name must match it.
-Folder structure must match the package name or compilation fails.
-If two classes in different packages have the same name, you must use the fully qualified name.

*/