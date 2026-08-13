package B;

/* JADX INFO: renamed from: B.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0794e {

    /* JADX INFO: renamed from: B.e$a */
    public static final class a implements D.E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ B.D f370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f371b;

        a(B.D d6, boolean z6) {
            this.f370a = d6;
            this.f371b = z6;
        }

        @Override // D.E
        public int a() {
            return this.f370a.w().e() == p230x.s.Vertical ? Y0.t.f(this.f370a.w().a()) : Y0.t.g(this.f370a.w().a());
        }

        @Override // D.E
        public float b() {
            return androidx.compose.foundation.lazy.layout.f.b(this.f370a.r(), this.f370a.s());
        }

        @Override // D.E
        public int c() {
            return this.f370a.w().g() + this.f370a.w().b();
        }

        @Override // D.E
        public float d() {
            return androidx.compose.foundation.lazy.layout.f.a(this.f370a.r(), this.f370a.s(), this.f370a.c());
        }

        @Override // D.E
        public K0.b e() {
            return this.f371b ? new K0.b(-1, 1) : new K0.b(1, -1);
        }

        @Override // D.E
        public java.lang.Object f(int i6, p127m7.e eVar) {
            java.lang.Object objK = B.D.K(this.f370a, i6, 0, eVar, 2, null);
            return objK == p137n7.b.g() ? objK : p087i7.M.f46721a;
        }
    }

    public static final D.E a(B.D d6, boolean z6) {
        return new B.AbstractC0794e.a(d6, z6);
    }
}
