package inherentanceEx;


class Prent {

    int pi, pj;

    void showPiPj() {
        System.out.println("Pi:" + pi + "\npj:" + pj);
    }
    
    int sum(){
        return  pi+pj;
    }
}

class Child extends Prent {

    int pk;

    public void showPk() {
        System.out.println("Pk :" + pk);
    }

    public int sum() {
        return pi + pj + pk;
    }

}
class InherentanceEx {

    public static void main(String[] args) {
        Prent p = new Prent();
        
        p.pi = 2;
        p.pj = 7;
        p.showPiPj();
        System.out.println("sum :"+ p.sum());
        
        Child c = new Child();
        c.pi = 12;
        c.pj = 17;
        c.pk = 18;
        c.showPk();
        System.out.println("Sum : "+c.sum());
        
        Prent pc = new Child();
        pc.pi = 120;
        pc.pj = 130;
 //        pc.pk = 20;
        pc.showPiPj();
        
 //       Child cp = new Prent();

    }
}


