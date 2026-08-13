package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6754f1 extends j$.util.stream.N0 implements j$.util.stream.C0 {
    @Override // j$.util.stream.C0
    public final j$.util.stream.K0 a() {
        int i6 = this.f48295b;
        java.lang.Object[] objArr = this.f48294a;
        if (i6 >= objArr.length) {
            return this;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("Current size %d is less than fixed size %d", java.lang.Integer.valueOf(this.f48295b), java.lang.Integer.valueOf(objArr.length)));
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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(java.lang.Object obj) {
        int i6 = this.f48295b;
        java.lang.Object[] objArr = this.f48294a;
        if (i6 >= objArr.length) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Accept exceeded fixed size of %d", java.lang.Integer.valueOf(objArr.length)));
        }
        this.f48295b = 1 + i6;
        objArr[i6] = obj;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void j() {
        int i6 = this.f48295b;
        java.lang.Object[] objArr = this.f48294a;
        if (i6 < objArr.length) {
            throw new java.lang.IllegalStateException(java.lang.String.format("End size %d is less than fixed size %d", java.lang.Integer.valueOf(this.f48295b), java.lang.Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        java.lang.Object[] objArr = this.f48294a;
        if (j6 != objArr.length) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Begin size %d is not equal to fixed size %d", java.lang.Long.valueOf(j6), java.lang.Integer.valueOf(objArr.length)));
        }
        this.f48295b = 0;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.N0
    public final java.lang.String toString() {
        java.lang.Object[] objArr = this.f48294a;
        return java.lang.String.format("FixedNodeBuilder[%d][%s]", java.lang.Integer.valueOf(objArr.length - this.f48295b), java.util.Arrays.toString(objArr));
    }
}
