
package dtrump;


public class Pila {
    private Lista arreglo = new Lista();

    public Pila() {
    }
    
    public void push(Materiales value){
        arreglo.push_back(value);
    }
    public boolean isEmpty(){
        if (arreglo.size()==0){
            return true;
        }
        return false;
    }
    public int getSize(){
        return arreglo.size();
    }
    public Materiales peek(){
        return (Materiales)(arreglo.at(arreglo.size()-1));
    }
    public void pop(){
        arreglo.erase(arreglo.size()-1);
    }
}
