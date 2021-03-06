package ru.kunik.uct.gui;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import ru.kunik.uct.IHandler;
import ru.kunik.uct.combocalculator.CombinatoricsCalculator;
import ru.kunik.uct.combocalculator.FactorialCalculator;
import ru.kunik.uct.combocalculator.GrassmanCalculator;
import ru.kunik.uct.util.Filters;
import ru.kunik.uct.util.Rus;

public class CombocalculatorGUI extends MainGUI {
    
    private javax.swing.JPanel activeFactorPanel;
    private javax.swing.JButton combiCalculate;
    private javax.swing.JLabel combiLabel;
    private javax.swing.JLabel combinationAnswer;
    private javax.swing.JLabel combinationRepAnswer;
    private javax.swing.JLabel doubleFactorialAnswer;
    private javax.swing.JPanel doubleFactorialPanel;
    private javax.swing.JLabel factorialAnswer;
    private javax.swing.JButton factorialCalculate;
    private javax.swing.JTextField factorialInput;
    private javax.swing.JLabel factorialLabel;
    private javax.swing.JPanel factorialPanel;
    private javax.swing.JPanel factorialTextPanel;
    private javax.swing.JPanel hyperFactorialPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField kCombiInput;
    private javax.swing.JTextField nCombiInput;
    private javax.swing.JLabel permutationAnswer;
    private javax.swing.JLabel permutationRepAnswer;
    private javax.swing.JLabel placementAnswer;
    private javax.swing.JLabel placementRepAnswer;
    private javax.swing.JLabel primorialAnswer;
    private javax.swing.JPanel primorialPanel;
    private javax.swing.JPanel superFactorialPanel;
    private javax.swing.JLabel superfactorialAnswer;
    private javax.swing.JLabel waitingLabel;
    private JTextField AField1;
    private JTextField AField2;
    private JTextField BField1;
    private JTextField BField2;
    private JTextField CField2;
    private JButton grassmanCalc1;
    private JButton grassmanCalc2;
    private JLabel grassmanWaitingLabel;
    private JLabel jLabel10g;
    private JLabel jLabel11g;
    private JLabel jLabel12g;
    private JLabel jLabel13g;
    private JLabel jLabel14g;
    private JLabel jLabel1g;
    private JLabel jLabel2g;
    private JLabel jLabel3g;
    private JLabel jLabel4g;
    private JLabel jLabel5g;
    private JLabel jLabel6g;
    private JLabel jLabel7g;
    private JLabel jLabel8g;
    private JLabel jLabel9g;
    private JPanel jPanel1g;
    private JPanel jPanel3g;
    private JPanel jPanel4g;
    private JPanel jPanel5g;
    private JPanel jPanel6g;
    private JPanel jPanel7g;
    private JPanel jPanel8g;
    private JPanel jPanel9g;
    private JSeparator jSeparator1g;
    private JTextField oAB1;
    private JTextField oABC2;
    private JTextField pAB1;
    private JTextField pAB2;
    private JTextField pABC2;
    private JTextField pBC2;
    private JTextField pCA2;
    private IHandler handler;
    JFrame grassmanJFrame;
    private ActionListener buttonsActionListener;
    private MouseListener labelsMouseListener;
    
    public CombocalculatorGUI(IHandler handler) {
        super(handler, 426, 536);
        this.handler = handler;
        this.initializeGUI();
        this.initializeGrassmanGUI();
        this.initializeListeners();
        handler.getLogger().writeLog("====================================================");
        handler.getLogger().writeLog("МАИ (НИУ) / Факультет № 3 / Кафедра № 308");
        handler.getLogger().writeLog("Курсовая работа по дискретной математике Combocalculator");
        handler.getLogger().writeLog("Группа: 3О - 113Б / Кузнецов Н.В. / Москва 2014");
        handler.getLogger().writeLog("Программа Combocalculator запущена");
        handler.getLogger().writeLog("====================================================");
    }
    
