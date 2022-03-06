/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

/**
 *
 * @author vasilis
 */
public class Prod {
    private final int a,b,c;
    
    public Prod(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA(){
	return this.a;
    }
    public int getB(){
        return this.b;
    }
    public int getC(){
        return this.c;
    }
    public int mul(){
	return this.a*this.b*this.c;
    }
}
