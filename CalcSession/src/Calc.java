
public class Calc {

	private int state = 0;
	private int display = 0;
	private String op;
	private int left = 0;

	public void onButton(String button) {
		if ("clear".equals(button))
			onClear();
		else if ("pls".equals(button) || "min".equals(button) || "mul".equals(button) || "div".equals(button))
			onOperator(button);
		else if ("calc".equals(button))
			onCalc();
		else
			onDigit(button);
	}

	private void onDigit(String digit) {
		if (state == 0 || state == 4) {
			state = 1;
			display = Integer.parseInt(digit);
		} else if (state == 1 || state == 3) {
			display = display * 10 + Integer.parseInt(digit);
		} else if (state == 2) {
			state = 3;
			left = display;
			display = Integer.parseInt(digit);
		}
	}

	private void onCalc() {
		if (state == 3) {
			state = 4;

			if ("pls".equals(op))
				display = left + display;
			else if ("min".equals(op))
				display = left - display;
			else if ("mul".equals(op))
				display = left * display;
			else if ("div".equals(op))
				display = left / display;
		}
	}

	private void onOperator(String button) {
		if (state == 1) {
			state = 2;
			op = button;
		}
	}

	private void onClear() {
		state = 0;
		display = 0;
	}

	public int getDisplay() {
		return display;
	}

}
