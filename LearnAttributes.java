package week5.day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttributes {
	@Test
	public void b() {
		System.out.println("Test 1 Execution");
	}

	@Test(enabled = false)
	public void a() {
		System.out.println("Test 2 Execution");
	}

	@Test(priority = -1)
	public void c() {
		System.out.println("Test 3 Execution");
	}

	@Test(dependsOnMethods = { "week5.day1.LearnAttributes.e" }, alwaysRun = true)
	public void d() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test 4 Execution");
	}

	@Test(invocationCount = 5, invocationTimeOut = 5000, threadPoolSize = 2)
	public void e() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test 5 Execution");
	}

	@Ignore
	@Test
	public void f() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test 6 Execution");
	}

	@Test
	public void g() {
		System.out.println("Test 7 Execution");
		throw new RuntimeException();
	}

	@Test
	public void h() {
		System.out.println("Test 8 Execution");
	}
}
