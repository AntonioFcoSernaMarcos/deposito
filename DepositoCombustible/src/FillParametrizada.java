import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class FillParametrizada {
	private double num1;
	private double num2;
	private double res;
	public FillParametrizada(double n1,double n2,double r) {
		num1=n1;
		num2=n2;
		res=r;
	}
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {{2.0,1.0,3.0},{40.0,50.0,90.0},{-4.0,-5.0,-9.0}});
		
	}
	@Test
	public void FillTest() {
		DepositoCombustible b=new DepositoCombustible(120.0,num1);
		b.fill(num2);
		assertEquals(res,b.getDepositoNivel(),0);
	}

}
