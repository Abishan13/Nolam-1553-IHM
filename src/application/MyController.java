package application;

import java.net.URL;
import java.util.Formatter;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import eu.hansolo.enzo.canvasled.Led;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.*;
import java.awt.Component;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import com.jfoenix.controls.JFXCheckBox;

public class MyController implements Initializable
{
       @FXML
       private GridPane gp_bc;

       @FXML
       private JFXCheckBox cb_bcrt;

       @FXML
       private JFXCheckBox cb_rtbc;

       @FXML
       private JFXCheckBox cb_lineA;

       @FXML
       private JFXCheckBox cb_lineB;

       @FXML
       private JFXCheckBox cb_TX;

       @FXML
       private JFXCheckBox cb_RX;

       @FXML
       private ComboBox<String> cbb_rtaddr;

       @FXML
       private ComboBox<String> cbb_rtsa;

       @FXML
       private ComboBox<String> cbb_rtrdsa;

       @FXML
       private ComboBox<String> cbb_data;

       @FXML
       private Label lb_data1;

       @FXML
       private Label lb_data2;

       @FXML
       private Label lb_data3;

       @FXML
       private Label lb_data4;

       @FXML
       private Label lb_data5;

       @FXML
       private Label lb_data6;

       @FXML
       private Label lb_data7;

       @FXML
       private Label lb_data8;

       @FXML
       private Label lb_data9;

       @FXML
       private Label lb_data10;

       @FXML
       private Label lb_data11;

       @FXML
       private Label lb_data12;

       @FXML
       private Label lb_data13;

       @FXML
       private Label lb_data14;

       @FXML
       private Label lb_data15;

       @FXML
       private Label lb_data16;

       @FXML
       private Label lb_data17;

       @FXML
       private Label lb_data18;

       @FXML
       private Label lb_data19;

       @FXML
       private Label lb_data20;

       @FXML
       private Label lb_data21;

       @FXML
       private Label lb_data22;

       @FXML
       private Label lb_data23;

       @FXML
       private Label lb_data24;

       @FXML
       private Label lb_data25;

       @FXML
       private Label lb_data26;

       @FXML
       private Label lb_data27;

       @FXML
       private Label lb_data28;

       @FXML
       private Label lb_data29;

       @FXML
       private Label lb_data30;

       @FXML
       private Label lb_data31;

       @FXML
       private Label lb_data32;

       @FXML
       private Label lb_dataRT1;

       @FXML
       private Label lb_dataRT2;

       @FXML
       private Label lb_dataRT3;

       @FXML
       private Label lb_dataRT4;

       @FXML
       private Label lb_dataRT5;

       @FXML
       private Label lb_dataRT6;

       @FXML
       private Label lb_dataRT7;

       @FXML
       private Label lb_dataRT8;

       @FXML
       private Label lb_dataRT9;

       @FXML
       private Label lb_dataRT10;

       @FXML
       private Label lb_dataRT11;

       @FXML
       private Label lb_dataRT12;

       @FXML
       private Label lb_dataRT13;

       @FXML
       private Label lb_dataRT14;

       @FXML
       private Label lb_dataRT15;

       @FXML
       private Label lb_dataRT16;

       @FXML
       private Label lb_dataRT17;

       @FXML
       private Label lb_dataRT18;

       @FXML
       private Label lb_dataRT19;

       @FXML
       private Label lb_dataRT20;

       @FXML
       private Label lb_dataRT21;

       @FXML
       private Label lb_dataRT22;

       @FXML
       private Label lb_dataRT23;

       @FXML
       private Label lb_dataRT24;

       @FXML
       private Label lb_dataRT25;

       @FXML
       private Label lb_dataRT26;

       @FXML
       private Label lb_dataRT27;

       @FXML
       private Label lb_dataRT28;

       @FXML
       private Label lb_dataRT29;

       @FXML
       private Label lb_dataRT30;

       @FXML
       private Label lb_dataRT31;

       @FXML
       private Label lb_dataRT32;

       @FXML
       private TextField txt_data1;

       @FXML
       private TextField txt_data2;

       @FXML
       private TextField txt_data3;

       @FXML
       private TextField txt_data4;

       @FXML
       private TextField txt_data5;

       @FXML
       private TextField txt_data6;

       @FXML
       private TextField txt_data7;

       @FXML
       private TextField txt_data8;

       @FXML
       private TextField txt_data9;

       @FXML
       private TextField txt_data10;

       @FXML
       private TextField txt_data11;

       @FXML
       private TextField txt_data12;

       @FXML
       private TextField txt_data13;

       @FXML
       private TextField txt_data14;

       @FXML
       private TextField txt_data15;

       @FXML
       private TextField txt_data16;

       @FXML
       private TextField txt_data17;

       @FXML
       private TextField txt_data18;

       @FXML
       private TextField txt_data19;

       @FXML
       private TextField txt_data20;

       @FXML
       private TextField txt_data21;

       @FXML
       private TextField txt_data22;

       @FXML
       private TextField txt_data23;

       @FXML
       private TextField txt_data24;

       @FXML
       private TextField txt_data25;

       @FXML
       private TextField txt_data26;

       @FXML
       private TextField txt_data27;

       @FXML
       private TextField txt_data28;

       @FXML
       private TextField txt_data29;

       @FXML
       private TextField txt_data30;

       @FXML
       private TextField txt_data31;

       @FXML
       private TextField txt_data32;

       @FXML
       private TextField txt_dataRT1;

       @FXML
       private TextField txt_dataRT2;

       @FXML
       private TextField txt_dataRT3;

       @FXML
       private TextField txt_dataRT4;

       @FXML
       private TextField txt_dataRT5;

       @FXML
       private TextField txt_dataRT6;

       @FXML
       private TextField txt_dataRT7;

       @FXML
       private TextField txt_dataRT8;

       @FXML
       private TextField txt_dataRT9;

       @FXML
       private TextField txt_dataRT10;

       @FXML
       private TextField txt_dataRT11;

       @FXML
       private TextField txt_dataRT12;

       @FXML
       private TextField txt_dataRT13;

       @FXML
       private TextField txt_dataRT14;

       @FXML
       private TextField txt_dataRT15;

       @FXML
       private TextField txt_dataRT16;

       @FXML
       private TextField txt_dataRT17;

       @FXML
       private TextField txt_dataRT18;

       @FXML
       private TextField txt_dataRT19;

       @FXML
       private TextField txt_dataRT20;

       @FXML
       private TextField txt_dataRT21;

       @FXML
       private TextField txt_dataRT22;

       @FXML
       private TextField txt_dataRT23;

       @FXML
       private TextField txt_dataRT24;

       @FXML
       private TextField txt_dataRT25;

       @FXML
       private TextField txt_dataRT26;

       @FXML
       private TextField txt_dataRT27;

       @FXML
       private TextField txt_dataRT28;

       @FXML
       private TextField txt_dataRT29;

       @FXML
       private TextField txt_dataRT30;

       @FXML
       private TextField txt_dataRT31;

       @FXML
       private TextField txt_dataRT32;

       @FXML
       private TextField txt_datanb;

       @FXML
       private Button btn_data;

       @FXML
       private Button btn_rst;

       @FXML
       private Button btn_startbc;

       @FXML
       private TextField txt_stack;

       @FXML
       private Button btn_rdbc;

       @FXML
       private Button btn_add;

       @FXML
       private Button btn_RTadd;

       @FXML
       private Button btn_rdrt;

       @FXML
       private Button btn_RTrdcpt;

       @FXML
       private Button btn_RTrst;

       @FXML
       private TextField txt_ctrlwd;

       @FXML
       private TextField txt_ctrlwdadd;

       @FXML
       private TextField txt_cmdwd;

       @FXML
       private TextField txt_status;

       @FXML
       private TextField txt_datacnt;

       @FXML
       private TextField txt_add;

       @FXML
       private TextField txt_value;

       @FXML
       private TextField txt_RTadd;

       @FXML
       private TextField txt_RTvalue;

       @FXML
       private AnchorPane pane_bcread;

       @FXML
       private AnchorPane pane_bcconf;

       @FXML
       private AnchorPane pane_rtread;

       @FXML
       private DialogPane dp_rt;

       @FXML
       private ImageView btn_bcconfig;

       @FXML
       private ImageView btn_bcread;

       @FXML
       private ImageView btn_rtread;

       @FXML
       private Led led_hdmi;

       @FXML
       private Led led_temp;

       @FXML
       private Led led_hum;

       @FXML
       private Led led_tx1;

       @FXML
       private Led led_tx2;

       @FXML
       private Led led_tx3;

       @FXML
       private Led led_tx4;

       @FXML
       private Led led_tx5;

       @FXML
       private Led led_tx6;

       @FXML
       private Led led_tx7;

       @FXML
       private Led led_tx8;

       @FXML
       private Led led_tx9;

       @FXML
       private Led led_tx10;

       @FXML
       private Led led_tx11;

       @FXML
       private Led led_tx12;

       @FXML
       private Led led_tx13;

       @FXML
       private Led led_tx14;

       @FXML
       private Led led_tx15;

       @FXML
       private Led led_tx16;

       @FXML
       private Led led_tx17;

       @FXML
       private Led led_tx18;

       @FXML
       private Led led_tx19;

       @FXML
       private Led led_tx20;

       @FXML
       private Led led_tx21;

       @FXML
       private Led led_tx22;

       @FXML
       private Led led_tx23;

       @FXML
       private Led led_tx24;

       @FXML
       private Led led_tx25;

       @FXML
       private Led led_tx26;

       @FXML
       private Led led_tx27;

       @FXML
       private Led led_tx28;

       @FXML
       private Led led_tx29;

       @FXML
       private Led led_tx30;

       @FXML
       private Led led_rx1;

       @FXML
       private Led led_rx2;

       @FXML
       private Led led_rx3;

       @FXML
       private Led led_rx4;

       @FXML
       private Led led_rx5;

       @FXML
       private Led led_rx6;

       @FXML
       private Led led_rx7;

       @FXML
       private Led led_rx8;

       @FXML
       private Led led_rx9;

       @FXML
       private Led led_rx10;

       @FXML
       private Led led_rx11;

       @FXML
       private Led led_rx12;

       @FXML
       private Led led_rx13;

       @FXML
       private Led led_rx14;

       @FXML
       private Led led_rx15;

       @FXML
       private Led led_rx16;

       @FXML
       private Led led_rx17;

       @FXML
       private Led led_rx18;

       @FXML
       private Led led_rx19;

       @FXML
       private Led led_rx20;

       @FXML
       private Led led_rx21;

       @FXML
       private Led led_rx22;

       @FXML
       private Led led_rx23;

       @FXML
       private Led led_rx24;

       @FXML
       private Led led_rx25;

       @FXML
       private Led led_rx26;

       @FXML
       private Led led_rx27;

       @FXML
       private Led led_rx28;

       @FXML
       private Led led_rx29;

       @FXML
       private Led led_rx30;

       @FXML
       private TitledPane tp_RTdata;

       private Socket clientSocket;
       private PrintWriter out;
       private Boolean senddata;
       private int init_addr_bc = 3;
       private int read_data;
       private Component frame = null;
       private StringBuilder sb = new StringBuilder(6);
       private String hexa;

