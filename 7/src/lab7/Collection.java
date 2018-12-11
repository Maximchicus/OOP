package lab7;

public class Collection<T>{
    int n;
    private T[] a;
    private T[] b;

    public void add(T obj){
        n++;
        Object[] b = new Object[n];
        for(int i=0; i<n; i++){
            b[i] = a[i];
        }
        b[n-1] = obj;
        for(int i=0; i<n; i++){
            a[i] = b[i];
        }
    }
    public Collection(){
        n=0;
        Object[] a = new Object[0];
    }
}
