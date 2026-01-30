package JavaCornerStone.Encapsulation;

public class Encapsulation {

    // Değişkenleri private yaparak dışarıdan direkt erişimi engelliyoruz
    private String name;
    private int age;

    // Getter → veriyi okumak için
    public String getName() {
        return name;
    }

    // Setter → veriyi kontrollü şekilde değiştirmek için
    public void setName(String name) {
        this.name = name;
    }

    // Yaş için kontrol ekleyerek encapsulation'ın gücünü gösteriyoruz
    public void setAge(int age) {
        if (age > 0) {  // mantıksız yaş girişini engelliyoruz
            this.age = age;
        } else {
            System.out.println("Yaş 0'dan büyük olmalıdır!");
        }
    }

    public int getAge() {
        return age;
    }
}
