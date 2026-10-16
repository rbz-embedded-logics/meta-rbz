SUMMARY = "RBZ core image"
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += "ssh-server-openssh"

IMAGE_INSTALL = " \
    packagegroup-core-boot \
    packagegroup-rbz-base \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

IMAGE_LINGUAS = ""
