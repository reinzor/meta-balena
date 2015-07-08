SUMMARY = "Resin Flasher Package Group"
LICENSE = "Apache-2.0"

PR = "r1"

inherit packagegroup

RESIN_INIT_PACKAGE ?= "resin-init-flasher"
RESIN_MOUNTS ?= "resin-mounts-flasher"

include packagegroup-resin.inc
