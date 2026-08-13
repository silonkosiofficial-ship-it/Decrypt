package p171r0;

/* JADX INFO: renamed from: r0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7051a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p171r0.C7053c f53521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p171r0.C7053c f53522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p170r.L f53523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p170r.L f53524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f53525e;

    public final boolean i(p171r0.C7053c c7053c) {
        if (!this.f53525e) {
            p141o0.H1.a("Only add dependencies during a tracking");
        }
        p170r.L l6 = this.f53523c;
        if (l6 != null) {
            p247y7.AbstractC7350t.c(l6);
            l6.h(c7053c);
        } else if (this.f53521a != null) {
            p170r.L lA = p170r.X.a();
            p171r0.C7053c c7053c2 = this.f53521a;
            p247y7.AbstractC7350t.c(c7053c2);
            lA.h(c7053c2);
            lA.h(c7053c);
            this.f53523c = lA;
            this.f53521a = null;
        } else {
            this.f53521a = c7053c;
        }
        p170r.L l10 = this.f53524d;
        if (l10 != null) {
            p247y7.AbstractC7350t.c(l10);
            return !l10.x(c7053c);
        }
        if (this.f53522b != c7053c) {
            return true;
        }
        this.f53522b = null;
        return false;
    }
}
