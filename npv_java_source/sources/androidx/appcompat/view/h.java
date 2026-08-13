package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.view.animation.Interpolator f17716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.core.view.InterfaceC2005h0 f17717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17718e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f17715b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.core.view.AbstractC2007i0 f17719f = new androidx.appcompat.view.h.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.ArrayList f17714a = new java.util.ArrayList();

    class a extends androidx.core.view.AbstractC2007i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17720a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17721b = 0;

        a() {
        }

        @Override // androidx.core.view.InterfaceC2005h0
        public void b(android.view.View view) {
            int i6 = this.f17721b + 1;
            this.f17721b = i6;
            if (i6 == androidx.appcompat.view.h.this.f17714a.size()) {
                androidx.core.view.InterfaceC2005h0 interfaceC2005h0 = androidx.appcompat.view.h.this.f17717d;
                if (interfaceC2005h0 != null) {
                    interfaceC2005h0.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.AbstractC2007i0, androidx.core.view.InterfaceC2005h0
        public void c(android.view.View view) {
            if (this.f17720a) {
                return;
            }
            this.f17720a = true;
            androidx.core.view.InterfaceC2005h0 interfaceC2005h0 = androidx.appcompat.view.h.this.f17717d;
            if (interfaceC2005h0 != null) {
                interfaceC2005h0.c(null);
            }
        }

        void d() {
            this.f17721b = 0;
            this.f17720a = false;
            androidx.appcompat.view.h.this.b();
        }
    }

    public void a() {
        if (this.f17718e) {
            java.util.Iterator it = this.f17714a.iterator();
            while (it.hasNext()) {
                ((androidx.core.view.C2003g0) it.next()).c();
            }
            this.f17718e = false;
        }
    }

    void b() {
        this.f17718e = false;
    }

    public androidx.appcompat.view.h c(androidx.core.view.C2003g0 c2003g0) {
        if (!this.f17718e) {
            this.f17714a.add(c2003g0);
        }
        return this;
    }

    public androidx.appcompat.view.h d(androidx.core.view.C2003g0 c2003g0, androidx.core.view.C2003g0 c2003g1) {
        this.f17714a.add(c2003g0);
        c2003g1.j(c2003g0.d());
        this.f17714a.add(c2003g1);
        return this;
    }

    public androidx.appcompat.view.h e(long j6) {
        if (!this.f17718e) {
            this.f17715b = j6;
        }
        return this;
    }

    public androidx.appcompat.view.h f(android.view.animation.Interpolator interpolator) {
        if (!this.f17718e) {
            this.f17716c = interpolator;
        }
        return this;
    }

    public androidx.appcompat.view.h g(androidx.core.view.InterfaceC2005h0 interfaceC2005h0) {
        if (!this.f17718e) {
            this.f17717d = interfaceC2005h0;
        }
        return this;
    }

    public void h() {
        if (this.f17718e) {
            return;
        }
        for (androidx.core.view.C2003g0 c2003g0 : this.f17714a) {
            long j6 = this.f17715b;
            if (j6 >= 0) {
                c2003g0.f(j6);
            }
            android.view.animation.Interpolator interpolator = this.f17716c;
            if (interpolator != null) {
                c2003g0.g(interpolator);
            }
            if (this.f17717d != null) {
                c2003g0.h(this.f17719f);
            }
            c2003g0.l();
        }
        this.f17718e = true;
    }
}
