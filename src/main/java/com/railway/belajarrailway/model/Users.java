package com.railway.belajarrailway.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Users {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "user_sequence"
    )
    Long id;
    String nama;
    int umur;

    public Users(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", umur=" + umur +
                '}';
    }
}
