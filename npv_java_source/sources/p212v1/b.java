package p212v1;

/* JADX INFO: loaded from: classes.dex */
public interface b extends android.view.MenuItem {
    p212v1.b a(androidx.core.view.AbstractC1992b abstractC1992b);

    androidx.core.view.AbstractC1992b b();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    android.view.View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    java.lang.CharSequence getContentDescription();

    @Override // android.view.MenuItem
    android.content.res.ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    android.graphics.PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    java.lang.CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    android.view.MenuItem setActionView(int i6);

    @Override // android.view.MenuItem
    android.view.MenuItem setActionView(android.view.View view);

    @Override // android.view.MenuItem
    android.view.MenuItem setAlphabeticShortcut(char c6, int i6);

    @Override // android.view.MenuItem
    p212v1.b setContentDescription(java.lang.CharSequence charSequence);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    android.view.MenuItem setNumericShortcut(char c6, int i6);

    @Override // android.view.MenuItem
    android.view.MenuItem setShortcut(char c6, char c10, int i6, int i10);

    @Override // android.view.MenuItem
    void setShowAsAction(int i6);

    @Override // android.view.MenuItem
    android.view.MenuItem setShowAsActionFlags(int i6);

    @Override // android.view.MenuItem
    p212v1.b setTooltipText(java.lang.CharSequence charSequence);
}
