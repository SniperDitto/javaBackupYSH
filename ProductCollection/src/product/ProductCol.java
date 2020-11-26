package product;

public class ProductCol {
	public String name="";
	public int stock=0;
	public static int prodID =0;//추가되는 상품마다 부여되는 고유번호
	
	public ProductCol() {
		ProductCol.prodID++;
	}

	public ProductCol(String name, int stock) {
		this.name = name;
		this.stock = stock;
	}
	public ProductCol(String name) {
		this.name = name;
		this.stock = 0;
	}
	
	public void addStock(int stock) {
		this.stock+=stock;
	}
	public void delStock(int stock) {
		this.stock-=stock;
	}

	@Override
	public String toString() {
		return "상품명 = " + name + ", 재고량 = " + stock + "개";
	}
	public void showState() {
		System.out.println(toString());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductCol other = (ProductCol) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
