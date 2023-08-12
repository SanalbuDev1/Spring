package com.study.santynet.study_test.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EngineForSetter {
        private String mark;
        private String model;

        public EngineForSetter(String mark, String model) {
            this.mark = mark;
            this.model = model;
        }

        public EngineForSetter() {
        }

        public String getMark() {
            return mark;
        }

        @Value("Mit2")
        public void setMark(String mark) {
            this.mark = mark;
        }

        public String getModel() {
            return model;
        }

        @Value("2021")
        public void setModel(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "ForAtribbute [mark=" + mark + ", model=" + model + "]";
        }
        
        

    }
