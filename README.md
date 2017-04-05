# SpanTextView
  自定义SpanTextView
  
  

## 一.首先在项目的gradle中引用：

       allprojects {
   		repositories {
   			...
   			maven { url 'https://jitpack.io' }
   		}
   	}


## 二.其次在dependencies中添加：
<pre><code>
dependencies {
     compile 'com.github.alijiahua:SpanTextView:V1.0'
}
</code></pre>



## 三.xml文件中引用

       <com.limot.spantextviewlibrary.SpanTextView
             android:id="@+id/id_span_text_view"
             android:layout_width="match_parent"
             android:layout_height="100dp"
             app:color01="@color/colorAccent"
             app:color02="@color/colorPrimary"
             app:size01="30"
             app:size02="10"
             app:text01="第一组字体"
             app:text02="第二组字体"
             />




*text01：第一组字体*

*text02：第二组字体*

*color01：第一组字体颜色*

*color02：第二组字体颜色*

*size01：第一组字体大小*

*size02：第二组字体大小*


## 四.Java中设置：

     SpanTextView spanTextView= (SpanTextView) findViewById(R.id.id_span_text_view);
        spanTextView.setText01("第一组字体");
        spanTextView.setText02("第二组字体");
        spanTextView.setSize01(30);
        spanTextView.setSize02(10);
        spanTextView.setColor01(Color.RED);
        spanTextView.setColor02(Color.BLUE);


## 五.参考效果图：

![](https://github.com/alijiahua/SpanTextView/blob/master/imgsave/Screenshot_20170405-145835.png)


## 六.CSDN博客地址：http://blog.csdn.net/alijiahua

