# meta_rbz
RBZ Yocto metalayer

## Imágenes

| Imagen | Contenido |
|---|---|
| `rbz-image-core` | arranque + systemd + openssh + `packagegroup-rbz-base` (incluye nuttcp) |
| `rbz-image-base` | core + gestor de paquetes + `packagegroup-rbz-tools` + `packagegroup-rbz-network` |
| `rbz-image-multimedia` | base + Weston + hwcodecs + `packagegroup-rbz-graphics` + `packagegroup-rbz-multimedia` |
| `rbz-image-full` | multimedia + `packagegroup-core-full-cmdline` + `packagegroup-fsl-gstreamer1.0-full` + `packagegroup-imx-isp` |
| `rbz-image-ml` | full + `packagegroup-rbz-ml` (LiteRT/TFLite, ONNX Runtime, PyTorch, delegados VX GPU/NPU, NNStreamer, ejemplos) |

Contenido instalado: `tmp/deploy/images/<machine>/<imagen>-<machine>.rootfs.manifest`
