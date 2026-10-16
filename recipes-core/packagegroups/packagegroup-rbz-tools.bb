SUMMARY = "RBZ debug and hardware test tools"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = " \
    devmem2 \
    memtester \
    evtest \
    spitools \
    can-utils \
    usbutils \
    htop \
    strace \
    lsof \
    less \
    nano \
"
