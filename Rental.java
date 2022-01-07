public class Rental {
    public final static int MIN_IN_HOUR = 60;
    public final static int MONEY_PER_HOUR = 40;
    String contractNum;
    int hours;
    int minutes;
    int price;
    int equipmentType;
    String[] typesOfEquipment = {"Personal Watercraft", "Pontoon Boat", "Rowboat", "Canoe", "Kayak", "Beach Chair", "Umbrella", "Other"};
    String contactPhone;
    Rental(String num, int min, String contact, int equipNum){
        setContractNumber(num);
        setHoursAndMinutes(min);
        setContactPhone(contact);
        setEquipmentType(equipNum);
    }
    Rental()
    {
        setContractNumber("A000");
        setHoursAndMinutes(0);
    }
    public void setEquipmentType(int type){
        if(type>typesOfEquipment.length || type<0){
            type = typesOfEquipment.length - 1;
        }
        equipmentType = type;

    }
    public int getEquipmentType(){
        return equipmentType;
    }
    public String getTypesOfEquipment(){
        return typesOfEquipment[equipmentType];
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
        if(!(contract.length() == 4) && (!Character.isLetter(contract.charAt(1))) && (!Character.isDigit(contract.charAt(2))) && (!Character.isDigit(contract.charAt(3))) && (!Character.isDigit(contract.charAt(4)))){
            contract = "A000";
        }
        this.contractNum = contract;
    }
    public void setHoursAndMinutes(int min){
        hours = min/MIN_IN_HOUR;
        minutes = min%MIN_IN_HOUR;
        if(minutes>40){
            price = hours*40 + 40;
        } else {
            price = (hours*MONEY_PER_HOUR) + minutes;
        }
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
