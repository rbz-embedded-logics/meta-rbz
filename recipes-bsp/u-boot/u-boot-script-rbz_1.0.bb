SUMMARY = "U-Boot boot script for RBZ modules"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "u-boot-mkimage-native"

inherit deploy

SRC_URI = " \
    file://boot_mini.txt \
    file://boot_nano.txt \
    file://boot_plus.txt \
"

S = "${UNPACKDIR}"

BOOT_SCRIPT_SRC = ""
BOOT_SCRIPT_SRC:mx8mm-generic-bsp = "boot_mini.txt"
BOOT_SCRIPT_SRC:mx8mn-generic-bsp = "boot_nano.txt"
BOOT_SCRIPT_SRC:mx8mp-generic-bsp = "boot_plus.txt"

do_compile() {
    mkimage -T script -n bootscript -C none -d ${S}/${BOOT_SCRIPT_SRC} ${B}/boot.scr
}

do_install() {
    install -D -m 0644 ${B}/boot.scr ${D}/boot.scr
}

do_deploy() {
    install -D -m 0644 ${B}/boot.scr ${DEPLOYDIR}/boot.scr
}
addtask deploy after do_install before do_build

FILES:${PN} = "/boot.scr"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8m-generic-bsp)"
