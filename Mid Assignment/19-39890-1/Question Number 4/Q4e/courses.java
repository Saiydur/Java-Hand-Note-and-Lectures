public class courses{
    private String[] cse = new String[] {"Introduction To Programming","DataStructure","Algorithm","DataBase","OOP1","OOP2","Web Techonology"};
    private String[] bba = new String[] {"Accouting","Economics","Marketing","Finance","Information Technology","Micro Economics","Macro Economics"};
    private String[] other = new String[] {"English:1","English:2","English:3","Arts & Craft","Poetry","Bangladesh Studies","Research And Methology"};
    private String studentName;
    private String studentId;
    private String studentDept;
    private String semester;
    private String contactNumber;

    public courses()
    {
        System.out.println("Enter Your Details Here");
    }

    public void setBba(String[] bba) {
        this.bba = bba;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public void setCse(String[] cse) {
        this.cse = cse;
    }
    public void setOther(String[] other) {
        this.other = other;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept;
    }
    public String[] getBba() {
        return bba;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public String[] getCse() {
        return cse;
    }
    public String[] getOther() {
        return other;
    }
    public String getSemester() {
        return semester;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getStudentDept() {
        return studentDept;
    }

    public void showDetails()
    {
        System.out.println("Name:"+getStudentName());
        System.out.println("Id:"+getStudentId());
        System.out.println("Department:"+getStudentDept());
        System.out.println("Semester:"+getSemester());
        System.out.println("Contact Number:"+getContactNumber());
    }
}