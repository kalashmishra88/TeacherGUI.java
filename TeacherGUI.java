import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TeacherGUI
{
    //the instance variables are declared
    private JFrame Mainframe, LecturerFrame, TutorFrame,SalaryFrame;
    private JPanel Mainpan1, Mainpan2, LecturePanel, TutorPanel,SalaryPanel ;
   
    //these are the main frame components
    private JLabel lecturerLabel, tutorLabel;
    private JButton buttonLecturer, buttonTutor;
   
    //these are the Lecturer components
    private JLabel NameLabel, TeacherIdLabel, TeacherNameLabel, AddressLabel,WorkingTypeLabel, EmploymentStatusLabel, GradedScoreLabel, YearOfExperienceLabel,
    addLecturerLabel,ChangetoTutorLabel, GradedAssignmentsLabel,DisplayLabel, ClearLabel, DepartmentLabel,workingHoursLabel;
   
    private JTextField TextTeacherId, TextTeacherName, TextAddress, TextWorkingType, TextEmploymentStatus, TextGradedScore, TextDepartment,
    TextYearOfExperience, TextworkingHours;
       
    private JButton ButtonAddLecturer, ButtonChangeToTutor, ButtonDisplay, ButtonClear, ButtonGradedAssignments;
   
    //these are the Tutor components
    private JLabel Name1Label, SpecializationLabel, WorkingHoursLabel, SalaryLabel, QualificationsLabel, AddTutorLabel, RemoveTutorLabel, SetSalaryLabel,
    ChangeToLecturerLabel, PerformanceIndexLabel, TeacherIDLabel, teacherNameLabel, workingTypeLabel, Display1Label, Clear1Label, employmentStatusLabel,addressLabel, NewSalaryLabel,newPerformanceIndexLabel;
   
    private JTextField TextWorkingHours, TextSpecialization, TextSalary, TextQualifications, TextPerformanceIndex, TextTeacherID, TextteacherName,
    TextworkingType, TextemploymentStatus,Textaddress,TextnewPerformanceIndex,TextnewSalary;
   
    private JButton ButtonAddTutor, ButtonSetSalary, ButtonRemoveTutor, ButtonChangeToLecturer, ButtonDisplay1, ButtonClear1,setNewSalaryButton, ButtonBack ,ButtonClear2 ;
   
    //an arraylist is created
    ArrayList<Teacher> Array_list = new ArrayList<Teacher>();
   
    //this method is for lecturer interface
    public void lecturerInterface()
    {
        //setting frame for lecturer interface
        JFrame lecturer_frame = new JFrame ("Lecturer");
        lecturer_frame.setSize(1600,1600);
        lecturer_frame.setResizable(false);
       
        //setting panel for lecturer interface
        JPanel lecpanel = new JPanel();
        lecpanel.setBounds(0, 0,800, 800);
        lecpanel.setBackground(Color.LIGHT_GRAY);
        lecpanel.setLayout(null);
       
            //setting labels for lecturer interface
            NameLabel = new JLabel("Lecturer");
            NameLabel.setBounds(640,45,200,30);
            NameLabel.setVisible(true);
            NameLabel.setFont(new Font("ROBOTO MEDIUM", Font.BOLD,38));
           
            TeacherIdLabel = new JLabel("Teacher ID : ");
            TeacherIdLabel.setBounds(40,135,150,30);
            TeacherIdLabel.setVisible(true);
            TeacherIdLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,17));
           
            TeacherNameLabel = new JLabel("Teacher Name : ");
            TeacherNameLabel.setBounds(490,135,150,30);
            TeacherNameLabel.setVisible(true);
            TeacherNameLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,17));
           
            AddressLabel = new JLabel("Address : ");
            AddressLabel.setBounds(990,135,200,30);
            AddressLabel.setVisible(true);
            AddressLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,17));
           
            WorkingTypeLabel = new JLabel("Working Type : ");
            WorkingTypeLabel.setBounds(40,205,150,30);
            WorkingTypeLabel.setVisible(true);
            WorkingTypeLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,17));
           
            EmploymentStatusLabel= new JLabel("Employment Status : ");
            EmploymentStatusLabel.setBounds(490,205,170,30);
            EmploymentStatusLabel.setVisible(true);
            EmploymentStatusLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,17));
           
            GradedScoreLabel= new JLabel("Graded Score : ");
            GradedScoreLabel.setBounds(990,205,150,30);
            GradedScoreLabel.setVisible(true);
            GradedScoreLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,17));
           
            YearOfExperienceLabel= new JLabel("Year Of Experience : ");
            YearOfExperienceLabel.setBounds(40,275,180,30);
            YearOfExperienceLabel.setVisible(true);
            YearOfExperienceLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,17));
           
            DepartmentLabel=new JLabel("Department : ");
            DepartmentLabel.setBounds(490,275,150,30);
            DepartmentLabel.setVisible(true);
            DepartmentLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,17));
           
            workingHoursLabel=new JLabel("WorkingHours : ");
            workingHoursLabel.setBounds(990,275,200,30);
            workingHoursLabel.setVisible(true);
            workingHoursLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,17));
            //setting textfield for lecturer interface
            TextTeacherId = new JTextField();
            TextTeacherId.setBounds(190,135,200,30);
            TextTeacherId.setVisible(true);
            TextTeacherId.setBackground(Color.WHITE);
           
            TextTeacherName = new JTextField();
            TextTeacherName.setBounds (640,135,200,30);
            TextTeacherName.setVisible(true);
            TextTeacherName.setBackground(Color.WHITE);
           
            TextAddress = new JTextField();
            TextAddress.setBounds(1090,135,200,30);
            TextAddress.setVisible(true);
            TextAddress.setBackground(Color.WHITE);
           
            TextWorkingType = new JTextField();
            TextWorkingType.setBounds(190,205,200,30);
            TextWorkingType.setVisible(true);
            TextWorkingType.setBackground(Color.WHITE);
           
            TextEmploymentStatus = new JTextField();
            TextEmploymentStatus.setBounds(670,205,200,30);
            TextEmploymentStatus.setVisible(true);
            TextEmploymentStatus.setBackground(Color.WHITE);
           
            TextGradedScore = new JTextField();
            TextGradedScore.setBounds(1120,205,200,30);
            TextGradedScore.setVisible(true);
            TextGradedScore.setBackground(Color.WHITE);
           
            TextYearOfExperience = new JTextField();
            TextYearOfExperience.setBounds(230,275,200,30);
            TextYearOfExperience.setVisible(true);
            TextYearOfExperience.setBackground(Color.WHITE);
           
            TextDepartment = new JTextField();
            TextDepartment.setBounds(640,275,200,30);
            TextDepartment.setVisible(true);
            TextDepartment.setBackground(Color.WHITE);
       
            TextworkingHours = new JTextField();
            TextworkingHours.setBounds(1090,275,200,30);
            TextworkingHours.setVisible(true);
            TextworkingHours.setBackground(Color.WHITE);
           
           
            //setting buttons for lecturer interface
            ButtonAddLecturer = new JButton("Add Lecturer");
            ButtonAddLecturer.setBounds(380, 395, 200, 40);
            lecpanel.add(ButtonAddLecturer); // Add to the panel
            ButtonAddLecturer.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
               
            ButtonChangeToTutor = new JButton("Change to Tutor");
            ButtonChangeToTutor.setBounds(380,595,200,40);
            ButtonChangeToTutor.setVisible(true);
            ButtonChangeToTutor.setLayout(null);
            ButtonChangeToTutor.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
           
            ButtonGradedAssignments = new JButton("Grade Assignments");
            ButtonGradedAssignments.setBounds(840,595,200,40);
            ButtonGradedAssignments.setVisible(true);
            ButtonGradedAssignments.setLayout(null);
            ButtonGradedAssignments.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
           
            ButtonDisplay = new JButton("Display");
            ButtonDisplay.setBounds(605,495,200,40);
            ButtonDisplay.setVisible(true);
            ButtonDisplay.setLayout(null);
            ButtonDisplay.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
           
            ButtonClear = new JButton("Clear");
            ButtonClear.setBounds(840,395,200,40);
            ButtonClear.setVisible(true);
            ButtonClear.setLayout(null);
            ButtonClear.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
           
           
            //adding components in frame
            //labels
            lecpanel.add(NameLabel);
            lecpanel.add(TeacherIdLabel);
            lecpanel.add(TeacherNameLabel);
            lecpanel.add(AddressLabel);
            lecpanel.add(WorkingTypeLabel);
            lecpanel.add(EmploymentStatusLabel);
            lecpanel.add(GradedScoreLabel);
            lecpanel.add(YearOfExperienceLabel);
            lecpanel.add(DepartmentLabel);
            lecpanel.add(workingHoursLabel);
           
           
            //textfields
            lecpanel.add(TextTeacherId);
            lecpanel.add(TextTeacherName);
            lecpanel.add(TextAddress);
            lecpanel.add(TextWorkingType);
            lecpanel.add(TextEmploymentStatus);
            lecpanel.add(TextGradedScore);
            lecpanel.add(TextDepartment);
            lecpanel.add(TextYearOfExperience);
            lecpanel.add(TextworkingHours);
           
           
            //buttons
            lecpanel.add(ButtonAddLecturer);
            lecpanel.add(ButtonChangeToTutor);
            lecpanel.add(ButtonGradedAssignments);
            lecpanel.add(ButtonDisplay);
            lecpanel.add(ButtonClear);
           
           
           
           
             //button
            ButtonAddLecturer.addActionListener(new ActionListener()
            {
            public void actionPerformed(ActionEvent ae) {
            // checking if any of the required fields are empty
            if (TextTeacherId.getText().isEmpty() || TextTeacherName.getText().isEmpty() || TextAddress.getText().isEmpty() ||
                TextWorkingType.getText().isEmpty() || TextEmploymentStatus.getText().isEmpty() || TextGradedScore.getText().isEmpty() ||
                TextDepartment.getText().isEmpty() || TextYearOfExperience.getText().isEmpty()|| TextworkingHours.getText().isEmpty()) {
                // it displays a message if any field is empty
                JOptionPane.showMessageDialog(null, "Please fill all the fields", "Incomplete Form", JOptionPane.ERROR_MESSAGE);
            }
           
               else {    
                 try {
                int teacherId = Integer.parseInt(TextTeacherId.getText());
                int GradedScore = Integer.parseInt(TextGradedScore.getText());
                int YearOfExperience = Integer.parseInt(TextYearOfExperience.getText());
                String teacherName = TextTeacherName.getText();
                String address = TextAddress.getText();
                String workingType= TextWorkingType.getText();
                String employmentStatus = TextEmploymentStatus.getText();
                String Department = TextDepartment.getText();
                int workingHours = Integer.parseInt(TextworkingHours.getText());
           
                if (!teacherName.matches("[a-zA-Z]+") || !address.matches("[a-zA-Z0 ]+") || !workingType.matches("[a-zA-Z]+") ||
                        !employmentStatus.matches("[a-zA-Z]+") || !Department.matches("[a-zA-Z]+")) {
                    JOptionPane.showMessageDialog(null, "Please enter valid input for all string types", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    return;
                }
           
                String message = "Lecturer Details:\n" +
                                 "Teacher ID: " + teacherId + "\n" +
                                 "Teacher Name: " + teacherName + "\n" +
                                 "Address: " + address + "\n" +
                                 "Working Type: " + workingType + "\n" +
                                 "Employment Status: " + employmentStatus + "\n" +
                                 "Graded Score: " + GradedScore + "\n" +
                                 "Year of Experience: " + YearOfExperience + "\n" +
                                 "Department: " + Department + "\n" +
                                 "Working Hours:" + workingHours;
            JOptionPane.showMessageDialog(null, message, "Lecturer Details", JOptionPane.INFORMATION_MESSAGE);
           
                
                           if(Array_list.isEmpty())
                {
                    Lecturer lecturer = new Lecturer ( teacherId,  teacherName, address,  workingType, employmentStatus, workingHours,  Department, YearOfExperience);

                            Array_list.add(lecturer);

                    JOptionPane.showMessageDialog(lecturer_frame,"Lecturer added successfully, THANK YOU!!","Successful",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(Array_list.isEmpty() == false)
                {
                    boolean addLecturer = true;
                    for(Teacher teacherOBJ: Array_list)
                    {
                        if(teacherOBJ instanceof Lecturer)
                        {
                            if(teacherId == teacherOBJ.getTeacherId())
                            {
                                addLecturer = false;
                                break;
                            }
                        }
                    }
                    if(addLecturer == true)
                    {
                         Lecturer lecturer = new Lecturer ( teacherId,  teacherName, address,  workingType, employmentStatus, workingHours,  Department, YearOfExperience);

                            Array_list.add(lecturer);
                        System.out.println(Array_list);//testing
                        JOptionPane.showMessageDialog(lecturer_frame,"Lecturer added successfully, THANK YOU!!","Successful",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(lecturer_frame,"GIVEN TEACHER ID ALREADY EXIST,GIVE UNIQUE TEACHER ID.","Warning",JOptionPane.WARNING_MESSAGE);
                    }
                }
            }catch(NumberFormatException a){
                JOptionPane.showMessageDialog(lecturer_frame,"Invalid Input!!! Please fill correct information.","ERROR",JOptionPane.ERROR_MESSAGE);
            }

                          
                         
                    }                  

                }
            }); 
                   

           
         ButtonDisplay.addActionListener(new ActionListener()
            {
               
            public void actionPerformed(ActionEvent ae) {
                if (TextTeacherId.getText().isEmpty() || TextTeacherName.getText().isEmpty() || TextAddress.getText().isEmpty() ||
                TextWorkingType.getText().isEmpty() || TextEmploymentStatus.getText().isEmpty() || TextGradedScore.getText().isEmpty() ||
                TextDepartment.getText().isEmpty() || TextYearOfExperience.getText().isEmpty()|| TextworkingHours.getText().isEmpty()) {
                // it displays a message if any field is empty
                JOptionPane.showMessageDialog(null, "Please fill all the fields", "Incomplete Form", JOptionPane.ERROR_MESSAGE);
            }      
                {
               
                    for(Teacher t1 : Array_list)
                {
                    if(t1 instanceof Lecturer)
                    {
                       t1.display();
                       JOptionPane.showMessageDialog(null, "your detail is added");
                    }
                   
         }
               
            }
               
               
                                 
               
           
        }
            });

           
         ButtonGradedAssignments.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (TextTeacherId.getText().isEmpty() || TextGradedScore.getText().isEmpty() || TextYearOfExperience.getText().isEmpty() || TextDepartment.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all the required fields", "Incomplete Form", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        int teacherId = Integer.parseInt(TextTeacherId.getText());
                        int GradedScore = Integer.parseInt(TextGradedScore.getText());
                        int YearOfExperience = Integer.parseInt(TextYearOfExperience.getText());
                        String Department = TextDepartment.getText();
                        String message = " Grade Assignment:\n" +
                                 "Teacher ID: " + teacherId + "\n" +
                                 "Graded Score: " + GradedScore + "\n" +
                                 "Department: " + Department + "\n" +
                                 "Year of Experience: " + YearOfExperience;
                        for (Teacher teacher : Array_list) {
                            if (teacher instanceof Lecturer && teacher.getTeacherId()==(teacherId)) {
                                Lecturer lecturer = (Lecturer) teacher;
                                lecturer.gradeAssignment(GradedScore, Department);
                                // display the graded score
                                
                                return;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Your Assignment is graded");
                         
                          JOptionPane.showMessageDialog(null, "invalid teacherId");

                       
                         


                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Please enter valid integer values for Teacher ID, Graded Score, and Year of Experience", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

   
                       
               
       
         
       ButtonChangeToTutor.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae) {
            TutorInterface();
        }
          });
         
       
         
        ButtonClear.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae) {
            TextTeacherId.setText("");
            TextTeacherName.setText("");
            TextAddress.setText("");
            TextWorkingType.setText("");
            TextEmploymentStatus.setText("");
            TextGradedScore.setText("");
            TextYearOfExperience.setText("");
            TextDepartment.setText("");
            TextworkingHours.setText("");
            JOptionPane.showMessageDialog(null, "Cleared!");
        }
          });  
         
         
         
        lecpanel .setVisible(true);
        lecturer_frame.add( lecpanel );
        lecturer_frame.setVisible(true);
    }
     
   
    // for tutor interface
    public void TutorInterface(){
        //setting frame for tutor interface
        JFrame tutor_frame = new JFrame ("Tutor");
        tutor_frame.setSize(1600,1600);
        tutor_frame.setResizable(false);
       
        //setting panels for tutor interface
        JPanel tutpanel = new JPanel();
        tutpanel.setBounds(0, 0,800, 800);
        tutpanel.setBackground(Color.CYAN);
        tutpanel.setLayout(null);
       
        //setting labels for tutor interface
        Name1Label = new JLabel("TUTOR");
        Name1Label.setBounds(490,45,300,30);
        Name1Label.setVisible(true);
        Name1Label.setFont(new Font("ROBOTO MEDIUM", Font.BOLD,38));
       
        TeacherIDLabel = new JLabel("Teacher ID : ");
        TeacherIDLabel.setBounds(40,115,150,30);
        TeacherIDLabel.setVisible(true);
        TeacherIDLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        teacherNameLabel = new JLabel("Teacher Name : ");
        teacherNameLabel.setBounds(40,175,150,30);
        teacherNameLabel.setVisible(true);
        teacherNameLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        WorkingHoursLabel= new JLabel("Working Hours : ");
        WorkingHoursLabel.setBounds(40,235,150,30);
        WorkingHoursLabel.setVisible(true);
        WorkingHoursLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        workingTypeLabel = new JLabel("Working Type : ");
        workingTypeLabel.setBounds(40,295,150,30);
        workingTypeLabel.setVisible(true);
        workingTypeLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        employmentStatusLabel= new JLabel("Employment Status : ");
        employmentStatusLabel.setBounds(740,115,190,30);
        employmentStatusLabel.setVisible(true);
        employmentStatusLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        SalaryLabel= new JLabel("Salary : ");
        SalaryLabel.setBounds(740,175,200,30);
        SalaryLabel.setVisible(true);
        SalaryLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        SpecializationLabel= new JLabel("Specialization : ");
        SpecializationLabel.setBounds(740,235,150,30);
        SpecializationLabel.setVisible(true);
        SpecializationLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        QualificationsLabel = new JLabel ("Qualifications : ");
        QualificationsLabel.setBounds(740,295,200,30);
        QualificationsLabel.setVisible(true);
        QualificationsLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        PerformanceIndexLabel = new JLabel("Performance Index : ");
        PerformanceIndexLabel.setBounds(740,355,200,30);
        PerformanceIndexLabel.setVisible(true);
        PerformanceIndexLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        addressLabel = new JLabel("Address : ");
        addressLabel.setBounds(40,355,200,30);
        addressLabel.setVisible(true);
        addressLabel.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
       
        //setting textfields for tutor interface
        TextTeacherID= new JTextField();
        TextTeacherID.setBounds(190,115,200,30);
        TextTeacherID.setVisible(true);
        TextTeacherID.setBackground(Color.WHITE);
       
        TextteacherName = new JTextField();
        TextteacherName.setBounds(190,175,200,30);
        TextteacherName.setVisible(true);
        TextteacherName.setBackground(Color.WHITE);
       
        TextWorkingHours = new JTextField();
        TextWorkingHours.setBounds(190,235,200,30);
        TextWorkingHours.setVisible(true);
        TextWorkingHours.setBackground(Color.WHITE);
       
        TextworkingType = new JTextField();
        TextworkingType.setBounds(190,295,200,30);
        TextworkingType.setVisible(true);
        TextworkingType.setBackground(Color.WHITE);
       
        TextemploymentStatus = new JTextField();
        TextemploymentStatus.setBounds(990,115,200,30);
        TextemploymentStatus.setVisible(true);
        TextemploymentStatus.setBackground(Color.WHITE);
       
        TextSalary = new JTextField();
        TextSalary.setBounds(990,175,200,30);
        TextSalary.setVisible(true);
        TextSalary.setBackground(Color.WHITE);
       
        TextQualifications = new JTextField();
        TextQualifications.setBounds(990,235,200,30);
        TextQualifications.setVisible(true);
        TextQualifications.setBackground(Color.WHITE);
       
        TextPerformanceIndex = new JTextField();
        TextPerformanceIndex.setBounds(990,355,200,30);
        TextPerformanceIndex.setVisible(true);
        TextPerformanceIndex.setBackground(Color.WHITE);
       
        TextSpecialization= new JTextField();
        TextSpecialization.setBounds(990,295,200,30);
        TextSpecialization.setVisible(true);
        TextSpecialization.setBackground(Color.WHITE);
       
        Textaddress = new JTextField();
        Textaddress.setBounds(190,355,200,30);
        Textaddress.setVisible(true);
        Textaddress.setBackground(Color.WHITE);
       
       
   
        //setting buttons for tutor interface
        ButtonAddTutor = new JButton("Add Tutor");
        ButtonAddTutor.setBounds(190,435,200,40);
        ButtonAddTutor.setVisible(true);
        ButtonAddTutor.setLayout(null);
        ButtonAddTutor.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        ButtonChangeToLecturer = new JButton("Change to Lecturer");
        ButtonChangeToLecturer.setBounds(190,515,200,40);
        ButtonChangeToLecturer.setVisible(true);
        ButtonChangeToLecturer.setLayout(null);
        ButtonChangeToLecturer.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        ButtonRemoveTutor = new JButton("Remove Tutor");
        ButtonRemoveTutor.setBounds(430,515,200,40);
        ButtonRemoveTutor.setVisible(true);
        ButtonRemoveTutor.setLayout(null);
        ButtonRemoveTutor.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        ButtonDisplay1 = new JButton("Display");
        ButtonDisplay1.setBounds(440,435,200,40);
        ButtonDisplay1.setVisible(true);
        ButtonDisplay1.setLayout(null);
        ButtonDisplay1.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        ButtonClear1 = new JButton("Clear");
        ButtonClear1.setBounds(690,435,200,40);
        ButtonClear1.setVisible(true);
        ButtonClear1.setLayout(null);
        ButtonClear1.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       
        ButtonSetSalary = new JButton("Set Salary");
        ButtonSetSalary.setBounds(690,515,200,40);
        ButtonSetSalary.setVisible(true);
        ButtonSetSalary.setLayout(null);
        ButtonSetSalary.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,19));
       

        //adding components to the frame
        //labels
        tutpanel.add(Name1Label);
        tutpanel.add(TeacherIDLabel);
        tutpanel.add(teacherNameLabel);
        tutpanel.add(WorkingHoursLabel);
        tutpanel.add(workingTypeLabel);
        tutpanel.add(employmentStatusLabel);
        tutpanel.add(SalaryLabel);
        tutpanel.add(SpecializationLabel);
        tutpanel.add(QualificationsLabel);
        tutpanel.add(PerformanceIndexLabel);
        tutpanel.add(addressLabel);
        //textfields
        tutpanel.add(TextTeacherID);
        tutpanel.add(TextteacherName);
        tutpanel.add(TextWorkingHours);
        tutpanel.add(TextworkingType);
        tutpanel.add(TextSpecialization);
        tutpanel.add(TextSalary);
        tutpanel.add(TextQualifications);
        tutpanel.add(TextPerformanceIndex);
        tutpanel.add(TextemploymentStatus);
        tutpanel.add(Textaddress);
       
        //buttons
        tutpanel.add(ButtonAddTutor);
        tutpanel.add(ButtonSetSalary);
        tutpanel.add(ButtonRemoveTutor);
        tutpanel.add(ButtonChangeToLecturer);
        tutpanel.add(ButtonDisplay1);
        tutpanel.add(ButtonClear1);
       
       
        tutpanel.setVisible(true);
        tutor_frame.add(tutpanel);
        tutor_frame.setVisible(true);
       
         
        ButtonAddTutor.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae) {
            boolean tutorDisplayed = false;
        // checking if any of the required fields are empty
        if (TextTeacherID.getText().isEmpty() || TextteacherName.getText().isEmpty() || TextWorkingHours.getText().isEmpty() ||
            TextworkingType.getText().isEmpty() || TextemploymentStatus.getText().isEmpty() || TextSalary.getText().isEmpty() ||
            TextSpecialization.getText().isEmpty() || TextQualifications.getText().isEmpty() || TextPerformanceIndex.getText().isEmpty()|| Textaddress.getText().isEmpty() ) {
            // it displays a message if any field is empty
            JOptionPane.showMessageDialog(null, "Please fill all the fields", "Incomplete Form", JOptionPane.ERROR_MESSAGE);
        }
         else {
           
                try {
            int teacherId = Integer.parseInt(TextTeacherID.getText());
            int workingHours = Integer.parseInt(TextWorkingHours.getText());
           double Salary = Double.parseDouble(TextSalary.getText());
            int PerformanceIndex = Integer.parseInt(TextPerformanceIndex.getText());
            String AcademicQualifications = TextQualifications.getText();
            String Specialization = TextSpecialization.getText();
            String teacherName = TextteacherName.getText();
            String address = Textaddress.getText();
            String workingType= TextworkingType.getText();
            String employmentStatus = TextemploymentStatus.getText();
           
            if (!teacherName.matches("[a-zA-Z]+") || !address.matches("[a-zA-Z0 ]+") || !workingType.matches("[a-zA-Z]+") ||
                        !AcademicQualifications.matches("[a-zA-Z]+") || !Specialization.matches("[a-zA-Z]+")|| !employmentStatus.matches("[a-zA-Z]+")||!address.matches("[a-zA-Z]+")) {
                    JOptionPane.showMessageDialog(null, "Please enter valid input for all string types", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    return;
                }
           
           
            // displaying the details entered by the user in a popup
            String message = "Tutor is displayed:\n"+
            "Teacher ID:"+TextTeacherID.getText()+"\n" +
                             "Teacher Name:"+TextteacherName.getText() + "\n" +
                             "Teacher WorkingHours:"+TextWorkingHours.getText() + "\n" +
                             "Working Type:"+TextworkingType.getText() + "\n" +
                             "Employment Status:"+TextemploymentStatus.getText() + "\n" +
                             "Salary:"+TextSalary.getText() + "\n" +
                             "Specialization:"+TextSpecialization.getText() + "\n" +
                             "Qualifications:"+TextQualifications.getText()+ "\n" +
                             "PerformanceIndex:"+TextPerformanceIndex.getText();
           
                             
            JOptionPane.showMessageDialog(null, message, "Tutor Details", JOptionPane.INFORMATION_MESSAGE);
            if(Array_list.isEmpty())
                {
                     Tutor tutor =  new Tutor( teacherId ,  teacherName,  address,  workingType,employmentStatus ,workingHours, Salary, Specialization, AcademicQualifications, PerformanceIndex);

                            Array_list.add(tutor);


                    JOptionPane.showMessageDialog(tutor_frame,"Tutor added successfully, THANK YOU!!","Successful",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(Array_list.isEmpty() == false)
                {
                    boolean addTutor = true;
                    for(Teacher teacherOBJ: Array_list)
                    {
                        if(teacherOBJ instanceof Tutor)
                        {
                            if(teacherId == teacherOBJ.getTeacherId())
                            {
                                addTutor = false;
                                break;
                            }
                        }
                    }
                    if(addTutor == true)
                    {
                        Tutor tutor =  new Tutor( teacherId ,  teacherName,  address,  workingType,employmentStatus ,workingHours, Salary, Specialization, AcademicQualifications, PerformanceIndex);

                            Array_list.add(tutor);

                        System.out.println(Array_list);//testing
                        JOptionPane.showMessageDialog(tutor_frame,"Tutor added successfully, THANK YOU!!","Successful",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(tutor_frame,"GIVEN TEACHER ID ALREADY EXIST,GIVE UNIQUE TEACHER ID.","Warning",JOptionPane.WARNING_MESSAGE);
                    }
                }
            }catch(NumberFormatException a){
                JOptionPane.showMessageDialog(tutor_frame,"Invalid Input!!! Please fill correct information.","ERROR",JOptionPane.ERROR_MESSAGE);
            }

                          
                         
                    }                  

                }
            }); 
                      
       
       
        ButtonSetSalary.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            setSalaryGUI();
        }
    });
        ButtonDisplay1.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae) {
             boolean tutorDisplayed = false;
        // checking if any of the required fields are empty
        if (TextTeacherID.getText().isEmpty() || TextteacherName.getText().isEmpty() || TextWorkingHours.getText().isEmpty() ||
            TextworkingType.getText().isEmpty() || TextemploymentStatus.getText().isEmpty() || TextSalary.getText().isEmpty() ||
            TextSpecialization.getText().isEmpty() || TextQualifications.getText().isEmpty() || TextPerformanceIndex.getText().isEmpty()|| Textaddress.getText().isEmpty()) {
            // it displays a message if any field is empty
            JOptionPane.showMessageDialog(null, "Please fill all the fields", "Incomplete Form", JOptionPane.ERROR_MESSAGE);
        }
        {
                for(Teacher t1 : Array_list)
                {
                    if(t1 instanceof Tutor)
                    {
                       t1.display();
                       JOptionPane.showMessageDialog(null, "your detail is added");
                       tutorDisplayed = true;
                    }
                   if (!tutorDisplayed) {
            JOptionPane.showMessageDialog(null, "Tutor must be displayed to be added");
        }
                }
            }
           
            // displaying the details entered by the user in a popup
    }
        });
        
         
       
       ButtonChangeToLecturer.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
           lecturerInterface();
           
        }
        } ) ;
       
       
        ButtonClear1.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae) {
            TextTeacherID.setText("");
            TextteacherName.setText("");
            TextWorkingHours.setText("");
            TextworkingType.setText("");
            TextemploymentStatus.setText("");
            TextSalary.setText("");
            TextSpecialization.setText("");
            TextQualifications.setText("");
            TextPerformanceIndex.setText("");
            Textaddress.setText("");
            JOptionPane.showMessageDialog(null, "Cleared!");
        }
          });  
        ButtonRemoveTutor.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae) {
           
           
         if (TextTeacherID.getText().isEmpty() || TextteacherName.getText().isEmpty() || TextWorkingHours.getText().isEmpty() ||
            TextworkingType.getText().isEmpty() || TextemploymentStatus.getText().isEmpty() || TextSalary.getText().isEmpty() ||
            TextSpecialization.getText().isEmpty() || TextQualifications.getText().isEmpty() || TextPerformanceIndex.getText().isEmpty()|| Textaddress.getText().isEmpty() ) {
            // show a message if any field is empty
            JOptionPane.showMessageDialog(null, "Please fill all the fields", "Incomplete Form", JOptionPane.ERROR_MESSAGE);
        }
         String teacherIdToRemove = TextTeacherID.getText();
                boolean found = false;

                   
                    for (int a = 0; a < Array_list.size(); a++) {
                       
                        if (Array_list.get(a) instanceof Tutor) {
                            Tutor tutor = (Tutor) Array_list.get(a);
                            if (Integer.toString(tutor.getTeacherId()).equals(teacherIdToRemove)) {
                                Array_list.remove(a);
                                found = true;
                                break;
                            }
                        }
                    }

                    // show appropriate message based on whether the tutor was found and removed
                    if (found) {
                        JOptionPane.showMessageDialog(null, "The tutor with ID " + teacherIdToRemove + " has been removed successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No tutor found with the entered ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
    }
        });

       
         
   
    }
    public void setSalaryGUI(){
    //frame for Set Salary GUI
    SalaryFrame = new JFrame("Set Salary");
    SalaryFrame.setSize(500, 400);
    SalaryFrame.setResizable(false);
   
    //panel for Set Salary GUI
    SalaryPanel = new JPanel();
    SalaryPanel.setBounds(0, 0, 400, 300);
    SalaryPanel.setLayout(null);
   
    //labels for Set Salary GUI
   
   
    NewSalaryLabel = new JLabel("New Salary:");
    NewSalaryLabel.setBounds(50, 50, 100, 30);
   
    newPerformanceIndexLabel = new JLabel("New Performance Index:");
    newPerformanceIndexLabel.setBounds(50, 100, 150, 30);
   
    //textfields for Set Salary GUI
   
   
    TextnewSalary = new JTextField();
    TextnewSalary.setBounds(200, 50, 150, 30);
   
    TextnewPerformanceIndex = new JTextField();
    TextnewPerformanceIndex.setBounds(200, 100, 150, 30);
   
    //button for Set Salary
    setNewSalaryButton = new JButton("Set New Salary");
    setNewSalaryButton.setBounds(150, 210, 100, 40);
   
    ButtonClear2 = new JButton("Clear");
    ButtonClear2.setBounds(170, 210, 100, 40);

        //button for Back
        ButtonBack = new JButton("Back");
        ButtonBack.setBounds(280, 210, 100, 40);
   
    //adding components to panel
   
    SalaryPanel.add(NewSalaryLabel);
    SalaryPanel.add(newPerformanceIndexLabel);
   
    SalaryPanel.add(TextnewSalary);
    SalaryPanel.add(TextnewPerformanceIndex);
    SalaryPanel.add(setNewSalaryButton);
    SalaryPanel.add(ButtonClear2);
    SalaryPanel.add(ButtonBack);
   
    //adding panel to frame
    SalaryFrame.add(SalaryPanel);
   
    SalaryFrame.setVisible(true);
   
       setNewSalaryButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        if (TextnewSalary.getText().isEmpty() || TextnewPerformanceIndex.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter full details");
        } else {
            try {
             int teacherId = Integer.parseInt(TextTeacherID.getText());
            double newSalary = Double.parseDouble(TextnewSalary.getText());
            int newPerformanceIndex = Integer.parseInt(TextnewPerformanceIndex.getText());
                // calling the setSalary method with the provided new salary and performance
                Tutor tutor = null;
                            for (Teacher t : Array_list) {
                                if (t.getTeacherId() == teacherId && t instanceof Tutor) {
                                    tutor = (Tutor) t;
                                    break;
                                }
                            }
                            if (tutor != null) {
                                // set the salary for the tutor
                                tutor.setSalary(newSalary, newPerformanceIndex);
                                // show success message
                                if (tutor.isCertified()) {
                                    JOptionPane.showMessageDialog(null, "Salary set for Tutor ID " + newSalary);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Salary cannot be approved for uncertified tutors.");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Teacher ID not found", "Error", JOptionPane.ERROR_MESSAGE);
                            }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid numerical values for Salary and Performance Index", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
});
        ButtonClear2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
               
                TextnewSalary.setText("");
                TextnewPerformanceIndex.setText("");
            }
        });
        ButtonBack.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                TutorInterface();
            }
        });
       
       
   
         
     
       
   
}

 
    public void m(){
        JFrame mainframe = new JFrame ("CourseworkGUI");
       
        mainframe.setSize(800,800);
       
       
        //First Panel
        JPanel mainpan1 = new JPanel();
        mainpan1.setLayout(null);
       
        mainpan1.setBounds(45,100,1200,550);
        mainpan1.setBackground(Color.ORANGE);
       
        //Second Panel
        JPanel mainpan2 = new JPanel();
        mainpan2.setLayout(null);
        mainpan2.setBounds(45,420,900,300);
        mainpan2.setBackground(Color.YELLOW);
       
        //JLabel
        JLabel select_label = new JLabel ("Choose between them");
        select_label.setBounds(500,30,400,50);
        select_label.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,30));
        mainpan2.add(select_label);
       
        //Jbuttons for lecturer
        JButton ButtonLecturer = new JButton("Lecturer");
        ButtonLecturer.setBounds(150,300,350,150);
        ButtonLecturer.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,30));
        ButtonLecturer.setBackground(Color.WHITE);
        mainpan2.add(ButtonLecturer);
       
        //Jbuttons for Tutor
        JButton ButtonTutor = new JButton("Tutor");
        ButtonTutor.setBounds(700, 300, 350, 150);
        ButtonTutor.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN,30));
        ButtonTutor.setBackground(Color.WHITE);
        mainpan2.add(ButtonTutor);
       
         ButtonLecturer.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae)
        {
           lecturerInterface();
           
        }
       } ) ;
       
        ButtonTutor.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae) {
            // calling TutorInterface method
            TutorInterface();
        }
          });
           
        //adding the panels to the mainframe
        mainframe.add(mainpan1);
        mainframe.add(mainpan2);
       
        mainpan1.setVisible(true);
        mainpan2.setVisible(true);
       
        mainframe.setVisible(true);
       
    }
   
   
    public static void main(String[] args){
     
    TeacherGUI t1 = new TeacherGUI();
    t1.m();

   
   
   
   
   
   }
}
