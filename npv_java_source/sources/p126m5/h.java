package p126m5;

/* JADX INFO: loaded from: classes3.dex */
class h implements p126m5.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.nio.charset.Charset f51161d = java.nio.charset.Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.io.File f51162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p126m5.g f51164c;

    class a implements m5.g.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f51165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f51166b;

        a(byte[] bArr, int[] iArr) {
            this.f51165a = bArr;
            this.f51166b = iArr;
        }

        @Override // m5.g.d
        public void a(java.io.InputStream inputStream, int i6) throws java.io.IOException {
            try {
                inputStream.read(this.f51165a, this.f51166b[0], i6);
                int[] iArr = this.f51166b;
                iArr[0] = iArr[0] + i6;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f51168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51169b;

        b(byte[] bArr, int i6) {
            this.f51168a = bArr;
            this.f51169b = i6;
        }
    }

    h(java.io.File file, int i6) {
        this.f51162a = file;
        this.f51163b = i6;
    }

    private void f(long j6, java.lang.String str) {
        if (this.f51164c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i6 = this.f51163b / 4;
            if (str.length() > i6) {
                str = "..." + str.substring(str.length() - i6);
            }
            this.f51164c.o(java.lang.String.format(java.util.Locale.US, "%d %s%n", java.lang.Long.valueOf(j6), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f51161d));
            while (!this.f51164c.N() && this.f51164c.y0() > this.f51163b) {
                this.f51164c.r0();
            }
        } catch (java.io.IOException e6) {
            p076h5.g.f().e("There was a problem writing to the Crashlytics log.", e6);
        }
    }

    private m5.h.b g() {
        if (!this.f51162a.exists()) {
            return null;
        }
        h();
        p126m5.g gVar = this.f51164c;
        if (gVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[gVar.y0()];
        try {
            this.f51164c.D(new m5.h.a(bArr, iArr));
        } catch (java.io.IOException e6) {
            p076h5.g.f().e("A problem occurred while reading the Crashlytics log file.", e6);
        }
        return new m5.h.b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f51164c == null) {
            try {
                this.f51164c = new p126m5.g(this.f51162a);
            } catch (java.io.IOException e6) {
                p076h5.g.f().e("Could not open log file: " + this.f51162a, e6);
            }
        }
    }

    @Override // p126m5.c
    public void a() {
        p106k5.AbstractC6898i.f(this.f51164c, "There was a problem closing the Crashlytics log file.");
        this.f51164c = null;
    }

    @Override // p126m5.c
    public java.lang.String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new java.lang.String(bArrC, f51161d);
        }
        return null;
    }

    @Override // p126m5.c
    public byte[] c() {
        m5.h.b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i6 = bVarG.f51169b;
        byte[] bArr = new byte[i6];
        java.lang.System.arraycopy(bVarG.f51168a, 0, bArr, 0, i6);
        return bArr;
    }

    @Override // p126m5.c
    public void d() {
        a();
        this.f51162a.delete();
    }

    @Override // p126m5.c
    public void e(long j6, java.lang.String str) {
        h();
        f(j6, str);
    }
}
