/*
JRE contains JVM and Libraries.
JDK have JRE & Development Tools
Source code is .java file.

COMPILATION {
source code -> comp
￼
iler -> converts to Byte Code Class .class -> 
this byte code can be executed on any OS, provided it have JRE,
that'why java is portable language. 
}

EXECUTION{
    bytecode -> JVM -> native code (binary 0 or 1)

}
*/

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!1"); 
        System.out.print("Hello, World!2"); 
        System.out.println("Hello, World!\n");
        
        Scanner sc = new Scanner(System.in);
        var a = sc.nextLine();
        System.out.println(a);
        
        


    }
}