class CommandLine {
    public static void main(String[] args) {
        int x, y, res;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        res = x + y;
        System.out.println(res);
    }
}