.class public final LP9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP9/i$a;,
        LP9/i$b;,
        LP9/i$c;,
        LP9/i$d;
    }
.end annotation


# static fields
.field public static final o:LP9/i$a;


# instance fields
.field private final a:I

.field private final b:LP9/f;

.field private c:J

.field private d:J

.field private e:J

.field private f:J

.field private final g:Ljava/util/ArrayDeque;

.field private h:Z

.field private final i:LP9/i$c;

.field private final j:LP9/i$b;

.field private final k:LP9/i$d;

.field private final l:LP9/i$d;

.field private m:LP9/b;

.field private n:Ljava/io/IOException;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LP9/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP9/i$a;-><init>(Ly7/k;)V

    sput-object v0, LP9/i;->o:LP9/i$a;

    return-void
.end method

.method public constructor <init>(ILP9/f;ZZLH9/t;)V
    .locals 3

    .prologue
    const-string v0, "connection"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LP9/i;->a:I

    iput-object p2, p0, LP9/i;->b:LP9/f;

    invoke-virtual {p2}, LP9/f;->P0()LP9/m;

    move-result-object p1

    invoke-virtual {p1}, LP9/m;->c()I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, LP9/i;->f:J

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, LP9/i;->g:Ljava/util/ArrayDeque;

    new-instance v0, LP9/i$c;

    invoke-virtual {p2}, LP9/f;->K0()LP9/m;

    move-result-object p2

    invoke-virtual {p2}, LP9/m;->c()I

    move-result p2

    int-to-long v1, p2

    invoke-direct {v0, p0, v1, v2, p4}, LP9/i$c;-><init>(LP9/i;JZ)V

    iput-object v0, p0, LP9/i;->i:LP9/i$c;

    new-instance p2, LP9/i$b;

    invoke-direct {p2, p0, p3}, LP9/i$b;-><init>(LP9/i;Z)V

    iput-object p2, p0, LP9/i;->j:LP9/i$b;

    new-instance p2, LP9/i$d;

    invoke-direct {p2, p0}, LP9/i$d;-><init>(LP9/i;)V

    iput-object p2, p0, LP9/i;->k:LP9/i$d;

    new-instance p2, LP9/i$d;

    invoke-direct {p2, p0}, LP9/i$d;-><init>(LP9/i;)V

    iput-object p2, p0, LP9/i;->l:LP9/i$d;

    if-eqz p5, :cond_1

    invoke-virtual {p0}, LP9/i;->t()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-interface {p1, p5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "locally-initiated streams shouldn\'t have headers yet"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p0}, LP9/i;->t()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "remotely-initiated streams should have headers"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final e(LP9/b;Ljava/io/IOException;)Z
    .locals 2

    .prologue
    sget-boolean v0, LI9/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " MUST NOT hold lock on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LP9/i;->m:LP9/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    monitor-exit p0

    return v1

    :cond_2
    :try_start_1
    iput-object p1, p0, LP9/i;->m:LP9/b;

    iput-object p2, p0, LP9/i;->n:Ljava/io/IOException;

    const-string p1, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    iget-object p1, p0, LP9/i;->i:LP9/i$c;

    invoke-virtual {p1}, LP9/i$c;->f()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LP9/i;->j:LP9/i$b;

    invoke-virtual {p1}, LP9/i$b;->g()Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_3

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_3
    :try_start_2
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    iget-object p1, p0, LP9/i;->b:LP9/f;

    iget p2, p0, LP9/i;->a:I

    invoke-virtual {p1, p2}, LP9/f;->x1(I)LP9/i;

    const/4 p1, 0x1

    return p1

    :goto_1
    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final A(J)V
    .locals 0

    iput-wide p1, p0, LP9/i;->c:J

    return-void
.end method

.method public final B(J)V
    .locals 0

    iput-wide p1, p0, LP9/i;->e:J

    return-void
.end method

