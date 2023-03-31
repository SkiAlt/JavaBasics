package TimeConverter;

public class TimeConverter {
        public double hourstominutes(double x) {
                double minutes = x * 60;
                return minutes;
        }

        public double minutestohours(double x) {
                double hours = x / 60;
                return hours;
        }

        public double hourstoseconds(double x) {
                double seconds = x * 3600;
                return seconds;
        }

        public double secondstohours(double x) {
                double hours = x / 3600;
                return hours;
        }
}
