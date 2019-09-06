package com.lotto.web.daoImpl;

import java.io.*;

import com.lotto.web.daos.LottoDAO;
import com.lotto.web.domains.LottoBean;
import com.lotto.web.pool.Constants;

public class LottoDAOImpl implements LottoDAO{
	
	@Override
	public void insertLotto(LottoBean param) {
		try {
			File file = new File(Constants.FILE_PATH + "lotto.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = 
					new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format("%s : %s",
					param.getLottoSeq(), param.getLotteryNum()));//commit
			writer.newLine();
			writer.flush();//push
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
