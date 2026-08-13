package K0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.a f5965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.a f5966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5967c;

    public i(p237x7.a aVar, p237x7.a aVar2, boolean z6) {
        this.f5965a = aVar;
        this.f5966b = aVar2;
        this.f5967c = z6;
    }

    public /* synthetic */ i(p237x7.a aVar, p237x7.a aVar2, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(aVar, aVar2, (i6 & 4) != 0 ? false : z6);
    }

    public final p237x7.a a() {
        return this.f5966b;
    }

    public final boolean b() {
        return this.f5967c;
    }

    public final p237x7.a c() {
        return this.f5965a;
    }

    public java.lang.String toString() {
        return "ScrollAxisRange(value=" + ((java.lang.Number) this.f5965a.b()).floatValue() + ", maxValue=" + ((java.lang.Number) this.f5966b.b()).floatValue() + ", reverseScrolling=" + this.f5967c + ')';
    }
}
