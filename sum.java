class Sum {

    int a;
    int b;
    Sum(int a, int b){
        this.a= a;
        this.b= b;
    }
    int add(){
        return a+b;
    }

    public static void main(String args[]){
        Sum s= new Sum(5,10);
        int r= s.add();
        System.out.println(r);
    }
}