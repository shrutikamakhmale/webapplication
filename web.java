package registration;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.EventObject;
 
public class web extends JFrame implements ActionListener {
	private Container c;
    private JLabel title;
    private JLabel fname;
    private JLabel lname;
    private JTextField tname;
    private JTextField aname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel city;
    private JTextArea tcity;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    
    private JLabel res;
    private JTextArea resadd;
    private String dates[]
            = { "1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30",
                "31" };
        private String months[]
            = { "Jan", "feb", "Mar", "Apr",
                "May", "Jun", "July", "Aug",
                "Sup", "Oct", "Nov", "Dec" };
        private String years[]
            = { "1995", "1996", "1997", "1998",
                "1999", "2000", "2001", "2002",
                "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010",
                "2011", "2012", "2013", "2014",
                "2015", "2016", "2017", "2018",
                "2019" };
        public void MyFrame()
        {
            setTitle("Registration Form");
            setBounds(300, 90, 900, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
     
            c = getContentPane();
            c.setLayout(null);
     
            title = new JLabel("Registration Form");
            title.setFont(new Font("Arial", Font.PLAIN, 30));
            title.setSize(300, 30);
            title.setLocation(300, 30);
            c.add(title);
     
            fname = new JLabel("Name");
            fname.setFont(new Font("Arial", Font.PLAIN, 20));
            fname.setSize(100, 20);
            fname.setLocation(100, 100);
            c.add(fname);
     
            tname = new JTextField();
            tname.setFont(new Font("Arial", Font.PLAIN, 15));
            tname.setSize(190, 20);
            tname.setLocation(200, 100);
            c.add(tname);
            
            lname = new JLabel("Name");
            lname.setFont(new Font("Arial", Font.PLAIN, 20));
            lname.setSize(100, 20);
            lname.setLocation(100, 100);
            c.add(lname);
     
            aname = new JTextField();
            aname.setFont(new Font("Arial", Font.PLAIN, 15));
            aname.setSize(190, 20);
            aname.setLocation(200, 100);
            c.add(aname);
     
     
            mno = new JLabel("Mobile");
            mno.setFont(new Font("Arial", Font.PLAIN, 20));
            mno.setSize(100, 20);
            mno.setLocation(100, 150);
            c.add(mno);
     
            tmno = new JTextField();
            tmno.setFont(new Font("Arial", Font.PLAIN, 15));
            tmno.setSize(150, 20);
            tmno.setLocation(200, 150);
            c.add(tmno);
            dob = new JLabel("DOB");
            dob.setFont(new Font("Arial", Font.PLAIN, 20));
            dob.setSize(100, 20);
            dob.setLocation(100, 250);
            c.add(dob);
     
            date = new JComboBox(dates);
            date.setFont(new Font("Arial", Font.PLAIN, 15));
            date.setSize(50, 20);
            date.setLocation(200, 250);
            c.add(date);
     
            month = new JComboBox(months);
            month.setFont(new Font("Arial", Font.PLAIN, 15));
            month.setSize(60, 20);
            month.setLocation(250, 250);
            c.add(month);
     
            year = new JComboBox(years);
            year.setFont(new Font("Arial", Font.PLAIN, 15));
            year.setSize(60, 20);
            year.setLocation(320, 250);
            c.add(year);
     
           city = new JLabel("Address");
            city.setFont(new Font("Arial", Font.PLAIN, 20));
            city.setSize(100, 20);
            city.setLocation(100, 300);
            c.add(city);
            
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(150, 450);
            sub.addActionListener(this);
            c.add(sub);
     
            reset = new JButton("Reset");
            reset.setFont(new Font("Arial", Font.PLAIN, 15));
            reset.setSize(100, 20);
            reset.setLocation(270, 450);
            reset.addActionListener(this);
            c.add(reset);
     
            tout = new JTextArea();
            tout.setFont(new Font("Arial", Font.PLAIN, 15));
            tout.setSize(300, 400);
            tout.setLocation(500, 100);
            tout.setLineWrap(true);
            tout.setEditable(false);
            c.add(tout);
     
            res = new JLabel("");
            res.setFont(new Font("Arial", Font.PLAIN, 20));
            res.setSize(500, 25);
            res.setLocation(100, 500);
            c.add(res);
     
           
            setVisible(true);
        }
     
        
		public void actionPerformed(ActionEvent arg0) {
			EventObject e = null;
			// TODO Auto-generated method stub
			if (e.getSource() == sub) {
	            
	                String data1 = null;
	                String data
	                    = "Name : "
	                      + tname.getText() + "\n"
	                      + "Mobile : "
	                      + tmno.getText() + "\n";
	                String data2
                    = "DOB : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)month.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n";
 
                String data3 = "Address : " + tcity.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                            + " terms & conditions..");
            }
        
 
         if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tcity.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
           // term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            
        }
    }

 

			


       /* class Registration {
        	 
            public static void main(String[] args) throws Exception
            {
                Myframe f = new Myframe();
            
        System.out.println("------------------------");
            }
*/
	
}

