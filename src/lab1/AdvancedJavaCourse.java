package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends Course {

    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    @Override
    public String getCourseName() {
        return null;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
}
