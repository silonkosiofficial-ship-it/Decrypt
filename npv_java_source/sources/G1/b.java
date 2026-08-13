package G1;

/* JADX INFO: loaded from: classes.dex */
class b extends android.widget.Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    G1.b.a f3023a;

    interface a {
        void a(android.database.Cursor cursor);

        android.database.Cursor b();

        java.lang.CharSequence c(android.database.Cursor cursor);

        android.database.Cursor d(java.lang.CharSequence charSequence);
    }

    b(G1.b.a aVar) {
        this.f3023a = aVar;
    }

    @Override // android.widget.Filter
    public java.lang.CharSequence convertResultToString(java.lang.Object obj) {
        return this.f3023a.c((android.database.Cursor) obj);
    }

    @Override // android.widget.Filter
    protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        android.database.Cursor cursorD = this.f3023a.d(charSequence);
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        if (cursorD != null) {
            filterResults.count = cursorD.getCount();
        } else {
            filterResults.count = 0;
            cursorD = null;
        }
        filterResults.values = cursorD;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        android.database.Cursor cursorB = this.f3023a.b();
        java.lang.Object obj = filterResults.values;
        if (obj == null || obj == cursorB) {
            return;
        }
        this.f3023a.a((android.database.Cursor) obj);
    }
}
