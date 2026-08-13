package androidx.appcompat.app;

/* JADX INFO: renamed from: androidx.appcompat.app.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1890a {

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0338a extends android.view.ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17517a;

        public C0338a(int i6, int i10) {
            super(i6, i10);
            this.f17517a = 8388627;
        }

        public C0338a(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17517a = 0;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p090j.j.f48996t);
            this.f17517a = typedArrayObtainStyledAttributes.getInt(p090j.j.f49001u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0338a(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17517a = 0;
        }

        public C0338a(androidx.appcompat.app.AbstractC1890a.C0338a c0338a) {
            super((android.view.ViewGroup.MarginLayoutParams) c0338a);
            this.f17517a = 0;
            this.f17517a = c0338a.f17517a;
        }
    }

    public abstract boolean f();

    public abstract void g(boolean z6);

    public abstract android.content.Context h();

    public boolean i() {
        return false;
    }

    void j() {
    }

    public abstract boolean k(int i6, android.view.KeyEvent keyEvent);

    public abstract void l(boolean z6);

    public abstract void m(boolean z6);

    public abstract void n(java.lang.CharSequence charSequence);

    public abstract androidx.appcompat.view.b o(androidx.appcompat.view.b.a aVar);
}
