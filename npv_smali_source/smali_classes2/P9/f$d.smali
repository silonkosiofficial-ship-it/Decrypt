.class public final LP9/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP9/h$c;
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field private final C:LP9/h;

.field final synthetic D:LP9/f;


# direct methods
.method public constructor <init>(LP9/f;LP9/h;)V
    .locals 1

    const-string v0, "reader"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP9/f$d;->D:LP9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LP9/f$d;->C:LP9/h;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LP9/f$d;->y()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method public e(ILP9/b;LX9/g;)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    const-string v1, "errorCode"

    invoke-static {p2, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "debugData"

    invoke-static {p3, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, LX9/g;->I()I

    iget-object p2, p0, LP9/f$d;->D:LP9/f;

    monitor-enter p2

    :try_start_0
    invoke-virtual {p2}, LP9/f;->Y0()Ljava/util/Map;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p3

    const/4 v1, 0x0

    new-array v2, v1, [LP9/i;

    invoke-interface {p3, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, v0}, LP9/f;->q0(LP9/f;Z)V

    sget-object v2, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    check-cast p3, [LP9/i;

    array-length p2, p3

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v2, p3, v1

    invoke-virtual {v2}, LP9/i;->j()I

    move-result v3

    if-le v3, p1, :cond_0

    invoke-virtual {v2}, LP9/i;->t()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, LP9/b;->L:LP9/b;

    invoke-virtual {v2, v3}, LP9/i;->y(LP9/b;)V

    iget-object v3, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v2}, LP9/i;->j()I

    move-result v2

    invoke-virtual {v3, v2}, LP9/f;->x1(I)LP9/i;

    :cond_0
    add-int/2addr v1, v0

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1
.end method

.method public f(ZIILjava/util/List;)V
    .locals 6

    .prologue
    const-string p3, "headerBlock"

    invoke-static {p4, p3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {p3, p2}, LP9/f;->w1(I)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {p3, p2, p4, p1}, LP9/f;->t1(ILjava/util/List;Z)V

    return-void

    :cond_0
    iget-object p3, p0, LP9/f$d;->D:LP9/f;

    monitor-enter p3

    :try_start_0
    invoke-virtual {p3, p2}, LP9/f;->R0(I)LP9/i;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-static {p3}, LP9/f;->R(LP9/f;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p3

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p3}, LP9/f;->z0()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt p2, v0, :cond_2

    monitor-exit p3

    return-void

    :cond_2
    :try_start_2
    rem-int/lit8 v0, p2, 0x2

    invoke-virtual {p3}, LP9/f;->H0()I

    move-result v1

    rem-int/lit8 v1, v1, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v0, v1, :cond_3

    monitor-exit p3

    return-void

    :cond_3
    :try_start_3
    invoke-static {p4}, LI9/d;->O(Ljava/util/List;)LH9/t;

    move-result-object v5

    new-instance p4, LP9/i;

    const/4 v3, 0x0

    move-object v0, p4

    move v1, p2

    move-object v2, p3

    move v4, p1

    invoke-direct/range {v0 .. v5}, LP9/i;-><init>(ILP9/f;ZZLH9/t;)V

    invoke-virtual {p3, p2}, LP9/f;->z1(I)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3}, LP9/f;->Y0()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LP9/f;->H(LP9/f;)LL9/e;

    move-result-object p1

    invoke-virtual {p1}, LL9/e;->i()LL9/d;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, LP9/f;->y0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] onStream"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, LP9/f$d$b;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1, p3, p4}, LP9/f$d$b;-><init>(Ljava/lang/String;ZLP9/f;LP9/i;)V

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, LL9/d;->i(LL9/a;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p3

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_4
    :try_start_4
    sget-object p2, Li7/M;->a:Li7/M;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p3

    invoke-static {p4}, LI9/d;->O(Ljava/util/List;)LH9/t;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, LP9/i;->x(LH9/t;Z)V

    return-void

    :goto_0
    monitor-exit p3

    throw p1
.end method

.method public g(IJ)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    iget-object p1, p0, LP9/f$d;->D:LP9/f;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, LP9/f;->c1()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-static {p1, v0, v1}, LP9/f;->r0(LP9/f;J)V

    const-string p2, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p1, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    sget-object p2, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p1

    goto :goto_1

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_0
    iget-object v0, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v0, p1}, LP9/f;->R0(I)LP9/i;

    move-result-object p1

    if-eqz p1, :cond_1

    monitor-enter p1

    :try_start_1
    invoke-virtual {p1, p2, p3}, LP9/i;->a(J)V

    sget-object p2, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_1
    :goto_1
    return-void
.end method

.method public k(ZLP9/m;)V
    .locals 9

    const-string v0, "settings"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP9/f$d;->D:LP9/f;

    invoke-static {v0}, LP9/f;->N(LP9/f;)LL9/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v2}, LP9/f;->y0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " applyAndAckSettings"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, LP9/f$d$d;

    const/4 v5, 0x1

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, LP9/f$d$d;-><init>(Ljava/lang/String;ZLP9/f$d;ZLP9/m;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, LL9/d;->i(LL9/a;J)V

    return-void
.end method

.method public m(ILP9/b;)V
    .locals 1

    .prologue
    const-string v0, "errorCode"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v0, p1}, LP9/f;->w1(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v0, p1, p2}, LP9/f;->v1(ILP9/b;)V

    return-void

    :cond_0
    iget-object v0, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v0, p1}, LP9/f;->x1(I)LP9/i;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p2}, LP9/i;->y(LP9/b;)V

    :cond_1
    return-void
