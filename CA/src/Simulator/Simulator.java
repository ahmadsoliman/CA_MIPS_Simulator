package Simulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import Commands.*;
import DatapathComponents.CPU;
import DatapathComponents.Label;
import DatapathComponents.Register;

public class Simulator {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer strT;
		CPU cpu = CPU.getCPU();

		System.out.println("Welcome to MIPS Simulator!");
		while (true) {
			try {
				System.out
						.println("Please enter the memory address for code to start from:");
				cpu.setMemStart(Integer.parseInt(br.readLine()));
				break;
			} catch (Exception e) {
			}
		}

		System.out
				.println("Please enter your code here(Enter an empty line to end):");

		while (true) {
			String in = br.readLine();
			if (in.contains(":")) {
				String[] comps = in.split(":");
				cpu.getLabelFile().setLabel(comps[0],
						new Label(comps[0], cpu.getAddress()));
				strT = new StringTokenizer(comps[1].replace(',', ' '));
				if (!strT.hasMoreTokens()) {
					continue;
				}
				readCommand(strT, cpu);
			} else {
				strT = new StringTokenizer(in.replace(',', ' '));
				if (!strT.hasMoreTokens()) {
					break;
				}
				readCommand(strT, cpu);
			}
		}

		System.out
				.println("Please Enter your data here(Enter an empty line to end):");
		while (true) {
			strT = new StringTokenizer(br.readLine());
			if (!strT.hasMoreTokens()) {
				break;
			}
			readData(strT, cpu);
		}

		String ans;
		System.out
				.println("If you would like to run each command separately enter \"1\"(enter for next command)"
						+ ", but if you want to run the whole simulation at once enter \"2\" (Quotes for clarity):");
		while (true) {
			try {
				ans = br.readLine();
				if (ans.equals("1") || ans.equals("2"))
					break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i < cpu.getCommands().size()
				|| cpu.getPC().getValue() < cpu.getAddress(); i++) {
			cpu.getCurCommand().execute();
			cpu.incrementPC();
			if (ans.equals("1")) {
				cpu.print();
				br.readLine();
			}
		}
		cpu.print();
	}

	private static void readData(StringTokenizer strT, CPU cpu) {
		
	}

