
public class Generics1 <T,K>{	
		//String data;
		T data;
		K data1;

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public K getData1() {
			return data1;
		}

		public void setData1(K data1) {
			this.data1 = data1;
		}

		@Override
		public String toString() {
			return "data=" + data + ", data1=" + data1;
		}
		
		

	}
