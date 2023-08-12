package com.study.santynet.study_test.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EngineForConstructor {
        private String mark;
        private String model;
        
        public EngineForConstructor(@Value("RAC") String mark, @Value("2021") String model) {
            this.mark = mark;
            this.model = model;
        }

        public EngineForConstructor() {
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

        @Override
        public String toString() {
            return "ForAtribbute [mark=" + mark + ", model=" + model + "]";
        }
        
        

    }
