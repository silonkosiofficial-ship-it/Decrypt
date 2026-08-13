package T1;

/* JADX INFO: loaded from: classes.dex */
class h implements android.text.method.TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.text.method.TransformationMethod f12922a;

    h(android.text.method.TransformationMethod transformationMethod) {
        this.f12922a = transformationMethod;
    }

    public android.text.method.TransformationMethod a() {
        return this.f12922a;
    }

    @Override // android.text.method.TransformationMethod
    public java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        android.text.method.TransformationMethod transformationMethod = this.f12922a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.f.c().g() != 1) ? charSequence : androidx.emoji2.text.f.c().r(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(android.view.View view, java.lang.CharSequence charSequence, boolean z6, int i6, android.graphics.Rect rect) {
        android.text.method.TransformationMethod transformationMethod = this.f12922a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z6, i6, rect);
        }
    }
}
