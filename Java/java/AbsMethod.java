class Shape {
    abstract void draw();  // No body here
}

class AbsMethod extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
	public static void main(String args[])
	{
		Shape cr = new AbsMethod();
		cr.draw();
	}
}
