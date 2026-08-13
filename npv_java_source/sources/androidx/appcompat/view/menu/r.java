package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class r extends androidx.appcompat.view.menu.g implements android.view.SubMenu {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f17955B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private androidx.appcompat.view.menu.i f17956C;

    public r(android.content.Context context, androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        super(context);
        this.f17955B = gVar;
        this.f17956C = iVar;
    }

    @Override // androidx.appcompat.view.menu.g
    public androidx.appcompat.view.menu.g D() {
        return this.f17955B.D();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean F() {
        return this.f17955B.F();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean G() {
        return this.f17955B.G();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean H() {
        return this.f17955B.H();
    }

    @Override // androidx.appcompat.view.menu.g
    public void R(androidx.appcompat.view.menu.g.a aVar) {
        this.f17955B.R(aVar);
    }

    public android.view.Menu e0() {
        return this.f17955B;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean f(androidx.appcompat.view.menu.i iVar) {
        return this.f17955B.f(iVar);
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
        return this.f17956C;
    }

    @Override // androidx.appcompat.view.menu.g
    boolean h(androidx.appcompat.view.menu.g gVar, android.view.MenuItem menuItem) {
        return super.h(gVar, menuItem) || this.f17955B.h(gVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean k(androidx.appcompat.view.menu.i iVar) {
        return this.f17955B.k(iVar);
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f17955B.setGroupDividerEnabled(z6);
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int i6) {
        return (android.view.SubMenu) super.U(i6);
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        return (android.view.SubMenu) super.V(drawable);
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int i6) {
        return (android.view.SubMenu) super.X(i6);
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        return (android.view.SubMenu) super.Y(charSequence);
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View view) {
        return (android.view.SubMenu) super.Z(view);
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int i6) {
        this.f17956C.setIcon(i6);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        this.f17956C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f17955B.setQwertyMode(z6);
    }

    @Override // androidx.appcompat.view.menu.g
    public java.lang.String t() {
        androidx.appcompat.view.menu.i iVar = this.f17956C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + ":" + itemId;
    }
}
