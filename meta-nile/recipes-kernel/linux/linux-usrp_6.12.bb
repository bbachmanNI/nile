FILESEXTRAPATHS:prepend := "${THISDIR}/linux-usrp:"

LIC_FILES_CHKSUM ?= "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

require recipes-kernel/linux/linux-yocto.inc

KERNEL_VERSION_SANITY_SKIP = "1"

KBRANCH = "nilrt/master/6.12"
LINUX_VERSION = "6.12.57-rt14"
LINUX_VERSION_EXTENSION = "-usrp"

SRCREV_machine = "556be4f45e0014252323bd2bb4036129898fc893"
SRCREV_meta = "2987fc4250f2ad7f6e2df663bba0742638fbae51"

KMETA = "kernel-meta"
SRC_URI = " \
    git://github.com/ni/linux;name=machine;protocol=https;branch=${KBRANCH} \
    git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-6.12;destsuffix=${KMETA};protocol=https \
    "
SRC_URI += " file://nile-common.scc"

KCONFIG_MODE = "alldefconfig"
PV = "${LINUX_VERSION}+git${SRCPV}"

KCONF_AUDIT_LEVEL = "2"
KCONF_BSP_AUDIT_LEVEL = "2"

