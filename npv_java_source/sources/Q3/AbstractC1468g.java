package Q3;

/* JADX INFO: renamed from: Q3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1468g extends Q3.AbstractC1464c implements O3.a.f {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Q3.C1465d f8962F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.Set f8963G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final android.accounts.Account f8964H;

    protected AbstractC1468g(android.content.Context context, android.os.Looper looper, int i6, Q3.C1465d c1465d, O3.f.a aVar, O3.f.b bVar) {
        this(context, looper, i6, c1465d, (P3.InterfaceC1447c) aVar, (P3.h) bVar);
    }

    protected AbstractC1468g(android.content.Context context, android.os.Looper looper, int i6, Q3.C1465d c1465d, P3.InterfaceC1447c interfaceC1447c, P3.h hVar) {
        this(context, looper, Q3.AbstractC1469h.a(context), N3.C1394g.m(), i6, c1465d, (P3.InterfaceC1447c) Q3.AbstractC1477p.l(interfaceC1447c), (P3.h) Q3.AbstractC1477p.l(hVar));
    }

    protected AbstractC1468g(android.content.Context context, android.os.Looper looper, Q3.AbstractC1469h abstractC1469h, N3.C1394g c1394g, int i6, Q3.C1465d c1465d, P3.InterfaceC1447c interfaceC1447c, P3.h hVar) {
        super(context, looper, abstractC1469h, c1394g, i6, interfaceC1447c == null ? null : new Q3.E(interfaceC1447c), hVar == null ? null : new Q3.F(hVar), c1465d.j());
        this.f8962F = c1465d;
        this.f8964H = c1465d.a();
        this.f8963G = l0(c1465d.d());
    }

    private final java.util.Set l0(java.util.Set set) {
        java.util.Set setK0 = k0(set);
        java.util.Iterator it = setK0.iterator();
        while (it.hasNext()) {
            if (!set.contains((com.google.android.gms.common.api.Scope) it.next())) {
                throw new java.lang.IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setK0;
    }

    @Override // Q3.AbstractC1464c
    protected final java.util.Set C() {
        return this.f8963G;
    }

    @Override // O3.a.f
    public java.util.Set a() {
        return o() ? this.f8963G : java.util.Collections.emptySet();
    }

    protected final Q3.C1465d j0() {
        return this.f8962F;
    }

    protected java.util.Set k0(java.util.Set set) {
        return set;
    }

    @Override // Q3.AbstractC1464c
    public final android.accounts.Account u() {
        return this.f8964H;
    }

    @Override // Q3.AbstractC1464c
    protected java.util.concurrent.Executor w() {
        return null;
    }
}
