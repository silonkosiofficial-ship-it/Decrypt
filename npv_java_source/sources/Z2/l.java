package Z2;

/* JADX INFO: loaded from: classes.dex */
public final class l implements p004a3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p077h7.a f16698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p077h7.a f16699b;

    public l(p077h7.a aVar, p077h7.a aVar2) {
        this.f16698a = aVar;
        this.f16699b = aVar2;
    }

    public static Z2.l a(p077h7.a aVar, p077h7.a aVar2) {
        return new Z2.l(aVar, aVar2);
    }

    public static Z2.k c(android.content.Context context, java.lang.Object obj) {
        return new Z2.k(context, (Z2.i) obj);
    }

    @Override // p077h7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Z2.k get() {
        return c((android.content.Context) this.f16698a.get(), this.f16699b.get());
    }
}
