package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends androidx.appcompat.widget.D implements androidx.appcompat.view.menu.n.a, android.view.View.OnClickListener, androidx.appcompat.widget.ActionMenuView.a {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    androidx.appcompat.view.menu.i f17724J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.lang.CharSequence f17725K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private android.graphics.drawable.Drawable f17726L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    androidx.appcompat.view.menu.g.b f17727M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private androidx.appcompat.widget.N f17728N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    androidx.appcompat.view.menu.ActionMenuItemView.b f17729O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f17730P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f17731Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f17732R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f17733S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f17734T;

    private class a extends androidx.appcompat.widget.N {
        public a() {
            super(androidx.appcompat.view.menu.ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.N
        public androidx.appcompat.view.menu.p b() {
            androidx.appcompat.view.menu.ActionMenuItemView.b bVar = androidx.appcompat.view.menu.ActionMenuItemView.this.f17729O;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.N
        protected boolean c() {
            androidx.appcompat.view.menu.p pVarB;
            androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = androidx.appcompat.view.menu.ActionMenuItemView.this;
            androidx.appcompat.view.menu.g.b bVar = actionMenuItemView.f17727M;
            return bVar != null && bVar.a(actionMenuItemView.f17724J) && (pVarB = b()) != null && pVarB.a();
        }
    }

    public static abstract class b {
        public abstract androidx.appcompat.view.menu.p a();
    }

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        android.content.res.Resources resources = context.getResources();
        this.f17730P = C();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p090j.j.f49006v, i6, 0);
        this.f17732R = typedArrayObtainStyledAttributes.getDimensionPixelSize(p090j.j.f49011w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f17734T = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f17733S = -1;
        setSaveEnabled(false);
    }

    private boolean C() {
        android.content.res.Configuration configuration = getContext().getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        return i6 >= 480 || (i6 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void D() {
        boolean z6 = true;
        boolean z10 = !android.text.TextUtils.isEmpty(this.f17725K);
        if (this.f17726L != null && (!this.f17724J.B() || (!this.f17730P && !this.f17731Q))) {
            z6 = false;
        }
        boolean z11 = z10 & z6;
        setText(z11 ? this.f17725K : null);
        java.lang.CharSequence contentDescription = this.f17724J.getContentDescription();
        if (android.text.TextUtils.isEmpty(contentDescription)) {
            contentDescription = z11 ? null : this.f17724J.getTitle();
        }
        setContentDescription(contentDescription);
        java.lang.CharSequence tooltipText = this.f17724J.getTooltipText();
        if (android.text.TextUtils.isEmpty(tooltipText)) {
            androidx.appcompat.widget.h0.a(this, z11 ? null : this.f17724J.getTitle());
        } else {
            androidx.appcompat.widget.h0.a(this, tooltipText);
        }
    }

    public boolean B() {
        return !android.text.TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return B();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return B() && this.f17724J.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void f(androidx.appcompat.view.menu.i iVar, int i6) {
        this.f17724J = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f17728N == null) {
            this.f17728N = new androidx.appcompat.view.menu.ActionMenuItemView.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return android.widget.Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public androidx.appcompat.view.menu.i getItemData() {
        return this.f17724J;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        androidx.appcompat.view.menu.g.b bVar = this.f17727M;
        if (bVar != null) {
            bVar.a(this.f17724J);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f17730P = C();
        D();
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    protected void onMeasure(int i6, int i10) {
        int i11;
        boolean zB = B();
        if (zB && (i11 = this.f17733S) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i6, i10);
        int mode = android.view.View.MeasureSpec.getMode(i6);
        int size = android.view.View.MeasureSpec.getSize(i6);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? java.lang.Math.min(size, this.f17732R) : this.f17732R;
        if (mode != 1073741824 && this.f17732R > 0 && measuredWidth < iMin) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i10);
        }
        if (zB || this.f17726L == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f17726L.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        androidx.appcompat.widget.N n6;
        if (this.f17724J.hasSubMenu() && (n6 = this.f17728N) != null && n6.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }

    public void setExpandedFormat(boolean z6) {
        if (this.f17731Q != z6) {
            this.f17731Q = z6;
            androidx.appcompat.view.menu.i iVar = this.f17724J;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.f17726L = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i6 = this.f17734T;
            if (intrinsicWidth > i6) {
                intrinsicHeight = (int) (intrinsicHeight * (i6 / intrinsicWidth));
                intrinsicWidth = i6;
            }
            if (intrinsicHeight > i6) {
                intrinsicWidth = (int) (intrinsicWidth * (i6 / intrinsicHeight));
            } else {
                i6 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i6);
        }
        setCompoundDrawables(drawable, null, null, null);
        D();
    }

    public void setItemInvoker(androidx.appcompat.view.menu.g.b bVar) {
        this.f17727M = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i6, int i10, int i11, int i12) {
        this.f17733S = i6;
        super.setPadding(i6, i10, i11, i12);
    }

    public void setPopupCallback(androidx.appcompat.view.menu.ActionMenuItemView.b bVar) {
        this.f17729O = bVar;
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.f17725K = charSequence;
        D();
    }
}
