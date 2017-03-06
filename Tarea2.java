/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;
import java.util.*;
/**
 *
 * @author Víctor
 */


public class Tarea2 {

    /**
     * @param args the command line arguments
     */
   /* public static void displayPathtoPrincess(int N,char[] in){
         
        ArrayList<ArrayList<String>> mtx=new ArrayList(); 
        ArrayList<Integer> posP= new ArrayList();
        for (int i=0;i<N;i++){
            
            ArrayList line=new ArrayList();
            for(int j=0;j<N;j++){
                
                if (in[i*N+j]=='p'){
                    posP.add(i);
                    posP.add(j);
                }
                line.add((in[i*N+j]));
            }
            mtx.add(line);
        }
        
         System.out.println(path(mtx,N,posP));
        
    }
     
     private static String path (ArrayList<ArrayList<String>> mtx, int N, ArrayList<Integer> posP){
        String sol="";
        int x=(N-1)/2;
        int y=(N-1)/2;
        if (y<posP.get(0)){
            while (y!=posP.get(0)){
                y+=1;
                sol=sol.concat("Down\n");
            }
        }
        if (y>posP.get(0)){
            while (y!=posP.get(0)){
                y-=1;
                sol=sol.concat("Up\n");
            }
        }
        if (x<posP.get(1)){
            while (x!=posP.get(1)){
                x+=1;
                sol=sol.concat("Right\n");
            }
        }
        if (x>posP.get(1)){
            while (x!=posP.get(1)){
                x-=1;
                sol=sol.concat("Left\n");
            }
        }
        
        return sol;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan= new Scanner(System.in);
        String input="";
        ArrayList in= new ArrayList();
        int n=0;
        
        System.out.println("ingrese un valor de N, para una matriz NxN");
        input=scan.nextLine();
        n=Integer.parseInt(input);
        System.out.println("ingrese la matriz (p: princesa,m:bot,-:celda vacia)");
        int temp =n;
        input="";
        while (temp>0){
            input=input.concat(scan.nextLine());
            temp--;
        }
        displayPathtoPrincess(n, input.toCharArray());
        
    }
    */
    
    
    public static void next_move (int posr, int posc, String[] board){
        int[] posD = findD(board);
        
        if(posD[0]==posr && posD[1]==posc){
            System.out.println("CLEAN");
        }
        else if(posD[0]<posr){
            System.out.println("UP");
        }
        else if(posD[0]>posr){
            System.out.println("DOWN");
        }
        else if(posD[1]<posc){
            System.out.println("LEFT");
        }else if(posD[1]<posc){
            System.out.println("RIGT");
        }
        
        else
            System.out.println("CLEAN");
        
    }
    
    private static int[] findD( String[] board){
        int[] pos=new int[2];
        for(int i=0; i<5;i++){
            for(int j=0; j<5;j++){
                if (board[i].charAt(j)=='d'){
                    pos[0]=i;
                    pos[1]=j;
                }
            }
        }
        return pos;
    }
    
    
    
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int[] pos = new int[2];
        String[] board = new String[5];
        for (int i = 0; i < 2; i++)
            pos[i] = in.nextInt();
        for (int i = 0; i < 5; i++)
            board[i] = in.next();
        
        next_move(pos[0],pos[1],board);
    }
}
