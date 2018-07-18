package cn.com.webxml;

public class Text {

	//查询手机号
	public static void main(String[] args) {
		MobileCodeWSSoap mc=new MobileCodeWS().getPort(MobileCodeWSSoap.class);
		String info = mc.getMobileCodeInfo("15240082949", null);
		System.out.println(info);
	}
}
