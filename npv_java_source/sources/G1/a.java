package G1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends android.widget.BaseAdapter implements android.widget.Filterable, G1.b.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected boolean f3013C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected boolean f3014D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected android.database.Cursor f3015E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected android.content.Context f3016F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected int f3017G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected G1.a.C0074a f3018H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected android.database.DataSetObserver f3019I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected G1.b f3020J;

    /* JADX INFO: renamed from: G1.a$a, reason: collision with other inner class name */
    private class C0074a extends android.database.ContentObserver {
        C0074a() {
            super(new android.os.Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            G1.a.this.s();
        }
    }

    private class b extends android.database.DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            G1.a aVar = G1.a.this;
            aVar.f3013C = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            G1.a aVar = G1.a.this;
            aVar.f3013C = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(android.content.Context context, android.database.Cursor cursor, boolean z6) {
        i(context, cursor, z6 ? 1 : 2);
    }

    @Override // G1.b.a
    public void a(android.database.Cursor cursor) {
        android.database.Cursor cursorT = t(cursor);
        if (cursorT != null) {
            cursorT.close();
        }
    }

    @Override // G1.b.a
    public android.database.Cursor b() {
        return this.f3015E;
    }

    @Override // G1.b.a
    public abstract java.lang.CharSequence c(android.database.Cursor cursor);

    public abstract void f(android.view.View view, android.content.Context context, android.database.Cursor cursor);

    @Override // android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor;
        if (!this.f3013C || (cursor = this.f3015E) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int i6, android.view.View view, android.view.ViewGroup viewGroup) {
        if (!this.f3013C) {
            return null;
        }
        this.f3015E.moveToPosition(i6);
        if (view == null) {
            view = o(this.f3016F, this.f3015E, viewGroup);
        }
        f(view, this.f3016F, this.f3015E);
        return view;
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
        if (this.f3020J == null) {
            this.f3020J = new G1.b(this);
        }
        return this.f3020J;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i6) {
        android.database.Cursor cursor;
        if (!this.f3013C || (cursor = this.f3015E) == null) {
            return null;
        }
        cursor.moveToPosition(i6);
        return this.f3015E;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        android.database.Cursor cursor;
        if (this.f3013C && (cursor = this.f3015E) != null && cursor.moveToPosition(i6)) {
            return this.f3015E.getLong(this.f3017G);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i6, android.view.View view, android.view.ViewGroup viewGroup) {
        if (!this.f3013C) {
            throw new java.lang.IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f3015E.moveToPosition(i6)) {
            if (view == null) {
                view = r(this.f3016F, this.f3015E, viewGroup);
            }
            f(view, this.f3016F, this.f3015E);
            return view;
        }
        throw new java.lang.IllegalStateException("couldn't move cursor to position " + i6);
    }

    void i(android.content.Context context, android.database.Cursor cursor, int i6) {
        G1.a.b bVar;
        if ((i6 & 1) == 1) {
            i6 |= 2;
            this.f3014D = true;
        } else {
            this.f3014D = false;
        }
        boolean z6 = cursor != null;
        this.f3015E = cursor;
        this.f3013C = z6;
        this.f3016F = context;
        this.f3017G = z6 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i6 & 2) == 2) {
            this.f3018H = new G1.a.C0074a();
            bVar = new G1.a.b();
        } else {
            bVar = null;
            this.f3018H = null;
        }
        this.f3019I = bVar;
        if (z6) {
            G1.a.C0074a c0074a = this.f3018H;
            if (c0074a != null) {
                cursor.registerContentObserver(c0074a);
            }
            android.database.DataSetObserver dataSetObserver = this.f3019I;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract android.view.View o(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup);

    public abstract android.view.View r(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup);

    protected void s() {
        android.database.Cursor cursor;
        if (!this.f3014D || (cursor = this.f3015E) == null || cursor.isClosed()) {
            return;
        }
        this.f3013C = this.f3015E.requery();
    }

    public android.database.Cursor t(android.database.Cursor cursor) {
        android.database.Cursor cursor2 = this.f3015E;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            G1.a.C0074a c0074a = this.f3018H;
            if (c0074a != null) {
                cursor2.unregisterContentObserver(c0074a);
            }
            android.database.DataSetObserver dataSetObserver = this.f3019I;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3015E = cursor;
        if (cursor != null) {
            G1.a.C0074a c0074a2 = this.f3018H;
            if (c0074a2 != null) {
                cursor.registerContentObserver(c0074a2);
            }
            android.database.DataSetObserver dataSetObserver2 = this.f3019I;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f3017G = cursor.getColumnIndexOrThrow("_id");
            this.f3013C = true;
            notifyDataSetChanged();
        } else {
            this.f3017G = -1;
            this.f3013C = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
