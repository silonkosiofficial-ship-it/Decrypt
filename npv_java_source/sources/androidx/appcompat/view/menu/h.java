package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
class h implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, androidx.appcompat.view.menu.m.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f17870C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private androidx.appcompat.app.DialogInterfaceC1891b f17871D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    androidx.appcompat.view.menu.e f17872E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private androidx.appcompat.view.menu.m.a f17873F;

    public h(androidx.appcompat.view.menu.g gVar) {
        this.f17870C = gVar;
    }

    public void a() {
        androidx.appcompat.app.DialogInterfaceC1891b dialogInterfaceC1891b = this.f17871D;
        if (dialogInterfaceC1891b != null) {
            dialogInterfaceC1891b.dismiss();
        }
    }

    public void b(android.os.IBinder iBinder) {
        androidx.appcompat.view.menu.g gVar = this.f17870C;
        androidx.appcompat.app.DialogInterfaceC1891b.a aVar = new androidx.appcompat.app.DialogInterfaceC1891b.a(gVar.u());
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(aVar.b(), p090j.g.f48768j);
        this.f17872E = eVar;
        eVar.h(this);
        this.f17870C.b(this.f17872E);
        aVar.c(this.f17872E.a(), this);
        android.view.View viewY = gVar.y();
        if (viewY != null) {
            aVar.e(viewY);
        } else {
            aVar.f(gVar.w()).m(gVar.x());
        }
        aVar.i(this);
        androidx.appcompat.app.DialogInterfaceC1891b dialogInterfaceC1891bA = aVar.a();
        this.f17871D = dialogInterfaceC1891bA;
        dialogInterfaceC1891bA.setOnDismissListener(this);
        android.view.WindowManager.LayoutParams attributes = this.f17871D.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f17871D.show();
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
        if (z6 || gVar == this.f17870C) {
            a();
        }
        androidx.appcompat.view.menu.m.a aVar = this.f17873F;
        if (aVar != null) {
            aVar.c(gVar, z6);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean d(androidx.appcompat.view.menu.g gVar) {
        androidx.appcompat.view.menu.m.a aVar = this.f17873F;
        if (aVar != null) {
            return aVar.d(gVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i6) {
        this.f17870C.L((androidx.appcompat.view.menu.i) this.f17872E.a().getItem(i6), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f17872E.c(this.f17870C, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i6, android.view.KeyEvent keyEvent) {
        android.view.Window window;
        android.view.View decorView;
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        android.view.View decorView2;
        android.view.KeyEvent.DispatcherState keyDispatcherState2;
        if (i6 == 82 || i6 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.Window window2 = this.f17871D.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f17871D.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f17870C.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f17870C.performShortcut(i6, keyEvent, 0);
    }
}