       @Override
       public void initialize(URL location, ResourceBundle resources)
       {

           // Init
           pane_bcconf.setVisible(true);
           pane_rtread.setVisible(false);
           tp_RTdata.setVisible(false);
           cb_bcrt.setSelected(true);
           cb_lineA.setSelected(true);
           cb_TX.setSelected(true);
           senddata = true;
           sb.setLength(0);
           new Formatter(sb).format("%04X",264);
           hexa = sb.toString();
           txt_stack.setText("0x"+hexa);

           cbb_rtaddr.getItems().addAll("0x0","0x1","0x2","0x3","0x4","0x5","0x6","0x7","0x8"
        		   ,"0x9","0xA","0xB","0xC","0xD","0xE","0xF","0x10","0x11","0x12","0x13",
        		   "0x14","0x15","0x16","0x17","0x18","0x19","0x1A","0x1B","0x1C","0x1D","0x1E");
           cbb_rtaddr.setValue("0x18");
           cbb_rtsa.getItems().addAll("0x1","0x2","0x3","0x4","0x5","0x6","0x7","0x8"
        		   ,"0x9","0xA","0xB","0xC","0xD","0xE","0xF","0x10","0x11","0x12","0x13",
        		   "0x14","0x15","0x16","0x17","0x18","0x19","0x1A","0x1B","0x1C","0x1D","0x1E");
           cbb_rtsa.setValue("0x1");
           cbb_rtrdsa.getItems().addAll("0x1","0x2","0x3","0x4","0x5","0x6","0x7","0x8"
        		   ,"0x9","0xA","0xB","0xC","0xD","0xE","0xF","0x10","0x11","0x12","0x13",
        		   "0x14","0x15","0x16","0x17","0x18","0x19","0x1A","0x1B","0x1C","0x1D","0x1E");
           cbb_rtrdsa.setValue("0x1");
           cbb_data.getItems().addAll("0x1","0x2","0x3","0x4","0x5","0x6","0x7","0x8"
        		   ,"0x9","0xA","0xB","0xC","0xD","0xE","0xF","0x10","0x11","0x12","0x13",
        		   "0x14","0x15","0x16","0x17","0x18","0x19","0x1A","0x1B","0x1C","0x1D","0x1E",
        		   "0x1F", "0x20");
           cbb_data.setValue("0x1");

           txt_datanb.setEditable(false);
           txt_ctrlwd.setEditable(false);
           txt_cmdwd.setEditable(false);
           txt_status.setEditable(false);
           txt_datacnt.setEditable(false);
           txt_value.setEditable(false);
           txt_RTvalue.setEditable(false);
           txt_dataRT1.setEditable(false);
           txt_dataRT2.setEditable(false);
           txt_dataRT3.setEditable(false);
           txt_dataRT4.setEditable(false);
           txt_dataRT5.setEditable(false);
           txt_dataRT6.setEditable(false);
           txt_dataRT7.setEditable(false);
           txt_dataRT8.setEditable(false);
           txt_dataRT9.setEditable(false);
           txt_dataRT10.setEditable(false);
           txt_dataRT11.setEditable(false);
           txt_dataRT12.setEditable(false);
           txt_dataRT13.setEditable(false);
           txt_dataRT14.setEditable(false);
           txt_dataRT15.setEditable(false);
           txt_dataRT16.setEditable(false);
           txt_dataRT17.setEditable(false);
           txt_dataRT18.setEditable(false);
           txt_dataRT19.setEditable(false);
           txt_dataRT20.setEditable(false);
           txt_dataRT21.setEditable(false);
           txt_dataRT22.setEditable(false);
           txt_dataRT23.setEditable(false);
           txt_dataRT24.setEditable(false);
           txt_dataRT25.setEditable(false);
           txt_dataRT26.setEditable(false);
           txt_dataRT27.setEditable(false);
           txt_dataRT28.setEditable(false);
           txt_dataRT29.setEditable(false);
           txt_dataRT30.setEditable(false);
           txt_dataRT31.setEditable(false);
           txt_dataRT32.setEditable(false);

           lb_data1.setVisible(true);
           txt_data1.setVisible(true);
           lb_data2.setVisible(false);
           txt_data2.setVisible(false);
           lb_data3.setVisible(false);
           txt_data3.setVisible(false);
           lb_data4.setVisible(false);
           txt_data4.setVisible(false);
           lb_data5.setVisible(false);
           txt_data5.setVisible(false);
           lb_data6.setVisible(false);
           txt_data6.setVisible(false);
           lb_data7.setVisible(false);
           txt_data7.setVisible(false);
           lb_data8.setVisible(false);
           txt_data8.setVisible(false);
           lb_data9.setVisible(false);
           txt_data9.setVisible(false);
           lb_data10.setVisible(false);
           txt_data10.setVisible(false);
           lb_data11.setVisible(false);
           txt_data11.setVisible(false);
           lb_data12.setVisible(false);
           txt_data12.setVisible(false);
           lb_data13.setVisible(false);
           txt_data13.setVisible(false);
           lb_data14.setVisible(false);
           txt_data14.setVisible(false);
           lb_data15.setVisible(false);
           txt_data15.setVisible(false);
           lb_data16.setVisible(false);
           txt_data16.setVisible(false);
           lb_data17.setVisible(false);
           txt_data17.setVisible(false);
           lb_data18.setVisible(false);
           txt_data18.setVisible(false);
           lb_data19.setVisible(false);
           txt_data19.setVisible(false);
           lb_data20.setVisible(false);
           txt_data20.setVisible(false);
           lb_data21.setVisible(false);
           txt_data21.setVisible(false);
           lb_data22.setVisible(false);
           txt_data22.setVisible(false);
           lb_data23.setVisible(false);
           txt_data23.setVisible(false);
           lb_data24.setVisible(false);
           txt_data24.setVisible(false);
           lb_data25.setVisible(false);
           txt_data25.setVisible(false);
           lb_data26.setVisible(false);
           txt_data26.setVisible(false);
           lb_data27.setVisible(false);
           txt_data27.setVisible(false);
           lb_data28.setVisible(false);
           txt_data28.setVisible(false);
           lb_data29.setVisible(false);
           txt_data29.setVisible(false);
           lb_data30.setVisible(false);
           txt_data30.setVisible(false);
           lb_data31.setVisible(false);
           txt_data31.setVisible(false);
           lb_data32.setVisible(false);
           txt_data32.setVisible(false);

           // Set Leds Color to Green
           led_tx1.setLedColor(Color.GREEN);
           led_rx1.setLedColor(Color.GREEN);
           led_tx2.setLedColor(Color.GREEN);
           led_rx2.setLedColor(Color.GREEN);
           led_tx3.setLedColor(Color.GREEN);
           led_rx3.setLedColor(Color.GREEN);
           led_tx4.setLedColor(Color.GREEN);
           led_rx4.setLedColor(Color.GREEN);
           led_tx5.setLedColor(Color.GREEN);
           led_rx5.setLedColor(Color.GREEN);
           led_tx6.setLedColor(Color.GREEN);
           led_rx6.setLedColor(Color.GREEN);
           led_tx7.setLedColor(Color.GREEN);
           led_rx7.setLedColor(Color.GREEN);
           led_tx8.setLedColor(Color.GREEN);
           led_rx8.setLedColor(Color.GREEN);
           led_tx9.setLedColor(Color.GREEN);
           led_rx9.setLedColor(Color.GREEN);
           led_tx10.setLedColor(Color.GREEN);
           led_rx10.setLedColor(Color.GREEN);
           led_tx11.setLedColor(Color.GREEN);
           led_rx11.setLedColor(Color.GREEN);
           led_tx12.setLedColor(Color.GREEN);
           led_rx12.setLedColor(Color.GREEN);
           led_tx13.setLedColor(Color.GREEN);
           led_rx13.setLedColor(Color.GREEN);
           led_tx14.setLedColor(Color.GREEN);
           led_rx14.setLedColor(Color.GREEN);
           led_tx15.setLedColor(Color.GREEN);
           led_rx15.setLedColor(Color.GREEN);
           led_rx15.setLedColor(Color.GREEN);
           led_tx16.setLedColor(Color.GREEN);
           led_rx16.setLedColor(Color.GREEN);
           led_tx17.setLedColor(Color.GREEN);
           led_rx17.setLedColor(Color.GREEN);
           led_tx18.setLedColor(Color.GREEN);
           led_rx18.setLedColor(Color.GREEN);
           led_tx19.setLedColor(Color.GREEN);
           led_rx19.setLedColor(Color.GREEN);
           led_tx20.setLedColor(Color.GREEN);
           led_rx20.setLedColor(Color.GREEN);
           led_tx21.setLedColor(Color.GREEN);
           led_rx21.setLedColor(Color.GREEN);
           led_tx22.setLedColor(Color.GREEN);
           led_rx22.setLedColor(Color.GREEN);
           led_tx23.setLedColor(Color.GREEN);
           led_rx23.setLedColor(Color.GREEN);
           led_tx24.setLedColor(Color.GREEN);
           led_rx24.setLedColor(Color.GREEN);
           led_tx25.setLedColor(Color.GREEN);
           led_rx25.setLedColor(Color.GREEN);
           led_tx26.setLedColor(Color.GREEN);
           led_rx26.setLedColor(Color.GREEN);
           led_tx27.setLedColor(Color.GREEN);
           led_rx27.setLedColor(Color.GREEN);
           led_tx28.setLedColor(Color.GREEN);
           led_rx28.setLedColor(Color.GREEN);
           led_tx29.setLedColor(Color.GREEN);
           led_rx29.setLedColor(Color.GREEN);
           led_tx30.setLedColor(Color.GREEN);
           led_rx30.setLedColor(Color.GREEN);


           // BC Mode Selection
           cb_bcrt.selectedProperty().addListener(new ChangeListener<Boolean>() {
                public void changed(ObservableValue<? extends Boolean> ov,
                Boolean old_val, Boolean new_val)
                {
                    if (cb_bcrt.isSelected() == true)
                    {
                        gp_bc.setVisible(true);
                        cb_rtbc.setSelected(false);
                    }
                }
           });

           cb_rtbc.selectedProperty().addListener(new ChangeListener<Boolean>() {
                public void changed(ObservableValue<? extends Boolean> ov,
                Boolean old_val, Boolean new_val)
                {
                    if (cb_rtbc.isSelected() == true)
                    {
                        gp_bc.setVisible(false);
                        cb_bcrt.setSelected(false);
                    }
               }
           });

           // BC Line Selection
           cb_lineA.selectedProperty().addListener(new ChangeListener<Boolean>() {
                public void changed(ObservableValue<? extends Boolean> ov,
                Boolean old_val, Boolean new_val)
                {
                    if (cb_lineA.isSelected() == true)
                    {
                        cb_lineB.setSelected(false);
                    }
             }
           });

           cb_lineB.selectedProperty().addListener(new ChangeListener<Boolean>() {
                public void changed(ObservableValue<? extends Boolean> ov,
                Boolean old_val, Boolean new_val)
                {
                    if (cb_lineB.isSelected() == true)
                    {
                        cb_lineA.setSelected(false);
                    }
            }
           });

           txt_stack.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
            	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_stack.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Stack error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_stack.getText()) < 0 || Integer.decode(txt_stack.getText()) > 65535)
               {
                   txt_stack.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Stack error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data1.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data1.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data1.getText()) < 0 || Integer.decode(txt_data1.getText())  > 65535)
               {
                   txt_data1.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data2.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data2.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data2.getText()) < 0 || Integer.decode(txt_data2.getText()) > 65535)
               {
                   txt_data2.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data3.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data3.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data3.getText()) < 0 || Integer.decode(txt_data3.getText()) > 65535)
               {
                   txt_data3.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data4.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data4.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data4.getText()) < 0 || Integer.decode(txt_data4.getText()) > 65535)
               {
                   txt_data4.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data5.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data5.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data5.getText()) < 0 || Integer.decode(txt_data5.getText()) > 65535)
               {
                   txt_data5.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data6.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data6.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data6.getText()) < 0 || Integer.decode(txt_data6.getText()) > 65535)
               {
                   txt_data6.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data7.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data7.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data7.getText()) < 0 || Integer.decode(txt_data7.getText()) > 65535)
               {
                   txt_data7.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data8.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data8.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data8.getText()) < 0 || Integer.decode(txt_data8.getText()) > 65535)
               {
                   txt_data8.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data9.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data9.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data9.getText()) < 0 || Integer.decode(txt_data9.getText()) > 65535)
               {
                   txt_data9.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data10.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data10.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data10.getText()) < 0 || Integer.decode(txt_data10.getText()) > 65535)
               {
                   txt_data10.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data11.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data11.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data11.getText()) < 0 || Integer.decode(txt_data11.getText()) > 65535)
               {
                   txt_data11.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data12.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data12.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data12.getText()) < 0 || Integer.decode(txt_data12.getText()) > 65535)
               {
                   txt_data12.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data13.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data13.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data13.getText()) < 0 || Integer.decode(txt_data13.getText()) > 65535)
               {
                   txt_data13.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data14.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data14.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data14.getText()) < 0 || Integer.decode(txt_data14.getText()) > 65535)
               {
                   txt_data14.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data15.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data15.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data15.getText()) < 0 || Integer.decode(txt_data15.getText()) > 65535)
               {
                   txt_data15.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data16.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data16.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data16.getText()) < 0 || Integer.decode(txt_data16.getText()) > 65535)
               {
                   txt_data16.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data17.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data17.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data17.getText()) < 0 || Integer.decode(txt_data17.getText()) > 65535)
               {
                   txt_data17.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data18.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data18.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data18.getText()) < 0 || Integer.decode(txt_data18.getText()) > 65535)
               {
                   txt_data18.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data19.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data19.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data19.getText()) < 0 || Integer.decode(txt_data19.getText()) > 65535)
               {
                   txt_data19.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data20.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data20.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data20.getText()) < 0 || Integer.decode(txt_data20.getText()) > 65535)
               {
                   txt_data20.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data21.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data21.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data21.getText()) < 0 || Integer.decode(txt_data21.getText()) > 65535)
               {
                   txt_data21.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data22.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data22.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data22.getText()) < 0 || Integer.decode(txt_data22.getText()) > 65535)
               {
                   txt_data22.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data23.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data23.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data23.getText()) < 0 || Integer.decode(txt_data23.getText()) > 65535)
               {
                   txt_data23.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data24.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data24.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data24.getText()) < 0 || Integer.decode(txt_data24.getText()) > 65535)
               {
                   txt_data24.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data25.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data25.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data25.getText()) < 0 || Integer.decode(txt_data25.getText()) > 65535)
               {
                   txt_data25.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data26.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data26.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data26.getText()) < 0 || Integer.decode(txt_data26.getText()) > 65535)
               {
                   txt_data26.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data27.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data27.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data27.getText()) < 0 || Integer.decode(txt_data27.getText()) > 65535)
               {
                   txt_data27.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data28.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data28.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data28.getText()) < 0 || Integer.decode(txt_data28.getText()) > 65535)
               {
                   txt_data28.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data29.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data29.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data29.getText()) < 0 || Integer.decode(txt_data29.getText()) > 65535)
               {
                   txt_data29.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data30.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data30.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data30.getText()) < 0 || Integer.decode(txt_data30.getText()) > 65535)
               {
                   txt_data30.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data31.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data31.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data31.getText()) < 0 || Integer.decode(txt_data31.getText()) > 65535)
               {
                   txt_data31.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_data32.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_data32.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_data32.getText()) < 0 || Integer.decode(txt_data32.getText()) > 65535)
               {
                   txt_data32.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Data error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_ctrlwdadd.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_ctrlwdadd.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Control Word Address error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_ctrlwdadd.getText()) < 0 || Integer.decode(txt_ctrlwdadd.getText()) > 65535)
               {
                   txt_ctrlwdadd.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFF !",
                   "BC Control Word Address error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_add.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_add.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "BC Address error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_add.getText()) < 0 || Integer.decode(txt_add.getText()) > 1048575)
               {
                   txt_add.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFFF !",
                   "BC Address error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           txt_RTadd.setOnKeyReleased(event -> {
               // Do nothing for the enter key
               if (event.getCode() == KeyCode.ENTER || event.getCode() == KeyCode.TAB ||
                	   event.getCode() == KeyCode.SHIFT || event.getCode() == KeyCode.CAPS)
               {
                   event.consume();
               }
               // Textfield with hexa number only protection
               else if (event.getCode() != KeyCode.NUMPAD0 && event.getCode() != KeyCode.NUMPAD1 &&
                   event.getCode() != KeyCode.NUMPAD2 && event.getCode() != KeyCode.NUMPAD3 &&
                   event.getCode() != KeyCode.NUMPAD4 && event.getCode() != KeyCode.NUMPAD5 &&
                   event.getCode() != KeyCode.NUMPAD6 && event.getCode() != KeyCode.NUMPAD7 &&
                   event.getCode() != KeyCode.NUMPAD8 && event.getCode() != KeyCode.NUMPAD9 &&
                   event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.A &&
                   event.getCode() != KeyCode.B && event.getCode() != KeyCode.C &&
                   event.getCode() != KeyCode.D && event.getCode() != KeyCode.E &&
                   event.getCode() != KeyCode.F && event.getCode() != KeyCode.X)
               {
                   event.consume();
                   txt_RTadd.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers !",
                   "RT Address error",
                   JOptionPane.ERROR_MESSAGE);
               }
               // Textfield with threshold protection
               else if (Integer.decode(txt_RTadd.getText()) < 0 || Integer.decode(txt_RTadd.getText()) > 1048575)
               {
                   txt_RTadd.clear();
                   JOptionPane.showMessageDialog(frame,
                   "You have to add only numbers between 0x0 and 0xFFFFF !",
                   "RT Address error",
                   JOptionPane.ERROR_MESSAGE);
               }
             });

           // BC Dataword count
           cbb_data.valueProperty().addListener((ChangeListener<String>) (ov, t, t1) -> {
            if (cbb_data.getValue() == "0x1")
            {
            	lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(false);
                txt_data2.setVisible(false);
                lb_data3.setVisible(false);
                txt_data3.setVisible(false);
                lb_data4.setVisible(false);
                txt_data4.setVisible(false);
                lb_data5.setVisible(false);
                txt_data5.setVisible(false);
                lb_data6.setVisible(false);
                txt_data6.setVisible(false);
                lb_data7.setVisible(false);
                txt_data7.setVisible(false);
                lb_data8.setVisible(false);
                txt_data8.setVisible(false);
                lb_data9.setVisible(false);
                txt_data9.setVisible(false);
                lb_data10.setVisible(false);
                txt_data10.setVisible(false);
                lb_data11.setVisible(false);
                txt_data11.setVisible(false);
                lb_data12.setVisible(false);
                txt_data12.setVisible(false);
                lb_data13.setVisible(false);
                txt_data13.setVisible(false);
                lb_data14.setVisible(false);
                txt_data14.setVisible(false);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x2")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(false);
                txt_data3.setVisible(false);
                lb_data4.setVisible(false);
                txt_data4.setVisible(false);
                lb_data5.setVisible(false);
                txt_data5.setVisible(false);
                lb_data6.setVisible(false);
                txt_data6.setVisible(false);
                lb_data7.setVisible(false);
                txt_data7.setVisible(false);
                lb_data8.setVisible(false);
                txt_data8.setVisible(false);
                lb_data9.setVisible(false);
                txt_data9.setVisible(false);
                lb_data10.setVisible(false);
                txt_data10.setVisible(false);
                lb_data11.setVisible(false);
                txt_data11.setVisible(false);
                lb_data12.setVisible(false);
                txt_data12.setVisible(false);
                lb_data13.setVisible(false);
                txt_data13.setVisible(false);
                lb_data14.setVisible(false);
                txt_data14.setVisible(false);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x3")
            {

                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(false);
                txt_data4.setVisible(false);
                lb_data5.setVisible(false);
                txt_data5.setVisible(false);
                lb_data6.setVisible(false);
                txt_data6.setVisible(false);
                lb_data7.setVisible(false);
                txt_data7.setVisible(false);
                lb_data8.setVisible(false);
                txt_data8.setVisible(false);
                lb_data9.setVisible(false);
                txt_data9.setVisible(false);
                lb_data10.setVisible(false);
                txt_data10.setVisible(false);
                lb_data11.setVisible(false);
                txt_data11.setVisible(false);
                lb_data12.setVisible(false);
                txt_data12.setVisible(false);
                lb_data13.setVisible(false);
                txt_data13.setVisible(false);
                lb_data14.setVisible(false);
                txt_data14.setVisible(false);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x4")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(false);
                txt_data5.setVisible(false);
                lb_data6.setVisible(false);
                txt_data6.setVisible(false);
                lb_data7.setVisible(false);
                txt_data7.setVisible(false);
                lb_data8.setVisible(false);
                txt_data8.setVisible(false);
                lb_data9.setVisible(false);
                txt_data9.setVisible(false);
                lb_data10.setVisible(false);
                txt_data10.setVisible(false);
                lb_data11.setVisible(false);
                txt_data11.setVisible(false);
                lb_data12.setVisible(false);
                txt_data12.setVisible(false);
                lb_data13.setVisible(false);
                txt_data13.setVisible(false);
                lb_data14.setVisible(false);
                txt_data14.setVisible(false);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x5")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(false);
                txt_data6.setVisible(false);
                lb_data7.setVisible(false);
                txt_data7.setVisible(false);
                lb_data8.setVisible(false);
                txt_data8.setVisible(false);
                lb_data9.setVisible(false);
                txt_data9.setVisible(false);
                lb_data10.setVisible(false);
                txt_data10.setVisible(false);
                lb_data11.setVisible(false);
                txt_data11.setVisible(false);
                lb_data12.setVisible(false);
                txt_data12.setVisible(false);
                lb_data13.setVisible(false);
                txt_data13.setVisible(false);
                lb_data14.setVisible(false);
                txt_data14.setVisible(false);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x6")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(false);
                txt_data7.setVisible(false);
                lb_data8.setVisible(false);
                txt_data8.setVisible(false);
                lb_data9.setVisible(false);
                txt_data9.setVisible(false);
                lb_data10.setVisible(false);
                txt_data10.setVisible(false);
                lb_data11.setVisible(false);
                txt_data11.setVisible(false);
                lb_data12.setVisible(false);
                txt_data12.setVisible(false);
                lb_data13.setVisible(false);
                txt_data13.setVisible(false);
                lb_data14.setVisible(false);
                txt_data14.setVisible(false);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x7")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(false);
                txt_data8.setVisible(false);
                lb_data9.setVisible(false);
                txt_data9.setVisible(false);
                lb_data10.setVisible(false);
                txt_data10.setVisible(false);
                lb_data11.setVisible(false);
                txt_data11.setVisible(false);
                lb_data12.setVisible(false);
                txt_data12.setVisible(false);
                lb_data13.setVisible(false);
                txt_data13.setVisible(false);
                lb_data14.setVisible(false);
                txt_data14.setVisible(false);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x8")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(false);
                txt_data9.setVisible(false);
                lb_data10.setVisible(false);
                txt_data10.setVisible(false);
                lb_data11.setVisible(false);
                txt_data11.setVisible(false);
                lb_data12.setVisible(false);
                txt_data12.setVisible(false);
                lb_data13.setVisible(false);
                txt_data13.setVisible(false);
                lb_data14.setVisible(false);
                txt_data14.setVisible(false);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x9")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(false);
                txt_data10.setVisible(false);
                lb_data11.setVisible(false);
                txt_data11.setVisible(false);
                lb_data12.setVisible(false);
                txt_data12.setVisible(false);
                lb_data13.setVisible(false);
                txt_data13.setVisible(false);
                lb_data14.setVisible(false);
                txt_data14.setVisible(false);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0xA")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(false);
                txt_data11.setVisible(false);
                lb_data12.setVisible(false);
                txt_data12.setVisible(false);
                lb_data13.setVisible(false);
                txt_data13.setVisible(false);
                lb_data14.setVisible(false);
                txt_data14.setVisible(false);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0xB")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(false);
                txt_data12.setVisible(false);
                lb_data13.setVisible(false);
                txt_data13.setVisible(false);
                lb_data14.setVisible(false);
                txt_data14.setVisible(false);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0xC")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(false);
                txt_data13.setVisible(false);
                lb_data14.setVisible(false);
                txt_data14.setVisible(false);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0xD")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(false);
                txt_data14.setVisible(false);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0xE")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(false);
                txt_data15.setVisible(false);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0xF")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(false);
                txt_data16.setVisible(false);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x10")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(false);
                txt_data17.setVisible(false);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x11")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(false);
                txt_data18.setVisible(false);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x12")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(false);
                txt_data19.setVisible(false);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x13")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(false);
                txt_data20.setVisible(false);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x14")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(true);
                txt_data20.setVisible(true);
                lb_data21.setVisible(false);
                txt_data21.setVisible(false);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x15")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(true);
                txt_data20.setVisible(true);
                lb_data21.setVisible(true);
                txt_data21.setVisible(true);
                lb_data22.setVisible(false);
                txt_data22.setVisible(false);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x16")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(true);
                txt_data20.setVisible(true);
                lb_data21.setVisible(true);
                txt_data21.setVisible(true);
                lb_data22.setVisible(true);
                txt_data22.setVisible(true);
                lb_data23.setVisible(false);
                txt_data23.setVisible(false);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x17")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(true);
                txt_data20.setVisible(true);
                lb_data21.setVisible(true);
                txt_data21.setVisible(true);
                lb_data22.setVisible(true);
                txt_data22.setVisible(true);
                lb_data23.setVisible(true);
                txt_data23.setVisible(true);
                lb_data24.setVisible(false);
                txt_data24.setVisible(false);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x18")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(true);
                txt_data20.setVisible(true);
                lb_data21.setVisible(true);
                txt_data21.setVisible(true);
                lb_data22.setVisible(true);
                txt_data22.setVisible(true);
                lb_data23.setVisible(true);
                txt_data23.setVisible(true);
                lb_data24.setVisible(true);
                txt_data24.setVisible(true);
                lb_data25.setVisible(false);
                txt_data25.setVisible(false);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x19")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(true);
                txt_data20.setVisible(true);
                lb_data21.setVisible(true);
                txt_data21.setVisible(true);
                lb_data22.setVisible(true);
                txt_data22.setVisible(true);
                lb_data23.setVisible(true);
                txt_data23.setVisible(true);
                lb_data24.setVisible(true);
                txt_data24.setVisible(true);
                lb_data25.setVisible(true);
                txt_data25.setVisible(true);
                lb_data26.setVisible(false);
                txt_data26.setVisible(false);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x1A")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(true);
                txt_data20.setVisible(true);
                lb_data21.setVisible(true);
                txt_data21.setVisible(true);
                lb_data22.setVisible(true);
                txt_data22.setVisible(true);
                lb_data23.setVisible(true);
                txt_data23.setVisible(true);
                lb_data24.setVisible(true);
                txt_data24.setVisible(true);
                lb_data25.setVisible(true);
                txt_data25.setVisible(true);
                lb_data26.setVisible(true);
                txt_data26.setVisible(true);
                lb_data27.setVisible(false);
                txt_data27.setVisible(false);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x1B")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(true);
                txt_data20.setVisible(true);
                lb_data21.setVisible(true);
                txt_data21.setVisible(true);
                lb_data22.setVisible(true);
                txt_data22.setVisible(true);
                lb_data23.setVisible(true);
                txt_data23.setVisible(true);
                lb_data24.setVisible(true);
                txt_data24.setVisible(true);
                lb_data25.setVisible(true);
                txt_data25.setVisible(true);
                lb_data26.setVisible(true);
                txt_data26.setVisible(true);
                lb_data27.setVisible(true);
                txt_data27.setVisible(true);
                lb_data28.setVisible(false);
                txt_data28.setVisible(false);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x1C")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(true);
                txt_data20.setVisible(true);
                lb_data21.setVisible(true);
                txt_data21.setVisible(true);
                lb_data22.setVisible(true);
                txt_data22.setVisible(true);
                lb_data23.setVisible(true);
                txt_data23.setVisible(true);
                lb_data24.setVisible(true);
                txt_data24.setVisible(true);
                lb_data25.setVisible(true);
                txt_data25.setVisible(true);
                lb_data26.setVisible(true);
                txt_data26.setVisible(true);
                lb_data27.setVisible(true);
                txt_data27.setVisible(true);
                lb_data28.setVisible(true);
                txt_data28.setVisible(true);
                lb_data29.setVisible(false);
                txt_data29.setVisible(false);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x1D")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(true);
                txt_data20.setVisible(true);
                lb_data21.setVisible(true);
                txt_data21.setVisible(true);
                lb_data22.setVisible(true);
                txt_data22.setVisible(true);
                lb_data23.setVisible(true);
                txt_data23.setVisible(true);
                lb_data24.setVisible(true);
                txt_data24.setVisible(true);
                lb_data25.setVisible(true);
                txt_data25.setVisible(true);
                lb_data26.setVisible(true);
                txt_data26.setVisible(true);
                lb_data27.setVisible(true);
                txt_data27.setVisible(true);
                lb_data28.setVisible(true);
                txt_data28.setVisible(true);
                lb_data29.setVisible(true);
                txt_data29.setVisible(true);
                lb_data30.setVisible(false);
                txt_data30.setVisible(false);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x1E")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(true);
                txt_data20.setVisible(true);
                lb_data21.setVisible(true);
                txt_data21.setVisible(true);
                lb_data22.setVisible(true);
                txt_data22.setVisible(true);
                lb_data23.setVisible(true);
                txt_data23.setVisible(true);
                lb_data24.setVisible(true);
                txt_data24.setVisible(true);
                lb_data25.setVisible(true);
                txt_data25.setVisible(true);
                lb_data26.setVisible(true);
                txt_data26.setVisible(true);
                lb_data27.setVisible(true);
                txt_data27.setVisible(true);
                lb_data28.setVisible(true);
                txt_data28.setVisible(true);
                lb_data29.setVisible(true);
                txt_data29.setVisible(true);
                lb_data30.setVisible(true);
                txt_data30.setVisible(true);
                lb_data31.setVisible(false);
                txt_data31.setVisible(false);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x1F")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(true);
                txt_data20.setVisible(true);
                lb_data21.setVisible(true);
                txt_data21.setVisible(true);
                lb_data22.setVisible(true);
                txt_data22.setVisible(true);
                lb_data23.setVisible(true);
                txt_data23.setVisible(true);
                lb_data24.setVisible(true);
                txt_data24.setVisible(true);
                lb_data25.setVisible(true);
                txt_data25.setVisible(true);
                lb_data26.setVisible(true);
                txt_data26.setVisible(true);
                lb_data27.setVisible(true);
                txt_data27.setVisible(true);
                lb_data28.setVisible(true);
                txt_data28.setVisible(true);
                lb_data29.setVisible(true);
                txt_data29.setVisible(true);
                lb_data30.setVisible(true);
                txt_data30.setVisible(true);
                lb_data31.setVisible(true);
                txt_data31.setVisible(true);
                lb_data32.setVisible(false);
                txt_data32.setVisible(false);
            }

            else if (cbb_data.getValue() == "0x20")
            {
                lb_data1.setVisible(true);
                txt_data1.setVisible(true);
                lb_data2.setVisible(true);
                txt_data2.setVisible(true);
                lb_data3.setVisible(true);
                txt_data3.setVisible(true);
                lb_data4.setVisible(true);
                txt_data4.setVisible(true);
                lb_data5.setVisible(true);
                txt_data5.setVisible(true);
                lb_data6.setVisible(true);
                txt_data6.setVisible(true);
                lb_data7.setVisible(true);
                txt_data7.setVisible(true);
                lb_data8.setVisible(true);
                txt_data8.setVisible(true);
                lb_data9.setVisible(true);
                txt_data9.setVisible(true);
                lb_data10.setVisible(true);
                txt_data10.setVisible(true);
                lb_data11.setVisible(true);
                txt_data11.setVisible(true);
                lb_data12.setVisible(true);
                txt_data12.setVisible(true);
                lb_data13.setVisible(true);
                txt_data13.setVisible(true);
                lb_data14.setVisible(true);
                txt_data14.setVisible(true);
                lb_data15.setVisible(true);
                txt_data15.setVisible(true);
                lb_data16.setVisible(true);
                txt_data16.setVisible(true);
                lb_data17.setVisible(true);
                txt_data17.setVisible(true);
                lb_data18.setVisible(true);
                txt_data18.setVisible(true);
                lb_data19.setVisible(true);
                txt_data19.setVisible(true);
                lb_data20.setVisible(true);
                txt_data20.setVisible(true);
                lb_data21.setVisible(true);
                txt_data21.setVisible(true);
                lb_data22.setVisible(true);
                txt_data22.setVisible(true);
                lb_data23.setVisible(true);
                txt_data23.setVisible(true);
                lb_data24.setVisible(true);
                txt_data24.setVisible(true);
                lb_data25.setVisible(true);
                txt_data25.setVisible(true);
                lb_data26.setVisible(true);
                txt_data26.setVisible(true);
                lb_data27.setVisible(true);
                txt_data27.setVisible(true);
                lb_data28.setVisible(true);
                txt_data28.setVisible(true);
                lb_data29.setVisible(true);
                txt_data29.setVisible(true);
                lb_data30.setVisible(true);
                txt_data30.setVisible(true);
                lb_data31.setVisible(true);
                txt_data31.setVisible(true);
                lb_data32.setVisible(true);
                txt_data32.setVisible(true);
            }
           });



           // Add data to stack button
           btn_data.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e)
                {
                    int i;

                    // Protection to select a mode
                    if (cb_bcrt.isSelected() == false && cb_rtbc.isSelected() == false)
                    {
                    	JOptionPane.showMessageDialog(frame,
                        "You have to select a mode !",
                        "BC Data error",
                        JOptionPane.ERROR_MESSAGE);
                    }

                    // Protection to select a line
                    else if (cb_lineA.isSelected() == false && cb_lineB.isSelected() == false)
                    {
                    	JOptionPane.showMessageDialog(frame,
                        "You have to select a line !",
                        "BC Data error",
                        JOptionPane.ERROR_MESSAGE);
                    }

                    // Protection to write a blank data BC => RT
                    else if (txt_stack.getText().trim().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame,
                        "You have to add a stack value !",
                        "BC Data error",
                        JOptionPane.ERROR_MESSAGE);
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 1
                        && txt_data1.getText().trim().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame,
                        "You have to add a value for data 1 !",
                        "BC Data error",
                        JOptionPane.ERROR_MESSAGE);
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 2
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 3
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 4
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 5
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 6
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 7
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 8
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 9
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 10
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 11
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 12
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 13
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 14
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 15
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 16
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 17
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 18
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 19
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 20
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty() || txt_data20.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data20.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 20 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 21
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty() || txt_data20.getText().trim().isEmpty()
                            || txt_data21.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data20.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 20 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data21.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 21 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 22
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty() || txt_data20.getText().trim().isEmpty()
                            || txt_data21.getText().trim().isEmpty() || txt_data22.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data20.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 20 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data21.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 21 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data22.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 22 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 23
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty() || txt_data20.getText().trim().isEmpty()
                            || txt_data21.getText().trim().isEmpty() || txt_data22.getText().trim().isEmpty()
                            || txt_data23.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data20.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 20 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data21.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 21 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data22.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 22 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data23.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 23 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 24
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty() || txt_data20.getText().trim().isEmpty()
                            || txt_data21.getText().trim().isEmpty() || txt_data22.getText().trim().isEmpty()
                            || txt_data23.getText().trim().isEmpty() || txt_data24.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data20.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 20 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data21.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 21 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data22.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 22 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data23.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 23 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data24.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 24 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 25
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty() || txt_data20.getText().trim().isEmpty()
                            || txt_data21.getText().trim().isEmpty() || txt_data22.getText().trim().isEmpty()
                            || txt_data23.getText().trim().isEmpty() || txt_data24.getText().trim().isEmpty()
                            || txt_data25.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data20.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 20 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data21.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 21 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data22.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 22 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data23.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 23 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data24.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 24 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data25.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 25 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 26
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty() || txt_data20.getText().trim().isEmpty()
                            || txt_data21.getText().trim().isEmpty() || txt_data22.getText().trim().isEmpty()
                            || txt_data23.getText().trim().isEmpty() || txt_data24.getText().trim().isEmpty()
                            || txt_data25.getText().trim().isEmpty() || txt_data26.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data20.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 20 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data21.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 21 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data22.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 22 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data23.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 23 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data24.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 24 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data25.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 25 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data26.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 26 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 27
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty() || txt_data20.getText().trim().isEmpty()
                            || txt_data21.getText().trim().isEmpty() || txt_data22.getText().trim().isEmpty()
                            || txt_data23.getText().trim().isEmpty() || txt_data24.getText().trim().isEmpty()
                            || txt_data25.getText().trim().isEmpty() || txt_data26.getText().trim().isEmpty()
                            || txt_data27.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data20.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 20 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data21.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 21 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data22.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 22 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data23.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 23 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data24.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 24 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data25.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 25 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data26.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 26 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data27.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 27 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 28
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty() || txt_data20.getText().trim().isEmpty()
                            || txt_data21.getText().trim().isEmpty() || txt_data22.getText().trim().isEmpty()
                            || txt_data23.getText().trim().isEmpty() || txt_data24.getText().trim().isEmpty()
                            || txt_data25.getText().trim().isEmpty() || txt_data26.getText().trim().isEmpty()
                            || txt_data27.getText().trim().isEmpty() || txt_data28.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data20.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 20 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data21.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 21 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data22.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 22 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data23.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 23 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data24.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 24 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data25.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 25 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data26.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 26 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data27.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 27 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data28.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 28 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 29
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty() || txt_data20.getText().trim().isEmpty()
                            || txt_data21.getText().trim().isEmpty() || txt_data22.getText().trim().isEmpty()
                            || txt_data23.getText().trim().isEmpty() || txt_data24.getText().trim().isEmpty()
                            || txt_data25.getText().trim().isEmpty() || txt_data26.getText().trim().isEmpty()
                            || txt_data27.getText().trim().isEmpty() || txt_data28.getText().trim().isEmpty()
                            || txt_data29.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data20.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 20 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data21.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 21 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data22.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 22 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data23.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 23 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data24.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 24 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data25.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 25 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data26.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 26 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data27.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 27 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data28.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 28 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data29.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 29 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 30
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty() || txt_data20.getText().trim().isEmpty()
                            || txt_data21.getText().trim().isEmpty() || txt_data22.getText().trim().isEmpty()
                            || txt_data23.getText().trim().isEmpty() || txt_data24.getText().trim().isEmpty()
                            || txt_data25.getText().trim().isEmpty() || txt_data26.getText().trim().isEmpty()
                            || txt_data27.getText().trim().isEmpty() || txt_data28.getText().trim().isEmpty()
                            || txt_data29.getText().trim().isEmpty() || txt_data30.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data20.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 20 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data21.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 21 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data22.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 22 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data23.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 23 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data24.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 24 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data25.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 25 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data26.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 26 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data27.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 27 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data28.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 28 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data29.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 29 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data30.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 30 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 31
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty() || txt_data20.getText().trim().isEmpty()
                            || txt_data21.getText().trim().isEmpty() || txt_data22.getText().trim().isEmpty()
                            || txt_data23.getText().trim().isEmpty() || txt_data24.getText().trim().isEmpty()
                            || txt_data25.getText().trim().isEmpty() || txt_data26.getText().trim().isEmpty()
                            || txt_data27.getText().trim().isEmpty() || txt_data28.getText().trim().isEmpty()
                            || txt_data29.getText().trim().isEmpty() || txt_data30.getText().trim().isEmpty()
                            || txt_data31.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data20.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 20 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data21.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 21 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data22.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 22 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data23.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 23 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data24.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 24 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data25.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 25 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data26.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 26 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data27.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 27 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data28.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 28 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data29.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 29 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data30.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 30 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data31.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 31 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else if (cb_bcrt.isSelected() == true && Integer.decode(cbb_data.getValue()) == 32
                            && (txt_data1.getText().trim().isEmpty() || txt_data2.getText().trim().isEmpty()
                            || txt_data3.getText().trim().isEmpty()  || txt_data4.getText().trim().isEmpty()
                            || txt_data5.getText().trim().isEmpty()  || txt_data6.getText().trim().isEmpty()
                            || txt_data7.getText().trim().isEmpty()  || txt_data8.getText().trim().isEmpty()
                            || txt_data9.getText().trim().isEmpty()  || txt_data10.getText().trim().isEmpty()
                            || txt_data11.getText().trim().isEmpty() || txt_data12.getText().trim().isEmpty()
                            || txt_data13.getText().trim().isEmpty() || txt_data14.getText().trim().isEmpty()
                            || txt_data15.getText().trim().isEmpty() || txt_data16.getText().trim().isEmpty()
                            || txt_data17.getText().trim().isEmpty() || txt_data18.getText().trim().isEmpty()
                            || txt_data19.getText().trim().isEmpty() || txt_data20.getText().trim().isEmpty()
                            || txt_data21.getText().trim().isEmpty() || txt_data22.getText().trim().isEmpty()
                            || txt_data23.getText().trim().isEmpty() || txt_data24.getText().trim().isEmpty()
                            || txt_data25.getText().trim().isEmpty() || txt_data26.getText().trim().isEmpty()
                            || txt_data27.getText().trim().isEmpty() || txt_data28.getText().trim().isEmpty()
                            || txt_data29.getText().trim().isEmpty() || txt_data30.getText().trim().isEmpty()
                            || txt_data31.getText().trim().isEmpty() || txt_data32.getText().trim().isEmpty()))
                    {
                        if (txt_data1.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 1 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data2.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 2 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 3 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data4.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 4 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 5 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data6.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 6 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data7.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 7 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data8.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 8 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data9.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 9 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data10.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 10 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data11.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 11 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data12.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 12 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data13.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 13 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data14.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 14 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data15.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 15 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data16.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 16 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data17.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 17 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data18.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 18 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data19.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 19 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data20.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 20 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data21.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 21 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data22.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 22 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data23.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 23 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data24.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 24 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data25.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 25 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data26.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 26 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data27.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 27 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data28.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 28 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data29.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 29 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data30.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 30 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data31.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 31 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                        if (txt_data32.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(frame,
                            "You have to add a value for data 32 !",
                            "BC Data error",
                            JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    // Else Write BC => RT data
                    else
                    {
                        i = Integer.decode(txt_datanb.getText()) + 1;
                        sb.setLength(0);
                        new Formatter(sb).format("%04X",i);
                        hexa = sb.toString();
                        txt_datanb.setText("0x"+hexa);

                        int data_bc_sw, add_bc_sw;

                        // Write Stack Entry Address
                        // ethernet value + address
                        add_bc_sw = 100000 + init_addr_bc;
                        init_addr_bc = init_addr_bc + 4;
                        senddata = false;
                        out.println(add_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}

                        // ethernet value  + bc write order + Data stack
                        data_bc_sw =  200000 + Integer.decode(txt_stack.getText());
                        senddata = false;
                        out.println(data_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}

                        // Write BC Control Word
                        // ethernet value + address
                        add_bc_sw = 100000 + Integer.decode(txt_stack.getText());
                        senddata = false;
                        out.println(add_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}

                        // ethernet value  + bc write order + Control Word
                        if (cb_lineA.isSelected() == true)
                            data_bc_sw =  200000 + 0x0080;
                        else if (cb_lineB.isSelected() == true)
                            data_bc_sw =  200000;
                        senddata = false;
                        out.println(data_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}

                        // Write BC Command Word
                        // ethernet value + address
                        add_bc_sw = add_bc_sw + 1;
                        senddata = false;
                        out.println(add_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}

                        // ethernet value  + bc write order + Command Word
                        // RT address
                        data_bc_sw = 0;
                           String str = "";
                           String reverse = "";
                           str = Integer.toBinaryString(Integer.decode(cbb_rtaddr.getValue()));
                        for(int j= str.length() - 1; j >= 0; j--)
                        {
                            reverse = reverse + str.charAt(j);
                        }
                        for(int j=0; j < reverse.length(); j++)
                        {
                            if (reverse.charAt(j) == '1' )
                                data_bc_sw = (int) (data_bc_sw + (2048 * (Math.pow(2,(double)j))));
                        }

                        // Transmit / Receive
                        if (cb_bcrt.isSelected() == true)
                         {}
                        else if (cb_rtbc.isSelected() == true)
                        {
                            data_bc_sw = data_bc_sw + 1024;
                        }

                        // Sub-address or mode
                           str = "";
                           reverse = "";
                           str = Integer.toBinaryString(Integer.decode(cbb_rtsa.getValue()));
                        for(int j= str.length() - 1; j >= 0; j--)
                        {
                            reverse = reverse + str.charAt(j);
                        }
                        for(int j=0; j < reverse.length(); j++)
                        {
                            if (reverse.charAt(j) == '1' )
                                data_bc_sw = (int) (data_bc_sw + (32 * (Math.pow(2,(double)j))));
                        }

                        // DataWord Count or mode
                           str = "";
                           reverse = "";
                           if (Integer.decode(cbb_data.getValue()) == 32)
                           {
                               str = "0";
                           }
                           else
                           {
                               str = Integer.toBinaryString(Integer.decode(cbb_data.getValue()));
                           }
                        for(int j= str.length() - 1; j >= 0; j--)
                        {
                            reverse = reverse + str.charAt(j);
                        }
                        for(int j=0; j < reverse.length(); j++)
                        {
                            if (reverse.charAt(j) == '1' )
                                data_bc_sw = (int) (data_bc_sw + (Math.pow(2,(double)j)));
                        }
                        data_bc_sw =  200000 + data_bc_sw;
                        out.println(data_bc_sw);
                        out.flush();

                        //Message BC to RT
                        if (cb_bcrt.isSelected() == true)
                        {
                            // Write BC data 1
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  200000 + Integer.decode(txt_data1.getText());
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // Write BC data 2
                            if (Integer.decode(cbb_data.getValue()) > 1)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data2.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 3
                            if (Integer.decode(cbb_data.getValue()) > 2)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data3.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 4
                            if (Integer.decode(cbb_data.getValue()) > 3)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data4.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 5
                            if (Integer.decode(cbb_data.getValue()) > 4)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data5.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 6
                            if (Integer.decode(cbb_data.getValue()) > 5)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data6.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 7
                            if (Integer.decode(cbb_data.getValue()) > 6)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data7.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 8
                            if (Integer.decode(cbb_data.getValue()) > 7)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data8.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 9
                            if (Integer.decode(cbb_data.getValue()) > 8)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data9.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 10
                            if (Integer.decode(cbb_data.getValue()) > 9)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data10.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }


                            // Write BC data 11
                            if (Integer.decode(cbb_data.getValue()) > 10)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data11.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 12
                            if (Integer.decode(cbb_data.getValue()) > 11)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data12.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 13
                            if (Integer.decode(cbb_data.getValue()) > 12)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data13.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 14
                            if (Integer.decode(cbb_data.getValue()) > 13)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data14.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 15
                            if (Integer.decode(cbb_data.getValue()) > 14)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data15.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 16
                            if (Integer.decode(cbb_data.getValue()) > 15)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data16.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 17
                            if (Integer.decode(cbb_data.getValue()) > 16)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data17.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 18
                            if (Integer.decode(cbb_data.getValue()) > 17)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data18.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 19
                            if (Integer.decode(cbb_data.getValue()) > 18)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data19.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 20
                            if (Integer.decode(cbb_data.getValue()) > 19)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data20.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 21
                            if (Integer.decode(cbb_data.getValue()) > 20)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data21.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 22
                            if (Integer.decode(cbb_data.getValue()) > 21)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data
                                data_bc_sw =  200000 + Integer.decode(txt_data22.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 23
                            if (Integer.decode(cbb_data.getValue()) > 22)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data
                                data_bc_sw =  200000 + Integer.decode(txt_data23.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 24
                            if (Integer.decode(cbb_data.getValue()) > 23)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data
                                data_bc_sw =  200000 + Integer.decode(txt_data24.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 25
                            if (Integer.decode(cbb_data.getValue()) > 24)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data25.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 26
                            if (Integer.decode(cbb_data.getValue()) > 25)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data26.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 27
                            if (Integer.decode(cbb_data.getValue()) > 26)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data27.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 28
                            if (Integer.decode(cbb_data.getValue()) > 27)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data28.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 29
                            if (Integer.decode(cbb_data.getValue()) > 28)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data29.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 30
                            if (Integer.decode(cbb_data.getValue()) > 29)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data30.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 31
                            if (Integer.decode(cbb_data.getValue()) > 30)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data31.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }

                            // Write BC data 32
                            if (Integer.decode(cbb_data.getValue()) > 31)
                            {
                                // ethernet value + address
                                add_bc_sw = add_bc_sw + 1;
                                senddata = false;
                                out.println(add_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}

                                // ethernet value  + bc write order + Data stack
                                data_bc_sw =  200000 + Integer.decode(txt_data32.getText());
                                senddata = false;
                                out.println(data_bc_sw);
                                out.flush();
                                while(!senddata)
                                {System.out.println("");}
                            }
                        }

                        // Increment BC Stack value automatically
                        sb.setLength(0);
                        new Formatter(sb).format("%04X",Integer.decode(txt_stack.getText())+38);
                        hexa = sb.toString();
                        txt_stack.setText("0x"+hexa);
                    }
                }
            });

           // Reset stack button
           btn_rst.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                    txt_datanb.setText("0x0");
                    init_addr_bc = 3;
                    cb_bcrt.setSelected(true);
                    cb_lineA.setSelected(true);
                    senddata = true;
                    txt_stack.setText("0x0108");
                    cbb_rtaddr.setValue("0x18");
                    cbb_rtsa.setValue("0x1");
                    cbb_data.setValue("0x1");
                }
            });

           // BC Start Button
           btn_startbc.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {

                    if (Integer.decode(txt_datanb.getText()) != 0)
                    {
                        // Write BC Block Size
                        // ethernet value + address
                        senddata = false;
                        out.println(100000 + 257);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}

                        // ethernet value  + bc write order + BC block size
                        senddata = false;
                        out.println(200000 + Integer.decode(txt_datanb.getText()));
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}

                        // BC Start
                        out.println(400000);
                        out.flush();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame,
                        "You have to add data first !",
                        "BC Start error",
                        JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

           // Read BC button
           btn_rdbc.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e)
                {

                    if (txt_ctrlwdadd.getText().trim().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame,
                        "You have to add BC Control Word Address !",
                        "BC Read error",
                        JOptionPane.ERROR_MESSAGE);

                    }
                    else
                    {
                        int data_bc_sw, add_bc_sw, cmd_word;
                        gp_bc.setVisible(true);

                        // Read Control Word
                        // ethernet value + address
                        add_bc_sw = 100000 + Integer.decode(txt_ctrlwdadd.getText());
                        senddata = false;
                        out.println(add_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}

                        // ethernet value  + bc read order
                        data_bc_sw =  300000;
                        senddata = false;
                        out.println(data_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}
                        sb.setLength(0);
                        new Formatter(sb).format("%04X",read_data);
                        hexa = sb.toString();
                        txt_ctrlwd.setText("0x"+hexa);


                        // Read Command Word
                        // ethernet value + address
                        add_bc_sw = add_bc_sw + 1;
                        senddata = false;
                        out.println(add_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}

                        // ethernet value  + bc read order
                        data_bc_sw =  300000;
                        senddata = false;
                        out.println(data_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}
                        sb.setLength(0);
                        new Formatter(sb).format("%04X",read_data);
                        hexa = sb.toString();
                        txt_cmdwd.setText("0x"+hexa);
                        cmd_word = read_data;


                        // Create a 16 bits string with command word to get data number and TX/RX
                        int k = 15;
                        int datacnt = 0, transmission = 0;
                        String str = Integer.toBinaryString(cmd_word);
                        char t[] = new char[16];
                        for(int j=15; j >= 0; j--)
                        {
                                t[j] = '0';
                        }
                        for(int j=str.length()-1; j >= 0; j--)
                        {
                                t[k] = str.charAt(j);
                                k = k-1;
                        }
                        String str1 = new String(t);
                        datacnt = Integer.parseInt(str1.substring(11), 2);
                        transmission = Integer.parseInt(str1.substring(5,6), 2);
                        if (datacnt == 0)
                        {
                            datacnt = 32;
                        }

                        sb.setLength(0);
                        new Formatter(sb).format("%04X",datacnt);
                        hexa = sb.toString();
                        txt_datacnt.setText("0x"+hexa);
                        cbb_data.setValue("0x"+Integer.toHexString(datacnt));

                        // Read Status Word
                        // ethernet value + address
                        if (transmission == 0)
                        {
                            add_bc_sw = add_bc_sw + datacnt + 1;
                        }
                        else
                        {
                            add_bc_sw = add_bc_sw + 1;
                        }
                        senddata = false;
                        out.println(add_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}

                        // ethernet value  + bc read order
                        data_bc_sw =  300000;
                        senddata = false;
                        out.println(data_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}
                        sb.setLength(0);
                        new Formatter(sb).format("%04X",read_data);
                        hexa = sb.toString();
                        txt_status.setText("0x"+hexa);


                        // Read BC data 1
                        // ethernet value + address
                        if (transmission == 0)
                        {
                            add_bc_sw = Integer.decode(txt_ctrlwdadd.getText()) + 2 + 100000;
                        }
                        else
                        {
                            add_bc_sw = add_bc_sw + 1;
                        }
                        senddata = false;
                        out.println(add_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}

                        // ethernet value  + bc read order
                        data_bc_sw =  300000;
                        senddata = false;
                        out.println(data_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}
                        sb.setLength(0);
                        new Formatter(sb).format("%04X",read_data);
                        hexa = sb.toString();
                        txt_data1.setText("0x"+hexa);

                        // Read BC data 2
                        if (Integer.decode(cbb_data.getValue()) > 1)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data2.setText("0x"+hexa);
                        }

                        // Read BC data 3
                        if (Integer.decode(cbb_data.getValue()) > 2)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data3.setText("0x"+hexa);
                        }

                        // Read BC data 4
                        if (Integer.decode(cbb_data.getValue()) > 3)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data4.setText("0x"+hexa);
                        }

                        // Read BC data 5
                        if (Integer.decode(cbb_data.getValue()) > 4)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data5.setText("0x"+hexa);
                        }

                        // Read BC data 6
                        if (Integer.decode(cbb_data.getValue()) > 5)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data6.setText("0x"+hexa);
                        }

                        // Read BC data 7
                        if (Integer.decode(cbb_data.getValue()) > 6)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data7.setText("0x"+hexa);
                        }

                        // Read BC data 8
                        if (Integer.decode(cbb_data.getValue()) > 7)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data8.setText("0x"+hexa);
                        }

                        // Read BC data 9
                        if (Integer.decode(cbb_data.getValue()) > 8)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data9.setText("0x"+hexa);
                        }

                        // Read BC data 10
                        if (Integer.decode(cbb_data.getValue()) > 9)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data10.setText("0x"+hexa);
                        }

                        // Read BC data 11
                        if (Integer.decode(cbb_data.getValue()) > 10)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data11.setText("0x"+hexa);
                        }

                        // Read BC data 12
                        if (Integer.decode(cbb_data.getValue()) > 11)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data12.setText("0x"+hexa);
                        }

                        // Read BC data 13
                        if (Integer.decode(cbb_data.getValue()) > 12)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data13.setText("0x"+hexa);
                        }

                        // Read BC data 14
                        if (Integer.decode(cbb_data.getValue()) > 13)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data14.setText("0x"+hexa);
                        }

                        // Read BC data 15
                        if (Integer.decode(cbb_data.getValue()) > 14)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data15.setText("0x"+hexa);
                        }

                        // Read BC data 16
                        if (Integer.decode(cbb_data.getValue()) > 15)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data16.setText("0x"+hexa);
                        }

                        // Read BC data 17
                        if (Integer.decode(cbb_data.getValue()) > 16)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data17.setText("0x"+hexa);
                        }

                        // Read BC data 18
                        if (Integer.decode(cbb_data.getValue()) > 17)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data18.setText("0x"+hexa);
                        }

                        // Read BC data 19
                        if (Integer.decode(cbb_data.getValue()) > 18)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data19.setText("0x"+hexa);
                        }

                        // Read BC data 20
                        if (Integer.decode(cbb_data.getValue()) > 19)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data20.setText("0x"+hexa);
                        }

                        // Read BC data 21
                        if (Integer.decode(cbb_data.getValue()) > 20)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data21.setText("0x"+hexa);
                        }

                        // Read BC data 22
                        if (Integer.decode(cbb_data.getValue()) > 21)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data22.setText("0x"+hexa);
                        }

                        // Read BC data 23
                        if (Integer.decode(cbb_data.getValue()) > 22)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data23.setText("0x"+hexa);
                        }

                        // Read BC data 24
                        if (Integer.decode(cbb_data.getValue()) > 23)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data24.setText("0x"+hexa);
                        }

                        // Read BC data 25
                        if (Integer.decode(cbb_data.getValue()) > 24)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data25.setText("0x"+hexa);
                        }

                        // Read BC data 26
                        if (Integer.decode(cbb_data.getValue()) > 25)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data26.setText("0x"+hexa);
                        }

                        // Read BC data 27
                        if (Integer.decode(cbb_data.getValue()) > 26)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data27.setText("0x"+hexa);
                        }

                        // Read BC data 28
                        if (Integer.decode(cbb_data.getValue()) > 27)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data28.setText("0x"+hexa);
                        }

                        // Read BC data 29
                        if (Integer.decode(cbb_data.getValue()) > 28)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data29.setText("0x"+hexa);
                        }

                        // Read BC data 30
                        if (Integer.decode(cbb_data.getValue()) > 29)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data30.setText("0x"+hexa);
                        }

                        // Read BC data 31
                        if (Integer.decode(cbb_data.getValue()) > 30)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data31.setText("0x"+hexa);
                        }

                        // Read BC data 32
                        if (Integer.decode(cbb_data.getValue()) > 31)
                        {
                            // ethernet value + address
                            add_bc_sw = add_bc_sw + 1;
                            senddata = false;
                            out.println(add_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}

                            // ethernet value  + bc write order + Data stack
                            data_bc_sw =  300000;
                            senddata = false;
                            out.println(data_bc_sw);
                            out.flush();
                            while(!senddata)
                            {System.out.println("");}
                            sb.setLength(0);
                            new Formatter(sb).format("%04X",read_data);
                            hexa = sb.toString();
                            txt_data32.setText("0x"+hexa);
                        }
                    }
                }
            });


           // Read BC Manual Address button
           btn_add.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e)
                {
                    if (txt_add.getText().trim().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame,
                        "You have to add a Manual Address Value !",
                        "BC Read error",
                        JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        int data_bc_sw, add_bc_sw;

                        // BC Register Read
                        if (Integer.decode(txt_add.getText()) >= 262144)
                        {
                            // RT register value - RT Register address threshold + Register value to read
                            add_bc_sw = 700000 - 262144 + Integer.decode(txt_add.getText());
                        }
                        // BC DPRAM Read
                        else
                        {
                            add_bc_sw = 100000 + Integer.decode(txt_add.getText());
                        }
                        senddata = false;
                        out.println(add_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}

                        // ethernet value  + bc read order
                        data_bc_sw =  300000;
                        senddata = false;
                        out.println(data_bc_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}
                        sb.setLength(0);
                        new Formatter(sb).format("%04X",read_data);
                        hexa = sb.toString();
                        txt_value.setText("0x"+hexa);
                    }
                }
            });


           // RT Mode Selection
           cb_TX.selectedProperty().addListener(new ChangeListener<Boolean>() {
                public void changed(ObservableValue<? extends Boolean> ov,
                Boolean old_val, Boolean new_val)
                {
                    if (cb_TX.isSelected() == true)
                    {
                        cb_RX.setSelected(false);
                    }
             }
           });

           cb_RX.selectedProperty().addListener(new ChangeListener<Boolean>() {
                public void changed(ObservableValue<? extends Boolean> ov,
                Boolean old_val, Boolean new_val)
                {
                    if (cb_RX.isSelected() == true)
                    {
                        cb_TX.setSelected(false);
                    }
            }
           });

           // RT Read Button
           btn_rdrt.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {

                	int add_rt_sw = 0, cmd_word = 0;
                    String RT_str = "";
                    if (cb_TX.isSelected() == true)
                    {
                        add_rt_sw = 1632;
                        RT_str = "RT TX Data Sub-Address n°" + cbb_rtrdsa.getValue();
                    }
                    else if (cb_RX.isSelected() == true)
                    {
                        add_rt_sw = 608;
                        RT_str = "RT RX Data Sub-Address n°" + cbb_rtrdsa.getValue();
                    }

                	if (cb_TX.isSelected() == false && cb_RX.isSelected() == false)
                	{
                		JOptionPane.showMessageDialog(frame,
                        "You have to select a mode !",
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 1 && led_tx1.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 2 && led_tx2.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 3 && led_tx3.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 4 && led_tx4.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 5 && led_tx5.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 6 && led_tx6.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 7 && led_tx7.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 8 && led_tx8.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 9 && led_tx9.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 10 && led_tx10.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 11 && led_tx11.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 12 && led_tx12.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 13 && led_tx13.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 14 && led_tx14.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 15 && led_tx15.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 16 && led_tx16.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 17 && led_tx17.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 18 && led_tx18.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 19 && led_tx19.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 20 && led_tx20.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 21 && led_tx21.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 22 && led_tx22.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 23 && led_tx23.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 24 && led_tx24.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 25 && led_tx25.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 26 && led_tx26.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 27 && led_tx27.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 28 && led_tx28.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 29 && led_tx29.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_TX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 30 && led_tx30.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 1 && led_rx1.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 2 && led_rx2.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 3 && led_rx3.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 4 && led_rx4.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 5 && led_rx5.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 6 && led_rx6.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 7 && led_rx7.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 8 && led_rx8.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 9 && led_rx9.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 10 && led_rx10.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 11 && led_rx11.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 12 && led_rx12.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 13 && led_rx13.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 14 && led_rx14.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 15 && led_rx15.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 16 && led_rx16.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 17 && led_rx17.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 18 && led_rx18.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 19 && led_rx19.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 20 && led_rx20.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 21 && led_rx21.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 22 && led_rx22.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 23 && led_rx23.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 24 && led_rx24.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 25 && led_rx25.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 26 && led_rx26.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 27 && led_rx27.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 28 && led_rx28.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 29 && led_rx29.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else if (cb_RX.isSelected() == true && Integer.decode(cbb_rtrdsa.getValue()) == 30 && led_rx30.isOn() == false)
                	{
                        JOptionPane.showMessageDialog(frame,
                        "No data received in " + RT_str,
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                	}
                	else
                	{
	                    add_rt_sw = add_rt_sw + (Integer.decode(cbb_rtrdsa.getValue())*32) + 500000;
	                    senddata = false;
	                    out.println(add_rt_sw);
	                    out.flush();
	                    while(!senddata)
	                    {System.out.println("");}
	                    cmd_word = read_data;

	                    if (cmd_word == add_rt_sw - 500000)
	                    {
	                        JOptionPane.showMessageDialog(frame,
	                        "No data received in " + RT_str,
	                        "RT Read error",
	                        JOptionPane.ERROR_MESSAGE);
	                    }
	                    else
	                    {
	                        gp_bc.setVisible(true);
	                        tp_RTdata.setVisible(true);
	                        tp_RTdata.setText(RT_str);

	                        // Create a 16 bits string with command word to get data number
	                        int k = 15;
	                        int datacnt = 0;
	                        String str = Integer.toBinaryString(cmd_word);
	                        char t[] = new char[16];
	                        for(int j=15; j >= 0; j--)
	                        {
	                                t[j] = '0';
	                        }
	                        for(int j=str.length()-1; j >= 0; j--)
	                        {
	                                t[k] = str.charAt(j);
	                                k = k-1;
	                        }
	                        String str1 = new String(t);
	                        datacnt = Integer.parseInt(str1.substring(11), 2);
	                        if (datacnt == 0)
	                        {
	                            datacnt = 32;
	                        }

	                        // Read RT data 1
	                        // ethernet value + address
	                        add_rt_sw = add_rt_sw - 500000 + 100000;
	                        senddata = false;
	                        out.println(add_rt_sw);
	                        out.flush();
	                        while(!senddata)
	                        {System.out.println("");}

	                        // ethernet value  + RT read order
	                        senddata = false;
	                        out.println(600000);
	                        out.flush();
	                        while(!senddata)
	                        {System.out.println("");}
	                        sb.setLength(0);
	                        new Formatter(sb).format("%04X",read_data);
	                        hexa = sb.toString();
	                        txt_dataRT1.setText("0x"+hexa);

	                        // Read RT data 2
	                        if (datacnt > 1)
	                        {
	                            lb_dataRT2.setVisible(true);
	                            txt_dataRT2.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT2.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT2.setVisible(false);
	                            txt_dataRT2.setVisible(false);
	                        }

	                        // Read RT data 3
	                        if (datacnt > 2)
	                        {
	                            lb_dataRT3.setVisible(true);
	                            txt_dataRT3.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT3.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT3.setVisible(false);
	                            txt_dataRT3.setVisible(false);
	                        }

	                        // Read RT data 4
	                        if (datacnt > 3)
	                        {
	                            lb_dataRT4.setVisible(true);
	                            txt_dataRT4.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT4.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT4.setVisible(false);
	                            txt_dataRT4.setVisible(false);
	                        }

	                        // Read RT data 5
	                        if (datacnt > 4)
	                        {
	                            lb_dataRT5.setVisible(true);
	                            txt_dataRT5.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT5.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT5.setVisible(false);
	                            txt_dataRT5.setVisible(false);
	                        }

	                        // Read RT data 6
	                        if (datacnt > 5)
	                        {
	                            lb_dataRT6.setVisible(true);
	                            txt_dataRT6.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT6.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT6.setVisible(false);
	                            txt_dataRT6.setVisible(false);
	                        }

	                        // Read RT data 7
	                        if (datacnt > 6)
	                        {
	                            lb_dataRT7.setVisible(true);
	                            txt_dataRT7.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT7.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT7.setVisible(false);
	                            txt_dataRT7.setVisible(false);
	                        }

	                        // Read RT data 8
	                        if (datacnt > 7)
	                        {
	                            lb_dataRT8.setVisible(true);
	                            txt_dataRT8.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT8.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT8.setVisible(false);
	                            txt_dataRT8.setVisible(false);
	                        }

	                        // Read RT data 9
	                        if (datacnt > 8)
	                        {
	                            lb_dataRT9.setVisible(true);
	                            txt_dataRT9.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT9.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT9.setVisible(false);
	                            txt_dataRT9.setVisible(false);
	                        }

	                        // Read RT data 10
	                        if (datacnt > 9)
	                        {
	                            lb_dataRT10.setVisible(true);
	                            txt_dataRT10.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT10.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT10.setVisible(false);
	                            txt_dataRT10.setVisible(false);
	                        }

	                        // Read RT data 11
	                        if (datacnt > 10)
	                        {
	                            lb_dataRT11.setVisible(true);
	                            txt_dataRT11.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT11.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT11.setVisible(false);
	                            txt_dataRT11.setVisible(false);
	                        }

	                        // Read RT data 12
	                        if (datacnt > 11)
	                        {
	                            lb_dataRT12.setVisible(true);
	                            txt_dataRT12.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT12.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT12.setVisible(false);
	                            txt_dataRT12.setVisible(false);
	                        }

	                        // Read RT data 13
	                        if (datacnt > 12)
	                        {
	                            lb_dataRT13.setVisible(true);
	                            txt_dataRT13.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT13.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT13.setVisible(false);
	                            txt_dataRT13.setVisible(false);
	                        }

	                        // Read RT data 14
	                        if (datacnt > 13)
	                        {
	                            lb_dataRT14.setVisible(true);
	                            txt_dataRT14.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT14.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT14.setVisible(false);
	                            txt_dataRT14.setVisible(false);
	                        }

	                        // Read RT data 15
	                        if (datacnt > 14)
	                        {
	                            lb_dataRT15.setVisible(true);
	                            txt_dataRT15.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT15.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT15.setVisible(false);
	                            txt_dataRT15.setVisible(false);
	                        }

	                        // Read RT data 16
	                        if (datacnt > 15)
	                        {
	                            lb_dataRT16.setVisible(true);
	                            txt_dataRT16.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT16.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT16.setVisible(false);
	                            txt_dataRT16.setVisible(false);
	                        }

	                        // Read RT data 17
	                        if (datacnt > 16)
	                        {
	                            lb_dataRT17.setVisible(true);
	                            txt_dataRT17.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT17.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT17.setVisible(false);
	                            txt_dataRT17.setVisible(false);
	                        }

	                        // Read RT data 18
	                        if (datacnt > 17)
	                        {
	                            lb_dataRT18.setVisible(true);
	                            txt_dataRT18.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT18.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT18.setVisible(false);
	                            txt_dataRT18.setVisible(false);
	                        }

	                        // Read RT data 19
	                        if (datacnt > 18)
	                        {
	                            lb_dataRT19.setVisible(true);
	                            txt_dataRT19.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT19.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT19.setVisible(false);
	                            txt_dataRT19.setVisible(false);
	                        }

	                        // Read RT data 20
	                        if (datacnt > 19)
	                        {
	                            lb_dataRT20.setVisible(true);
	                            txt_dataRT20.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT20.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT20.setVisible(false);
	                            txt_dataRT20.setVisible(false);
	                        }

	                        // Read RT data 21
	                        if (datacnt > 20)
	                        {
	                            lb_dataRT21.setVisible(true);
	                            txt_dataRT21.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT21.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT21.setVisible(false);
	                            txt_dataRT21.setVisible(false);
	                        }

	                        // Read RT data 22
	                        if (datacnt > 21)
	                        {
	                            lb_dataRT22.setVisible(true);
	                            txt_dataRT22.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT22.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT22.setVisible(false);
	                            txt_dataRT22.setVisible(false);
	                        }


	                        // Read RT data 23
	                        if (datacnt > 22)
	                        {
	                            lb_dataRT23.setVisible(true);
	                            txt_dataRT23.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT23.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT23.setVisible(false);
	                            txt_dataRT23.setVisible(false);
	                        }

	                        // Read RT data 24
	                        if (datacnt > 23)
	                        {
	                            lb_dataRT24.setVisible(true);
	                            txt_dataRT24.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT24.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT24.setVisible(false);
	                            txt_dataRT24.setVisible(false);
	                        }

	                        // Read RT data 25
	                        if (datacnt > 24)
	                        {
	                            lb_dataRT25.setVisible(true);
	                            txt_dataRT25.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT25.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT25.setVisible(false);
	                            txt_dataRT25.setVisible(false);
	                        }

	                        // Read RT data 26
	                        if (datacnt > 25)
	                        {
	                            lb_dataRT26.setVisible(true);
	                            txt_dataRT26.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT26.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT26.setVisible(false);
	                            txt_dataRT26.setVisible(false);
	                        }

	                        // Read RT data 27
	                        if (datacnt > 26)
	                        {
	                            lb_dataRT27.setVisible(true);
	                            txt_dataRT27.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT27.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT27.setVisible(false);
	                            txt_dataRT27.setVisible(false);
	                        }

	                        // Read RT data 28
	                        if (datacnt > 27)
	                        {
	                            lb_dataRT28.setVisible(true);
	                            txt_dataRT28.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT28.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT28.setVisible(false);
	                            txt_dataRT28.setVisible(false);
	                        }
	                        // Read RT data 29
	                        if (datacnt > 28)
	                        {
	                            lb_dataRT29.setVisible(true);
	                            txt_dataRT29.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT29.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT29.setVisible(false);
	                            txt_dataRT29.setVisible(false);
	                        }

	                        // Read RT data 30
	                        if (datacnt > 29)
	                        {
	                            lb_dataRT30.setVisible(true);
	                            txt_dataRT30.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT30.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT30.setVisible(false);
	                            txt_dataRT30.setVisible(false);
	                        }

	                        // Read RT data 31
	                        if (datacnt > 30)
	                        {
	                            lb_dataRT31.setVisible(true);
	                            txt_dataRT31.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT31.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT31.setVisible(false);
	                            txt_dataRT31.setVisible(false);
	                        }

	                        // Read RT data 32
	                        if (datacnt > 31)
	                        {
	                            lb_dataRT32.setVisible(true);
	                            txt_dataRT32.setVisible(true);

	                            // ethernet value + address
	                            add_rt_sw = add_rt_sw + 1;
	                            senddata = false;
	                            out.println(add_rt_sw);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}

	                            // ethernet value  + RT read order
	                            senddata = false;
	                            out.println(600000);
	                            out.flush();
	                            while(!senddata)
	                            {System.out.println("");}
		                        sb.setLength(0);
		                        new Formatter(sb).format("%04X",read_data);
		                        hexa = sb.toString();
		                        txt_dataRT32.setText("0x"+hexa);
	                        }
	                        else
	                        {
	                            lb_dataRT32.setVisible(false);
	                            txt_dataRT32.setVisible(false);
	                        }
	                    }
                    }
                }
            });

           // Read RT Manual Address button
           btn_RTadd.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e)
                {
                    if (txt_RTadd.getText().trim().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame,
                        "You have to add a Manual Address Value !",
                        "RT Read error",
                        JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        int data_rt_sw, add_rt_sw;

                        // RT Register Read
                        if (Integer.decode(txt_RTadd.getText()) >= 262144)
                        {
                            // RT register value - RT Register address threshold + Register value to read
                            add_rt_sw = 700000 - 262144 + Integer.decode(txt_RTadd.getText());
                        }
                        // RT DPRAM Read
                        else
                        {
                            add_rt_sw = 100000 + Integer.decode(txt_RTadd.getText());
                        }
                        senddata = false;
                        out.println(add_rt_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}

                        // RT Read Order
                        data_rt_sw =  600000;
                        senddata = false;
                        out.println(data_rt_sw);
                        out.flush();
                        while(!senddata)
                        {System.out.println("");}
                        sb.setLength(0);
                        new Formatter(sb).format("%04X",read_data);
                        hexa = sb.toString();
                        txt_RTvalue.setText("0x"+hexa);
                    }
                }
            });

           // RT Complete Read button
           btn_RTrdcpt.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e)
                {
                    tp_RTdata.setVisible(false);
                }
            });

           // RT Reset button
           btn_RTrst.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e)
                {
                    // Clear Leds Status
                    led_tx1.setOn(false);
                    led_tx2.setOn(false);
                    led_tx3.setOn(false);
                    led_tx4.setOn(false);
                    led_tx5.setOn(false);
                    led_tx6.setOn(false);
                    led_tx7.setOn(false);
                    led_tx8.setOn(false);
                    led_tx9.setOn(false);
                    led_tx10.setOn(false);
                    led_tx11.setOn(false);
                    led_tx12.setOn(false);
                    led_tx13.setOn(false);
                    led_tx14.setOn(false);
                    led_tx15.setOn(false);
                    led_tx16.setOn(false);
                    led_tx17.setOn(false);
                    led_tx18.setOn(false);
                    led_tx19.setOn(false);
                    led_tx20.setOn(false);
                    led_tx21.setOn(false);
                    led_tx22.setOn(false);
                    led_tx23.setOn(false);
                    led_tx24.setOn(false);
                    led_tx25.setOn(false);
                    led_tx26.setOn(false);
                    led_tx27.setOn(false);
                    led_tx28.setOn(false);
                    led_tx29.setOn(false);
                    led_tx30.setOn(false);
                    led_rx1.setOn(false);
                    led_rx2.setOn(false);
                    led_rx3.setOn(false);
                    led_rx4.setOn(false);
                    led_rx5.setOn(false);
                    led_rx6.setOn(false);
                    led_rx7.setOn(false);
                    led_rx8.setOn(false);
                    led_rx9.setOn(false);
                    led_rx10.setOn(false);
                    led_rx11.setOn(false);
                    led_rx12.setOn(false);
                    led_rx13.setOn(false);
                    led_rx14.setOn(false);
                    led_rx15.setOn(false);
                    led_rx16.setOn(false);
                    led_rx17.setOn(false);
                    led_rx18.setOn(false);
                    led_rx19.setOn(false);
                    led_rx20.setOn(false);
                    led_rx21.setOn(false);
                    led_rx22.setOn(false);
                    led_rx23.setOn(false);
                    led_rx24.setOn(false);
                    led_rx25.setOn(false);
                    led_rx26.setOn(false);
                    led_rx27.setOn(false);
                    led_rx28.setOn(false);
                    led_rx29.setOn(false);
                    led_rx30.setOn(false);

                    int data_rt_sw, add_rt_sw;

                    // Reset RT Core
                    // RT register value - RT Register address threshold + RT Start Reset Register
                    add_rt_sw = 700000 - 262144 + 262147;
                    senddata = false;
                    out.println(add_rt_sw);
                    out.flush();
                    while(!senddata)
                    {System.out.println("");}

                    // RT Write Order
                    data_rt_sw =  800001;
                    senddata = false;
                    out.println(data_rt_sw);
                    out.flush();
                    while(!senddata)
                    {System.out.println("");}

                    // Clear Reset RT Core
                    // RT register value - RT Register address threshold + RT Start Reset Register
                    add_rt_sw = 700000 - 262144 + 262147;
                    senddata = false;
                    out.println(add_rt_sw);
                    out.flush();
                    while(!senddata)
                    {System.out.println("");}

                    // RT Write Order
                    data_rt_sw =  800000;
                    senddata = false;
                    out.println(data_rt_sw);
                    out.flush();
                    while(!senddata)
                    {System.out.println("");}

                    // Enable RT Interrupt
                    // RT register value - RT Register address threshold + RT Start Reset Register
                    add_rt_sw = 700000 - 262144 + 262144;
                    senddata = false;
                    out.println(add_rt_sw);
                    out.flush();
                    while(!senddata)
                    {System.out.println("");}

                    // RT Write Order
                    data_rt_sw =  800014;
                    senddata = false;
                    out.println(data_rt_sw);
                    out.flush();
                    while(!senddata)
                    {System.out.println("");}

                }
            });

           try
           {
              /*
              * les informations du serveur (port et adresse IP ou nom d'hote
              * 127.0.0.1 est l'adresse local de la machine
              */
              clientSocket = new Socket("192.168.1.10",2701);
              //flux pour envoyer
              out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())),true);

              //flux pour recevoir
              BufferedInputStream bis = new BufferedInputStream(clientSocket.getInputStream());

                 // Date variables
              Thread recevoir = new Thread(new Runnable() {
                 int msg = 0;
                 int RT_CW;
                 String content = "";

                 @Override
                 public void run() {
                    try {

                      while((msg = bis.read()) != -1)
                      {
                            content += (char)msg;

                            // RT Activity
                            if (Integer.parseInt(content) >= 200000)
                            {
                                 RT_CW = Integer.parseInt(content) - 200000;
                                 content = "";
                                 msg = 0;
                                 // Create a 16 bits string with command word to get data number and TX/RX
                                  int k = 15;
                                  int SA = 0, transmission = 0;
                                  String str = Integer.toBinaryString(RT_CW);
                                  char t[] = new char[16];
                                  for(int j=15; j >= 0; j--)
                                  {
                                          t[j] = '0';
                                  }
                                  for(int j=str.length()-1; j >= 0; j--)
                                  {
                                          t[k] = str.charAt(j);
                                         k = k-1;
                                  }
                                 String str1 = new String(t);
                                 SA = Integer.parseInt(str1.substring(6,11), 2);
                                transmission = Integer.parseInt(str1.substring(5,6), 2);
                                if (SA == 1)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx1.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx1.setOn(true);
                                    }
                                }
                                else if (SA == 2)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx2.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx2.setOn(true);
                                    }
                                }
                                else if (SA == 3)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx3.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx3.setOn(true);
                                    }
                                }
                                else if (SA == 4)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx4.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx4.setOn(true);
                                    }
                                }
                                else if (SA == 5)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx5.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx5.setOn(true);
                                    }
                                }
                                else if (SA == 6)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx6.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx6.setOn(true);
                                    }
                                }
                                else if (SA == 7)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx7.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx7.setOn(true);
                                    }
                                }
                                else if (SA == 8)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx8.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx8.setOn(true);
                                    }
                                }
                                else if (SA == 9)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx9.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx9.setOn(true);
                                    }
                                }
                                else if (SA == 10)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx10.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx10.setOn(true);
                                    }
                                }
                                else if (SA == 11)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx11.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx11.setOn(true);
                                    }
                                }
                                else if (SA == 12)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx12.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx12.setOn(true);
                                    }
                                }
                                else if (SA == 13)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx13.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx13.setOn(true);
                                    }
                                }
                                else if (SA == 14)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx14.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx14.setOn(true);
                                    }
                                }
                                else if (SA == 15)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx15.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx15.setOn(true);
                                    }
                                }
                                else if (SA == 16)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx16.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx16.setOn(true);
                                    }
                                }
                                else if (SA == 17)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx17.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx17.setOn(true);
                                    }
                                }
                                else if (SA == 18)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx18.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx18.setOn(true);
                                    }
                                }
                                else if (SA == 19)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx19.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx19.setOn(true);
                                    }
                                }
                                else if (SA == 20)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx20.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx20.setOn(true);
                                    }
                                }
                                else if (SA == 21)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx21.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx21.setOn(true);
                                    }
                                }
                                else if (SA == 22)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx22.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx22.setOn(true);
                                    }
                                }
                                else if (SA == 23)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx23.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx23.setOn(true);
                                    }
                                }
                                else if (SA == 24)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx24.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx24.setOn(true);
                                    }
                                }
                                else if (SA == 25)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx25.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx25.setOn(true);
                                    }
                                }
                                else if (SA == 26)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx26.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx26.setOn(true);
                                    }
                                }
                                else if (SA == 27)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx27.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx27.setOn(true);
                                    }
                                }
                                else if (SA == 28)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx28.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx28.setOn(true);
                                    }
                                }
                                else if (SA == 29)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx29.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx29.setOn(true);
                                    }
                                }
                                else if (SA == 30)
                                {
                                    if (transmission == 1)
                                    {
                                        led_tx30.setOn(true);
                                    }
                                    else
                                    {
                                        led_rx30.setOn(true);
                                    }
                                }
                            }
                            //Read Data
                            else if (Integer.parseInt(content) >= 100000)
                            {
                                 read_data = Integer.parseInt(content) - 100000;
                                 System.out.println(read_data);
                                 content = "";
                                 msg = 0;
                            }
                            //Read / Write ack
                            else if (Integer.parseInt(content) == 112)
                            {
                                 content = "";
                                 msg = 0;
                                 senddata = true;
                            }
                      }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                 }
             });

             recevoir.start();


           }
           catch (IOException e)
           {
                e.printStackTrace();
           }


       }

    // Cette fonction permet de rentrer une valeur pour le Gauge de Humidity par le Serveur
       @FXML
        private void handleButtonAction(MouseEvent event)
        {

           if(event.getTarget() == btn_bcconfig)
           {
               pane_bcconf.setVisible(false);
               pane_rtread.setVisible(false);
               gp_bc.setVisible(false);
           }
           else if (event.getTarget() == btn_bcread)
           {
               pane_bcconf.setVisible(true);
               pane_rtread.setVisible(false);
               if (cb_bcrt.isSelected() == true)
               {
                   gp_bc.setVisible(true);
               }
               else
               {
            	   gp_bc.setVisible(false);
               }
           }
           else if (event.getTarget() == btn_rtread)
           {
               pane_bcconf.setVisible(false);
               pane_rtread.setVisible(true);
           }
        }
}
