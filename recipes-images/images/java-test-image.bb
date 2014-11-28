LICENSE = "MIT"

inherit core-image

IMAGE_LINGUAS = " "

IMAGE_FSTYPES = "tar.gz ext2.gz ext2.gz.u-boot"
IMAGE_INSTALL = "busybox modutils-initscripts initscripts opkg udev sysvinit netbase base-files base-passwd busybox-hwclock bash \
                 ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL} \
                 openjdk-7-jre openjdk-7-vm-jamvm openjdk-7-vm-cacao \
                 openjdk-6-jre openjdk-6-vm-zero openjdk-6-vm-jamvm openjdk-6-vm-cacao \
                 strace dropbear binutils \
                 classpath \
                 classpath-common \
                 classpath-examples \
                 classpath-tools \
                 jamvm \
                 cacao \
                 openjdk-6-doc openjdk-6-demo openjdk-6-jdk \
                 openjdk-7-doc openjdk-7-demo openjdk-7-jdk \
"
