package vendorLogin;

import org.testng.annotations.DataProvider;

public class Datasupply {

	@DataProvider(name = "SupervisorDetails", parallel = false)
	public String[][] Stringmultidimentionalarray() {
		String[][] data = new String[][] { { "", "", "" }, { "logesh", "", "" },
				{ "", "logeshannathurai28@gmail.com", "" }, { "", "", "8778544930" },
				{ "logesh", "logeshannathurai28@gmail.com", "" }, { "logesh", "", "8778544930" },
				{ "", "logeshannathurai28@gmail.com", "8778544930" } };
		return data;
	}

//SupervisorName Textfield check with the All DataTypes
	@DataProvider(name = "S.NameFieldCheck", parallel = false)
	public String[] stringsigledimentionalarray() {
		// (blank,special character,Numbers,Char and sp.char,char and num,num and
		// s.char,Uppercase,lowercase,upper and lower,repeated words)
		String[] data = new String[] { "", "%^&@%", "646", "hg*^#", "jhg7868", "986&*^", "logggesh" };
		return data;

	}

//Email Textfield check with the All DataTypes
	@DataProvider(name = "S.EmailidFieldCheck", parallel = false)
	public String[] stringsigledimentionalarray1() {
		// (blank,special character,Numbers,Char and sp.char,char and num,num and
		// s.char,Uppercase,lowercase,upper and lower,without@symbol,without.com,invalid email)
		String[] data = new String[] {" ", "%^&@%", "646", "hg*^#", "jhg7868", "986&*^", "logggesh", "LOGESH",
				"logesh", "LOgeSh","hggmail.com","jhvg@gmail","+@gmail.com" };
		return data;

	}
	
	
//SupervisorName Textfield check with the All DataTypes
		@DataProvider(name = "S.ContactNoFieldCheck", parallel = false)
		public String[] stringsigledimentionalarray2() {
			// (blank,special character,Numbers,Char and sp.char,char and num,num and
			// s.char,Uppercase,lowercase,upper and lower,More than ten,repeated num,invalidNo )
			String[] data = new String[] {"1111122222","5647380913" };
			return data;

		}	

}
