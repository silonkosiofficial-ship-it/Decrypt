package p046e5;

/* JADX INFO: loaded from: classes3.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f44679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Class f44680b;

    @com.napsternetlabs.napsternetv.ProtectedMyApplication$VpnPermissionActivity$a
    private @interface a {
    }

    public F(java.lang.Class cls, java.lang.Class cls2) {
        this.f44679a = cls;
        this.f44680b = cls2;
    }

    public static p046e5.F a(java.lang.Class cls, java.lang.Class cls2) {
        return new p046e5.F(cls, cls2);
    }

    public static p046e5.F b(java.lang.Class cls) {
        return new p046e5.F(e5.F.a.class, cls);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p046e5.F.class != obj.getClass()) {
            return false;
        }
        p046e5.F f6 = (p046e5.F) obj;
        if (this.f44680b.equals(f6.f44680b)) {
            return this.f44679a.equals(f6.f44679a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f44680b.hashCode() * 31) + this.f44679a.hashCode();
    }

    public java.lang.String toString() {
        if (this.f44679a == e5.F.a.class) {
            return this.f44680b.getName();
        }
        return "@" + this.f44679a.getName() + " " + this.f44680b.getName();
    }
}
