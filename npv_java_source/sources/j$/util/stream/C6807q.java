package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6807q implements java.util.function.BiConsumer, java.util.function.ObjDoubleConsumer, java.util.function.Supplier, java.util.function.LongFunction, java.util.function.BinaryOperator, java.util.function.IntFunction, java.util.function.DoubleBinaryOperator, java.util.function.DoubleFunction, java.util.function.ToDoubleFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48534a;

    public /* synthetic */ C6807q(int i6) {
        this.f48534a = i6;
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(java.lang.Object obj, double d6) {
        switch (this.f48534a) {
            case 1:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                j$.util.stream.AbstractC6782l.a(dArr, d6);
                dArr[3] = dArr[3] + d6;
                break;
            case 2:
            default:
                ((j$.util.C6854v) obj).accept(d6);
                break;
            case 3:
                double[] dArr2 = (double[]) obj;
                j$.util.stream.AbstractC6782l.a(dArr2, d6);
                dArr2[2] = dArr2[2] + d6;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f48534a) {
            case 0:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                j$.util.stream.AbstractC6782l.a(dArr, dArr2[0]);
                j$.util.stream.AbstractC6782l.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 2:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                j$.util.stream.AbstractC6782l.a(dArr3, dArr4[0]);
                j$.util.stream.AbstractC6782l.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 20:
                ((java.util.LinkedHashSet) obj).add(obj2);
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                ((java.util.LinkedHashSet) obj).addAll((java.util.LinkedHashSet) obj2);
                break;
            default:
                ((j$.util.C6854v) obj).b((j$.util.C6854v) obj2);
                break;
        }
    }

    public /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        switch (this.f48534a) {
            case 0:
                break;
            case 2:
                break;
            case 20:
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                break;
        }
        return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        switch (this.f48534a) {
            case 9:
                break;
            case 11:
                break;
            case 13:
                break;
        }
        return j$.util.function.BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public java.lang.Object apply(double d6) {
        return java.lang.Double.valueOf(d6);
    }

    @Override // java.util.function.IntFunction
    public java.lang.Object apply(int i6) {
        switch (this.f48534a) {
            case 15:
                return new java.lang.Object[i6];
            default:
                return new java.lang.Double[i6];
        }
    }

    @Override // java.util.function.LongFunction
    public java.lang.Object apply(long j6) {
        switch (this.f48534a) {
            case 8:
                return j$.util.stream.AbstractC6845y0.J(j6);
            case 9:
            default:
                return j$.util.stream.AbstractC6845y0.U(j6);
            case 10:
                return j$.util.stream.AbstractC6845y0.S(j6);
        }
    }

    @Override // java.util.function.BiFunction
    public java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f48534a) {
            case 9:
                return new j$.util.stream.S0((j$.util.stream.E0) obj, (j$.util.stream.E0) obj2);
            case 10:
            case 12:
            default:
                return new j$.util.stream.W0((j$.util.stream.K0) obj, (j$.util.stream.K0) obj2);
            case 11:
                return new j$.util.stream.T0((j$.util.stream.G0) obj, (j$.util.stream.G0) obj2);
            case 13:
                return new j$.util.stream.U0((j$.util.stream.I0) obj, (j$.util.stream.I0) obj2);
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d6, double d10) {
        switch (this.f48534a) {
            case 22:
                return java.lang.Math.min(d6, d10);
            default:
                return java.lang.Math.max(d6, d10);
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(java.lang.Object obj) {
        return ((java.lang.Double) obj).doubleValue();
    }

    @Override // java.util.function.Supplier
    public java.lang.Object get() {
        switch (this.f48534a) {
            case 4:
                return new j$.util.stream.H();
            case 5:
                return new j$.util.stream.I();
            case 6:
                return new j$.util.stream.J();
            case 7:
                return new j$.util.stream.K();
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                return new double[4];
            case 16:
                return new j$.util.C6854v();
            case 17:
                return new j$.util.C6855w();
            case 18:
                return new j$.util.C6857y();
            case 19:
                return new java.util.LinkedHashSet();
        }
    }
}
