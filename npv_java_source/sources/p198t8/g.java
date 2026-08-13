package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f54632a;

    public g(java.lang.Object obj) {
        this.f54632a = obj;
    }

    public abstract F8.E a(O7.G g6);

    public java.lang.Object b() {
        return this.f54632a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            java.lang.Object objB = b();
            p198t8.g gVar = obj instanceof p198t8.g ? (p198t8.g) obj : null;
            if (!p247y7.AbstractC7350t.b(objB, gVar != null ? gVar.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        java.lang.Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(b());
    }
}
