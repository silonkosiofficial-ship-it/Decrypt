package N3;

/* JADX INFO: renamed from: N3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1394g extends N3.C1395h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f7659c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.Object f7657e = new java.lang.Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final N3.C1394g f7658f = new N3.C1394g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7656d = N3.C1395h.f7660a;

    public static N3.C1394g m() {
        return f7658f;
    }

    @Override // N3.C1395h
    public android.content.Intent b(android.content.Context context, int i6, java.lang.String str) {
        return super.b(context, i6, str);
    }

    @Override // N3.C1395h
    public android.app.PendingIntent c(android.content.Context context, int i6, int i10) {
        return super.c(context, i6, i10);
    }

    @Override // N3.C1395h
    public final java.lang.String e(int i6) {
        return super.e(i6);
    }

    @Override // N3.C1395h
    public int g(android.content.Context context) {
        return super.g(context);
    }

    @Override // N3.C1395h
    public int h(android.content.Context context, int i6) {
        return super.h(context, i6);
    }

    @Override // N3.C1395h
    public final boolean j(int i6) {
        return super.j(i6);
    }

    public android.app.Dialog k(android.app.Activity activity, int i6, int i10, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i6, Q3.D.b(activity, b(activity, i6, "d"), i10), onCancelListener, null);
    }

    public android.app.PendingIntent l(android.content.Context context, N3.C1389b c1389b) {
        return c1389b.w() ? c1389b.s() : c(context, c1389b.e(), 0);
    }

    public boolean n(android.app.Activity activity, int i6, int i10, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog dialogK = k(activity, i6, i10, onCancelListener);
        if (dialogK == null) {
            return false;
        }
        s(activity, dialogK, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(android.content.Context context, int i6) {
        t(context, i6, null, d(context, i6, 0, "n"));
    }

    final android.app.Dialog p(android.content.Context context, int i6, Q3.D d6, android.content.DialogInterface.OnCancelListener onCancelListener, android.content.DialogInterface.OnClickListener onClickListener) {
        android.app.AlertDialog.Builder builder;
        android.app.AlertDialog.Builder builder2 = null;
        if (i6 == 0) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new android.app.AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new android.app.AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(Q3.A.c(context, i6));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        java.lang.String strB = Q3.A.b(context, i6);
        android.content.DialogInterface.OnClickListener onClickListener2 = d6;
        if (strB != null) {
            if (d6 == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strB, onClickListener2);
        }
        java.lang.String strF = Q3.A.f(context, i6);
        if (strF != null) {
            builder2.setTitle(strF);
        }
        java.lang.String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", java.lang.Integer.valueOf(i6));
        new java.lang.IllegalArgumentException();
        return builder2.create();
    }

    public final android.app.Dialog q(android.app.Activity activity, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(Q3.A.c(activity, 18));
        builder.setPositiveButton("", (android.content.DialogInterface.OnClickListener) null);
        android.app.AlertDialog alertDialogCreate = builder.create();
        s(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final P3.s r(android.content.Context context, P3.r rVar) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        P3.s sVar = new P3.s(rVar);
        p035d4.f.l(context, sVar, intentFilter);
        sVar.a(context);
        if (i(context, "com.google.android.gms")) {
            return sVar;
        }
        rVar.a();
        sVar.b();
        return null;
    }

    final void s(android.app.Activity activity, android.app.Dialog dialog, java.lang.String str, android.content.DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.g) {
                N3.n.R1(dialog, onCancelListener).Q1(((androidx.fragment.app.g) activity).e0(), str);
                return;
            }
        } catch (java.lang.NoClassDefFoundError unused) {
        }
        N3.DialogFragmentC1390c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void t(android.content.Context context, int i6, java.lang.String str, android.app.PendingIntent pendingIntent) {
        int i10;
        java.lang.String str2;
        java.lang.String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", java.lang.Integer.valueOf(i6), null);
        new java.lang.IllegalArgumentException();
        if (i6 == 18) {
            u(context);
            return;
        }
        if (pendingIntent == null) {
            if (i6 == 6) {
                return;
            } else {
                return;
            }
        }
        java.lang.String strE = Q3.A.e(context, i6);
        java.lang.String strD = Q3.A.d(context, i6);
        android.content.res.Resources resources = context.getResources();
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) Q3.AbstractC1477p.l(context.getSystemService("notification"));
        androidx.core.app.j.e eVarQ = new androidx.core.app.j.e(context).m(true).e(true).i(strE).q(new androidx.core.app.j.c().h(strD));
        if (V3.j.f(context)) {
            Q3.AbstractC1477p.o(V3.n.e());
            eVarQ.p(context.getApplicationInfo().icon).o(2);
            if (V3.j.g(context)) {
                eVarQ.a(M3.a.f6994a, resources.getString(M3.b.f7009o), pendingIntent);
            } else {
                eVarQ.g(pendingIntent);
            }
        } else {
            eVarQ.p(android.R.drawable.stat_sys_warning).r(resources.getString(M3.b.f7002h)).s(java.lang.System.currentTimeMillis()).g(pendingIntent).h(strD);
        }
        if (V3.n.i()) {
            Q3.AbstractC1477p.o(V3.n.i());
            synchronized (f7657e) {
                str2 = this.f7659c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                java.lang.String string = context.getResources().getString(M3.b.f7001g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(p214v3.N0.a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarQ.f(str2);
        }
        android.app.Notification notificationB = eVarQ.b();
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            N3.AbstractC1398k.f7665b.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, notificationB);
    }

    final void u(android.content.Context context) {
        new N3.o(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(android.app.Activity activity, P3.InterfaceC1449e interfaceC1449e, int i6, int i10, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog dialogP = p(activity, i6, Q3.D.c(interfaceC1449e, b(activity, i6, "d"), 2), onCancelListener, null);
        if (dialogP == null) {
            return false;
        }
        s(activity, dialogP, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(android.content.Context context, N3.C1389b c1389b, int i6) {
        android.app.PendingIntent pendingIntentL;
        if (W3.b.a(context) || (pendingIntentL = l(context, c1389b)) == null) {
            return false;
        }
        t(context, c1389b.e(), null, android.app.PendingIntent.getActivity(context, 0, com.google.android.gms.common.api.GoogleApiActivity.a(context, pendingIntentL, i6, true), p035d4.g.f44296a | 134217728));
        return true;
    }
}
