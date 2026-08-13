package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D.P f19389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f19390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D.M f19391c = new D.M();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.compose.foundation.lazy.layout.h f19392d;

    private final class a implements D.K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f19393a = new java.util.ArrayList();

        public a() {
        }

        @Override // D.K
        public void a(int i6) {
            c(i6, androidx.compose.foundation.lazy.layout.e.f19395a);
        }

        public final java.util.List b() {
            return this.f19393a;
        }

        public void c(int i6, long j6) {
            androidx.compose.foundation.lazy.layout.h hVarC = androidx.compose.foundation.lazy.layout.d.this.c();
            if (hVarC == null) {
                return;
            }
            this.f19393a.add(hVarC.c(i6, j6, androidx.compose.foundation.lazy.layout.d.this.f19391c));
        }
    }

    public interface b {
        void a();

        void cancel();
    }

    public d(D.P p6, p237x7.l lVar) {
        this.f19389a = p6;
        this.f19390b = lVar;
    }

    public final java.util.List b() {
        p237x7.l lVar = this.f19390b;
        if (lVar == null) {
            return p097j7.AbstractC6879v.m();
        }
        androidx.compose.foundation.lazy.layout.d.a aVar = new androidx.compose.foundation.lazy.layout.d.a();
        lVar.l(aVar);
        return aVar.b();
    }

    public final androidx.compose.foundation.lazy.layout.h c() {
        return this.f19392d;
    }

    public final D.P d() {
        return this.f19389a;
    }

    public final androidx.compose.foundation.lazy.layout.d.b e(int i6, long j6) {
        androidx.compose.foundation.lazy.layout.d.b bVarD;
        androidx.compose.foundation.lazy.layout.h hVar = this.f19392d;
        return (hVar == null || (bVarD = hVar.d(i6, j6, this.f19391c)) == null) ? androidx.compose.foundation.lazy.layout.a.f19383a : bVarD;
    }

    public final void f(androidx.compose.foundation.lazy.layout.h hVar) {
        this.f19392d = hVar;
    }
}
