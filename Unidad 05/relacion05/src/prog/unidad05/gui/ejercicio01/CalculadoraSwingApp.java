package prog.unidad05.gui.ejercicio01;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraSwingApp {

  private JFrame frmCalculador;
  private JTextField txtPimerOperando;
  private JTextField txtSegundoOperando;
  private JLabel lblResultado;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          CalculadoraSwingApp window = new CalculadoraSwingApp();
          window.frmCalculador.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public CalculadoraSwingApp() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frmCalculador = new JFrame();
    frmCalculador.setTitle("Calculadora");
    frmCalculador.setBounds(100, 100, 391, 198);
    frmCalculador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel lblNewLabel = new JLabel("Primer operando:");
    
    txtPimerOperando = new JTextField();
    txtPimerOperando.setColumns(10);
    
    JLabel lblNewLabel_1 = new JLabel("Segundo operando:");
    
    txtSegundoOperando = new JTextField();
    txtSegundoOperando.setColumns(10);
    
    lblResultado = new JLabel("Resultado: 0.0");
    
    JButton btnSuma = new JButton("Suma");
    btnSuma.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        realizaOperacion('+');
      }

    });
    
    JButton btnResta = new JButton("Resta");
    btnResta.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        realizaOperacion('-');
      }
    });
    
    JButton btnProducto = new JButton("Producto");
    btnProducto.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        realizaOperacion('*');
      }
    });
    
    JButton btnDivision = new JButton("Division");
    btnDivision.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        realizaOperacion('/');
      }
    });
    GroupLayout groupLayout = new GroupLayout(frmCalculador.getContentPane());
    groupLayout.setHorizontalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
              .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(lblNewLabel_1)
                .addComponent(lblNewLabel))
              .addPreferredGap(ComponentPlacement.RELATED)
              .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(txtPimerOperando, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(txtSegundoOperando, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
            .addComponent(lblResultado))
          .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
            .addGroup(groupLayout.createSequentialGroup()
              .addGap(37)
              .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(btnDivision)
                .addComponent(btnProducto)
                .addComponent(btnResta))
              .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(groupLayout.createSequentialGroup()
              .addPreferredGap(ComponentPlacement.RELATED)
              .addComponent(btnSuma)
              .addContainerGap())))
    );
    groupLayout.setVerticalGroup(
      groupLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(groupLayout.createSequentialGroup()
          .addContainerGap()
          .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
            .addComponent(lblNewLabel)
            .addComponent(txtPimerOperando, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSuma))
          .addPreferredGap(ComponentPlacement.UNRELATED)
          .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
              .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                .addComponent(lblNewLabel_1)
                .addComponent(txtSegundoOperando, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(ComponentPlacement.UNRELATED)
              .addComponent(lblResultado))
            .addGroup(groupLayout.createSequentialGroup()
              .addComponent(btnResta)
              .addPreferredGap(ComponentPlacement.UNRELATED)
              .addComponent(btnProducto)))
          .addPreferredGap(ComponentPlacement.UNRELATED)
          .addComponent(btnDivision)
          .addContainerGap(14, Short.MAX_VALUE))
    );
    frmCalculador.getContentPane().setLayout(groupLayout);
  }

  protected void realizaOperacion(char operacion) {
    double primerOperando;
    try {
      primerOperando = Double.parseDouble(txtPimerOperando.getText());
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "El primer operando no es válido", "Error", JOptionPane.ERROR_MESSAGE);
      return;
    }
    double segundoOperando;
    try {
      segundoOperando = Double.parseDouble(txtSegundoOperando.getText());
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "El segundo operando no es válido", "Error", JOptionPane.ERROR_MESSAGE);
      return;
    }
    double resultado = 0;
    switch (operacion) {
      case '+':
        resultado = primerOperando + segundoOperando;
        break;
      case '-':
        resultado = primerOperando - segundoOperando;
        break;
      case '*':
        resultado = primerOperando * segundoOperando;
        break;
      case '/':
        if (segundoOperando == 0) {
          JOptionPane.showMessageDialog(null, "No se puede dividir por cero", "Error", JOptionPane.ERROR_MESSAGE);
          return;
        }
        resultado = primerOperando / segundoOperando;
        break;
    }
    lblResultado.setText(String.format("Resultado: %.2f", resultado));
  }
}
