package p247y7;

/* JADX INFO: renamed from: y7.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7347p extends p247y7.AbstractC7337f implements p247y7.InterfaceC7346o, F7.f {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final int f57304J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final int f57305K;

    public AbstractC7347p(int i6) {
        this(i6, p247y7.AbstractC7337f.f57285I, null, null, null, 0);
    }

    public AbstractC7347p(int i6, java.lang.Object obj) {
        this(i6, obj, null, null, null, 0);
    }

    public AbstractC7347p(int i6, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f57304J = i6;
        this.f57305K = i10 >> 1;
    }

    @Override // p247y7.InterfaceC7346o
    public int c() {
        return this.f57304J;
    }

    @Override // p247y7.AbstractC7337f
    protected F7.b e() {
        return p247y7.P.a(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p247y7.AbstractC7347p) {
            p247y7.AbstractC7347p abstractC7347p = (p247y7.AbstractC7347p) obj;
            return getName().equals(abstractC7347p.getName()) && n().equals(abstractC7347p.n()) && this.f57305K == abstractC7347p.f57305K && this.f57304J == abstractC7347p.f57304J && p247y7.AbstractC7350t.b(f(), abstractC7347p.f()) && p247y7.AbstractC7350t.b(k(), abstractC7347p.k());
        }
        if (obj instanceof F7.f) {
            return obj.equals(a());
        }
        return false;
    }

    public int hashCode() {
        return (((k() == null ? 0 : k().hashCode() * 31) + getName().hashCode()) * 31) + n().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p247y7.AbstractC7337f
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public F7.f m() {
        return (F7.f) super.m();
    }

    public java.lang.String toString() {
        F7.b bVarA = a();
        if (bVarA != this) {
            return bVarA.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
