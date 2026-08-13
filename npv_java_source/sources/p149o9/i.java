package p149o9;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements p149o9.q {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p149o9.h f52573C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f52574D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p149o9.a f52575E;

    public i(p149o9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "source");
        this.f52573C = hVar;
        this.f52575E = new p149o9.a();
    }

    @Override // p149o9.q
    public boolean G0(long j6) {
        if (!(!this.f52574D)) {
            throw new java.lang.IllegalStateException("Source is closed.".toString());
        }
        if (j6 >= 0) {
            while (this.f52575E.r() < j6) {
                if (this.f52573C.I0(this.f52575E, 8192L) == -1) {
                    return false;
                }
            }
            return true;
        }
        throw new java.lang.IllegalArgumentException(("byteCount: " + j6).toString());
    }

    @Override // p149o9.h
    public long I0(p149o9.a aVar, long j6) {
        p247y7.AbstractC7350t.f(aVar, "sink");
        if (!(!this.f52574D)) {
            throw new java.lang.IllegalStateException("Source is closed.".toString());
        }
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j6).toString());
        }
        if (this.f52575E.r() == 0 && this.f52573C.I0(this.f52575E, 8192L) == -1) {
            return -1L;
        }
        return this.f52575E.I0(aVar, java.lang.Math.min(j6, this.f52575E.r()));
    }

    @Override // p149o9.q
    public int V(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "sink");
        p149o9.t.a(bArr.length, i6, i10);
        if (this.f52575E.r() == 0 && this.f52573C.I0(this.f52575E, 8192L) == -1) {
            return -1;
        }
        return this.f52575E.V(bArr, i6, ((int) java.lang.Math.min(i10 - i6, this.f52575E.r())) + i6);
    }

    @Override // p149o9.h, java.lang.AutoCloseable, p149o9.g
    public void close() throws java.io.EOFException {
        if (this.f52574D) {
            return;
        }
        this.f52574D = true;
        this.f52573C.close();
        this.f52575E.a();
    }

    @Override // p149o9.q, p149o9.p
    public p149o9.a d() {
        return this.f52575E;
    }

    @Override // p149o9.q
    public p149o9.q g1() {
        if (!this.f52574D) {
            return p149o9.c.a(new p149o9.f(this));
        }
        throw new java.lang.IllegalStateException("Source is closed.".toString());
    }

    @Override // p149o9.q
    public boolean j() {
        if (!this.f52574D) {
            return this.f52575E.j() && this.f52573C.I0(this.f52575E, 8192L) == -1;
        }
        throw new java.lang.IllegalStateException("Source is closed.".toString());
    }

    @Override // p149o9.q
    public byte m() throws java.io.EOFException {
        q(1L);
        return this.f52575E.m();
    }

    @Override // p149o9.q
    public short p() throws java.io.EOFException {
        q(2L);
        return this.f52575E.p();
    }

    @Override // p149o9.q
    public void q(long j6) throws java.io.EOFException {
        if (G0(j6)) {
            return;
        }
        throw new java.io.EOFException("Source doesn't contain required number of bytes (" + j6 + ").");
    }

    @Override // p149o9.q
    public void s1(p149o9.g gVar, long j6) throws java.io.EOFException {
        p247y7.AbstractC7350t.f(gVar, "sink");
        try {
            q(j6);
            this.f52575E.s1(gVar, j6);
        } catch (java.io.EOFException e6) {
            gVar.m0(this.f52575E, this.f52575E.r());
            throw e6;
        }
    }

    @Override // p149o9.q
    public long t(p149o9.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "sink");
        long j6 = 0;
        while (this.f52573C.I0(this.f52575E, 8192L) != -1) {
            long jF = this.f52575E.f();
            if (jF > 0) {
                j6 += jF;
                gVar.m0(this.f52575E, jF);
            }
        }
        if (this.f52575E.r() <= 0) {
            return j6;
        }
        long jR = j6 + this.f52575E.r();
        p149o9.a aVar = this.f52575E;
        gVar.m0(aVar, aVar.r());
        return jR;
    }

    public java.lang.String toString() {
        return "buffered(" + this.f52573C + ')';
    }
}
