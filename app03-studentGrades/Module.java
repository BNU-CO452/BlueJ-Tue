
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    private boolean completed;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        mark = 0;
        this.title = title;
        this.codeNo = codeNo;
        completed = false;
    }
    
    public void awardMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
            this.mark = mark;
            if(mark >= 40)completed = true;
        }
        else
        {
            System.out.print("Invalid mark!!!");
        }
    }
    
    public void print()
    {
        System.out.println("Module: " + codeNo +
            " " + title + " Mark = " + mark);
    }


    public String getTitle()
    {
        return this.title;
    }//end method getTitle

    public void setTitle(String title)
    {
        this.title = title;
    }//end method setTitle

    public String getCodeNo()
    {
        return this.codeNo;
    }//end method getCodeNo

    public void setCodeNo(String codeNo)
    {
        this.codeNo = codeNo;
    }//end method setCodeNo

    public int getMark()
    {
        return this.mark;
    }//end method getMark

    public void setMark(int mark)
    {
        this.mark = mark;
    }//end method setMark

    public boolean isComplete()
    {
        return this.completed;
    }//end method getCompleted

    //End GetterSetterExtension Source Code
//!
}
