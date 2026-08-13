package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6794n1 extends j$.util.stream.AbstractC6799o1 {
    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        if (this.f48517a == null) {
            return;
        }
        if (this.f48520d != null) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        j$.util.Spliterator spliterator = this.f48519c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        java.util.ArrayDeque arrayDequeB = b();
        while (true) {
            j$.util.stream.K0 k0A = j$.util.stream.AbstractC6799o1.a(arrayDequeB);
            if (k0A == null) {
                this.f48517a = null;
                return;
            }
            k0A.forEach(consumer);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        j$.util.stream.K0 k0A;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.f48520d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.f48519c == null && (k0A = j$.util.stream.AbstractC6799o1.a(this.f48521e)) != null) {
                j$.util.Spliterator spliterator = k0A.spliterator();
                this.f48520d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f48517a = null;
        }
        return zTryAdvance;
    }
}
