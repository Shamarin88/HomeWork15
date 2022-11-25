package transport;
import java.time.LocalDate;
import java.util.regex.Pattern;

public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String tireType;
    public static Car.Key Key;
    public static Car.insurance insurance;


    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats, String tireType) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isBlank() || productionCountry.isEmpty()) {
            this.productionCountry = "Значение по умолчанию";
        } else {
            this.productionCountry = productionCountry;
        }
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "Значение по умолчанию";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isBlank() || bodyType.isEmpty()) {
            this.bodyType = "Значение по умолчанию";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "Значение по умолчанию";
        } else {
            this.registrationNumber = checkNumber(registrationNumber);
        }
        this.numberOfSeats = numberOfSeats;
        if (tireType == null || tireType.isBlank() || tireType.isEmpty()) {
            this.tireType = "Значение по умолчанию";
        } else {
            this.tireType = checkTires(tireType);
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = checkNumber(registrationNumber);
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = checkTires(tireType);
    }

    public static class Key {
        private String remoteStart;
        private String remoteAccess;

        public Key(String remoteStart, String remoteAccess) {
            this.remoteStart = remoteStart;
            this.remoteAccess = remoteAccess;
        }

        public String getRemoteStart() {
            return remoteStart;
        }

        public void setRemoteStart(String remoteStart) {
            this.remoteStart = remoteStart;
        }

        public String getRemoteAccess() {
            return remoteAccess;
        }

        public void setRemoteAccess(String remoteAccess) {
            this.remoteAccess = remoteAccess;
        }
    }

    public static class insurance {
        private LocalDate insuranceDuration;
        private double insuranceCoast;
        private String insuranceNumber;

        public insurance(LocalDate insuranceDuration, double insuranceCoast, String insuranceNumber) {
            this.insuranceDuration = insuranceDuration;
            this.insuranceCoast = insuranceCoast;
            this.insuranceNumber = insuranceNumber;
        }

        public LocalDate getInsuranceDuration() {
            return insuranceDuration;
        }

        public void setInsuranceDuration(LocalDate insuranceDuration) {
            this.insuranceDuration = checkInsuranceDuration(insuranceDuration);
        }

        public double getInsuranceCoast() {
            return insuranceCoast;
        }

        public void setInsuranceCoast(double insuranceCoast) {
            this.insuranceCoast = checkInsuranceCoast(insuranceCoast);
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        public void setInsuranceNumber(String insuranceNumber) {
            this.insuranceNumber = checkInsuranceNumber(insuranceNumber);
        }
    }

    public String checkNumber(String registrationNumber) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", registrationNumber)) {
            return registrationNumber;
        } else {
            return "Неверный номер";
        }
    }
    public String checkTires(String tireType) {
        String summerTires = "летние";
        String winterTires = "зимние";
        if (tireType == summerTires) {
            return summerTires;
        } else if (tireType == winterTires) {
            return winterTires;
        }
        return tireType;
    }
    public static double checkInsuranceCoast(double value) {
        if (value <= 0) {
            return value = 1000;
        }
        return value;
    }
    public static String checkInsuranceNumber(String insuranceNumber) {
        if (Pattern.matches("[а-яА-Яa-zA-Z0-9]{9}", insuranceNumber)) {
            return "Номер верный";
        } else {
            return "Номер не верный";
        }
    }
    public static LocalDate checkInsuranceDuration(LocalDate insuranceDuration) {
        if (LocalDate.now().isAfter(insuranceDuration)) {
            System.out.println("Страховка просрочена, оформите новую");
            return LocalDate.now();
        } else {
            return insuranceDuration;
        }
    }

    @Override
    public String toString() {
        return "Марка - " + brand +
                "\nМодель - " + model +
                "\nОбъем двигателя  " + engineVolume +
                "\nЦвет - " + color +
                "\nГод выпуска - " + productionYear +
                "\nСтрана производитель - " + productionCountry +
                "\nКоробка передач - " + transmission +
                "\nКузов - " + bodyType +
                "\nРегистрационный номер - " + registrationNumber +
                "\nКоличество сидений - " + numberOfSeats +
                "\nТип шин - " + tireType +
                "\nБез ключевой доступ - " + Car.Key.getRemoteStart() +
                "\nУдаленное открывание дверей - " + Car.Key.getRemoteAccess() +
                "\nСрок действия страховки - " + Car.insurance.getInsuranceDuration() +
                "\nСтоимость страховки - " + Car.insurance.getInsuranceCoast() +
                "\nНомер полиса - " + Car.insurance.getInsuranceNumber();

    }
}