.end method

.method public n(ZILX9/f;I)V
    .locals 2

    .prologue
    const-string v0, "source"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v0, p2}, LP9/f;->w1(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v0, p2, p3, p4, p1}, LP9/f;->m1(ILX9/f;IZ)V

    return-void

    :cond_0
    iget-object v0, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v0, p2}, LP9/f;->R0(I)LP9/i;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, LP9/f$d;->D:LP9/f;

    sget-object v0, LP9/b;->F:LP9/b;

    invoke-virtual {p1, p2, v0}, LP9/f;->J1(ILP9/b;)V

    iget-object p1, p0, LP9/f$d;->D:LP9/f;

    int-to-long v0, p4

    invoke-virtual {p1, v0, v1}, LP9/f;->E1(J)V

    invoke-interface {p3, v0, v1}, LX9/f;->skip(J)V

    return-void

    :cond_1
    invoke-virtual {v0, p3, p4}, LP9/i;->w(LX9/f;I)V

    if-eqz p1, :cond_2

    sget-object p1, LI9/d;->b:LH9/t;

    const/4 p2, 0x1

    invoke-virtual {v0, p1, p2}, LP9/i;->x(LH9/t;Z)V

    :cond_2
    return-void
.end method

.method public p(ZII)V
    .locals 8

    .prologue
    if-eqz p1, :cond_3

    iget-object p1, p0, LP9/f$d;->D:LP9/f;

    monitor-enter p1

    const/4 p3, 0x1

    const-wide/16 v0, 0x1

    if-eq p2, p3, :cond_2

    const/4 p3, 0x2

    if-eq p2, p3, :cond_1

    const/4 p3, 0x3

    if-eq p2, p3, :cond_0

    :goto_0
    :try_start_0
    sget-object p2, Li7/M;->a:Li7/M;

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_0
    invoke-static {p1}, LP9/f;->f(LP9/f;)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, LP9/f;->e0(LP9/f;J)V

    const-string p2, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p1, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LP9/f;->o(LP9/f;)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, LP9/f;->g0(LP9/f;J)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, LP9/f;->s(LP9/f;)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, LP9/f;->o0(LP9/f;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p1

    goto :goto_3

    :goto_2
    monitor-exit p1

    throw p2

    :cond_3
    iget-object p1, p0, LP9/f$d;->D:LP9/f;

    invoke-static {p1}, LP9/f;->N(LP9/f;)LL9/d;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v1}, LP9/f;->y0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ping"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, LP9/f$d;->D:LP9/f;

    new-instance v0, LP9/f$d$c;

    const/4 v4, 0x1

    move-object v2, v0

    move v6, p2

    move v7, p3

    invoke-direct/range {v2 .. v7}, LP9/f$d$c;-><init>(Ljava/lang/String;ZLP9/f;II)V

    const-wide/16 p2, 0x0

    invoke-virtual {p1, v0, p2, p3}, LL9/d;->i(LL9/a;J)V

    :goto_3
    return-void
.end method

.method public s(IIIZ)V
    .locals 0

    return-void
.end method

