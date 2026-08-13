package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1913t extends android.widget.PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f18575b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f18576a;

    public C1913t(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        super(context, attributeSet, i6, i10);
        a(context, attributeSet, i6, i10);
    }

    private void a(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(context, attributeSet, p090j.j.f48895Y1, i6, i10);
        if (c0VarV.s(p090j.j.f48904a2)) {
            b(c0VarV.a(p090j.j.f48904a2, false));
        }
        setBackgroundDrawable(c0VarV.g(p090j.j.f48899Z1));
        c0VarV.w();
    }

    private void b(boolean z6) {
        if (f18575b) {
            this.f18576a = z6;
        } else {
            androidx.core.widget.g.a(this, z6);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i6, int i10) {
        if (f18575b && this.f18576a) {
            i10 -= view.getHeight();
        }
        super.showAsDropDown(view, i6, i10);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i6, int i10, int i11) {
        if (f18575b && this.f18576a) {
            i10 -= view.getHeight();
        }
        super.showAsDropDown(view, i6, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(android.view.View view, int i6, int i10, int i11, int i12) {
        if (f18575b && this.f18576a) {
            i10 -= view.getHeight();
        }
        super.update(view, i6, i10, i11, i12);
    }
}
