public class inheritance {
    public static void main(String[] args) {
        tortois fh = new tortois();
        fh.age();
        fh.name();
        fh.whight();
        fh.nighalo();
        fh.nighalo();
        fh.fis = 4;
        System.out.println(fh.fis);

    }
}

class animal {
    animal() {
        System.out.println("constercter ic caller 1");
    }

    int age;
    String name;
    float whight;

    void age() {
        System.out.println("20");
    }

    void name() {
        System.out.println("nono");
    }

    void whight() {
        System.out.println("7.93");
    }
}

class elephant extends animal {
    void aalo() {
        System.out.println("elephant in afrika");
    }

    void chalo() {
        System.out.println("are the bigest mamale in world");
    }
}

class fish extends animal {
    fish() {
        System.out.println("constracter is caller 2");
    }

    void nighalo() {
        System.out.println("is water type pokemon");
    }

    void pohochalo() {
        System.out.println("lavda lasun");
    }
    // int legs;
    // fish(int legs){
    // System.out.println("4");
    // }
}

class tortois extends fish {
    tortois() {
        System.out.println("constracter is caller 3");
    }

    int fis;

    void nighalo() {
        System.out.println("he ih live in sand");
    }

    void pohochalo() {
        System.out.println("tortois and turtal is different");
    }
}