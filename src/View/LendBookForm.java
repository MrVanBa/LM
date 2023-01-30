/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.*;
import Controller.*;
import Model.*;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LendBookForm extends javax.swing.JPanel {

    MainFormOfLibrarian mainFormOfLibrarian;
    ArrayList<Borrower> arrAvailableBorrower;

    Borrower borrower;
//    HashMap<BorrowingInformation, HashMap<String,Integer>> mapBorrowingInfor;
    boolean isShowBorrowed = true;

    /**
     * Creates new form panelChoMuonSach
     */
    public LendBookForm() {
        initComponents();
    }

    public LendBookForm(MainFormOfLibrarian mainFormOfLibrarian) {
        initComponents();
        this.mainFormOfLibrarian = mainFormOfLibrarian;
//        mapBorrowingInfor = new HashMap<>();
        try {
            arrAvailableBorrower = Borrower_Controller.getInstance().getListBorrower();
            initListSearchBorrower(arrAvailableBorrower);
            rdlending.setSelected(false);
            rdBorrowed.setSelected(true);
        } catch (SQLException ex) {
            Logger.getLogger(LendBookForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LendBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupLendBook = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbIdBorrowCard = new javax.swing.JLabel();
        lbIdBorrower = new javax.swing.JLabel();
        lbNameBorrower = new javax.swing.JLabel();
        tfExpiredDate = new javax.swing.JLabel();
        btnSearcch = new javax.swing.JButton();
        tfIdBorower = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSearchBorrower = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBorrowingInformation = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        rdBorrowed = new javax.swing.JRadioButton();
        rdlending = new javax.swing.JRadioButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin người mượn"));

        lbIdBorrowCard.setText("Mã thẻ : ");

        lbIdBorrower.setText("Mã người mượn : ");

        lbNameBorrower.setText("Tên người mượn : ");

        tfExpiredDate.setText("Ngày hết hạn : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIdBorrowCard, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdBorrower, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfExpiredDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNameBorrower, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdBorrowCard, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfExpiredDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdBorrower, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNameBorrower, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnSearcch.setText("Tìm");
        btnSearcch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearcchActionPerformed(evt);
            }
        });

        tfIdBorower.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfIdBorowerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfIdBorowerKeyTyped(evt);
            }
        });

        jLabel1.setText("Nhập mã người mượn ");

        listSearchBorrower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSearchBorrowerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listSearchBorrower);

        tableBorrowingInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thông tin mượn", "Mã bản sao sách", "Tên sách", "Giá", "Ngày đăng kí mượn", "Ngày mượn", "Hạn trả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBorrowingInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBorrowingInformationMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableBorrowingInformation);
        if (tableBorrowingInformation.getColumnModel().getColumnCount() > 0) {
            tableBorrowingInformation.getColumnModel().getColumn(0).setPreferredWidth(100);
            tableBorrowingInformation.getColumnModel().getColumn(1).setPreferredWidth(80);
            tableBorrowingInformation.getColumnModel().getColumn(2).setPreferredWidth(50);
            tableBorrowingInformation.getColumnModel().getColumn(3).setPreferredWidth(50);
            tableBorrowingInformation.getColumnModel().getColumn(4).setPreferredWidth(100);
            tableBorrowingInformation.getColumnModel().getColumn(5).setPreferredWidth(50);
            tableBorrowingInformation.getColumnModel().getColumn(6).setPreferredWidth(50);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Danh sách sách ");

        btnCancel.setText("Thoát");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setText("Cập nhật");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdBorrowed);
        rdBorrowed.setText("Đã đăng kí mượn");
        rdBorrowed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBorrowedActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdlending);
        rdlending.setText("Đang mượn");
        rdlending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlendingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                    .addComponent(tfIdBorower))
                                .addGap(26, 26, 26)
                                .addComponent(btnSearcch, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdBorrowed)
                                .addGap(18, 18, 18)
                                .addComponent(rdlending)))
                        .addContainerGap(45, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIdBorower, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearcch))
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdBorrowed)
                    .addComponent(rdlending))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(btnSave))
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSearcch, tfIdBorower});

    }// </editor-fold>//GEN-END:initComponents

    private void tfIdBorowerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdBorowerKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_BACK_SPACE:
                break;
            case KeyEvent.VK_ENTER:
