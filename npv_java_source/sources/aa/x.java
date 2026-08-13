package aa;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f17340a;

    public x(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "text");
        this.f17340a = str;
    }

    public final java.lang.String a() {
        return this.f17340a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa.x) && p247y7.AbstractC7350t.b(this.f17340a, ((aa.x) obj).f17340a);
    }

    public int hashCode() {
        return this.f17340a.hashCode();
    }

    public java.lang.String toString() {
        return "Value(text=" + this.f17340a + ")";
    }
}
