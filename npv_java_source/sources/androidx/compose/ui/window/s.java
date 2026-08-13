package androidx.compose.ui.window;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f20691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f20693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f20694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f20695f;

    public s(int i6, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f20690a = i6;
        this.f20691b = z6;
        this.f20692c = z10;
        this.f20693d = z11;
        this.f20694e = z12;
        this.f20695f = z13;
    }

    public s(boolean z6, boolean z10, boolean z11, androidx.compose.ui.window.t tVar, boolean z12, boolean z13) {
        this(z6, z10, z11, tVar, z12, z13, false);
    }

    public /* synthetic */ s(boolean z6, boolean z10, boolean z11, androidx.compose.ui.window.t tVar, boolean z12, boolean z13, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? false : z6, (i6 & 2) != 0 ? true : z10, (i6 & 4) != 0 ? true : z11, (i6 & 8) != 0 ? androidx.compose.ui.window.t.Inherit : tVar, (i6 & 16) != 0 ? true : z12, (i6 & 32) == 0 ? z13 : true);
    }

    public s(boolean z6, boolean z10, boolean z11, androidx.compose.ui.window.t tVar, boolean z12, boolean z13, boolean z14) {
        this(androidx.compose.ui.window.b.g(z6, tVar, z13), tVar == androidx.compose.ui.window.t.Inherit, z10, z11, z12, z14);
    }

    public s(boolean z6, boolean z10, boolean z11, boolean z12) {
        this(z6, z10, z11, androidx.compose.ui.window.t.Inherit, true, z12);
    }

    public /* synthetic */ s(boolean z6, boolean z10, boolean z11, boolean z12, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? false : z6, (i6 & 2) != 0 ? true : z10, (i6 & 4) != 0 ? true : z11, (i6 & 8) != 0 ? true : z12);
    }

    public final boolean a() {
        return this.f20692c;
    }

    public final boolean b() {
        return this.f20693d;
    }

    public final boolean c() {
        return this.f20694e;
    }

    public final int d() {
        return this.f20690a;
    }

    public final boolean e() {
        return this.f20691b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.window.s)) {
            return false;
        }
        androidx.compose.ui.window.s sVar = (androidx.compose.ui.window.s) obj;
        return this.f20690a == sVar.f20690a && this.f20691b == sVar.f20691b && this.f20692c == sVar.f20692c && this.f20693d == sVar.f20693d && this.f20694e == sVar.f20694e && this.f20695f == sVar.f20695f;
    }

    public final boolean f() {
        return this.f20695f;
    }

    public int hashCode() {
        return (((((((((this.f20690a * 31) + p190t.h.a(this.f20691b)) * 31) + p190t.h.a(this.f20692c)) * 31) + p190t.h.a(this.f20693d)) * 31) + p190t.h.a(this.f20694e)) * 31) + p190t.h.a(this.f20695f);
    }
}
