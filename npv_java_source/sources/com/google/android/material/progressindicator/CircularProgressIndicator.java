package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes3.dex */
public class CircularProgressIndicator extends com.google.android.material.progressindicator.a {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f43471R = p125m4.i.f50705l;

    public CircularProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50513g);
    }

    public CircularProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6, f43471R);
        s();
    }

    private void s() {
        com.google.android.material.progressindicator.c cVar = new com.google.android.material.progressindicator.c((com.google.android.material.progressindicator.e) this.f43473C);
        setIndeterminateDrawable(com.google.android.material.progressindicator.j.t(getContext(), (com.google.android.material.progressindicator.e) this.f43473C, cVar));
        setProgressDrawable(com.google.android.material.progressindicator.f.v(getContext(), (com.google.android.material.progressindicator.e) this.f43473C, cVar));
    }

    public int getIndicatorDirection() {
        return ((com.google.android.material.progressindicator.e) this.f43473C).f43520j;
    }

    public int getIndicatorInset() {
        return ((com.google.android.material.progressindicator.e) this.f43473C).f43519i;
    }

    public int getIndicatorSize() {
        return ((com.google.android.material.progressindicator.e) this.f43473C).f43518h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public com.google.android.material.progressindicator.e i(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new com.google.android.material.progressindicator.e(context, attributeSet);
    }

    public void setIndicatorDirection(int i6) {
        ((com.google.android.material.progressindicator.e) this.f43473C).f43520j = i6;
        invalidate();
    }

    public void setIndicatorInset(int i6) {
        com.google.android.material.progressindicator.b bVar = this.f43473C;
        if (((com.google.android.material.progressindicator.e) bVar).f43519i != i6) {
            ((com.google.android.material.progressindicator.e) bVar).f43519i = i6;
            invalidate();
        }
    }

    public void setIndicatorSize(int i6) {
        int iMax = java.lang.Math.max(i6, getTrackThickness() * 2);
        com.google.android.material.progressindicator.b bVar = this.f43473C;
        if (((com.google.android.material.progressindicator.e) bVar).f43518h != iMax) {
            ((com.google.android.material.progressindicator.e) bVar).f43518h = iMax;
            ((com.google.android.material.progressindicator.e) bVar).e();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackThickness(int i6) {
        super.setTrackThickness(i6);
        ((com.google.android.material.progressindicator.e) this.f43473C).e();
    }
}
