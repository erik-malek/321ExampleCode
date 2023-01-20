public class Calculator {
    public static void main(String[] args) {
        GUICalDriver gui;
        ComputeEngine cpu;
        
        cpu = new ComputeEngine();
        gui = new GUICalDriver(cpu);
    }
}
