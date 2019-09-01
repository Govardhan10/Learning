package codechef.practice;/* package codechef; // don't place package name! */

import java.util.Stack;

class CodeChef {

    private Link head;

    private void push(int data){
        if(head == null){
            head = new Link(data);
        }else{
            Link newLink = new Link(data);
            newLink.pointer = head;
            head = newLink;
        }
    }

    private void append(int data){
        Link tLink = head;
        if(tLink == null){
            head = new Link(data);
        }else{
            while(tLink.pointer != null){
                tLink = tLink.pointer;
            }
            tLink.pointer = new Link(data);
        }
    }

    private void appendAfter(int currNode,int data){
        if(head == null){
            return;
        }else if(head.data == currNode){
            push(data);
        }else {
            Link curr = head;
            while(curr.pointer != null){
                if(curr.data == currNode)
                    break;
                else
                    curr = curr.pointer;
            }
            Link newLink = new Link(data);
            Link nextLink = curr.pointer;
            curr.pointer = newLink;
            newLink.pointer = nextLink;
        }
    }

    private void printList()
    {
        Link tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.pointer;
        }
        System.out.println();
    }

    private void delete(int data){
        Link tLink = head;
        if(tLink.data == data){
            head = head.pointer;
        }else{
            while(tLink.pointer!=null){
                if(tLink.pointer.data == data){
                    tLink.pointer = tLink.pointer.pointer;
                    break;
                }
                tLink = tLink.pointer;
            }
        }
    }


    private void deleteAt(int position){
        int count = 0;
        Link temp = head;
        Link prev = null;
        if(position == 0){
            head = head.pointer;
        }else{
            while(temp!=null && count!=position){
                prev = temp;
                temp = temp.pointer;
                count++;
            }
            prev.pointer = temp.pointer;
        }
    }

    private int rCount(){
        Link temp = head;
        return rNodes(temp);
    }

    private int rNodes(Link temp){
        if(temp!=null){
            return 1+rNodes(temp.pointer);
        }else{
            return 0;
        }
    }

    private int nodesCount() {
        Link temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.pointer;
        }
        return count;
    }

    private boolean searchIterative(int value){
        Link temp = head ;
        while(temp!=null) {
            if (temp.data == value){
                break;
            }
            temp = temp.pointer;
        }
        return temp==null ? false : true;
    }

    private boolean rSearch(int value){
        return recurSearch(value,head);
    }

    private boolean recurSearch(int value, Link temp){
        if(temp==null){
            return false;
        }else{
            if(temp.data==value){
                return true;
            }else{
                return recurSearch(value,temp.pointer);
            }
        }
    }

    public static void main(String args[]){

        CodeChef cc = new CodeChef();
        cc.head = new Link(3);
        cc.push(2);
        cc.append(5);
        cc.appendAfter(3,4);
        cc.push(1);
        cc.append(6);
        cc.delete(6);
        cc.deleteAt(2);
        cc.printList();
        System.out.println(cc.nodesCount());
        System.out.println(cc.rCount());
        System.out.println(cc.searchIterative(4));
        System.out.println(cc.rSearch(1));
    }
}
