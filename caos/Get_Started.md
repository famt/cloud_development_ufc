# Get Started
Everything you need to start developing apps for CAOS is available here. The CAOS is divided into two parts: mobile side and server side. You'll find everything from design guidelines (dependencies, configurations and setup) for the server side. Note: Preferably run the server side on Linux OS or OS X.

## Dependencies
Before any action, you must install the necessary dependencies to run on the server. Install the following programs:

* Java (JDK) (http://www.oracle.com/technetwork/pt/java/javase/downloads/index.html) (version: 1.7+)
* PostgreSQL (https://www.postgresql.org/download/) (version: 9.4)
* VirtualBox (https://www.virtualbox.org/wiki/Downloads) (version: 5.2)
* Android SDK (https://developer.android.com/studio/index.html#downloads) (version: 19+)
* Android x86 (https://sourceforge.net/projects/android-x86/files/Release%204.4/android-x86-4.4-r3.iso/download) (version: 4.4-r3)
* (Optional) Android Studio IDE (https://developer.android.com/studio/index.html) (version: -)
* (Optional – Contextual Data) MongoDB (https://www.mongodb.com/download-center) (version: 3.0)

## Initial Configurations
After installing the dependencies, configure the postgre. By default, the user and password must be “postgres“. Create a database named "caos". 

* Put the program "adb" in the system path. The "adb" should be found in the following path: 
/<installation_location>/android-sdk/platform-tools
* Put the program “virtualbox” in the system path. The “virtualbox” should be found in the following path:
/<installation_location>/virtualbox

## Installing Android on the Virtual Machine
* Create a new VM

![](images/Picture1.png)

* Set at least 2GB of memory

![](images/Picture2.png)

* Create a virtual hard disk

![](images/Picture3.png)

* Set the type file to VDI

![](images/Picture4.png)

* Choose the option Dynamically allocated

![](images/Picture5.png)

* Choose a name for the disk and set size toa t least 2GB

![](images/Picture6.png)

* Press the button Create

* Select the android image version 4.4-r3 and use it as the start-up disk

![](images/Picture7.png)

* Choose the last option

![](images/Picture9.png)

* Select SDA

![](images/Picture12.png)

* Select Ext3

![](images/Picture11.png)

* Select Yes

![](images/Picture13.png)

* Select Skip

![](images/Picture14.png)

* Select Skip

![](images/Picture15.png)

* Select Yes

![](images/Picture16.png)

* Select Run Android x86

![](images/Picture17.png)

* Now follow a typical android initialization. Choose the language.

![](images/Picture18.png)

* For now skip the network configuration.

![](images/Picture19.png)

* Skip the connection with google (No)

![](images/Picture21.png)

* Choose a name to your tablet.
  
![](images/Picture24.png)

* And finish the initiallization.

**Note:** Never turn off the virtual machine. Save the machine state and close the virtualbox application.

## Configuring the Network Access on the Virtual Machine

* Select file, host network manager

![](images/Picture28.png)

* Click on Create

![](images/Picture29.png)

* Set the Enable DHCP server box

![](images/Picture30.png)

* Now click on Settings of the VM

![](images/Picture31.png)

* Open the tab Network

![](images/Picture32.png)

* At the field "Attached to" select Host-only Adapter and in the field "Name" select the network created previously.

![](images/Picture33.png)

* Now, initialize the Virtual Machine

* Press Alt + F1 to open the prompt of command

* Use the command: "netcfg" to find the IP. The IP will be the interface eth0 (192.168.233.3). The IP will be used in configuration of vms in the CAOS Controller.

![](images/Picture34.png)

Done all these steps, it is now possible to start developing a CAOS-based application. Click here to learn how to create the "Hello World" application. Click [here](Processing.md).
