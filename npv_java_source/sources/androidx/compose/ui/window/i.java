package androidx.compose.ui.window;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f20642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f20643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.compose.ui.window.t f20644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f20645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f20646e;

    public i(boolean z6, boolean z10, androidx.compose.ui.window.t tVar, boolean z11, boolean z12) {
        this.f20642a = z6;
        this.f20643b = z10;
        this.f20644c = tVar;
        this.f20645d = z11;
        this.f20646e = z12;
    }

    public i(boolean z6, boolean z10, boolean z11) {
        this(z6, z10, androidx.compose.ui.window.t.Inherit, z11, true);
    }

    public /* synthetic */ i(boolean z6, boolean z10, boolean z11, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? true : z6, (i6 & 2) != 0 ? true : z10, (i6 & 4) != 0 ? true : z11);
    }

    public final boolean a() {
        return this.f20646e;
    }

    public final boolean b() {
        return this.f20642a;
    }

    public final boolean c() {
        return this.f20643b;
    }

    public final androidx.compose.ui.window.t d() {
        return this.f20644c;
    }

    public final boolean e() {
        return this.f20645d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.window.i)) {
            return false;
        }
        androidx.compose.ui.window.i iVar = (androidx.compose.ui.window.i) obj;
        return this.f20642a == iVar.f20642a && this.f20643b == iVar.f20643b && this.f20644c == iVar.f20644c && this.f20645d == iVar.f20645d && this.f20646e == iVar.f20646e;
    }

    public int hashCode() {
        return (((((((p190t.h.a(this.f20642a) * 31) + p190t.h.a(this.f20643b)) * 31) + this.f20644c.hashCode()) * 31) + p190t.h.a(this.f20645d)) * 31) + p190t.h.a(this.f20646e);
    }
}
