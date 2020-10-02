/*
 * Karn Bhavsar
 * Student ID: 991578281
 * PROG24178 - Object Oriented Programming 2 - JAVA
*/

package assignment6;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author karnb
 */
public class FXMLassignment6Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private TextField txtcourse;
    @FXML private TextField txtagrade;
    @FXML private TextField txtqgrade;
    @FXML private TextField txtfgrade;
    @FXML private Button btnsubmit;
    @FXML private ComboBox<String> cmb;
    @FXML private ListView<String> lw;
    
    
    File file = new File("course.txt");
    
     ArrayList<String> courses=new ArrayList<String>();;
    ArrayList<Courseinfo> courseList=new ArrayList<Courseinfo>();;
    
    
    
    
    
    @FXML
    private void submit(ActionEvent e)
    {
        courses.add(txtcourse.getText());
        ObservableList<String> list = FXCollections.observableArrayList(courses);
        cmb.setItems(list);
        
        try
        {
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter output = new PrintWriter(bw);
            String cname = txtcourse.getText();
            String q = txtqgrade.getText();
            String a = txtagrade.getText();
            String f = txtfgrade.getText();
            Courseinfo obj = new Courseinfo(cname,q,a,f);  
            courseList.add(obj);
            output.println(cname+","+"quiz,"+q);
            output.println(cname+","+"assignment,"+a);
            output.println(cname+","+"final,"+f);
            
            output.close();
            System.out.println("File Created");
            
        }
        catch (IOException error)
        {
            System.out.println("Error in file Write");
        }
        

        
         
    }
    
    @FXML
    private void cmbevent(ActionEvent e)
    {
        
        String lists[] = new String[5];  // ? this line?
        
        if (cmb.getValue()!=null)
        {
            for(int i=0; i<courseList.size(); i++)
            {
                if (courseList.get(i).courseName.equals(cmb.getValue()))
                {
                    String c = courseList.get(i).courseName;
                    String result = "Course Name: "+c;
                    String q = courseList.get(i).quiz;
                    double q1 = Double.parseDouble(q);
                    String a = courseList.get(i).assign;
                    double a1 = Double.parseDouble(a);
                    String f = courseList.get(i).finalGrade;
                    double f1 = Double.parseDouble(f);
                    double total = q1 + a1 + f1;
                    lists[0] = result;
                    result = "Quiz Grade: "+q;
                    lists[1] = result;
                    result = "Assignment Grade: "+a;
                    lists[2] = result;
                    result = "Final Grade: "+f;
                    lists[3] = result;
                    result = "Total: "+total;
                    lists[4] = result;
                    
                }
            }
            ObservableList<String> list = FXCollections.observableArrayList(lists);
            lw.setItems(list);
            
        }

        
    }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        try
        {
            Scanner read = new Scanner(file);
            
            while (read.hasNext())
            {
                String quiz = read.next();
                String ass = read.next();
                String f = read.next();
                
                String course = quiz.split(",")[0];
                quiz = quiz.split(",")[2];
                ass = ass.split(",")[2];
                f = f.split(",")[2];
                Courseinfo obj = new Courseinfo(course,quiz,ass,f);
                courseList.add(obj);
                courses.add(course);
            }
            read.close();
        }
        catch(IOException e)
        {
            System.out.println("Error in file read");
            System.out.println("File Doesn't Exist yet");
            System.out.println("Add Course info first");
        }
                ObservableList<String> list = FXCollections.observableArrayList(courses);
                cmb.setItems(list);
       
    }    
    
}
