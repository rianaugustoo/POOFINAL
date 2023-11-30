package com.mycompany.fruitmain.newback;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class GraficoMain extends JFrame {

    public GraficoMain() {
        super("Grafico de Venda");

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("A", Integer.valueOf(75));
        pieDataset.setValue("B", Integer.valueOf(10));
        pieDataset.setValue("C", Integer.valueOf(10));
        pieDataset.setValue("D", Integer.valueOf(5));

        JFreeChart grafico = ChartFactory.createPieChart(
                "Título do Gráfico", // Título do gráfico
                pieDataset,
                true,
                true,
                false
        );

        this.add(new ChartPanel(grafico));
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Adicione esta linha para fechar o aplicativo ao fechar a janela.
        this.setVisible(true);

    }

    public static void main(String[] args) {

    }
}
