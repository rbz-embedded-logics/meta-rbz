SUMMARY = "RBZ audio and GStreamer support"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    alsa-utils \
    packagegroup-fsl-gstreamer1.0 \
"
