import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
	@RunWith(Parameterized.class)
	public class ConsumirParametrizada {
		private double num1;
		private double num2;
		private double res;
		public ConsumirParametrizada(double n1,double n2,double r) {
			num1=n1;
			num2=n2;
			res=r;
		}
		@Parameters
		public static Collection<Object[]> numeros(){
			return Arrays.asList(new Object[][] {{2,1,1},{50,40,10},{-4,-5,1}});
			
		}
		@Test
		public void ConsumirTestTest() {
			DepositoCombustible b=new DepositoCombustible(120,num1);
			assertEquals(b.consumir(num2),res,0);
		}

	}


