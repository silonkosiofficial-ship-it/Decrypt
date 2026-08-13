package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuView extends androidx.recyclerview.widget.RecyclerView implements androidx.appcompat.view.menu.n {
    public NavigationMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false));
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(androidx.appcompat.view.menu.g gVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
