# Adapted from linux-imx_6.18.bb (meta-imx wrynose-6.18.20-2.0.0)

SUMMARY = "Linux kernel for RBZ modules"
DESCRIPTION = "Linux Kernel provided and supported by NXP with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

DEPENDS += "coreutils-native"

SRC_URI = "${KERNEL_SRC}"
KERNEL_SRC ?= "git://github.com/rbz-embedded-logics/linux-imx-rbz.git;protocol=https;branch=${SRCBRANCH}"
SRCBRANCH = "lf-6.18.y"
KBRANCH = "${SRCBRANCH}"
# TODO: set RBZ commit
SRCREV = "3050dcac17a03c98b017042f418bd67a81865654"

LINUX_VERSION = "6.18.20"
KERNEL_VERSION_SANITY_SKIP = "1"
LOCALVERSION = "-lts-next"

KBUILD_DEFCONFIG:mx8-generic-bsp = "imx_v8_defconfig"
KBUILD_DEFCONFIG:mx9-generic-bsp = "imx_v8_defconfig"

DEFAULT_PREFERENCE = "1"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
