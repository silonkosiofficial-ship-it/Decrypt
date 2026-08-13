package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class b0 extends androidx.appcompat.widget.U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.ref.WeakReference f18424b;

    public b0(android.content.Context context, android.content.res.Resources resources) {
        super(resources);
        this.f18424b = new java.lang.ref.WeakReference(context);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i6) {
        android.graphics.drawable.Drawable drawableA = a(i6);
        android.content.Context context = (android.content.Context) this.f18424b.get();
        if (drawableA != null && context != null) {
            androidx.appcompat.widget.T.h().w(context, i6, drawableA);
        }
        return drawableA;
    }
}
