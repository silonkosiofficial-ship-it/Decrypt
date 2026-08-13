package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Comparator f43462a = new com.google.android.material.internal.l.a();

    class a implements java.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(android.view.View view, android.view.View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    private static android.widget.ImageView a(androidx.appcompat.widget.Toolbar toolbar, android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView;
        android.graphics.drawable.Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i6 = 0; i6 < toolbar.getChildCount(); i6++) {
            android.view.View childAt = toolbar.getChildAt(i6);
            if ((childAt instanceof android.widget.ImageView) && (drawable2 = (imageView = (android.widget.ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    public static android.widget.ImageView b(androidx.appcompat.widget.Toolbar toolbar) {
        return a(toolbar, toolbar.getLogo());
    }

    public static android.widget.TextView c(androidx.appcompat.widget.Toolbar toolbar) {
        java.util.List listD = d(toolbar, toolbar.getSubtitle());
        if (listD.isEmpty()) {
            return null;
        }
        return (android.widget.TextView) java.util.Collections.max(listD, f43462a);
    }

    private static java.util.List d(androidx.appcompat.widget.Toolbar toolbar, java.lang.CharSequence charSequence) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 = 0; i6 < toolbar.getChildCount(); i6++) {
            android.view.View childAt = toolbar.getChildAt(i6);
            if (childAt instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) childAt;
                if (android.text.TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static android.widget.TextView e(androidx.appcompat.widget.Toolbar toolbar) {
        java.util.List listD = d(toolbar, toolbar.getTitle());
        if (listD.isEmpty()) {
            return null;
        }
        return (android.widget.TextView) java.util.Collections.min(listD, f43462a);
    }
}
