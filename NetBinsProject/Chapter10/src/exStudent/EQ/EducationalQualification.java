
package exStudent.EQ;

public class EducationalQualification {
    private  int id;
    private  Exam exam;
    private  Session session;
    private Bord board;
    private Institute institute;
    private Group group;
    private PassingYear passintgYear;
    private CGPA cgpa;

    public EducationalQualification(int id, Exam exam, Session session, Bord board, Institute institute, Group group, PassingYear passintgYear, CGPA cgpa) {
        this.id = id;
        this.exam = exam;
        this.session = session;
        this.board = board;
        this.institute = institute;
        this.group = group;
        this.passintgYear = passintgYear;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "EducationalQualification{" + "id=" + id + ", exam=" + exam + ", session=" + session + ", board=" + board + ", institute=" + institute + ", group=" + group + ", passintgYear=" + passintgYear + ", cgpa=" + cgpa + '}';
    }
    
    
    
}
