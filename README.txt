初级常用命令
git config - -list	查看配置文件
git config --global user.name ‘zhupeng911’
git config --global user.email ‘377964646@qq.com’	设置用户名
设置用户邮箱
git status	掌握工作区的状态
git help config/commit/add
git config/commit/add -h	获取命令的帮助
获取命令的帮助
git文件操作
git init	初始化为git仓库
git add a.txt	将文件修改添加到暂存区（stage）
git commit -m “first commit”	提交更改，将暂存区的所有内容提交到当前分支
git push	本地仓库文件推送到github master分支
git log
git log --graph
git log --pretty=oneline	查看从最近到最远的提交日志，以便确定退回到哪个版本
git 版本对比	
git diff	对比工作区、暂存区内容
git diff head	对比工作区、最近的一次提交commit
git diff 5da78a4 c7c0e3b	对比两个历史快照
git diff --cached 32e233	对比仓库、暂存区
git版本回退：reset 和 checkout
回退快照
git reset --hard head~
git reset --mixed head~
git reset --soft head~
git reset --hard head~ ~
git reset --hard head~ 5	
回退到head的上一个快照，--hard回退版本库、暂存区、工作区
回退到head的上一个快照，-- mixed回退版本库、暂存区(默认)
回退到head的上一个快照，-- soft回退版本库
回退到head的上上一个快照
回退到head的上5个快照
git reflog	查看所有回退快照ID
git reset --hard 6c8sdc	回退到指定的快照，不仅可以往回滚，也可以往前滚，必须知道快照ID
回退文件
git checkout -- a.txt	
将工作区/暂存区删除的文件恢复到工作目录
分支管理
git branch feature01	创建分支feature01（通过git log查看是否创建成功）
git branch	没有参数时，git branch 会列出你在本地的分支
git checkout feature01	切换到分支feature01进行操作（git status查看目前处在的分支）
git checkout -b (branchname)	创建一个叫做branchname的临时分支，并切换过去
git merge feature01	将分支feature01合并到master
git branch -d feature01	删除分支feature01
git remote add origin https://github.com/zhupeng911/git_study.git
添加一个远程仓库
git push -u origin master
git push --all origin	将代码推送到该远程仓库
将本地的所有分支都推送到远程主机
git remote -v	
git remote show [remote rep1]	列出所有远程仓库
列出某个远程仓库信息
变基rebase：将本地多次的commit合并成一个commit， 还可以修改commit的描述等
git rebase -i head ~ ~
git rebase -i hash值	合并前两次的commit
合并前i次commit在最新commit的提交