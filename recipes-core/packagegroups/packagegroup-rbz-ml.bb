SUMMARY = "RBZ machine learning support for CPU, GPU and NPU"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

inherit packagegroup

ML_CPU_PKGS = " \
    litert \
    tensorflow-lite \
    onnxruntime-tests \
    pytorch \
"

# GPU/NPU acceleration through OpenVX (i.MX8M Mini GPU has no compute)
ML_ACCEL_PKGS = ""
ML_ACCEL_PKGS:mx8-nxp-bsp:imxgpu = " \
    libopencl-imx \
    libopenvx-imx \
    libnn-imx \
    clinfo \
    litert-vx-delegate \
    tensorflow-lite-vx-delegate \
"
ML_ACCEL_PKGS:mx8mp-nxp-bsp = " \
    libopencl-imx \
    libopenvx-imx \
    libnn-imx \
    clinfo \
    litert-vx-delegate \
    tensorflow-lite-vx-delegate \
    tvm \
"
ML_ACCEL_PKGS:mx8mm-nxp-bsp = ""

ML_NNSTREAMER_PKGS = " \
    nnstreamer \
    nnstreamer-protobuf \
    nnstreamer-python3 \
    nnstreamer-query \
    nnstreamer-tensorflow-lite \
"
ML_NNSTREAMER_PKGS:append:mx8mp-nxp-bsp = " nnstreamer-tvm"

ML_GST_PROFILER = "gst-shark"
ML_GST_PROFILER:mx8mp-nxp-bsp = "nnshark"

ML_PYTHON_PKGS = " \
    python3 \
    python3-pip \
    python3-venv \
    python3-numpy \
    python3-opencv \
    python3-matplotlib \
    python3-pillow \
    python3-pyyaml \
    python3-requests \
    python3-psutil \
    python3-tqdm \
    python3-py-cpuinfo \
"

ML_EXAMPLES = "imx-nnstreamer-examples"

# Kinara Ara240 DNPU over PCIe
ARA240_PKGS = ""
ARA240_PKGS:mx8mp-nxp-bsp = " \
    imx-nxp-ara2 \
    imx-ara2-vision-examples \
"

RDEPENDS:${PN} = " \
    ${ML_CPU_PKGS} \
    ${ML_ACCEL_PKGS} \
    ${ML_NNSTREAMER_PKGS} \
    ${ML_GST_PROFILER} \
    ${ML_PYTHON_PKGS} \
    ${ML_EXAMPLES} \
    ${ARA240_PKGS} \
"
