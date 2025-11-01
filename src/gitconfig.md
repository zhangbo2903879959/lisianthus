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

#4.