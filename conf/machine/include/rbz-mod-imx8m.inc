require conf/machine/include/imx-base.inc
require conf/machine/include/arm/armv8a/tune-cortexa53.inc

MACHINE_FEATURES:append:use-nxp-bsp = " optee"

IMX_DEFAULT_BSP = "nxp"
IMX_DEFAULT_BOOTLOADER:imx-nxp-bsp = "u-boot-imx-rbz"
IMX_DEFAULT_KERNEL:imx-nxp-bsp = "linux-imx-rbz"

# imx-base.inc enables the U-Boot binman container when the bootloader is not
# "u-boot-imx"; RBZ still uses imx-boot (imx-mkimage)
UBOOT_PROVIDES_BOOT_CONTAINER:mx8m-generic-bsp = "0"

UBOOT_SUFFIX = "bin"
UBOOT_CONFIG ??= "sd"
SPL_BINARY = "spl/u-boot-spl.bin"

IMXBOOT_TARGETS_BASENAME = "flash_evk"
IMXBOOT_TARGETS = \
    "${@bb.utils.contains('UBOOT_CONFIG', 'fspi', '${IMXBOOT_TARGETS_BASENAME}_flexspi', \
                                                  '${IMXBOOT_TARGETS_BASENAME}', d)}"
IMXBOOT_TARGETS += "${IMXBOOT_TARGETS_BASENAME}_flexspi"

SERIAL_CONSOLES = "115200;ttymxc2"
ATF_BOOT_UART_BASE = "0x30880000"

LOADADDR = ""
UBOOT_MAKE_TARGET = "all"

IMAGE_BOOT_FILES:append = " boot.scr"
WKS_FILE_DEPENDS:append = " u-boot-script-rbz"

MACHINE_FIRMWARE:append = " linux-firmware-ath10k"