    private void initializeGUI() {
        combiLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        factorialTextPanel = new javax.swing.JPanel();
        factorialLabel = new javax.swing.JLabel();
        activeFactorPanel = new javax.swing.JPanel();
        factorialInput = new javax.swing.JTextField();
        factorialCalculate = new javax.swing.JButton();
        factorialPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        factorialAnswer = new javax.swing.JLabel();
        doubleFactorialPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        doubleFactorialAnswer = new javax.swing.JLabel();
        primorialPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        primorialAnswer = new javax.swing.JLabel();
        superFactorialPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        superfactorialAnswer = new javax.swing.JLabel();
        hyperFactorialPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        nCombiInput = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        kCombiInput = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        combiCalculate = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        placementAnswer = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        placementRepAnswer = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        combinationAnswer = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        combinationRepAnswer = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        permutationAnswer = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        permutationRepAnswer = new javax.swing.JLabel();
        waitingLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel16 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        combiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        combiLabel.setText("Комбинаторные вычисления");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        factorialLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        factorialLabel.setText("Вычисление факториалов");

        javax.swing.GroupLayout factorialTextPanelLayout = new javax.swing.GroupLayout(factorialTextPanel);
        factorialTextPanel.setLayout(factorialTextPanelLayout);
        factorialTextPanelLayout.setHorizontalGroup(
            factorialTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(factorialTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(factorialLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        factorialTextPanelLayout.setVerticalGroup(
            factorialTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(factorialLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        factorialInput.setText("Введите текст");

        javax.swing.GroupLayout activeFactorPanelLayout = new javax.swing.GroupLayout(activeFactorPanel);
        activeFactorPanel.setLayout(activeFactorPanelLayout);
        activeFactorPanelLayout.setHorizontalGroup(
            activeFactorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(factorialInput)
        );
        activeFactorPanelLayout.setVerticalGroup(
            activeFactorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activeFactorPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(factorialInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        factorialCalculate.setText("Вычислить");

        jLabel1.setText("Факториал:");

        factorialAnswer.setText("Неизвестно");

        javax.swing.GroupLayout factorialPanelLayout = new javax.swing.GroupLayout(factorialPanel);
        factorialPanel.setLayout(factorialPanelLayout);
        factorialPanelLayout.setHorizontalGroup(
            factorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(factorialPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(factorialAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        factorialPanelLayout.setVerticalGroup(
            factorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(factorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(factorialAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setText("Двойной факториал:");

        doubleFactorialAnswer.setText("Неизвестно");

        javax.swing.GroupLayout doubleFactorialPanelLayout = new javax.swing.GroupLayout(doubleFactorialPanel);
        doubleFactorialPanel.setLayout(doubleFactorialPanelLayout);
        doubleFactorialPanelLayout.setHorizontalGroup(
            doubleFactorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doubleFactorialPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doubleFactorialAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        doubleFactorialPanelLayout.setVerticalGroup(
            doubleFactorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(doubleFactorialAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setText("Праймориал:");

        primorialAnswer.setText("Неизвестно");

        javax.swing.GroupLayout primorialPanelLayout = new javax.swing.GroupLayout(primorialPanel);
        primorialPanel.setLayout(primorialPanelLayout);
        primorialPanelLayout.setHorizontalGroup(
            primorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primorialPanelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(primorialAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        primorialPanelLayout.setVerticalGroup(
            primorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(primorialAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setText("Суперфакториал:");

        superfactorialAnswer.setText("Неизвестно");

        javax.swing.GroupLayout superFactorialPanelLayout = new javax.swing.GroupLayout(superFactorialPanel);
        superFactorialPanel.setLayout(superFactorialPanelLayout);
        superFactorialPanelLayout.setHorizontalGroup(
            superFactorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(superFactorialPanelLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(superfactorialAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        superFactorialPanelLayout.setVerticalGroup(
            superFactorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(superfactorialAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel9.setText("Субфакториал:");

        jLabel10.setText("Неизвестно");

        javax.swing.GroupLayout hyperFactorialPanelLayout = new javax.swing.GroupLayout(hyperFactorialPanel);
        hyperFactorialPanel.setLayout(hyperFactorialPanelLayout);
        hyperFactorialPanelLayout.setHorizontalGroup(
            hyperFactorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hyperFactorialPanelLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hyperFactorialPanelLayout.setVerticalGroup(
            hyperFactorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hyperFactorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Комбинаторные вычисления");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel12.setText("Число n:");

        nCombiInput.setText("Введите число");

        jLabel13.setText("Число k:");

        kCombiInput.setText("Введите число");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nCombiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kCombiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nCombiInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(kCombiInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        combiCalculate.setText("Вычислить");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(combiCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(combiCalculate)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel14.setText("Размещение:");

        placementAnswer.setText("Неизвестно");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placementAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(placementAnswer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel15.setText("Размещение с повторениями:");

        placementRepAnswer.setText("Неизвестно");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placementRepAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(placementRepAnswer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel16.setText("Сочетание:");

        combinationAnswer.setText("Неизвестно");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combinationAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(combinationAnswer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel17.setText("Сочетание с повторениями:");

        combinationRepAnswer.setText("Неизвестно");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combinationRepAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(combinationRepAnswer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel18.setText("Перестановка:");

        permutationAnswer.setText("Неизвестно");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permutationAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(permutationAnswer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel19.setText("Перестановка с повторениями:");

        permutationRepAnswer.setText("Неизвестно");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permutationRepAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(permutationRepAnswer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        waitingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waitingLabel.setText("Ожидание действий");

        jButton1.setText("Вычисления по формуле Грассмана");

        jLabel28.setText("Возрастающий факториал");

        jLabel29.setText("Неизвестно");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel30.setText("Убывающий факториал");

        jLabel31.setText("Неизвестно");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(factorialPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(factorialTextPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(activeFactorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(factorialCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(doubleFactorialPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(primorialPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(superFactorialPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hyperFactorialPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(waitingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(factorialTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activeFactorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factorialCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(factorialPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doubleFactorialPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(primorialPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(superFactorialPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hyperFactorialPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(waitingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pack();
    }
    
    private void initializeGrassmanGUI() {
        grassmanJFrame = new JFrame();
        grassmanJFrame.setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/2 - (468/2), Toolkit.getDefaultToolkit().getScreenSize().height/2 - (416/2), 468, 416);
        grassmanJFrame.setDefaultLookAndFeelDecorated(false);
        grassmanJFrame.setResizable(false);
        grassmanJFrame.setVisible(false);
        jPanel1g = new JPanel();
        jLabel1g = new JLabel();
        jPanel2 = new JPanel();
        jLabel2g = new JLabel();
        AField1 = new JTextField();
        jLabel3g = new JLabel();
        pAB1 = new JTextField();
        jPanel3g = new JPanel();
        jLabel4g = new JLabel();
        BField1 = new JTextField();
        jLabel5g = new JLabel();
        oAB1 = new JTextField();
        jPanel4g = new JPanel();
        grassmanCalc1 = new JButton();
        jSeparator1g = new JSeparator();
        jPanel5g = new JPanel();
        jLabel6g = new JLabel();
        jLabel7g = new JLabel();
        AField2 = new JTextField();
        jLabel8g = new JLabel();
        pAB2 = new JTextField();
        jLabel9g = new JLabel();
        BField2 = new JTextField();
        jLabel10g = new JLabel();
        pBC2 = new JTextField();
        jLabel11g = new JLabel();
        CField2 = new JTextField();
        jLabel12g = new JLabel();
        pCA2 = new JTextField();
        jPanel6g = new JPanel();
        jLabel13g = new JLabel();
        pABC2 = new JTextField();
        jPanel7g = new JPanel();
        jLabel14g = new JLabel();
        oABC2 = new JTextField();
        jPanel8g = new JPanel();
        grassmanCalc2 = new JButton();
        jPanel9g = new JPanel();
        grassmanWaitingLabel = new JLabel();
        jLabel1g.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1g.setText("Формула Грассмана для двух значений");
        GroupLayout jPanel1gLayout = new GroupLayout(jPanel1g);
        jPanel1g.setLayout(jPanel1gLayout);
        jPanel1gLayout.setHorizontalGroup(
            jPanel1gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1gLayout.setVerticalGroup(
            jPanel1gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1g, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );
        jLabel2g.setText("A");
        AField1.setText("Введите число");
        jLabel3g.setText("Пересечение A и B");
        pAB1.setText("Введите число");
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2g, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AField1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pAB1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pAB1, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(AField1)
            .addComponent(jLabel2g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLabel4g.setText("B");
        BField1.setText("Введите число");
        jLabel5g.setText("Объединение A и B");
        oAB1.setText("Введите число");
        GroupLayout jPanel3gLayout = new GroupLayout(jPanel3g);
        jPanel3g.setLayout(jPanel3gLayout);
        jPanel3gLayout.setHorizontalGroup(
            jPanel3gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3gLayout.createSequentialGroup()
                .addComponent(jLabel4g, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BField1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oAB1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
        );
        jPanel3gLayout.setVerticalGroup(
            jPanel3gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3gLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BField1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5g, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addComponent(oAB1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        );
        grassmanCalc1.setText("Вычислить");
        GroupLayout jPanel4gLayout = new GroupLayout(jPanel4g);
        jPanel4g.setLayout(jPanel4gLayout);
        jPanel4gLayout.setHorizontalGroup(
            jPanel4gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(grassmanCalc1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4gLayout.setVerticalGroup(
            jPanel4gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(grassmanCalc1)
        );
        jLabel6g.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6g.setText("Формула Грассмана для трёх значений");
        GroupLayout jPanel5gLayout = new GroupLayout(jPanel5g);
        jPanel5g.setLayout(jPanel5gLayout);
        jPanel5gLayout.setHorizontalGroup(
            jPanel5gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5gLayout.setVerticalGroup(
            jPanel5gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6g, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );
        jLabel7g.setText("A");
        AField2.setText("Введите число");
        jLabel8g.setText("Пересечение A и B");
        pAB2.setText("Введите число");
        jLabel9g.setText("B");
        BField2.setText("Введите число");
        jLabel10g.setText("Пересечение B и C");
        pBC2.setText("Введите число");
        jLabel11g.setText("C");
        CField2.setText("Введите число");
        jLabel12g.setText("Пересечение C и A");
        pCA2.setText("Введите число");
        jLabel13g.setText("Пересечение A, B, C");
        pABC2.setText("Введите число");
        GroupLayout jPanel6gLayout = new GroupLayout(jPanel6g);
        jPanel6g.setLayout(jPanel6gLayout);
        jPanel6gLayout.setHorizontalGroup(
            jPanel6gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6gLayout.createSequentialGroup()
                .addComponent(jLabel13g, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pABC2))
        );
        jPanel6gLayout.setVerticalGroup(
            jPanel6gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6gLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13g, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addComponent(pABC2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        );
        jLabel14g.setText("Объединение A, B, C");
        oABC2.setText("Введите число");
        GroupLayout jPanel7gLayout = new GroupLayout(jPanel7g);
        jPanel7g.setLayout(jPanel7gLayout);
        jPanel7gLayout.setHorizontalGroup(
            jPanel7gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7gLayout.createSequentialGroup()
                .addComponent(jLabel14g, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oABC2))
        );
        jPanel7gLayout.setVerticalGroup(
            jPanel7gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7gLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14g, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addComponent(oABC2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        );
        grassmanCalc2.setText("Вычислить");

        GroupLayout jPanel8gLayout = new GroupLayout(jPanel8g);
        jPanel8g.setLayout(jPanel8gLayout);
        jPanel8gLayout.setHorizontalGroup(
            jPanel8gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(grassmanCalc2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8gLayout.setVerticalGroup(
            jPanel8gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(grassmanCalc2)
        );
        grassmanWaitingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        grassmanWaitingLabel.setText("Ожидание действий");
        GroupLayout jPanel9gLayout = new GroupLayout(jPanel9g);
        jPanel9g.setLayout(jPanel9gLayout);
        jPanel9gLayout.setHorizontalGroup(
            jPanel9gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(grassmanWaitingLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9gLayout.setVerticalGroup(
            jPanel9gLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(grassmanWaitingLabel, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );
        GroupLayout layout = new GroupLayout(grassmanJFrame.getContentPane());
        grassmanJFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1g)
                    .addComponent(jPanel5g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11g, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CField2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12g, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pCA2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9g, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BField2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10g, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pBC2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AField2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8g, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pAB2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1g, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3g, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4g, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1g, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5g, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pAB2)
                    .addComponent(AField2)
                    .addComponent(jLabel7g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBC2)
                    .addComponent(BField2)
                    .addComponent(jLabel9g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCA2)
                    .addComponent(CField2)
                    .addComponent(jLabel11g, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6g, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7g, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8g, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9g, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        pack();
    }
    
    private void initializeListeners() {
        buttonsActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Thread thread;
                if (e.getSource() == factorialCalculate) {
                    if (factorialInput.getText().isEmpty()) {
                        setInfo(Rus.get("No data"));
                        handler.getLogger().writeLog(Rus.get("No data"));
                        return;
                    }
                    if (!Filters.isPositiveInteger(factorialInput.getText())) {
                        setInfo("Строка не является положительным числом");
                        getHandler().getLogger().writeLog("Строка " + factorialInput.getText() + " не является положительным числом");
                        return;
                    }
                    thread = new Thread(new FactorialCalculator(instance(), factorialInput.getText()));
                    thread.start();
                }
                if (e.getSource() == combiCalculate) {
                    if (nCombiInput.getText().isEmpty() && kCombiInput.getText().isEmpty()) {
                        setInfo(Rus.get("No data"));
                        handler.getLogger().writeLog(Rus.get("No data"));
                        return;
                    }
                    if (!Filters.isPositiveInteger(nCombiInput.getText()) && !Filters.isPositiveInteger(kCombiInput.getText())) {
                        setInfo("Строки не являются положительным числом");
                        getHandler().getLogger().writeLog("Строки не являются положительным числом");
                        return;
                    }
                    thread = new Thread(new CombinatoricsCalculator(instance(), nCombiInput.getText(), kCombiInput.getText()));
                    thread.start();
                }
                if (e.getSource() == jButton1 && !grassmanJFrame.isVisible()) {
                    grassmanJFrame.setVisible(true);
                }
                if (e.getSource() == grassmanCalc1) {
                    thread = new Thread(new GrassmanCalculator(instance(), new String[]{AField1.getText(), BField1.getText(), oAB1.getText(), pAB1.getText()}));
                    thread.start();
                }
                if (e.getSource() == grassmanCalc2) {
                    thread = new Thread(new GrassmanCalculator(instance(), new String[]{AField2.getText(), BField2.getText(), CField2.getText(), pAB2.getText(), pBC2.getText(), pCA2.getText(), pABC2.getText(), oABC2.getText()}));
                    thread.start();
                }
            }
        };
        factorialCalculate.addActionListener(buttonsActionListener);
        combiCalculate.addActionListener(buttonsActionListener);
        jButton1.addActionListener(buttonsActionListener);
        grassmanCalc1.addActionListener(buttonsActionListener);
        grassmanCalc2.addActionListener(buttonsActionListener);
    }
    
    @Override
    public synchronized void setInfo(String str) {
        this.waitingLabel.setText(str);
    }
    
    public synchronized void setGrassmanInfo(String str) {
        this.grassmanWaitingLabel.setText(str);
    }
    
    public synchronized void setAField1Answer(String str) {
        this.AField1.setText(str);
    }
    
    public synchronized void setBField1Answer(String str) {
        this.BField1.setText(str);
    }
    
    public synchronized void setPAB1Answer(String str) {
        this.pAB1.setText(str);
    }
    
    public synchronized void setOAB1Answer(String str) {
        this.oAB1.setText(str);
    }
    
    public synchronized void setAField2Answer(String str) {
        this.AField2.setText(str);
    }
    
    public synchronized void setBField2Answer(String str) {
        this.BField2.setText(str);
    }
    
    public synchronized void setCField2Answer(String str) {
        this.CField2.setText(str);
    }
    
    public synchronized void setPAB2Answer(String str) {
        this.pAB2.setText(str);
    }
    
    public synchronized void setPBC2Answer(String str) {
        this.pBC2.setText(str);
    }
    
    public synchronized void setPCA2Answer(String str) {
        this.pCA2.setText(str);
    }
    
    public synchronized void setPABC2Answer(String str) {
        this.pABC2.setText(str);
    }
    
    public synchronized void setOABC2Answer(String str) {
        this.oABC2.setText(str);
    }
    
    public synchronized void setFactorialAnswer(String str) {
        this.factorialAnswer.setText(str);
    }
    
    public synchronized void setDoubleFactorialAnswer(String str) {
        this.doubleFactorialAnswer.setText(str);
    }
    
    public synchronized void setPrimorialAnswer(String str) {
        this.primorialAnswer.setText(str);
    }
    
    public synchronized void setSuperfactorialAnswer(String str) {
        this.superfactorialAnswer.setText(str);
    }
    
    public synchronized void setSubfactorialAnswer(String str) {
        this.jLabel10.setText(str);
    }
    
    public synchronized void setIncFactorialAnswer(String str) {
        this.jLabel29.setText(str);
    }
    
    public synchronized void setDecFactorialAnswer(String str) {
        this.jLabel31.setText(str);
    }
    
    public synchronized void setPlacementAnswer(String str) {
        this.placementAnswer.setText(str);
    }
    
    public synchronized void setPlacementRepAnswer(String str) {
        this.placementRepAnswer.setText(str);
    }
    
    public synchronized void setCombinationAnswer(String str) {
        this.combinationAnswer.setText(str);
    }
    
    public synchronized void setCombinationRepAnswer(String str) {
        this.combinationRepAnswer.setText(str);
    }
    
    public synchronized void setPermutationAnswer(String str) {
        this.permutationAnswer.setText(str);
    }
    
    public synchronized void setPermutationRepAnswer(String str) {
        this.permutationRepAnswer.setText(str);
    }
    
    public CombocalculatorGUI instance() {
        return this;
    }
}
