package p012b1;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Y0.i f24108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f24109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f24110c;

    private t(Y0.i iVar, java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str2, "debugName");
        this.f24108a = iVar;
        this.f24109b = str;
        this.f24110c = str2;
    }

    public /* synthetic */ t(Y0.i iVar, java.lang.String str, java.lang.String str2, p247y7.AbstractC7342k abstractC7342k) {
        this(iVar, str, str2);
    }

    public final p082i1.c a() {
        Y0.i iVar = this.f24108a;
        if (iVar != null) {
            return new p082i1.e(iVar.v());
        }
        java.lang.String str = this.f24109b;
        if (str != null) {
            return p082i1.h.f46655K.a(str);
        }
        p032d1.a.f44286a.b("CCL", "DimensionDescription: Null value & symbol for " + this.f24110c + ". Using WrapContent.");
        return p082i1.h.f46655K.a("wrap");
    }

    public final boolean b() {
        return this.f24108a == null && this.f24109b == null;
    }
}
