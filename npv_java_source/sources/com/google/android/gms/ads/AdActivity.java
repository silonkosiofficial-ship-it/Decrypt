package com.google.android.gms.ads;

/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends android.app.Activity {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2618Mn f24704C;

    private final void a() {
        com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn = this.f24704C;
        if (interfaceC2618Mn != null) {
            try {
                interfaceC2618Mn.C();
            } catch (android.os.RemoteException e6) {
                p224w3.p.i("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i6, int i10, android.content.Intent intent) {
        try {
            com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn = this.f24704C;
            if (interfaceC2618Mn != null) {
                interfaceC2618Mn.j2(i6, i10, intent);
            }
        } catch (java.lang.Exception e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
        super.onActivityResult(i6, i10, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn = this.f24704C;
            if (interfaceC2618Mn != null && !interfaceC2618Mn.T()) {
                return;
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
        super.onBackPressed();
        try {
            com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn2 = this.f24704C;
            if (interfaceC2618Mn2 != null) {
                interfaceC2618Mn2.h();
            }
        } catch (android.os.RemoteException e10) {
            p224w3.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn = this.f24704C;
            if (interfaceC2618Mn != null) {
                interfaceC2618Mn.b0(X3.b.c2(configuration));
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618MnL = p184s3.C7147y.a().l(this);
        this.f24704C = interfaceC2618MnL;
        if (interfaceC2618MnL != null) {
            try {
                interfaceC2618MnL.W3(bundle);
                return;
            } catch (android.os.RemoteException e6) {
                e = e6;
            }
        } else {
            e = null;
        }
        p224w3.p.i("#007 Could not call remote method.", e);
        finish();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn = this.f24704C;
            if (interfaceC2618Mn != null) {
                interfaceC2618Mn.m();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn = this.f24704C;
            if (interfaceC2618Mn != null) {
                interfaceC2618Mn.p();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i6, java.lang.String[] strArr, int[] iArr) {
        try {
            com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn = this.f24704C;
            if (interfaceC2618Mn != null) {
                interfaceC2618Mn.N2(i6, strArr, iArr);
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn = this.f24704C;
            if (interfaceC2618Mn != null) {
                interfaceC2618Mn.s();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn = this.f24704C;
            if (interfaceC2618Mn != null) {
                interfaceC2618Mn.t();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        try {
            com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn = this.f24704C;
            if (interfaceC2618Mn != null) {
                interfaceC2618Mn.z0(bundle);
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn = this.f24704C;
            if (interfaceC2618Mn != null) {
                interfaceC2618Mn.w();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn = this.f24704C;
            if (interfaceC2618Mn != null) {
                interfaceC2618Mn.A();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618Mn = this.f24704C;
            if (interfaceC2618Mn != null) {
                interfaceC2618Mn.v();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i6) {
        super.setContentView(i6);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(android.view.View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
