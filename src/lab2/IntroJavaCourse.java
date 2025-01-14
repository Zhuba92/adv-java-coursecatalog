package lab2;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse implements Course{

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseName(String courseName) {

    }

    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    @Override
    public final void setCredits(double credits) {
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

}
