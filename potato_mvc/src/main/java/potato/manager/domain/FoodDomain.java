package potato.manager.domain;

public class FoodDomain {
	private String main_chk, rec_chk,img,name,contents,ingredient;
	private int price;
	
	public FoodDomain() {
		// TODO Auto-generated constructor stub
	}

	public FoodDomain(String main_chk, String rec_chk, String img, String name, String contents, String ingredient,
			int price) {
		super();
		this.main_chk = main_chk;
		this.rec_chk = rec_chk;
		this.img = img;
		this.name = name;
		this.contents = contents;
		this.ingredient = ingredient;
		this.price = price;
	}

	public String getMain_chk() {
		return main_chk;
	}

	public void setMain_chk(String main_chk) {
		this.main_chk = main_chk;
	}

	public String getRec_chk() {
		return rec_chk;
	}

	public void setRec_chk(String rec_chk) {
		this.rec_chk = rec_chk;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodDomain [main_chk=" + main_chk + ", rec_chk=" + rec_chk + ", img=" + img + ", name=" + name
				+ ", contents=" + contents + ", ingredient=" + ingredient + ", price=" + price + "]";
	}
	
}