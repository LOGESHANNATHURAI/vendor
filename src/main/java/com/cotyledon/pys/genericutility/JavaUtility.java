package com.cotyledon.pys.genericutility;

import java.time.LocalDateTime;

public class JavaUtility {

	public String LocalDateTime() {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		return timeStamp;
	}

}
