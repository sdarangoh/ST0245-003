import java.util.ArrayList;
/**
 * Write a description of class Algorithm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Algorithm{
    Reader r = new Reader();
    private Tree tree =  new Tree(r.list);
    ArrayList<CART.Assignment> choos = new ArrayList();
    Node empty = new Node();
    public Algorithm(String archive){
        CART chosens = new CART(archive);
        choos = chosens.getArr(); 
        Tree newTree = desitions();
        empty = getLeafs(newTree, empty);
        compare(empty, r.compare);
        r.reset();
    }

    public Tree desitions(){
        return desitionsAux(tree, 0);
    }
    int rep = 0;

    public Tree desitionsAux(Tree arbol, int rep){   
        Node succes = new Node();
        Node fail = new Node();
        CART.Assignment dec = max(choos);
        choos.remove(dec);
        if(rep >= 5 || dec == null){
            return arbol;
        }
        else{
            if(dec.hom.equals("Language")){
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
                desitionsAux(arbol.right, rep = rep + 1);
                Node temp1 = arbol.getListOfData().head;
                while(temp1 != null){
                    if(temp1.getData().getLeng() == 0){
                        temp1.getData().resetSucces();
                        fail.add(temp1.getData());

                    }
                    temp1 = temp1.next;
                }
                desitionsAux(arbol.left, rep = rep + 1);
            }            
            else if(dec.hom.equals("English")){
                arbol.left = new Tree(fail);
                arbol.right = new Tree(succes);
                Node temp = arbol.getListOfData().head;
                while(temp != null){
                    if(temp.getData().getEng() > 0){
                        temp.getData().setSucces();
                        succes.add(temp.getData());

                    }

                    temp = temp.next;
                }
                desitionsAux(arbol.right, rep = rep + 1);
                Node temp1 = arbol.getListOfData().head;
                while(temp1 != null){
                    if(temp1.getData().getEng() == 0){
                        temp1.getData().resetSucces();
                        fail.add(temp1.getData());

                    }
                    temp1 = temp1.next;
                }
                desitionsAux(arbol.left, rep = rep + 1);

            }
            else if(dec.hom.equals("Physics")){
                Node temp = arbol.getListOfData().head;
                arbol.left = new Tree(fail);
                arbol.right = new Tree(succes);
                while(temp != null){
                    if(temp.getData().getPhy() > 0){
                        temp.getData().setSucces();
                        succes.add(temp.getData());

                    }

                    temp = temp.next;
                }
                desitionsAux(arbol.right, rep = rep + 1);
                Node temp1 = arbol.getListOfData().head;
                while(temp1 != null){
                    if(temp1.getData().getPhy() == 0){
                        temp1.getData().resetSucces();
                        fail.add(temp1.getData());

                    }
                    temp1 = temp1.next;
                }
                desitionsAux(arbol.left, rep = rep + 1);

            }
            else if(dec.hom.equals("Mathematics")){
                Node temp = arbol.getListOfData().head;
                arbol.left = new Tree(fail);
                arbol.right = new Tree(succes);
                while(temp != null){
                    if(temp.getData().getMath() > 0){
                        temp.getData().setSucces();
                        succes.add(temp.getData());

                    }

                    temp = temp.next;
                }
                desitionsAux(arbol.right, rep = rep + 1);
                Node temp1 = arbol.getListOfData().head;
                while(temp1 != null){
                    if(temp1.getData().getMath() == 0){
                        temp1.getData().resetSucces();
                        fail.add(temp1.getData());

                    }
                    temp1 = temp1.next;
                }
                desitionsAux(arbol.left, rep = rep + 1);

            }
            else if(dec.hom.equals("Filosophy")){
                arbol.left = new Tree(fail);
                arbol.right = new Tree(succes);
                Node temp = arbol.getListOfData().head;
                while(temp != null){
                    if(temp.getData().getFil() > 0){
                        temp.getData().setSucces();
                        succes.add(temp.getData());

                    }

                    temp = temp.next;
                }
                desitionsAux(arbol.right, rep = rep + 1);
                Node temp1 = arbol.getListOfData().head;
                while(temp1 != null){
                    if(temp1.getData().getFil() == 0){
                        temp1.getData().resetSucces();
                        fail.add(temp1.getData());

                    }
                    temp1 = temp1.next;
                }
                desitionsAux(arbol.left, rep = rep + 1);

            }
            else if(dec.hom.equals("Social")){
                arbol.left = new Tree(fail);
                arbol.right = new Tree(succes);
                Node temp = arbol.getListOfData().head;
                while(temp != null){
                    if(temp.getData().getSoci() > 0){
                        temp.getData().setSucces();
                        succes.add(temp.getData());

                    }

                    temp = temp.next;
                }
                desitionsAux(arbol.right, rep = rep + 1);
                Node temp1 = arbol.getListOfData().head;
                while(temp1 != null){
                    if(temp1.getData().getSoci() == 0){
                        temp1.getData().resetSucces();
                        fail.add(temp1.getData());

                    }
                    temp1 = temp1.next;
                }
                desitionsAux(arbol.left, rep = rep + 1);

            }
            else if(dec.hom.equals("Chemestry")){
                arbol.left = new Tree(fail);
                arbol.right = new Tree(succes);
                Node temp = arbol.getListOfData().head;
                while(temp != null){
                    if(temp.getData().getChem() > 0){
                        temp.getData().setSucces();
                        succes.add(temp.getData());

                    }

                    temp = temp.next;
                }
                desitionsAux(arbol.right, rep = rep + 1);
                Node temp1 = arbol.getListOfData().head;
                while(temp1 != null){
                    if(temp1.getData().getChem() == 0){
                        temp1.getData().resetSucces();
                        fail.add(temp1.getData());

                    }
                    temp1 = temp1.next;
                }
                desitionsAux(arbol.left, rep = rep + 1);

            }
            else if(dec.hom.equals("Biology")){
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
                desitionsAux(arbol.right, rep = rep + 1);
                Node temp1 = arbol.getListOfData().head;
                while(temp1 != null){
                    if(temp1.getData().getBio() == 0){
                        temp1.getData().resetSucces();
                        fail.add(temp1.getData());

                    }
                    temp1 = temp1.next;
                }
                desitionsAux(arbol.left, rep = rep + 1);

            }
            else if(dec.hom.equals("Area")){
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
                desitionsAux(arbol.right, rep = rep + 1);
                Node temp1 = arbol.getListOfData().head;
                while(temp1 != null){
                    if(temp1.getData().getArea() == 0){
                        temp1.getData().resetSucces();
                        fail.add(temp1.getData());
                    }
                    temp1 = temp1.next;
                }
                desitionsAux(arbol.left, rep = rep + 1);

            }
            return arbol; 
        }        
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