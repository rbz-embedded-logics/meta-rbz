SUMMARY = "RBZ base hardware and filesystem support"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

SDMA_FIRMWARE = ""
SDMA_FIRMWARE:mx8m-nxp-bsp = "firmware-imx-sdma-imx7d"

RDEPENDS:${PN} = " \
    kernel-modules \
    ${SDMA_FIRMWARE} \
    e2fsprogs-e2fsck \
    e2fsprogs-resize2fs \
    dosfstools \
    util-linux-fdisk \
    util-linux-lsblk \
    i2c-tools \
    libgpiod-tools \
    mmc-utils \
    nuttcp \
"
