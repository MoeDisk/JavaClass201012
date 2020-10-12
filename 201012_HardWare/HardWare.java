package h1;

public class HardWare {
	public class HardDisk {
		int amount;

		int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}
	}

	public class CPU {
		int speed;

		int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}
	}

	public class PC {
		CPU cpu;
		HardDisk HD;

		public void setCPU(CPU cpu) {
			this.cpu = cpu;
		}

		public void setHardDisk(HardDisk HD) {
			this.HD = HD;
		}

		public void show() {
			System.out.println("CPU Speed" + cpu.getSpeed());
			System.out.println("HardDisk Amount" + HD.getAmount());
		}
	}
}