package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column
   private Long id;

   @Column(name = "model")
   private String model;

   @Column(name = "series")
//   @JoinColumn(name = "id")
   private int series;

   public Car(String model, int series) {
      this.model = model;
      this.series = series;
   }

//   @OneToOne(mappedBy = "userCar")
//   private User user;

   public Car() { }

   public Long getId() { return id; }
   public String getModel() { return model; }
   public int getSeries() { return series; }

   public void setId(Long id) { this.id = id; }
   public void setModel(String model) { this.model = model; }
   public void setSeries(int series) { this.series = series; }


   @Override
   public java.lang.String toString() {
      return "Car{" +
              "id=" + id +
              ", model='" + model + '\'' +
              ", series=" + series +
              '}';
   }
}

