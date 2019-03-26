package spring.cloud.eureka.server.main;

import com.netflix.appinfo.InstanceInfo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MarkerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaRegistryAvailableEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaServerStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Administrator
 * Date 2018/12/24 0024 下午 8:07
 */
@Component
@Slf4j
public class EurakeListener implements ApplicationListener {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        //服务断线事件
        String appName = event.getAppName();
        String serverId = event.getServerId();
        System.out.println("断线服务名称:"+appName+",服务ID:"+serverId);
        log.info(MarkerFactory.getMarker("DOWN"), "服务ID：" + event.getServerId() + "\t" +
                "服务实例：" + appName + "\t服务下线");
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        System.out.println("实例："+instanceInfo.getAppName()+"注册进来");
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        String appName = event.getAppName();
        String serverId = event.getServerId();
        System.out.println("心跳检测服务名字："+appName);
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {

    }

    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        //Server启动
        long timestamp = event.getTimestamp();
        Date date = new Date(timestamp);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sd.format(date);
        System.out.println("实例启动时间花费："+format+"秒");
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

    }
}

