package $98_2022_KAKAO_BLIND_RECRUITMENT;

import java.util.*;

class Car {
    String inTime;
    String outTime;
    int totalTime;
    boolean status;
    Car(String inTime, String outTime, int totalTime, boolean status) {
        this.inTime = inTime;
        this.outTime = outTime;
        this.totalTime = totalTime;
        this.status = status;
    }
}

public class $02_주차_요금_계산_Lv2 {

	public int getUseTime(String inTime, String outTime) {
        int[] answer = {};
        
        int useTime = 0;
        String[] tempInTime = inTime.split(":");
        String[] tempOutTime = outTime.split(":");
        
        String inTimeHour   = tempInTime[0];
        String inTimeMinute = tempInTime[1];
        
        String outTimeHour   = tempOutTime[0];
        String outTimeMinute = tempOutTime[1];
        
        int useHour = Integer.parseInt(outTimeHour) - Integer.parseInt(inTimeHour);
        int useMinute = Integer.parseInt(outTimeMinute) - Integer.parseInt(inTimeMinute);
        if(useMinute < 0) {
            useHour--;
            useMinute += 60;
        }
        
        useTime = (useHour * 60) + useMinute;
        return useTime;
    }
    
    public int[] solution(int[] fees, String[] records) {
        
        int[] answer = {};
        HashMap<String, Car> carMap = new HashMap<String, Car>();
        for(int i = 0 ; i < records.length ; i++) {
            String[] temp = records[i].split(" ");
            Car car = new Car("00:00", "23:59", 0, false);
            carMap.put(temp[1], car);
        }
        
        for(int i = 0 ; i < records.length ; i++) {
            String[] temp = records[i].split(" ");
            Car car =  carMap.get(temp[1]);
            String inTime = car.inTime;
            String outTime = car.outTime;
            int totalTime = car.totalTime;
            boolean status = car.status;
            
            if("IN".equals(temp[2])) {
                Car newCar = new Car(temp[0], "23:59", totalTime, false);
                carMap.put(temp[1], newCar);
            } else {
                int useTime = getUseTime(inTime, temp[0]);
                Car newCar = new Car(inTime, outTime, totalTime + useTime, true);
                carMap.put(temp[1], newCar);
            }
        }
        
        String[] carNoArr = new String[carMap.size()];
        int count = 0;
        for(String key : carMap.keySet()) {
            Car car = carMap.get(key);
            String inTime = carMap.get(key).inTime;
            String outTime = carMap.get(key).outTime;
            int totalTime = carMap.get(key).totalTime;
            if(!car.status) {
                int useTime = getUseTime(inTime, outTime);
                Car newCar = new Car(inTime, outTime, totalTime + useTime, true);
                carMap.put(key, newCar);
            }
            carNoArr[count] = key;
            count++;
        }
        
        Arrays.sort(carNoArr);
        
        answer = new int[carNoArr.length];
        for(int i = 0 ; i < carNoArr.length ; i++) {
            Car car = carMap.get(carNoArr[i]);
            
            int totalTime = car.totalTime;
            
            int sum = 0;
            
            if(fees[0] >= totalTime) {
                sum = fees[1];
            } else {
                totalTime -= fees[0];
                sum += fees[1];
                
                if(totalTime % fees[2] != 0) {
                    sum += ((totalTime / fees[2]) + 1) * fees[3];
                } else {
                    sum += (totalTime / fees[2]) * fees[3];
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}