//                tfNameAuthor.setText(tfNameAuthor.getText());
                autoComplete(tfIdBorower.getText());
                break;
            default:
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        String kt = tfIdBorower.getText();
                        autoComplete(kt);
                    }
                });
        }
    }//GEN-LAST:event_tfIdBorowerKeyPressed

    private void tfIdBorowerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdBorowerKeyTyped
        if (tfIdBorower.getText().isEmpty()) {
            initListSearchBorrower(arrAvailableBorrower);
        }
        autoComplete(tfIdBorower.getText());
    }//GEN-LAST:event_tfIdBorowerKeyTyped

    private void listSearchBorrowerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSearchBorrowerMouseClicked
        int i = listSearchBorrower.getSelectedIndex();
        if (i != -1) {
            ((DefaultTableModel) tableBorrowingInformation.getModel()).setRowCount(0);
            try {
                borrower = arrBorrowerOfList.get(i);
                showInforBorrower(borrower);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BorrowingInformationForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(BorrowingInformationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_listSearchBorrowerMouseClicked

    private void btnSearcchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearcchActionPerformed
        // search Borrowerid
        try {
            // search Borrowerid
            searchBorrower();
        } catch (SQLException ex) {
            Logger.getLogger(BorrowingInformationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BorrowingInformationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearcchActionPerformed

    private void rdBorrowedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBorrowedActionPerformed
        if (borrower == null) return;
        isShowBorrowed = true;
        try {
            binDataToTableBorrowedInformation(borrower);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LendBookForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LendBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rdBorrowedActionPerformed

    private void rdlendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlendingActionPerformed
        if (borrower == null) return;
        isShowBorrowed = false;
        try {
            binDataToTableBorrowedInformation(borrower);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LendBookForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LendBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rdlendingActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            //update muon sach
            if (borrower == null) {
                return;
            }
            update();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LendBookForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LendBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tableBorrowingInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBorrowingInformationMouseClicked
        // TODO add your handling code here:
        if (isShowBorrowed) {
            int i = tableBorrowingInformation.getSelectedRow();
            int j = tableBorrowingInformation.getSelectedColumn();
            if (i == -1) {
                return;
            }
//            if (tableBorrowingInformation.getValueAt(i, 8) != null && tableBorrowingInformation.getValueAt(i, 9) != null){
//               if (j == 8){
//                   boolean isLend = (boolean)tableBorrowingInformation.getValueAt(i, 8);
//                   if (isLend){
//                       tableBorrowingInformation.setValueAt(false ,i, 9);
//                   }
//               }
//               if (j == 9){
//                   boolean notLent = (boolean)tableBorrowingInformation.getValueAt(i, 9);
//                   if (notLent){
//                       tableBorrowingInformation.setValueAt(false ,i, 8);
//                   }
//               }
//            }

        }
    }//GEN-LAST:event_tableBorrowingInformationMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        mainFormOfLibrarian.setContentsPanel(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * Hàm này để tìm kiếm người mượn theo tên hoặc mã người mượn rồi hiển thị lên list
     * @param key từ khóa mà có thể bao gồm trong tên hoặc mã người mượn
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */
    private void searchBorrower() throws SQLException, ClassNotFoundException {
        String key = tfIdBorower.getText().toString().trim();
        ArrayList<Borrower> list_borrower = Borrower_Controller.getInstance().searchBorrower(key);
        if (list_borrower.isEmpty()) {
            notify("Không có mã người mượn hay tên nào thỏa mãn");
            return;
        }
        initListSearchBorrower(list_borrower);
    }
    
    /** Hàm này để cập nhât trang thái cho mượn sách vào CSDL
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */
    private void update() throws ClassNotFoundException, SQLException {
        if (!isShowBorrowed) {
            notify("Hãy chuyển sang bảng danh sách đã đăng kí cho mượn trước");
            return;
        }

        if (checkAllNotLend()) {
            if (confirm("Không cho mượn sách nào?")){
                updateWhentNotLentAllBook();
            };
            return;
        }

        String borrowedDate = (String) tableBorrowingInformation.getValueAt(0, 4);
        String lentDate = BorrowerInforHelper.getLentDate(borrowedDate);
        
        for (int i = 0;i<tableBorrowingInformation.getRowCount();i++){
            if (lentDate == null){
                String nameBook = (String) tableBorrowingInformation.getValueAt(0, 2);
                notify("Sách " + nameBook + " đã quá hạn lấy !!!" );
                return;
            }
            
            if (!(boolean) tableBorrowingInformation.getValueAt(i, 5) && !(boolean) tableBorrowingInformation.getValueAt(i, 6)) {
                notify("Hãy đưa ra quyết định cho sách " + (String) tableBorrowingInformation.getValueAt(i, 2));
                return;
            }
        }
        
        //"Mã thông tin mượn", "Mã bản sao sách", "Tên sách", "Giá", "Ngày đăng kí mượn", "Cho mượn", "Không cho mượn"
        String expectReturnDate = BorrowerInforHelper.getExpectReturnDate(lentDate);
        String idBorrowInfor = null;
        int fineBorrower = 0; //tien dat coc
        for (int row = 0; row < tableBorrowingInformation.getRowCount(); row++) {
            idBorrowInfor = (String) tableBorrowingInformation.getValueAt(row, 0); 
            String idCoppyBook = (String) tableBorrowingInformation.getValueAt(row, 1);
            CopyOfBook copyOfBook = Book_Controller.getInstance().getCopyOfBookById(idCoppyBook);
            CopyOfBook.StatusOfCopy statusOfCopy = (boolean) tableBorrowingInformation.getValueAt(row, 5) ? CopyOfBook.StatusOfCopy.LENT : CopyOfBook.StatusOfCopy.AVAILABLE;
            copyOfBook.setcopy_of_book_Status(statusOfCopy);
            
            if (statusOfCopy == CopyOfBook.StatusOfCopy.LENT) {
                fineBorrower += (int) tableBorrowingInformation.getValueAt(row, 3);
            } else {
                LentBook_Controller.getInstance().deleteDetailLentBook(idBorrowInfor, idCoppyBook);
            }
            
            //update status book
            Book_Controller.getInstance().updateCopyOfBook(copyOfBook);
            
            //update status detail 
            DetailLentBook detailLentBook = new DetailLentBook();
            detailLentBook.setdetail_lent_book_ID(idCoppyBook); 
            detailLentBook.setdetail_lent_book_LentDate(lentDate); 
            detailLentBook.setdetail_lent_book_Status(1);
            LentBook_Controller.getInstance().updateDetailLentBook(idBorrowInfor, detailLentBook);
        }

       //update infor borrow
        BorrowingInfo borrowingInformation = new BorrowingInfo();
        borrowingInformation.setborrowing_info_ID(idBorrowInfor);
        borrowingInformation.setborrowing_info_Expect_Return_Date(expectReturnDate); 
        borrowingInformation.setborrowing_info_Deposit(fineBorrower); 
        boolean is = BorrowingInfo_Controller.getInstance().updateLent(borrowingInformation);

        if (!is) {
            notify("Lỗi");
            return;
        }
        notify("Đã cập nhật");
        binDataToTableBorrowedInformation(borrower);
    }

    /** Hàm này để cập nhât trang thái không cho mượn sách vào CSDL
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */
    private void updateWhentNotLentAllBook() throws ClassNotFoundException, SQLException {
        String idBorrowInfor = null;
        for (int row = 0; row < tableBorrowingInformation.getRowCount(); row++) {
            idBorrowInfor = (String) tableBorrowingInformation.getValueAt(row, 0);
            String idCoppyBook = (String) tableBorrowingInformation.getValueAt(row, 1);
            CopyOfBook b = Book_Controller.getInstance().getCopyOfBookById(idCoppyBook);
            b.setcopy_of_book_Status(CopyOfBook.StatusOfCopy.AVAILABLE);
            LentBook_Controller.getInstance().deleteDetailLentBook(idBorrowInfor, idCoppyBook);
            Book_Controller.getInstance().updateCopyOfBook(b);
        }
        BorrowingInfo_Controller.getInstance().deleteBorrowingInfor(idBorrowInfor);
        binDataToTableBorrowedInformation(borrower);
        notify("Cập nhật thành công");
    }
    
    /** Hàm này để kiểm tra xem có chắc chắn người mượn không được mượn sách nào
     *  @return true 
     *          nếu không đươc mươn sách nào
     *  @return false
     *          nếu được mượn một trong các cuốn sách
     */
    private boolean checkAllNotLend() {
        for (int row = 0; row < tableBorrowingInformation.getRowCount(); row++) {
            if (!(boolean) tableBorrowingInformation.getValueAt(row, 6)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Hàm này để hiển thị thông tin người mượn
     * @param borrower người mượn muốn hiênt hị thông tin
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */
    private void showInforBorrower(Borrower borrower) throws ClassNotFoundException, SQLException {
        lbIdBorrowCard.setText("Mã thẻ: " + borrower.getborrower_Card().getborrowingcard_Borrower_ID());
        lbIdBorrower.setText("Mã người mượn: " + borrower.getborrower_ID());
        lbNameBorrower.setText("Tên người mượn: " + borrower.getuser_Name());
        tfExpiredDate.setText("Ngày hết hạn: " + borrower.getborrower_Card().getborrowingcard_Borrower_ID());
        binDataToTableBorrowedInformation(borrower);
    }

    /**
     * Hàm này để hiển thị thông tin đăng kí mượn vfs đnag mượng sách của một người mượn
     * @param borrower hiển thị thông tin tương ứng với người mượn này
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */
    private void binDataToTableBorrowedInformation(Borrower borrower) throws ClassNotFoundException, SQLException {
        DefaultTableModel model;
        if (isShowBorrowed) {
            model = getModelBorowed(borrower);
        } else {
            model = getModelLending(borrower);
        }
        tableBorrowingInformation.setModel(model);
    }

    private DefaultTableModel getModelBorowed(Borrower borrower) throws ClassNotFoundException, SQLException {
        String[] columnNames = new String[]{
            "Mã thông tin mượn", "Mã bản sao sách", "Tên sách", "Giá", "Ngày đăng kí mượn", "Cho mượn", "Không cho mượn"
        };
        boolean[] canEdit = new boolean[]{
            false, false, false, false, false, true, true
        };
        Class[] types = new Class[]{
            java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
            java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class
        };
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return canEdit[column];
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

        };
        ArrayList<BorrowingInfo> arrBorrowInfor = BorrowingInfo_Controller.getInstance().getListBorrowingInformationByIdBorrower(borrower);
        for (BorrowingInfo b : arrBorrowInfor) {
            if (b.getborrowing_info_Status() != BorrowingInfo.BorrowStatus.BORROWED) {
                continue;
            }
            ArrayList<DetailLentBook> arr = LentBook_Controller.getInstance().getListDetailLentBookByIdBorrowInfor(b.getborrowing_info_ID());
            for (DetailLentBook detailLentBook : arr) {
                Book book = Book_Controller.getInstance().getBookByIdCopyOfBook(detailLentBook.getdetail_lent_book_ID());
                CopyOfBook coppyOfBook = Book_Controller.getInstance().getCopyOfBookById(detailLentBook.getdetail_lent_book_ID());
                model.addRow(new Object[]{
                    b.getborrowing_info_ID(),
                    detailLentBook.getdetail_lent_book_ID(),
                    book.getbook_Title(),
                    coppyOfBook.getcopy_of_book_Price(),
                    b.getborrowing_info_Borrowed_Date(),
                    false,
                    false
                });
            }
        }
        return model;
    }

    private DefaultTableModel getModelLending(Borrower borrower) throws ClassNotFoundException, SQLException {
        String[] columnNames = new String[]{
            "Mã thông tin mượn", "Mã bản sao sách", "Tên sách", "Giá", "Ngày đăng kí mượn", "Ngày mượn", "Hạn trả"
        };
        boolean[] canEdit = new boolean[]{
            false, false, false, false, false, false, false, false
        };
        Class[] types = new Class[]{
            java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
            java.lang.Object.class, java.lang.Object.class, java.lang.Object.class};
        
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return canEdit[column];
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

        };
        ArrayList<BorrowingInfo> arrBorrowInfor = BorrowingInfo_Controller.getInstance().getListBorrowingInformationByIdBorrower(borrower);
        for (BorrowingInfo b : arrBorrowInfor) {
            if (b.getborrowing_info_Status() != BorrowingInfo.BorrowStatus.LENDING) {
                continue;
            }
            ArrayList<DetailLentBook> arr = LentBook_Controller.getInstance().getListDetailLentBookByIdBorrowInfor(b.getborrowing_info_ID());
            for (DetailLentBook detailLentBook : arr) {
                Book book = Book_Controller.getInstance().getBookByIdCopyOfBook(detailLentBook.getdetail_lent_book_ID());
                CopyOfBook coppyOfBook = Book_Controller.getInstance().getCopyOfBookById(detailLentBook.getdetail_lent_book_ID());
                model.addRow(new Object[]{
                    b.getborrowing_info_ID(),
                    detailLentBook.getdetail_lent_book_ID(),
                    book.getbook_Title(),
                    coppyOfBook.getcopy_of_book_Price(),
                    b.getborrowing_info_Borrowed_Date(),
                    detailLentBook.getdetail_lent_book_LentDate(),
                    b.getborrowing_info_Expect_Return_Date()
                });
            }
        }
        return model;
    }

    ArrayList<Borrower> arrBorrowerOfList;
    /**
     * Hàm này thực hiện chức năng hiển thị danh sách người mượn lên list
     * @param ArrayList<Borrower> Danh sách người mượn hiển thị lên list
     */
    private void initListSearchBorrower(ArrayList<Borrower> arr) {
        arrBorrowerOfList = arr;
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < arrBorrowerOfList.size(); i++) {
            listModel.addElement(arrBorrowerOfList.get(i).getborrower_ID() + ": " + arrBorrowerOfList.get(i).getuser_Name());
        }
        listSearchBorrower.setModel(listModel);
    }

    /**
     * Hàm này thực hiện chức năng tìm các người mượn có tên bắt đầu bằng một
     * chuỗi kí tự nào đó
     * @param String chỗi kí tự bắt đầu của tác giả
     */
    private void autoComplete(String kt) {
        String complete = "";
        int start = kt.length();
        int last = kt.length();
        int i;
        ArrayList<Borrower> arr = new ArrayList<>();
        for (i = 0; i < arrAvailableBorrower.size(); i++) {
            if (arrAvailableBorrower.get(i).getborrower_ID().startsWith(kt)) {
                arr.add(arrAvailableBorrower.get(i));
            }
        }
        initListSearchBorrower(arr);
    }

    /**
     * Hàm này thực hiện chức năng hiển thị thông báo
     * @param content nội dung thông báo
     */
    private void notify(String content) {
        JOptionPane.showMessageDialog(null, content);
    }

    private boolean confirm(String content) {
        int i = -1;
        i = JOptionPane.showConfirmDialog(null, content, "Thông báo", JOptionPane.YES_NO_OPTION);
        return (i==JOptionPane.YES_OPTION)?true:false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupLendBook;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearcch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbIdBorrowCard;
    private javax.swing.JLabel lbIdBorrower;
    private javax.swing.JLabel lbNameBorrower;
    private javax.swing.JList<String> listSearchBorrower;
    private javax.swing.JRadioButton rdBorrowed;
    private javax.swing.JRadioButton rdlending;
    private javax.swing.JTable tableBorrowingInformation;
    private javax.swing.JLabel tfExpiredDate;
    private javax.swing.JTextField tfIdBorower;
    // End of variables declaration//GEN-END:variables

}
