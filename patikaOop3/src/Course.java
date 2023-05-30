public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher courseTeacher;
    int sozluNotu;
    int yuzdeNote;
    int yuzdeSozlu;

    Course(String name,String code,String prefix,int yuzdeNote){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.sozluNotu=0;
        this.yuzdeNote=yuzdeNote;
        this.yuzdeSozlu=100-yuzdeNote;
    }

    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)) {
            this.courseTeacher = teacher;
        }else {
            System.out.println(teacher.name + " Akademisyeni bu dersi veremez.");
        }
    }

    void printTeacher(){
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
