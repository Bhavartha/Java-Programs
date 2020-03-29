import java.awt.*;
import java.applet.*;
/* <Applet code=Bar_applet width=400 height=400>
<param name="columns" value="5">
<param name="c1" value="80">
<param name="c2" value="90">
<param name="c3" value="100">
<param name="c4" value="85">
<param name="c5" value="95">
<param name="label1" value="2012">
<param name="label2" value="2013">
<param name="label3" value="2014">
<param name="label4" value="2015">
<param name="label5" value="2016">
</Applet> */

public class Bar_applet extends Applet
{ int n=0;
String label[];
int value[];
public void init()
{
try
{
n=Integer.parseInt(getParameter("columns"));
label=new String[n];
value=new int[n];
label[0]=getParameter("label1");
label[1]=getParameter("label2");
label[2]=getParameter("label3");
label[3]=getParameter("label4");
label[4]=getParameter("label5");
value[0]=Integer.parseInt(getParameter("c1"));
value[1]=Integer.parseInt(getParameter("c2"));
value[2]=Integer.parseInt(getParameter("c3"));
value[3]=Integer.parseInt(getParameter("c4"));
value[4]=Integer.parseInt(getParameter("c5"));
}
catch(NumberFormatException e)
{
System.out.println(e);
}
}
public void paint(Graphics g)
{
for(int i=0;i<n;i++)
{
g.setColor(Color.red);
g.drawString(label[i],20,i*50+30);
g.setColor(Color.green);
g.fillRect(50,i*50+10,value[i],30);
}
}
}
