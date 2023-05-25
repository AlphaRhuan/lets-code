public class App {
    public static void main(String[] args) throws Exception {
        int n=5;
        double[] v=new double[n];
        double[] u=new double[n];
        v[0]=2.0;
        v[1]=3.0;
        v[2]=4.0;
        v[3]=5.0;
        v[4]=6.0;
        for (int i=0; i<n; i=i+1){
            u[i]=v[i]*(i+1);

        }

        System.out.println(u[1]+" "+u[3]);
    }
}
