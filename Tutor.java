public class Tutor extends Teacher
{
    // the attributes
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    // the constructor accepting ten parameters
    public Tutor(int teacherId, String teacherName, String address, String workingType,
                 String employmentStatus, int workingHours, double salary,
                 String specialization, String academicQualifications, int performanceIndex)
    {
        // a call is made to the superclass constructor with ten parameters and a setter method
        super(teacherId, teacherName, address, workingType, employmentStatus,workingHours);

        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }

    // corresponding accessor method
    public double getSalary()
    {
        return salary;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public String getAcademicQualifications()
    {
        return academicQualifications;
    }

    public int getPerformanceIndex()
    {
        return performanceIndex;
    }

    public boolean isCertified()
    {
        return isCertified;
    }

    // mutator method
    public void setSalary(double newSalary, int newPerformanceIndex)
    {
        if (!isCertified)
        {
             this.salary = newSalary;
            this.performanceIndex = newPerformanceIndex;
            if (newPerformanceIndex > 5 && getWorkingHours() > 20)
            {
                double appraisalPercentage = 0;

                if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7)
                {
                    appraisalPercentage = 0.05;
                } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9)
                {
                    appraisalPercentage = 0.10;
                } else if (newPerformanceIndex == 10)
                {
                    appraisalPercentage = 0.20;
                }
               
                double appraisalAmount = newSalary * appraisalPercentage;
                this.salary = newSalary + appraisalAmount;
                this.isCertified = true;
            } else
            {
                System.out.println("Salary can't be approved for uncertified tutor.");
            }
        } else
        {
            System.out.println("Salary can't be changed for a certified tutor.");
        }
    }

    // method to remove tutor
    public void removeTutor()
    {
        if (!isCertified)
        {
            // setting attributes to zero
            this.salary = 0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;

            // setting isCertified to false
            this.isCertified = false;
        } else
        {
            System.out.println("Certified tutor can't be removed.");
        }
    }

    //  method to display the details of the Tutor class
    public void display()
    {
       
        super.display();

        if (isCertified)
        {
           
            System.out.println("Salary: Rs." + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualifications: " + academicQualifications);
            System.out.println("Performance Index: " + performanceIndex);
        } else
        {
            System.out.println("Tutor is not certified so salary details cannot be displayed.");
        }
    }
}
