	package com.venkatesh.spel;
	
	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.stereotype.Component;

	@Component
	public class Person {
		@Value("#{T(java.lang.Math).log10(1000)}")
		private String name;
		@Value("#{1}")
		private int id;
		@Value("#{new java.lang.String('nandigama')}")
		private String address;
		@Override
		public String toString() {
			return "Perosn [name=" + name + ", id=" + id + ", address=" + address + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	
	}
	
	
