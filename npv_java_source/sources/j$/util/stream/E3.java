package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class E3 extends j$.util.stream.H3 implements j$.util.d0 {
    protected abstract void e(java.lang.Object obj);

    @Override // j$.util.d0
    public final void forEachRemaining(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj);
        j$.util.stream.AbstractC6786l3 abstractC6786l3G = null;
        while (true) {
            j$.util.stream.G3 g3D = d();
            if (g3D == j$.util.stream.G3.NO_MORE) {
                return;
            }
            j$.util.stream.G3 g6 = j$.util.stream.G3.MAYBE_MORE;
            j$.util.Spliterator spliterator = this.f48250a;
            if (g3D != g6) {
                ((j$.util.d0) spliterator).forEachRemaining(obj);
                return;
            }
            int i6 = this.f48252c;
            if (abstractC6786l3G == null) {
                abstractC6786l3G = g(i6);
            } else {
                abstractC6786l3G.f48505b = 0;
            }
            long j6 = 0;
            while (((j$.util.d0) spliterator).tryAdvance(abstractC6786l3G)) {
                j6++;
                if (j6 >= i6) {
                    break;
                }
            }
            if (j6 == 0) {
                return;
            } else {
                abstractC6786l3G.b(obj, b(j6));
            }
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

    protected abstract j$.util.stream.AbstractC6786l3 g(int i6);

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        throw new java.lang.IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.Q.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return j$.util.Q.e(this, i6);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj);
        while (d() != j$.util.stream.G3.NO_MORE && ((j$.util.d0) this.f48250a).tryAdvance(this)) {
            if (b(1L) == 1) {
                e(obj);
                return true;
            }
        }
        return false;
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
