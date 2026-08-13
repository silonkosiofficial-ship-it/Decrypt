package p011b0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f23995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f23996b;

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        p021c0.c cVar = p021c0.c.f24402a;
        this(cVar, cVar);
    }

    public a(java.lang.Object obj) {
        this(obj, p021c0.c.f24402a);
    }

    public a(java.lang.Object obj, java.lang.Object obj2) {
        this.f23995a = obj;
        this.f23996b = obj2;
    }

    public final boolean a() {
        return this.f23996b != p021c0.c.f24402a;
    }

    public final boolean b() {
        return this.f23995a != p021c0.c.f24402a;
    }

    public final java.lang.Object c() {
        return this.f23996b;
    }

    public final java.lang.Object d() {
        return this.f23995a;
    }

    public final p011b0.a e(java.lang.Object obj) {
        return new p011b0.a(this.f23995a, obj);
    }

    public final p011b0.a f(java.lang.Object obj) {
        return new p011b0.a(obj, this.f23996b);
    }
}