.method public final declared-synchronized C()LH9/t;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LP9/i;->k:LP9/i$d;

    invoke-virtual {v0}, LX9/c;->v()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget-object v0, p0, LP9/i;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LP9/i;->m:LP9/b;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LP9/i;->D()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :try_start_2
    iget-object v0, p0, LP9/i;->k:LP9/i$d;

    invoke-virtual {v0}, LP9/i$d;->C()V

    iget-object v0, p0, LP9/i;->g:Ljava/util/ArrayDeque;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, LP9/i;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "headersQueue.removeFirst()"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LH9/t;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-object v0

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_1
    :try_start_3
    iget-object v0, p0, LP9/i;->n:Ljava/io/IOException;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, LP9/n;

    iget-object v1, p0, LP9/i;->m:LP9/b;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, LP9/n;-><init>(LP9/b;)V

    :goto_1
    throw v0

    :goto_2
    iget-object v1, p0, LP9/i;->k:LP9/i$d;

    invoke-virtual {v1}, LP9/i$d;->C()V

    throw v0

    :goto_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public final D()V
    .locals 1

    .prologue
    :try_start_0
    const-string v0, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
.end method

.method public final E()LX9/a0;
    .locals 1

    iget-object v0, p0, LP9/i;->l:LP9/i$d;

    return-object v0
.end method

.method public final a(J)V
    .locals 2

    .prologue
    iget-wide v0, p0, LP9/i;->f:J

    add-long/2addr v0, p1

    iput-wide v0, p0, LP9/i;->f:J

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const-string p1, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    sget-boolean v0, LI9/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MUST NOT hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    :goto_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LP9/i;->i:LP9/i$c;

    invoke-virtual {v0}, LP9/i$c;->f()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LP9/i;->i:LP9/i$c;

    invoke-virtual {v0}, LP9/i$c;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LP9/i;->j:LP9/i$b;

    invoke-virtual {v0}, LP9/i$b;->g()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LP9/i;->j:LP9/i$b;

    invoke-virtual {v0}, LP9/i$b;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_2
    :goto_1
    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p0}, LP9/i;->u()Z

    move-result v1

    sget-object v2, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v0, :cond_4

    sget-object v0, LP9/b;->M:LP9/b;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LP9/i;->d(LP9/b;Ljava/io/IOException;)V

    goto :goto_3

    :cond_4
    if-nez v1, :cond_5

    iget-object v0, p0, LP9/i;->b:LP9/f;

    iget v1, p0, LP9/i;->a:I

    invoke-virtual {v0, v1}, LP9/f;->x1(I)LP9/i;

    :cond_5
    :goto_3
    return-void

    :goto_4
    monitor-exit p0

    throw v0
.end method

.method public final c()V
    .locals 2

    .prologue
    iget-object v0, p0, LP9/i;->j:LP9/i$b;

    invoke-virtual {v0}, LP9/i$b;->f()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LP9/i;->j:LP9/i$b;

    invoke-virtual {v0}, LP9/i$b;->g()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LP9/i;->m:LP9/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, LP9/i;->n:Ljava/io/IOException;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LP9/n;

    iget-object v1, p0, LP9/i;->m:LP9/b;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, LP9/n;-><init>(LP9/b;)V

    :goto_0
    throw v0

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream finished"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(LP9/b;Ljava/io/IOException;)V
    .locals 1

    .prologue
    const-string v0, "rstStatusCode"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LP9/i;->e(LP9/b;Ljava/io/IOException;)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, LP9/i;->b:LP9/f;

    iget v0, p0, LP9/i;->a:I

    invoke-virtual {p2, v0, p1}, LP9/f;->I1(ILP9/b;)V

    return-void
.end method

