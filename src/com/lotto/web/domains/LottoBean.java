package com.lotto.web.domains;

import java.io.Serializable;

public class LottoBean implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	private String lottoSeq, ball, lotteryNum;

	public String getLottoSeq() {
		return lottoSeq;
	}

	public void setLottoSeq(String lottoSeq) {
		this.lottoSeq = lottoSeq;
	}

	public String getBall() {
		return ball;
	}

	public void setBall(String ball) {
		this.ball = ball;
	}

	public String getLotteryNum() {
		return lotteryNum;
	}

	public void setLotteryNum(String lotteryNum) {
		this.lotteryNum = lotteryNum;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "LottoBean [lottoSeq=" + lottoSeq + ", ball=" + ball + ", lotteryNum=" + lotteryNum + "]";
	}
	
	
	
	
	
}
