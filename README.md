## 数字彩虹雨

### 1.打包
- gradle jar
- gradle version: 4.8.1

### 2.启动
```
进入路径:../dist/
执行如下命令

windows环境输入命令：(如果window环境运行异常，请使用工具类方法：org.bcos.fiscocc.onbc.util.FileHash)
java -cp 'conf/;app/*;scripts/*;' file
例子：java -cp 'conf/;app/*;scripts/*;' org.game.binaryrain.BinaryRainServer

linux环境输入命令：
java -cp 'conf/:app/*:scripts/*' file
例子：java -cp 'conf/:app/*:scripts/*' org.game.binaryrain.BinaryRainServer
```
### 3. 退出
启动后，如果结束进程，请按ESC键