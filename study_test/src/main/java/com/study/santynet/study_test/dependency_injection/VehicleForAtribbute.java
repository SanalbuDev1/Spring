package com.study.santynet.study_test.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VehicleForAtribbute {

    @Value("Volkswagen}")
    private String mark;
    @Value("2016}")
    private String model;
    @Autowired
    private EngineForAtribbute engineForAtribbute;
    

    public VehicleForAtribbute(String mark, String model, EngineForAtribbute engine) {
        this.mark = mark;
        this.model = model;
        this.engineForAtribbute = engine;
    }

    public VehicleForAtribbute(){
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineForAtribbute getEngineForAtribbute() {
        return engineForAtribbute;
    }

    public void setEngineForAtribbute(EngineForAtribbute engineForAtribbute) {
        this.engineForAtribbute = engineForAtribbute;
    }

    @Override
    public String toString() {
        return "VehicleForAtribbute [mark=" + mark + ", model=" + model + ", engineForAtribbute=" + engineForAtribbute
                + "]";
    }

   

    
    
    
}
