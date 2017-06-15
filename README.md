# Mvp
自己基于MVPArms 写的mvp架子，拿来就能用，不用每一个项目封装一次。(开发中...)


### M（Model）
- 数据层，和MVC中的M一样，用来放数据的处理（比如网络请求，缓存等）。

### api 
- 存放网络访问的接口



### V(View)
- 负责UI具体实现展现。比如Presenter派发过来一个动作是showDialog显示进度命令，那么我们这个View就负责实现具体UI。


### P(Presenter)
- 负责处理业务逻辑代码，处理Model数据，然后将处理完的数据分发到View层。


