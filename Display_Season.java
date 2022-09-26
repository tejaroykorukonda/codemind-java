import java.util.Scanner;
class Season
{
           public static void main(String[] args)
{
    int season =0;
    Scanner sc =new Scanner (System.in);
    season = sc.nextInt(); 
        switch(season)
        {
            case 4:
            case 5:  
          case 6:
        System.out.println("Summer");
        break;
        case 7: 
        case 8:  
        case 9:
        case 10:
      System.out.println("Rainy");
      break;
      case 11:
     case 12:
    case 1:
 System.out.println("Winter");
                          break;
case 2:
 case 3:
     System.out.println("Spring");
                          break;
                           default:
            System.out.println("-1");
            break;
        }
    }
}
                                                            
            
        