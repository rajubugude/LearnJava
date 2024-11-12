package classes;

public class LearnGenerics {
    public static void main(String[] args) {
        Print printObj = new Print();
        printObj.setValue(1);
        Object printValue = printObj.getValue();

        // We cannot use printValue directly,
        // we have to typecast it, else it will be compiled time error
        if ((int) printValue == 1){
            //do something
        }
    }
}

class Print {
    Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}