.method public t(IILjava/util/List;)V
    .locals 0

    const-string p1, "requestHeaders"

    invoke-static {p3, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {p1, p2, p3}, LP9/f;->u1(ILjava/util/List;)V

    return-void
.end method

.method public final x(ZLP9/m;)V
    .locals 11

    .prologue
    const/4 v0, 0x1

    const-string v1, "settings"

    invoke-static {p2, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ly7/O;

    invoke-direct {v1}, Ly7/O;-><init>()V

    iget-object v2, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v2}, LP9/f;->d1()LP9/j;

    move-result-object v2

    iget-object v3, p0, LP9/f$d;->D:LP9/f;

    monitor-enter v2

    :try_start_0
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v3}, LP9/f;->P0()LP9/m;

    move-result-object v4

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, LP9/m;

    invoke-direct {p1}, LP9/m;-><init>()V

    invoke-virtual {p1, v4}, LP9/m;->g(LP9/m;)V

    invoke-virtual {p1, p2}, LP9/m;->g(LP9/m;)V

    move-object p2, p1

    :goto_0
    iput-object p2, v1, Ly7/O;->C:Ljava/lang/Object;

    invoke-virtual {p2}, LP9/m;->c()I

    move-result p1

    int-to-long p1, p1

    invoke-virtual {v4}, LP9/m;->c()I

    move-result v4

    int-to-long v4, v4

    sub-long/2addr p1, v4

    const-wide/16 v4, 0x0

    cmp-long v6, p1, v4

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-virtual {v3}, LP9/f;->Y0()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, LP9/f;->Y0()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v6

    new-array v8, v7, [LP9/i;

    invoke-interface {v6, v8}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [LP9/i;

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_2
    :goto_1
    const/4 v6, 0x0

    :goto_2
    iget-object v8, v1, Ly7/O;->C:Ljava/lang/Object;

    check-cast v8, LP9/m;

    invoke-virtual {v3, v8}, LP9/f;->A1(LP9/m;)V

    invoke-static {v3}, LP9/f;->D(LP9/f;)LL9/d;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, LP9/f;->y0()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " onSettings"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v10, LP9/f$d$a;

    invoke-direct {v10, v9, v0, v3, v1}, LP9/f$d$a;-><init>(Ljava/lang/String;ZLP9/f;Ly7/O;)V

    invoke-virtual {v8, v10, v4, v5}, LL9/d;->i(LL9/a;J)V

    sget-object v4, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v3}, LP9/f;->d1()LP9/j;

    move-result-object v4

    iget-object v1, v1, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, LP9/m;

    invoke-virtual {v4, v1}, LP9/j;->a(LP9/m;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_6

    :catch_0
    move-exception v1

    :try_start_4
    invoke-static {v3, v1}, LP9/f;->a(LP9/f;Ljava/io/IOException;)V

    :goto_3
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit v2

    if-eqz v6, :cond_3

    array-length v1, v6

    :goto_4
    if-ge v7, v1, :cond_3

    aget-object v2, v6, v7

    monitor-enter v2

    :try_start_5
    invoke-virtual {v2, p1, p2}, LP9/i;->a(J)V

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    monitor-exit v2

    add-int/2addr v7, v0

    goto :goto_4

    :catchall_2
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_3
    return-void

    :goto_5
    :try_start_6
    monitor-exit v3

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_6
    monitor-exit v2

    throw p1
.end method

.method public y()V
    .locals 5

    .prologue
    sget-object v0, LP9/b;->G:LP9/b;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, LP9/f$d;->C:LP9/h;

    invoke-virtual {v2, p0}, LP9/h;->g(LP9/h$c;)V

    :cond_0
    iget-object v2, p0, LP9/f$d;->C:LP9/h;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, p0}, LP9/h;->f(ZLP9/h$c;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, LP9/b;->E:LP9/b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v0, LP9/b;->M:LP9/b;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v3, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v3, v2, v0, v1}, LP9/f;->s0(LP9/b;LP9/b;Ljava/io/IOException;)V

    :goto_0
    iget-object v0, p0, LP9/f$d;->C:LP9/h;

    invoke-static {v0}, LI9/d;->m(Ljava/io/Closeable;)V

    goto :goto_2

    :catchall_0
    move-exception v3

    goto :goto_3

    :catch_0
    move-exception v1

    goto :goto_1

    :catchall_1
    move-exception v3

    move-object v2, v0

    goto :goto_3

    :catch_1
    move-exception v1

    move-object v2, v0

    :goto_1
    :try_start_2
    sget-object v0, LP9/b;->F:LP9/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v2, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v2, v0, v0, v1}, LP9/f;->s0(LP9/b;LP9/b;Ljava/io/IOException;)V

    goto :goto_0

    :goto_2
    return-void

    :goto_3
    iget-object v4, p0, LP9/f$d;->D:LP9/f;

    invoke-virtual {v4, v2, v0, v1}, LP9/f;->s0(LP9/b;LP9/b;Ljava/io/IOException;)V

    iget-object v0, p0, LP9/f$d;->C:LP9/h;

    invoke-static {v0}, LI9/d;->m(Ljava/io/Closeable;)V

    throw v3
.end method
