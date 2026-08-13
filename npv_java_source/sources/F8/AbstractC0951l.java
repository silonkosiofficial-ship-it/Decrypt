package F8;

/* JADX INFO: renamed from: F8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0951l implements F8.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2946a;

    private final boolean c(O7.InterfaceC1427h interfaceC1427h) {
        return (H8.k.m(interfaceC1427h) || p178r8.f.E(interfaceC1427h)) ? false : true;
    }

    protected final boolean b(O7.InterfaceC1427h interfaceC1427h, O7.InterfaceC1427h interfaceC1427h2) {
        p247y7.AbstractC7350t.f(interfaceC1427h, "first");
        p247y7.AbstractC7350t.f(interfaceC1427h2, "second");
        if (!p247y7.AbstractC7350t.b(interfaceC1427h.getName(), interfaceC1427h2.getName())) {
            return false;
        }
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1427h.b();
        for (O7.InterfaceC1432m interfaceC1432mB2 = interfaceC1427h2.b(); interfaceC1432mB != null && interfaceC1432mB2 != null; interfaceC1432mB2 = interfaceC1432mB2.b()) {
            if (interfaceC1432mB instanceof O7.G) {
                return interfaceC1432mB2 instanceof O7.G;
            }
            if (interfaceC1432mB2 instanceof O7.G) {
                return false;
            }
            if (interfaceC1432mB instanceof O7.K) {
                return (interfaceC1432mB2 instanceof O7.K) && p247y7.AbstractC7350t.b(((O7.K) interfaceC1432mB).e(), ((O7.K) interfaceC1432mB2).e());
            }
            if ((interfaceC1432mB2 instanceof O7.K) || !p247y7.AbstractC7350t.b(interfaceC1432mB.getName(), interfaceC1432mB2.getName())) {
                return false;
            }
            interfaceC1432mB = interfaceC1432mB.b();
        }
        return true;
    }

    protected abstract boolean d(O7.InterfaceC1427h interfaceC1427h);

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F8.e0) || obj.hashCode() != hashCode()) {
            return false;
        }
        F8.e0 e0Var = (F8.e0) obj;
        if (e0Var.x().size() != x().size()) {
            return false;
        }
        O7.InterfaceC1427h interfaceC1427hW = w();
        O7.InterfaceC1427h interfaceC1427hW2 = e0Var.w();
        if (interfaceC1427hW2 != null && c(interfaceC1427hW) && c(interfaceC1427hW2)) {
            return d(interfaceC1427hW2);
        }
        return false;
    }

    public int hashCode() {
        int i6 = this.f2946a;
        if (i6 != 0) {
            return i6;
        }
        O7.InterfaceC1427h interfaceC1427hW = w();
        int iHashCode = c(interfaceC1427hW) ? p178r8.f.m(interfaceC1427hW).hashCode() : java.lang.System.identityHashCode(this);
        this.f2946a = iHashCode;
        return iHashCode;
    }

    @Override // F8.e0
    public abstract O7.InterfaceC1427h w();
}
