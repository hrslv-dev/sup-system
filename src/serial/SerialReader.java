package serial;

import model.SensorData;
import com.fazecast.jSerialComm.SerialPort;
import java.util.List;
// Is needed to atribute the port for the class to connect with Arduino
public class SerialReader {
    private SerialPort serialPort;

    public void connect(){
        // This static call returns an array with all the ports in the operational system.
        SerialPort[] ports = SerialPort.getCommPorts();
    }

}


