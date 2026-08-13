package p143o2;

/* JADX INFO: loaded from: classes.dex */
public abstract class r implements p143o2.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f52498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f52499c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f52500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.String f52501b;

        public a(boolean z6, java.lang.String str) {
            this.f52500a = z6;
            this.f52501b = str;
        }
    }

    public r(int i6, java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "identityHash");
        p247y7.AbstractC7350t.f(str2, "legacyIdentityHash");
        this.f52497a = i6;
        this.f52498b = str;
        this.f52499c = str2;
    }

    public abstract void a(p243y2.b bVar);

    public abstract void b(p243y2.b bVar);

    public final java.lang.String c() {
        return this.f52498b;
    }

    public final java.lang.String d() {
        return this.f52499c;
    }

    public final int e() {
        return this.f52497a;
    }

    public abstract void f(p243y2.b bVar);

    public abstract void g(p243y2.b bVar);

    public abstract void h(p243y2.b bVar);

    public abstract void i(p243y2.b bVar);

    public abstract o2.r.a j(p243y2.b bVar);
}