.method public final f(LP9/b;)V
    .locals 2

    .prologue
    const-string v0, "errorCode"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LP9/i;->e(LP9/b;Ljava/io/IOException;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LP9/i;->b:LP9/f;

    iget v1, p0, LP9/i;->a:I

    invoke-virtual {v0, v1, p1}, LP9/f;->J1(ILP9/b;)V

    return-void
.end method

.method public final g()LP9/f;
    .locals 1

    iget-object v0, p0, LP9/i;->b:LP9/f;

    return-object v0
.end method

.method public final declared-synchronized h()LP9/b;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LP9/i;->m:LP9/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final i()Ljava/io/IOException;
    .locals 1

    iget-object v0, p0, LP9/i;->n:Ljava/io/IOException;

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, LP9/i;->a:I

    return v0
.end method

.method public final k()J
    .locals 2

    iget-wide v0, p0, LP9/i;->d:J

    return-wide v0
.end method

.method public final l()J
    .locals 2

    iget-wide v0, p0, LP9/i;->c:J

    return-wide v0
.end method

.method public final m()LP9/i$d;
    .locals 1

    iget-object v0, p0, LP9/i;->k:LP9/i$d;

    return-object v0
.end method

.method public final n()LX9/X;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LP9/i;->h:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, LP9/i;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "reply before requesting the sink"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    iget-object v0, p0, LP9/i;->j:LP9/i$b;

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final o()LP9/i$b;
    .locals 1

    iget-object v0, p0, LP9/i;->j:LP9/i$b;

    return-object v0
.end method

.method public final p()LP9/i$c;
    .locals 1

    iget-object v0, p0, LP9/i;->i:LP9/i$c;

    return-object v0
.end method

.method public final q()J
    .locals 2

    iget-wide v0, p0, LP9/i;->f:J

    return-wide v0
.end method

.method public final r()J
    .locals 2

    iget-wide v0, p0, LP9/i;->e:J

    return-wide v0
.end method

.method public final s()LP9/i$d;
    .locals 1

    iget-object v0, p0, LP9/i;->l:LP9/i$d;

    return-object v0
.end method

.method public final t()Z
    .locals 4

    .prologue
    iget v0, p0, LP9/i;->a:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v3, p0, LP9/i;->b:LP9/f;

    invoke-virtual {v3}, LP9/f;->x0()Z

    move-result v3

    if-ne v3, v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    return v1
.end method

.method public final declared-synchronized u()Z
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LP9/i;->m:LP9/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v0, p0, LP9/i;->i:LP9/i$c;

    invoke-virtual {v0}, LP9/i$c;->f()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LP9/i;->i:LP9/i$c;

    invoke-virtual {v0}, LP9/i$c;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, LP9/i;->j:LP9/i$b;

    invoke-virtual {v0}, LP9/i$b;->g()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LP9/i;->j:LP9/i$b;

    invoke-virtual {v0}, LP9/i$b;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-boolean v0, p0, LP9/i;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    monitor-exit p0

    return v1

    :cond_3
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final v()LX9/a0;
    .locals 1

    iget-object v0, p0, LP9/i;->k:LP9/i$d;

    return-object v0
.end method

.method public final w(LX9/f;I)V
    .locals 3

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LI9/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " MUST NOT hold lock on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, LP9/i;->i:LP9/i$c;

    int-to-long v1, p2

    invoke-virtual {v0, p1, v1, v2}, LP9/i$c;->g(LX9/f;J)V

    return-void
.end method

.method public final x(LH9/t;Z)V
    .locals 2

    .prologue
    const-string v0, "headers"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LI9/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " MUST NOT hold lock on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LP9/i;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, LP9/i;->i:LP9/i$c;

    invoke-virtual {v0, p1}, LP9/i$c;->o(LH9/t;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_3
    :goto_1
    iput-boolean v1, p0, LP9/i;->h:Z

    iget-object v0, p0, LP9/i;->g:Ljava/util/ArrayDeque;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :goto_2
    if-eqz p2, :cond_4

    iget-object p1, p0, LP9/i;->i:LP9/i$c;

    invoke-virtual {p1, v1}, LP9/i$c;->i(Z)V

    :cond_4
    invoke-virtual {p0}, LP9/i;->u()Z

    move-result p1

    const-string p2, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    sget-object p2, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-nez p1, :cond_5

    iget-object p1, p0, LP9/i;->b:LP9/f;

    iget p2, p0, LP9/i;->a:I

    invoke-virtual {p1, p2}, LP9/f;->x1(I)LP9/i;

    :cond_5
    return-void

    :goto_3
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized y(LP9/b;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "errorCode"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP9/i;->m:LP9/b;

    if-nez v0, :cond_0

    iput-object p1, p0, LP9/i;->m:LP9/b;

    const-string p1, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {p0, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final z(J)V
    .locals 0

    iput-wide p1, p0, LP9/i;->d:J

    return-void
.end method
