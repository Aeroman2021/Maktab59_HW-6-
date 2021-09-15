package Homework6.Service;

public class Login {


    public boolean userNameAndPassChecker(String userName, String pass) {
        Register register = new Register();
        Register[] registers = register.getRegisters();
        for (int i = 0; i < registers.length; i++) {
            if (registers[i] != null && registers[i].getPassword().equals(pass) &&
                    registers[i].getUserName().equals(userName)) ;
            return true;
        }
        return false;
    }
}
