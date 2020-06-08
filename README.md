# devops平台微服务项目模板

通过此模板可以快速基于devops平台来创建符合平台约定的java spring boot微服务工程。

## 模板工程目录结构

```
.
+-- project
    +-- api                      # 工程对外接口、输入和输出定义
    |   +-- src/main/java        
    |   +-- pom.xml              # api接口包pom定义
    +-- svc                      # 工程业务实现，领域模型
    |   +-- src/main           
    |   |   +-- java
    |   |   +-- resources
    |   +-- pom.xml              # 工程业务实现包pom定义
    +-- charts                   # 工程helm chart模板定义
    |   +-- model-service
    |   |   +-- templates
    |   |   |   +-- deployment.yaml
    |   |   |   +-- hpa.yaml
    |   |   |   +-- ingress.yaml
    |   |   |   +-- service.yaml
    |   |   +-- Chart.yaml
    |   |   +-- values.yaml      # helm chart动态参数配置
    +-- src
    |   +-- main
    |   |   +-- docker
    |   |   |   +-- Dockerfile    # 工程镜像文件定义
    +-- .gitignore
    +-- .gitlab-ci.yml            # 工程CI/CD定义
    +-- mvnw
    +-- mvnw.cmd
    +-- pom.xml                   # 工程根pom文件定义
    +-- README.md
```
