package diyException;

import java.util.Arrays;

public class Mystack {
    private Object[] elements;
    private int index;

    public Mystack() {
        this(new Object[10],-1);
    }

    public Mystack(Object[] elements, int index) {
        this.elements = elements;
        this.index = index;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void push(Object elements) throws MyStackException {
        if(getIndex()>=getElements().length-1) {
            /*System.out.println("栈已经满了，不能压栈！");
            return;*/
            MyStackException myStackException = new  MyStackException("栈已满，压栈失败");
            throw myStackException;
    }
        getElements()[getIndex()+1]=elements;
        setIndex(getIndex()+1);
        System.out.println("压栈"+elements+"成功,栈帧指向-->"+getIndex());

    }

    public Object pop() throws MyStackException {
        Object  obj = null;
        if(getIndex()<0) {
            /*System.out.println("栈已经空了，不能弹栈！");
            return obj;*/
            MyStackException myStackException = new MyStackException("弹栈失败，栈已空");
            throw  myStackException;
        }
        obj = getElements()[getIndex()];
        getElements()[getIndex()]=null;
        setIndex(getIndex()-1);
        System.out.println("弹栈"+obj+"成功，栈帧指向-->"+getIndex());
        return obj;
    }

    @Override
    public String toString() {
        return "Mystack{" +
                "elements=" + Arrays.toString(elements) +
                ", index=" + index +
                '}';
    }
}
