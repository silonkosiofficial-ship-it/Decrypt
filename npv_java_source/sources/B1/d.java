package B1;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f501b;

    public d(java.lang.Object obj, java.lang.Object obj2) {
        this.f500a = obj;
        this.f501b = obj2;
    }

    public static B1.d a(java.lang.Object obj, java.lang.Object obj2) {
        return new B1.d(obj, obj2);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof B1.d)) {
            return false;
        }
        B1.d dVar = (B1.d) obj;
        return B1.c.a(dVar.f500a, this.f500a) && B1.c.a(dVar.f501b, this.f501b);
    }

    public int hashCode() {
        java.lang.Object obj = this.f500a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.f501b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Pair{" + this.f500a + " " + this.f501b + "}";
    }
}
