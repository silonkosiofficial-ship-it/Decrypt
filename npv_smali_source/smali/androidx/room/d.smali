.class public final Landroidx/room/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroidx/room/c;

.field private final c:Landroid/content/Context;

.field private final d:LW8/N;

.field private final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private f:I

.field private g:Landroidx/room/b;

.field private final h:LZ8/x;

.field private final i:Landroidx/room/d$c;

.field private final j:Landroidx/room/a;

.field private final k:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroidx/room/c;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "invalidationTracker"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/room/d;->a:Ljava/lang/String;

    iput-object p3, p0, Landroidx/room/d;->b:Landroidx/room/c;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/room/d;->c:Landroid/content/Context;

    invoke-virtual {p3}, Landroidx/room/c;->i()Lo2/n;

    move-result-object p1

    invoke-virtual {p1}, Lo2/n;->q()LW8/N;

    move-result-object p1

    iput-object p1, p0, Landroidx/room/d;->d:LW8/N;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Landroidx/room/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x0

    sget-object p2, LY8/d;->C:LY8/d;

    invoke-static {p1, p1, p2}, LZ8/E;->a(IILY8/d;)LZ8/x;

    move-result-object p1

    iput-object p1, p0, Landroidx/room/d;->h:LZ8/x;

    invoke-virtual {p3}, Landroidx/room/c;->j()[Ljava/lang/String;

    move-result-object p1

    new-instance p2, Landroidx/room/d$c;

    invoke-direct {p2, p0, p1}, Landroidx/room/d$c;-><init>(Landroidx/room/d;[Ljava/lang/String;)V

    iput-object p2, p0, Landroidx/room/d;->i:Landroidx/room/d$c;

    new-instance p1, Landroidx/room/d$b;

    invoke-direct {p1, p0}, Landroidx/room/d$b;-><init>(Landroidx/room/d;)V

    iput-object p1, p0, Landroidx/room/d;->j:Landroidx/room/a;

    new-instance p1, Landroidx/room/d$d;

    invoke-direct {p1, p0}, Landroidx/room/d$d;-><init>(Landroidx/room/d;)V

    iput-object p1, p0, Landroidx/room/d;->k:Landroid/content/ServiceConnection;

    return-void
.end method

.method public static final synthetic a(Landroidx/room/d;)I
    .locals 0

    iget p0, p0, Landroidx/room/d;->f:I

    return p0
.end method

.method public static final synthetic b(Landroidx/room/d;)LW8/N;
    .locals 0

    iget-object p0, p0, Landroidx/room/d;->d:LW8/N;

    return-object p0
.end method

.method public static final synthetic c(Landroidx/room/d;)LZ8/x;
    .locals 0

    iget-object p0, p0, Landroidx/room/d;->h:LZ8/x;

    return-object p0
.end method

.method public static final synthetic d(Landroidx/room/d;)Landroidx/room/b;
    .locals 0

    iget-object p0, p0, Landroidx/room/d;->g:Landroidx/room/b;

    return-object p0
.end method

.method public static final synthetic e(Landroidx/room/d;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Landroidx/room/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static final synthetic f(Landroidx/room/d;)V
    .locals 0

    invoke-direct {p0}, Landroidx/room/d;->j()V

    return-void
.end method

.method public static final synthetic g(Landroidx/room/d;Landroidx/room/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/d;->g:Landroidx/room/b;

    return-void
.end method

.method private final j()V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Landroidx/room/d;->g:Landroidx/room/b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/room/d;->j:Landroidx/room/a;

    iget-object v2, p0, Landroidx/room/d;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroidx/room/b;->g2(Landroidx/room/a;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Landroidx/room/d;->f:I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "ROOM"

    const-string v2, "Cannot register multi-instance invalidation callback"

    nop

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public final h([Ljava/lang/String;)LZ8/f;
    .locals 2

    const-string v0, "resolvedTableNames"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/d;->h:LZ8/x;

    new-instance v1, Landroidx/room/d$a;

    invoke-direct {v1, v0, p1}, Landroidx/room/d$a;-><init>(LZ8/f;[Ljava/lang/String;)V

    return-object v1
.end method

.method public final i()Landroidx/room/c;
    .locals 1

    iget-object v0, p0, Landroidx/room/d;->b:Landroidx/room/c;

    return-object v0
.end method

.method public final k(Landroid/content/Intent;)V
    .locals 3

    .prologue
    const-string v0, "serviceIntent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/room/d;->c:Landroid/content/Context;

    iget-object v1, p0, Landroidx/room/d;->k:Landroid/content/ServiceConnection;

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    iget-object p1, p0, Landroidx/room/d;->b:Landroidx/room/c;

    iget-object v0, p0, Landroidx/room/d;->i:Landroidx/room/d$c;

    invoke-virtual {p1, v0}, Landroidx/room/c;->f(Landroidx/room/c$c;)V

    :cond_0
    return-void
.end method

.method public final l()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/room/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/room/d;->b:Landroidx/room/c;

    iget-object v1, p0, Landroidx/room/d;->i:Landroidx/room/d$c;

    invoke-virtual {v0, v1}, Landroidx/room/c;->s(Landroidx/room/c$c;)V

    :try_start_0
    iget-object v0, p0, Landroidx/room/d;->g:Landroidx/room/b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/room/d;->j:Landroidx/room/a;

    iget v2, p0, Landroidx/room/d;->f:I

    invoke-interface {v0, v1, v2}, Landroidx/room/b;->Y5(Landroidx/room/a;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "ROOM"

    const-string v2, "Cannot unregister multi-instance invalidation callback"

    nop

    :cond_0
    :goto_0
    iget-object v0, p0, Landroidx/room/d;->c:Landroid/content/Context;

    iget-object v1, p0, Landroidx/room/d;->k:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    :cond_1
    return-void
.end method
