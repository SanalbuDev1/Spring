package com.study.santynet.study_test.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VehicleForConstructor {

    private String mark;
    private String model;
    private EngineForConstructor engineForConstructor;    

    @Autowired
    public VehicleForConstructor(@Value("nissan") String mark, @Value("2020")String model, EngineForConstructor engine) {
        this.mark = mark;
        this.model = model;
        this.engineForConstructor = engine;
    }

    public VehicleForConstructor(){
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
    
    public EngineForConstructor getEngineForConstructor() {
        return engineForConstructor;
    }

    public void setEngineForConstructor(EngineForConstructor engineForConstructor) {
        this.engineForConstructor = engineForConstructor;
    }

    @Override
    public String toString() {
        return "VehicleForConstructor [mark=" + mark + ", model=" + model + ", engineForConstructor="
                + engineForConstructor + "]";
    }   

   

    
    
    
}
