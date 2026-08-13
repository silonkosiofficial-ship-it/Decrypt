package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6842x1 extends j$.util.stream.C6731a3 implements j$.util.stream.K0, j$.util.stream.C0 {
    @Override // j$.util.stream.C0
    public final j$.util.stream.K0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(double d6) {
        j$.util.stream.AbstractC6845y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(int i6) {
        j$.util.stream.AbstractC6845y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        j$.util.stream.AbstractC6845y0.l();
        throw null;
    }

    @Override // j$.util.stream.K0
    public final j$.util.stream.K0 b(int i6) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ j$.util.stream.K0 g(long j6, long j10, java.util.function.IntFunction intFunction) {
        return j$.util.stream.AbstractC6845y0.w(this, j6, j10, intFunction);
    }

    @Override // j$.util.stream.K0
    public final void h(java.lang.Object[] objArr, int i6) {
        long j6 = i6;
        long jCount = count() + j6;
        if (jCount > objArr.length || jCount < j6) {
            throw new java.lang.IndexOutOfBoundsException("does not fit");
        }
        if (this.f48427c == 0) {
            java.lang.System.arraycopy(this.f48406e, 0, objArr, i6, this.f48426b);
            return;
        }
        for (int i10 = 0; i10 < this.f48427c; i10++) {
            java.lang.Object[] objArr2 = this.f48407f[i10];
            java.lang.System.arraycopy(objArr2, 0, objArr, i6, objArr2.length);
            i6 += this.f48407f[i10].length;
        }
        int i11 = this.f48426b;
        if (i11 > 0) {
            java.lang.System.arraycopy(this.f48406e, 0, objArr, i6, i11);
        }
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        clear();
        r(j6);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final java.lang.Object[] n(java.util.function.IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        java.lang.Object[] objArr = (java.lang.Object[]) intFunction.apply((int) jCount);
        h(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int p() {
        return 0;
    }
}
