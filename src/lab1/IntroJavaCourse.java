package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse  extends Course{

    String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public void setCourseName(String courseName) {

    }

    @Override
    public String getCourseNumber() {
        return null;
    }

    @Override
    public double getCredits() {
        return 0;
    }

    @Override
    public void setCredits() {

    }

    @Override
    public void setCourseNumber(String courseNumber) {

    }
}
