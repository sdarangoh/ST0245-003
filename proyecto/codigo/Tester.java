import java.util.ArrayList;
/**
 * Write a description of class tRAINER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester{
    Node n = new Node();
    Reader r = new Reader();
    private Tree tree =  new Tree(r.list);
    Node empty = new Node();
    public Tester(String archive){
        CART chosens = new CART(archive);
        Tree newTree = testDesitions();
        empty = getLeafs(newTree, empty);
        compare(empty, r.compare);
        r.reset();
    }
 
    public Tree testDesitions(){
        return testDesitionsAux(tree, 1);
    }

    public Tree testDesitionsAux(Tree arbol, int i){   
        Node succes = new Node();
        Node fail = new Node();
        if(i == 1){
            Node temp = arbol.getListOfData().head;
            arbol.left = new Tree(fail);
            arbol.right = new Tree(succes);
            while(temp != null){
                if(temp.getData().getArea() > 0){
                    temp.getData().setSucces();
                    succes.add(temp.getData());

                }
                temp = temp.next;
            }
            testDesitionsAux(arbol.right, 2);
            Node temp1 = arbol.getListOfData().head;
            while(temp1 != null){
                if(temp1.getData().getArea() == 0){
                    temp1.getData().resetSucces();
                    fail.add(temp1.getData());

                }
                temp1 = temp1.next;
            }
            testDesitionsAux(arbol.left, 2);
        }
        else if (i == 2){
            Node temp = arbol.getListOfData().head;
            arbol.left = new Tree(fail);
            arbol.right = new Tree(succes);
            while(temp != null){
                if(temp.getData().getLeng() > 0){
                    temp.getData().setSucces();
                    succes.add(temp.getData());

                }

                temp = temp.next;
            }
            testDesitionsAux(arbol.right, 3);
            Node temp1 = arbol.getListOfData().head;
            while(temp1 != null){
                if(temp1.getData().getLeng() == 0){
                    temp1.getData().resetSucces();
                    fail.add(temp1.getData());

                }
                temp1 = temp1.next;
            }
            testDesitionsAux(arbol.left, 3);
        }
        else if (i == 3){
            Node temp = arbol.getListOfData().head;
            arbol.left = new Tree(fail);
            arbol.right = new Tree(succes);
            while(temp != null){
                if(temp.getData().getChem() > 0){
                    temp.getData().setSucces();
                    succes.add(temp.getData());

                }

                temp = temp.next;
            }
            testDesitionsAux(arbol.right, 4);
            Node temp1 = arbol.getListOfData().head;
            while(temp1 != null){
                if(temp1.getData().getChem() == 0){
                    temp1.getData().resetSucces();
                    fail.add(temp1.getData());

                }
                temp1 = temp1.next;
            }
            testDesitionsAux(arbol.left, 4);
        }
        else if (i == 4){
            Node temp = arbol.getListOfData().head;
            arbol.left = new Tree(fail);
            arbol.right = new Tree(succes);
            while(temp != null){
                if(temp.getData().getBio() > 0){
                    temp.getData().setSucces();
                    succes.add(temp.getData());

                }

                temp = temp.next;
            }
            testDesitionsAux(arbol.right, 5);
            Node temp1 = arbol.getListOfData().head;
            while(temp1 != null){
                if(temp1.getData().getBio() == 0){
                    temp1.getData().resetSucces();
                    fail.add(temp1.getData());

                }
                temp1 = temp1.next;
            }
            testDesitionsAux(arbol.left, 5);
        }
        return arbol;
    }        

    public int compare(Node empty, ArrayList<StudentCompare> com){
        int n = 0;
        Node temp = empty.head;
        while(temp != null){
            if(temp.getData() == null){
                break;
            }
            else if(com.get(temp.getData().getOrder()).getSucces() == 1 && temp.getData().getSucces() >= 1){
                n++;
            }
            else if(com.get(temp.getData().getOrder()).getSucces() == 0 && temp.getData().getSucces() == 0){
                n++;
            }
            temp = temp.next;
        }

        return n;
    }

    public CART.Assignment max(ArrayList<CART.Assignment> as){
        CART.Assignment max = null;
        int n = 0;
        for(CART.Assignment a : as){
            if(a.n > n){
                n = a.n;
                max = a;
            }
        }
        return max;
    }

    public Node getLeafs(Tree arbol, Node empty){
        if(arbol.left == null && arbol.right == null){
            Node temp = arbol.getListOfData().head;
            while(temp != null){
                empty.add(temp.getData());
                temp = temp.next;
            }

        }
        else{
            if(arbol.left != null){
                getLeafs(arbol.left, empty);
            }

            if(arbol.right != null){
                getLeafs(arbol.right, empty);
            }

        }
        return empty;
    }
}
