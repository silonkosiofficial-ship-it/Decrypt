package p174r3;

/* JADX INFO: loaded from: classes.dex */
final class o extends android.webkit.WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ p174r3.u f53879a;

    o(p174r3.u uVar) {
        this.f53879a = uVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        p174r3.u uVar = this.f53879a;
        if (uVar.f53895I != null) {
            try {
                uVar.f53895I.x(com.google.android.gms.internal.ads.P70.d(1, null, null));
            } catch (android.os.RemoteException e6) {
                p224w3.p.i("#007 Could not call remote method.", e6);
            }
        }
        p174r3.u uVar2 = this.f53879a;
        if (uVar2.f53895I != null) {
            try {
                uVar2.f53895I.F(0);
            } catch (android.os.RemoteException e10) {
                p224w3.p.i("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (str.startsWith(this.f53879a.s())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            p174r3.u uVar = this.f53879a;
            if (uVar.f53895I != null) {
                try {
                    uVar.f53895I.x(com.google.android.gms.internal.ads.P70.d(3, null, null));
                } catch (android.os.RemoteException e6) {
                    p224w3.p.i("#007 Could not call remote method.", e6);
                }
            }
            p174r3.u uVar2 = this.f53879a;
            if (uVar2.f53895I != null) {
                try {
                    uVar2.f53895I.F(3);
                } catch (android.os.RemoteException e10) {
                    p224w3.p.i("#007 Could not call remote method.", e10);
                }
            }
            this.f53879a.o6(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            p174r3.u uVar3 = this.f53879a;
            if (uVar3.f53895I != null) {
                try {
                    uVar3.f53895I.x(com.google.android.gms.internal.ads.P70.d(1, null, null));
                } catch (android.os.RemoteException e11) {
                    p224w3.p.i("#007 Could not call remote method.", e11);
                }
            }
            p174r3.u uVar4 = this.f53879a;
            if (uVar4.f53895I != null) {
                try {
                    uVar4.f53895I.F(0);
                } catch (android.os.RemoteException e12) {
                    p224w3.p.i("#007 Could not call remote method.", e12);
                }
            }
            this.f53879a.o6(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            p174r3.u uVar5 = this.f53879a;
            if (uVar5.f53895I != null) {
                try {
                    uVar5.f53895I.h();
                } catch (android.os.RemoteException e13) {
                    p224w3.p.i("#007 Could not call remote method.", e13);
                }
            }
            this.f53879a.o6(this.f53879a.y(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        p174r3.u uVar6 = this.f53879a;
        if (uVar6.f53895I != null) {
            try {
                uVar6.f53895I.c();
                this.f53879a.f53895I.g();
            } catch (android.os.RemoteException e14) {
                p224w3.p.i("#007 Could not call remote method.", e14);
            }
        }
        p174r3.u.x6(this.f53879a, p174r3.u.u6(this.f53879a, str));
        return true;
    }
}
