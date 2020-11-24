import java.util.ArrayList;
public class CART{
    Reader r = new Reader();

    public class Assignment{
        public String hom;
        public int n;
        public Assignment(String hom, int n){
            this.hom = hom;
            this.n = n;
        }
    }

    private ArrayList<Assignment> assigns = new ArrayList();
    public CART(String archive){
        Node s = r.reader(archive);
        area(s);
        eng(s);
        leng(s);
        math(s);
        chem(s);
        bio(s);
        soci(s);
        fil(s);
        phy(s);
    }

    public void area(Node s){
        int n = 0;
        Node temp = s.head;
        while(temp != null){
            if(temp.getData().getArea() > 0){
                n++;
            }          
            temp = temp.next;
        }
        if((n*100)/s.length() > 60){
            Assignment as = new Assignment("Area", n);
            assigns.add(as);
        }
    }

    public void eng(Node s){
        int n = 0;
        Node temp = s.head;
        while(temp != null){
            if(temp.getData().getEng() > 0){
                n++;
            }   
            temp = temp.next;
        }
        if((n*100)/s.length() > 60){
            Assignment as = new Assignment("English", n);
            assigns.add(as);
        }
    }

    public void leng(Node s){
        int n = 0;
        Node temp = s.head;
        while(temp != null){
            if(temp.getData().getLeng() > 0){
                n++;
            }      
            temp = temp.next;
        }
        if((n*100)/s.length() > 60){
            Assignment as = new Assignment("Language", n);
            assigns.add(as);
        }

    }

    public void bio(Node s){
        int n = 0;
        Node temp = s.head;
        while(temp != null){
            if(temp.getData().getBio() > 0){
                n++;
            }      
            temp = temp.next;
        }
        if((n*100)/s.length() > 60){
            Assignment as = new Assignment("Biology", n);
            assigns.add(as);
        }

    }

    public void math(Node s){
        int n = 0;
        Node temp = s.head;
        while(temp != null){
            if(temp.getData().getMath() > 0){
                n++;
            }
            temp = temp.next;
        }
        if((n*100)/s.length() > 60){
            Assignment as = new Assignment("Mathematics", n);
            assigns.add(as);
        }
    }

    public void chem(Node s){
        int n = 0;
        Node temp = s.head;
        while(temp != null){
            if(temp.getData().getChem() > 0){
                n++;
            }       
            temp = temp.next;
        }
        if(((n*100)/s.length()) > 60){
            Assignment as = new Assignment("Chemestry", n);
            assigns.add(as);
        }
    }

    public void fil(Node s){
        int n = 0;
        Node temp = s.head;
        while(temp != null){
            if(temp.getData().getFil() > 0){
                n++;
            }         
            temp = temp.next;
        }
        if(((n*100)/s.length()) > 60){
            Assignment as = new Assignment("Filosophy", n);
            assigns.add(as);
        }
    }

    public void soci(Node s){
        int n = 0;
        Node temp = s.head;
        while(temp != null){
            if(temp.getData().getSoci() > 0){
                n++;
            }         
            temp = temp.next;
        }
        if(((n*100)/s.length()) > 60){
            Assignment as = new Assignment("Social", n);
            assigns.add(as);
        }
    }

    public void phy(Node s){
        int n = 0;
        Node temp = s.head;
        while(temp != null){
            if(temp.getData().getPhy() > 0){
                n++;
            }  
            temp = temp.next;
        }
        if(((n*100)/s.length()) > 60){
            Assignment as = new Assignment("Physics", n);
            assigns.add(as);
        }
    }

    public ArrayList<Assignment> getArr(){
       
        return assigns;
    }

    public void decition(ArrayList<StudentCompare> a, Node s){
        for (Assignment as: assigns){           
            if(as.hom.equals("Language")){
                int n = 0;
                Node temp = s.head;
                while(temp != null){
                    if(temp.getData().getLeng() == a.get(temp.getData().getOrder()).getSucces()){
                        n ++;
                    }
                    temp = temp.next;
                }
            }            
            if(as.hom.equals("English")){
                int n = 0;
                Node temp = s.head;
                while(temp != null){
                    if(temp.getData().getEng() == a.get(temp.getData().getOrder()).getSucces()){
                        n ++;
                    }
                    temp = temp.next;
                }                
            }
            if(as.hom.equals("Physics")){
                int n = 0;
                Node temp = s.head;
                while(temp != null){
                    if(temp.getData().getPhy() == a.get(temp.getData().getOrder()).getSucces()){
                        n ++;
                    }
                    temp = temp.next;
                }
            }
            if(as.hom.equals("Mathematics")){
                int n = 0;
                Node temp = s.head;
                while(temp != null){
                    if(temp.getData().getMath() == a.get(temp.getData().getOrder()).getSucces()){
                        n ++;
                    }
                    temp = temp.next;
                }
            }
            if(as.hom.equals("Filosophy")){
                int n = 0;
                Node temp = s.head;
                while(temp != null){
                    if(temp.getData().getFil() == a.get(temp.getData().getOrder()).getSucces()){
                        n ++;
                    }
                    temp = temp.next;
                }
            }
            if(as.hom.equals("Social")){
                int n = 0;
                Node temp = s.head;
                while(temp != null){
                    if(temp.getData().getSoci() == a.get(temp.getData().getOrder()).getSucces()){
                        n ++;
                    }
                    temp = temp.next;
                }
            }
            if(as.hom.equals("Chemestry")){
                int n = 0;
                Node temp = s.head;
                while(temp != null){
                    if(temp.getData().getChem() == a.get(temp.getData().getOrder()).getSucces()){
                        n ++;
                    }
                    temp = temp.next;
                }
            }
            if(as.hom.equals("Biology")){
                int n = 0;
                Node temp = s.head;
                while(temp != null){
                    if(temp.getData().getBio() == a.get(temp.getData().getOrder()).getSucces()){
                        n ++;
                    }
                    temp = temp.next;
                }
            }
            if(as.hom.equals("Area")){
                int n = 0;
                Node temp = s.head;
                while(temp != null){
                    if(temp.getData().getArea() == a.get(temp.getData().getOrder()).getSucces()){
                        n ++;
                    }
                    temp = temp.next;
                }
            }
        }

    }
}