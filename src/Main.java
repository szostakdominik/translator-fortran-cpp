/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Main {
    
    public static void main(String[] args) throws FileNotFoundException
    {
        //ABS //(ABS | SQRT | SIN | COS | TAN | ATAN | EXP | LOG | LOG10 | MIN | MAX)
        ANTLRInputStream input = new ANTLRInputStream("program\n" +
                                                      "integer zmienna1,zmienna3,z\n" +                                                  
                                                      "double precision zmienna2, wyrazenie, wyrazenie1\n" +
                                                      "double precision x1,x2,delta;" +                                                      
                                                      "if (delta .LT. 0) then \n" +
                                                      "wynik=null \n" +                                                      
                                                      "end if \n" +  
                                                      "if (delta .EQ. 0) then \n" +
                                                      "wynik = 0\n" +
                                                      "end if \n" +
                                                      "integer tablica1(5)\n" +    
                                                                                                           
                                                      "zmienna1 = sin(tablica1(2)) \n" +                                                                                  
                                                      "zmienna1 = abs(tablica1(1)) \n" +
                                                      "zmienna1 = sqrt(8) \n" +
                                                      "zmienna1 = tan(2) \n" +
                                                      "zmienna1 = atan(4) \n" + 
                                                      "zmienna3 = exp(4) \n" +
                                                      "zmienna3 = log(7) \n" +
                                                      "zmienna3 = log10(3) \n" +
                                                      "zmienna3 = min(4,6) \n" +
                                                      "zmienna3 = max(6,tablica1(5)) \n" +
                                                      "zmienna3 = max(4,5) \n" +
                                                      "zmienna3 = max(5,6) \n" +
                                                      "wyrazenie = 4 + 5 /5 \n" +
                                                      "wyrazenie1 = 4 .EQ. 8 + zmienna3\n" +
                                                      "if (z .EQ. 5 + 7) then \n" +
                                                      "zmienna3 = max(5,6) \n" +
                                                      "else \n" + 
                                                      "zmienna1 = atan(4) \n" +
                                                      "end if  \n" +
                                                      "do k=1 , 9 , 3 \n" +
                                                      "zmienna1 = atan(4) \n" +
                                                      "end do \n" +                                                      
                                                      "end\n");
        fortran77Lexer lexer = new fortran77Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        fortran77Parser parser = new fortran77Parser(tokens);
        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser));
        
        ConvertToCPP convert = new ConvertToCPP();
        String result = convert.visit(tree);
        System.out.println("Result:");
        System.out.println(result);
    }
    
}