package com.lotto.web.serviceImpls;


import java.util.Random;

import com.lotto.web.daoImpl.LottoDAOImpl;
import com.lotto.web.daos.LottoDAO;
import com.lotto.web.domains.LottoBean;
import com.lotto.web.services.LottoService;

public class LottoServiceImpl implements LottoService{
	
	private LottoDAO dao;
	
	public LottoServiceImpl() {
		dao = new LottoDAOImpl();
	}

	@Override
	public void createLotto(LottoBean param) {
		param.setLottoSeq(createLottoSeq());
		param.setBall(createBall());
		param.setLotteryNum(createLotteryNum());
		dao.insertLotto(param);
	}

	@Override
	public String createLottoSeq() {						
		return "No." + new Random().nextInt(4) + "";
	}

	@Override
	public String createBall() {
		return new Random().nextInt(45) + 1 + "";
	}

	@Override
	public String createLotteryNum() {
		String result ="";
		int[]arr = new int[6];
		for(int i : arr) {
			int a = Integer.parseInt(createBall());
			if(!exist(arr, a)) {
				arr[i] = a;			
			}else {
				i--;
			}
		
			arr = bubbleSort(arr, true);
			for(i = 0; i<arr.length; i++) {
				result += arr[i] + ",";			
			}
		
			
		}
		return result;
	}

	@Override
	public boolean exist(int[] arr, int a) {
		boolean b = false;
		for(int i : arr) {
			if(a == i) {
				b = true;
			}
		}
		
		return b;
	}

	@Override
	public int[] bubbleSort(int[] arr, boolean flag) {
		int t = 0;
		for(int i = 0; i<arr.length-1; i++){
			for(i = 0; i<arr.length-1; i++) {
				if(flag) {
					if(arr[i]>arr[i+1]) {
						t = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = t;
					}
				}else {
					if(arr[i] < arr[i+1]) {
						t = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = t;					
						}
				}
			}
		}
		
		return arr;
	}

}
