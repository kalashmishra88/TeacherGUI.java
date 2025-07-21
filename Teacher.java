public class Teacher
{
    // the attributes
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
   
    // the constructor accepting five parameters
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus,int workingHours)
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
        this.workingHours=workingHours;
    }
   
    // corresponding accessor methods
    public int getTeacherId()
    {
        return teacherId;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public String getAddress()
    {
        return address;
    }

    public String getWorkingType()
    {
        return workingType;
    }

    public String getEmploymentStatus()
    {
        return employmentStatus;
    }

    public int getWorkingHours()
    {
        return workingHours;
    }

    // method required to set the working hours
    public void setWorkingHours(int newWorkingHours)
    {
        workingHours = newWorkingHours;
    }

    // a display method
    public void display()
    {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Address: " + address);
        System.out.println("Working Type: " + workingType);
        System.out.println("Employment Status: " + employmentStatus);

        if (workingHours > 0)
        {
            System.out.println("Working Hours: " + workingHours);
        } else
        {
            System.out.println("Working Hours: Not Assigned");
        }
    }
}
