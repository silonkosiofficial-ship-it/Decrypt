package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6809q1 extends j$.util.stream.C6804p1 implements j$.util.stream.B0 {
    @Override // j$.util.stream.B0, j$.util.stream.C0
    public final j$.util.stream.I0 a() {
        int i6 = this.f48531b;
        long[] jArr = this.f48530a;
        if (i6 >= jArr.length) {
            return this;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("Current size %d is less than fixed size %d", java.lang.Integer.valueOf(this.f48531b), java.lang.Integer.valueOf(jArr.length)));
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
    public final /* synthetic */ void accept(int i6) {
        j$.util.stream.AbstractC6845y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC6810q2, j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        int i6 = this.f48531b;
        long[] jArr = this.f48530a;
        if (i6 >= jArr.length) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Accept exceeded fixed size of %d", java.lang.Integer.valueOf(jArr.length)));
        }
        this.f48531b = 1 + i6;
        jArr[i6] = j6;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(java.lang.Object obj) {
        i((java.lang.Long) obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC6805p2
    public final /* synthetic */ void i(java.lang.Long l6) {
        j$.util.stream.AbstractC6845y0.i(this, l6);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void j() {
        int i6 = this.f48531b;
        long[] jArr = this.f48530a;
        if (i6 < jArr.length) {
            throw new java.lang.IllegalStateException(java.lang.String.format("End size %d is less than fixed size %d", java.lang.Integer.valueOf(this.f48531b), java.lang.Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        long[] jArr = this.f48530a;
        if (j6 != jArr.length) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Begin size %d is not equal to fixed size %d", java.lang.Long.valueOf(j6), java.lang.Integer.valueOf(jArr.length)));
        }
        this.f48531b = 0;
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.C6804p1
    public final java.lang.String toString() {
        long[] jArr = this.f48530a;
        return java.lang.String.format("LongFixedNodeBuilder[%d][%s]", java.lang.Integer.valueOf(jArr.length - this.f48531b), java.util.Arrays.toString(jArr));
    }
}
