##一、打开工程
打开工程，要使用File-》Open Projects，直接打开对应的工程文件夹就行了，不需要选择其中的文件。
##二、格式化代码
Code-》Reformat Code（Ctrl+Alt+L）
##三、添加单元测试
###1、安装JUnit插件
File-》Settings-》Plugins，搜索安装junit
要同时安装Juint的Generator，不然无法自动生成测试类。
###2、向工程中添加测试目录
右键项目工程，F4（Open Modul Settings）
![Open Module Settings界面](/home/wang/图片/2017-08-11 13-22-58屏幕截图.png) 
在Source选项卡中添加目录，并设置为Tests
###3、添加测试类
Linux中，在需要测试的类中使用快捷键Ctrl+Alt同时点击出现的智能提示（灯泡状），选择其中的Create Tests，弹出的对话框中选Junit4，生成单元测试类。
Windows中，在需要测试的类中使用快捷键Ctrl+Shift+T，后续步骤和Linux中相同。