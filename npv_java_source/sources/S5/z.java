package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S5.EnumC1626i f12610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S5.C f12611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S5.C1619b f12612c;

    public z(S5.EnumC1626i enumC1626i, S5.C c6, S5.C1619b c1619b) {
        p247y7.AbstractC7350t.f(enumC1626i, "eventType");
        p247y7.AbstractC7350t.f(c6, "sessionData");
        p247y7.AbstractC7350t.f(c1619b, "applicationInfo");
        this.f12610a = enumC1626i;
        this.f12611b = c6;
        this.f12612c = c1619b;
    }

    public final S5.C1619b a() {
        return this.f12612c;
    }

    public final S5.EnumC1626i b() {
        return this.f12610a;
    }

    public final S5.C c() {
        return this.f12611b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S5.z)) {
            return false;
        }
        S5.z zVar = (S5.z) obj;
        return this.f12610a == zVar.f12610a && p247y7.AbstractC7350t.b(this.f12611b, zVar.f12611b) && p247y7.AbstractC7350t.b(this.f12612c, zVar.f12612c);
    }

    public int hashCode() {
        return (((this.f12610a.hashCode() * 31) + this.f12611b.hashCode()) * 31) + this.f12612c.hashCode();
    }

    public java.lang.String toString() {
        return "SessionEvent(eventType=" + this.f12610a + ", sessionData=" + this.f12611b + ", applicationInfo=" + this.f12612c + ')';
    }
}
