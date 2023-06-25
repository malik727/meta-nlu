SUMMARY = "Easier and safer interface between Rust, C, and other languages"
HOMEPAGE = "https://github.com/sonos/ffi-convert-rs"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
    "

SRC_URI = " \
    crate://crates.io/addr2line/0.19.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aho-corasick/1.0.2 \
    crate://crates.io/backtrace/0.3.67 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/either/1.8.1 \
    crate://crates.io/failure/0.1.8 \
    crate://crates.io/failure_derive/0.1.8 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/gimli/0.27.3 \
    crate://crates.io/itertools/0.8.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.146 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/miniz_oxide/0.6.2 \
    crate://crates.io/object/0.30.4 \
    crate://crates.io/proc-macro2/1.0.63 \
    crate://crates.io/quote/1.0.28 \
    crate://crates.io/regex/1.8.4 \
    crate://crates.io/regex-syntax/0.7.2 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/synstructure/0.12.6 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/unicode-ident/1.0.9 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unicode-xid/0.2.4 \
    git://github.com/sonos/ffi-convert-rs;protocol=https;branch=main \
    "

PV = "0.1.0+git${SRCPV}"
S = "${WORKDIR}/git"
SRCREV = "291ce1defcb13cef000b82a62deae7f2c3366eed"

inherit cargo