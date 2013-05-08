package Simulator;
		
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import Commands.Command;
import DatapathComponents.Register;

public class Simulator {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome to MIPS Simulator!");
		System.out.println("Please Enter your code here(Enter an empty line to end):");
		
		StringTokenizer strT;
		String opcode, st, rt , dt;
		
		
		while(true) {
			strT = new StringTokenizer(br.readLine());
			
			if(!strT.hasMoreTokens()){
				break;
			}
			opcode = strT.nextToken();
			if(opcode.equals("add")) {
				try {
					st = strT.nextToken();
					rt = strT.nextToken();
					dt = strT.nextToken();
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}else if(opcode.equals("addi")) {
				
			}
		}
	}
}
