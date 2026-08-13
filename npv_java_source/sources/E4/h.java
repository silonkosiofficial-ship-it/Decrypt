package E4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    static E4.d a(int i6) {
        if (i6 != 0) {
            return i6 != 1 ? b() : new E4.e();
        }
        return new E4.j();
    }

    static E4.d b() {
        return new E4.j();
    }

    static E4.f c() {
        return new E4.f();
    }

    public static void d(android.view.View view, float f6) {
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background instanceof E4.g) {
            ((E4.g) background).U(f6);
        }
    }

    public static void e(android.view.View view) {
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background instanceof E4.g) {
            f(view, (E4.g) background);
        }
    }

    public static void f(android.view.View view, E4.g gVar) {
        if (gVar.M()) {
            gVar.Y(com.google.android.material.internal.n.f(view));
        }
    }
}
