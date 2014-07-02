package com.baier.paperSize;

public class PaperSizes {
	private Paper base = new Paper(841, 1189, "A0");

	public String getPaperSize(String paperType) {
		final String original = paperType;
		if (paperType.equals("A0")) {
			return paperType;
		}

		if (paperType.endsWith("00")) {
			getPaperSize(paperType.substring(0, paperType.length() - 1));
			doubleTheShorterSide(base);
		}

		if ((Character.getNumericValue(paperType.charAt(1))) > 0) {
			getPaperSize("A".concat(String.valueOf(Character.getNumericValue(paperType
							.charAt(1)) - 1)));
			cutInHalfTheLongerSide(base);
		}

		base.setName(original);
		return base.toString();
	}

	private void doubleTheShorterSide(Paper currentPaper) {
		if (currentPaper.getA() > currentPaper.getB()) {
			currentPaper.setB(2 * currentPaper.getB());
		} else {
			currentPaper.setA(2 * currentPaper.getA());
		}
	}

	private void cutInHalfTheLongerSide(Paper currentPaper) {
		if (currentPaper.getA() > currentPaper.getB()) {
			currentPaper.setA(currentPaper.getA() / 2);
		} else {
			currentPaper.setB(currentPaper.getB() / 2);
		}
	}
	
	public void reset(){
		this.base.setA(841);
		this.base.setB(1189);
	}
}
