


public class Calculation {
    private int num1;
    private int num2;
    private double result;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Calculation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Calculation(){

    }

    public double calculation(int operation){
        if (operation == 1){
            this.result = this.getNum1()+this.getNum2();
        }
        else if(operation == 2){
            this.result = this.getNum1()-this.getNum2();
        }
        else if(operation == 3){
            this.result = this.getNum1()*this.getNum2();
        }
        else if(operation == 4){
            this.result = this.getNum1()/this.getNum2();
        }
        else{
            System.out.println("Sorry wrong operation");
        }
        return this.result;

    }
}
