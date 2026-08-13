package androidx.constraintlayout.helper.widget;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends androidx.constraintlayout.widget.j {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private p172r1.g f20733M;

    public Flow(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.j, androidx.constraintlayout.widget.c
    protected void g(android.util.AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f20733M = new p172r1.g();
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f21135a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == androidx.constraintlayout.widget.i.f21142b1) {
                    this.f20733M.S1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21149c1) {
                    this.f20733M.Y0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21219m1) {
                    this.f20733M.d1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21226n1) {
                    this.f20733M.a1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21156d1) {
                    this.f20733M.b1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21163e1) {
                    this.f20733M.e1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21170f1) {
                    this.f20733M.c1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21177g1) {
                    this.f20733M.Z0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21045L1) {
                    this.f20733M.X1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f20985B1) {
                    this.f20733M.M1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21039K1) {
                    this.f20733M.W1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21282v1) {
                    this.f20733M.G1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f20997D1) {
                    this.f20733M.O1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21295x1) {
                    this.f20733M.I1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21009F1) {
                    this.f20733M.Q1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21307z1) {
                    this.f20733M.K1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.i.f21275u1) {
                    this.f20733M.F1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.i.f20991C1) {
                    this.f20733M.N1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.i.f21289w1) {
                    this.f20733M.H1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.i.f21003E1) {
                    this.f20733M.P1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.i.f21027I1) {
                    this.f20733M.U1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.i.f21301y1) {
                    this.f20733M.J1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == androidx.constraintlayout.widget.i.f21021H1) {
                    this.f20733M.T1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == androidx.constraintlayout.widget.i.f20979A1) {
                    this.f20733M.L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21033J1) {
                    this.f20733M.V1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.i.f21015G1) {
                    this.f20733M.R1(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f20856F = this.f20733M;
        m();
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(p172r1.e eVar, boolean z6) {
        this.f20733M.K0(z6);
    }

    @Override // androidx.constraintlayout.widget.j
    public void n(p172r1.l lVar, int i6, int i10) {
        int mode = android.view.View.MeasureSpec.getMode(i6);
        int size = android.view.View.MeasureSpec.getSize(i6);
        int mode2 = android.view.View.MeasureSpec.getMode(i10);
        int size2 = android.view.View.MeasureSpec.getSize(i10);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.S0(mode, size, mode2, size2);
            setMeasuredDimension(lVar.N0(), lVar.M0());
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    protected void onMeasure(int i6, int i10) {
        n(this.f20733M, i6, i10);
    }

    public void setFirstHorizontalBias(float f6) {
        this.f20733M.F1(f6);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i6) {
        this.f20733M.G1(i6);
        requestLayout();
    }

    public void setFirstVerticalBias(float f6) {
        this.f20733M.H1(f6);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i6) {
        this.f20733M.I1(i6);
        requestLayout();
    }

    public void setHorizontalAlign(int i6) {
        this.f20733M.J1(i6);
        requestLayout();
    }

    public void setHorizontalBias(float f6) {
        this.f20733M.K1(f6);
        requestLayout();
    }

    public void setHorizontalGap(int i6) {
        this.f20733M.L1(i6);
        requestLayout();
    }

    public void setHorizontalStyle(int i6) {
        this.f20733M.M1(i6);
        requestLayout();
    }

    public void setMaxElementsWrap(int i6) {
        this.f20733M.R1(i6);
        requestLayout();
    }

    public void setOrientation(int i6) {
        this.f20733M.S1(i6);
        requestLayout();
    }

    public void setPadding(int i6) {
        this.f20733M.Y0(i6);
        requestLayout();
    }

    public void setPaddingBottom(int i6) {
        this.f20733M.Z0(i6);
        requestLayout();
    }

    public void setPaddingLeft(int i6) {
        this.f20733M.b1(i6);
        requestLayout();
    }

    public void setPaddingRight(int i6) {
        this.f20733M.c1(i6);
        requestLayout();
    }

    public void setPaddingTop(int i6) {
        this.f20733M.e1(i6);
        requestLayout();
    }

    public void setVerticalAlign(int i6) {
        this.f20733M.T1(i6);
        requestLayout();
    }

    public void setVerticalBias(float f6) {
        this.f20733M.U1(f6);
        requestLayout();
    }

    public void setVerticalGap(int i6) {
        this.f20733M.V1(i6);
        requestLayout();
    }

    public void setVerticalStyle(int i6) {
        this.f20733M.W1(i6);
        requestLayout();
    }

    public void setWrapMode(int i6) {
        this.f20733M.X1(i6);
        requestLayout();
    }
}
