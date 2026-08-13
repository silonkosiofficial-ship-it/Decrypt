package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends android.view.View {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected int[] f20853C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected int f20854D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected android.content.Context f20855E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected p172r1.i f20856F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected boolean f20857G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected java.lang.String f20858H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private android.view.View[] f20859I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.util.HashMap f20860J;

    public c(android.content.Context context) {
        super(context);
        this.f20853C = new int[32];
        this.f20857G = false;
        this.f20859I = null;
        this.f20860J = new java.util.HashMap();
        this.f20855E = context;
        g(null);
    }

    public c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20853C = new int[32];
        this.f20857G = false;
        this.f20859I = null;
        this.f20860J = new java.util.HashMap();
        this.f20855E = context;
        g(attributeSet);
    }

    private void a(java.lang.String str) {
        if (str == null || str.length() == 0 || this.f20855E == null) {
            return;
        }
        java.lang.String strTrim = str.trim();
        if (getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout) {
        }
        int iF = f(strTrim);
        if (iF != 0) {
            this.f20860J.put(java.lang.Integer.valueOf(iF), strTrim);
            b(iF);
            return;
        }
        java.lang.String str2 = "Could not find id of \"" + strTrim + "\"";
    }

    private void b(int i6) {
        if (i6 == getId()) {
            return;
        }
        int i10 = this.f20854D + 1;
        int[] iArr = this.f20853C;
        if (i10 > iArr.length) {
            this.f20853C = java.util.Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f20853C;
        int i11 = this.f20854D;
        iArr2[i11] = i6;
        this.f20854D = i11 + 1;
    }

    private int e(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, java.lang.String str) {
        android.content.res.Resources resources;
        java.lang.String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f20855E.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = constraintLayout.getChildAt(i6);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (android.content.res.Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int f(java.lang.String str) {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) getParent() : null;
        int iE = 0;
        if (isInEditMode() && constraintLayout != null) {
            java.lang.Object objF = constraintLayout.f(0, str);
            if (objF instanceof java.lang.Integer) {
                iE = ((java.lang.Integer) objF).intValue();
            }
        }
        if (iE == 0 && constraintLayout != null) {
            iE = e(constraintLayout, str);
        }
        if (iE == 0) {
            try {
                iE = androidx.constraintlayout.widget.h.class.getField(str).getInt(null);
            } catch (java.lang.Exception unused) {
            }
        }
        return iE == 0 ? this.f20855E.getResources().getIdentifier(str, "id", this.f20855E.getPackageName()) : iE;
    }

    protected void c() {
        android.view.ViewParent parent = getParent();
        if (parent == null || !(parent instanceof androidx.constraintlayout.widget.ConstraintLayout)) {
            return;
        }
        d((androidx.constraintlayout.widget.ConstraintLayout) parent);
    }

    protected void d(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i6 = 0; i6 < this.f20854D; i6++) {
            android.view.View viewH = constraintLayout.h(this.f20853C[i6]);
            if (viewH != null) {
                viewH.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void g(android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f21135a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == androidx.constraintlayout.widget.i.f21268t1) {
                    java.lang.String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f20858H = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return java.util.Arrays.copyOf(this.f20853C, this.f20854D);
    }

    public abstract void h(p172r1.e eVar, boolean z6);

    public void i(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
    }

    public void j(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
    }

    public void k(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
    }

    public void l(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        java.lang.String str;
        int iE;
        if (isInEditMode()) {
            setIds(this.f20858H);
        }
        p172r1.i iVar = this.f20856F;
        if (iVar == null) {
            return;
        }
        iVar.c();
        for (int i6 = 0; i6 < this.f20854D; i6++) {
            int i10 = this.f20853C[i6];
            android.view.View viewH = constraintLayout.h(i10);
            if (viewH == null && (iE = e(constraintLayout, (str = (java.lang.String) this.f20860J.get(java.lang.Integer.valueOf(i10))))) != 0) {
                this.f20853C[i6] = iE;
                this.f20860J.put(java.lang.Integer.valueOf(iE), str);
                viewH = constraintLayout.h(iE);
            }
            if (viewH != null) {
                this.f20856F.b(constraintLayout.i(viewH));
            }
        }
        this.f20856F.a(constraintLayout.f20736E);
    }

    public void m() {
        if (this.f20856F == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.b) {
            ((androidx.constraintlayout.widget.ConstraintLayout.b) layoutParams).f20811n0 = (p172r1.e) this.f20856F;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.lang.String str = this.f20858H;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        if (this.f20857G) {
            super.onMeasure(i6, i10);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(java.lang.String str) {
        this.f20858H = str;
        if (str == null) {
            return;
        }
        int i6 = 0;
        this.f20854D = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i6);
            if (iIndexOf == -1) {
                a(str.substring(i6));
                return;
            } else {
                a(str.substring(i6, iIndexOf));
                i6 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f20858H = null;
        this.f20854D = 0;
        for (int i6 : iArr) {
            b(i6);
        }
    }
}
