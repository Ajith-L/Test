package test;

import org.testng.annotations.Test;

public class testnggrop {
	@Test(groups={"noika"})
	public void noika(){
		System.out.println("noika");
	}
	@Test (groups={"noika"})
	public void noika1(){
		System.out.println("noika1");
	}
	@Test (groups={"samsng"})
	public void samsng(){
		System.out.println("samsng");
	}
	@Test(groups={"samsng"})
	public void samsng1(){
		System.out.println("samsng1");
	}
	@Test(groups={"lenova"})
	public void lenova(){
		System.out.println("lenova");
	}
	@Test(groups={"lenova"})
	public void lenova1(){
		System.out.println("lenova1");
	}
	@Test(groups={"vivo"})
	public void vivo(){
		System.out.println("vivo");
	}
	@Test(groups={"vivo"})
	public void vivo1(){
		System.out.println("vivo1");
	}
}
