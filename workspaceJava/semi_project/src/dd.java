
//로그인1-1
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import database.UserDAO;
import database.UserVO;

public class dd extends JPanel implements ActionListener {//탭에들어가는정보

      JPanel centerPanel = new JPanel(new BorderLayout());
      JPanel inPanel= new JPanel(null);

           JPanel panel = new JPanel();
            JLabel idlbl= new JLabel("아이디");
            JLabel namelbl= new JLabel("이름");
         JLabel numlbl= new JLabel("주민등록번호");
         JLabel tellbl= new JLabel("휴대폰번호");
         JLabel underballbl= new JLabel("―");
         
         JTextField idfd= new JTextField(25);//아이디텍스트필드
         JTextField namefd= new JTextField(25);//이름텍스트필드
         JTextField numfd= new JTextField(15);//주민앞에텍스트필드
         
         JTextField numfd2= new JTextField(15);//-뒤에텍스트필드
         JTextField telfd= new JTextField(25);//전화번호필드
         
         JButton selectbtn = new JButton("확인");
         
          Font font3 = new Font("맑은 고딕",0, 20);
        Font fontidpw = new Font("맑은 고딕",Font.BOLD, 20);
        Font searchft = new Font("맑은 고딕",0, 16);//찾기폰트
            
        String id;
      
      public  dd (){
          
         setLayout(new FlowLayout());
         
         centerPanel.setPreferredSize(new Dimension(600,540));
         centerPanel.add(inPanel);
         add(centerPanel);
         
       inPanel.add(idlbl);//아이디라벨
       idlbl.setBounds(0,60,200,200);
       idlbl.setFont(fontidpw);
       inPanel.add(idfd); //이름 텍스트필드
       idfd.setBounds(130,140,280,40);
       
      
       inPanel.add(namelbl); //이름 라벨
       namelbl.setBounds(0,120,200,200);
       namelbl.setFont(fontidpw);
       inPanel.add(namefd); //이름 텍스트필드
       namefd.setBounds(130,200,280,40);
      
       inPanel.add(numlbl); //주민등록번호라벨
       numlbl.setBounds(0,178,200,200);
       numlbl.setFont(fontidpw);
       inPanel.add(numfd); //주민등록번호 텍스트필드
       numfd.setBounds(130,260,135,40);
     
       inPanel.add(underballbl);//주민등록번호 - 라벨
       underballbl.setBounds(267,260,132,40);//-라벨 크기
       inPanel.add(numfd2);
       numfd2.setBounds(280,260,131,40);//-뒤에 텍스트필드
       
       inPanel.add(tellbl);
       tellbl.setBounds(0,235,200,200);//휴대폰번호라벨
       tellbl.setFont(fontidpw);
       inPanel.add(telfd);
       telfd.setBounds(130,316,280,40);
       
       //확인버튼
       inPanel.add(selectbtn);
       selectbtn.setBounds(130,370,280,40);
       selectbtn.setBackground(Color.LIGHT_GRAY);
       selectbtn.setFocusPainted(false);
       selectbtn.setFont(font3);
       
       selectbtn.addActionListener(this);
       
         
      }

         //비밀번호 찾기.
      public void pwSearch() {
      UserVO uservo= new UserVO();
      uservo.setUser_id(idfd.getText());
      uservo.setUser_name(namefd.getText());
      uservo.setUser_num(numfd.getText().concat(numfd2.getText()));
      uservo.setUser_tel(telfd.getText());
      
      UserDAO userdao = new UserDAO();
      id = userdao.searchPw(uservo);  
      }
      
      public void checkSign() {
         if(idfd.getText()==null || idfd.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "아이디를 정확하게 입력해주세요");
         }else if(namefd.getText()==null || namefd.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "이름을 정확하게 입력해주세요");
         }else if(numfd.getText()==null || numfd2.getText()==null || 
               numfd.getText().equals("")|| numfd2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "주민등록 번호를 정확하게 입력해주세요");
         }else if(telfd.getText()==null || telfd.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "전화번호를 정확하게 입력해주세요");
         }else { //희수 추가
            //메소드 만들어놓고 실행은 안되고 있었음 ㅠㅠㅠ
            pwSearch();
            System.out.println(id);
            //왜 계속 id는 null값일까...
            if(id != null) {
               JOptionPane.showMessageDialog(this, "확인되었습니다.");
            }
            else {
               JOptionPane.showMessageDialog(this, "일치하는 정보가 없습니다.");
            }
            
            
         }
      }
   
   

      @Override
      public void actionPerformed(ActionEvent e) {
         Object event = e.getSource();
         if(event==(selectbtn)){
            checkSign();
         }
         
      }   
   }