package com.upc.estureview.entitys;

import javax.persistence.*;
import java.time.LocalDate;

@Entity (name = "reviewTeachers")
public class ReviewTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dateReviewT", nullable = false)
    private LocalDate dateReviewT;
    @Column(name = "reviewT", length = 300, nullable = false)
    private String reviewT;
    @Column(name = "calification", nullable = false)
    private int calification;
    @Column(name = "payForHour", nullable = false)
    private double payForHour; //es lo mismo que pension
    @ManyToOne(targetEntity = Teacher.class)
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public ReviewTeacher() {
    }

    public ReviewTeacher(Long id, LocalDate dateReviewT, String reviewT, int calification, double payForHour, Teacher teacher, User user) {
        this.id = id;
        this.dateReviewT = dateReviewT;
        this.reviewT = reviewT;
        this.calification = calification;
        this.payForHour = payForHour;
        this.teacher = teacher;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateReviewT() {
        return dateReviewT;
    }

    public void setDateReviewT(LocalDate dateReviewT) {
        this.dateReviewT = dateReviewT;
    }

    public String getReviewT() {
        return reviewT;
    }

    public void setReviewT(String reviewT) {
        this.reviewT = reviewT;
    }

    public int getCalification() {
        return calification;
    }

    public void setCalification(int calification) {
        this.calification = calification;
    }

    public double getPayForHour() {
        return payForHour;
    }

    public void setPayForHour(double payForHour) {
        this.payForHour = payForHour;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ReviewTeacher{" +
                "id=" + id +
                ", dateReviewT=" + dateReviewT +
                ", reviewT='" + reviewT + '\'' +
                ", calification=" + calification +
                ", payForHour=" + payForHour +
                ", teacher=" + teacher +
                ", user=" + user +
                '}';
    }
}
