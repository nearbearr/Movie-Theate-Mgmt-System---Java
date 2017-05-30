
package movietheatremgmtsys;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Splash extends javax.swing.JFrame 
{
    Timer timer;
    int interval = 30;
    int maxValue = 120;
    int i;
    
    
public Splash() 
{
         setUndecorated(true);
       
        initComponents();

        //dislay in cemter of screen
        setLocationRelativeTo(null);

        //set the visibility to true
        setVisible(true);

        progressBar.setMaximum(maxValue);
        timer = new Timer(interval, new ActionListener() 
        {

            public void actionPerformed(ActionEvent e) 
            {
                if (i == maxValue - 1) {

                    timer.stop();
                    //call to homepage frame
                                     homepage obj= new homepage();
                                     obj.setVisible(true);
                    setVisible(false);
                }
                i = i + 1;
                progressBar.setValue(i);
            }
        });
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movietheatremgmtsys/splash.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        progressBar.setAlignmentX(0.0F);
        progressBar.setAlignmentY(0.0F);
        progressBar.setAutoscrolls(true);
        progressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
