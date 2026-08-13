package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements androidx.appcompat.view.menu.n.a, android.widget.AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private androidx.appcompat.view.menu.i f17739C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.widget.ImageView f17740D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.widget.RadioButton f17741E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.widget.TextView f17742F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.widget.CheckBox f17743G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private android.widget.TextView f17744H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private android.widget.ImageView f17745I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private android.widget.ImageView f17746J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private android.widget.LinearLayout f17747K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private android.graphics.drawable.Drawable f17748L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f17749M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private android.content.Context f17750N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f17751O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private android.graphics.drawable.Drawable f17752P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f17753Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private android.view.LayoutInflater f17754R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f17755S;

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p090j.a.f48613A);
    }

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet);
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(getContext(), attributeSet, p090j.j.f48875T1, i6, 0);
        this.f17748L = c0VarV.g(p090j.j.f48883V1);
        this.f17749M = c0VarV.n(p090j.j.f48879U1, -1);
        this.f17751O = c0VarV.a(p090j.j.f48887W1, false);
        this.f17750N = context;
        this.f17752P = c0VarV.g(p090j.j.f48891X1);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, p090j.a.f48647x, 0);
        this.f17753Q = typedArrayObtainStyledAttributes.hasValue(0);
        c0VarV.w();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(android.view.View view) {
        b(view, -1);
    }

    private void b(android.view.View view, int i6) {
        android.widget.LinearLayout linearLayout = this.f17747K;
        if (linearLayout != null) {
            linearLayout.addView(view, i6);
        } else {
            addView(view, i6);
        }
    }

    private void c() {
        android.widget.CheckBox checkBox = (android.widget.CheckBox) getInflater().inflate(p090j.g.f48766h, (android.view.ViewGroup) this, false);
        this.f17743G = checkBox;
        a(checkBox);
    }

    private void e() {
        android.widget.ImageView imageView = (android.widget.ImageView) getInflater().inflate(p090j.g.f48767i, (android.view.ViewGroup) this, false);
        this.f17740D = imageView;
        b(imageView, 0);
    }

    private void g() {
        android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(p090j.g.f48769k, (android.view.ViewGroup) this, false);
        this.f17741E = radioButton;
        a(radioButton);
    }

    private android.view.LayoutInflater getInflater() {
        if (this.f17754R == null) {
            this.f17754R = android.view.LayoutInflater.from(getContext());
        }
        return this.f17754R;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        android.widget.ImageView imageView = this.f17745I;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(android.graphics.Rect rect) {
        android.widget.ImageView imageView = this.f17746J;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f17746J.getLayoutParams();
        rect.top += this.f17746J.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void f(androidx.appcompat.view.menu.i iVar, int i6) {
        this.f17739C = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public androidx.appcompat.view.menu.i getItemData() {
        return this.f17739C;
    }

    public void h(boolean z6, char c6) {
        int i6 = (z6 && this.f17739C.A()) ? 0 : 8;
        if (i6 == 0) {
            this.f17744H.setText(this.f17739C.h());
        }
        if (this.f17744H.getVisibility() != i6) {
            this.f17744H.setVisibility(i6);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        androidx.core.view.X.r0(this, this.f17748L);
        android.widget.TextView textView = (android.widget.TextView) findViewById(p090j.f.f48729M);
        this.f17742F = textView;
        int i6 = this.f17749M;
        if (i6 != -1) {
            textView.setTextAppearance(this.f17750N, i6);
        }
        this.f17744H = (android.widget.TextView) findViewById(p090j.f.f48722F);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(p090j.f.f48725I);
        this.f17745I = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f17752P);
        }
        this.f17746J = (android.widget.ImageView) findViewById(p090j.f.f48750r);
        this.f17747K = (android.widget.LinearLayout) findViewById(p090j.f.f48744l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i6, int i10) {
        if (this.f17740D != null && this.f17751O) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f17740D.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i6, i10);
    }

    public void setCheckable(boolean z6) {
        android.widget.CompoundButton compoundButton;
        android.view.View view;
        if (!z6 && this.f17741E == null && this.f17743G == null) {
            return;
        }
        if (this.f17739C.m()) {
            if (this.f17741E == null) {
                g();
            }
            compoundButton = this.f17741E;
            view = this.f17743G;
        } else {
            if (this.f17743G == null) {
                c();
            }
            compoundButton = this.f17743G;
            view = this.f17741E;
        }
        if (z6) {
            compoundButton.setChecked(this.f17739C.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        android.widget.CheckBox checkBox = this.f17743G;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        android.widget.RadioButton radioButton = this.f17741E;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        android.widget.CompoundButton compoundButton;
        if (this.f17739C.m()) {
            if (this.f17741E == null) {
                g();
            }
            compoundButton = this.f17741E;
        } else {
            if (this.f17743G == null) {
                c();
            }
            compoundButton = this.f17743G;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.f17755S = z6;
        this.f17751O = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        android.widget.ImageView imageView = this.f17746J;
        if (imageView != null) {
            imageView.setVisibility((this.f17753Q || !z6) ? 8 : 0);
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        boolean z6 = this.f17739C.z() || this.f17755S;
        if (z6 || this.f17751O) {
            android.widget.ImageView imageView = this.f17740D;
            if (imageView == null && drawable == null && !this.f17751O) {
                return;
            }
            if (imageView == null) {
                e();
            }
            if (drawable == null && !this.f17751O) {
                this.f17740D.setVisibility(8);
                return;
            }
            android.widget.ImageView imageView2 = this.f17740D;
            if (!z6) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f17740D.getVisibility() != 0) {
                this.f17740D.setVisibility(0);
            }
        }
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        int i6;
        android.widget.TextView textView;
        if (charSequence != null) {
            this.f17742F.setText(charSequence);
            if (this.f17742F.getVisibility() == 0) {
                return;
            }
            textView = this.f17742F;
            i6 = 0;
        } else {
            i6 = 8;
            if (this.f17742F.getVisibility() == 8) {
                return;
            } else {
                textView = this.f17742F;
            }
        }
        textView.setVisibility(i6);
    }
}
