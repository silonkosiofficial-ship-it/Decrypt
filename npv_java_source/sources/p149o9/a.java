package p149o9;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements p149o9.q, p149o9.p {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p149o9.k f52563C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p149o9.k f52564D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f52565E;

    private final java.lang.Void g0(long j6) throws java.io.EOFException {
        throw new java.io.EOFException("Buffer doesn't contain required number of bytes (size: " + r() + ", required: " + j6 + ')');
    }

    public final void D() {
        p149o9.k kVar = this.f52563C;
        p247y7.AbstractC7350t.c(kVar);
        p149o9.k kVarE = kVar.e();
        this.f52563C = kVarE;
        if (kVarE == null) {
            this.f52564D = null;
        } else {
            kVarE.t(null);
        }
        kVar.r(null);
        p149o9.n.d(kVar);
    }

    @Override // p149o9.p
    public void F(short s6) {
        n0(2).D(s6);
        this.f52565E += 2;
    }

    @Override // p149o9.q
    public boolean G0(long j6) {
        if (j6 >= 0) {
            return r() >= j6;
        }
        throw new java.lang.IllegalArgumentException(("byteCount: " + j6 + " < 0").toString());
    }

    public final /* synthetic */ void H() {
        p149o9.k kVar = this.f52564D;
        p247y7.AbstractC7350t.c(kVar);
        p149o9.k kVarG = kVar.g();
        this.f52564D = kVarG;
        if (kVarG == null) {
            this.f52563C = null;
        } else {
            kVarG.r(null);
        }
        kVar.t(null);
        p149o9.n.d(kVar);
    }

    @Override // p149o9.h
    public long I0(p149o9.a aVar, long j6) {
        p247y7.AbstractC7350t.f(aVar, "sink");
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount (" + j6 + ") < 0").toString());
        }
        if (r() == 0) {
            return -1L;
        }
        if (j6 > r()) {
            j6 = r();
        }
        aVar.m0(this, j6);
        return j6;
    }

    @Override // p149o9.p
    public void J0() {
    }

    public final /* synthetic */ void N(p149o9.k kVar) {
        this.f52563C = kVar;
    }

    public final /* synthetic */ void R(long j6) {
        this.f52565E = j6;
    }

    @Override // p149o9.q
    public int V(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "sink");
        p149o9.t.a(bArr.length, i6, i10);
        p149o9.k kVar = this.f52563C;
        if (kVar == null) {
            return -1;
        }
        int iMin = java.lang.Math.min(i10 - i6, kVar.j());
        kVar.p(bArr, i6, i6 + iMin);
        this.f52565E -= (long) iMin;
        if (p149o9.m.a(kVar)) {
            D();
        }
        return iMin;
    }

    @Override // p149o9.p
    public long X(p149o9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "source");
        long j6 = 0;
        while (true) {
            long jI0 = hVar.I0(this, 8192L);
            if (jI0 == -1) {
                return j6;
            }
            j6 += jI0;
        }
    }

    public final void a() throws java.io.EOFException {
        skip(r());
    }

    @Override // p149o9.h, java.lang.AutoCloseable, p149o9.g
    public void close() {
    }

    @Override // p149o9.q, p149o9.p
    public p149o9.a d() {
        return this;
    }

    public final /* synthetic */ void e0(p149o9.k kVar) {
        this.f52564D = kVar;
    }

    public final long f() {
        long jR = r();
        if (jR == 0) {
            return 0L;
        }
        p149o9.k kVar = this.f52564D;
        p247y7.AbstractC7350t.c(kVar);
        return (kVar.d() >= 8192 || !kVar.f52584e) ? jR : jR - ((long) (kVar.d() - kVar.f()));
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public final p149o9.a g() {
        p149o9.a aVar = new p149o9.a();
        if (r() == 0) {
            return aVar;
        }
        p149o9.k kVarE = this.f52563C;
        p247y7.AbstractC7350t.c(kVarE);
        p149o9.k kVarY = kVarE.y();
        aVar.f52563C = kVarY;
        while (true) {
            aVar.f52564D = kVarY;
            kVarE = kVarE.e();
            if (kVarE == null) {
                aVar.f52565E = r();
                return aVar;
            }
            p149o9.k kVar = aVar.f52564D;
            p247y7.AbstractC7350t.c(kVar);
            kVarY = kVar.m(kVarE.y());
        }
    }

    @Override // p149o9.q
    public p149o9.q g1() {
        return p149o9.c.a(new p149o9.f(this));
    }

    public final void i(p149o9.a aVar, long j6, long j10) {
        p247y7.AbstractC7350t.f(aVar, "out");
        p149o9.t.a(r(), j6, j10);
        if (j6 == j10) {
            return;
        }
        long jD = j10 - j6;
        aVar.f52565E += jD;
        p149o9.k kVarE = this.f52563C;
        while (true) {
            p247y7.AbstractC7350t.c(kVarE);
            if (j6 < kVarE.d() - kVarE.f()) {
                break;
            }
            j6 -= (long) (kVarE.d() - kVarE.f());
            kVarE = kVarE.e();
        }
        while (jD > 0) {
            p247y7.AbstractC7350t.c(kVarE);
            p149o9.k kVarY = kVarE.y();
            kVarY.s(kVarY.f() + ((int) j6));
            kVarY.q(java.lang.Math.min(kVarY.f() + ((int) jD), kVarY.d()));
            if (aVar.o() == null) {
                aVar.N(kVarY);
                aVar.e0(kVarY);
            } else {
                p149o9.k kVarY2 = aVar.y();
                p247y7.AbstractC7350t.c(kVarY2);
                aVar.e0(kVarY2.m(kVarY));
            }
            jD -= (long) (kVarY.d() - kVarY.f());
            kVarE = kVarE.e();
            j6 = 0;
        }
    }

    @Override // p149o9.q
    public boolean j() {
        return r() == 0;
    }

    @Override // p149o9.q
    public byte m() throws java.io.EOFException {
        p149o9.k kVar = this.f52563C;
        if (kVar == null) {
            g0(1L);
            throw new p087i7.C6665k();
        }
        int iJ = kVar.j();
        if (iJ == 0) {
            D();
            return m();
        }
        byte bN = kVar.n();
        this.f52565E--;
        if (iJ == 1) {
            D();
        }
        return bN;
    }

    @Override // p149o9.g
    public void m0(p149o9.a aVar, long j6) {
        p247y7.AbstractC7350t.f(aVar, "source");
        if (aVar == this) {
            throw new java.lang.IllegalArgumentException("source == this".toString());
        }
        p149o9.t.b(aVar.f52565E, 0L, j6);
        while (j6 > 0) {
            p149o9.k kVar = aVar.f52563C;
            p247y7.AbstractC7350t.c(kVar);
            if (j6 < kVar.j()) {
                p149o9.k kVar2 = this.f52564D;
                if (kVar2 != null && kVar2.f52584e) {
                    if ((((long) kVar2.d()) + j6) - ((long) (kVar2.i() ? 0 : kVar2.f())) <= 8192) {
                        p149o9.k kVar3 = aVar.f52563C;
                        p247y7.AbstractC7350t.c(kVar3);
                        kVar3.E(kVar2, (int) j6);
                        aVar.f52565E -= j6;
                        this.f52565E += j6;
                        return;
                    }
                }
                p149o9.k kVar4 = aVar.f52563C;
                p247y7.AbstractC7350t.c(kVar4);
                aVar.f52563C = kVar4.z((int) j6);
            }
            p149o9.k kVar5 = aVar.f52563C;
            p247y7.AbstractC7350t.c(kVar5);
            long j10 = kVar5.j();
            p149o9.k kVarL = kVar5.l();
            aVar.f52563C = kVarL;
            if (kVarL == null) {
                aVar.f52564D = null;
            }
            if (o() == null) {
                N(kVar5);
                e0(kVar5);
            } else {
                p149o9.k kVarY = y();
                p247y7.AbstractC7350t.c(kVarY);
                e0(kVarY.m(kVar5).a());
                p149o9.k kVarY2 = y();
                p247y7.AbstractC7350t.c(kVarY2);
                if (kVarY2.g() == null) {
                    N(y());
                }
            }
            aVar.f52565E -= j10;
            this.f52565E += j10;
            j6 -= j10;
        }
    }

    public final /* synthetic */ p149o9.k n0(int i6) {
        p149o9.k kVarM;
        if (i6 < 1 || i6 > 8192) {
            throw new java.lang.IllegalArgumentException("unexpected capacity".toString());
        }
        p149o9.k kVar = this.f52564D;
        if (kVar == null) {
            kVarM = p149o9.n.f();
            this.f52563C = kVarM;
        } else {
            p247y7.AbstractC7350t.c(kVar);
            if (kVar.d() + i6 <= 8192 && kVar.f52584e) {
                return kVar;
            }
            kVarM = kVar.m(p149o9.n.f());
        }
        this.f52564D = kVarM;
        return kVarM;
    }

    public final /* synthetic */ p149o9.k o() {
        return this.f52563C;
    }

    public void o0(byte b6) {
        n0(1).C(b6);
        this.f52565E++;
    }

    @Override // p149o9.q
    public short p() throws java.io.EOFException {
        p149o9.k kVar = this.f52563C;
        if (kVar == null) {
            g0(2L);
            throw new p087i7.C6665k();
        }
        int iJ = kVar.j();
        if (iJ < 2) {
            q(2L);
            if (iJ != 0) {
                return (short) (((m() & 255) << 8) | (m() & 255));
            }
            D();
            return p();
        }
        short sO = kVar.o();
        this.f52565E -= 2;
        if (iJ == 2) {
            D();
        }
        return sO;
    }

    @Override // p149o9.q
    public void q(long j6) throws java.io.EOFException {
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j6).toString());
        }
        if (r() >= j6) {
            return;
        }
        throw new java.io.EOFException("Buffer doesn't contain required number of bytes (size: " + r() + ", required: " + j6 + ')');
    }

    public final long r() {
        return this.f52565E;
    }

    public final /* synthetic */ long s() {
        return this.f52565E;
    }

    @Override // p149o9.q
    public void s1(p149o9.g gVar, long j6) throws java.io.EOFException {
        p247y7.AbstractC7350t.f(gVar, "sink");
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount (" + j6 + ") < 0").toString());
        }
        if (r() >= j6) {
            gVar.m0(this, j6);
            return;
        }
        gVar.m0(this, r());
        throw new java.io.EOFException("Buffer exhausted before writing " + j6 + " bytes. Only " + r() + " bytes were written.");
    }

    public void skip(long j6) throws java.io.EOFException {
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount (" + j6 + ") < 0").toString());
        }
        long j10 = j6;
        while (j10 > 0) {
            p149o9.k kVar = this.f52563C;
            if (kVar == null) {
                throw new java.io.EOFException("Buffer exhausted before skipping " + j6 + " bytes.");
            }
            int iMin = (int) java.lang.Math.min(j10, kVar.d() - kVar.f());
            long j11 = iMin;
            this.f52565E -= j11;
            j10 -= j11;
            kVar.s(kVar.f() + iMin);
            if (kVar.f() == kVar.d()) {
                D();
            }
        }
    }

    @Override // p149o9.q
    public long t(p149o9.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "sink");
        long jR = r();
        if (jR > 0) {
            gVar.m0(this, jR);
        }
        return jR;
    }

    public java.lang.String toString() {
        if (r() == 0) {
            return "Buffer(size=0)";
        }
        long j6 = 64;
        int iMin = (int) java.lang.Math.min(j6, r());
        java.lang.StringBuilder sb = new java.lang.StringBuilder((iMin * 2) + (r() > j6 ? 1 : 0));
        p189s9.d dVar = p189s9.d.f54410a;
        int i6 = 0;
        for (p149o9.k kVarO = o(); kVarO != null; kVarO = kVarO.e()) {
            p189s9.b bVar = p189s9.e.f54411a;
            int i10 = 0;
            while (i6 < iMin && i10 < kVarO.j()) {
                int i11 = i10 + 1;
                byte bA = bVar.a(kVarO, i10);
                i6++;
                sb.append(p149o9.t.c()[(bA >> 4) & 15]);
                sb.append(p149o9.t.c()[bA & 15]);
                i10 = i11;
            }
        }
        if (r() > j6) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + r() + " hex=" + ((java.lang.Object) sb) + ')';
    }

    @Override // p149o9.p
    public void write(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "source");
        p149o9.t.a(bArr.length, i6, i10);
        int i11 = i6;
        while (i11 < i10) {
            p149o9.k kVarN0 = n0(1);
            int iMin = java.lang.Math.min(i10 - i11, kVarN0.h()) + i11;
            kVarN0.A(bArr, i11, iMin);
            i11 = iMin;
        }
        this.f52565E += (long) (i10 - i6);
    }

    public final /* synthetic */ p149o9.k y() {
        return this.f52564D;
    }
}
