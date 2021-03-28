import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
class FillParametrizada {
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
		return Arrays.asList(new Object[][] {{2,1,3},{40,50,90},{-4,-5,-9}});
		
	}
	@Test
	void FillTest() {
		DepositoCombustible b=new DepositoCombustible(120,num1);
		assertEquals(b.fill(num2),res);
	}

}
