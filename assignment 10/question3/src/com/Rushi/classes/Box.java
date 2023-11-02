package com.Rushi.classes;	

public class Box<T> {
		private T obj;
		public Box(T obj)
		{
			this.obj=obj;
		}
		public T get() {
			return obj;
		}
		public void set(T obj) {
			this.obj = obj;
		}
}
