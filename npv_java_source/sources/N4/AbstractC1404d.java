package N4;

/* JADX INFO: renamed from: N4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1404d implements N4.A {
    AbstractC1404d() {
    }

    @Override // N4.A
    public abstract java.util.Map a();

    public boolean b(java.lang.Object obj) {
        java.util.Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((java.util.Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        return N4.B.a(this, obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public java.lang.String toString() {
        return a().toString();
    }
}
