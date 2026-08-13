package V;

/* JADX INFO: renamed from: V.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1699b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f14835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f14836b;

    public C1699b0(java.lang.Object obj, java.lang.Object obj2) {
        this.f14835a = obj;
        this.f14836b = obj2;
    }

    private final int a(java.lang.Object obj) {
        if (obj instanceof java.lang.Enum) {
            return ((java.lang.Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V.C1699b0)) {
            return false;
        }
        V.C1699b0 c1699b0 = (V.C1699b0) obj;
        return p247y7.AbstractC7350t.b(this.f14835a, c1699b0.f14835a) && p247y7.AbstractC7350t.b(this.f14836b, c1699b0.f14836b);
    }

    public int hashCode() {
        return (a(this.f14835a) * 31) + a(this.f14836b);
    }

    public java.lang.String toString() {
        return "JoinedKey(left=" + this.f14835a + ", right=" + this.f14836b + ')';
    }
}
