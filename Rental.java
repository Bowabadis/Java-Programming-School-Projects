public class Rental {
    Equipment equipment;
    int basePrice = 0;

    public final static int MIN_IN_HOUR = 60;
    public final static int MONEY_PER_HOUR = 40;
    String contractNum;
    int hours;
    int minutes;
    int price;
    int equipmentType;
    String contactPhone;
    Rental(String num, int min, int equipNum){
        setContractNumber(num);
        if(equipNum>0 && equipNum<6){
            equipment = new EquipmentWithLesson(equipNum);
        } else {
            equipment = new EquipmentWithoutLesson(equipNum);
        }
        setHoursAndMinutes(min);
    }
    public void setEquipmentType(int type){
        equipmentType = type;
    }
    public int getEquipmentType(){
        return equipmentType;
    }
    public void setContactPhone(String phone){
        String newPhone = "";
        for(int i = 0; i<phone.length(); i++){
            char c = phone.charAt(i);
            if(Character.isDigit(c)){
                newPhone = newPhone + c;
            }
        }
        if(!(newPhone.length() == 10)){
            newPhone = "0000000000";
        }
        this.contactPhone = newPhone;
    }
    public void setContractNumber(String contract) {
        contract = contract.toUpperCase();
        if((contract.length() == 4) && (Character.isLetter(contract.charAt(0))) && (Character.isDigit(contract.charAt(1))) && (Character.isDigit(contract.charAt(2))) && (Character.isDigit(contract.charAt(3)))){
        } else {
            contract = "A000";
        }
        this.contractNum = contract;
    }
    public void setHoursAndMinutes(int min){
        hours = min/MIN_IN_HOUR;
        minutes = min%MIN_IN_HOUR;
        if(minutes>40){
            basePrice = hours*40 + 40;
        } else {
            basePrice = (hours*MONEY_PER_HOUR) + minutes;
        }
        price = basePrice + equipment.getFee();
    }
    public String getContractNum(){ return contractNum; }
    public int getHours(){ return hours; }
    public int getMinutes(){ return minutes; }
    public int getPrice(){ return price; }
    public String getContactPhone(){
        String newContact = "";
        for(int i = 0; i<contactPhone.length(); i++){
            char c = contactPhone.charAt(i);
            switch (i){
                case 0: newContact = "(";
                case 1:
                case 2: newContact += c; break;
                case 3: newContact += ") ";
                case 4:
                case 5: newContact += c; break;
                case 6: newContact += "-";
                case 7:
                case 8:
                case 9: newContact += c; break;
            }
        }
        return newContact;
    }
}
