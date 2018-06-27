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
public class Word extends Token{
    public String lexeme = "";
    public Word(String s, int tag) 
    { 
        super(tag); 
        lexeme = s; 
    }
    public String toString() 
    { 
        return lexeme ; 
    }
    public static final Word
       and = new Word("&&", Tag.AND), or = new Word("||", Tag.OR),
       eq  = new Word("==", Tag.EQ ), ne = new Word("!=", Tag.NE), 
       Ie  = new Word("<=", Tag.LE ), ge = new Word(">=", Tag.GE), 
       minus = new Word("minus", Tag.MINUS),
       True  = new Word("true", Tag.TRUE),
       False = new Word("false", Tag.FALSE), 
       temp  = new Word("t", Tag.TEMP);
}
