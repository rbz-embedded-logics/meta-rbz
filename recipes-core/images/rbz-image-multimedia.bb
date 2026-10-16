require rbz-image-base.bb

SUMMARY = "RBZ multimedia image with Weston, GPU and GStreamer"

IMAGE_FEATURES += " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston', '', d)} \
    hwcodecs \
"

IMAGE_INSTALL += " \
    packagegroup-rbz-graphics \
    packagegroup-rbz-multimedia \
"
