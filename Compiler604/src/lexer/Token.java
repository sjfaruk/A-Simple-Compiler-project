/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexer;

/**
 *
 * @author md.sarowarfaruk
 */
public class Token {
    public final int tag;
    public Token(int t) 
    { 
        tag = t ;
    }
    public String toString()
    {
        return "" + (char)tag;
    }
    
}
