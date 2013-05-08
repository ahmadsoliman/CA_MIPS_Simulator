package Simulator;
		
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import Commands.IFormatCommand;
import Commands.RFormatCommand;
import Commands.add;
import Commands.addi;
import Commands.beq;
import Commands.bne;
import Commands.slt;
import Commands.sub;
import DatapathComponents.CPU;
import DatapathComponents.Register;

public class Simulator {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Welcome to MIPS Simulator!");
		System.out
				.println("Please Enter your code here(Enter an empty line to end):");

		StringTokenizer strT;
		String opcode, st, rt , dt;
		CPU cpu = CPU.getCPU();

		while(true) {
			strT = new StringTokenizer(br.readLine());

			if (!strT.hasMoreTokens()) {
				break;
			}
			opcode = strT.nextToken().toLowerCase();
			if (opcode.equals("add")) {
				try {
					dt = strT.nextToken().toLowerCase();
					st = strT.nextToken().toLowerCase();
					rt = strT.nextToken().toLowerCase();
					Register[] regs = RFormatCommand.prepareCommand(dt, st, rt);
					if (regs == null)
						continue;
					cpu.getCommands().add(new add(regs[0], regs[1], regs[2]));
				} catch (Exception e) {
					// TODO: handle exception
				}
			} else if (opcode.equals("sub")) {
				try {
					dt = strT.nextToken().toLowerCase();
					st = strT.nextToken().toLowerCase();
					rt = strT.nextToken().toLowerCase();
					Register[] regs = RFormatCommand.prepareCommand(dt, st, rt);
					if (regs == null)
						continue;
					cpu.getCommands().add(new sub(regs[0], regs[1], regs[2]));
				} catch (Exception e) {
					// TODO: handle exception
				}
			} else if (opcode.equals("slt")) {
				try {
					dt = strT.nextToken();
					st = strT.nextToken();
					rt = strT.nextToken();
					Register[] regs = RFormatCommand.prepareCommand(dt, st, rt);
					if (regs == null)
						continue;
					cpu.getCommands().add(new slt(regs[0], regs[1], regs[2]));
				} catch (Exception e) {
					// TODO: handle exception
				}
			} else if (opcode.equals("addi")) {
				try {
					dt = strT.nextToken();
					st = strT.nextToken();
					rt = strT.nextToken();
					Register[] regs = IFormatCommand.prepareCommand(dt, st);
					if (regs == null)
						continue;
					cpu.getCommands().add(new addi(regs[0], regs[1],Integer.parseInt(rt)));
				} catch (Exception e) {
					// TODO: handle exception
				}
			} else if (opcode.equals("bne")) {
				try {
					dt = strT.nextToken();
					st = strT.nextToken();
					rt = strT.nextToken();
					Register[] regs = IFormatCommand.prepareCommand(dt, st);
					if (regs == null)
						continue;
					
					cpu.getCommands().add(new bne(regs[0], regs[1], cpu.getLabelFile().getLabel(rt)));
				} catch (Exception e) {
					// TODO: handle exception
				}
			} else if (opcode.equals("beq")) {
				try {
					dt = strT.nextToken();
					st = strT.nextToken();
					rt = strT.nextToken();
					Register[] regs = IFormatCommand.prepareCommand(dt, st);
					if (regs == null)
						continue;
					
					cpu.getCommands().add(new beq(regs[0], regs[1], cpu.getLabelFile().getLabel(rt)));
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
}
