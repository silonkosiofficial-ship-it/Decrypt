package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class j extends j$.util.concurrent.p implements j$.util.Spliterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f48079j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(j$.util.concurrent.l[] lVarArr, int i6, int i10, int i11, long j6, int i12) {
        super(lVarArr, i6, i10, i11);
        this.f48078i = i12;
        this.f48079j = j6;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f48078i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f48078i) {
            case 0:
                break;
        }
        return this.f48079j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.f48078i) {
            case 0:
                consumer.getClass();
                while (true) {
                    j$.util.concurrent.l lVarA = a();
                    if (lVarA != null) {
                        consumer.accept(lVarA.f48084b);
                    }
                    break;
                }
                break;
            default:
                consumer.getClass();
                while (true) {
                    j$.util.concurrent.l lVarA2 = a();
                    if (lVarA2 != null) {
                        consumer.accept(lVarA2.f48085c);
                    }
                    break;
                }
                break;
        }
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        switch (this.f48078i) {
            case 0:
                throw new java.lang.IllegalStateException();
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f48078i) {
            case 0:
                break;
        }
        return j$.util.Q.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        switch (this.f48078i) {
            case 0:
                break;
        }
        return j$.util.Q.e(this, i6);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        switch (this.f48078i) {
            case 0:
                consumer.getClass();
                j$.util.concurrent.l lVarA = a();
                if (lVarA == null) {
                    return false;
                }
                consumer.accept(lVarA.f48084b);
                return true;
            default:
                consumer.getClass();
                j$.util.concurrent.l lVarA2 = a();
                if (lVarA2 == null) {
                    return false;
                }
                consumer.accept(lVarA2.f48085c);
                return true;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        switch (this.f48078i) {
            case 0:
                int i6 = this.f48096f;
                int i10 = this.f48097g;
                int i11 = (i6 + i10) >>> 1;
                if (i11 <= i6) {
                    return null;
                }
                j$.util.concurrent.l[] lVarArr = this.f48091a;
                this.f48097g = i11;
                long j6 = this.f48079j >>> 1;
                this.f48079j = j6;
                return new j$.util.concurrent.j(lVarArr, this.f48098h, i11, i10, j6, 0);
            default:
                int i12 = this.f48096f;
                int i13 = this.f48097g;
                int i14 = (i12 + i13) >>> 1;
                if (i14 <= i12) {
                    return null;
                }
                j$.util.concurrent.l[] lVarArr2 = this.f48091a;
                this.f48097g = i14;
                long j10 = this.f48079j >>> 1;
                this.f48079j = j10;
                return new j$.util.concurrent.j(lVarArr2, this.f48098h, i14, i13, j10, 1);
        }
    }
}
