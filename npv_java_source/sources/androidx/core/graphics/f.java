package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final androidx.core.graphics.f f21549e = new androidx.core.graphics.f(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21553d;

    static class a {
        static android.graphics.Insets a(int i6, int i10, int i11, int i12) {
            return android.graphics.Insets.of(i6, i10, i11, i12);
        }
    }

    private f(int i6, int i10, int i11, int i12) {
        this.f21550a = i6;
        this.f21551b = i10;
        this.f21552c = i11;
        this.f21553d = i12;
    }

    public static androidx.core.graphics.f a(androidx.core.graphics.f fVar, androidx.core.graphics.f fVar2) {
        return b(java.lang.Math.max(fVar.f21550a, fVar2.f21550a), java.lang.Math.max(fVar.f21551b, fVar2.f21551b), java.lang.Math.max(fVar.f21552c, fVar2.f21552c), java.lang.Math.max(fVar.f21553d, fVar2.f21553d));
    }

    public static androidx.core.graphics.f b(int i6, int i10, int i11, int i12) {
        return (i6 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f21549e : new androidx.core.graphics.f(i6, i10, i11, i12);
    }

    public static androidx.core.graphics.f c(android.graphics.Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static androidx.core.graphics.f d(android.graphics.Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public android.graphics.Insets e() {
        return androidx.core.graphics.f.a.a(this.f21550a, this.f21551b, this.f21552c, this.f21553d);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.core.graphics.f.class != obj.getClass()) {
            return false;
        }
        androidx.core.graphics.f fVar = (androidx.core.graphics.f) obj;
        return this.f21553d == fVar.f21553d && this.f21550a == fVar.f21550a && this.f21552c == fVar.f21552c && this.f21551b == fVar.f21551b;
    }

    public int hashCode() {
        return (((((this.f21550a * 31) + this.f21551b) * 31) + this.f21552c) * 31) + this.f21553d;
    }

    public java.lang.String toString() {
        return "Insets{left=" + this.f21550a + ", top=" + this.f21551b + ", right=" + this.f21552c + ", bottom=" + this.f21553d + '}';
    }
}
