package lab1;

import javax.swing.*;

public abstract class Course
{
    public String courseNumber;
    public String courseName;
    public double credits;

    public abstract String getCourseName();

    public abstract void setCourseName(String courseName);

    public abstract String getCourseNumber();

    public abstract double getCredits();

    public abstract void setCredits();

    public abstract void setCourseNumber(String courseNumber);
}
