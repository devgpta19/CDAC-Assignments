public class Table{
    public void table(int n, int m){

        for(int i=1;i<=m;i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }
    public static void main(String[] args) {
        if(args.length<=0)
        System.out.println("Atleast 1 Argument provide");

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        Table obj = new Table();
        obj.table(n,m);

    }
}