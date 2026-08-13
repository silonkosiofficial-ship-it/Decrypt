package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class g extends android.view.View {
    public g(android.content.Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i6) {
        androidx.constraintlayout.widget.ConstraintLayout.b bVar = (androidx.constraintlayout.widget.ConstraintLayout.b) getLayoutParams();
        bVar.f20784a = i6;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i6) {
        androidx.constraintlayout.widget.ConstraintLayout.b bVar = (androidx.constraintlayout.widget.ConstraintLayout.b) getLayoutParams();
        bVar.f20786b = i6;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f6) {
        androidx.constraintlayout.widget.ConstraintLayout.b bVar = (androidx.constraintlayout.widget.ConstraintLayout.b) getLayoutParams();
        bVar.f20788c = f6;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
    }
}
