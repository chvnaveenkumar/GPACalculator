/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;

/**
 *
 * @author Naveen Kumar, Chandaluri
 */
public class Gpa {
    private String firstName;
    private String lastName;
    private String sId;
    private String course1,course2,course3;
    
     /**
     *
     */
    public Gpa()
    {
        
    }
    

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @param sId
     */
    public void setsId(String sId) {
        this.sId = sId;
    }

    /**
     *
     * @param course1
     */
    public void setCourse1(String course1) {
        this.course1 = course1;
    }

    /**
     *
     * @param course2
     */
    public void setCourse2(String course2) {
        this.course2 = course2;
    }

    /**
     *
     * @param course3
     */
    public void setCourse3(String course3) {
        this.course3 = course3;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return
     */
    public String getsId() {
        return sId;
    }

    /**
     *
     * @return
     */
    public String getCourse1() {
        return course1;
    }

    /**
     *
     * @return
     */
    public String getCourse2() {
        return course2;
    }

    /**
     *
     * @return
     */
    public String getCourse3() {
        return course3;
    }
    
    /**
     *
     * @param grade
     * @return
     */
    public double courseGpa(String grade)
    {
        double gpa = 0;
        if(grade.equals("A"))
        gpa=4.0;
        else if(grade.equals("B"))
        gpa=3.0;
        else if(grade.equals("c"))
        gpa=2.0;
        else if(grade.equals("D"))
        gpa=1.0;
        else if(grade.equals("F"))
        gpa=0.0;
        return gpa;
    }
    
    /**
     *
     * @param course1Grade
     * @param course2Grade
     * @param course3Grade
     * @return
     */
    public double calculateGpa(String course1Grade,String course2Grade, String course3Grade)
    {
        double course1Points=courseGpa(course1Grade);
        double course2Points=courseGpa(course2Grade);
        double course3Points=courseGpa(course3Grade);      
        double sgpa = ((course1Points+course2Points+course3Points)*3/9);
        return sgpa;
    }
    
}