	private static void readCommand(StringTokenizer strT, CPU cpu) {
		String opcode, st, rt, dt;
		opcode = strT.nextToken().toLowerCase();
		if (opcode.equals("add")) {
			try {
				dt = strT.nextToken().toLowerCase();
				st = strT.nextToken().toLowerCase();
				rt = strT.nextToken().toLowerCase();
				Register[] regs = RFormatCommand.prepareCommand(dt, st, rt);
				if (regs == null)
					return;
				cpu.getCommands().add(new add(regs[0], regs[1], regs[2]));
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		} else if (opcode.equals("sub")) {
			try {
				dt = strT.nextToken().toLowerCase();
				st = strT.nextToken().toLowerCase();
				rt = strT.nextToken().toLowerCase();
				Register[] regs = RFormatCommand.prepareCommand(dt, st, rt);
				if (regs == null)
					return;
				cpu.getCommands().add(new sub(regs[0], regs[1], regs[2]));
			} catch (Exception e) {

			}
		} else if (opcode.equals("sll")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				rt = strT.nextToken();
				Register[] regs = IFormatCommand.prepareCommand(dt, st);
				if (regs == null)
					return;
				cpu.getCommands().add(
						new sll(regs[0], regs[1], Integer.parseInt(rt)));
			} catch (Exception e) {

			}
		} else if (opcode.equals("and")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				rt = strT.nextToken();
				Register[] regs = RFormatCommand.prepareCommand(dt, st, rt);
				if (regs == null)
					return;
				cpu.getCommands().add(new and(regs[0], regs[1], regs[2]));
			} catch (Exception e) {

			}
		} else if (opcode.equals("or")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				rt = strT.nextToken();
				Register[] regs = RFormatCommand.prepareCommand(dt, st, rt);
				if (regs == null)
					return;
				cpu.getCommands().add(new or(regs[0], regs[1], regs[2]));
			} catch (Exception e) {

			}
		} else if (opcode.equals("nor")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				rt = strT.nextToken();
				Register[] regs = RFormatCommand.prepareCommand(dt, st, rt);
				if (regs == null)
					return;
				cpu.getCommands().add(new nor(regs[0], regs[1], regs[2]));
			} catch (Exception e) {

			}
		} else if (opcode.equals("andi")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				rt = strT.nextToken();
				Register[] regs = IFormatCommand.prepareCommand(dt, st);
				if (regs == null)
					return;
				cpu.getCommands().add(
						new andi(regs[0], regs[1], Integer.parseInt(rt)));
			} catch (Exception e) {

			}
		} else if (opcode.equals("ori")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				rt = strT.nextToken();
				Register[] regs = IFormatCommand.prepareCommand(dt, st);
				if (regs == null)
					return;
				cpu.getCommands().add(
						new ori(regs[0], regs[1], Integer.parseInt(rt)));
			} catch (Exception e) {

			}
		} else if (opcode.equals("slt")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				rt = strT.nextToken();
				Register[] regs = RFormatCommand.prepareCommand(dt, st, rt);
				if (regs == null)
					return;
				cpu.getCommands().add(new slt(regs[0], regs[1], regs[2]));
			} catch (Exception e) {

			}
		} else if (opcode.equals("addi")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				rt = strT.nextToken();
				Register[] regs = IFormatCommand.prepareCommand(dt, st);
				if (regs == null)
					return;
				cpu.getCommands().add(
						new addi(regs[0], regs[1], Integer.parseInt(rt)));
			} catch (Exception e) {

			}
		} else if (opcode.equals("bne")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				rt = strT.nextToken();
				Register[] regs = IFormatCommand.prepareCommand(dt, st);
				if (regs == null)
					return;

				cpu.getCommands().add(
						new bne(regs[0], regs[1], cpu.getLabelFile().getLabel(
								rt)));
			} catch (Exception e) {

			}
		} else if (opcode.equals("beq")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				rt = strT.nextToken();
				Register[] regs = IFormatCommand.prepareCommand(dt, st);
				if (regs == null)
					return;

				cpu.getCommands().add(
						new beq(regs[0], regs[1], cpu.getLabelFile().getLabel(
								rt)));
			} catch (Exception e) {

			}
		} else if (opcode.equals("j")) {
			try {
				dt = strT.nextToken();

				cpu.getCommands().add(new j(cpu.getLabelFile().getLabel(dt)));
			} catch (Exception e) {

			}
		} else if (opcode.equals("jal")) {
			try {
				dt = strT.nextToken();

				cpu.getCommands().add(new jal(cpu.getLabelFile().getLabel(dt)));
			} catch (Exception e) {

			}
		} else if (opcode.equals("jr")) {
			try {
				cpu.getCommands().add(
						new jr(cpu.getRegFile().getRegister("ra")));
			} catch (Exception e) {

			}
		} else if (opcode.equals("lw")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();

				Register[] regs = RFormatCommand.prepareMemoryCommand(dt, st);
				if (regs == null)
					return;

				cpu.getCommands()
						.add(new lw(regs[0], regs[1].getValue()
								+ regs[2].getValue()));
			} catch (Exception e) {

			}
		} else if (opcode.equals("lh")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				Register[] regs = RFormatCommand.prepareMemoryCommand(dt, st);
				if (regs == null)
					return;

				cpu.getCommands()
						.add(new lh(regs[0], regs[1].getValue()
								+ regs[2].getValue()));
			} catch (Exception e) {

			}
		} else if (opcode.equals("lhu")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				Register[] regs = RFormatCommand.prepareMemoryCommand(dt, st);
				if (regs == null)
					return;

				cpu.getCommands().add(
						new lhu(regs[0], regs[1].getValue()
								+ regs[2].getValue()));
			} catch (Exception e) {

			}
		} else if (opcode.equals("lb")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				Register[] regs = RFormatCommand.prepareMemoryCommand(dt, st);
				if (regs == null)
					return;

				cpu.getCommands()
						.add(new lb(regs[0], regs[1].getValue()
								+ regs[2].getValue()));
			} catch (Exception e) {

			}
		} else if (opcode.equals("lbu")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				Register[] regs = RFormatCommand.prepareMemoryCommand(dt, st);
				if (regs == null)
					return;

				cpu.getCommands().add(
						new lbu(regs[0], regs[1].getValue()
								+ regs[2].getValue()));
			} catch (Exception e) {

			}
		} else if (opcode.equals("sw")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				Register[] regs = RFormatCommand.prepareMemoryCommand(dt, st);
				if (regs == null)
					return;

				cpu.getCommands()
						.add(new sw(regs[0], regs[1].getValue()
								+ regs[2].getValue()));
			} catch (Exception e) {

			}
		} else if (opcode.equals("sh")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				Register[] regs = RFormatCommand.prepareMemoryCommand(dt, st);
				if (regs == null)
					return;

				cpu.getCommands()
						.add(new sh(regs[0], regs[1].getValue()
								+ regs[2].getValue()));
			} catch (Exception e) {

			}
		} else if (opcode.equals("sb")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				Register[] regs = RFormatCommand.prepareMemoryCommand(dt, st);
				if (regs == null)
					return;

				cpu.getCommands()
						.add(new sb(regs[0], regs[1].getValue()
								+ regs[2].getValue()));
			} catch (Exception e) {

			}
		} else if (opcode.equals("lui")) {
			try {
				dt = strT.nextToken();
				st = strT.nextToken();
				Register[] regs = RFormatCommand.prepareMemoryCommand(dt, st);
				if (regs == null)
					return;

				cpu.getCommands().add(
						new lui(regs[0], regs[1].getValue()
								+ regs[2].getValue()));
			} catch (Exception e) {

			}
		} else {
			System.out.println("Invalid Command!");
			return;
		}
		cpu.getCommands().get(cpu.getCommands().size() - 1)
				.setMemAddress(cpu.getAddress());
		cpu.setAddress(cpu.getAddress() + 1);
	}
}

/*
 * addi $t0, $zero, 5 add $t0, $t0, $t0 loop: addi $t0, $t0, -1 bne $t0, $zero,
 * loop addi $t0 , $t0, 1
 */