public class CourseList {
    private Course[] courseList = new Course[500];
    
    
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
