package com.study.santynet.study_test.dependency_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EngineForAtribbute {
        @Value("Mit}")
        private String mark;
        @Value("2016}")
        private String model;

        public EngineForAtribbute(String mark, String model) {
            this.mark = mark;
            this.model = model;
        }

        public EngineForAtribbute() {
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
