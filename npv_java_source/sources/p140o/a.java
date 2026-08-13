package p140o;

/* JADX INFO: loaded from: classes.dex */
public class a extends p140o.b {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.HashMap f52088G = new java.util.HashMap();

    public boolean contains(java.lang.Object obj) {
        return this.f52088G.containsKey(obj);
    }

    @Override // p140o.b
    protected o.b.c e(java.lang.Object obj) {
        return (o.b.c) this.f52088G.get(obj);
    }

    @Override // p140o.b
    public java.lang.Object o(java.lang.Object obj, java.lang.Object obj2) {
        o.b.c cVarE = e(obj);
        if (cVarE != null) {
            return cVarE.f52094D;
        }
        this.f52088G.put(obj, n(obj, obj2));
        return null;
    }

    @Override // p140o.b
    public java.lang.Object s(java.lang.Object obj) {
        java.lang.Object objS = super.s(obj);
        this.f52088G.remove(obj);
        return objS;
    }

    public java.util.Map.Entry w(java.lang.Object obj) {
        if (contains(obj)) {
            return ((o.b.c) this.f52088G.get(obj)).f52096F;
        }
        return null;
    }
}
