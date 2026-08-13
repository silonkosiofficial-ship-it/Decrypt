package M1;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z8.y f6943a;

    public k() {
        M1.z zVar = M1.z.f6985b;
        p247y7.AbstractC7350t.d(zVar, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f6943a = Z8.P.a(zVar);
    }

    public final M1.v a() {
        return (M1.v) this.f6943a.getValue();
    }

    public final Z8.InterfaceC1869f b() {
        return this.f6943a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public final M1.v c(M1.v vVar) {
        java.lang.Object value;
        M1.v vVar2;
        p247y7.AbstractC7350t.f(vVar, "newState");
        Z8.y yVar = this.f6943a;
        do {
            value = yVar.getValue();
            vVar2 = (M1.v) value;
            if (vVar2 instanceof M1.q ? true : p247y7.AbstractC7350t.b(vVar2, M1.z.f6985b)) {
                vVar2 = vVar;
            } else if (vVar2 instanceof M1.e) {
                if (vVar.a() > vVar2.a()) {
                    vVar2 = vVar;
                }
            } else if (!(vVar2 instanceof M1.l)) {
                throw new p087i7.s();
            }
        } while (!yVar.g(value, vVar2));
        return vVar2;
    }
}
