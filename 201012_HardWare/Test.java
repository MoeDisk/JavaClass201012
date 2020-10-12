package m1;

import h1.HardWare;
import h1.HardWare.CPU;
import h1.HardWare.HardDisk;
import h1.HardWare.PC;

public class Test{
	public static void main(){
		HardWare hw = new HardWare();
		HardWare.CPU cpu= hw.new CPU();
		cpu.setSpeed(2200);
		HardWare.HardDisk HD=hw.new HardDisk();
		HD.setAmount(200);
		HardWare.PC pc=hw.new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
	}
}