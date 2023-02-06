import java.util.HashMap;

public class Hashmatique {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("Am I Going Crazy", "Am I going crazy?");
    map.put(
      "Enter Sandman",
      "Say your prayers, little one, don't forget, my son"
    );
    map.put("YEAH", "OH-YEAH");
    map.put("Jingle-Bells", "Santa's coming!");

    System.out.println(map.get("Am I Going Crazy"));
    for (String key : map.keySet()) {
      System.out.println(
        String.format("Track: %s - Lyrics: %s", key, map.get(key))
      );
    }
  }
}
// import java.util.HashMap;
// public class Hashmatique {
//     public static void main(String[] args){
//         HashMap<String, String> map = new HashMap<String, String>();
//         map.put("Mr. Moon", "It is a real cold moon...");
//         map.put("Dog Day", "Doooog day, it's a real...");
//         map.put("For whom the bell", "Look at the sky and...");
//         map.put("LA LA", "La la, it's a real...");
//         System.out.println(map.get("Mr. Moon"));
//         for(String key : map.keySet()){
//             System.out.println(String.format("Track: %s - Lyrics: %s", key, map.get(key)));
//         }
//     }
// }
