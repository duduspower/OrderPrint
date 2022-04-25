package com.example;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    @JoinColumn
    private PrintFile printFile;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Product() {
    }

    public Product(PrintFile printFile, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.printFile = printFile;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Product(int id, PrintFile printFile, LocalDateTime createdAt) {
        this.id = id;
        this.printFile = printFile;
        this.createdAt = createdAt;
    }

    @PrePersist
    private void createdAt(){
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    private void updatedAt(){
        this.updatedAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PrintFile getPrintFile() {
        return printFile;
    }

    public void setPrintFile(PrintFile printFile) {
        this.printFile = printFile;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
