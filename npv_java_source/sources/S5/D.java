package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final S5.D.b f12462f = new S5.D.b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p127m7.i f12463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.os.Messenger f12464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.LinkedBlockingDeque f12466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S5.D.d f12467e;

    public static final class a extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p127m7.i f12468a;

        /* JADX INFO: renamed from: S5.D$a$a, reason: collision with other inner class name */
        static final class C0264a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f12469G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ java.lang.String f12470H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0264a(java.lang.String str, p127m7.e eVar) {
                super(2, eVar);
                this.f12470H = str;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f12469G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    T5.a aVar = T5.a.f12957a;
                    this.f12469G = 1;
                    obj = aVar.c(this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                java.util.Collection<T5.b> collectionValues = ((java.util.Map) obj).values();
                java.lang.String str = this.f12470H;
                for (T5.b bVar : collectionValues) {
                    bVar.c(new T5.b.C0278b(str));
                    java.lang.String str2 = "Notified " + bVar.b() + " of new session " + str;
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((S5.D.a.C0264a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new S5.D.a.C0264a(this.f12470H, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p127m7.i iVar) {
            super(android.os.Looper.getMainLooper());
            p247y7.AbstractC7350t.f(iVar, "backgroundDispatcher");
            this.f12468a = iVar;
        }

        private final void a(java.lang.String str) {
            W8.AbstractC1788i.d(W8.O.a(this.f12468a), null, null, new S5.D.a.C0264a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            java.lang.String string;
            p247y7.AbstractC7350t.f(message, "msg");
            if (message.what == 3) {
                android.os.Bundle data = message.getData();
                if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                    string = "";
                }
                a(string);
                return;
            }
            java.lang.String str = "Received unexpected event from the SessionLifecycleService: " + message;
            super.handleMessage(message);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f12471G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ java.util.List f12473I;

        public static final class a implements java.util.Comparator {
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return p117l7.a.d(java.lang.Long.valueOf(((android.os.Message) obj).getWhen()), java.lang.Long.valueOf(((android.os.Message) obj2).getWhen()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.util.List list, p127m7.e eVar) {
            super(2, eVar);
            this.f12473I = list;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f12471G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                T5.a aVar = T5.a.f12957a;
                this.f12471G = 1;
                obj = aVar.c(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            java.util.Map map = (java.util.Map) obj;
            if (!map.isEmpty()) {
                java.util.Collection collectionValues = map.values();
                if (!(collectionValues instanceof java.util.Collection) || !collectionValues.isEmpty()) {
                    java.util.Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((T5.b) it.next()).a()) {
                            java.util.List listL0 = p097j7.AbstractC6879v.L0(p097j7.AbstractC6879v.f0(p097j7.AbstractC6879v.s(S5.D.this.l(this.f12473I, 2), S5.D.this.l(this.f12473I, 1))), new S5.D.c.a());
                            S5.D d6 = S5.D.this;
                            java.util.Iterator it2 = listL0.iterator();
                            while (it2.hasNext()) {
                                d6.p((android.os.Message) it2.next());
                            }
                        }
                    }
                }
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((S5.D.c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return S5.D.this.new c(this.f12473I, eVar);
        }
    }

    public static final class d implements android.content.ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            java.lang.String str = "Connected to SessionLifecycleService. Queue size " + S5.D.this.f12466d.size();
            S5.D.this.f12464b = new android.os.Messenger(iBinder);
            S5.D.this.f12465c = true;
            S5.D d6 = S5.D.this;
            d6.o(d6.j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            S5.D.this.f12464b = null;
            S5.D.this.f12465c = false;
        }
    }

    public D(p127m7.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "backgroundDispatcher");
        this.f12463a = iVar;
        this.f12466d = new java.util.concurrent.LinkedBlockingDeque(20);
        this.f12467e = new S5.D.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List j() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f12466d.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.os.Message l(java.util.List list, int i6) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((android.os.Message) obj2).what == i6) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                long when = ((android.os.Message) next).getWhen();
                do {
                    java.lang.Object next2 = it.next();
                    long when2 = ((android.os.Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (android.os.Message) obj;
    }

    private final void m(android.os.Message message) {
        java.lang.StringBuilder sb;
        if (this.f12466d.offer(message)) {
            sb = new java.lang.StringBuilder();
            sb.append("Queued message ");
            sb.append(message.what);
            sb.append(". Queue size ");
            sb.append(this.f12466d.size());
        } else {
            sb = new java.lang.StringBuilder();
            sb.append("Failed to enqueue message ");
            sb.append(message.what);
            sb.append(". Dropping.");
        }
        sb.toString();
    }

    private final void n(int i6) {
        java.util.List listJ = j();
        android.os.Message messageObtain = android.os.Message.obtain(null, i6, 0, 0);
        p247y7.AbstractC7350t.e(messageObtain, "obtain(null, messageCode, 0, 0)");
        listJ.add(messageObtain);
        o(listJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W8.InterfaceC1822z0 o(java.util.List list) {
        return W8.AbstractC1788i.d(W8.O.a(this.f12463a), null, null, new S5.D.c(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(android.os.Message message) {
        if (this.f12464b != null) {
            try {
                java.lang.String str = "Sending lifecycle " + message.what + " to service";
                android.os.Messenger messenger = this.f12464b;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (android.os.RemoteException e6) {
                java.lang.String str2 = "Unable to deliver message: " + message.what;
            }
        }
        m(message);
    }

    public final void h() {
        n(2);
    }

    public final void i(S5.F f6) {
        p247y7.AbstractC7350t.f(f6, "sessionLifecycleServiceBinder");
        f6.a(new android.os.Messenger(new S5.D.a(this.f12463a)), this.f12467e);
    }

    public final void k() {
        n(1);
    }
}
