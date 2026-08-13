package p149o9;

/* JADX INFO: loaded from: classes2.dex */
class d implements p149o9.h {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.io.InputStream f52566C;

    public d(java.io.InputStream inputStream) {
        p247y7.AbstractC7350t.f(inputStream, "input");
        this.f52566C = inputStream;
    }

    @Override // p149o9.h
    public long I0(p149o9.a aVar, long j6) throws java.io.IOException {
        long jS;
        p247y7.AbstractC7350t.f(aVar, "sink");
        if (j6 == 0) {
            return 0L;
        }
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount (" + j6 + ") < 0").toString());
        }
        try {
            p189s9.d dVar = p189s9.d.f54410a;
            p149o9.k kVarN0 = aVar.n0(1);
            int i6 = 0;
            byte[] bArrB = kVarN0.b(false);
            int iD = kVarN0.d();
            long j10 = this.f52566C.read(bArrB, iD, (int) java.lang.Math.min(j6, bArrB.length - iD));
            if (j10 != -1) {
                i6 = (int) j10;
            }
            if (i6 != 1) {
                if (i6 < 0 || i6 > kVarN0.h()) {
                    throw new java.lang.IllegalStateException(("Invalid number of bytes written: " + i6 + ". Should be in 0.." + kVarN0.h()).toString());
                }
                if (i6 != 0) {
                    kVarN0.B(bArrB, i6);
                    kVarN0.q(kVarN0.d() + i6);
                    jS = aVar.s();
                } else if (p149o9.m.a(kVarN0)) {
                    aVar.H();
                }
                return j10;
            }
            kVarN0.B(bArrB, i6);
            kVarN0.q(kVarN0.d() + i6);
            jS = aVar.s();
            aVar.R(jS + ((long) i6));
            return j10;
        } catch (java.lang.AssertionError e6) {
            if (p149o9.e.b(e6)) {
                throw new java.io.IOException(e6);
            }
            throw e6;
        }
    }

    @Override // p149o9.h, java.lang.AutoCloseable, p149o9.g
    public void close() throws java.io.IOException {
        this.f52566C.close();
    }

    public java.lang.String toString() {
        return "RawSource(" + this.f52566C + ')';
    }
}
