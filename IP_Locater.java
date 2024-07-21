    package ip_locater; 
 
import java.util.HashMap; 
import java.util.Scanner; 
import java.util.regex.Pattern; 
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class IP_Locater { 

    public static void main(String[] args) { 
         
        HashMap<String, int[]> Range = new HashMap<String, int[]>(); 
 
        // Adding IP ranges with country names 
        Range.put("Australia", new int[]{convert("1.0.0.0"), convert("1.255.255.254")}); 
        Range.put("European Union", new int[]{convert("2.0.0.0"), convert("2.255.255.254")}); 
        Range.put("United States", new int[]{convert("3.0.0.0"), convert("3.255.255.254")}); 
        Range.put("United States", new int[]{convert("4.0.0.0"), convert("4.255.255.254")}); 
        Range.put("United States", new int[]{convert("5.0.0.0"), convert("5.255.255.254")}); 
        Range.put("United States", new int[]{convert("6.0.0.0"), convert("6.255.255.254")}); 
        Range.put("United States", new int[]{convert("7.0.0.0"), convert("7.255.255.254")}); 
        Range.put("United States", new int[]{convert("8.0.0.0"), convert("8.255.255.254")}); 
        Range.put("United States", new int[]{convert("9.0.0.0"), convert("9.255.255.254")}); 
        Range.put("Private Network", new int[]{convert("10.0.0.0"), convert("10.255.255.254")}); 
        Range.put("United States", new int[]{convert("11.0.0.0"), convert("11.255.255.254")}); 
        Range.put("United States", new int[]{convert("12.0.0.0"), convert("12.255.255.254")}); 
        Range.put("United States", new int[]{convert("13.0.0.0"), convert("13.255.255.254")}); 
        Range.put("China", new int[]{convert("14.0.0.0"), convert("14.255.255.254")}); 
        Range.put("United States", new int[]{convert("15.0.0.0"), convert("15.255.255.254")}); 
        Range.put("United States", new int[]{convert("16.0.0.0"), convert("16.255.255.254")}); 
        Range.put("United States", new int[]{convert("17.0.0.0"), convert("17.255.255.254")}); 
        Range.put("United States", new int[]{convert("18.0.0.0"), convert("18.255.255.254")}); 
        Range.put("United States", new int[]{convert("19.0.0.0"), convert("19.255.255.254")}); 
        Range.put("United States", new int[]{convert("20.0.0.0"), convert("20.255.255.254")}); 
        Range.put("United States", new int[]{convert("21.0.0.0"), convert("21.255.255.254")}); 
        Range.put("United States", new int[]{convert("22.0.0.0"), convert("22.255.255.254")}); 
        Range.put("United States", new int[]{convert("23.0.0.0"), convert("23.255.255.254")}); 
        Range.put("United States", new int[]{convert("24.0.0.0"), convert("24.255.255.254")}); 
        Range.put("United States", new int[]{convert("25.0.0.0"), convert("25.255.255.254")}); 
        Range.put("United States", new int[]{convert("26.0.0.0"), convert("26.255.255.254")}); 
        Range.put("South Korea", new int[]{convert("27.0.0.0"), convert("27.255.255.254")}); 
        Range.put("Reserved", new int[]{convert("28.0.0.0"), convert("28.255.255.254")}); 
        Range.put("Reserved", new int[]{convert("29.0.0.0"), convert("29.255.255.254")}); 
        Range.put("Reserved", new int[]{convert("30.0.0.0"), convert("30.255.255.254")}); 
        Range.put("Reserved", new int[]{convert("31.0.0.0"), convert("31.255.255.254")}); 
        Range.put("Reserved", new int[]{convert("32.0.0.0"), convert("32.255.255.254")}); 
        Range.put("United States", new int[]{convert("33.0.0.0"), convert("33.255.255.254")}); 
        Range.put("Reserved", new int[]{convert("34.0.0.0"), convert("34.255.255.254")}); 
        Range.put("Japan", new int[]{convert("35.0.0.0"), convert("35.255.255.254")}); 
        Range.put("China", new int[]{convert("36.0.0.0"), convert("36.255.255.254")}); 
        Range.put("China", new int[]{convert("37.0.0.0"), convert("37.255.255.254")}); 
        Range.put("United States", new int[]{convert("38.0.0.0"), convert("38.255.255.254")}); 
        Range.put("China", new int[]{convert("39.0.0.0"), convert("39.255.255.254")}); 
        Range.put("United States", new int[] {convert("40.0.0.0")});
        Range.put("United States", new int[]{convert("40.0.0.0"), convert("40.255.255.254")});  
        Range.put("African Network Information Center", new int[]{convert("41.0.0.0"), convert("41.255.255.254")}); 
        Range.put("China", new int[]{convert("42.0.0.0"), convert("42.255.255.254")}); 
        Range.put("Reserved", new int[]{convert("43.0.0.0"), convert("43.255.255.254")}); 
        Range.put("Reserved", new int[]{convert("44.0.0.0"), convert("44.255.255.254")}); 
        Range.put("United States", new int[]{convert("45.0.0.0"), convert("45.255.255.254")}); 
        Range.put("United States", new int[]{convert("46.0.0.0"), convert("46.255.255.254")}); 
        Range.put("United States", new int[]{convert("47.0.0.0"), convert("47.255.255.254")}); 
        Range.put("Reserved", new int[]{convert("48.0.0.0"), convert("48.255.255.254")}); 
        Range.put("United States", new int[]{convert("49.0.0.0"), convert("49.255.255.254")}); 
        Range.put("United States", new int[]{convert("50.0.0.0"), convert("50.255.255.254")}); 
        Range.put("United States", new int[]{convert("51.0.0.0"), convert("51.255.255.254")}); 
        Range.put("China", new int[]{convert("52.0.0.0"), convert("52.255.255.254")}); 
        Range.put("United States", new int[]{convert("53.0.0.0"), convert("53.255.255.254")}); 
        Range.put("United States", new int[]{convert("54.0.0.0"), convert("54.255.255.254")}); 
        Range.put("United States", new int[]{convert("55.0.0.0"), convert("55.255.255.254")}); 
        Range.put("Reserved", new int[]{convert("56.0.0.0"), convert("56.255.255.254")}); 
        Range.put("United States", new int[]{convert("57.0.0.0"), convert("57.255.255.254")}); 
        Range.put("China", new int[]{convert("58.0.0.0"), convert("58.255.255.254")}); 
        Range.put("China", new int[]{convert("59.0.0.0"), convert("59.255.255.254")}); 
        Range.put("China", new int[]{convert("60.0.0.0"), convert("60.255.255.254")}); 
 
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter your IP Address:"); 
        String ip = scan.nextLine(); 
     
         
         
        IPPatterns(ip); 
         
        int ipInt = convert(ip); 
        String country = findCountry(ipInt, Range); 
        System.out.println("The IP address " + ip + " belongs to: " + country); 
         
          
    } 
 
    public static int convert(String ip) { 
        String[] st = ip.split("\\."); 
        int result = 0; 
        for (String str : st) { 
            result = (result << 8) + Integer.parseInt(str);             //convert the string element to an integer 
        } 
        return result; 
    } 
     
    public  static  void IPPatterns(String ip) { 
     
      final String IPV4_PATTERN = "\\\\b((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\\\b";                                  
      final String IPV6_PATTERN = "\\\\b((?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}|(?:[0-9a-fA-F]{1,4}:){1,7}:|(?:[0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|(?:[0-9a-fA-F]{1,4}:){1,5}(?::[0-9a-fA-F]{1,4}){1,2}|(?:[0-9a-fA-F]{1,4}:){1,4}(?::[0-9a-fA-F]{1,4}){1,3}|(?:[0-9a-fA-F]{1,4}:){1,3}(?::[0-9a-fA-F]{1,4}){1,4}|(?:[0-9a-fA-F]{1,4}:){1,2}(?::[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:(?:(?::[0-9a-fA-F]{1,4}){1,6})|:(?:(?::[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(?::[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(?:ffff(?::0{1,4}){0,1}:){0,1}(?:(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])|(?:[0-9a-fA-F]{1,4}:){1,4}:(?:(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9]))\\\\b"; 
 
    
        Pattern IPV4_REGEX = Pattern.compile(IPV4_PATTERN); 
        Pattern IPV6_REGEX = Pattern.compile(IPV6_PATTERN); 
 
        // Matcher for IPv4 
        Matcher ipv4Matcher = IPV4_REGEX.matcher(ip); 
 
        // Matcher for IPv6 
        Matcher ipv6Matcher = IPV6_REGEX.matcher(ip); 
 
        if (ipv4Matcher.matches()) { 
            System.out.println("IPv4 address detected."); 
        } else if (ipv6Matcher.matches()) { 
            System.out.println("IPv6 address detected."); 
        } else { 
            System.out.println("Invalid IP address format."); 
        } 
         
    } 
public static String findCountry(int ip, HashMap<String, int[]> Range) { 
        for (HashMap.Entry<String, int[]> entry : Range.entrySet()) { 
            int[] range = entry.getValue(); 
            if (ip >= range[0] && ip <= range[1]) { 
                return entry.getKey(); 
            } 
        } 
        return "Unknown"; 
    } 
}

//reft for ip i 

//angular 