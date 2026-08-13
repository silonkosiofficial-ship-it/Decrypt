package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f12554a;

    public l(java.lang.String str) {
        this.f12554a = str;
    }

    public final java.lang.String a() {
        return this.f12554a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S5.l) && p247y7.AbstractC7350t.b(this.f12554a, ((S5.l) obj).f12554a);
    }

    public int hashCode() {
        java.lang.String str = this.f12554a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f12554a + ')';
    }
}
