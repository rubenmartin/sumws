package com.bharath.trainings.ws;

import com.bharath.trainings.ws.dto.SumRequest;
import com.bharath.trainings.ws.dto.SumResponse;

public class SumWSImpl implements SumWS {

	@Override
	public SumResponse calculateSum(SumRequest request) {
		
		int result = request.getNum1()+request.getNum2();
		SumResponse sumResponse = new SumResponse();
		sumResponse.setResult(result);
		
		return sumResponse;
	}

}
