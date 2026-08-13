package androidx.transition;

/* JADX INFO: renamed from: androidx.transition.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C2106i implements android.animation.TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.graphics.Rect f23608a;

    C2106i() {
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public android.graphics.Rect evaluate(float f6, android.graphics.Rect rect, android.graphics.Rect rect2) {
        int i6 = rect.left;
        int i10 = i6 + ((int) ((rect2.left - i6) * f6));
        int i11 = rect.top;
        int i12 = i11 + ((int) ((rect2.top - i11) * f6));
        int i13 = rect.right;
        int i14 = i13 + ((int) ((rect2.right - i13) * f6));
        int i15 = rect.bottom;
        int i16 = i15 + ((int) ((rect2.bottom - i15) * f6));
        android.graphics.Rect rect3 = this.f23608a;
        if (rect3 == null) {
            return new android.graphics.Rect(i10, i12, i14, i16);
        }
        rect3.set(i10, i12, i14, i16);
        return this.f23608a;
    }
}
