package xx;

public class Test {

	public static void main(String[] args) {
		//初始化服务
		Service01 s=new Service01Service().getPort(Service01.class);
		
		String hr = s.hr("张三2");
		System.out.println(hr);
		//s/dabdg gd hfdg
	}
}
