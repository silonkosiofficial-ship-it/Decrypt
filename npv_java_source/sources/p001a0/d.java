package p001a0;

/* JADX INFO: loaded from: classes.dex */
public class d extends p097j7.AbstractC6864f implements java.util.Map, p256z7.a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final a0.d.a f16995F = new a0.d.a(null);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f16996G = 8;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final p001a0.d f16997H = new p001a0.d(p001a0.t.f17020e.a(), 0);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p001a0.t f16998D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f16999E;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p001a0.d a() {
            p001a0.d dVar = p001a0.d.f16997H;
            p247y7.AbstractC7350t.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }
    }

    public d(p001a0.t tVar, int i6) {
        this.f16998D = tVar;
        this.f16999E = i6;
    }

    private final Y.e p() {
        return new p001a0.n(this);
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.f16998D.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p097j7.AbstractC6864f
    public final java.util.Set e() {
        return p();
    }

    @Override // p097j7.AbstractC6864f
    public int g() {
        return this.f16999E;
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.f16998D.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p097j7.AbstractC6864f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Y.e f() {
        return new p001a0.p(this);
    }

    public final p001a0.t r() {
        return this.f16998D;
    }

    @Override // p097j7.AbstractC6864f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Y.b h() {
        return new p001a0.r(this);
    }

    public p001a0.d t(java.lang.Object obj, java.lang.Object obj2) {
        a0.t.b bVarP = this.f16998D.P(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return bVarP == null ? this : new p001a0.d(bVarP.a(), size() + bVarP.b());
    }

    public p001a0.d u(java.lang.Object obj) {
        p001a0.t tVarQ = this.f16998D.Q(obj != null ? obj.hashCode() : 0, obj, 0);
        if (this.f16998D == tVarQ) {
            return this;
        }
        return tVarQ == null ? f16995F.a() : new p001a0.d(tVarQ, size() - 1);
    }
}
