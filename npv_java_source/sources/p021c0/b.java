package p021c0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24401a;

    public b(int i6) {
        this.f24401a = i6;
    }

    public /* synthetic */ b(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 0 : i6);
    }

    public final int a() {
        return this.f24401a;
    }

    public final void b(int i6) {
        this.f24401a += i6;
    }

    public final void c(int i6) {
        this.f24401a = i6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p021c0.b) && this.f24401a == ((p021c0.b) obj).f24401a;
    }

    public int hashCode() {
        return this.f24401a;
    }

    public java.lang.String toString() {
        return "DeltaCounter(count=" + this.f24401a + ')';
    }
}
