import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.Pattern;

// ┘ └ ┌ ┐ ├ ┤ ┴ ┬ ┼ │ ─
public class Sys implements Serializable {
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_YELLOW = "\u001B[33m";

    public static final Pattern STAFF_ID = Pattern.compile("^N+V+[0-9]{3}$");
    public static final Pattern PHONE_FORMAT =Pattern.compile("^0[0-9]{10}$");
    public static final Pattern CCCD_FORMAT = Pattern.compile("^0[0-9]{12}$");

    static String repeatStr(String str, int n) {
        String line = "";
        for (int i = 0; i < n; i++)
            line += str;
        return line;
    }

    // Nhận input id nhân viên
    public static String takeStaffIDInput(String nhapGi) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(Sys.toGreenText(nhapGi));
            try {
                String input = sc.nextLine();
                if (input.isEmpty())
                    Sys.printError("Bạn chưa có nhập gì hết");
                else if (input.length() != 5)
                    Sys.printError("ID Nhân Viên phải có 5 kí tự");
                else if (!(STAFF_ID.matcher(input).find())) {
                    Sys.printError("ID nhân viên không đúng định dạng");
                } else
                    return input;
            } catch (NoSuchElementException e) {
                Sys.printError("Bạn chưa có nhập gì hết");
            }
        }

    }

    // Nhận input float
    public static float takeFloatInput(String nhapGi) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(Sys.toGreenText(nhapGi));
            try {
                return Float.parseFloat(sc.nextLine());
            } catch (NumberFormatException e) {
                Sys.printError("Bạn chỉ được phép nhập số");
            }
        }
    }

    // Nhận input int
    public static int takeIntegerInput(String nhapGi) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(Sys.toGreenText(nhapGi));
            try {
                int input = Integer.parseInt(sc.nextLine());
                if (input <= 0)
                    Sys.printError("Không chấp nhận số <= 0");
                else
                    return input;
            } catch (NumberFormatException e) {
                Sys.printError("Bạn chỉ được phép nhập số");
            }
        }
    }

    public static int takeSoLuongCanTao(String nhapGi) {
        int num;
        while (true) {
            num = Sys.takeIntegerInput(nhapGi);
            if (num > 5) {
                Sys.printMessage("Số lượng của bạn hơi nhiều");
                System.out.println("1. Tiếp tục");
                System.out.println("2. Nhập lại");
                if (Sys.takeInputChoice(1, 2) == 1)
                    return num;
                else
                    continue;
            }
            break;
        }
        return num;
    }

    public static String takeStringInput(String nhapGi) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(Sys.toGreenText(nhapGi));
            try {
                String input = sc.nextLine();
                if (input.isEmpty())
                    Sys.printError("Bạn chưa có nhập gì hết");
                else if (input.length() > 30)
                    Sys.printError("Chiều dài chuỗi vượt quá quy định");
                else
                    return input;
            } catch (NoSuchElementException e) {
                Sys.printError("Bạn chưa có nhập gì hết");
            }
        }
    }

    public static int takeInputChoice(int min, int max) {
        String choice;
        Scanner sc = new Scanner(System.in);
        int sln = 0;
        while (true) {
            if (sln == 0)
                System.out.print(toGreenText("Nhập lựa chọn: "));
            else if (sln < 2)
                System.out.print("Nhập lại lựa chọn: ");
            else
                System.out.print(Sys.toYellowText("Hãy nhìn lại lựa chọn rồi nhập -_- : "));
            choice = sc.nextLine();
            try {
                int result = Integer.parseInt(choice);
                if (result >= min && result <= max)
                    return result;
                printError("Lựa chọn của bạn không đúng lắm");
            } catch (NumberFormatException e) {
                Sys.printError("Bạn chỉ được phép nhập số");
            }
            sln++;
        }
    }

    public static String takeDateInput(String nhapGi) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(Sys.toGreenText(nhapGi));
            try {
                String input = sc.nextLine();
                if (input.isEmpty())
                    Sys.printError("Bạn chưa có nhập gì hết");
                else if (input.length() > 14)
                    Sys.printError("Chiều dài chuỗi vượt quá 14");
                else if (!checkDateFormat(input))
                    Sys.printError("Ngày không đúng định dạng");
                else
                    return input;
            } catch (NoSuchElementException e) {
                Sys.printError("Bạn chưa có nhập gì hết");
            }
        }
    }

    public static String takePhoneNumberInput(String nhapGi) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(Sys.toGreenText(nhapGi));
            try {
                String input = sc.nextLine();
                int check = Integer.parseInt(input);
                if (input.isEmpty())
                    Sys.printError("Bạn chưa có nhập gì hết");
                else if (input.length() != 10 && !PHONE_FORMAT.matcher(input).find())
                    Sys.printError("Số điện thoại không hợp lệ");
                else
                    return input;
            } catch (NoSuchElementException e) {
                Sys.printError("Bạn chưa có nhập gì hết");
            } catch (NumberFormatException e) {
                Sys.printError("Điện thoại chỉ chấp nhận số");
            }
        }
    }

    // Load file tham số obj là obj là cần load. Trả về null nếu lỗi và obj nếu đúng
    public static Object load(Object obj, String filename) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            obj = ois.readObject();
        } catch (IOException | ClassNotFoundException | NullPointerException | NoClassDefFoundError IOE) {
            printError("Load " + filename + " thất bại => tạo dữ liệu mặc định");
            return null;
        }
        printMessage("Load " + filename + " thành công");
        return obj;
    }

    // Save file tham số obj là obj cần save
    public static void save(Object obj, String filename) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(obj);
            Sys.printMessage("Save " + filename + " thành công");
        } catch (IOException e) {
            e.printStackTrace();
            Sys.printError("Save " + filename + " thất bại");
        }
    }

    public static String getDateNow() {
        LocalDate date = LocalDate.now();
        return date.getDayOfMonth() + "/" + date.getMonthValue() + "/" + date.getYear();
    }


    public static void clearScreen() {
        Sys.printMessage("Nhập bất kỳ để tiếp tục");
        Scanner cn = new Scanner(System.in);
        cn.nextLine();
        System.out.printf("%5s", repeatStr("\n", 5));
    }

    public static void printMessage(String message) {
        System.out.printf("%30s " + TEXT_GREEN + " *** %s *** " + TEXT_RESET + " %30s%n", Sys.repeatStr(" ", 30),
                message, Sys.repeatStr(" ", 30));
    }

    public static String printError(String message) {
        System.out.printf("%30s " + TEXT_RED + " *** %s *** " + TEXT_RESET + " %30s%n", Sys.repeatStr(" ", 30), message,
                Sys.repeatStr(" ", 30));
        return message;
    }

    public static boolean checkDateFormat(String date) {
        try {
            String[] part = date.split("/");
            int day = Integer.parseInt(part[0]);
            int month = Integer.parseInt(part[1]);
            int year = Integer.parseInt(part[2]);
            int maxDay = 31;
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    maxDay = 31;
                    break;
                case 4, 6, 9, 11:
                    maxDay = 30;
                    break;
                case 2:
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        maxDay = 29;
                    } else {
                        maxDay = 28;
                    }
                    break;
                default:
                    return false;

            }
            if (day <= 0 || day > maxDay)
                return false;

            return year > 2000 && year < 2030;
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            return false;
        }
    }


    public static String toBlueText(String text) {
        return TEXT_BLUE + text + TEXT_RESET;
    }

    public static String toGreenText(String text) {
        return TEXT_GREEN + text + TEXT_RESET;
    }

    public static String toYellowText(String text) {
        return TEXT_YELLOW + text + TEXT_RESET;
    }

    // kiểm tra thời gian có nằm trong khoàng thời gian nào đó hay không
    public static boolean kiemTraKhoangThoiGian(String from, String between, String to) {
        Date dateFrom;
        Date dateTo;
        Date dateBetween;
        try {
            dateFrom = new SimpleDateFormat("dd/MM/yyyy").parse(from);
            dateTo = new SimpleDateFormat("dd/MM/yyyy").parse(to);
            dateBetween = new SimpleDateFormat("dd/MM/yyyy").parse(between);
        } catch (ParseException e) {
            return false;
        }

        return dateBetween.after(dateFrom) && dateBetween.before(dateTo);
    }

    public static String Check_email(String nhapGi) {
        Scanner sc = new Scanner(System.in);
        String Match = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        while (true) {
            System.out.print(Sys.toGreenText(nhapGi));
            try {
                String input = sc.nextLine();
                if (Pattern.matches(Match, input) == true)
                    return input;
                else if (input.isEmpty())
                    Sys.printError("Bạn chưa có nhập gì hết");
                else if (input.length() >= 30)
                    Sys.printError("Chiều dài chuỗi vượt quá quy định");
                else
                    Sys.printError("Không đúng định dạng email");

            } catch (NoSuchElementException e) {
                Sys.printError("Bạn chưa có nhập gì hết");
            }
            // catch (Exception e){
            // return Sys.printError("Không đúng định dạng email");
            // }
        }
    }

    public static String nhapIDNhaCungCap(DanhSachNhaCC dsncc) {
        String idncc;
        do {
            dsncc.xuatDS();
            idncc = Sys.takeStringInput("Nhập ID nhà cung cấp: ");
            if (dsncc.timKiemTheoID(idncc) == null)
                printError("Không có nhà cung cấp này");
            else
                return idncc;
        } while (true);
    }

    public static Boolean takeBoolean(String NhapGi) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(Sys.toGreenText(NhapGi));
            String chon = sc.nextLine();
            if (chon.equals("Y")) {
                return true;
            }
            if (chon.equals("N")) {
                return false;
            } else {
                Sys.printError("****Nhập lại****");
            }

        } while (true);

    }

    public static String takeMaSP() {
        Scanner sc = new Scanner(System.in);
        String Match1 = "F{1}\\d{3}";
        String Match2 = "D{1}\\d{3}";
        String maSP;
        do {
            System.out.print(Sys.toGreenText("Nhập mã SP theo form D (hoặc F) theo sao là 3 số: "));
            maSP = sc.nextLine();
            if (Pattern.matches(Match1, maSP) == false && Pattern.matches(Match2, maSP) == false) {
                Sys.printError("Nhập ai form!! Nhập lại");
            } else {
                return maSP;
            }

        } while (true);
    }

    public static String takeDate_expiry(String date){
        String[] part = date.split("/");
        int day = Integer.parseInt(part[0]);
        int month = Integer.parseInt(part[1]);
        int year = Integer.parseInt(part[2]);
        int year_ex = year + 2;

        return day+"/"+month+"/"+year_ex;
    }
    public static boolean subStrInStrIgnoreCase(String str, String subStr)
    {
        return str.toLowerCase(Locale.ROOT).contains(subStr.toLowerCase(Locale.ROOT));
    }
    public static String nhapMaSP(ListProducts kho) {
        String maSP;
        do {
            kho.xuatDS();
            maSP = Sys.takeStringInput("Nhập mã sản phẩm: ");
            if (kho.timkiemsp(maSP) == null)
                printError("Không có mã sản phầm này");
            else
                return maSP;
        } while (true);
    }
    public static String takeGenderInput(String nhapGi){
        System.out.println(nhapGi);
        System.out.println("1.Nam");
        System.out.println("2.Nữ");
        System.out.println("3.Khác");
        while (true){
            int choice = takeInputChoice(1,3);
            switch (choice) {
                case 1:
                    return "Nam";
                case 2:
                    return "Nữ";
                case 3:
                    return "Khác";
            }
        }
    }
    public static String takeCMND(String nhapGi) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(Sys.toGreenText(nhapGi));
            try {
                String input = sc.nextLine();
                double check = Double.parseDouble(input);
                if (input.isEmpty())
                    Sys.printError("Bạn chưa có nhập gì hết");
                else if (input.length() != 12 && !CCCD_FORMAT.matcher(input).find())
                    Sys.printError("Số CCCD không hợp lệ");
                else
                    return input;
            } catch (NoSuchElementException e) {
                Sys.printError("Bạn chưa có nhập gì hết");
            } catch (NumberFormatException e) {
                Sys.printError("CCCD chỉ chấp nhận số");
            }
        }
    }
    public static String checkAddress(String nhapGi) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(Sys.toGreenText(nhapGi));
            try {
                String input = sc.nextLine();
                if (input.isEmpty())
                    Sys.printError("Bạn chưa có nhập gì hết");
                else if (input.length() >= 15)
                    Sys.printError("Chiều dài chuỗi vượt quá quy định");
                else
                    return input;
            } catch (NoSuchElementException e) {
                Sys.printError("Bạn chưa có nhập gì hết");
            }
        }
    }
}
