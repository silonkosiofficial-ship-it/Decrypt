package p106k5;

/* JADX INFO: loaded from: classes3.dex */
class F implements p106k5.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.io.File f49565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f49566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f49567c;

    F(java.lang.String str, java.lang.String str2, java.io.File file) {
        this.f49566b = str;
        this.f49567c = str2;
        this.f49565a = file;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private byte[] d() {
        byte[] bArr = new byte[8192];
        try {
            java.io.InputStream inputStreamB = b();
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamB == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (inputStreamB != null) {
                            inputStreamB.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i6 = inputStreamB.read(bArr);
                            if (i6 <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                inputStreamB.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i6);
                        } catch (java.lang.Throwable th) {
                            try {
                                gZIPOutputStream.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (java.lang.Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th4) {
                    byteArrayOutputStream.close();
                    throw th4;
                }
            } catch (java.lang.Throwable th5) {
                if (inputStreamB != null) {
                    try {
                        inputStreamB.close();
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
            if (inputStreamB != null) {
                inputStreamB.close();
            }
            throw th5;
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // p106k5.K
    public java.lang.String a() {
        return this.f49567c;
    }

    @Override // p106k5.K
    public java.io.InputStream b() {
        if (this.f49565a.exists() && this.f49565a.isFile()) {
            try {
                return new java.io.FileInputStream(this.f49565a);
            } catch (java.io.FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // p106k5.K
    public n5.F.d.b c() {
        byte[] bArrD = d();
        if (bArrD != null) {
            return n5.F.d.b.a().b(bArrD).c(this.f49566b).a();
        }
        return null;
    }
}
