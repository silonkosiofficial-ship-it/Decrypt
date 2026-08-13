package p019b9;

/* JADX INFO: loaded from: classes2.dex */
public final class M implements m7.i.c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.ThreadLocal f24342C;

    public M(java.lang.ThreadLocal threadLocal) {
        this.f24342C = threadLocal;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p019b9.M) && p247y7.AbstractC7350t.b(this.f24342C, ((p019b9.M) obj).f24342C);
    }

    public int hashCode() {
        return this.f24342C.hashCode();
    }

    public java.lang.String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f24342C + ')';
    }
}
