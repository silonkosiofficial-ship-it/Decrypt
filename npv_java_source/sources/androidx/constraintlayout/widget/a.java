package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.constraintlayout.widget.c {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f20834K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f20835L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private p172r1.a f20836M;

    public a(android.content.Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0011  */
    private void o(p172r1.e eVar, int i6, boolean z6) {
        this.f20835L = i6;
        if (z6) {
            int i10 = this.f20834K;
            if (i10 == 5) {
                this.f20835L = 1;
            } else if (i10 == 6) {
                this.f20835L = 0;
            }
        } else {
            int i11 = this.f20834K;
            if (i11 == 5) {
                this.f20835L = 0;
            } else if (i11 == 6) {
                this.f20835L = 1;
            }
        }
        if (eVar instanceof p172r1.a) {
            ((p172r1.a) eVar).P0(this.f20835L);
        }
    }

    @Override // androidx.constraintlayout.widget.c
    protected void g(android.util.AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f20836M = new p172r1.a();
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f21135a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == androidx.constraintlayout.widget.i.f21247q1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21240p1) {
                    this.f20836M.O0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == androidx.constraintlayout.widget.i.f21254r1) {
                    this.f20836M.Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f20856F = this.f20836M;
        m();
    }

    public int getMargin() {
        return this.f20836M.M0();
    }

    public int getType() {
        return this.f20834K;
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(p172r1.e eVar, boolean z6) {
        o(eVar, this.f20834K, z6);
    }

    public boolean n() {
        return this.f20836M.K0();
    }

    public void setAllowsGoneWidget(boolean z6) {
        this.f20836M.O0(z6);
    }

    public void setDpMargin(int i6) {
        this.f20836M.Q0((int) ((i6 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i6) {
        this.f20836M.Q0(i6);
    }

    public void setType(int i6) {
        this.f20834K = i6;
    }
}
