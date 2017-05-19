package test_aop;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;

/**
 * Created by fupeng on 2017/5/11.
 * <p>
 * author:zhengjianbing
 * CreateDate:2008-11-27
 * Purpose:
 */
/**
 * author:zhengjianbing
 * CreateDate:2008-11-27
 * Purpose:
 */
/**
 * @author zhengjianbing
 * 获取本机IP，非127.0.0.1
 */
public class ttt {
    public static void main(String[] args) {

        Collection<InetAddress> colInetAddress =getAllHostAddress();

        for (InetAddress address : colInetAddress) {
            if (!address.isLoopbackAddress())
                System.out.println("IP:"+address.getHostAddress());

        }
    }

    public static Collection<InetAddress> getAllHostAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Collection<InetAddress> addresses = new ArrayList<InetAddress>();

            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddress = inetAddresses.nextElement();
                    addresses.add(inetAddress);
                }
            }

            return addresses;
        } catch (SocketException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }


}