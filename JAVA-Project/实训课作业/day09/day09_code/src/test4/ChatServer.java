package test4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class ChatServer extends JFrame{
    JLabel ipJLabel = new JLabel("IP:");
    JLabel portJLabel = new JLabel("端口:");
    JTextField ipField   = new JTextField();
    JTextField portField = new JTextField();
    JTextField msgField  = new JTextField();
    JButton listenBtn    = new JButton("侦听");
    JButton disConBtn    = new JButton("断开");
    JButton sendBtn      = new JButton("发送");
    JTextArea msgRecArea = new JTextArea();
    JScrollPane scrollPanel = new JScrollPane(msgRecArea);

    ServerSocket server;
    Socket client;
    DataInputStream dis = null;
    DataOutputStream dos = null;
    boolean isConnected = false;
    ListenClient lisClient = null;

    public ChatServer() {
        super("服务器");
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        ipJLabel.setBounds(20, 30, 20, 30);
        ipField.setBounds(50, 30, 150, 30);
        portJLabel.setBounds(210, 30, 50, 30);
        portField.setBounds(260, 30, 60, 30);
        listenBtn.setBounds(330, 30, 60, 30);
        disConBtn.setBounds(400, 30, 60, 30);
        this.add(ipJLabel);
        this.add(ipField);
        this.add(portJLabel);
        this.add(portField);
        this.add(listenBtn);
        this.add(disConBtn);

        msgField.setBounds(50, 70, 300, 30);
        sendBtn.setBounds(400, 70, 60 , 30);
        this.add(msgField);
        this.add(sendBtn);
        scrollPanel.setBounds(50, 120, 360, 300);
        this.add(scrollPanel);
        msgRecArea.setEditable(false);
        disConBtn.setEnabled(false);
        ipField.setEditable(false);

        InetAddress inetAddr;
        try {
            inetAddr = InetAddress.getLocalHost();
            ipField.setText(inetAddr.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        ButtonListener listener = new ButtonListener();
        listenBtn.addActionListener(listener);
        disConBtn.addActionListener(listener);
        sendBtn.addActionListener(listener);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    private class ListenClient implements Runnable {
        public void run() {
            try {
                while (isConnected) {
                    String line = dis.readUTF();
                    msgRecArea.append("客户端说:" + line + "\n");
                }
            }
            catch (IOException ex) {
            }
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            if (cmd.equals("侦听")) {
                if (portField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "请输入端口号",
                            "提示",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int port = Integer.parseInt(portField.getText());
                listenBtn.setEnabled(false);
                disConBtn.setEnabled(true);
                try {
                    server = new ServerSocket(port);
                    client = server.accept();
                    msgRecArea.append("已连接客户机:" +
                            client.getInetAddress().toString() + ":" + client.getPort() + "\n");
                    dis = new DataInputStream(client.getInputStream());
                    dos = new DataOutputStream(client.getOutputStream());
                    isConnected = true;
                    lisClient = new ListenClient();
                    new Thread(lisClient).start();
                }
                catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(),
                            "提示",JOptionPane.ERROR_MESSAGE);
                }
            }
            else if (cmd.equals("断开")) {
                try {
                    server.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(),
                            "提示",JOptionPane.ERROR_MESSAGE);
                }
                listenBtn.setEnabled(true);
                disConBtn.setEnabled(false);
            }
            else if (cmd.equals("发送")) {
                try {
                    String content = msgField.getText();
                    msgField.setText(null);
                    dos.writeUTF(content);
                    msgRecArea.append("我说:" + content + "\n");
                }
                catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(),
                            "提示",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    public static void main (String [] args) {
        ChatServer chatServer = new ChatServer();
    }
}
