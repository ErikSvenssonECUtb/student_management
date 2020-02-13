package se.ecutb.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Course {
    private int courseId;
    private String title;
    private String description;
    private LocalDateTime start;

    public Course(int courseId, String title, String description, LocalDateTime start) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.start = start;
    }

    public Course(String title, String description, LocalDateTime start) {
        this(0, title,description,start);
    }

    public int getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseId == course.courseId &&
                Objects.equals(title, course.title) &&
                Objects.equals(description, course.description) &&
                Objects.equals(start, course.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, title, description, start);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("courseId=").append(courseId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", start=").append(start);
        sb.append('}');
        return sb.toString();
    }
}
