package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class o extends androidx.appcompat.view.menu.c implements android.view.Menu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p212v1.a f17931d;

    public o(android.content.Context context, p212v1.a aVar) {
        super(context);
        if (aVar == null) {
            throw new java.lang.IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f17931d = aVar;
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i6) {
        return c(this.f17931d.add(i6));
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i6, int i10, int i11, int i12) {
        return c(this.f17931d.add(i6, i10, i11, i12));
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i6, int i10, int i11, java.lang.CharSequence charSequence) {
        return c(this.f17931d.add(i6, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return c(this.f17931d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i6, int i10, int i11, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i12, android.view.MenuItem[] menuItemArr) {
        android.view.MenuItem[] menuItemArr2 = menuItemArr != null ? new android.view.MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f17931d.addIntentOptions(i6, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = c(menuItemArr2[i13]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i6) {
        return d(this.f17931d.addSubMenu(i6));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i6, int i10, int i11, int i12) {
        return d(this.f17931d.addSubMenu(i6, i10, i11, i12));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i6, int i10, int i11, java.lang.CharSequence charSequence) {
        return d(this.f17931d.addSubMenu(i6, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return d(this.f17931d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        e();
        this.f17931d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f17931d.close();
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int i6) {
        return c(this.f17931d.findItem(i6));
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int i6) {
        return c(this.f17931d.getItem(i6));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f17931d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i6, android.view.KeyEvent keyEvent) {
        return this.f17931d.isShortcutKey(i6, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i6, int i10) {
        return this.f17931d.performIdentifierAction(i6, i10);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i6, android.view.KeyEvent keyEvent, int i10) {
        return this.f17931d.performShortcut(i6, keyEvent, i10);
    }

    @Override // android.view.Menu
    public void removeGroup(int i6) {
        f(i6);
        this.f17931d.removeGroup(i6);
    }

    @Override // android.view.Menu
    public void removeItem(int i6) {
        g(i6);
        this.f17931d.removeItem(i6);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i6, boolean z6, boolean z10) {
        this.f17931d.setGroupCheckable(i6, z6, z10);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i6, boolean z6) {
        this.f17931d.setGroupEnabled(i6, z6);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i6, boolean z6) {
        this.f17931d.setGroupVisible(i6, z6);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f17931d.setQwertyMode(z6);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f17931d.size();
    }
}
