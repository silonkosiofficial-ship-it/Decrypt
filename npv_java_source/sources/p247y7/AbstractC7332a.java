package p247y7;

/* JADX INFO: renamed from: y7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7332a implements p247y7.InterfaceC7346o, java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected final java.lang.Object f57274C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Class f57275D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f57276E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f57277F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f57278G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f57279H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int f57280I;

    public AbstractC7332a(int i6, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i10) {
        this(i6, p247y7.AbstractC7337f.f57285I, cls, str, str2, i10);
    }

    public AbstractC7332a(int i6, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i10) {
        this.f57274C = obj;
        this.f57275D = cls;
        this.f57276E = str;
        this.f57277F = str2;
        this.f57278G = (i10 & 1) == 1;
        this.f57279H = i6;
        this.f57280I = i10 >> 1;
    }

    @Override // p247y7.InterfaceC7346o
    public int c() {
        return this.f57279H;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p247y7.AbstractC7332a)) {
            return false;
        }
        p247y7.AbstractC7332a abstractC7332a = (p247y7.AbstractC7332a) obj;
        return this.f57278G == abstractC7332a.f57278G && this.f57279H == abstractC7332a.f57279H && this.f57280I == abstractC7332a.f57280I && p247y7.AbstractC7350t.b(this.f57274C, abstractC7332a.f57274C) && p247y7.AbstractC7350t.b(this.f57275D, abstractC7332a.f57275D) && this.f57276E.equals(abstractC7332a.f57276E) && this.f57277F.equals(abstractC7332a.f57277F);
    }

    public int hashCode() {
        java.lang.Object obj = this.f57274C;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Class cls = this.f57275D;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f57276E.hashCode()) * 31) + this.f57277F.hashCode()) * 31) + (this.f57278G ? 1231 : 1237)) * 31) + this.f57279H) * 31) + this.f57280I;
    }

    public java.lang.String toString() {
        return p247y7.P.l(this);
    }
}
