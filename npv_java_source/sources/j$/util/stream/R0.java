package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
class R0 extends j$.util.stream.AbstractC6747e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final j$.util.stream.AbstractC6732b f48327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final java.util.function.LongFunction f48328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final java.util.function.BinaryOperator f48329j;

    R0(j$.util.stream.R0 r6, j$.util.Spliterator spliterator) {
        super(r6, spliterator);
        this.f48327h = r6.f48327h;
        this.f48328i = r6.f48328i;
        this.f48329j = r6.f48329j;
    }

    R0(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, java.util.function.LongFunction longFunction, java.util.function.BinaryOperator binaryOperator) {
        super(abstractC6732b, spliterator);
        this.f48327h = abstractC6732b;
        this.f48328i = longFunction;
        this.f48329j = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC6747e
    protected j$.util.stream.AbstractC6747e e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.R0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC6747e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final j$.util.stream.K0 a() {
        j$.util.stream.C0 c6 = (j$.util.stream.C0) this.f48328i.apply(this.f48327h.C(this.f48437b));
        this.f48327h.R(this.f48437b, c6);
        return c6.a();
    }

    @Override // j$.util.stream.AbstractC6747e, java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        j$.util.stream.AbstractC6747e abstractC6747e = this.f48439d;
        if (abstractC6747e != null) {
            f((j$.util.stream.K0) this.f48329j.apply((j$.util.stream.K0) ((j$.util.stream.R0) abstractC6747e).c(), (j$.util.stream.K0) ((j$.util.stream.R0) this.f48440e).c()));
        }
        super.onCompletion(countedCompleter);
    }
}
