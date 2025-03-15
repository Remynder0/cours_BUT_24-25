public class Intervalle {
    private double min;
    private double max;

    public Intervalle() {
        this.min = 0;
        this.max = 0;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public void setMinMax(double min, double max) {
        this.max = max;
        this.min = min;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Intervalle) {
            Intervalle other = (Intervalle) obj;
            return this.min == other.min && this.max == other.max;
        }
        return false;
    }

    public double getLongueur() {
        return this.max - this.min;
    }

    public boolean estInclusee(Intervalle inter) {
        return this.min <= inter.min && this.max >= inter.max;
    }
}