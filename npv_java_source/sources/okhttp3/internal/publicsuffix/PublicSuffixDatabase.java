package okhttp3.internal.publicsuffix;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: java.lang.NullPointerException: parseDelimitedFrom(...) must not be null
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"ઞ"}, d2 = {"ટ", "", "ઠ", "ડ", "", "ઢ", "", "ણ", "ત", "થ", "દ", "ધ", "ન", "\u0aa9", "પ", "ફ", "બ", "ભ", "મ", "ય", "ર", "\u0ab1", "લ", "ળ", "", "\u0ab4", "વ", "શ", "ષ"}, k = 1, mv = {1, 8, 0})
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase.a f52598e = new okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f52599f = {42};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.List f52600g = p097j7.AbstractC6879v.e("*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final okhttp3.internal.publicsuffix.PublicSuffixDatabase f52601h = new okhttp3.internal.publicsuffix.PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f52602a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.CountDownLatch f52603b = new java.util.concurrent.CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f52604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f52605d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String b(byte[] bArr, byte[][] bArr2, int i6) {
            int i10;
            int iD;
            boolean z6;
            int iD2;
            int length = bArr.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = (i11 + length) / 2;
                while (i12 > -1 && bArr[i12] != 10) {
                    i12--;
                }
                int i13 = i12 + 1;
                int i14 = 1;
                while (true) {
                    i10 = i13 + i14;
                    if (bArr[i10] == 10) {
                        break;
                    }
                    i14++;
                }
                int i15 = i10 - i13;
                int i16 = i6;
                boolean z10 = false;
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    if (z10) {
                        iD = 46;
                        z6 = false;
                    } else {
                        boolean z11 = z10;
                        iD = I9.d.d(bArr2[i16][i17], 255);
                        z6 = z11;
                    }
                    iD2 = iD - I9.d.d(bArr[i13 + i18], 255);
                    if (iD2 != 0) {
                        break;
                    }
                    i18++;
                    i17++;
                    if (i18 == i15) {
                        break;
                    }
                    if (bArr2[i16].length != i17) {
                        z10 = z6;
                    } else {
                        if (i16 == bArr2.length - 1) {
                            break;
                        }
                        i16++;
                        z10 = true;
                        i17 = -1;
                    }
                }
                if (iD2 >= 0) {
                    if (iD2 <= 0) {
                        int i19 = i15 - i18;
                        int length2 = bArr2[i16].length - i17;
                        int length3 = bArr2.length;
                        for (int i20 = i16 + 1; i20 < length3; i20++) {
                            length2 += bArr2[i20].length;
                        }
                        if (length2 >= i19) {
                            if (length2 <= i19) {
                                java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                                p247y7.AbstractC7350t.e(charset, "UTF_8");
                                return new java.lang.String(bArr, i13, i15, charset);
                            }
                        }
                    }
                    i11 = i10 + 1;
                }
                length = i12;
            }
            return null;
        }

        public final okhttp3.internal.publicsuffix.PublicSuffixDatabase c() {
            return okhttp3.internal.publicsuffix.PublicSuffixDatabase.f52601h;
        }
    }

    private final java.util.List b(java.util.List list) {
        java.lang.String str;
        java.lang.String strB;
        java.lang.String str2;
        java.util.List listM;
        java.util.List listM2;
        if (this.f52602a.get() || !this.f52602a.compareAndSet(false, true)) {
            try {
                this.f52603b.await();
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (this.f52604c == null) {
            throw new java.lang.IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.String str3 = (java.lang.String) list.get(i6);
            java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
            p247y7.AbstractC7350t.e(charset, "UTF_8");
            byte[] bytes = str3.getBytes(charset);
            p247y7.AbstractC7350t.e(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i6] = bytes;
        }
        int i10 = 0;
        while (true) {
            str = null;
            if (i10 >= size) {
                strB = null;
                break;
            }
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.a aVar = f52598e;
            byte[] bArr2 = this.f52604c;
            if (bArr2 == null) {
                p247y7.AbstractC7350t.p("publicSuffixListBytes");
                bArr2 = null;
            }
            strB = aVar.b(bArr2, bArr, i10);
            if (strB != null) {
                break;
            }
            i10++;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                str2 = null;
                break;
            }
            bArr3[i11] = f52599f;
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.a aVar2 = f52598e;
            byte[] bArr4 = this.f52604c;
            if (bArr4 == null) {
                p247y7.AbstractC7350t.p("publicSuffixListBytes");
                bArr4 = null;
            }
            java.lang.String strB2 = aVar2.b(bArr4, bArr3, i11);
            if (strB2 != null) {
                str2 = strB2;
                break;
            }
            i11++;
        }
        if (str2 != null) {
            int i12 = size - 1;
            for (int i13 = 0; i13 < i12; i13++) {
                okhttp3.internal.publicsuffix.PublicSuffixDatabase.a aVar3 = f52598e;
                byte[] bArr5 = this.f52605d;
                if (bArr5 == null) {
                    p247y7.AbstractC7350t.p("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                java.lang.String strB3 = aVar3.b(bArr5, bArr, i13);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
            }
        }
        if (str != null) {
            return S8.r.S0('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strB == null && str2 == null) {
            return f52600g;
        }
        if (strB == null || (listM = S8.r.S0(strB, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        if (str2 == null || (listM2 = S8.r.S0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM2 = p097j7.AbstractC6879v.m();
        }
        return listM.size() > listM2.size() ? listM : listM2;
    }

    private final void d() {
        try {
            p247y7.O o6 = new p247y7.O();
            p247y7.O o10 = new p247y7.O();
            java.io.InputStream inputStreamZqubf = com.napsternetlabs.napsternetv.ProtectedMyApplication.zqubf(okhttp3.internal.publicsuffix.PublicSuffixDatabase.class, "publicsuffixes.gz");
            if (inputStreamZqubf == null) {
                this.f52603b.countDown();
                return;
            }
            X9.InterfaceC1838f interfaceC1838fB = X9.K.b(new X9.C1847o(X9.K.f(inputStreamZqubf)));
            try {
                o6.f57254C = interfaceC1838fB.T0(interfaceC1838fB.K());
                o10.f57254C = interfaceC1838fB.T0(interfaceC1838fB.K());
                p087i7.M m6 = p087i7.M.f46721a;
                p197t7.b.a(interfaceC1838fB, null);
                synchronized (this) {
                    java.lang.Object obj = o6.f57254C;
                    p247y7.AbstractC7350t.c(obj);
                    this.f52604c = (byte[]) obj;
                    java.lang.Object obj2 = o10.f57254C;
                    p247y7.AbstractC7350t.c(obj2);
                    this.f52605d = (byte[]) obj2;
                }
                this.f52603b.countDown();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    p197t7.b.a(interfaceC1838fB, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            this.f52603b.countDown();
            throw th3;
        }
    }

    private final void e() {
        boolean z6 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (java.io.InterruptedIOException unused) {
                    java.lang.Thread.interrupted();
                    z6 = true;
                } catch (java.io.IOException e6) {
                    Q9.k.f9149a.g().j("Failed to read public suffix list", 5, e6);
                    if (z6) {
                        java.lang.Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (java.lang.Throwable th) {
                if (z6) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    private final java.util.List f(java.lang.String str) {
        java.util.List listS0 = S8.r.S0(str, new char[]{'.'}, false, 0, 6, null);
        return p247y7.AbstractC7350t.b(p097j7.AbstractC6879v.t0(listS0), "") ? p097j7.AbstractC6879v.d0(listS0, 1) : listS0;
    }

    public final java.lang.String c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "domain");
        java.lang.String unicode = java.net.IDN.toUnicode(str);
        p247y7.AbstractC7350t.e(unicode, "unicodeDomain");
        java.util.List listF = f(unicode);
        java.util.List listB = b(listF);
        if (listF.size() == listB.size() && ((java.lang.String) listB.get(0)).charAt(0) != '!') {
            return null;
        }
        char cCharAt = ((java.lang.String) listB.get(0)).charAt(0);
        int size = listF.size();
        int size2 = listB.size();
        if (cCharAt != '!') {
            size2++;
        }
        return R8.k.E(R8.k.v(p097j7.AbstractC6879v.Y(f(str)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
