import java.util.Scanner;
public class os{
    public static void main(String[] args){
        String Question1 = "Explain any 4 Commands of Linux?";
        System.out.println(Question1);
        //Command-1: ls - list directory contents
        //Command-2: cd – change working directory
        //Command-3: mkdir – make a new directory or folder in the current location
        //Command-4: rm – remove files and directories
        int answer=0;
        while (answer!=5) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter your choice:");
                try {
                    answer = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        continue;}
            }
            switch (answer) {
                        case 1 :
                        System.out.println("\nThe command 'ls' is used to display all the file names, including hidden ones.");
                        break;
                        case 2 :
                        System.out.println("\nThe command 'cd' stands for Change Directory");
                        System.out.println("- It allows you to move from one directory to another within the same filesystem hierarchy.\n" + "- You can use it with either absolute paths like /home/user\n"+ "(which starts at root level), \nor relative paths which start from wherever "+ "you currently are,\ne.g.,../Documents/. ");
                        break;
                        case 3 :
                        System.out.println("\nThe'mkdir' command creates a new directory inside an existing parent directory using its name as argument:\nmkdir <directory_name>");
                        break;
                        case 4 :
                        System.out.println("\nThe 'rm' command removes specified files or folders:"+ "\nrmdir [options]... DIRECTORY...\nremove [-f | --force] [--interactive | --no-preserve-root]\n[-r -R,--recursive][--help]");
                        break;
                        default:
                        System.out.println("Invalid input! Please enter valid number between 1 & 4 inclusive!");
                        break;
                        }}
                        public static void main() throws Exception{
                            Menu menu=new Menu();
                            Scanner scanner= new Scanner(System.in);
                            while(!menu.isExit){
                                try{
                                    int choice = Integer.parseInt((scanner.nextLine()));
                                    if (!menu.isValidChoice(choice))
                                    throw new IllegalArgumentException("Invalid input, please enter a valid number.");
                                    throw new IllegalArgumentException("Invalid input!");
                                    switch (choice) {
                                        //case statements go here
                                        case -1://exit
                                        menu.setExitStatus(true);//setting exit status to true
                                        return;//returning from the method, which will terminate it's execution
                                        return;//returning from the method, terminating program execution
                                        case 0://option A
                                        //code for optionA goes here
                                        break;
                                        case 1://option B
                                        // code for optionB goes here
                                        break;
                                        /* add more cases as needed */
                                        }
                                        }catch(NumberFormatException e){
                                            continue;} catch (IllegalArgumentException ex) {//handling invalid inputs
                                                System.out.println("\nPlease enter a valid integer value.");
                                                } catch (IllegalArgumentException ex) {//handling invalid inputs
                                                    } catch (IllegalArgumentException ex) {
                                                        System.err.println(ex.getMessage());
                                                        }}
                                                        public boolean getExitStatus(){
                                                            return this._isExited;}
                                                            private void setExitStatus(boolean flag){
                                                                _isExited =flag ;}
                                                                /**
                                                                 **/
                                                                


    }
    
 }

// what is deadlock in Operating System?
// A deadlock is a situation in which two or more processes are waiting for each other to release a resource that they are holding. This can happen when two processes are both trying to access the same resource, and neither one is willing to give it up.

// Deadlocks can occur in any operating system, but they are more common in multi-threaded programs. This is because threads can share resources, and if two threads are both trying to access the same resource, they can deadlock each other.

// There are several ways to prevent deadlocks. One way is to use a deadlock avoidance algorithm. This algorithm ensures that no two processes can ever be waiting for each other to release a resource. Another way to prevent deadlocks is to use a deadlock detection algorithm. This algorithm detects deadlocks when they occur, and then it takes steps to break the deadlock.

// In Java, there are several ways to prevent deadlocks. One way is to use the synchronized keyword. This keyword ensures that only one thread can access a shared resource at a time. Another way to prevent deadlocks is to use the wait() and notify() methods. These methods allow threads to wait for each other to release a resource.

// If you are writing a multi-threaded program in Java, it is important to be aware of the possibility of deadlocks. There are several tools available to help you prevent deadlocks, such as deadlock avoidance algorithms and deadlock detection algorithms.A deadlock is a situation in which two or more processes are waiting for each other to release a resource that they are holding. This can happen when two processes are both trying to access the same resource, and neither one is willing to give it up.

// Deadlocks can occur in any operating system, but they are more common in multi-threaded programs. This is because threads can share resources, and if two threads are both trying to access the same resource, they can deadlock each other.

// There are several ways to prevent deadlocks. One way is to use a deadlock avoidance algorithm. This algorithm ensures that no two processes can ever be waiting for each other to release a resource. Another way to prevent deadlocks is to use a deadlock detection algorithm. This algorithm detects deadlocks when they occur, and then it takes steps to break the deadlock.

// In Java, there are several ways to prevent deadlocks. One way is to use the synchronized keyword. This keyword ensures that only one thread can access a shared resource at a time. Another way to prevent deadlocks is to use the wait() and notify() methods. These methods allow threads to wait for each other to release a resource.

// If you are writing a multi-threaded program in Java, it is important to be aware of the possibility of deadlocks. There are several tools available to help you prevent deadlocks, such as deadlock avoidance algorithms and deadlock detection algorithms.