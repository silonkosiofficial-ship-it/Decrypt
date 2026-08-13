package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6789m1 extends j$.util.stream.AbstractC6799o1 implements j$.util.d0 {
    @Override // j$.util.d0
    public final void forEachRemaining(java.lang.Object obj) {
        if (this.f48517a == null) {
            return;
        }
        if (this.f48520d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        j$.util.Spliterator spliterator = this.f48519c;
        if (spliterator != null) {
            ((j$.util.d0) spliterator).forEachRemaining(obj);
            return;
        }
        java.util.ArrayDeque arrayDequeB = b();
        while (true) {
            j$.util.stream.J0 j6 = (j$.util.stream.J0) j$.util.stream.AbstractC6799o1.a(arrayDequeB);
            if (j6 == null) {
                this.f48517a = null;
                return;
            }
            j6.e(obj);
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        forEachRemaining((java.lang.Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        forEachRemaining((java.lang.Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        forEachRemaining((java.lang.Object) longConsumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(java.lang.Object obj) {
        j$.util.stream.J0 j6;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.d0) this.f48520d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.f48519c == null && (j6 = (j$.util.stream.J0) j$.util.stream.AbstractC6799o1.a(this.f48521e)) != null) {
                j$.util.d0 d0VarSpliterator = j6.spliterator();
                this.f48520d = d0VarSpliterator;
                return d0VarSpliterator.tryAdvance(obj);
            }
            this.f48517a = null;
        }
        return zTryAdvance;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        return tryAdvance((java.lang.Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        return tryAdvance((java.lang.Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        return tryAdvance((java.lang.Object) longConsumer);
    }
}
