public class Employee {
    String name;   // değişkenleri tanımladık
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){  // kullanıcıdan bilgileri aldık
        this.name=name;                                           // maaşı da int olarak girsin istedim kafası karışmasın diye
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){  // maaşa uygulanan vergiyi hesaplayan metot
        double vergi = 0;
        if(this.salary>=1000){
            vergi = this.salary*0.03;   // 1000 TL den fazla maaş alıyorsa %3 vergiyi hesapla
        }
        return vergi;
    }

    public double bonus(){
        double bonus = 0;
        if(this.workHours>=40){
            bonus+=(this.workHours-40)*30;    // 40 saatten ne kadar fazla çalıştığını hesapladık ve 30 ile çarptık
        }
        return bonus;
    }

    public double raiseSalary(){
        double maasArtisi=0;
        int calistigiYil = 2021-this.hireYear;    // kaç senedir çalıştığını hesapladık ve ona göre maaşına zam yaptık
        if(calistigiYil<10){
            maasArtisi=this.salary*0.05;
        } else if ((calistigiYil>9)&&(calistigiYil<20)) {
            maasArtisi+=this.salary*0.1;
        } else if (calistigiYil>19) {
            maasArtisi+=this.salary*0.15;
        }
        return maasArtisi;
    }

    public void toStringg(){               // çalışanın bilgilerini yazdırma
        double fark = bonus()-tax();       // vergi ile bonus arasındaki farkı hesapladık
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("İşe Başlangıç Yılı: "+this.hireYear);
        System.out.println("Haftalık Çalışma Saati: "+this.workHours);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte Maaş: "+(this.salary+fark));
        System.out.println("Toplam maaş: "+(this.salary+raiseSalary()));
    }
}
