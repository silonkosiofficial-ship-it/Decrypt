.class public final LM9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH9/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM9/e$a;,
        LM9/e$b;
    }
.end annotation


# instance fields
.field private final C:LH9/x;

.field private final D:LH9/z;

.field private final E:Z

.field private final F:LM9/g;

.field private final G:LH9/r;

.field private final H:LM9/e$c;

.field private final I:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private J:Ljava/lang/Object;

.field private K:LM9/d;

.field private L:LM9/f;

.field private M:Z

.field private N:LM9/c;

.field private O:Z

.field private P:Z

.field private Q:Z

.field private volatile R:Z

.field private volatile S:LM9/c;

.field private volatile T:LM9/f;


# direct methods
.method public constructor <init>(LH9/x;LH9/z;Z)V
    .locals 2

    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalRequest"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM9/e;->C:LH9/x;

    iput-object p2, p0, LM9/e;->D:LH9/z;

    iput-boolean p3, p0, LM9/e;->E:Z

    invoke-virtual {p1}, LH9/x;->n()LH9/k;

    move-result-object p2

    invoke-virtual {p2}, LH9/k;->b()LM9/g;

    move-result-object p2

    iput-object p2, p0, LM9/e;->F:LM9/g;

    invoke-virtual {p1}, LH9/x;->u()LH9/r$c;

    move-result-object p2

    invoke-interface {p2, p0}, LH9/r$c;->a(LH9/e;)LH9/r;

    move-result-object p2

    iput-object p2, p0, LM9/e;->G:LH9/r;

    new-instance p2, LM9/e$c;

    invoke-direct {p2, p0}, LM9/e$c;-><init>(LM9/e;)V

    invoke-virtual {p1}, LH9/x;->j()I

    move-result p1

    int-to-long v0, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, p1}, LX9/a0;->g(JLjava/util/concurrent/TimeUnit;)LX9/a0;

    iput-object p2, p0, LM9/e;->H:LM9/e$c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, LM9/e;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x1

    iput-boolean p1, p0, LM9/e;->Q:Z

    return-void
.end method

