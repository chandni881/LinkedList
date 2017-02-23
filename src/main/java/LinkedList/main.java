package LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class main {
    public static void main( String[] args )
    {
        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        LinkedList<Integer> ll2 = new LinkedList<Integer>();
        ll1.add(1);
        ll1.add(3);
        ll1.add(5);
        ll2.add(2);
        ll2.add(3);
        ll2.add(4); 
        ll2.add(6);
        System.out.println("List 1 : " +ll1);
        System.out.println("List 2 : " +ll2);
        System.out.println(merge(ll1,ll2));
        
        System.out.println("List 1 : " +ll1);
        System.out.println("List 2 : " +ll2);
    }

    private static LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2){
        Iterator<Integer> i1= list1.iterator();
        Iterator<Integer> i2= list2.iterator();
        
        Integer a = i1.next();
        Integer b = i2.next();
        
        LinkedList<Integer> resultList = new LinkedList<Integer>();
        if(list1.isEmpty()){
            return list2;
        }
        if(list2.isEmpty()){
            return list1;
        }
   /*     while(i1.hasNext() && i2.hasNext()){
           if(a < b){
                resultList.addLast(a);
                i1.remove();
                a = i1.next();
            }
            resultList.addLast(b);
            i2.remove();
            b=i2.next();
        }
        Iterator<Integer> leftOver = i1.hasNext() ? i1 : i2;
        
        while(leftOver.hasNext()){
            resultList.addLast(leftOver.next());
            leftOver.remove();
        }
        */
        do {
          if(list1.peek() < list2.peek()){
              resultList.addLast(list1.removeFirst());
          }
          else{
              resultList.addLast(list2.removeFirst()); 
          }
        } while (!list1.isEmpty() && !list2.isEmpty());
        
        LinkedList<Integer> li = list1.isEmpty() ? list2 : list1;

        while(!li.isEmpty()){
            resultList.addLast(li.removeFirst());
        }
        
        return resultList;
    }
        
        return resultList;
    }

    }

