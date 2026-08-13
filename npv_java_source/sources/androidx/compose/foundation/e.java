package androidx.compose.foundation;

/* JADX INFO: loaded from: classes.dex */
public class e extends androidx.compose.foundation.a {

    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f18960G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f18961H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ long f18962I;

        a(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f18960G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p230x.t tVar = (p230x.t) this.f18961H;
                long j6 = this.f18962I;
                if (androidx.compose.foundation.e.this.l2()) {
                    androidx.compose.foundation.e eVar = androidx.compose.foundation.e.this;
                    this.f18960G = 1;
                    if (eVar.n2(tVar, j6, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        public final java.lang.Object H(p230x.t tVar, long j6, p127m7.e eVar) {
            androidx.compose.foundation.e.a aVar = androidx.compose.foundation.e.this.new a(eVar);
            aVar.f18961H = tVar;
            aVar.f18962I = j6;
            return aVar.B(p087i7.M.f46721a);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return H((p230x.t) obj, ((p131n0.g) obj2).v(), (p127m7.e) obj3);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {
        b() {
            super(1);
        }

        public final void a(long j6) {
            if (androidx.compose.foundation.e.this.l2()) {
                androidx.compose.foundation.e.this.m2().b();
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((p131n0.g) obj).v());
            return p087i7.M.f46721a;
        }
    }

    private e(p250z.l lVar, p210v.I i6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar) {
        super(lVar, i6, z6, str, hVar, aVar, null);
    }

    public /* synthetic */ e(p250z.l lVar, p210v.I i6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar, p247y7.AbstractC7342k abstractC7342k) {
        this(lVar, i6, z6, str, hVar, aVar);
    }

    static /* synthetic */ java.lang.Object s2(androidx.compose.foundation.e eVar, p251z0.K k6, p127m7.e eVar2) {
        java.lang.Object objH = p230x.D.h(k6, eVar.new a(null), eVar.new b(), eVar2);
        return objH == p137n7.b.g() ? objH : p087i7.M.f46721a;
    }

    @Override // androidx.compose.foundation.a
    public java.lang.Object g2(p251z0.K k6, p127m7.e eVar) {
        return s2(this, k6, eVar);
    }

    public final void t2(p250z.l lVar, p210v.I i6, boolean z6, java.lang.String str, K0.h hVar, p237x7.a aVar) {
        r2(lVar, i6, z6, str, hVar, aVar);
    }
}
