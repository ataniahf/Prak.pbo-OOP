
package biodata;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Biodata {

    public static void main(String[] args) {
     Bio b = new Bio();
    }
}

class Bio extends JFrame{
String[] namaJurusan = {"Teknik Informatika","sitem Informasi","Teknik Industri","Tenik Kimia"};

JLabel ljudul = new JLabel ("BIODATA MAHASISWA ");
JLabel lnama = new JLabel("Nama ");
JTextField tnama = new JTextField();
JLabel lnim = new JLabel("NIM ");
JTextField tnim = new JTextField();
JLabel ljurusan = new JLabel("Jurusan ");
JComboBox cmbjurusan = new JComboBox(namaJurusan);
JLabel ljk = new JLabel("Jenis Kelamin ");
JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
JRadioButton rbWanita = new JRadioButton(" Perempuan ");
JLabel alamat = new JLabel ("Alamat");
final JTextArea falamat = new JTextArea(20, 20); 
JLabel ldosen = new JLabel("Dosen Wali ");
JTextField tdosen = new JTextField();
JButton btntambah = new JButton ("Tambah Data");
JButton btntampil = new JButton("Tampil Data");

public Bio() {
       setTitle("Registrasi Mahasiswa");
	setDefaultCloseOperation(3);
	setSize(480,650);
        setLocation(500, 50);

	ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
	group.add(rbWanita);
        
        
        setLayout(null);
        add(ljudul);
        add(lnama);
        add(tnama);
        add(lnim);
        add(tnim);
        add(ljurusan);
        add(cmbjurusan);
        add(ljk);
	add(rbPria);
	add(rbWanita);
        add(alamat);
        add(falamat);
        add(ldosen);
        add(tdosen);
        add(btntambah);
	add(btntampil);
        
        
        ljudul.setBounds(150,20,150,30);
        lnama.setBounds(50,80,80,20);
        tnama.setBounds(120,80,210,20);
        lnim.setBounds(50,110,80,20);
        tnim.setBounds(120,110,210,20);
        ldosen.setBounds(50,140,80,20);
        tdosen.setBounds(120,140,210,20);
        ljurusan.setBounds(50,170,190,20);
        cmbjurusan.setBounds(120,170,210,20);
        ljk.setBounds(50,200,170,20);
        rbPria.setBounds(120,230,100,20);
	rbWanita.setBounds(240,230,100,20);
        alamat.setBounds(50,260,120,20);
        falamat.setBounds(120,260,220,75);
        btntambah.setBounds(120,370,120,30);
	btntampil.setBounds(260,370,120,30);
        
        btntampil.addActionListener(new ActionListener()
        {
        

           @Override
           public void actionPerformed(ActionEvent e) {
               String name = tnama.getText();
               String nims = tnim.getText();
               String address = falamat.getText();
               String majors = cmbjurusan.getSelectedItem().toString();
               String lecture = tdosen.getText();
               String Jenis_kelamin;
               if(rbPria.isSelected()){
                   Jenis_kelamin="Pria";
                   JOptionPane.showMessageDialog(rootPane,"Halo nama "+ name+" berjenis kelamin "+Jenis_kelamin+ " NIM saya adalah"+nims+
                           " Jurusan saya "+majors+" dan dosen wali saya "+lecture+". Alamat saya di "+address);
               }
               else if(rbWanita.isSelected()){
                    Jenis_kelamin="Wanita";
                    JOptionPane.showMessageDialog(rootPane," Halo nama saya "+ name+" berjenis kelamin "+Jenis_kelamin+ " NIM saya adalah "+nims+
                           " Jurusan "+majors+" dan dosen wali saya adalah "+lecture+". Alamat saya di "+address);
               }
           }
        });
        
	setVisible(true);
}
}