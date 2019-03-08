package lab7;

public class Collection<T> {
    private int n;
    private Object[] a;
    private Object[] b;

    private void deleter(int c){
        b = new Object[n-1];
        for(int i=0; i<c; i++){
            b[i] = a[i];
        }
        for(int i=c; i<n-1; i++){
            b[i] = a[i+1];
        }
        n--;
        a = new Object[n];
        for(int i=0; i<n; i++){
            a[i] = b[i];
        }
    }

    public Object get(int c){
        return a[c];
    }

    public void add(T obj){
        n++;
        b = new Object[n];
        for(int i=0; i<n-1; i++){
            b[i] = a[i];
        }
        b[n-1] = obj;
        a = new Object[n];
        for(int i=0; i<n; i++){
            a[i] = b[i];
        }
        return;
    }
    public void remove(T o){
        int c = -1;
        Object b = o;
        for(int i=n-1; i>=0; i--){
            if(a[i].equals(b)) c = i;
        }
        if(c>-1) deleter(c);
    }

    public boolean contains(T o){
        int c=0;
        Object b = o;
        //System.out.println("");
        for(int i=0; i<n; i++){
            if(a[i].equals(b)) c++;
        }
        if(c==0) return false;
        else return true;
    }

    public int size(){
        return n;
    }
    public boolean isEmpty(){
        if(n==0) return true;
        else return false;
    }

    public Collection(){
        n=0;
        a = new Object[0];
    }
    public Collection(T obj){
        n=1;
        a= new Object[1];
        a[0]=obj;
    }
}
