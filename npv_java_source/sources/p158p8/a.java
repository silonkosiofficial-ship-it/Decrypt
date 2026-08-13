package p158p8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements p158p8.p {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected int f52758C = 0;

    /* JADX INFO: renamed from: p8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0680a implements p8.p.a {

        /* JADX INFO: renamed from: p8.a$a$a, reason: collision with other inner class name */
        static final class C0681a extends java.io.FilterInputStream {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private int f52759C;

            C0681a(java.io.InputStream inputStream, int i6) {
                super(inputStream);
                this.f52759C = i6;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return java.lang.Math.min(super.available(), this.f52759C);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws java.io.IOException {
                if (this.f52759C <= 0) {
                    return -1;
                }
                int i6 = super.read();
                if (i6 >= 0) {
                    this.f52759C--;
                }
                return i6;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i6, int i10) throws java.io.IOException {
                int i11 = this.f52759C;
                if (i11 <= 0) {
                    return -1;
                }
                int i12 = super.read(bArr, i6, java.lang.Math.min(i10, i11));
                if (i12 >= 0) {
                    this.f52759C -= i12;
                }
                return i12;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j6) throws java.io.IOException {
                long jSkip = super.skip(java.lang.Math.min(j6, this.f52759C));
                if (jSkip >= 0) {
                    this.f52759C = (int) (((long) this.f52759C) - jSkip);
                }
                return jSkip;
            }
        }

        protected static p158p8.v j(p158p8.p pVar) {
            return new p158p8.v(pVar);
        }
    }

    p158p8.v f() {
        return new p158p8.v(this);
    }

    public void g(java.io.OutputStream outputStream) throws java.io.IOException {
        int iB = b();
        p158p8.f fVarI = p158p8.f.I(outputStream, p158p8.f.t(p158p8.f.u(iB) + iB));
        fVarI.n0(iB);
        h(fVarI);
        fVarI.H();
    }
}
