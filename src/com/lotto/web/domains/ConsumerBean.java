package com.lotto.web.domains;

import java.io.Serializable;

public class ConsumerBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String cid, pass ,lottoSeq;
	private int prizeMoney;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getLottoSeq() {
		return lottoSeq;
	}
	public void setLottoSeq(String lottoSeq) {
		this.lottoSeq = lottoSeq;
	}
	public int getPrizeMoney() {
		return prizeMoney;
	}
	public void setPrizeMoney(int prizeMoney) {
		this.prizeMoney = prizeMoney;
	}
	@Override
	public String toString() {
		return "ConsumerBean [cid=" + cid + ", pass=" + pass + ", lottoSeq=" + lottoSeq + ", prizeMoney=" + prizeMoney
				+ "]";
	}
	
	

}
