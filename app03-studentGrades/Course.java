
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Derek Peacock
 * @version 0.1 11/Sep/2020
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNo;
    private String title;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    private int finalMark;

    private Grades finalGrade;

    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;

        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Application Programming", "CO453");
        module3 = new Module("Web Development", "CO456");
        module4 = new Module("Business Modelling", "CO457");
    }

    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
        else if(moduleNo == 2)
        {
            module1.awardMark(mark);
        }
        else if(moduleNo == 3)
        {
            module1.awardMark(mark);
        } 
        else if(moduleNo == 4)
        {
            module1.awardMark(mark);
        }
    }

    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
        module1.print();
        module2.print();
    }

    public Grades convertToGrade(int mark)
    {
        if((mark >= 0) && (mark < 40))
        {
            return Grades.F;
        }

        return Grades.X;
    }
}
