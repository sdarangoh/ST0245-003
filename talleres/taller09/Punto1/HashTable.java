
/**
 * Write a description of class HashTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashTable{
    private Node table;
    public Node createTable(int size){
        table = new Node(size);
        for(int i = 0; i < size; i++){
            table.insertStart(null);
        }
        return table;
    }
    
        public int HashFunction(String key, int size){
        int index;
        long module = size;
        String ind = "";
        if(key.length() >= 6){
            for(int i = 0; i < 6; i++){
                ind = ind + ((int) key.charAt(i));
            }
        }
        else{
            for(int i = 0; i < key.length(); i++){
                ind = ind + ((int) key.charAt(i));
            }
        }
        ind = String.valueOf(Long.parseLong(ind)%module);
        index = Integer.parseInt(ind);
        return index;
    }

    public void addToHashTable(Node table, PersonaNumero data, int index){
        while(table.exist(index)){
            if(index + 1 == table.getLength()){
                index = -1;
            }
            index = index + 1;
        }
        table.insert(data, index);
    }
    
    public String search(Node table, String nombre){
        Node temp = table.head;
        String numero = "";
        while(temp != null){
            if(temp.getData().getPersona().equals(nombre)){
                numero = temp.getData().getNumero();
            }
            temp = temp.next;
        }
        return numero;
    }
}
