SUMMARY = "RBZ network tools"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = " \
    iproute2 \
    net-tools \
    ethtool \
    iperf3 \
    tcpdump \
    curl \
    rsync \
"
