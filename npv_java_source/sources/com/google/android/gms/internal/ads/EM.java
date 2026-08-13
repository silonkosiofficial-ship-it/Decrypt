package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class EM extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p214v3.C7273v f27029C;

    public EM(android.content.Context context, android.view.View view, p214v3.C7273v c7273v) {
        super(context);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f27029C = c7273v;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        this.f27029C.m(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            android.view.KeyEvent.Callback childAt = getChildAt(i6);
            if (childAt != null && (childAt instanceof com.google.android.gms.internal.ads.InterfaceC2698Ot)) {
                arrayList.add((com.google.android.gms.internal.ads.InterfaceC2698Ot) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.google.android.gms.internal.ads.InterfaceC2698Ot) arrayList.get(i10)).destroy();
        }
    }
}
