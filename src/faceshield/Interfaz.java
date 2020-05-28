package faceshield;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    int cantidad;
    Random rnd = new Random();
    int cantProducida = (rnd.nextInt(9000) + 1000);
    ArrayList<Entidad> pedidos = new ArrayList(cantidad);

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreInterfaz = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        crearPedidos = new javax.swing.JButton();
        gernerarInforme = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        limpiarData = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        nombreInterfaz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nombreInterfaz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreInterfaz.setText("FaceShield");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Haga su pedido de dotación.");

        crearPedidos.setText("Crear Pedidos");
        crearPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPedidosActionPerformed(evt);
            }
        });

        gernerarInforme.setText("Generar Informe");
        gernerarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gernerarInformeActionPerformed(evt);
            }
        });

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        limpiarData.setText("Limpiar Data");
        limpiarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarDataActionPerformed(evt);
            }
        });

        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(nombreInterfaz))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gernerarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(limpiarData, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nombreInterfaz, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gernerarInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarData, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void resetVector() {
        if (!pedidos.isEmpty()) {
            for (int i = 0; i < pedidos.size(); i++) {
                pedidos.remove(i);
            }
        }
    }

    public void ingresarPedidos(int cantidad, int c) {
        if (pedidos.isEmpty()) {
            for (int i = 0; i < cantidad; i++) {
                Entidad e = new Entidad();
                e.setNombre(JOptionPane.showInputDialog(this, "Ingrese el nombre de la entidad"));
                e.setCantidad(c);
                pedidos.add(i, e);
                JOptionPane.showMessageDialog(this, "Pedido registrado satisfactoriamente");
            }
        } else {
            for (int i = 0; i < pedidos.size(); i++) {
                pedidos.remove(i);
            }
        }
    }

    public String generarInforme() {
        String mensaje = "";
        if (!pedidos.isEmpty()) {
            mensaje += "Cantidad de mascaras podrucidas a la semana: " + cantProducida + "\n\n";
            if (cantidad == 1) {
                for (int i = 0; i < cantidad; i++) {
                    pedidos.get(i).setCantidad(cantProducida);
                }
                for (int i = 0; i < pedidos.size(); i++) {
                    mensaje += "Nombre de la entidad beneficiada: " + pedidos.get(i).getNombre() + "\n"
                            + "Cantidad de dotación:" + pedidos.get(i).getCantidad() + "\n\n";
                }
            } else {
                int p = (int) ((cantidad) * 0.1);
                p += 1;
                int valorAsig = (cantProducida / cantidad);
                int cantidadAsig = valorAsig;
                int v = (int) (cantidadAsig + (valorAsig * 0.2));
                for (int i = 0; i < p; i++) {
                    pedidos.get(i).setCantidad(v);
                }
                int cantProdu = cantProducida;
                cantProdu -= v;
                int valor = (cantProdu / (cantidad - p));
                for (int i = p; i < cantidad; i++) {
                    pedidos.get(i).setCantidad(valor);
                }
                for (int i = 0; i < pedidos.size(); i++) {
                    mensaje += "Nombre de la entidad beneficiada: " + pedidos.get(i).getNombre() + "\n"
                            + "Cantidad de dotación:" + pedidos.get(i).getCantidad() + "\n\n";
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "El vector está vacío, por favor ingresa una entidad");
        }
        return mensaje;
    }
    private void crearPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPedidosActionPerformed
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pedidos a realizar"));
        ingresarPedidos(cantidad, 1);
    }//GEN-LAST:event_crearPedidosActionPerformed

    private void gernerarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gernerarInformeActionPerformed
        texto.setText(generarInforme());
    }//GEN-LAST:event_gernerarInformeActionPerformed

    private void limpiarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarDataActionPerformed
        texto.setText(null);
        resetVector();
    }//GEN-LAST:event_limpiarDataActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JButton crearPedidos;
    private javax.swing.JButton gernerarInforme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarData;
    private javax.swing.JLabel nombreInterfaz;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
