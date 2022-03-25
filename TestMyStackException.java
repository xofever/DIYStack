package diyException;

public class TestMyStackException {
    public static void main(String[] args) {
        Mystack mystack = new Mystack();
        try {
            mystack.push(new Object());
            mystack.push(new Object());
            mystack.push(new Object());
            mystack.push(new Object());
            mystack.push(new Object());
            mystack.push(new Object());
            mystack.push(new Object());
            mystack.push(new Object());
            mystack.push(new Object());
            mystack.push(new Object());
            mystack.push(new Object());
        } catch (MyStackException e) {
            System.out.println(e.getMessage());
        }
    }
}
