public class Student {
    String name;
    int stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double avarage;
    boolean isPass;

    Student(String name,int stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.course1=c1;
        this.course2=c2;
        this.course3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1,int note2,int note3) {
        if ((0 <= note1) && (note1 <= 100))  {
            this.course1.note = note1;
        }
        if ((0 <= note2) && (note2 <= 100)) {
            this.course2.note = note2;
        }
        if ((0 <= note3) && (note3 <= 100)) {
            this.course3.note = note3;
        }
    }

    void addBulkSozluNotu(int snote1,int snote2,int snote3){
        if ((0 <= snote1) && (snote1 <= 100))  {
            this.course1.sozluNotu = snote1;
        }
        if ((0 <= snote2) && (snote2 <= 100)) {
            this.course2.sozluNotu = snote2;
        }
        if ((0 <= snote3) && (snote3 <= 100)) {
            this.course3.sozluNotu = snote3;
        }
    }

    void isPass() {
        if (this.course1.note == 0 || this.course2.note == 0 || this.course3.note == 0) {
            if(this.course1.sozluNotu == 0 || this.course2.sozluNotu == 0 || this.course3.sozluNotu == 0){
                System.out.println("Notlar tam olarak girilmemiş");
            }else{
                System.out.println("Sınav notları daha girilmemiş");
            }
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    void calcAvarage() {
        int notHesap1 = (this.course1.note*this.course1.yuzdeNote/100)+(this.course1.sozluNotu*this.course1.yuzdeSozlu/100);
        int notHesap2 = (this.course2.note*this.course2.yuzdeNote/100)+(this.course2.sozluNotu*this.course2.yuzdeSozlu/100);
        int  notHesap3 = (this.course3.note*this.course3.yuzdeNote/100)+(this.course3.sozluNotu*this.course3.yuzdeSozlu/100);
        this.avarage = (notHesap1+notHesap2+notHesap3) / 3.0;
    }
    void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.course1.note+"\t Sözlü notu : "+this.course1.sozluNotu);
        System.out.println("Fizik Notu : " + this.course2.note+"\t Sözlü notu : "+this.course2.sozluNotu);
        System.out.println("Kimya Notu : " + this.course3.note+"\t Sözlü notu : "+this.course3.sozluNotu);
    }
}
