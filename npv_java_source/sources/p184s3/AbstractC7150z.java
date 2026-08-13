package p184s3;

/* JADX INFO: renamed from: s3.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7150z extends p104k3.AbstractC6887d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f54353C = new java.lang.Object();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p104k3.AbstractC6887d f54354D;

    @Override // p104k3.AbstractC6887d
    public final void e() {
        synchronized (this.f54353C) {
            try {
                p104k3.AbstractC6887d abstractC6887d = this.f54354D;
                if (abstractC6887d != null) {
                    abstractC6887d.e();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p104k3.AbstractC6887d, p184s3.InterfaceC7076a
    public final void e0() {
        synchronized (this.f54353C) {
            try {
                p104k3.AbstractC6887d abstractC6887d = this.f54354D;
                if (abstractC6887d != null) {
                    abstractC6887d.e0();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p104k3.AbstractC6887d
    public void g(p104k3.m mVar) {
        synchronized (this.f54353C) {
            try {
                p104k3.AbstractC6887d abstractC6887d = this.f54354D;
                if (abstractC6887d != null) {
                    abstractC6887d.g(mVar);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p104k3.AbstractC6887d
    public final void i() {
        synchronized (this.f54353C) {
            try {
                p104k3.AbstractC6887d abstractC6887d = this.f54354D;
                if (abstractC6887d != null) {
                    abstractC6887d.i();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p104k3.AbstractC6887d
    public void k() {
        synchronized (this.f54353C) {
            try {
                p104k3.AbstractC6887d abstractC6887d = this.f54354D;
                if (abstractC6887d != null) {
                    abstractC6887d.k();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p104k3.AbstractC6887d
    public final void p() {
        synchronized (this.f54353C) {
            try {
                p104k3.AbstractC6887d abstractC6887d = this.f54354D;
                if (abstractC6887d != null) {
                    abstractC6887d.p();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void r(p104k3.AbstractC6887d abstractC6887d) {
        synchronized (this.f54353C) {
            this.f54354D = abstractC6887d;
        }
    }
}
