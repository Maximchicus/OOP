package pr;

import java.util.*;

public class Play {
    Stack s1 = new Stack();
    Stack s2 = new Stack();
    Stack buf = new Stack();
    Stack bit = new Stack();
    static int p = 0;
    Play(){
        read();
        System.out.println(game());
    }
    void read(){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            buf.push(sc.nextInt());
        }
        for(int i=0; i<5; i++){
            s1.push(buf.pop());
        }
        for(int i=0; i<5; i++){
            buf.push(sc.nextInt());
        }
        for(int i=0; i<5; i++){
            s2.push(buf.pop());
        }
    }
    String game(){
        if((((int)s1.peek()>(int)s2.peek())&&((int)s1.peek()-(int)s2.peek()!=9))|(((int)s1.peek()==0)&&((int)s2.peek()==9))){
            bit.push(s1.pop());
            bit.push(s2.pop());
            while(!s1.empty()) buf.push(s1.pop());
            while(!bit.empty()) s1.push(bit.pop());
            while(!buf.empty()) s1.push(buf.pop());
        }
        else if((((int)s2.peek()>(int)s1.peek())&&((int)s2.peek()-(int)s1.peek()!=9))|(((int)s2.peek()==0)&&((int)s1.peek()==9))){
            bit.push(s2.pop());
            bit.push(s1.pop());
            while(!s2.empty()){
                buf.push(s2.pop());
            }
            while(!bit.empty()){
                s2.push(bit.pop());
            }
            while(!buf.empty()){
                s2.push(buf.pop());
            }
        }
        else{
            bit.push(s1.pop());
            bit.push(s2.pop());
        }
        p++;
        if(s1.empty()) return "Second "+p;
        if(s2.empty()) return "First "+p;
        return game();
    }

}
