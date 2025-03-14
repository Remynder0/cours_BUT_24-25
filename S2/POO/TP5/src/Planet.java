
public enum Planet {
    MERCURY (3.303e+23, 2.4397e6){
        @Override
        public Planet suivant() {
            return VENUS;
        }
    },
    VENUS   (4.869e+24, 6.0518e6){
        @Override
        public Planet suivant() {
            return EARTH;
        }
    },
    EARTH   (5.976e+24, 6.37814e6){
        @Override
        public Planet suivant() {
            return MARS;
        }
    },
    MARS    (6.421e+23, 3.3972e6){
        @Override
        public Planet suivant() {
            return JUPITER;
        }
    },
    JUPITER (1.9e+27,   7.1492e7){
        @Override
        public Planet suivant() {
            return SATURN;
        }
    },
    SATURN  (5.688e+26, 6.0268e7){
        @Override
        public Planet suivant() {
            return URANUS;
        }
    },
    URANUS  (8.686e+25, 2.5559e7){
        @Override
        public Planet suivant() {
            return NEPTUNE;
        }
    },
    NEPTUNE (1.024e+26, 2.4746e7){
        @Override
        public Planet suivant() {
            return null;
        }
    };


    private final double mass;
    private final double radius;
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double mass()   { return mass; }
    public double radius() { return radius; }

    public void afficherPosition() {
        String Position = ordinal() + 1 == 1 ? "1ère" : ordinal() + 1 == 2 ? "2ème" : ordinal() + 1 + "ème";
        System.out.println(name() + " est la " + Position + " planète du système solaire.");
    }

    // universal gravitational constant  (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;

    public double graviteDeSurface() {
        return G * mass / (radius * radius);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "masse= " + mass +
                ", rayon= " + radius +
                ", gravité de surface= " + graviteDeSurface() +
                '}';
    }

    public abstract Planet suivant();

    public Planet precedente() {
        Planet[] planets = values();
        int index = ordinal();
        if (index == 0) {
            return null;
        } else {
            return planets[index - 1];
        }
    }

}

