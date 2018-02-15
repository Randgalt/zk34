package temp;

import org.apache.curator.framework.*;
import org.apache.curator.retry.*;

public class Temp {
    public static void main(String[] args) {
        System.out.println("hi");
        
        CuratorFramework client = CuratorFrameworkFactory.newClient("foo", new RetryOneTime(1));
    }
}