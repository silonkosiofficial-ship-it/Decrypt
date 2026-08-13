package p064g3;

/* JADX INFO: loaded from: classes.dex */
public final class X implements p004a3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p077h7.a f45494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p077h7.a f45495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p077h7.a f45496c;

    public X(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3) {
        this.f45494a = aVar;
        this.f45495b = aVar2;
        this.f45496c = aVar3;
    }

    public static p064g3.X a(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3) {
        return new p064g3.X(aVar, aVar2, aVar3);
    }

    public static p064g3.W c(android.content.Context context, java.lang.String str, int i6) {
        return new p064g3.W(context, str, i6);
    }

    @Override // p077h7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p064g3.W get() {
        return c((android.content.Context) this.f45494a.get(), (java.lang.String) this.f45495b.get(), ((java.lang.Integer) this.f45496c.get()).intValue());
    }
}