.method private final E(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .prologue
    iget-boolean v0, p0, LM9/e;->M:Z

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, LM9/e;->H:LM9/e$c;

    invoke-virtual {v0}, LX9/c;->w()Z

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_2
    return-object v0
.end method

.method private final F()Ljava/lang/String;
    .locals 2

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LM9/e;->D()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "canceled "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LM9/e;->E:Z

    if-eqz v1, :cond_1

    const-string v1, "web socket"

    goto :goto_1

    :cond_1
    const-string v1, "call"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LM9/e;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic a(LM9/e;)LM9/e$c;
    .locals 0

    iget-object p0, p0, LM9/e;->H:LM9/e$c;

    return-object p0
.end method

.method public static final synthetic b(LM9/e;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, LM9/e;->F()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 3

    .prologue
    sget-boolean v0, LI9/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST NOT hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, p0, LM9/e;->L:LM9/f;

    if-eqz v1, :cond_7

    if-eqz v0, :cond_3

    invoke-static {v1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MUST NOT hold lock on "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_3
    :goto_1
    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, LM9/e;->z()Ljava/net/Socket;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iget-object v2, p0, LM9/e;->L:LM9/f;

    if-nez v2, :cond_5

    if-eqz v0, :cond_4

    invoke-static {v0}, LI9/d;->n(Ljava/net/Socket;)V

    :cond_4
    iget-object v0, p0, LM9/e;->G:LH9/r;

    invoke-virtual {v0, p0, v1}, LH9/r;->k(LH9/e;LH9/j;)V

    goto :goto_2

    :cond_5
    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_7
    :goto_2
    invoke-direct {p0, p1}, LM9/e;->E(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    if-eqz p1, :cond_8

    iget-object p1, p0, LM9/e;->G:LH9/r;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p0, v0}, LH9/r;->d(LH9/e;Ljava/io/IOException;)V

    goto :goto_3

    :cond_8
    iget-object p1, p0, LM9/e;->G:LH9/r;

    invoke-virtual {p1, p0}, LH9/r;->c(LH9/e;)V

    :goto_3
    return-object v0
.end method

.method private final e()V
    .locals 2

    sget-object v0, LQ9/k;->a:LQ9/k$a;

    invoke-virtual {v0}, LQ9/k$a;->g()LQ9/k;

    move-result-object v0

    const-string v1, "response.body().close()"

    invoke-virtual {v0, v1}, LQ9/k;->h(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LM9/e;->J:Ljava/lang/Object;

    iget-object v0, p0, LM9/e;->G:LH9/r;

    invoke-virtual {v0, p0}, LH9/r;->e(LH9/e;)V

    return-void
.end method

.method private final j(LH9/u;)LH9/a;
    .locals 14

    .prologue
    invoke-virtual {p1}, LH9/u;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LM9/e;->C:LH9/x;

    invoke-virtual {v0}, LH9/x;->O()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iget-object v1, p0, LM9/e;->C:LH9/x;

    invoke-virtual {v1}, LH9/x;->y()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iget-object v2, p0, LM9/e;->C:LH9/x;

    invoke-virtual {v2}, LH9/x;->l()LH9/g;

    move-result-object v2

    move-object v6, v0

    move-object v7, v1

    move-object v8, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move-object v6, v0

    move-object v7, v6

    move-object v8, v7

    :goto_0
    new-instance v0, LH9/a;

    invoke-virtual {p1}, LH9/u;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LH9/u;->l()I

    move-result v3

    iget-object p1, p0, LM9/e;->C:LH9/x;

    invoke-virtual {p1}, LH9/x;->t()LH9/q;

    move-result-object v4

    iget-object p1, p0, LM9/e;->C:LH9/x;

    invoke-virtual {p1}, LH9/x;->M()Ljavax/net/SocketFactory;

    move-result-object v5

    iget-object p1, p0, LM9/e;->C:LH9/x;

    invoke-virtual {p1}, LH9/x;->I()LH9/b;

    move-result-object v9

    iget-object p1, p0, LM9/e;->C:LH9/x;

    invoke-virtual {p1}, LH9/x;->H()Ljava/net/Proxy;

    move-result-object v10

    iget-object p1, p0, LM9/e;->C:LH9/x;

    invoke-virtual {p1}, LH9/x;->G()Ljava/util/List;

    move-result-object v11

    iget-object p1, p0, LM9/e;->C:LH9/x;

    invoke-virtual {p1}, LH9/x;->p()Ljava/util/List;

    move-result-object v12

    iget-object p1, p0, LM9/e;->C:LH9/x;

    invoke-virtual {p1}, LH9/x;->J()Ljava/net/ProxySelector;

    move-result-object v13

    move-object v1, v0

    invoke-direct/range {v1 .. v13}, LH9/a;-><init>(Ljava/lang/String;ILH9/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;LH9/g;LH9/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    return-object v0
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget-object v0, p0, LM9/e;->K:LM9/d;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LM9/d;->e()Z

    move-result v0

    return v0
.end method

.method public final B(LM9/f;)V
    .locals 0

    iput-object p1, p0, LM9/e;->T:LM9/f;

    return-void
.end method

.method public final C()V
    .locals 2

    .prologue
    iget-boolean v0, p0, LM9/e;->M:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, LM9/e;->M:Z

    iget-object v0, p0, LM9/e;->H:LM9/e$c;

    invoke-virtual {v0}, LX9/c;->w()Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public D()Z
    .locals 1

    iget-boolean v0, p0, LM9/e;->R:Z

    return v0
.end method

.method public N(LH9/f;)V
    .locals 3

    .prologue
    const-string v0, "responseCallback"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM9/e;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LM9/e;->e()V

    iget-object v0, p0, LM9/e;->C:LH9/x;

    invoke-virtual {v0}, LH9/x;->r()LH9/p;

    move-result-object v0

    new-instance v1, LM9/e$a;

    invoke-direct {v1, p0, p1}, LM9/e$a;-><init>(LM9/e;LH9/f;)V

    invoke-virtual {v0, v1}, LH9/p;->a(LM9/e$a;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already Executed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(LM9/f;)V
    .locals 3

    .prologue
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LI9/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

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

    const-string v2, " MUST hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, LM9/e;->L:LM9/f;

    if-nez v0, :cond_2

    iput-object p1, p0, LM9/e;->L:LM9/f;

    invoke-virtual {p1}, LM9/f;->n()Ljava/util/List;

    move-result-object p1

    new-instance v0, LM9/e$b;

    iget-object v1, p0, LM9/e;->J:Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, LM9/e$b;-><init>(LM9/e;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public cancel()V
    .locals 1

    .prologue
    iget-boolean v0, p0, LM9/e;->R:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LM9/e;->R:Z

    iget-object v0, p0, LM9/e;->S:LM9/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LM9/c;->b()V

    :cond_1
    iget-object v0, p0, LM9/e;->T:LM9/f;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LM9/f;->d()V

    :cond_2
    iget-object v0, p0, LM9/e;->G:LH9/r;

    invoke-virtual {v0, p0}, LH9/r;->f(LH9/e;)V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM9/e;->h()LM9/e;

    move-result-object v0

    return-object v0
.end method

.method public h()LM9/e;
    .locals 4

    new-instance v0, LM9/e;

    iget-object v1, p0, LM9/e;->C:LH9/x;

    iget-object v2, p0, LM9/e;->D:LH9/z;

    iget-boolean v3, p0, LM9/e;->E:Z

    invoke-direct {v0, v1, v2, v3}, LM9/e;-><init>(LH9/x;LH9/z;Z)V

    return-object v0
.end method

.method public final k(LH9/z;Z)V
    .locals 2

    .prologue
    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM9/e;->N:LM9/c;

    if-nez v0, :cond_3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LM9/e;->P:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    iget-boolean v0, p0, LM9/e;->O:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz p2, :cond_0

    new-instance p2, LM9/d;

    iget-object v0, p0, LM9/e;->F:LM9/g;

    invoke-virtual {p1}, LH9/z;->i()LH9/u;

    move-result-object p1

    invoke-direct {p0, p1}, LM9/e;->j(LH9/u;)LH9/a;

    move-result-object p1

    iget-object v1, p0, LM9/e;->G:LH9/r;

    invoke-direct {p2, v0, p1, p0, v1}, LM9/d;-><init>(LM9/g;LH9/a;LM9/e;LH9/r;)V

    iput-object p2, p0, LM9/e;->K:LM9/d;

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_1
    const-string p1, "Check failed."

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    const-string p1, "cannot make a new request because the previous response is still open: please call response.close()"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1

    :cond_3
    const-string p1, "Check failed."

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final l(Z)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LM9/e;->Q:Z

    if-eqz v0, :cond_1

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz p1, :cond_0

    iget-object p1, p0, LM9/e;->S:LM9/c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LM9/c;->d()V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, LM9/e;->N:LM9/c;

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_1
    const-string p1, "released"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final m()LH9/x;
    .locals 1

    iget-object v0, p0, LM9/e;->C:LH9/x;

    return-object v0
.end method

.method public final n()LM9/f;
    .locals 1

    iget-object v0, p0, LM9/e;->L:LM9/f;

    return-object v0
.end method

.method public final p()LH9/r;
    .locals 1

    iget-object v0, p0, LM9/e;->G:LH9/r;

    return-object v0
.end method

.method public final q()Z
    .locals 1

    iget-boolean v0, p0, LM9/e;->E:Z

    return v0
.end method

.method public final r()LM9/c;
    .locals 1

    iget-object v0, p0, LM9/e;->N:LM9/c;

    return-object v0
.end method

.method public final t()LH9/z;
    .locals 1

    iget-object v0, p0, LM9/e;->D:LH9/z;

    return-object v0
.end method

.method public final u()LH9/B;
    .locals 12

    .prologue
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, LM9/e;->C:LH9/x;

    invoke-virtual {v0}, LH9/x;->z()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    new-instance v0, LN9/j;

    iget-object v1, p0, LM9/e;->C:LH9/x;

    invoke-direct {v0, v1}, LN9/j;-><init>(LH9/x;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v0, LN9/a;

    iget-object v1, p0, LM9/e;->C:LH9/x;

    invoke-virtual {v1}, LH9/x;->q()LH9/n;

    move-result-object v1

    invoke-direct {v0, v1}, LN9/a;-><init>(LH9/n;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v0, LK9/a;

    iget-object v1, p0, LM9/e;->C:LH9/x;

    invoke-virtual {v1}, LH9/x;->h()LH9/c;

    const/4 v9, 0x0

    invoke-direct {v0, v9}, LK9/a;-><init>(LH9/c;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    sget-object v0, LM9/a;->a:LM9/a;

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, LM9/e;->E:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LM9/e;->C:LH9/x;

    invoke-virtual {v0}, LH9/x;->B()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    :cond_0
    new-instance v0, LN9/b;

    iget-boolean v1, p0, LM9/e;->E:Z

    invoke-direct {v0, v1}, LN9/b;-><init>(Z)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v10, LN9/g;

    iget-object v5, p0, LM9/e;->D:LH9/z;

    iget-object v0, p0, LM9/e;->C:LH9/x;

    invoke-virtual {v0}, LH9/x;->m()I

    move-result v6

    iget-object v0, p0, LM9/e;->C:LH9/x;

    invoke-virtual {v0}, LH9/x;->K()I

    move-result v7

    iget-object v0, p0, LM9/e;->C:LH9/x;

    invoke-virtual {v0}, LH9/x;->Q()I

    move-result v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v10

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, LN9/g;-><init>(LM9/e;Ljava/util/List;ILM9/c;LH9/z;III)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LM9/e;->D:LH9/z;

    invoke-virtual {v10, v1}, LN9/g;->a(LH9/z;)LH9/B;

    move-result-object v1

    invoke-virtual {p0}, LM9/e;->D()Z

    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    invoke-virtual {p0, v9}, LM9/e;->x(Ljava/io/IOException;)Ljava/io/IOException;

    return-object v1

    :cond_1
    :try_start_1
    invoke-static {v1}, LI9/d;->m(Ljava/io/Closeable;)V

    new-instance v1, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    :try_start_2
    invoke-virtual {p0, v0}, LM9/e;->x(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type kotlin.Throwable"

    invoke-static {v0, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    move v11, v1

    move-object v1, v0

    move v0, v11

    :goto_0
    if-nez v0, :cond_2

    invoke-virtual {p0, v9}, LM9/e;->x(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_2
    throw v1
.end method

.method public final v(LN9/g;)LM9/c;
    .locals 4

    .prologue
    const-string v0, "chain"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LM9/e;->Q:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, LM9/e;->P:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    iget-boolean v0, p0, LM9/e;->O:Z

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit p0

    iget-object v0, p0, LM9/e;->K:LM9/d;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v2, p0, LM9/e;->C:LH9/x;

    invoke-virtual {v0, v2, p1}, LM9/d;->a(LH9/x;LN9/g;)LN9/d;

    move-result-object p1

    new-instance v2, LM9/c;

    iget-object v3, p0, LM9/e;->G:LH9/r;

    invoke-direct {v2, p0, v3, v0, p1}, LM9/c;-><init>(LM9/e;LH9/r;LM9/d;LN9/d;)V

    iput-object v2, p0, LM9/e;->N:LM9/c;

    iput-object v2, p0, LM9/e;->S:LM9/c;

    monitor-enter p0

    :try_start_1
    iput-boolean v1, p0, LM9/e;->O:Z

    iput-boolean v1, p0, LM9/e;->P:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    iget-boolean p1, p0, LM9/e;->R:Z

    if-nez p1, :cond_0

    return-object v2

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_2
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const-string p1, "released"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final w(LM9/c;ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 1

    .prologue
    const-string v0, "exchange"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM9/e;->S:LM9/c;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-object p4

    :cond_0
    monitor-enter p0

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    :try_start_0
    iget-boolean v0, p0, LM9/e;->O:Z

    if-nez v0, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_0
    if-eqz p3, :cond_7

    iget-boolean v0, p0, LM9/e;->P:Z

    if-eqz v0, :cond_7

    :cond_2
    if-eqz p2, :cond_3

    iput-boolean p1, p0, LM9/e;->O:Z

    :cond_3
    if-eqz p3, :cond_4

    iput-boolean p1, p0, LM9/e;->P:Z

    :cond_4
    iget-boolean p2, p0, LM9/e;->O:Z

    const/4 p3, 0x1

    if-nez p2, :cond_5

    iget-boolean v0, p0, LM9/e;->P:Z

    if-nez v0, :cond_5

    move v0, p3

    goto :goto_1

    :cond_5
    move v0, p1

    :goto_1
    if-nez p2, :cond_6

    iget-boolean p2, p0, LM9/e;->P:Z

    if-nez p2, :cond_6

    iget-boolean p2, p0, LM9/e;->Q:Z

    if-nez p2, :cond_6

    move p1, p3

    :cond_6
    move p2, p1

    move p1, v0

    goto :goto_2

    :cond_7
    move p2, p1

    :goto_2
    sget-object p3, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    iput-object p1, p0, LM9/e;->S:LM9/c;

    iget-object p1, p0, LM9/e;->L:LM9/f;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, LM9/f;->s()V

    :cond_8
    if-eqz p2, :cond_9

    invoke-direct {p0, p4}, LM9/e;->d(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1

    :cond_9
    return-object p4

    :goto_3
    monitor-exit p0

    throw p1
.end method

.method public final x(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LM9/e;->Q:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, LM9/e;->Q:Z

    iget-boolean v0, p0, LM9/e;->O:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, LM9/e;->P:Z

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, LM9/e;->d(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :cond_1
    return-object p1

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LM9/e;->D:LH9/z;

    invoke-virtual {v0}, LH9/z;->i()LH9/u;

    move-result-object v0

    invoke-virtual {v0}, LH9/u;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z()Ljava/net/Socket;
    .locals 6

    .prologue
    iget-object v0, p0, LM9/e;->L:LM9/f;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-boolean v1, LI9/d;->h:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

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

    const-string v3, " MUST hold lock on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_0
    invoke-virtual {v0}, LM9/f;->n()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, -0x1

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/Reference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    move v3, v5

    :goto_2
    if-eq v3, v5, :cond_5

    invoke-interface {v1, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, LM9/e;->L:LM9/f;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, LM9/f;->C(J)V

    iget-object v1, p0, LM9/e;->F:LM9/g;

    invoke-virtual {v1, v0}, LM9/g;->c(LM9/f;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, LM9/f;->E()Ljava/net/Socket;

    move-result-object v0

    return-object v0

    :cond_4
    return-object v2

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
