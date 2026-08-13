package U0;

/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.G1 f14445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U0.s f14446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f14447c;

    public s(V.G1 g6, U0.s sVar) {
        this.f14445a = g6;
        this.f14446b = sVar;
        this.f14447c = g6.getValue();
    }

    public final android.graphics.Typeface a() {
        java.lang.Object obj = this.f14447c;
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (android.graphics.Typeface) obj;
    }

    public final boolean b() {
        U0.s sVar;
        return this.f14445a.getValue() != this.f14447c || ((sVar = this.f14446b) != null && sVar.b());
    }
}
