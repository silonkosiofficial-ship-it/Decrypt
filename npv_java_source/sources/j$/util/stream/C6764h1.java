package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6764h1 extends j$.util.stream.C6759g1 implements j$.util.stream.A0 {
    @Override // j$.util.stream.A0, j$.util.stream.C0
    public final j$.util.stream.G0 a() {
        int i6 = this.f48475b;
        int[] iArr = this.f48474a;
        if (i6 >= iArr.length) {
            return this;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("Current size %d is less than fixed size %d", java.lang.Integer.valueOf(this.f48475b), java.lang.Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.C0
    public final /* bridge */ /* synthetic */ j$.util.stream.K0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void accept(double d6) {
        j$.util.stream.AbstractC6845y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) {
        int i10 = this.f48475b;
        int[] iArr = this.f48474a;
        if (i10 >= iArr.length) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Accept exceeded fixed size of %d", java.lang.Integer.valueOf(iArr.length)));
        }
        this.f48475b = 1 + i10;
        iArr[i10] = i6;
    }

    @Override // j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        j$.util.stream.AbstractC6845y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        l((java.lang.Integer) obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void j() {
        int i6 = this.f48475b;
        int[] iArr = this.f48474a;
        if (i6 < iArr.length) {
            throw new java.lang.IllegalStateException(java.lang.String.format("End size %d is less than fixed size %d", java.lang.Integer.valueOf(this.f48475b), java.lang.Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        int[] iArr = this.f48474a;
        if (j6 != iArr.length) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Begin size %d is not equal to fixed size %d", java.lang.Long.valueOf(j6), java.lang.Integer.valueOf(iArr.length)));
        }
        this.f48475b = 0;
    }

    @Override // j$.util.stream.InterfaceC6800o2
    public final /* synthetic */ void l(java.lang.Integer num) {
        j$.util.stream.AbstractC6845y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.C6759g1
    public final java.lang.String toString() {
        int[] iArr = this.f48474a;
        return java.lang.String.format("IntFixedNodeBuilder[%d][%s]", java.lang.Integer.valueOf(iArr.length - this.f48475b), java.util.Arrays.toString(iArr));
    }
}
