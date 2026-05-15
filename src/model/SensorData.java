package model;

import java.time.LocalDateTime;

// DADO (Entidade)
public class SensorData {

    private String type;
    private int value; // módulo
    private LocalDateTime timestap; // hora em que o dado foi gerado

    public SensorData(String type, int value, LocalDateTime timestap) {
        this.type = type;
        this.value = value;
        this.timestap = timestap;
    }

    public LocalDateTime getTimestap() {
        return timestap;
    }

    public int getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setTimestap(LocalDateTime timestap) {
        this.timestap = timestap;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return false;
    }
}