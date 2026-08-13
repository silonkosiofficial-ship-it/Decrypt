package p064g3;

/* JADX INFO: renamed from: g3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6603h implements p004a3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p077h7.a f45512a;

    public C6603h(p077h7.a aVar) {
        this.f45512a = aVar;
    }

    public static p064g3.C6603h a(p077h7.a aVar) {
        return new p064g3.C6603h(aVar);
    }

    public static java.lang.String c(android.content.Context context) {
        return (java.lang.String) p004a3.d.d(p064g3.AbstractC6601f.b(context));
    }

    @Override // p077h7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.String get() {
        return c((android.content.Context) this.f45512a.get());
    }
}
