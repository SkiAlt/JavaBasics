package DistanceConverter;

public class DistanceConverter {
        public double metertokm(double x) {
                double km = x * 0.001;
                return km;
        }

        public double kmtometer(double x) {
                double meter = x / 0.001;
                return meter;
        }

        public double milestokm(double x) {
                double km = x * 1.60934;
                return km;
        }

        public double kmtomiles(double x) {
                double miles = x / 1.60394;
                return miles;
        }
}
