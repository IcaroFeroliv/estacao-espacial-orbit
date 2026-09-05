import java.util.Random;

public class SuporteVida {

    public static void verificarSuporteDeVida() {
        Random random = new Random();
        
        // Simulação de leitura de sensores
        int nivelOxigenio = 85 + random.nextInt(16); // Gera um valor entre 85 e 100
        boolean pressaoEstavel = random.nextInt(10) > 2; // 70% de chance de estar estável
        String[] statusAgua = {"Operacionais e limpos", "Filtragem em Nível Máximo", "Requer manutenção preventiva"};
        
        System.out.println("==========================================================");
        System.out.println(" 🚀 ESTAÇÃO ESPACIAL ORBIT - TERMINAL DE CONTROLE");
        System.out.println("==========================================================");
        System.out.println("[...] Iniciando varredura dos módulos de suporte à vida...");
        
        try {
            // Pausa dramática para simular processamento do sistema
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println("Erro na leitura dos sensores.");
        }
        
        System.out.println("----------------------------------------------------------");
        
        // Diagnóstico de Oxigênio
        System.out.printf("🌬️ Nível de Oxigênio: %d%% ", nivelOxigenio);
        if (nivelOxigenio >= 95) {
            System.out.println("[IDEAL]");
        } else if (nivelOxigenio >= 90) {
            System.out.println("[ACEITÁVEL]");
        } else {
            System.out.println("[ALERTA: VENTILAÇÃO COMPLEMENTAR ATIVADA]");
        }

        // Diagnóstico de Pressão
        System.out.print("🛡️ Pressão do módulo: ");
        if (pressaoEstavel) {
            System.out.println("Estável");
        } else {
            System.out.println("Flutuante - Ajuste automático de descompressão em andamento");
        }

        // Diagnóstico de Água
        String statusAtualAgua = statusAgua[random.nextInt(statusAgua.length)];
        System.out.println("💧 Sistemas de reciclagem de água: " + statusAtualAgua);
        
        System.out.println("----------------------------------------------------------");
        System.out.println("STATUS GERAL DA MISSÃO: " + (nivelOxigenio >= 90 && pressaoEstavel ? "🟢 NOMINAL" : "🟡 REQUER ATENÇÃO DA TRIPULAÇÃO"));
        System.out.println("==========================================================");
    }

    public static void main(String[] args) {
        verificarSuporteDeVida();
    }
}