package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
class k implements androidx.core.app.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f21465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.app.Notification.Builder f21466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.core.app.j.e f21467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.widget.RemoteViews f21468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.widget.RemoteViews f21469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f21470f = new java.util.ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.os.Bundle f21471g = new android.os.Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private android.widget.RemoteViews f21473i;

    static class a {
        static android.app.Notification.Builder a(android.app.Notification.Builder builder, android.app.Notification.Action action) {
            return builder.addAction(action);
        }

        static android.app.Notification.Action.Builder b(android.app.Notification.Action.Builder builder, android.os.Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static android.app.Notification.Action.Builder c(android.app.Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static android.app.Notification.Action d(android.app.Notification.Action.Builder builder) {
            return builder.build();
        }

        static android.app.Notification.Action.Builder e(int i6, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            return new android.app.Notification.Action.Builder(i6, charSequence, pendingIntent);
        }

        static java.lang.String f(android.app.Notification notification) {
            return notification.getGroup();
        }

        static android.app.Notification.Builder g(android.app.Notification.Builder builder, java.lang.String str) {
            return builder.setGroup(str);
        }

        static android.app.Notification.Builder h(android.app.Notification.Builder builder, boolean z6) {
            return builder.setGroupSummary(z6);
        }

        static android.app.Notification.Builder i(android.app.Notification.Builder builder, boolean z6) {
            return builder.setLocalOnly(z6);
        }

        static android.app.Notification.Builder j(android.app.Notification.Builder builder, java.lang.String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static android.app.Notification.Builder a(android.app.Notification.Builder builder, java.lang.String str) {
            return builder.addPerson(str);
        }

        static android.app.Notification.Builder b(android.app.Notification.Builder builder, java.lang.String str) {
            return builder.setCategory(str);
        }

        static android.app.Notification.Builder c(android.app.Notification.Builder builder, int i6) {
            return builder.setColor(i6);
        }

        static android.app.Notification.Builder d(android.app.Notification.Builder builder, android.app.Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static android.app.Notification.Builder e(android.app.Notification.Builder builder, android.net.Uri uri, java.lang.Object obj) {
            return builder.setSound(uri, (android.media.AudioAttributes) obj);
        }

        static android.app.Notification.Builder f(android.app.Notification.Builder builder, int i6) {
            return builder.setVisibility(i6);
        }
    }

    static class c {
        static android.app.Notification.Action.Builder a(android.graphics.drawable.Icon icon, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            return new android.app.Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static android.app.Notification.Builder b(android.app.Notification.Builder builder, android.graphics.drawable.Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static android.app.Notification.Builder c(android.app.Notification.Builder builder, java.lang.Object obj) {
            return builder.setSmallIcon((android.graphics.drawable.Icon) obj);
        }
    }

    static class d {
        static android.app.Notification.Action.Builder a(android.app.Notification.Action.Builder builder, boolean z6) {
            return builder.setAllowGeneratedReplies(z6);
        }

        static android.app.Notification.Builder b(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static android.app.Notification.Builder c(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static android.app.Notification.Builder d(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static android.app.Notification.Builder e(android.app.Notification.Builder builder, java.lang.CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static android.app.Notification.Builder a(android.content.Context context, java.lang.String str) {
            return new android.app.Notification.Builder(context, str);
        }

        static android.app.Notification.Builder b(android.app.Notification.Builder builder, int i6) {
            return builder.setBadgeIconType(i6);
        }

        static android.app.Notification.Builder c(android.app.Notification.Builder builder, boolean z6) {
            return builder.setColorized(z6);
        }

        static android.app.Notification.Builder d(android.app.Notification.Builder builder, int i6) {
            return builder.setGroupAlertBehavior(i6);
        }

        static android.app.Notification.Builder e(android.app.Notification.Builder builder, java.lang.CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static android.app.Notification.Builder f(android.app.Notification.Builder builder, java.lang.String str) {
            return builder.setShortcutId(str);
        }

        static android.app.Notification.Builder g(android.app.Notification.Builder builder, long j6) {
            return builder.setTimeoutAfter(j6);
        }
    }

    static class f {
        static android.app.Notification.Builder a(android.app.Notification.Builder builder, android.app.Person person) {
            return builder.addPerson(person);
        }

        static android.app.Notification.Action.Builder b(android.app.Notification.Action.Builder builder, int i6) {
            return builder.setSemanticAction(i6);
        }
    }

    static class g {
        static android.app.Notification.Builder a(android.app.Notification.Builder builder, boolean z6) {
            return builder.setAllowSystemGeneratedContextualActions(z6);
        }

        static android.app.Notification.Builder b(android.app.Notification.Builder builder, android.app.Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static android.app.Notification.Action.Builder c(android.app.Notification.Action.Builder builder, boolean z6) {
            return builder.setContextual(z6);
        }

        static android.app.Notification.Builder d(android.app.Notification.Builder builder, java.lang.Object obj) {
            return builder.setLocusId((android.content.LocusId) obj);
        }
    }

    static class h {
        static android.app.Notification.Action.Builder a(android.app.Notification.Action.Builder builder, boolean z6) {
            return builder.setAuthenticationRequired(z6);
        }

        static android.app.Notification.Builder b(android.app.Notification.Builder builder, int i6) {
            return builder.setForegroundServiceBehavior(i6);
        }
    }

    k(androidx.core.app.j.e eVar) {
        int i6;
        this.f21467c = eVar;
        android.content.Context context = eVar.f21435a;
        this.f21465a = context;
        this.f21466b = android.os.Build.VERSION.SDK_INT >= 26 ? androidx.core.app.k.e.a(context, eVar.f21424K) : new android.app.Notification.Builder(eVar.f21435a);
        android.app.Notification notification = eVar.f21431R;
        this.f21466b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f21443i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f21439e).setContentText(eVar.f21440f).setContentInfo(eVar.f21445k).setContentIntent(eVar.f21441g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f21442h, (notification.flags & 128) != 0).setNumber(eVar.f21446l).setProgress(eVar.f21454t, eVar.f21455u, eVar.f21456v);
        android.app.Notification.Builder builder = this.f21466b;
        androidx.core.graphics.drawable.IconCompat iconCompat = eVar.f21444j;
        androidx.core.app.k.c.b(builder, iconCompat == null ? null : iconCompat.m(context));
        this.f21466b.setSubText(eVar.f21451q).setUsesChronometer(eVar.f21449o).setPriority(eVar.f21447m);
        java.util.Iterator it = eVar.f21436b.iterator();
        while (it.hasNext()) {
            b((androidx.core.app.j.a) it.next());
        }
        android.os.Bundle bundle = eVar.f21417D;
        if (bundle != null) {
            this.f21471g.putAll(bundle);
        }
        int i10 = android.os.Build.VERSION.SDK_INT;
        this.f21468d = eVar.f21421H;
        this.f21469e = eVar.f21422I;
        this.f21466b.setShowWhen(eVar.f21448n);
        androidx.core.app.k.a.i(this.f21466b, eVar.f21460z);
        androidx.core.app.k.a.g(this.f21466b, eVar.f21457w);
        androidx.core.app.k.a.j(this.f21466b, eVar.f21459y);
        androidx.core.app.k.a.h(this.f21466b, eVar.f21458x);
        this.f21472h = eVar.f21428O;
        androidx.core.app.k.b.b(this.f21466b, eVar.f21416C);
        androidx.core.app.k.b.c(this.f21466b, eVar.f21418E);
        androidx.core.app.k.b.f(this.f21466b, eVar.f21419F);
        androidx.core.app.k.b.d(this.f21466b, eVar.f21420G);
        androidx.core.app.k.b.e(this.f21466b, notification.sound, notification.audioAttributes);
        java.util.List listE = i10 < 28 ? e(g(eVar.f21437c), eVar.f21434U) : eVar.f21434U;
        if (listE != null && !listE.isEmpty()) {
            java.util.Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                androidx.core.app.k.b.a(this.f21466b, (java.lang.String) it2.next());
            }
        }
        this.f21473i = eVar.f21423J;
        if (eVar.f21438d.size() > 0) {
            android.os.Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new android.os.Bundle() : bundle2;
            android.os.Bundle bundle3 = new android.os.Bundle(bundle2);
            android.os.Bundle bundle4 = new android.os.Bundle();
            for (int i11 = 0; i11 < eVar.f21438d.size(); i11++) {
                bundle4.putBundle(java.lang.Integer.toString(i11), androidx.core.app.l.a((androidx.core.app.j.a) eVar.f21438d.get(i11)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f21471g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i12 = android.os.Build.VERSION.SDK_INT;
        java.lang.Object obj = eVar.f21433T;
        if (obj != null) {
            androidx.core.app.k.c.c(this.f21466b, obj);
        }
        if (i12 >= 24) {
            this.f21466b.setExtras(eVar.f21417D);
            androidx.core.app.k.d.e(this.f21466b, eVar.f21453s);
            android.widget.RemoteViews remoteViews = eVar.f21421H;
            if (remoteViews != null) {
                androidx.core.app.k.d.c(this.f21466b, remoteViews);
            }
            android.widget.RemoteViews remoteViews2 = eVar.f21422I;
            if (remoteViews2 != null) {
                androidx.core.app.k.d.b(this.f21466b, remoteViews2);
            }
            android.widget.RemoteViews remoteViews3 = eVar.f21423J;
            if (remoteViews3 != null) {
                androidx.core.app.k.d.d(this.f21466b, remoteViews3);
            }
        }
        if (i12 >= 26) {
            androidx.core.app.k.e.b(this.f21466b, eVar.f21425L);
            androidx.core.app.k.e.e(this.f21466b, eVar.f21452r);
            androidx.core.app.k.e.f(this.f21466b, eVar.f21426M);
            androidx.core.app.k.e.g(this.f21466b, eVar.f21427N);
            androidx.core.app.k.e.d(this.f21466b, eVar.f21428O);
            if (eVar.f21415B) {
                androidx.core.app.k.e.c(this.f21466b, eVar.f21414A);
            }
            if (!android.text.TextUtils.isEmpty(eVar.f21424K)) {
                this.f21466b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i12 >= 28) {
            java.util.Iterator it3 = eVar.f21437c.iterator();
            if (it3.hasNext()) {
                androidx.appcompat.app.D.a(it3.next());
                throw null;
            }
        }
        if (i12 >= 29) {
            androidx.core.app.k.g.a(this.f21466b, eVar.f21430Q);
            androidx.core.app.k.g.b(this.f21466b, androidx.core.app.j.d.a(null));
        }
        if (i12 >= 31 && (i6 = eVar.f21429P) != 0) {
            androidx.core.app.k.h.b(this.f21466b, i6);
        }
        if (eVar.f21432S) {
            if (this.f21467c.f21458x) {
                this.f21472h = 2;
            } else {
                this.f21472h = 1;
            }
            this.f21466b.setVibrate(null);
            this.f21466b.setSound(null);
            int i13 = notification.defaults & (-4);
            notification.defaults = i13;
            this.f21466b.setDefaults(i13);
            if (i12 >= 26) {
                if (android.text.TextUtils.isEmpty(this.f21467c.f21457w)) {
                    androidx.core.app.k.a.g(this.f21466b, "silent");
                }
                androidx.core.app.k.e.d(this.f21466b, this.f21472h);
            }
        }
    }

    private void b(androidx.core.app.j.a aVar) {
        androidx.core.graphics.drawable.IconCompat iconCompatD = aVar.d();
        android.app.Notification.Action.Builder builderA = androidx.core.app.k.c.a(iconCompatD != null ? iconCompatD.l() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (android.app.RemoteInput remoteInput : androidx.core.app.q.b(aVar.e())) {
                androidx.core.app.k.a.c(builderA, remoteInput);
            }
        }
        android.os.Bundle bundle = aVar.c() != null ? new android.os.Bundle(aVar.c()) : new android.os.Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 24) {
            androidx.core.app.k.d.a(builderA, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i6 >= 28) {
            androidx.core.app.k.f.b(builderA, aVar.f());
        }
        if (i6 >= 29) {
            androidx.core.app.k.g.c(builderA, aVar.j());
        }
        if (i6 >= 31) {
            androidx.core.app.k.h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        androidx.core.app.k.a.b(builderA, bundle);
        androidx.core.app.k.a.a(this.f21466b, androidx.core.app.k.a.d(builderA));
    }

    private static java.util.List e(java.util.List list, java.util.List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        p170r.C7027b c7027b = new p170r.C7027b(list.size() + list2.size());
        c7027b.addAll(list);
        c7027b.addAll(list2);
        return new java.util.ArrayList(c7027b);
    }

    private static java.util.List g(java.util.List list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        androidx.appcompat.app.D.a(it.next());
        throw null;
    }

    private void h(android.app.Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.i
    public android.app.Notification.Builder a() {
        return this.f21466b;
    }

    public android.app.Notification c() {
        android.os.Bundle bundleA;
        android.widget.RemoteViews remoteViewsF;
        android.widget.RemoteViews remoteViewsD;
        androidx.core.app.j.f fVar = this.f21467c.f21450p;
        if (fVar != null) {
            fVar.b(this);
        }
        android.widget.RemoteViews remoteViewsE = fVar != null ? fVar.e(this) : null;
        android.app.Notification notificationD = d();
        if (remoteViewsE != null || (remoteViewsE = this.f21467c.f21421H) != null) {
            notificationD.contentView = remoteViewsE;
        }
        if (fVar != null && (remoteViewsD = fVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (fVar != null && (remoteViewsF = this.f21467c.f21450p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (fVar != null && (bundleA = androidx.core.app.j.a(notificationD)) != null) {
            fVar.a(bundleA);
        }
        return notificationD;
    }

    protected android.app.Notification d() {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            return this.f21466b.build();
        }
        if (i6 >= 24) {
            android.app.Notification notificationBuild = this.f21466b.build();
            if (this.f21472h != 0) {
                if (androidx.core.app.k.a.f(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f21472h == 2) {
                    h(notificationBuild);
                }
                if (androidx.core.app.k.a.f(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f21472h == 1) {
                    h(notificationBuild);
                }
            }
            return notificationBuild;
        }
        this.f21466b.setExtras(this.f21471g);
        android.app.Notification notificationBuild2 = this.f21466b.build();
        android.widget.RemoteViews remoteViews = this.f21468d;
        if (remoteViews != null) {
            notificationBuild2.contentView = remoteViews;
        }
        android.widget.RemoteViews remoteViews2 = this.f21469e;
        if (remoteViews2 != null) {
            notificationBuild2.bigContentView = remoteViews2;
        }
        android.widget.RemoteViews remoteViews3 = this.f21473i;
        if (remoteViews3 != null) {
            notificationBuild2.headsUpContentView = remoteViews3;
        }
        if (this.f21472h != 0) {
            if (androidx.core.app.k.a.f(notificationBuild2) != null && (notificationBuild2.flags & 512) != 0 && this.f21472h == 2) {
                h(notificationBuild2);
            }
            if (androidx.core.app.k.a.f(notificationBuild2) != null && (notificationBuild2.flags & 512) == 0 && this.f21472h == 1) {
                h(notificationBuild2);
            }
        }
        return notificationBuild2;
    }

    android.content.Context f() {
        return this.f21465a;
    }
}
