package com.google.android.gms.ads;

/* JADX INFO: loaded from: classes.dex */
public final class OutOfContextTestingActivity extends android.app.Activity {
    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        p184s3.Q0 q0F = p184s3.C7147y.a().f(this, new com.google.android.gms.internal.ads.BinderC2801Rl());
        if (q0F == null) {
            finish();
            return;
        }
        setContentView(p104k3.r.f49491a);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(p104k3.q.f49490a);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            q0F.s5(stringExtra, X3.b.c2(this), X3.b.c2(linearLayout));
        } catch (android.os.RemoteException unused) {
            finish();
        }
    }
}
