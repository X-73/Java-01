package chapter04.code;

class GoodDog {
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        this.size = s;
    }
}
