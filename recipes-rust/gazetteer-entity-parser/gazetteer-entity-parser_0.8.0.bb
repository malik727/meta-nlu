SUMMARY = "Rust library for parsing and resolving entity values based on a gazetteer"
HOMEPAGE = "https://github.com/snipsco/gazetteer-entity-parser"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
    "

SRC_URI = " \
    crate://crates.io/addr2line/0.19.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/ansi_term/0.12.1 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.67 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/cast/0.2.7 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clap/2.34.0 \
    crate://crates.io/cloudabi/0.0.3 \
    crate://crates.io/criterion/0.2.11 \
    crate://crates.io/criterion-plot/0.3.1 \
    crate://crates.io/crossbeam-channel/0.5.8 \
    crate://crates.io/crossbeam-deque/0.8.3 \
    crate://crates.io/crossbeam-epoch/0.9.15 \
    crate://crates.io/crossbeam-utils/0.8.16 \
    crate://crates.io/csv/1.2.2 \
    crate://crates.io/csv-core/0.1.10 \
    crate://crates.io/dinghy-test/0.4.71 \
    crate://crates.io/either/1.8.1 \
    crate://crates.io/errno/0.3.1 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/failure/0.1.8 \
    crate://crates.io/failure_derive/0.1.8 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/getrandom/0.1.16 \
    crate://crates.io/gimli/0.27.3 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/hermit-abi/0.3.1 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.11 \
    crate://crates.io/itertools/0.8.2 \
    crate://crates.io/itoa/1.0.6 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.146 \
    crate://crates.io/linux-raw-sys/0.3.8 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.9.0 \
    crate://crates.io/miniz_oxide/0.6.2 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/object/0.30.4 \
    crate://crates.io/paste/1.0.12 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/proc-macro2/1.0.63 \
    crate://crates.io/quote/1.0.28 \
    crate://crates.io/rand/0.7.3 \
    crate://crates.io/rand_chacha/0.2.2 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_core/0.5.1 \
    crate://crates.io/rand_hc/0.2.0 \
    crate://crates.io/rand_os/0.1.3 \
    crate://crates.io/rand_xoshiro/0.1.0 \
    crate://crates.io/rayon/1.7.0 \
    crate://crates.io/rayon-core/1.11.0 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/rmp/0.8.11 \
    crate://crates.io/rmp-serde/0.13.7 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustix/0.37.20 \
    crate://crates.io/ryu/1.0.13 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/semver/1.0.17 \
    crate://crates.io/serde/1.0.164 \
    crate://crates.io/serde_derive/1.0.164 \
    crate://crates.io/serde_json/1.0.99 \
    crate://crates.io/strsim/0.8.0 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.22 \
    crate://crates.io/synstructure/0.12.6 \
    crate://crates.io/tempfile/3.6.0 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/tinytemplate/1.2.1 \
    crate://crates.io/unicode-ident/1.0.9 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/unicode-xid/0.2.4 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/walkdir/2.3.3 \
    crate://crates.io/wasi/0.9.0+wasi-snapshot-preview1 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
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
    git://github.com/malik727/gazetteer-entity-parser.git;protocol=https;branch=master \ 
    "

PV = "0.8.0+git${SRCPV}"
S = "${WORKDIR}/git"
SRCREV = "0e117818081782d1f295376f4cb3e1bb084e397c"

inherit cargo
