package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6816s implements java.util.function.Supplier, java.util.function.Predicate, java.util.function.IntFunction, java.util.function.ToIntFunction, java.util.function.IntBinaryOperator, java.util.function.ObjIntConsumer, java.util.function.BiConsumer, java.util.function.ObjLongConsumer, java.util.function.LongBinaryOperator, java.util.function.ToLongFunction, java.util.function.LongFunction, java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48544a;

    public /* synthetic */ C6816s(int i6) {
        this.f48544a = i6;
    }

    @Override // java.util.function.Consumer
    public void accept(java.lang.Object obj) {
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(java.lang.Object obj, int i6) {
        switch (this.f48544a) {
            case 10:
                ((j$.util.C6855w) obj).accept(i6);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + ((long) i6);
                break;
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(java.lang.Object obj, long j6) {
        switch (this.f48544a) {
            case 17:
                ((j$.util.C6857y) obj).accept(j6);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j6;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f48544a) {
            case 11:
                ((j$.util.C6855w) obj).b((j$.util.C6855w) obj2);
                break;
            case 16:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 20:
                ((j$.util.C6857y) obj).b((j$.util.C6857y) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    public /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.f48544a) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        switch (this.f48544a) {
            case 11:
                break;
            case 16:
                break;
            case 20:
                break;
        }
        return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public java.lang.Object apply(int i6) {
        switch (this.f48544a) {
            case 5:
                return new java.lang.Object[i6];
            case 6:
                return new java.lang.Integer[i6];
            case 8:
                return java.lang.Integer.valueOf(i6);
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                return new java.lang.Long[i6];
            default:
                return new java.lang.Object[i6];
        }
    }

    @Override // java.util.function.LongFunction
    public java.lang.Object apply(long j6) {
        return java.lang.Long.valueOf(j6);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i6, int i10) {
        switch (this.f48544a) {
            case 9:
                return java.lang.Math.min(i6, i10);
            case 10:
            case 11:
            default:
                return java.lang.Math.max(i6, i10);
            case 12:
                return i6 + i10;
        }
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(java.lang.Object obj) {
        return ((java.lang.Integer) obj).intValue();
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j6, long j10) {
        switch (this.f48544a) {
            case 18:
                return java.lang.Math.min(j6, j10);
            case 26:
                return java.lang.Math.max(j6, j10);
            default:
                return j6 + j10;
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(java.lang.Object obj) {
        return ((java.lang.Long) obj).longValue();
    }

    @Override // java.util.function.Supplier
    public java.lang.Object get() {
        switch (this.f48544a) {
            case 0:
                return new double[3];
            case 14:
                return new long[2];
            default:
                return new long[2];
        }
    }

    public /* synthetic */ java.util.function.Predicate negate() {
        switch (this.f48544a) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return j$.util.function.Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        switch (this.f48544a) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        switch (this.f48544a) {
            case 1:
                return ((j$.util.C6858z) obj).c();
            case 2:
                return ((j$.util.A) obj).c();
            case 3:
                return ((j$.util.B) obj).c();
            default:
                return ((j$.util.Optional) obj).b();
        }
    }
}
