package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends android.view.View {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f18371C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f18372D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.ref.WeakReference f18373E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.view.LayoutInflater f18374F;

    public interface a {
    }

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f18371C = 0;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p090j.j.f49030z3, i6, 0);
        this.f18372D = typedArrayObtainStyledAttributes.getResourceId(p090j.j.f48808C3, -1);
        this.f18371C = typedArrayObtainStyledAttributes.getResourceId(p090j.j.f48803B3, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(p090j.j.f48798A3, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public android.view.View a() {
        android.view.ViewParent parent = getParent();
        if (!(parent instanceof android.view.ViewGroup)) {
            throw new java.lang.IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f18371C == 0) {
            throw new java.lang.IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        android.view.LayoutInflater layoutInflaterFrom = this.f18374F;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        }
        android.view.View viewInflate = layoutInflaterFrom.inflate(this.f18371C, viewGroup, false);
        int i6 = this.f18372D;
        if (i6 != -1) {
            viewInflate.setId(i6);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f18373E = new java.lang.ref.WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f18372D;
    }

    public android.view.LayoutInflater getLayoutInflater() {
        return this.f18374F;
    }

    public int getLayoutResource() {
        return this.f18371C;
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i6) {
        this.f18372D = i6;
    }

    public void setLayoutInflater(android.view.LayoutInflater layoutInflater) {
        this.f18374F = layoutInflater;
    }

    public void setLayoutResource(int i6) {
        this.f18371C = i6;
    }

    public void setOnInflateListener(androidx.appcompat.widget.ViewStubCompat.a aVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        java.lang.ref.WeakReference weakReference = this.f18373E;
        if (weakReference != null) {
            android.view.View view = (android.view.View) weakReference.get();
            if (view == null) {
                throw new java.lang.IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i6);
            return;
        }
        super.setVisibility(i6);
        if (i6 == 0 || i6 == 4) {
            a();
        }
    }
}
