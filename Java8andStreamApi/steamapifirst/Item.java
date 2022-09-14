package com.yash.steamapifirst;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class Item {
private int itemid;
private String iname;
LocalDateTime date_of_manufacturing,date_of_Expiry;
private float price;
public int getItemid() {
	return itemid;
}
public void setItemid(int itemid) {
	this.itemid = itemid;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
public LocalDateTime getDate_of_manufacturing() {
	return date_of_manufacturing;
}
public void setDate_of_manufacturing(LocalDateTime date_of_manufacturing) {
	this.date_of_manufacturing = date_of_manufacturing;
}
public LocalDateTime getDate_of_Expiry() {
	return date_of_Expiry;
}
public void setDate_of_Expiry(LocalDateTime date_of_Expiry) {
	this.date_of_Expiry = date_of_Expiry;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Item() {
	super();
	// TODO Auto-generated constructor stub
}
public Item(int itemid, String iname, LocalDateTime date_of_manufacturing, LocalDateTime date_of_Expiry, float price) {
	super();
	this.itemid = itemid;
	this.iname = iname;
	this.date_of_manufacturing = date_of_manufacturing;
	this.date_of_Expiry = date_of_Expiry;
	this.price = price;
}
@Override
public String toString() {
	return "Item [itemid=" + itemid + ", iname=" + iname + ", date_of_manufacturing=" + date_of_manufacturing
			+ ", date_of_Expiry=" + date_of_Expiry + ", price=" + price + "]";
}


public static void main(String[] args) {
	


final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
LocalDateTime dom = LocalDate.parse("20110312", formatter).atStartOfDay();
LocalDateTime date_ex = LocalDate.parse("19930406", formatter).atStartOfDay();

Item I1 = new Item(101,"water bottel", dom, date_ex, 67);
Item I2 = new Item(102,"dresses", dom, date_ex, 68);;
Item I3 = new Item(103,"tiffin", dom, date_ex, 67);
Item I4 = new Item(104,"bag", dom, date_ex, 97);

List<Item> list = Arrays.asList(I1,I2,I3,I4);

double avg=list.stream().mapToDouble(a -> a.getPrice()).average().orElse(0);
System.out.println("Averagr price :"+avg);


Comparator<Item> comparator = Comparator.comparing( Item::getPrice );

//Get Min or Max Object
Item minObject = list.stream().min(comparator).get();
System.out.println("minObject :"+minObject);
Item maxObject = list.stream().max(comparator).get();
System.out.println("maxObject :"+maxObject);



Set<Item> myset = list.stream().collect(Collectors.toSet());

System.out.println(myset);

List<Float> dp=list.stream().map(e->e.getPrice()).distinct().collect(Collectors.toList());
System.out.println(dp);
}
}
