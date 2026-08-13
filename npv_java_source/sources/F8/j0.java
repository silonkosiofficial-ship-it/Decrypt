package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j0 implements F8.i0 {
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F8.i0)) {
            return false;
        }
        F8.i0 i0Var = (F8.i0) obj;
        return b() == i0Var.b() && a() == i0Var.a() && getType().equals(i0Var.getType());
    }

    public int hashCode() {
        int iHashCode = a().hashCode() * 31;
        if (F8.q0.w(getType())) {
            return iHashCode + 19;
        }
        return iHashCode + (b() ? 17 : getType().hashCode());
    }

    public java.lang.String toString() {
        if (b()) {
            return "*";
        }
        if (a() == F8.u0.INVARIANT) {
            return getType().toString();
        }
        return a() + " " + getType();
    }
}
