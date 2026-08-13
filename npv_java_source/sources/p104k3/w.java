package p104k3;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f49515a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p184s3.Y0 f49516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k3.w.a f49517c;

    public static abstract class a {
        public abstract void a();

        public void b(boolean z6) {
        }

        public abstract void c();

        public void d() {
        }

        public abstract void e();
    }

    public void a(k3.w.a aVar) {
        p184s3.O1 o6;
        synchronized (this.f49515a) {
            this.f49517c = aVar;
            p184s3.Y0 y6 = this.f49516b;
            if (y6 == null) {
                return;
            }
            if (aVar == null) {
                o6 = null;
            } else {
                try {
                    o6 = new p184s3.O1(aVar);
                } catch (android.os.RemoteException e6) {
                    p224w3.p.e("Unable to call setVideoLifecycleCallbacks on video controller.", e6);
                }
            }
            y6.b4(o6);
        }
    }

    public final p184s3.Y0 b() {
        p184s3.Y0 y6;
        synchronized (this.f49515a) {
            y6 = this.f49516b;
        }
        return y6;
    }

    public final void c(p184s3.Y0 y6) {
        synchronized (this.f49515a) {
            try {
                this.f49516b = y6;
                k3.w.a aVar = this.f49517c;
                if (aVar != null) {
                    a(aVar);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
