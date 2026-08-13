package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class Y0 extends j$.util.stream.X0 implements j$.util.stream.InterfaceC6849z0 {
    @Override // j$.util.stream.InterfaceC6849z0, j$.util.stream.C0
    public final j$.util.stream.E0 a() {
        int i6 = this.f48390b;
        double[] dArr = this.f48389a;
        if (i6 >= dArr.length) {
            return this;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("Current size %d is less than fixed size %d", java.lang.Integer.valueOf(this.f48390b), java.lang.Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.C0
    public final /* bridge */ /* synthetic */ j$.util.stream.K0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) {
        int i6 = this.f48390b;
        double[] dArr = this.f48389a;
        if (i6 >= dArr.length) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Accept exceeded fixed size of %d", java.lang.Integer.valueOf(dArr.length)));
        }
        this.f48390b = 1 + i6;
        dArr[i6] = d6;
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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        o((java.lang.Double) obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void j() {
        int i6 = this.f48390b;
        double[] dArr = this.f48389a;
        if (i6 < dArr.length) {
            throw new java.lang.IllegalStateException(java.lang.String.format("End size %d is less than fixed size %d", java.lang.Integer.valueOf(this.f48390b), java.lang.Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        double[] dArr = this.f48389a;
        if (j6 != dArr.length) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Begin size %d is not equal to fixed size %d", java.lang.Long.valueOf(j6), java.lang.Integer.valueOf(dArr.length)));
        }
        this.f48390b = 0;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC6795n2
    public final /* synthetic */ void o(java.lang.Double d6) {
        j$.util.stream.AbstractC6845y0.e(this, d6);
    }

    @Override // j$.util.stream.X0
    public final java.lang.String toString() {
        double[] dArr = this.f48389a;
        return java.lang.String.format("DoubleFixedNodeBuilder[%d][%s]", java.lang.Integer.valueOf(dArr.length - this.f48390b), java.util.Arrays.toString(dArr));
    }
}
