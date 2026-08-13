package T;

/* JADX INFO: renamed from: T.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1647f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Locale f12814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f12815b = new java.util.LinkedHashMap();

    public AbstractC1647f(java.util.Locale locale) {
        this.f12814a = locale;
    }

    public abstract java.lang.String a(long j6, java.lang.String str, java.util.Locale locale);

    public abstract T.C1646e b(long j6);

    public abstract T.k c(java.util.Locale locale);

    public abstract int d();

    public final java.util.Map e() {
        return this.f12815b;
    }

    public abstract T.j f(int i6, int i10);

    public abstract T.j g(long j6);

    public abstract T.j h(T.C1646e c1646e);

    public abstract T.C1646e i();

    public abstract java.util.List j();

    public abstract T.C1646e k(java.lang.String str, java.lang.String str2);

    public abstract T.j l(T.j jVar, int i6);
}
