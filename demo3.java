
interface task {

    public void msg();
}

class guddu implements task {

    public void msg() {
        System.out.println("This method is defined by Guddu");
    }
}

public class demo3 {

    public static void main(String[] args) {
        guddu obj = new guddu();
        obj.msg();
    }
}
