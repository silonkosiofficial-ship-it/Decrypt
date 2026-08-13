package p210v;

/* JADX INFO: renamed from: v.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7227v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p210v.C7227v f55726a = new p210v.C7227v();

    private C7227v() {
    }

    public final android.widget.EdgeEffect a(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 31 ? p210v.C7209c.f55679a.a(context, null) : new p210v.E(context);
    }

    public final float b(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return p210v.C7209c.f55679a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void c(android.widget.EdgeEffect edgeEffect, int i6) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i6);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i6);
        }
    }

    public final float d(android.widget.EdgeEffect edgeEffect, float f6, float f10) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return p210v.C7209c.f55679a.c(edgeEffect, f6, f10);
        }
        edgeEffect.onPull(f6, f10);
        return f6;
    }

    public final void e(android.widget.EdgeEffect edgeEffect, float f6) {
        if (edgeEffect instanceof p210v.E) {
            ((p210v.E) edgeEffect).a(f6);
        } else {
            edgeEffect.onRelease();
        }
    }
}
