class Temperature {
    private double celsius;

    public void setCelsius(double c) {
        celsius = c;
    }

    public double getCelsius() { return celsius; }

    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.setCelsius(37);
        System.out.println("Fahrenheit: " + t.getFahrenheit());
    }
}

