# UserInyerface
Project designed for the automation of the website [userinyerface](userinyerface.com)

## Get the code

Git:

    Whit SSH
    git clone git@github.com:DiegoZaraza/UserInyerface.git
    cd userinyerface
    
    With HTTPS
    git clone https://github.com/DiegoZaraza/UserInyerface.git
    cd userinyerface
    
Or simply [download a zip](https://github.com/DiegoZaraza/UserInyerface/archive/master.zip) file

## Configuration
You must update the path with the avatar image, this must be updated in the file ``data.properties`` that is located in:
    
    src/test/resources/data.properties
    
## Execution
For execute the project you must use:
    
    gradle cucumber
    
## Note
For the moment the script for upload avatar only work in MacOS.
