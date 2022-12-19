package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepositoryImplementor;

public class IplRunner {

	public static void main(String[] args) {

		IplRepositoryImplementor repo = new IplRepositoryImplementor(); // to get create method
		IplDTO rcb = new IplDTO();
		

		rcb.setTeamName("Royal Challengers bangalore");
		rcb.setCaptainName("Virat");
		rcb.setOwnerAlive(true);
		rcb.setPurse(85);
		rcb.setWins(103);
		rcb.setDefeats(113);
		rcb.setCreatedBy("System");// method from AbstractAuditDTO inherited in IplDTO class
		rcb.setCreatedDate(LocalDateTime.now());
		repo.create(rcb);

		IplDTO csk = new IplDTO();

		csk.setTeamName("Chennai super kings");
		csk.setCaptainName("dhoni");
		csk.setOwnerAlive(true);
		csk.setPurse(85);
		csk.setWins(173);
		csk.setDefeats(107);
		csk.setCreatedBy("System");// method from AbstractAuditDTO inherited in IplDTO class
		csk.setCreatedDate(LocalDateTime.now());
		repo.create(csk);

		IplDTO mi = new IplDTO();

		mi.setTeamName("Mumbai Indians");
		mi.setCaptainName("rohit sharma");
		mi.setOwnerAlive(true);
		mi.setPurse(100);
		mi.setWins(150);
		mi.setDefeats(120);
		mi.setCreatedBy("System");// method from AbstractAuditDTO inherited in IplDTO class
		mi.setCreatedDate(LocalDateTime.now());
		repo.create(mi);

		IplDTO kkr = new IplDTO();

		kkr.setTeamName("kolkata knight riders");
		kkr.setCaptainName(" shreyas iyer");
		kkr.setOwnerAlive(true);
		kkr.setPurse(90);
		kkr.setWins(120);
		kkr.setDefeats(100);
		kkr.setCreatedBy("System");// method from AbstractAuditDTO inherited in IplDTO class
		kkr.setCreatedDate(LocalDateTime.now());
		repo.create(kkr);

		IplDTO dc = new IplDTO();
		dc.setTeamName("delhi capitals");
		dc.setCaptainName("rishab pant");
		dc.setOwnerAlive(true);
		dc.setPurse(98);
		dc.setWins(112);
		dc.setDefeats(88);
		dc.setCreatedBy("System");// method from AbstractAuditDTO inherited in IplDTO class
		dc.setCreatedDate(LocalDateTime.now());
		repo.create(dc);

		IplDTO srh = new IplDTO();

		srh.setTeamName("sunrisers hyderabad");
		srh.setCaptainName("david warner");
		srh.setOwnerAlive(true);
		srh.setPurse(80);
		srh.setWins(97);
		srh.setDefeats(133);
		srh.setCreatedBy("System");// method from AbstractAuditDTO inherited in IplDTO class
		srh.setCreatedDate(LocalDateTime.now());
		repo.create(srh);

		IplDTO gt = new IplDTO();

		gt.setTeamName("gujarat titans");
		gt.setCaptainName("hardik pandya");
		gt.setOwnerAlive(true);
		gt.setPurse(98);
		gt.setWins(112);
		gt.setDefeats(88);
		gt.setCreatedBy("System");// method from AbstractAuditDTO inherited in IplDTO class
		gt.setCreatedDate(LocalDateTime.now());
		repo.create(gt);

		IplDTO rr = new IplDTO();

		rr.setTeamName("rajashtan royals");
		rr.setCaptainName("sanju samson");
		rr.setOwnerAlive(true);
		rr.setPurse(98);
		rr.setWins(112);
		rr.setDefeats(88);
		rr.setCreatedBy("System");// method from AbstractAuditDTO inherited in IplDTO class
		rr.setCreatedDate(LocalDateTime.now());
		repo.create(rr);

		IplDTO kxip = new IplDTO();

		kxip.setTeamName("punjab superkings");
		kxip.setCaptainName("mayank agarwal");
		kxip.setOwnerAlive(true);
		kxip.setPurse(98);
		kxip.setWins(112);
		kxip.setDefeats(88);
		kxip.setCreatedBy("System");// method from AbstractAuditDTO inherited in IplDTO class
		kxip.setCreatedDate(LocalDateTime.now());
		repo.create(kxip);

		IplDTO lsg = new IplDTO();

		lsg.setTeamName("lucknow supergiants");
		lsg.setCaptainName("k l rahul");
		lsg.setOwnerAlive(true);
		lsg.setPurse(98);
		lsg.setWins(112);
		lsg.setDefeats(88);
		lsg.setCreatedBy("System");// method from AbstractAuditDTO inherited in IplDTO class
		lsg.setCreatedDate(LocalDateTime.now());
		repo.create(lsg);
		
		System.out.println(repo.findByCaptainName("Virat"));
		
		System.out.println(repo.findByCaptainName("Vat"));



	}

}
