import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.color.*;

public class TIC_TAC extends javax.swing.JFrame {
 
    
     int player_no = 1;
     int b[] = new int[9];
    private int player1Score = 0; 
    private int player2Score = 0; 
    public TIC_TAC() {
        initComponents();
    }
private void exitGame() {
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit Game", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jlabel5 = new javax.swing.JLabel();
        P1_Score = new javax.swing.JLabel();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        P2_Score = new javax.swing.JLabel();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();
        Reset_Button = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.GridLayout(4, 5));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 150)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 90)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIC");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 90)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TAC");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 90)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TOE");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 150)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("O");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);

        b1.setFont(new java.awt.Font("Comic Sans MS", 0, 65)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);

        b2.setFont(new java.awt.Font("Comic Sans MS", 0, 65)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);

        b3.setFont(new java.awt.Font("Comic Sans MS", 0, 65)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);

        jlabel5.setBackground(new java.awt.Color(0, 0, 0));
        jlabel5.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jlabel5.setForeground(new java.awt.Color(255, 0, 0));
        jlabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel5.setText("PLAYER 1 (O):");
        jlabel5.setOpaque(true);
        getContentPane().add(jlabel5);

        P1_Score.setBackground(new java.awt.Color(255, 0, 51));
        P1_Score.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        P1_Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P1_Score.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(P1_Score);

        b4.setFont(new java.awt.Font("Comic Sans MS", 0, 65)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);

        b5.setFont(new java.awt.Font("Comic Sans MS", 0, 65)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);

        b6.setFont(new java.awt.Font("Comic Sans MS", 0, 65)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PLAYER 2 (X):");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);

        P2_Score.setBackground(new java.awt.Color(255, 0, 51));
        P2_Score.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        P2_Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P2_Score.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(P2_Score);

        b7.setFont(new java.awt.Font("Comic Sans MS", 0, 65)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);

        b8.setFont(new java.awt.Font("Comic Sans MS", 0, 65)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);

        b9.setFont(new java.awt.Font("Comic Sans MS", 0, 65)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);

        Exit_Button.setBackground(new java.awt.Color(0, 0, 0));
        Exit_Button.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        Exit_Button.setForeground(new java.awt.Color(255, 255, 255));
        Exit_Button.setText("EXIT");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Exit_Button);

        Reset_Button.setBackground(new java.awt.Color(0, 0, 0));
        Reset_Button.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        Reset_Button.setForeground(new java.awt.Color(255, 255, 255));
        Reset_Button.setText("RESET");
        Reset_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Reset_Button);

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void bActionPerformed(java.awt.event.ActionEvent evt, int position){
            ButtonAction action = new ButtonAction(position);
            action.actionPerformed(evt);
            sendMove(position);
        
        }
    
        private void sendMove(int position){
            
            System.out.println(position);
        }
        
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
        bActionPerformed(evt, 0);
        
    }

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {
        bActionPerformed(evt, 3);
    }

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {
        bActionPerformed(evt, 2);
        
    }

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {
        bActionPerformed(evt, 1);
    }

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {
        bActionPerformed(evt, 4);
    }

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {
        bActionPerformed(evt, 5);
    }

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {
        bActionPerformed(evt, 6);
    }

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {
        bActionPerformed(evt, 7);
    }

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {
        bActionPerformed(evt, 8);
    }

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
          exitGame();
    }

    private void Reset_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
         resetGame();
    }
    
    private boolean CheckWin(int player){
		
		for(int ml=0;ml<7;ml=ml+3){
			if(b[ml]==b[ml+1] && b[ml]==b[ml+2] && b[ml]==player){
				return true;
			}
		
		}
		
		for(int ml=0;ml<3;ml++){
			if(b[ml]==b[ml+3] && b[ml]==b[ml+6] && b[ml]==player){
				return true;
			}
		}
		
		
			for(int ml=0;ml<3;ml=ml+4){
				if(b[ml]==b[ml+4] && b[ml]==b[ml+8] && b[ml]==player){
					return true;
				}
			}
			
			for(int ml=2;ml<3;ml=ml+2){
				if(b[ml]==b[ml+2] && b[ml]==b[ml+4] && b[ml]==player){
					return true;
				}
			}
		return false;
			
	}
    
    class ButtonAction implements ActionListener{
		private int pos;
		int flag=1;
		ButtonAction(int position){
			pos=position;
		}
		
		public void actionPerformed(ActionEvent e) {
			JButton bx=(JButton)e.getSource();
			if(player_no==1){
				bx.setText("O");
                                bx.setForeground(Color.BLACK);
				b[pos]=1;
				if(CheckWin(1)){
					JOptionPane.showMessageDialog(null,"Player 1 wins");
                                        
                    
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
					//flag=2;
                                         player1Score++;
                                         P1_Score.setText(Integer.toString(player1Score));
				}
				player_no=2;
				
			}
			
			else{
				bx.setText("X");
                                bx.setForeground(Color.RED);
				b[pos]=2;
				if(CheckWin(2)){
					JOptionPane.showMessageDialog(null,"Player 2 wins");
                                        player2Score++; 
                    P2_Score.setText(Integer.toString(player2Score));
                    
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
					//flag=2;
                                        
                                        
				}
				player_no=1;
				
				//b.setEnabled(false);
			}
			bx.setEnabled(false);
			
			for(int s=0; s<9; s++){
				if(b[s]==0){
					flag=0;
					break;
				}
			}
			
			if(flag==1){
				JOptionPane.showMessageDialog(null,"Match has been tied");
			}
			
			/*if(flag==1 || flag==2){
				for(int s=0; s<9; s++){
					if(b[s]==0 || b[]){
						flag=0;
					}
				}
			}*/
			
		}

        
	}
    private void resetGame() {
        // Reset the game state
        for (int i = 0; i < 9; i++) {
            b[i] = 0; // Resetting the game board
        }

        // Clearing the text on buttons
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        // Enabling buttons
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

        // Resetting player turn
        player_no = 1;


    }
      public static void main(String args[]) {
     
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC().setVisible(true);
            }
        });
      }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit_Button;
    private javax.swing.JLabel P1_Score;
    private javax.swing.JLabel P2_Score;
    private javax.swing.JToggleButton Reset_Button;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlabel5;
    // End of variables declaration//GEN-END:variables
}
