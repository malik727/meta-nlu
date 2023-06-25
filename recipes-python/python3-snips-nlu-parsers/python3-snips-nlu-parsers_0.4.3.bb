SUMMARY = "Python wrapper of the snips-nlu-parsers Rust crate"
HOMEPAGE = ""
LICENSE = "Apache-2.0"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=a42c1cad1ffebf915ab953d0826b3788"
LIC_FILES_CHKSUM = " \
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
    "

SRC_URI = " \
    crate://crates.io/addr2line/0.19.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aho-corasick/1.0.2 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.67 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bumpalo/3.13.0 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.8 \
    crate://crates.io/derive-new/0.5.9 \
    crate://crates.io/either/1.8.1 \
    crate://crates.io/enum_primitive/0.1.1 \
    crate://crates.io/errno/0.3.1 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/failure/0.1.8 \
    crate://crates.io/failure_derive/0.1.8 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/gimli/0.27.3 \
    crate://crates.io/hermit-abi/0.3.1 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.11 \
    crate://crates.io/itertools/0.8.2 \
    crate://crates.io/itoa/1.0.6 \
    crate://crates.io/js-sys/0.3.64 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.146 \
    crate://crates.io/linux-raw-sys/0.3.8 \
    crate://crates.io/log/0.4.19 \
    crate://crates.io/maybe-uninit/2.0.0 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/miniz_oxide/0.6.2 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-traits/0.1.43 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/object/0.30.4 \
    crate://crates.io/once_cell/1.18.0 \
    crate://crates.io/paste/1.0.12 \
    crate://crates.io/proc-macro2/1.0.63 \
    crate://crates.io/quote/1.0.28 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/regex/1.8.4 \
    crate://crates.io/regex-syntax/0.7.2 \
    crate://crates.io/rmp/0.8.11 \
    crate://crates.io/rmp-serde/0.13.7 \
    crate://crates.io/rmp-serde/0.14.4 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/rustix/0.37.20 \
    crate://crates.io/ryu/1.0.13 \
    crate://crates.io/serde/1.0.164 \
    crate://crates.io/serde_derive/1.0.164 \
    crate://crates.io/serde_json/1.0.99 \
    crate://crates.io/smallvec/0.6.14 \
    crate://crates.io/string-interner/0.7.1 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.22 \
    crate://crates.io/synstructure/0.12.6 \
    crate://crates.io/tempfile/3.6.0 \
    crate://crates.io/time/0.1.45 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/unicode-ident/1.0.9 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unicode-xid/0.2.4 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen/0.2.87 \
    crate://crates.io/wasm-bindgen-backend/0.2.87 \
    crate://crates.io/wasm-bindgen-macro/0.2.87 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.87 \
    crate://crates.io/wasm-bindgen-shared/0.2.87 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.48.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.0 \
    crate://crates.io/windows_aarch64_msvc/0.48.0 \
    crate://crates.io/windows_i686_gnu/0.48.0 \
    crate://crates.io/windows_i686_msvc/0.48.0 \
    crate://crates.io/windows_x86_64_gnu/0.48.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.0 \
    crate://crates.io/windows_x86_64_msvc/0.48.0 \
    git://github.com/snipsco/snips-nlu-parsers;protocol=https;branch=master \
    "

PV = "0.4.3+git${SRCPV}"
SRCREV = "8cfdae50437732fcf906af90626c8db196729d30"
S = "${WORKDIR}/git"

# DEPENDS = "python3-future python3-setuptools-rust-native"
# RDEPENDS_${PN} = "python3-future"

DEPENDS = "gazetteer-entity-parser"
RDEPENDS_${PN} = "gazetteer-entity-parser"

inherit cargo
