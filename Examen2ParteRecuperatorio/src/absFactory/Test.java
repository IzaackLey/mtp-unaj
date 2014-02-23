package absFactory;


public class Test {
	public static void main(String[] args) {
		EstacionDeServicio YPF = new EstacionDeServicio(new YPFCombustibleFactory(), "YPF");
		System.out.println(YPF);
		EstacionDeServicio Shell = new EstacionDeServicio(new ShellCombustibleFactory(), "Shell");
		System.out.println(Shell);
	}
}
