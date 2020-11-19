import java.util.ArrayList;
/**
 * Creates the Octrees.
 * 
 * This method is coppy from the method in the 
 * github folder "spoilers" and adapted to this 
 * implementation, so ill add them ass authors.
 * 
 * @author Daniel Otero Gomez, Rafael Mateus Carrion, Samuel David Ben Jacob Arango Henao
 * @version 4/11/2020 
 */
public class Octree{
    private double midLat, midLen, midAlt;
    
    /**
     * This method creates the octrees, evaluates the physical size of the node
     * and allows or not the creation of the next divisions. 
     * 
     * @param Node bee linked list of bees.
     * @param ArrayList<Double> mins minimum values of the coordenates of the bees.
     * @param double midLat latitude minimum value
     * @param double midLen length/longitude minimum value
     * @param double midAlt Altitude minum value.
     * 
     * @see hashing.
     * @see nuevoOctree.
     * @see choque.
     */
    public void octree (Node bees, ArrayList<Double> mins, double midLat, double midLen, double midAlt) {
        this.midLat = midLat;
        this.midLen = midLen;
        this.midAlt = midAlt;
        ArrayList<Node> octree = new ArrayList(8);

        for (int i=0;i<8;++i) {
            Node ab = new Node();
            octree.add(ab);
        }

        Node temp = bees.head;

        while(temp != null) {
            Bee abeja = temp.getData();
            int sector = hashing(abeja,mins);
            octree.get(sector).add(abeja);
            temp = temp.next;
        }

        double diagonal = Math.sqrt(Math.pow((midAlt)*111325,2) + Math.pow((midLen)*111325,2) + Math.pow((midAlt),2)); //Primera hipotenusa

        if (diagonal > 100) {
            for (int i = 0; i < 8 ; ++i) {
                if (octree.get(i).length() > 1) {
                    nuevoOctree(octree.get(i), mins, i);
                }
            }
        } else {
            for (int i = 0; i<8 ; ++i) {
                if (octree.get(i).length() > 0) choque(octree.get(i));
            }
        }

    }

    /**
     * This method asigns to each bee the next Octree node (sector)
     * in which are going to allocate
     * 
     * @param Bee abeja object of class bee.
     * @param ArrayList<Double> mins array list with the minimum values on the node
     * 
     * @return int number of the sector node asigned.
     */
    private int hashing(Bee abeja, ArrayList<Double> mins) {
        if (abeja.getLatitude() <= mins.get(0) + midLat) {
            if (abeja.getLength() <= mins.get(1) + midLen) {
                if (abeja.getAltitude() <= mins.get(2) + midAlt) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                if (abeja.getAltitude() <= mins.get(2) + midAlt) {
                    return 2;
                } else {
                    return 3;
                }
            }
        } else {
            if (abeja.getLength() <= mins.get(1) + midLen) {
                if (abeja.getAltitude() <= mins.get(2) + midAlt) {
                    return 4;
                } else {
                    return 5;
                }
            } else {
                if (abeja.getAltitude() <= mins.get(2) + midAlt) {
                    return 6;
                } else {
                    return 7;
                }
            }
        }
    }
    
    /**
     * Creates the new Octree nodes.
     * 
     * @param Node abejas Linked list of bees.
     * @param ArrayList<Double> mins ArrayList with the minimum values.
     * @param int sector octree where are going to be created the new nodes
     * 
     */
        public void nuevoOctree(Node abejas, ArrayList<Double> mins, int sector) {
        if (sector==0) {
            octree(abejas, mins, midLat / 2, midLen / 2, midAlt / 2);
        } else if (sector==1) {
            double nuevoAlt = mins.get(2) + midAlt;
            mins.remove(2);
            mins.add(2, nuevoAlt);
            octree(abejas, mins, midLat / 2, midLen / 2, midAlt / 2);
        } else if (sector==2) {
            double nuevoLen = mins.get(1) + midLen;
            mins.remove(1);
            mins.add(1, nuevoLen);
            octree(abejas, mins, midLat / 2, midLen / 2, midAlt / 2);
        } else if (sector==3) {
            double nuevoAlt = mins.get(2) + midAlt;
            mins.remove(2);
            mins.add(2, nuevoAlt);
            double nuevoLen = mins.get(1) + midLen;
            mins.remove(1);
            mins.add(1, nuevoLen);
            octree(abejas, mins, midLat / 2, midLen / 2, midAlt / 2);
        } else if (sector==4) {
            double nuevoAlt = mins.get(0) + midAlt;
            mins.remove(0);
            mins.add(0 , nuevoAlt);
            octree(abejas, mins, midLat / 2, midLen / 2, midAlt / 2);
        } else if (sector==5) {
            double nuevoLat = mins.get(0) + midLat;
            mins.remove(0);
            mins.add(0, nuevoLat);
            double nuevoAlt = mins.get(2) + midAlt;
            mins.remove(2);
            mins.add(2, nuevoAlt);
            octree(abejas, mins, midLat / 2, midLen / 2, midAlt / 2);
        } else if (sector==6) {
            double nuevoLat = mins.get(0) + midAlt;
            mins.remove(0);
            mins.add(0,nuevoLat);
            double nuevoLen = mins.get(1) + midLen;
            mins.remove(1);
            mins.add(1, nuevoLen);
            octree(abejas, mins, midLat / 2, midLen / 2, midAlt / 2);
        } else {
            double nuevoLat = mins.get(0) + midLat;
            mins.remove(0);
            mins.add(0, nuevoLat);
            double nuevoLen = mins.get(1) + midLen;
            mins.remove(1);
            mins.add(1, nuevoLen);
            double nuevoAlt = mins.get(2) + midAlt;
            mins.remove(2);
            mins.add(2, nuevoAlt);
            octree(abejas, mins, midLat / 2, midLen / 2, midAlt / 2);
        }
    }

    /**
     * Prints if there are more than 1 bee in a leaf of the Octree.
     * 
     * @param Node bees Linked list with the bees in the same leaf.
     */
    public void choque(Node bees) {
        Node temp = bees.head;
        while(temp != null){
            System.out.println(temp.getData().getLatitude() + "," + temp.getData().getLength() + "," + temp.getData().getAltitude());
            temp = temp.next;
        }
    }
}
