package test1;

public class Test1 {

    public static void main(String[] args) {
        String string= "he";
        System.out.println(string);
        // السترنق بتقدرش تعدل عليه بعد متدخل قيمة بتنحفظ بمتغير بالرام وبنفعش تعدل عليها
        System.out.println(string+"llo");
        //هين ما عدلنا على قيمة السترنق الاساسية ولكن تترجم بالكومبايل على انها اضافة للقيمة الاصلية
        System.out.println("---------------------------");
        StringBuilder a = new StringBuilder();
        a.append("h").append("e");
        System.out.println(a);
        System.out.println("---------------------------");
        a.append("l").append("l").append("o");
        System.out.println(a);
        //على عكس السترنق هين عدلنا عل قيمة الاساسية للسترنق بلد ثم نقوم بتحوليها لسترنق
        String string2 = a.toString();
        System.out.println(string2);
        //طبعا هذه الطريقة الها فوائد مثلا بالاداء والحماية
        
     
    }
}
