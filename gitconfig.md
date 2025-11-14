# git
# 1.配置用户名和密码
## 设置用户名（必须）
git config --global user.name "你的用户名"

## 设置邮箱（必须）
git config --global user.email "你的邮箱@example.com"

## 设置默认编辑器（可选）
git config --global core.editor "code --wait"  # VS Code
git config --global core.editor "vim"          # Vim

## 设置换行符处理（推荐）
git config --global core.autocrlf input    # macOS/Linux
git config --global core.autocrlf true     # Windows

## 查看所有配置
git config --list
# 2.密钥
## 生成 SSH 密钥
ssh-keygen -t ed25519 -C "你的邮箱@example.com"

## 或者使用 RSA
ssh-keygen -t rsa -b 4096 -C "你的邮箱@example.com"
## 3.校验链接
ssh -T git@github.com
## 应该看到：Hi 用户名! You've successfully authenticated...

# 4.配置git选项及远程仓库地址
git config --global init.defaultBranch main
git config --global color.ui auto
git init 创建gitcore文件
git add process.md 添加md文件
git commit -m "process" 提交填写备注
git remote add origin git@github.com:-----.git 配置远程仓库
git remote -v 查看链接的仓库
git push -u origin main 推送本地文件到main分支 -f时强制提交

# 常用命令git
## 日常开发流程
git status                    # 查看状态
git add .                     # 添加所有文件
git add 文件名                # 添加特定文件
git commit -m "提交信息"      # 提交更改
git push origin 分支名        # 推送到远程

## 分支管理
git branch                    # 查看分支
git branch 新分支名           # 创建新分支
git checkout 分支名           # 切换分支
git checkout -b 新分支名      # 创建并切换分支

## 更新代码
git pull origin 分支名        # 拉取最新代码
git fetch                     # 获取远程更新
git merge 分支名              # 合并分支