package X9;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends X9.AbstractC1841i {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.io.RandomAccessFile f16193G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z6, java.io.RandomAccessFile randomAccessFile) {
        super(z6);
        p247y7.AbstractC7350t.f(randomAccessFile, "randomAccessFile");
        this.f16193G = randomAccessFile;
    }

    @Override // X9.AbstractC1841i
    protected synchronized int D(long j6, byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "array");
        this.f16193G.seek(j6);
        int i11 = 0;
        while (i11 < i10) {
            int i12 = this.f16193G.read(bArr, i6, i10 - i11);
            if (i12 == -1) {
                if (i11 != 0) {
                    break;
                }
                return -1;
            }
            i11 += i12;
        }
        return i11;
    }

    @Override // X9.AbstractC1841i
    protected synchronized long H() {
        return this.f16193G.length();
    }

    @Override // X9.AbstractC1841i
    protected synchronized void N(long j6, byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "array");
        this.f16193G.seek(j6);
        this.f16193G.write(bArr, i6, i10);
    }

    @Override // X9.AbstractC1841i
    protected synchronized void s() {
        this.f16193G.close();
    }

    @Override // X9.AbstractC1841i
    protected synchronized void y() {
        this.f16193G.getFD().sync();
    }
}
