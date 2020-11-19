public class CourseList {
    private String[] courseList = new String[500];
    private Courses course;
    
    public void setCourseList(String[] courseList) {
        this.courseList = courseList;
    }
    public void setCourse(Courses course) {
        this.course = course;
    }
    public Courses getCourse() {
        return course;
    }
    public String[] getCourseList() {
        return courseList.clone();
    }
}
