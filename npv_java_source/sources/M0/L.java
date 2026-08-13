package M0;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.C f6661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M0.C f6662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M0.C f6663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M0.C f6664d;

    public L(M0.C c6, M0.C c10, M0.C c11, M0.C c12) {
        this.f6661a = c6;
        this.f6662b = c10;
        this.f6663c = c11;
        this.f6664d = c12;
    }

    public final M0.C a() {
        return this.f6662b;
    }

    public final M0.C b() {
        return this.f6663c;
    }

    public final M0.C c() {
        return this.f6664d;
    }

    public final M0.C d() {
        return this.f6661a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof M0.L)) {
            return false;
        }
        M0.L l6 = (M0.L) obj;
        return p247y7.AbstractC7350t.b(this.f6661a, l6.f6661a) && p247y7.AbstractC7350t.b(this.f6662b, l6.f6662b) && p247y7.AbstractC7350t.b(this.f6663c, l6.f6663c) && p247y7.AbstractC7350t.b(this.f6664d, l6.f6664d);
    }

    public int hashCode() {
        M0.C c6 = this.f6661a;
        int iHashCode = (c6 != null ? c6.hashCode() : 0) * 31;
        M0.C c10 = this.f6662b;
        int iHashCode2 = (iHashCode + (c10 != null ? c10.hashCode() : 0)) * 31;
        M0.C c11 = this.f6663c;
        int iHashCode3 = (iHashCode2 + (c11 != null ? c11.hashCode() : 0)) * 31;
        M0.C c12 = this.f6664d;
        return iHashCode3 + (c12 != null ? c12.hashCode() : 0);
    }
}
