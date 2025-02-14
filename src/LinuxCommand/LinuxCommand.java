/*
Linux Commands

whoami - to check compuetr name
ps - to check pc process
df - to check disk space
Touch  file name—— to create file
ls —— list all the files
ls -l   long list of files (in more detail)
ls -lt ---- means based on time
ls -lrt -- reverse order of time
ls -r -- reverse sort order
ls -t -- based on time


Different types of editors
- Vim editor
- nano
- emacs

Vi  filename —— this will open the editor
Press letter i——— to go to insert mode
Wrote something : hello I am a java

Esc —— to come out of the insert mode

:w —— to save the file
:q —— exit and if there are unsaved changes, it would not let you exit
:q! —— exit without save // force quit
:wq — save and exit
:x — save and exit
-Cat file name — to show the content of file without opening file.

mkdir directory_name     — to create new directory
cd directory_name        — to go inside the directory
pwd                      - present working directory
cd ..                    — to go back to previous directory
rmdir dir_name           - to remove directory
rm -rf dir_name          — to remove directory with files inside
rm -r dir_name           — to remove directory with files, sub-directories inside // r means recursive
cp exiting-name new-name - Copy files
mv filename new name     - Rename files
rm  filename             - Remove/delete file

#￼Directories
Root directory
home directory

//Permission
r - read
w - write
x - execute

Total 7 blocks

-rw-r--r--. 1 ec2-user ec2-user 0 Feb 14 02:07 index.txt //long file name

-rw-r--r--.  - Permissions and file type
1            - Memory Block // number of links
ec2-user     - Owner Name
ec2-user     - Owner Group
0            - size of file in bytes
Feb 14 02:07 - date and time of last modification
index.txt    - Name of the file/directory

d            - Directory // if there is d means its in directory

-rw- ---> Owner permission
r--  ---> Group permission
r--  ---> Other permission (means who use the computer, they can use all the permissions)

code
7 -rwx (read, write, executable)

how to change permission ?

1. chmod 7 7 7 // first 7 means Owner permission for rwx, second 7 means Group permission for rwx,
                  third 7 means Other permission for rwx.

codes to change permission

0  - no permission
1  - execute permission
2  - write permission
3  - write and execute permission
4  - read permission
5  - read and execute permission
6  - read and write
7  - read write and execute

if there is d in front of rwx means directory

## grep keyword (whatevertofind) file_name
this command is used to search a regular expression / or pattern

1. find the match
grep Javascript(Example keyword) file_name

2. grep -v Javascript file_name
print all the line that does not match the pattern

3. grep -n Javascript file_name
print all the lines and line number

4. grep -i Javascript file_name
for upper case or lower case

5. grep -c Javascript file_name
print the count of matching lines...


##Sort
to arrange content according

1. -n  sort numerically, ignore blanks and tabs
2. -r reverses the order of sort
3. -f sorts upper and lowercase together
4. +x ignores first x fields when sorting (Not working)
5. -o new_file_name old_file_name (sort -o demo1 demo)
    use to save output after sorting
*/