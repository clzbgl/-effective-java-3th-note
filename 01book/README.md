有限制最大上传文件不能超过100M

打包压缩并分割成指定大小

```shell
# 打包压缩
tar -czvf a.tar.gz Effective_Java中文版_第3版_机械工业出版社_14522793.pdf

# 分割
split -b 90M -d -a1 a.tar.gz a.tar.gz.

# 合并成一条命令
tar -czvf a.tar.gz Effective_Java中文版_第3版_机械工业出版社_14522793.pdf | split -b 90M -d -a1 - a.tar.gz.
```

参数说明：

- `-b 90M`表示设置每个分割包的大小，单位还可以是k

- `-d`参数指定生成的分割包后缀为数字形式

- `-a 1`来设定序列的长度（默认是2），这里设定序列长度为1，如a.tar.gz.0 a.tar.gz.1



将分割后的压缩包解压

```shell
cat a.tar.gz* | tar -xzv
```

