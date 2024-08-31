public class car {
     int year;
     String car;

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCar() {
        return this.car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public car(int year, String car){
        this.year = year;
        this.car = car;
    }

    public void print() {
        System.out.println("Car :"+car);
        System.out.println("Tahun :"+year);
    }
}
