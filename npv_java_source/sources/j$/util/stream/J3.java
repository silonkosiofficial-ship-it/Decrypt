package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class J3 extends j$.util.stream.AbstractC6766h3 {
    @Override // j$.util.stream.AbstractC6766h3
    final void d() {
        j$.util.stream.C6731a3 c6731a3 = new j$.util.stream.C6731a3();
        this.f48487h = c6731a3;
        j$.util.Objects.requireNonNull(c6731a3);
        this.f48484e = this.f48481b.S(new j$.util.stream.I3(c6731a3, 0));
        this.f48485f = new j$.util.stream.C6727a(5, this);
    }

    @Override // j$.util.stream.AbstractC6766h3
    final j$.util.stream.AbstractC6766h3 e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.J3(this.f48481b, spliterator, this.f48480a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        if (this.f48487h != null || this.f48488i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        j$.util.Objects.requireNonNull(consumer);
        c();
        j$.util.Objects.requireNonNull(consumer);
        j$.util.stream.I3 i6 = new j$.util.stream.I3(consumer, 1);
        this.f48481b.R(this.f48483d, i6);
        this.f48488i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        java.lang.Object obj;
        j$.util.Objects.requireNonNull(consumer);
        boolean zA = a();
        if (zA) {
            j$.util.stream.C6731a3 c6731a3 = (j$.util.stream.C6731a3) this.f48487h;
            long j6 = this.f48486g;
            if (c6731a3.f48427c != 0) {
                if (j6 >= c6731a3.count()) {
                    throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j6));
                }
                for (int i6 = 0; i6 <= c6731a3.f48427c; i6++) {
                    long j10 = c6731a3.f48428d[i6];
                    java.lang.Object[] objArr = c6731a3.f48407f[i6];
                    if (j6 < ((long) objArr.length) + j10) {
                        obj = objArr[(int) (j6 - j10)];
                    }
                }
                throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j6));
            }
            if (j6 >= c6731a3.f48426b) {
                throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j6));
            }
            obj = c6731a3.f48406e[(int) j6];
            consumer.o(obj);
        }
        return zA;
    }
}
