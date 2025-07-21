public class Lecturer extends Teacher
{
    // the attributes
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    // the constructor accepting seven parameters
    public Lecturer(int teacherId, String teacherName, String address, String workingType,String employmentStatus,int workingHours, String department, int yearsOfExperience)
    {
        // a call is made to the superclass constructor with five parameters and a setter method
        super(teacherId, teacherName, address, workingType, employmentStatus,workingHours);
       
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }

    // corresponding accessor method
    public String getDepartment()
    {
        return department;
    }

    public int getYearsOfExperience()
    {
        return yearsOfExperience;
    }

    public int getGradedScore()
    {
        return gradedScore;
    }

    public boolean gethasGraded()
    {
        return hasGraded;
    }

    // mutator method for attribute: gradedScore
    public void setGradedScore(int newGradedScore)
    {
        this.gradedScore = newGradedScore;
    }

    // method to grade assignments named gradeAssignment
    public void gradeAssignment(int studentScore, String Department)
    {
        if (!hasGraded)
        {
             System.out.println("Assingment HasBeen graded");
            if (yearsOfExperience >= 5 && department.equals(Department))
            {
                if (studentScore >= 70)
                {
                    gradedScore = studentScore;
                } else if (studentScore >= 60)
                {
                    gradedScore = studentScore;
                } else if (studentScore >= 50)
                {
                    gradedScore = studentScore;
                } else if (studentScore >= 40)
                {
                    gradedScore = studentScore;
                } else
                {
                    gradedScore = studentScore;
                }
                this.gradedScore = studentScore;
                hasGraded = true;
            } else
            {
                System.out.println("Lecturer can't grade assignments.");
            }
        } else
        {
            System.out.println("Assignments have already been graded.");
        }
    }

    // method to display the details of the Lecturer class
    public void display()
    {
        super.display();

        System.out.println("Department: " + department);
        System.out.println("Years of Experience: " + yearsOfExperience);

        if (hasGraded)
        {
            System.out.println("Graded Score: " + gradedScore);
        } else
        {
            System.out.println("Graded Score: Not Graded");
        }
    }
}
