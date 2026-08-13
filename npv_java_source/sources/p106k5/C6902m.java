package p106k5;

/* JADX INFO: renamed from: k5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6902m implements T5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p106k5.C f49638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p106k5.C6901l f49639b;

    public C6902m(p106k5.C c6, p166q5.g gVar) {
        this.f49638a = c6;
        this.f49639b = new p106k5.C6901l(gVar);
    }

    @Override // T5.b
    public boolean a() {
        return this.f49638a.d();
    }

    @Override // T5.b
    public T5.b.a b() {
        return T5.b.a.CRASHLYTICS;
    }

    @Override // T5.b
    public void c(T5.b.C0278b c0278b) {
        p076h5.g.f().b("App Quality Sessions session changed: " + c0278b);
        this.f49639b.h(c0278b.a());
    }

    public java.lang.String d(java.lang.String str) {
        return this.f49639b.c(str);
    }

    public void e(java.lang.String str) {
        this.f49639b.i(str);
    }
}
