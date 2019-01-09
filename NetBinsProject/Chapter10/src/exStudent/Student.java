
package exStudent;

import exStudent.EQ.EducationalQualification;
import to.*;


public class Student {
    private int studentId;
    private String studentName;
    private String mobileNo;
    private boolean isActiveStudent;
    private Department department;
    private EducationalQualification eduq;

    public Student(int studentId, String studentName, String mobileNo, boolean isActiveStudent, exStudent.Department department, EducationalQualification eduq) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mobileNo = mobileNo;
        this.isActiveStudent = isActiveStudent;
        this.department = department;
        this.eduq = eduq;
    }

    
    
    public Student() {
    }

    
    
    
}
