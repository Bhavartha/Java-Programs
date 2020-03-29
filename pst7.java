import java.awt.*;
import java.awt.event.*;
public class pst7 extends Frame implements MouseListener{
    Label l;
    pst7(){
        setLayout(new BorderLayout());
        l=new Label();
        l.addMouseListener(this);  add(l, BorderLayout.CENTER);
        setVisible(true); setSize(400,400);
    }
    public void mousePressed(MouseEvent me){
        l.setText("Mouse Pressed");
    }
    public void mouseClicked(MouseEvent me){
        l.setText("Mouse Clicked");
    }
    public void mouseReleased(MouseEvent me){
        l.setText("Mouse Released");
    }
    public void mouseEntered(MouseEvent me){
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent me){
        l.setText("Mouse Exited");
    }
    public static void main(String[] args){
        new pst7();
    }
}
