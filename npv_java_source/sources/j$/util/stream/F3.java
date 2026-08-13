package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class F3 extends j$.util.stream.H3 implements j$.util.Spliterator, java.util.function.Consumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    java.lang.Object f48235f;

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.f48235f = obj;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.H3
    protected final j$.util.Spliterator c(j$.util.Spliterator spliterator) {
        return new j$.util.stream.F3(spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        j$.util.stream.C6791m3 c6791m3 = null;
        while (true) {
            j$.util.stream.G3 g3D = d();
            if (g3D == j$.util.stream.G3.NO_MORE) {
                return;
            }
            j$.util.stream.G3 g6 = j$.util.stream.G3.MAYBE_MORE;
            j$.util.Spliterator spliterator = this.f48250a;
            if (g3D != g6) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            int i6 = this.f48252c;
            if (c6791m3 == null) {
                c6791m3 = new j$.util.stream.C6791m3(i6);
            } else {
                c6791m3.f48514a = 0;
            }
            long j6 = 0;
            while (spliterator.tryAdvance(c6791m3)) {
                j6++;
                if (j6 >= i6) {
                    break;
                }
            }
            if (j6 == 0) {
                return;
            }
            long jB = b(j6);
            for (int i10 = 0; i10 < jB; i10++) {
                consumer.accept(c6791m3.f48511b[i10]);
            }
        }
    }

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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        while (d() != j$.util.stream.G3.NO_MORE && this.f48250a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.accept(this.f48235f);
                this.f48235f = null;
                return true;
            }
        }
        return false;
    }
}
