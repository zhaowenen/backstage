后台框架，有5个子项目，api是外部或内部访问的入口，是消费者；sdk是接口抽离；service是业务实现，是生产者；common存放一些公共的资源；启动先起service,把生产者，再起消费者。每个模块都是单独的dubbo服务。