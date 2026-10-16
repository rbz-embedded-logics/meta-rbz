require rbz-image-core.bb

SUMMARY = "RBZ base image with debug and network tools"

IMAGE_FEATURES += "package-management"

IMAGE_INSTALL += " \
    packagegroup-rbz-tools \
    packagegroup-rbz-network \
"
