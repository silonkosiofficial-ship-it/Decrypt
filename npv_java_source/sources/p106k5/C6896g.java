package p106k5;

/* JADX INFO: renamed from: k5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6896g implements p106k5.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f49614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f49615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f49616c;

    C6896g(java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.f49615b = str;
        this.f49616c = str2;
        this.f49614a = bArr;
    }

    private byte[] d() {
        if (e()) {
            return null;
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f49614a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (java.lang.Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    private boolean e() {
        byte[] bArr = this.f49614a;
        return bArr == null || bArr.length == 0;
    }

    @Override // p106k5.K
    public java.lang.String a() {
        return this.f49616c;
    }

    @Override // p106k5.K
    public java.io.InputStream b() {
        if (e()) {
            return null;
        }
        return new java.io.ByteArrayInputStream(this.f49614a);
    }

    @Override // p106k5.K
    public n5.F.d.b c() {
        byte[] bArrD = d();
        if (bArrD == null) {
            return null;
        }
        return n5.F.d.b.a().b(bArrD).c(this.f49615b).a();
    }
}
