# DanMuLayout
简单弹幕控件


v1.0<br>
该弹幕控件有两种弹幕形态 <br>

1.纯text弹幕.<br>

2.任意view弹幕.<br>


使用说明:<br>
添加点赞弹幕<br>
dml.addDanMuLike("哈哈,这是一个like弹幕,但其实就是view弹幕");<br>
添加纯text弹幕<br>
dml.addDanMuText("呵呵,这是一个纯text弹幕");<br>

添加view弹幕<br>
TextView textView = new TextView(MainActivity.this);<br>
textView.setText("啊啊,这是一个view弹幕");<br>
dml.addDanMuView(textView);<br>

开始弹幕<br>
dml.startDanMu();<br>

其它 详见demo
