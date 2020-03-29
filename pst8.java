import java.awt.*;
import java.awt.event.*;
public class pst8 extends Frame implements KeyListener{
    Label l;
    pst8(){
        l=new Label("");
        addKeyListener(this);  add(l);
        setVisible(true); setSize(400,400);
    }
    public void keyReleased(KeyEvent ke){
        l.setText("Key Released");
    }
    public void keyPressed(KeyEvent ke){
        l.setText("Key Pressed");
    }
    public void keyTyped(KeyEvent ke){
        l.setText("Key Typed");
    }
    public static void main(String[] args){
        new pst8();
    }
}
