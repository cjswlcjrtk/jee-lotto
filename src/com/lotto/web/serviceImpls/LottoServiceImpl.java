package com.lotto.web.serviceImpls;

import java.util.Arrays;
import java.util.Random;

import com.lotto.web.daoImpl.LottoDAOImpl;
import com.lotto.web.daos.LottoDAO;
import com.lotto.web.domains.LottoBean;
import com.lotto.web.services.LottoService;

public class LottoServiceImpl implements LottoService{
	
	private LottoDAO lot;
	
	public LottoServiceImpl() {
		lot = new LottoDAOImpl();
	}	
	
	@Override
	public void createLotto(LottoBean param) {
		param.setBall(createBall());
		param.setLotteryNum(createLotteryNum());
		param.setLottoSeq(createLottoSeq());
		lot.insertLotto(param);
		
//		String no = "No.";
//		String lseq = "";		
//		for(int i=0; i<4; i++) {
//			int t = (int)(Math.random()*10);	
//			lseq += t;
//		}
		lot.insertLotto(param);
	}
	
	@Override
	public String createLottoSeq() {
		String seq = "No.";
		for(int i = 0; i < 4; i++) {
			seq += new Random().nextInt(10) + "";
		}
		System.out.println("생성된 seq =" + seq);
		return seq;
	}
	
	@Override
	public String createBall() {
		return new Random().nextInt(45)+1+"";
	}
	
//	@Override
//	public String createLotteryNum() {
//		String lotteryNum = "";
//		for(int i = 0; i < 6; i++) {		
//			lotteryNum += 
//					(i==5) ? createBall() : createBall() + ",";
//		}
//		System.out.println("lotteryNum =" + lotteryNum);
//		
//		return lotteryNum;
//	}

//	@Override
//	public int[] duplicatePrevention(int arr) {	
//		
//		int[] temp = new int[arr];
//		for(int i = 0; i < temp.length; i++) {
//			temp[i] = (int)(Math.random()*45)+1;
//			for(int j = 0; j < i; j++) {
//				if(temp[i]==temp[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		Arrays.sort(temp);
//		System.out.println("sort="+temp);
//		return temp;
//	}	
//
//	@Override
//	public String ascendingSort(int[] arr) {
//		return null;
//	}
	@Override
	public String createLotteryNum() {
		String lotto = "";
		int[] nums = new int[6];
		int num = 0;
		boolean b= false;
		for(int i = 0; i<nums.length; i++) {
			nums[i] = Integer.parseInt(createBall());
			if(nums[i] == 0) {
				i--;
			} else {
				for(int j= 0; j<i; j++) {
					if(nums[i] == nums[j]) {
						i--;
						break;
					}else {
						break;
					}
				}
			}
		}
		for(int i = 0; i<nums.length-1; i++) {
			b=false;
			for(int j = 0; j<nums.length-1-i; j++) {
				if(nums[j]>nums[j+1]) {
					num = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = num;
					b=true;
				}
			}
			if(!b) {
				break;
			}
		}
		lotto = String.format("%s,%s,%s,%s,%s,%s", nums[0],nums[1],nums[2],nums[3],nums[4],nums[5]);
		System.out.println("lotto번호" + lotto);
		return lotto;
	}

	
	

	

}
