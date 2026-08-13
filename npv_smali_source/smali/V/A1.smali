.class abstract synthetic LV/A1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()Lf0/r;
    .locals 1

    new-instance v0, Lf0/r;

    invoke-direct {v0}, Lf0/r;-><init>()V

    return-object v0
.end method

.method public static final varargs b([Ljava/lang/Object;)Lf0/r;
    .locals 1

    new-instance v0, Lf0/r;

    invoke-direct {v0}, Lf0/r;-><init>()V

    invoke-static {p0}, Lj7/n;->R0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-virtual {v0, p0}, Lf0/r;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public static final c(Ljava/lang/Object;LV/u1;)LV/w0;
    .locals 0

    invoke-static {p0, p1}, LV/b;->d(Ljava/lang/Object;LV/u1;)Lf0/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    invoke-static {}, LV/v1;->p()LV/u1;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1}, LV/v1;->h(Ljava/lang/Object;LV/u1;)LV/w0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/Object;LV/n;I)LV/G1;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)"

    const v2, -0x3f14ae72

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_1

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-static {p0, v0, p2, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, LV/w0;

    invoke-interface {p2, p0}, LV/w0;->setValue(Ljava/lang/Object;)V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    return-object p2
.end method
