package com.lotto.web.daoImpl;

import java.io.*;

import com.lotto.web.daos.ConsumerDAO;
import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.pool.Constants;

public class ConsumerDAOImpl implements ConsumerDAO{
		
	@Override
	public void insertConsumer(ConsumerBean param) {
		try {
			File file = new File(Constants.FILE_PATH +"consumers.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = 
					new BufferedWriter(new FileWriter(file, true));
			writer.write(String.
					format("%s,%s", 
							param.getCid(), param.getPass()));
			writer.newLine();
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
