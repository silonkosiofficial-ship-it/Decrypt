package S;

/* JADX INFO: renamed from: S.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1547h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E7.i f11128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T.AbstractC1647f f11129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.InterfaceC1753w0 f11130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V.InterfaceC1753w0 f11131d;

    public AbstractC1547h(java.lang.Long l6, E7.i iVar, S.P0 p6, java.util.Locale locale) {
        T.j jVarH;
        this.f11128a = iVar;
        T.AbstractC1647f abstractC1647fA = T.AbstractC1650i.a(locale);
        this.f11129b = abstractC1647fA;
        this.f11130c = V.A1.d(p6, null, 2, null);
        if (l6 != null) {
            jVarH = abstractC1647fA.g(l6.longValue());
            if (!iVar.D(jVarH.e())) {
                throw new java.lang.IllegalArgumentException(("The initial display month's year (" + jVarH.e() + ") is out of the years range of " + iVar + '.').toString());
            }
        } else {
            jVarH = abstractC1647fA.h(abstractC1647fA.i());
        }
        this.f11131d = V.A1.d(jVarH, null, 2, null);
    }

    public final void c(long j6) {
        T.j jVarG = this.f11129b.g(j6);
        if (this.f11128a.D(jVarG.e())) {
            this.f11131d.setValue(jVarG);
            return;
        }
        throw new java.lang.IllegalArgumentException(("The display month's year (" + jVarG.e() + ") is out of the years range of " + this.f11128a + '.').toString());
    }

    public final S.P0 d() {
        return (S.P0) this.f11130c.getValue();
    }

    public final long e() {
        return ((T.j) this.f11131d.getValue()).d();
    }

    public final E7.i g() {
        return this.f11128a;
    }

    public final T.AbstractC1647f i() {
        return this.f11129b;
    }

    public final void j(S.P0 p6) {
        this.f11130c.setValue(p6);
    }
}
