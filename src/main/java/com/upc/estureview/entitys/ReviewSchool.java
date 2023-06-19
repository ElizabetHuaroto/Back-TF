package com.upc.estureview.entitys;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "reviewSchool")
public class ReviewSchool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dateReviewS", nullable = false)
    private LocalDate dateReviewS;
    @Column(name = "reviewS", length = 300, nullable = false)
    private String reviewS;
    @Column(name = "calification", nullable = false)
    private int calification;
    @Column(name = "pension", nullable = false)
    private double pension;
    @ManyToOne(targetEntity = School.class)
    @JoinColumn(name = "school_id", referencedColumnName = "id")
    private School school;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public ReviewSchool(Long id, LocalDate dateReviewS, String reviewS, int calification, double pension, School school, User user) {
        this.id = id;
        this.dateReviewS = dateReviewS;
        this.reviewS = reviewS;
        this.calification = calification;
        this.pension = pension;
        this.school = school;
        this.user = user;
    }

    public ReviewSchool() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateReviewS() {
        return dateReviewS;
    }

    public void setDateReviewS(LocalDate dateReviewS) {
        this.dateReviewS = dateReviewS;
    }

    public String getReviewS() {
        return reviewS;
    }

    public void setReviewS(String reviewS) {
        this.reviewS = reviewS;
    }

    public int getCalification() {
        return calification;
    }

    public void setCalification(int calification) {
        this.calification = calification;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ReviewSchool{" +
                "id=" + id +
                ", dateReviewS=" + dateReviewS +
                ", reviewS='" + reviewS + '\'' +
                ", calification=" + calification +
                ", pension=" + pension +
                ", school=" + school +
                ", user=" + user +
                '}';
    }
}
