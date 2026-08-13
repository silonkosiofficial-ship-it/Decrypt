package B1;

/* JADX INFO: loaded from: classes.dex */
public class g implements B1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object[] f512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f513b;

    public g(int i6) {
        if (i6 <= 0) {
            throw new java.lang.IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.f512a = new java.lang.Object[i6];
    }

    private final boolean c(java.lang.Object obj) {
        int i6 = this.f513b;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f512a[i10] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // B1.f
    public boolean a(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "instance");
        if (!(!c(obj))) {
            throw new java.lang.IllegalStateException("Already in the pool!".toString());
        }
        int i6 = this.f513b;
        java.lang.Object[] objArr = this.f512a;
        if (i6 >= objArr.length) {
            return false;
        }
        objArr[i6] = obj;
        this.f513b = i6 + 1;
        return true;
    }

    @Override // B1.f
    public java.lang.Object b() {
        int i6 = this.f513b;
        if (i6 <= 0) {
            return null;
        }
        int i10 = i6 - 1;
        java.lang.Object obj = this.f512a[i10];
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f512a[i10] = null;
        this.f513b--;
        return obj;
    }
}
