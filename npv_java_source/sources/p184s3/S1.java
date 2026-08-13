package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class S1 extends p184s3.J {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p104k3.AbstractC6888e f54142C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object f54143D;

    public S1(p104k3.AbstractC6888e abstractC6888e, java.lang.Object obj) {
        this.f54142C = abstractC6888e;
        this.f54143D = obj;
    }

    @Override // p184s3.K
    public final void c() {
        java.lang.Object obj;
        p104k3.AbstractC6888e abstractC6888e = this.f54142C;
        if (abstractC6888e == null || (obj = this.f54143D) == null) {
            return;
        }
        abstractC6888e.b(obj);
    }

    @Override // p184s3.K
    public final void x0(p184s3.W0 w6) {
        p104k3.AbstractC6888e abstractC6888e = this.f54142C;
        if (abstractC6888e != null) {
            abstractC6888e.a(w6.f());
        }
    }
}
