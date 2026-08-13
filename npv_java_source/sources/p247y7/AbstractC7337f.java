package p247y7;

/* JADX INFO: renamed from: y7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7337f implements F7.b, java.io.Serializable {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final java.lang.Object f57285I = p247y7.AbstractC7337f.a.f57292C;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private transient F7.b f57286C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected final java.lang.Object f57287D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Class f57288E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f57289F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.lang.String f57290G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f57291H;

    /* JADX INFO: renamed from: y7.f$a */
    private static class a implements java.io.Serializable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private static final p247y7.AbstractC7337f.a f57292C = new p247y7.AbstractC7337f.a();

        private a() {
        }
    }

    protected AbstractC7337f(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, boolean z6) {
        this.f57287D = obj;
        this.f57288E = cls;
        this.f57289F = str;
        this.f57290G = str2;
        this.f57291H = z6;
    }

    public F7.b a() {
        F7.b bVar = this.f57286C;
        if (bVar != null) {
            return bVar;
        }
        F7.b bVarE = e();
        this.f57286C = bVarE;
        return bVarE;
    }

    protected abstract F7.b e();

    public java.lang.Object f() {
        return this.f57287D;
    }

    @Override // F7.b
    public java.util.List g() {
        return m().g();
    }

    @Override // F7.b
    public java.lang.String getName() {
        return this.f57289F;
    }

    public F7.e k() {
        java.lang.Class cls = this.f57288E;
        if (cls == null) {
            return null;
        }
        return this.f57291H ? p247y7.P.c(cls) : p247y7.P.b(cls);
    }

    protected F7.b m() {
        F7.b bVarA = a();
        if (bVarA != this) {
            return bVarA;
        }
        throw new p227w7.b();
    }

    public java.lang.String n() {
        return this.f57290G;
    }
}
