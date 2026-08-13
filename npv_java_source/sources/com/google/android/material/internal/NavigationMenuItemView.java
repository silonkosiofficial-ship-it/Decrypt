package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuItemView extends com.google.android.material.internal.d implements androidx.appcompat.view.menu.n.a {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int[] f43342l0 = {android.R.attr.state_checked};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f43343a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f43344b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    boolean f43345c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    boolean f43346d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final android.widget.CheckedTextView f43347e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private android.widget.FrameLayout f43348f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private androidx.appcompat.view.menu.i f43349g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private android.content.res.ColorStateList f43350h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f43351i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private android.graphics.drawable.Drawable f43352j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final androidx.core.view.C1990a f43353k0;

    class a extends androidx.core.view.C1990a {
        a() {
        }

        @Override // androidx.core.view.C1990a
        public void g(android.view.View view, C1.B b6) {
            super.g(view, b6);
            b6.k0(com.google.android.material.internal.NavigationMenuItemView.this.f43345c0);
        }
    }

    public NavigationMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f43346d0 = true;
        com.google.android.material.internal.NavigationMenuItemView.a aVar = new com.google.android.material.internal.NavigationMenuItemView.a();
        this.f43353k0 = aVar;
        setOrientation(0);
        android.view.LayoutInflater.from(context).inflate(p125m4.g.f50653a, (android.view.ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(p125m4.c.f50569c));
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) findViewById(p125m4.e.f50630f);
        this.f43347e0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        androidx.core.view.X.n0(checkedTextView, aVar);
    }

    private void B() {
        androidx.appcompat.widget.O.a aVar;
        int i6;
        if (D()) {
            this.f43347e0.setVisibility(8);
            android.widget.FrameLayout frameLayout = this.f43348f0;
            if (frameLayout == null) {
                return;
            }
            aVar = (androidx.appcompat.widget.O.a) frameLayout.getLayoutParams();
            i6 = -1;
        } else {
            this.f43347e0.setVisibility(0);
            android.widget.FrameLayout frameLayout2 = this.f43348f0;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (androidx.appcompat.widget.O.a) frameLayout2.getLayoutParams();
            i6 = -2;
        }
        ((android.widget.LinearLayout.LayoutParams) aVar).width = i6;
        this.f43348f0.setLayoutParams(aVar);
    }

    private android.graphics.drawable.StateListDrawable C() {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!getContext().getTheme().resolveAttribute(p090j.a.f48643t, typedValue, true)) {
            return null;
        }
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(f43342l0, new android.graphics.drawable.ColorDrawable(typedValue.data));
        stateListDrawable.addState(android.view.ViewGroup.EMPTY_STATE_SET, new android.graphics.drawable.ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.f43349g0.getTitle() == null && this.f43349g0.getIcon() == null && this.f43349g0.getActionView() != null;
    }

    private void setActionView(android.view.View view) {
        if (view != null) {
            if (this.f43348f0 == null) {
                this.f43348f0 = (android.widget.FrameLayout) ((android.view.ViewStub) findViewById(p125m4.e.f50629e)).inflate();
            }
            if (view.getParent() != null) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            this.f43348f0.removeAllViews();
            this.f43348f0.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void f(androidx.appcompat.view.menu.i iVar, int i6) {
        this.f43349g0 = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            androidx.core.view.X.r0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        androidx.appcompat.widget.h0.a(this, iVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public androidx.appcompat.view.menu.i getItemData() {
        return this.f43349g0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i6) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        androidx.appcompat.view.menu.i iVar = this.f43349g0;
        if (iVar != null && iVar.isCheckable() && this.f43349g0.isChecked()) {
            android.view.View.mergeDrawableStates(iArrOnCreateDrawableState, f43342l0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z6) {
        refreshDrawableState();
        if (this.f43345c0 != z6) {
            this.f43345c0 = z6;
            this.f43353k0.l(this.f43347e0, 2048);
        }
    }

    public void setChecked(boolean z6) {
        refreshDrawableState();
        this.f43347e0.setChecked(z6);
        android.widget.CheckedTextView checkedTextView = this.f43347e0;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z6 && this.f43346d0) ? 1 : 0);
    }

    public void setHorizontalPadding(int i6) {
        setPadding(i6, getPaddingTop(), i6, getPaddingBottom());
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            if (this.f43351i0) {
                android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.f43350h0);
            }
            int i6 = this.f43343a0;
            drawable.setBounds(0, 0, i6, i6);
        } else if (this.f43344b0) {
            if (this.f43352j0 == null) {
                android.graphics.drawable.Drawable drawableE = androidx.core.content.res.h.e(getResources(), p125m4.d.f50608k, getContext().getTheme());
                this.f43352j0 = drawableE;
                if (drawableE != null) {
                    int i10 = this.f43343a0;
                    drawableE.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.f43352j0;
        }
        androidx.core.widget.h.i(this.f43347e0, drawable, null, null, null);
    }

    public void setIconPadding(int i6) {
        this.f43347e0.setCompoundDrawablePadding(i6);
    }

    public void setIconSize(int i6) {
        this.f43343a0 = i6;
    }

    void setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f43350h0 = colorStateList;
        this.f43351i0 = colorStateList != null;
        androidx.appcompat.view.menu.i iVar = this.f43349g0;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i6) {
        this.f43347e0.setMaxLines(i6);
    }

    public void setNeedsEmptyIcon(boolean z6) {
        this.f43344b0 = z6;
    }

    public void setTextAppearance(int i6) {
        androidx.core.widget.h.n(this.f43347e0, i6);
    }

    public void setTextColor(android.content.res.ColorStateList colorStateList) {
        this.f43347e0.setTextColor(colorStateList);
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.f43347e0.setText(charSequence);
    }
}
