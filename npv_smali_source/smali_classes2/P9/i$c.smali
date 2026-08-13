.class public final LP9/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX9/Z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field private final C:J

.field private D:Z

.field private final E:LX9/d;

.field private final F:LX9/d;

.field private G:LH9/t;

.field private H:Z

.field final synthetic I:LP9/i;


# direct methods
.method public constructor <init>(LP9/i;JZ)V
    .locals 0

    iput-object p1, p0, LP9/i$c;->I:LP9/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, LP9/i$c;->C:J

    iput-boolean p4, p0, LP9/i$c;->D:Z

    new-instance p1, LX9/d;

    invoke-direct {p1}, LX9/d;-><init>()V

    iput-object p1, p0, LP9/i$c;->E:LX9/d;

    new-instance p1, LX9/d;

    invoke-direct {p1}, LX9/d;-><init>()V

    iput-object p1, p0, LP9/i$c;->F:LX9/d;

    return-void
.end method

.method private final r(J)V
    .locals 2

    .prologue
    iget-object v0, p0, LP9/i$c;->I:LP9/i;

    sget-boolean v1, LI9/d;->h:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST NOT hold lock on "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, LP9/i$c;->I:LP9/i;

    invoke-virtual {v0}, LP9/i;->g()LP9/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LP9/f;->E1(J)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, LP9/i$c;->H:Z

    return v0
.end method

