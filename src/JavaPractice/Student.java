public class Student {
    String name;
    int s_Num;
    double score;

    public Student(String name,int s_Num,double score){
        this.name=name;
        this.s_Num=s_Num;
        this.score=score;
    }

    public String getName(String name){
        return this.name;
    }

    public int getNumber(int s_Num){
        return this.s_Num;
    }

    public double getGPA(double score){
        return this.score;
    }

    public String toString(){
        return "name :" + name + ", Number = " + s_Num + ", GPA =" + score ;
    }
}

class StudentDB{
    Student[] s;
    int LOWER_THAN =0;
    int HIGHER_THAN=1;
    int count=0;

    public StudentDB(){
        s=new Student[3];
    }

    public void add(Student sn){
        s[count++]=sn;
    }

    public void add(String name,int s_Num,double score){
        s[count++]=new Student(name,s_Num,score);
    }

    Student findBy(String name){
        for(Student e : s){
            if(e.name==name){
                return e;
            }
        }
        return null;
    }

    Student findBy(int s_Num){
        for(Student e : s){
            if(e.s_Num==s_Num){
                return e;
            }
        }
        return null;
    }

    Student findBy(double score){
        for(Student e : s){
            if(e.score==score){
                return e;
            }
        }
        return null;
    }

    Student findBy(int param,double score){
        if(param==LOWER_THAN){
            for(Student e:s){
                if(e.score<score){
                    return e;
                }
            }
            return null;
        }
        else{
            for(Student e:s){
                if(e.score>score){
                    return e;
                }
            }
            return null;
        }
    }
}

class StudentMain{
    public static void main(String[] args){
        StudentDB array = new StudentDB();
        Student s1 = new Student("김지우",201911111,4.01);
        array.add(s1);
        array.add("이민준",201922222,3.95);
        array.add("박서윤",201933333,3.09);

        System.out.println(array.findBy("박서윤"));
        System.out.println(array.findBy(201922222));
        System.out.println(array.findBy(3.90));
        System.out.println(array.findBy(0,3.95));
        System.out.println(array.findBy(1,3.95));
    }
}