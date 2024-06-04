package Tasca1.Nivel1;

import java.util.ArrayList;

public class SingletonIngenuo {
    private static SingletonIngenuo instance;
    private ArrayList<String> commands;
    private SingletonIngenuo(){
        commands = new ArrayList<>();
    }
    public static SingletonIngenuo getInstance(){
        if(instance == null){
            instance = new SingletonIngenuo();
        }
        return instance;
    }
    public void addElement(String element){
        commands.add(element);
    }
    public void removeElement(){
        if(commands.isEmpty()){
            System.out.println("NO HAY COMANDOS PARA DESHACER");
        }else {
            //remove.last
            commands.remove(commands.size()-1);
        }
    }
    public void allCommands(){
        commands.forEach(System.out::println);
    }

}
