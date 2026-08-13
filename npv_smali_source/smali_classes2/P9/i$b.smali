.class public final LP9/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX9/X;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private C:Z

.field private final D:LX9/d;

.field private E:LH9/t;

.field private F:Z

.field final synthetic G:LP9/i;


# direct methods
.method public constructor <init>(LP9/i;Z)V
    .locals 0

    iput-object p1, p0, LP9/i$b;->G:LP9/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, LP9/i$b;->C:Z

    new-instance p1, LX9/d;

    invoke-direct {p1}, LX9/d;-><init>()V

    iput-object p1, p0, LP9/i$b;->D:LX9/d;

    return-void
.end method

.method private final a(Z)V
    .locals 11

    .prologue
    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, LP9/i;->s()LP9/i$d;

    move-result-object v1

    invoke-virtual {v1}, LX9/c;->v()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    invoke-virtual {v0}, LP9/i;->r()J

    move-result-wide v1

    invoke-virtual {v0}, LP9/i;->q()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-ltz v1, :cond_0

    iget-boolean v1, p0, LP9/i$b;->C:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, LP9/i$b;->F:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, LP9/i;->h()LP9/b;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, LP9/i;->D()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    :try_start_2
    invoke-virtual {v0}, LP9/i;->s()LP9/i$d;

    move-result-object v1

    invoke-virtual {v1}, LP9/i$d;->C()V

    invoke-virtual {v0}, LP9/i;->c()V

    invoke-virtual {v0}, LP9/i;->q()J

    move-result-wide v1

    invoke-virtual {v0}, LP9/i;->r()J

    move-result-wide v3

    sub-long/2addr v1, v3

    iget-object v3, p0, LP9/i$b;->D:LX9/d;

    invoke-virtual {v3}, LX9/d;->d1()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    invoke-virtual {v0}, LP9/i;->r()J

    move-result-wide v1

    add-long/2addr v1, v9

    invoke-virtual {v0, v1, v2}, LP9/i;->B(J)V

    if-eqz p1, :cond_1

    iget-object p1, p0, LP9/i$b;->D:LX9/d;

    invoke-virtual {p1}, LX9/d;->d1()J

    move-result-wide v1

    cmp-long p1, v9, v1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    :goto_1
    move v7, p1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    iget-object p1, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {p1}, LP9/i;->s()LP9/i$d;

    move-result-object p1

    invoke-virtual {p1}, LX9/c;->v()V

    :try_start_3
    iget-object p1, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {p1}, LP9/i;->g()LP9/f;

    move-result-object v5

    iget-object p1, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {p1}, LP9/i;->j()I

    move-result v6

    iget-object v8, p0, LP9/i$b;->D:LX9/d;

    invoke-virtual/range {v5 .. v10}, LP9/f;->F1(IZLX9/d;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    iget-object p1, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {p1}, LP9/i;->s()LP9/i$d;

    move-result-object p1

    invoke-virtual {p1}, LP9/i$d;->C()V

    return-void

    :catchall_2
    move-exception p1

    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {v0}, LP9/i;->s()LP9/i$d;

    move-result-object v0

    invoke-virtual {v0}, LP9/i$d;->C()V

    throw p1

    :goto_3
    :try_start_4
    invoke-virtual {v0}, LP9/i;->s()LP9/i$d;

    move-result-object v1

    invoke-virtual {v1}, LP9/i$d;->C()V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    monitor-exit v0

    throw p1
.end method


# virtual methods
.method public F0(LX9/d;J)V
    .locals 2

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP9/i$b;->G:LP9/i;

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
    iget-object v0, p0, LP9/i$b;->D:LX9/d;

    invoke-virtual {v0, p1, p2, p3}, LX9/d;->F0(LX9/d;J)V

    :goto_1
    iget-object p1, p0, LP9/i$b;->D:LX9/d;

    invoke-virtual {p1}, LX9/d;->d1()J

    move-result-wide p1

    const-wide/16 v0, 0x4000

    cmp-long p1, p1, v0

    if-ltz p1, :cond_2

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LP9/i$b;->a(Z)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public close()V
    .locals 10

    .prologue
    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    sget-boolean v1, LI9/d;->h:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Thread "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " MUST NOT hold lock on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LP9/i$b;->F:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_2

    monitor-exit v0

    return-void

    :cond_2
    :try_start_1
    invoke-virtual {v0}, LP9/i;->h()LP9/b;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_3

    move v1, v3

    goto :goto_1

    :cond_3
    move v1, v2

    :goto_1
    sget-object v4, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {v0}, LP9/i;->o()LP9/i$b;

    move-result-object v0

    iget-boolean v0, v0, LP9/i$b;->C:Z

    if-nez v0, :cond_8

    iget-object v0, p0, LP9/i$b;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_4

    move v0, v3

    goto :goto_2

    :cond_4
    move v0, v2

    :goto_2
    iget-object v4, p0, LP9/i$b;->E:LH9/t;

    if-eqz v4, :cond_6

    :goto_3
    iget-object v0, p0, LP9/i$b;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v4

    cmp-long v0, v4, v6

    if-lez v0, :cond_5

    invoke-direct {p0, v2}, LP9/i$b;->a(Z)V

    goto :goto_3

    :cond_5
    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {v0}, LP9/i;->g()LP9/f;

    move-result-object v0

    iget-object v2, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {v2}, LP9/i;->j()I

    move-result v2

    iget-object v4, p0, LP9/i$b;->E:LH9/t;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v4}, LI9/d;->N(LH9/t;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v2, v1, v4}, LP9/f;->G1(IZLjava/util/List;)V

    goto :goto_5

    :cond_6
    if-eqz v0, :cond_7

    :goto_4
    iget-object v0, p0, LP9/i$b;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-lez v0, :cond_8

    invoke-direct {p0, v3}, LP9/i$b;->a(Z)V

    goto :goto_4

    :cond_7
    if-eqz v1, :cond_8

    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {v0}, LP9/i;->g()LP9/f;

    move-result-object v4

    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {v0}, LP9/i;->j()I

    move-result v5

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v4 .. v9}, LP9/f;->F1(IZLX9/d;J)V

    :cond_8
    :goto_5
    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    monitor-enter v0

    :try_start_2
    iput-boolean v3, p0, LP9/i$b;->F:Z

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {v0}, LP9/i;->g()LP9/f;

    move-result-object v0

    invoke-virtual {v0}, LP9/f;->flush()V

    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {v0}, LP9/i;->b()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, LP9/i$b;->F:Z

    return v0
.end method

.method public flush()V
    .locals 4

    .prologue
    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    sget-boolean v1, LI9/d;->h:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Thread "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " MUST NOT hold lock on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, LP9/i;->c()V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    :goto_1
    iget-object v0, p0, LP9/i$b;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LP9/i$b;->a(Z)V

    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {v0}, LP9/i;->g()LP9/f;

    move-result-object v0

    invoke-virtual {v0}, LP9/f;->flush()V

    goto :goto_1

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, LP9/i$b;->C:Z

    return v0
.end method

.method public k()LX9/a0;
    .locals 1

    iget-object v0, p0, LP9/i$b;->G:LP9/i;

    invoke-virtual {v0}, LP9/i;->s()LP9/i$d;

    move-result-object v0

    return-object v0
.end method
