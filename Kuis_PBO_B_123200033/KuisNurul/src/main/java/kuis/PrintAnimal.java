package kuis;

public class PrintAnimal implements Animals {
    String jenishewan; 
    String namahewan;
    String suaraahewan;

    public PrintAnimal(String jenishewan, String namahewan, String suaraahewan) {
        this.jenishewan = jenishewan;
        this.namahewan = namahewan;
        this.suaraahewan = suaraahewan;
    }

  
    @Override
    public void jenis1() {
        System.out.print(jenishewan + " adalah ");
        System.out.print(namahewan + " dengan ");
        System.out.println("bunyi "+ suaraahewan);
    }

    @Override
    public void jenis2() {
        System.out.print(jenishewan + " adalah ");
        System.out.print(namahewan + " dengan ");
        System.out.println("bunyi "+ suaraahewan);
    }

    @Override
    public void jenis3() {
        System.out.print(jenishewan + " adalah ");
        System.out.print(namahewan + " dengan ");
        System.out.println("bunyi "+ suaraahewan);
    }

    @Override
    public void jenis4() {
        System.out.print(jenishewan + " adalah ");
        System.out.print(namahewan + " dengan ");
        System.out.println("bunyi "+ suaraahewan);
    }
    
}