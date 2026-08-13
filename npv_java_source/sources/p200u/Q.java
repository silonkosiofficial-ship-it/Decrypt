package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements p200u.InterfaceC7175j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f54725d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.E f54726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p200u.EnumC7168f0 f54727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54728c;

    private Q(p200u.E e6, p200u.EnumC7168f0 enumC7168f0, long j6) {
        this.f54726a = e6;
        this.f54727b = enumC7168f0;
        this.f54728c = j6;
    }

    public /* synthetic */ Q(p200u.E e6, p200u.EnumC7168f0 enumC7168f0, long j6, p247y7.AbstractC7342k abstractC7342k) {
        this(e6, enumC7168f0, j6);
    }

    @Override // p200u.InterfaceC7175j
    public p200u.B0 a(p200u.x0 x0Var) {
        return new p200u.K0(this.f54726a.a(x0Var), this.f54727b, this.f54728c, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p200u.Q)) {
            return false;
        }
        p200u.Q q6 = (p200u.Q) obj;
        return p247y7.AbstractC7350t.b(q6.f54726a, this.f54726a) && q6.f54727b == this.f54727b && p200u.AbstractC7186o0.d(q6.f54728c, this.f54728c);
    }

    public int hashCode() {
        return (((this.f54726a.hashCode() * 31) + this.f54727b.hashCode()) * 31) + p200u.AbstractC7186o0.e(this.f54728c);
    }
}
