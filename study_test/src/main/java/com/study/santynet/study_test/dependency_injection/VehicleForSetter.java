package com.study.santynet.study_test.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VehicleForSetter {

    private String mark;
    private String model;
    private EngineForSetter engineForAtribbute;
    

    public VehicleForSetter(String mark, String model, EngineForSetter engine) {
        this.mark = mark;
        this.model = model;
        this.engineForAtribbute = engine;
    }

    public VehicleForSetter(){
    }

    public String getMark() {
        return mark;
    }

    @Value("Chevrolet}")
    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    @Value("2022}")
    public void setModel(String model) {
        this.model = model;
    }

    public EngineForSetter getEngineForAtribbute() {
        return engineForAtribbute;
    }

    @Autowired
    public void setEngineForAtribbute(EngineForSetter engineForAtribbute) {
        this.engineForAtribbute = engineForAtribbute;
    }

    @Override
    public String toString() {
        return "VehicleForSetter [mark=" + mark + ", model=" + model + ", engineForAtribbute=" + engineForAtribbute
                + "]";
    }
 
}
