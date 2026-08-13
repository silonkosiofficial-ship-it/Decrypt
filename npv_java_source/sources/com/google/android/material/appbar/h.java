package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes3.dex */
abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f42842a = {android.R.attr.stateListAnimator};

    static void a(android.view.View view) {
        view.setOutlineProvider(android.view.ViewOutlineProvider.BOUNDS);
    }

    static void b(android.view.View view, float f6) {
        int integer = view.getResources().getInteger(p125m4.f.f50651a);
        android.animation.StateListAnimator stateListAnimator = new android.animation.StateListAnimator();
        long j6 = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, p125m4.a.f50501S, -p125m4.a.f50502T}, android.animation.ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j6));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, android.animation.ObjectAnimator.ofFloat(view, "elevation", f6).setDuration(j6));
        stateListAnimator.addState(new int[0], android.animation.ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    static void c(android.view.View view, android.util.AttributeSet attributeSet, int i6, int i10) {
        android.content.Context context = view.getContext();
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context, attributeSet, f42842a, i6, i10, new int[0]);
        try {
            if (typedArrayI.hasValue(0)) {
                view.setStateListAnimator(android.animation.AnimatorInflater.loadStateListAnimator(context, typedArrayI.getResourceId(0, 0)));
            }
        } finally {
            typedArrayI.recycle();
        }
    }
}
