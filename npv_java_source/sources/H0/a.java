package H0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends android.view.ActionMode.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H0.c f4263a;

    public a(H0.c cVar) {
        this.f4263a = cVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        return this.f4263a.d(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        return this.f4263a.e(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(android.view.ActionMode actionMode) {
        this.f4263a.f();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(android.view.ActionMode actionMode, android.view.View view, android.graphics.Rect rect) {
        p131n0.i iVarC = this.f4263a.c();
        if (rect != null) {
            rect.set((int) iVarC.i(), (int) iVarC.l(), (int) iVarC.j(), (int) iVarC.e());
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        return this.f4263a.g(actionMode, menu);
    }
}
