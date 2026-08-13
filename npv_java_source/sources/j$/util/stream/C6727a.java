package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6727a implements java.util.function.Supplier, java.util.function.Consumer, java.util.function.BooleanSupplier, java.util.function.DoubleFunction, java.util.function.Function, java.util.function.LongFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f48404b;

    public /* synthetic */ C6727a(int i6) {
        this.f48403a = i6;
    }

    public /* synthetic */ C6727a(int i6, java.lang.Object obj) {
        this.f48403a = i6;
        this.f48404b = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void o(java.lang.Object obj) {
        switch (this.f48403a) {
            case 1:
                ((j$.util.stream.InterfaceC6810q2) this.f48404b).o(obj);
                break;
            default:
                ((java.util.List) this.f48404b).add(obj);
                break;
        }
    }

    public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.f48403a) {
            case 1:
                break;
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public java.lang.Object apply(double d6) {
        java.lang.Object objApply = ((java.util.function.DoubleFunction) this.f48404b).apply(d6);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.F) {
            return j$.util.stream.E.w((j$.util.stream.F) objApply);
        }
        if (objApply instanceof java.util.stream.DoubleStream) {
            return j$.util.stream.D.w((java.util.stream.DoubleStream) objApply);
        }
        j$.util.C6713e.a("java.util.stream.DoubleStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public java.lang.Object apply(long j6) {
        java.lang.Object objApply = ((java.util.function.LongFunction) this.f48404b).apply(j6);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.InterfaceC6793n0) {
            return j$.util.stream.C6788m0.w((j$.util.stream.InterfaceC6793n0) objApply);
        }
        if (objApply instanceof java.util.stream.LongStream) {
            return j$.util.stream.C6783l0.w((java.util.stream.LongStream) objApply);
        }
        j$.util.C6713e.a("java.util.stream.LongStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.Function
    public java.lang.Object apply(java.lang.Object obj) {
        java.lang.Object objApply = ((java.util.function.Function) this.f48404b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.Stream) {
            return j$.util.stream.Stream.Wrapper.convert((j$.util.stream.Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return j$.util.stream.C6736b3.w((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof j$.util.stream.IntStream) {
            return j$.util.stream.IntStream.Wrapper.convert((j$.util.stream.IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return j$.util.stream.IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof j$.util.stream.F) {
            return j$.util.stream.E.w((j$.util.stream.F) objApply);
        }
        if (objApply instanceof java.util.stream.DoubleStream) {
            return j$.util.stream.D.w((java.util.stream.DoubleStream) objApply);
        }
        if (objApply instanceof j$.util.stream.InterfaceC6793n0) {
            return j$.util.stream.C6788m0.w((j$.util.stream.InterfaceC6793n0) objApply);
        }
        if (objApply instanceof java.util.stream.LongStream) {
            return j$.util.stream.C6783l0.w((java.util.stream.LongStream) objApply);
        }
        j$.util.C6713e.a("java.util.stream.*Stream", objApply.getClass());
        throw null;
    }

    public /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public java.lang.Object get() {
        switch (this.f48403a) {
            case 0:
                return ((j$.util.stream.AbstractC6732b) this.f48404b).I();
            default:
                return (j$.util.Spliterator) this.f48404b;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f48403a) {
            case 2:
                j$.util.stream.C6811q3 c6811q3 = (j$.util.stream.C6811q3) this.f48404b;
                return c6811q3.f48483d.tryAdvance(c6811q3.f48484e);
            case 3:
                j$.util.stream.C6820s3 c6820s3 = (j$.util.stream.C6820s3) this.f48404b;
                return c6820s3.f48483d.tryAdvance(c6820s3.f48484e);
            case 4:
                j$.util.stream.C6830u3 c6830u3 = (j$.util.stream.C6830u3) this.f48404b;
                return c6830u3.f48483d.tryAdvance(c6830u3.f48484e);
            default:
                j$.util.stream.J3 j6 = (j$.util.stream.J3) this.f48404b;
                return j6.f48483d.tryAdvance(j6.f48484e);
        }
    }
}
