package classes;

public class Food {

	private String name;
	private int calories;
	private boolean needsFridge;
	private boolean hasGluten;
	private boolean isDiettetic;

	public Food (String name, int calories, boolean needsFridge, boolean hasGluten, boolean isDiattetic  ) {
		this.name = name;
		this.calories = calories;
		this.needsFridge = needsFridge;
		this.hasGluten = hasGluten;
		this.isDiettetic = isDiattetic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public boolean isFridge() {
		return needsFridge;
	}

	public void setFridge(boolean fridge) {
		this.needsFridge = needsFridge;
	}

	public boolean isContainsGluten() {
		return hasGluten;
	}

	public void setContainsGluten(boolean containsGluten) {
		this.hasGluten = containsGluten;
	}

	public boolean isDiettetic() {
		return isDiettetic;
	}

	public void setDietFriendly(boolean isDiattetic) {
		this.isDiettetic = isDiettetic;
	}
	
	
	public String toString() {
        return ("Food: " + name + "\nCalories: " + calories + "\nNeeds fridge: " + needsFridge + "\nContains gluten: " + hasGluten + "\nisDiettetic: " + isDiettetic);
    }

}
