package p251z0;

/* JADX INFO: renamed from: z0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7365a implements p251z0.InterfaceC7386w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f57552b;

    public C7365a(int i6) {
        this.f57552b = i6;
    }

    public final int a() {
        return this.f57552b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p247y7.AbstractC7350t.b(p251z0.C7365a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f57552b == ((p251z0.C7365a) obj).f57552b;
    }

    public int hashCode() {
        return this.f57552b;
    }

    public java.lang.String toString() {
        return "AndroidPointerIcon(type=" + this.f57552b + ')';
    }
}
