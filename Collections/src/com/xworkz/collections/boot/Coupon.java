package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Coupon {

	public static void main(String[] args) {

		String coupon = "Buy one, get one free discounts";
		String coupon1 = "Percentage sales";
		String coupon2 = "Early payment discounts";
		String coupon3 = "Overstock sales";
		String coupon4 = "Free shipping discounts";
		String coupon5 = "Price bundling";
		String coupon6 = "Bulk or wholesale discounts";
		String coupon7 = "Seasonal discounts";
		String coupon8 = "Referral discounts";
		String coupon9 = "Loyalty program discounts";
		String coupon10 = "Email subscription discounts";
		String coupon11 = "Trade-in credits";
		String coupon12 = "amazon";

		Collection<String> collection = new LinkedHashSet<String>();

		collection.add(coupon);
		collection.add(coupon1);
		collection.add(coupon2);
		collection.add(coupon3);
		collection.add(coupon4);
		collection.add(coupon5);
		collection.add(coupon6);
		collection.add(coupon7);
		collection.add(coupon8);
		collection.add(coupon9);
		collection.add(coupon10);
		collection.add(coupon11);
		collection.add(coupon12);

		System.out.println(collection);
		System.out.println("size before clear method : " + collection.size());

		collection.clear();
		System.out.println("size after clear method : " + collection.size());
	}

}
