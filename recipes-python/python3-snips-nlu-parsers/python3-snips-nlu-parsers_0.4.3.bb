SUMMARY = "Python wrapper of the snips-nlu-parsers Rust crate"
HOMEPAGE = ""
LICENSE = "Apache-2.0"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=a42c1cad1ffebf915ab953d0826b3788"
LIC_FILES_CHKSUM = " \
    file://../LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://../LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
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

SRC_URI[addr2line-0.19.0.sha256sum] = "a76fd60b23679b7d19bd066031410fb7e458ccc5e958eb5c325888ce4baedc97"
SRC_URI[adler-1.0.2.sha256sum] = "f26201604c87b1e01bd3d98f8d5d9a8fcbb815e8cedb41ffccbeb4bf593a35fe"
SRC_URI[aho-corasick-1.0.2.sha256sum] = "43f6cb1bf222025340178f382c426f13757b2960e89779dfcb319c32542a5a41"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[backtrace-0.3.67.sha256sum] = "233d376d6d185f2a3093e58f283f60f880315b6c60075b01f36b3b85154564ca"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bumpalo-3.13.0.sha256sum] = "a3e2c3daef883ecc1b5d58c15adae93470a91d425f3532ba1695849656af3fc1"
SRC_URI[byteorder-1.4.3.sha256sum] = "14c189c53d098945499cdfa7ecc63567cf3886b3332b312a5b4585d8d3a6a610"
SRC_URI[cc-1.0.79.sha256sum] = "50d30906286121d95be3d479533b458f87493b30a4b5f79a607db8f5d11aa91f"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[chrono-0.4.8.sha256sum] = "27429a03ca54100bf6bdc726c09adc46a74187ac93f9ce96dc7aaa9594ebf707"
SRC_URI[derive-new-0.5.9.sha256sum] = "3418329ca0ad70234b9735dc4ceed10af4df60eff9c8e7b06cb5e520d92c3535"
SRC_URI[either-1.8.1.sha256sum] = "7fcaabb2fef8c910e7f4c7ce9f67a1283a1715879a7c230ca9d6d1ae31f16d91"
SRC_URI[enum_primitive-0.1.1.sha256sum] = "be4551092f4d519593039259a9ed8daedf0da12e5109c5280338073eaeb81180"
SRC_URI[errno-0.3.1.sha256sum] = "4bcfec3a70f97c962c307b2d2c56e358cf1d00b558d74262b5f929ee8cc7e73a"
SRC_URI[errno-dragonfly-0.1.2.sha256sum] = "aa68f1b12764fab894d2755d2518754e71b4fd80ecfb822714a1206c2aab39bf"
SRC_URI[failure-0.1.8.sha256sum] = "d32e9bd16cc02eae7db7ef620b392808b89f6a5e16bb3497d159c6b92a0f4f86"
SRC_URI[failure_derive-0.1.8.sha256sum] = "aa4da3c766cd7a0db8242e326e9e4e081edd567072893ed320008189715366a4"
SRC_URI[fastrand-1.9.0.sha256sum] = "e51093e27b0797c359783294ca4f0a911c270184cb10f85783b118614a1501be"
SRC_URI[fnv-1.0.7.sha256sum] = "3f9eec918d3f24069decb9af1554cad7c880e2da24a9afd88aca000531ab82c1"
SRC_URI[gimli-0.27.3.sha256sum] = "b6c80984affa11d98d1b88b66ac8853f143217b399d3c74116778ff8fdb4ed2e"
SRC_URI[hermit-abi-0.3.1.sha256sum] = "fed44880c466736ef9a5c5b5facefb5ed0785676d0c02d612db14e54f0d84286"
SRC_URI[instant-0.1.12.sha256sum] = "7a5bbe824c507c5da5956355e86a746d82e0e1464f65d862cc5e71da70e94b2c"
SRC_URI[io-lifetimes-1.0.11.sha256sum] = "eae7b9aee968036d54dce06cebaefd919e4472e753296daccd6d344e3e2df0c2"
SRC_URI[itertools-0.8.2.sha256sum] = "f56a2d0bc861f9165be4eb3442afd3c236d8a98afd426f65d92324ae1091a484"
SRC_URI[itoa-1.0.6.sha256sum] = "453ad9f582a441959e5f0d088b02ce04cfe8d51a8eaf077f12ac6d3e94164ca6"
SRC_URI[js-sys-0.3.64.sha256sum] = "c5f195fe497f702db0f318b07fdd68edb16955aed830df8363d837542f8f935a"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[libc-0.2.146.sha256sum] = "f92be4933c13fd498862a9e02a3055f8a8d9c039ce33db97306fd5a6caa7f29b"
SRC_URI[linux-raw-sys-0.3.8.sha256sum] = "ef53942eb7bf7ff43a617b3e2c1c4a5ecf5944a7c1bc12d7ee39bbb15e5c1519"
SRC_URI[log-0.4.19.sha256sum] = "b06a4cde4c0f271a446782e3eff8de789548ce57dbc8eca9292c27f4a42004b4"
SRC_URI[maybe-uninit-2.0.0.sha256sum] = "60302e4db3a61da70c0cb7991976248362f30319e88850c487b9b95bbf059e00"
SRC_URI[memchr-2.5.0.sha256sum] = "2dffe52ecf27772e601905b7522cb4ef790d2cc203488bbd0e2fe85fcb74566d"
SRC_URI[miniz_oxide-0.6.2.sha256sum] = "b275950c28b37e794e8c55d88aeb5e139d0ce23fdbbeda68f8d7174abdf9e8fa"
SRC_URI[num-integer-0.1.45.sha256sum] = "225d3389fb3509a24c93f5c29eb6bde2586b98d9f016636dff58d7c6f7569cd9"
SRC_URI[num-traits-0.1.43.sha256sum] = "92e5113e9fd4cc14ded8e499429f396a20f98c772a47cc8622a736e1ec843c31"
SRC_URI[num-traits-0.2.15.sha256sum] = "578ede34cf02f8924ab9447f50c28075b4d3e5b269972345e7e0372b38c6cdcd"
SRC_URI[object-0.30.4.sha256sum] = "03b4680b86d9cfafba8fc491dc9b6df26b68cf40e9e6cd73909194759a63c385"
SRC_URI[once_cell-1.18.0.sha256sum] = "dd8b5dd2ae5ed71462c540258bedcb51965123ad7e7ccf4b9a8cafaa4a63576d"
SRC_URI[paste-1.0.12.sha256sum] = "9f746c4065a8fa3fe23974dd82f15431cc8d40779821001404d10d2e79ca7d79"
SRC_URI[proc-macro2-1.0.63.sha256sum] = "7b368fba921b0dce7e60f5e04ec15e565b3303972b42bcfde1d0713b881959eb"
SRC_URI[quote-1.0.28.sha256sum] = "1b9ab9c7eadfd8df19006f1cf1a4aed13540ed5cbc047010ece5826e10825488"
SRC_URI[redox_syscall-0.3.5.sha256sum] = "567664f262709473930a4bf9e51bf2ebf3348f2e748ccc50dea20646858f8f29"
SRC_URI[regex-1.8.4.sha256sum] = "d0ab3ca65655bb1e41f2a8c8cd662eb4fb035e67c3f78da1d61dffe89d07300f"
SRC_URI[regex-syntax-0.7.2.sha256sum] = "436b050e76ed2903236f032a59761c1eb99e1b0aead2c257922771dab1fc8c78"
SRC_URI[rmp-0.8.11.sha256sum] = "44519172358fd6d58656c86ab8e7fbc9e1490c3e8f14d35ed78ca0dd07403c9f"
SRC_URI[rmp-serde-0.13.7.sha256sum] = "011e1d58446e9fa3af7cdc1fb91295b10621d3ac4cb3a85cc86385ee9ca50cd3"
SRC_URI[rmp-serde-0.14.4.sha256sum] = "4ce7d70c926fe472aed493b902010bccc17fa9f7284145cb8772fd22fdb052d8"
SRC_URI[rustc-demangle-0.1.23.sha256sum] = "d626bb9dae77e28219937af045c257c28bfd3f69333c512553507f5f9798cb76"
SRC_URI[rustix-0.37.20.sha256sum] = "b96e891d04aa506a6d1f318d2771bcb1c7dfda84e126660ace067c9b474bb2c0"
SRC_URI[ryu-1.0.13.sha256sum] = "f91339c0467de62360649f8d3e185ca8de4224ff281f66000de5eb2a77a79041"
SRC_URI[serde-1.0.164.sha256sum] = "9e8c8cf938e98f769bc164923b06dce91cea1751522f46f8466461af04c9027d"
SRC_URI[serde_derive-1.0.164.sha256sum] = "d9735b638ccc51c28bf6914d90a2e9725b377144fc612c49a611fddd1b631d68"
SRC_URI[serde_json-1.0.99.sha256sum] = "46266871c240a00b8f503b877622fe33430b3c7d963bdc0f2adc511e54a1eae3"
SRC_URI[smallvec-0.6.14.sha256sum] = "b97fcaeba89edba30f044a10c6a3cc39df9c3f17d7cd829dd1446cab35f890e0"
SRC_URI[string-interner-0.7.1.sha256sum] = "fd710eadff449a1531351b0e43eb81ea404336fa2f56c777427ab0e32a4cf183"
SRC_URI[syn-1.0.109.sha256sum] = "72b64191b275b66ffe2469e8af2c1cfe3bafa67b529ead792a6d0160888b4237"
SRC_URI[syn-2.0.22.sha256sum] = "2efbeae7acf4eabd6bcdcbd11c92f45231ddda7539edc7806bd1a04a03b24616"
SRC_URI[synstructure-0.12.6.sha256sum] = "f36bdaa60a83aca3921b5259d5400cbf5e90fc51931376a9bd4a0eb79aa7210f"
SRC_URI[tempfile-3.6.0.sha256sum] = "31c0432476357e58790aaa47a8efb0c5138f137343f3b5f23bd36a27e3b0a6d6"
SRC_URI[time-0.1.45.sha256sum] = "1b797afad3f312d1c66a56d11d0316f916356d11bd158fbc6ca6389ff6bf805a"
SRC_URI[tinyvec-1.6.0.sha256sum] = "87cc5ceb3875bb20c2890005a4e226a4651264a5c75edb2421b52861a0a0cb50"
SRC_URI[tinyvec_macros-0.1.1.sha256sum] = "1f3ccbac311fea05f86f61904b462b55fb3df8837a366dfc601a0161d0532f20"
SRC_URI[unicode-ident-1.0.9.sha256sum] = "b15811caf2415fb889178633e7724bad2509101cde276048e013b9def5e51fa0"
SRC_URI[unicode-normalization-0.1.22.sha256sum] = "5c5713f0fc4b5db668a2ac63cdb7bb4469d8c9fed047b1d0292cc7b0ce2ba921"
SRC_URI[unicode-xid-0.2.4.sha256sum] = "f962df74c8c05a667b5ee8bcf162993134c104e96440b663c8daa176dc772d8c"
SRC_URI[vec_map-0.8.2.sha256sum] = "f1bddf1187be692e79c5ffeab891132dfb0f236ed36a43c7ed39f1165ee20191"
SRC_URI[wasi-0.10.0+wasi-snapshot-preview1.sha256sum] = "1a143597ca7c7793eff794def352d41792a93c481eb1042423ff7ff72ba2c31f"
SRC_URI[wasm-bindgen-0.2.87.sha256sum] = "7706a72ab36d8cb1f80ffbf0e071533974a60d0a308d01a5d0375bf60499a342"
SRC_URI[wasm-bindgen-backend-0.2.87.sha256sum] = "5ef2b6d3c510e9625e5fe6f509ab07d66a760f0885d858736483c32ed7809abd"
SRC_URI[wasm-bindgen-macro-0.2.87.sha256sum] = "dee495e55982a3bd48105a7b947fd2a9b4a8ae3010041b9e0faab3f9cd028f1d"
SRC_URI[wasm-bindgen-macro-support-0.2.87.sha256sum] = "54681b18a46765f095758388f2d0cf16eb8d4169b639ab575a8f5693af210c7b"
SRC_URI[wasm-bindgen-shared-0.2.87.sha256sum] = "ca6ad05a4870b2bf5fe995117d3728437bd27d7cd5f06f13c17443ef369775a1"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-targets-0.48.0.sha256sum] = "7b1eb6f0cd7c80c79759c929114ef071b87354ce476d9d94271031c0497adfd5"
SRC_URI[windows_aarch64_gnullvm-0.48.0.sha256sum] = "91ae572e1b79dba883e0d315474df7305d12f569b400fcf90581b06062f7e1bc"
SRC_URI[windows_aarch64_msvc-0.48.0.sha256sum] = "b2ef27e0d7bdfcfc7b868b317c1d32c641a6fe4629c171b8928c7b08d98d7cf3"
SRC_URI[windows_i686_gnu-0.48.0.sha256sum] = "622a1962a7db830d6fd0a69683c80a18fda201879f0f447f065a3b7467daa241"
SRC_URI[windows_i686_msvc-0.48.0.sha256sum] = "4542c6e364ce21bf45d69fdd2a8e455fa38d316158cfd43b3ac1c5b1b19f8e00"
SRC_URI[windows_x86_64_gnu-0.48.0.sha256sum] = "ca2b8a661f7628cbd23440e50b05d705db3686f894fc9580820623656af974b1"
SRC_URI[windows_x86_64_gnullvm-0.48.0.sha256sum] = "7896dbc1f41e08872e9d5e8f8baa8fdd2677f29468c4e156210174edc7f7b953"
SRC_URI[windows_x86_64_msvc-0.48.0.sha256sum] = "1a515f5799fe4961cb532f983ce2b23082366b898e52ffbce459c86f67c8378a"

PV = "0.4.3+git${SRCPV}"
SRCREV = "8cfdae50437732fcf906af90626c8db196729d30"
S = "${WORKDIR}/git/python"

DEPENDS = "gazetteer-entity-parser python3-future python3-setuptools-rust-native"

# DEPENDS = "gazetteer-entity-parser"
# RDEPENDS_${PN} = "gazetteer-entity-parser"

inherit cargo

RDEPENDS_${PN} = "python3-future"
