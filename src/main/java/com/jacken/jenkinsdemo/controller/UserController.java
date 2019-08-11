package com.jacken.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class UserController {
    @RequestMapping("/user")
    public  String getUserName(){
        return "【重要知识点：工作中必备】\n" +
                "#!/bin/bash\n" +
                "#服务名称\n" +
                "SERVER_NAME=jenkins-demo\n" +
                "#原jar路径，mvn打包完成之后，target目录下的jar包名称，也可以选择成为war包\n" +
                "JAR_NAME=jenkins-demo-0.0.1-SNAPSHOT\n" +
                "#target打包生成jar包的目录\n" +
                "JAR_PATH=/var/lib/jenkins/workspace/jenkins-demo/target\n" +
                "#打包完成之后，把jar包移动到运行jar包的目录\n" +
                "JAR_WORK_PATH=/var/lib/jenkins/workspace/jenkins-demo/target\n" +
                "\n" +
                "echo \"查询进程ID-->$SERVER_NAME\"\n" +
                "PID='ps -ef | grep \"$SERVER_NAME\" | awk ' {print $2}''\n" +
                "echo \"得到进程ID: $PID\"\n" +
                "echo \"进程结束\"\n" +
                "for id in $PID\n" +
                "do\n" +
                "       kill -9 $id\n" +
                "       echo \"killed $id\"\n" +
                "done\n" +
                "echo \"结束进程完成\"\n" +
                "\n" +
                "#复制jar包到执行目录\n" +
                "echo \"复制jar包到执行目录: cp $JAR_PATH/$JAR_NAME.jar  $JAR_WORK_PATH\"\n" +
                "echo \"复制jar包完成\"\n" +
                "cd $JAR_WORK_PATH\n" +
                "#修改文件权限\n" +
                "chmod 755 $JAR_NAME.jar\n" +
                "java -jar $JAR_NAME.jar";
    }

}