.method public b0(LX9/d;J)J
    .locals 18

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    const-string v4, "sink"

    invoke-static {v0, v4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_9

    :goto_0
    iget-object v6, v1, LP9/i$c;->I:LP9/i;

    monitor-enter v6

    :try_start_0
    invoke-virtual {v6}, LP9/i;->m()LP9/i$d;

    move-result-object v7

    invoke-virtual {v7}, LX9/c;->v()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v6}, LP9/i;->h()LP9/b;

    move-result-object v7

    if-eqz v7, :cond_0

    iget-boolean v7, v1, LP9/i$c;->D:Z

    if-nez v7, :cond_0

    invoke-virtual {v6}, LP9/i;->i()Ljava/io/IOException;

    move-result-object v7

    if-nez v7, :cond_1

    new-instance v7, LP9/n;

    invoke-virtual {v6}, LP9/i;->h()LP9/b;

    move-result-object v8

    invoke-static {v8}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v7, v8}, LP9/n;-><init>(LP9/b;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_0
    const/4 v7, 0x0

    :cond_1
    :goto_1
    iget-boolean v8, v1, LP9/i$c;->H:Z

    if-nez v8, :cond_8

    iget-object v8, v1, LP9/i$c;->F:LX9/d;

    invoke-virtual {v8}, LX9/d;->d1()J

    move-result-wide v8

    cmp-long v8, v8, v4

    const-wide/16 v9, -0x1

    const/4 v11, 0x0

    if-lez v8, :cond_2

    iget-object v8, v1, LP9/i$c;->F:LX9/d;

    invoke-virtual {v8}, LX9/d;->d1()J

    move-result-wide v12

    invoke-static {v2, v3, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    invoke-virtual {v8, v0, v12, v13}, LX9/d;->b0(LX9/d;J)J

    move-result-wide v12

    invoke-virtual {v6}, LP9/i;->l()J

    move-result-wide v14

    add-long/2addr v14, v12

    invoke-virtual {v6, v14, v15}, LP9/i;->A(J)V

    invoke-virtual {v6}, LP9/i;->l()J

    move-result-wide v14

    invoke-virtual {v6}, LP9/i;->k()J

    move-result-wide v16

    sub-long v14, v14, v16

    if-nez v7, :cond_4

    invoke-virtual {v6}, LP9/i;->g()LP9/f;

    move-result-object v8

    invoke-virtual {v8}, LP9/f;->K0()LP9/m;

    move-result-object v8

    invoke-virtual {v8}, LP9/m;->c()I

    move-result v8

    div-int/lit8 v8, v8, 0x2

    int-to-long v4, v8

    cmp-long v4, v14, v4

    if-ltz v4, :cond_4

    invoke-virtual {v6}, LP9/i;->g()LP9/f;

    move-result-object v4

    invoke-virtual {v6}, LP9/i;->j()I

    move-result v5

    invoke-virtual {v4, v5, v14, v15}, LP9/f;->K1(IJ)V

    invoke-virtual {v6}, LP9/i;->l()J

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, LP9/i;->z(J)V

    goto :goto_2

    :cond_2
    iget-boolean v4, v1, LP9/i$c;->D:Z

    if-nez v4, :cond_3

    if-nez v7, :cond_3

    invoke-virtual {v6}, LP9/i;->D()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v11, 0x1

    :cond_3
    move-wide v12, v9

    :cond_4
    :goto_2
    :try_start_2
    invoke-virtual {v6}, LP9/i;->m()LP9/i$d;

    move-result-object v4

    invoke-virtual {v4}, LP9/i$d;->C()V

    sget-object v4, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v6

    if-eqz v11, :cond_5

    const-wide/16 v4, 0x0

    goto/16 :goto_0

    :cond_5
    cmp-long v0, v12, v9

    if-eqz v0, :cond_6

    return-wide v12

    :cond_6
    if-nez v7, :cond_7

    return-wide v9

    :cond_7
    throw v7

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_8
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "stream closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    :try_start_4
    invoke-virtual {v6}, LP9/i;->m()LP9/i$d;

    move-result-object v2

    invoke-virtual {v2}, LP9/i$d;->C()V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    monitor-exit v6

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "byteCount < 0: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public close()V
    .locals 5

    .prologue
    iget-object v0, p0, LP9/i$c;->I:LP9/i;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, LP9/i$c;->H:Z

    iget-object v1, p0, LP9/i$c;->F:LX9/d;

    invoke-virtual {v1}, LX9/d;->d1()J

    move-result-wide v1

    iget-object v3, p0, LP9/i$c;->F:LX9/d;

    invoke-virtual {v3}, LX9/d;->a()V

    const-string v3, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {v0, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-lez v0, :cond_0

    invoke-direct {p0, v1, v2}, LP9/i$c;->r(J)V

    :cond_0
    iget-object v0, p0, LP9/i$c;->I:LP9/i;

    invoke-virtual {v0}, LP9/i;->b()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, LP9/i$c;->D:Z

    return v0
.end method

.method public final g(LX9/f;J)V
    .locals 11

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP9/i$c;->I:LP9/i;

    sget-boolean v1, LI9/d;->h:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Thread "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " MUST NOT hold lock on "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    move-wide v0, p2

    :goto_1
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_9

    iget-object v4, p0, LP9/i$c;->I:LP9/i;

    monitor-enter v4

    :try_start_0
    iget-boolean v5, p0, LP9/i$c;->D:Z

    iget-object v6, p0, LP9/i$c;->F:LX9/d;

    invoke-virtual {v6}, LX9/d;->d1()J

    move-result-wide v6

    add-long/2addr v6, v0

    iget-wide v8, p0, LP9/i$c;->C:J

    cmp-long v6, v6, v8

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-lez v6, :cond_2

    move v6, v8

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    sget-object v9, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v4

    if-eqz v6, :cond_3

    invoke-interface {p1, v0, v1}, LX9/f;->skip(J)V

    iget-object p1, p0, LP9/i$c;->I:LP9/i;

    sget-object p2, LP9/b;->H:LP9/b;

    invoke-virtual {p1, p2}, LP9/i;->f(LP9/b;)V

    return-void

    :cond_3
    if-eqz v5, :cond_4

    invoke-interface {p1, v0, v1}, LX9/f;->skip(J)V

    return-void

    :cond_4
    iget-object v4, p0, LP9/i$c;->E:LX9/d;

    invoke-interface {p1, v4, v0, v1}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide v4

    const-wide/16 v9, -0x1

    cmp-long v6, v4, v9

    if-eqz v6, :cond_8

    sub-long/2addr v0, v4

    iget-object v4, p0, LP9/i$c;->I:LP9/i;

    monitor-enter v4

    :try_start_1
    iget-boolean v5, p0, LP9/i$c;->H:Z

    if-eqz v5, :cond_5

    iget-object v2, p0, LP9/i$c;->E:LX9/d;

    invoke-virtual {v2}, LX9/d;->a()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_5
    iget-object v5, p0, LP9/i$c;->F:LX9/d;

    invoke-virtual {v5}, LX9/d;->d1()J

    move-result-wide v5

    cmp-long v2, v5, v2

    if-nez v2, :cond_6

    move v7, v8

    :cond_6
    iget-object v2, p0, LP9/i$c;->F:LX9/d;

    iget-object v3, p0, LP9/i$c;->E:LX9/d;

    invoke-virtual {v2, v3}, LX9/d;->c0(LX9/Z;)J

    if-eqz v7, :cond_7

    const-string v2, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {v4, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_7
    :goto_3
    monitor-exit v4

    goto :goto_1

    :goto_4
    monitor-exit v4

    throw p1

    :cond_8
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1

    :cond_9
    invoke-direct {p0, p2, p3}, LP9/i$c;->r(J)V

    return-void
.end method

.method public final i(Z)V
    .locals 0

    iput-boolean p1, p0, LP9/i$c;->D:Z

    return-void
.end method

.method public k()LX9/a0;
    .locals 1

    iget-object v0, p0, LP9/i$c;->I:LP9/i;

    invoke-virtual {v0}, LP9/i;->m()LP9/i$d;

    move-result-object v0

    return-object v0
.end method

.method public final o(LH9/t;)V
    .locals 0

    iput-object p1, p0, LP9/i$c;->G:LH9/t;

    return-void
.end method
