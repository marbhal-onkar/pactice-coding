package com.main.compare;

public class Laptop implements Comparable<Laptop> {

	private String name;
	private Integer price;
	private String processor;
	private Integer ram;

	public Laptop() {
	}

	public Laptop(String name, Integer price, String processor, Integer ram) {
		this.name = name;
		this.price = price;
		this.processor = processor;
		this.ram = ram;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	@Override
	public int compareTo(Laptop l) {
		return l.getPrice().compareTo(this.price);
	}
}
