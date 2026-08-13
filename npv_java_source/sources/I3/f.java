package I3;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected java.lang.Boolean f5017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected java.lang.String f5018b;

    public f() {
        this.f5017a = java.lang.Boolean.FALSE;
    }

    public f(I3.g gVar) {
        this.f5017a = java.lang.Boolean.FALSE;
        I3.g.b(gVar);
        this.f5017a = java.lang.Boolean.valueOf(gVar.f5021D);
        this.f5018b = gVar.f5022E;
    }

    public final I3.f a(java.lang.String str) {
        this.f5018b = str;
        return this;
    }
}
