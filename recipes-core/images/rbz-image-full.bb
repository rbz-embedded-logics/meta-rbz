require rbz-image-multimedia.bb

SUMMARY = "RBZ full image with complete GStreamer, ISP and full command line"

IMAGE_INSTALL += " \
    packagegroup-core-full-cmdline \
    packagegroup-fsl-gstreamer1.0-full \
    packagegroup-imx-isp \
"
