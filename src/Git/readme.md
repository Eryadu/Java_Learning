//Github Git ?

Git?
1.Version control system
2.Tracking code changes, who wrote code and made changes
3.Code collab
4.Repository

git --  local software, linux Torvarlds // linux, who made linux

github - remote repository

Laptop hard drive ==============> Google drive
[Local]                             [Remote]

git  ----------------------> Github, Gitlab, Bitbucket

homebrew.  ------- is package for mac that help down the line to install diffrent type of apps


// commands

git init --- to initial the empty directory, where to start to store files
git status // files in workspace, git can't track
git add . // to add all the files to git
git status // now files in workspace but git can track
git commit -m "added 3 files" // -m is for message

commit? // snapshot of your code at that specific moment and time.

git log // to check the previous changes

downstream --- local laptop
upstream ---- remote repository i.e github


// Steps to change existing remote repository to new one.

//Change the current working directory to your local project.

1. List your existing remotes in order to get the name of the remote you want to change.

$ git remote -v

i.e 
> origin  git@github.com:OWNER/REPOSITORY.git (fetch)
> origin  git@github.com:OWNER/REPOSITORY.git (push)
Change your remote's URL from SSH to HTTPS with the git remote set-url command.

$ git remote set-url origin https://github.com/OWNER/REPOSITORY.git
Verify that the remote URL has changed.

$ git remote -v
# Verify new remote URL
> origin  https://github.com/OWNER/REPOSITORY.git (fetch)
> origin  https://github.com/OWNER/REPOSITORY.git (push)

branch ??

pointer to a commit


main  ------------- commit 1, commit 2, commit 3 // master copy/ Production level code
\
\
mybranch ---- commit 1, commit 2, commit 3, commit 4, commit 5


main  -- [Production]. - www.facebook.com
|
staging [pre production] -  exact replica of the main branch www.staging.facebook.com
|
feature branch [login page]


-git branch branch_name // to create new branch
-git checkout branch_name // to change to other branch


// merge into a branch

master/main.   commmit 1, commit2
 |
 | 

staging.   commit0 commit1 commit2

when merging to main
1. switch to main branch
2. git merge staging