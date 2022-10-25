package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column (name = "model")
    private String model;

    @Column (name = "series")
    private int series;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private  User user;

    public Car () {

    }

    public Car (String model, int series) {
        this.model =model;
        this.series = series;
    }
    public Long getId () {
        return id;
    }
    public void setId () {
        this.id = id;
    }
    public String setModel () {
        return model;
    }
    public void getModel () {
        this.model = model;
    }
    public int setSeries () {
        return  series;
    }
    public void  getSeries () {
        this.series = series;
    }
    public User getUser () {
        return user;
    }
    public User setUser (User user) {
        this.user = user;
        return user;
    }
    @Override
    public String toString () {
        return  "Car {" +
                "id=" + id +
                ", model='" + model +'\'' +
                ", series=" + series +
                '}';
    }

}
