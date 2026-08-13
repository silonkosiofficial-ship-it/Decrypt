.class public final Lf4/P;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lf4/W0;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Ljava/util/concurrent/atomic/AtomicReference;

.field private final d:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method constructor <init>(Lf4/W0;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lf4/P;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lf4/P;->d:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p1, p0, Lf4/P;->a:Lf4/W0;

    iput-object p2, p0, Lf4/P;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method final synthetic a(Lf4/D;)V
    .locals 2

    iget-object v0, p0, Lf4/P;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lf4/G;

    invoke-direct {v1, v0}, Lf4/G;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    new-instance v0, Lf4/H;

    invoke-direct {v0}, Lf4/H;-><init>()V

    invoke-virtual {p1, v1, v0}, Lf4/D;->g(LL4/f$b;LL4/f$a;)V

    return-void
.end method

.method public final b(LL4/f$b;LL4/f$a;)V
    .locals 2

    .prologue
    invoke-static {}, Lf4/v0;->a()V

    iget-object v0, p0, Lf4/P;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/S;

    if-nez v0, :cond_0

    new-instance p1, Lf4/Z0;

    const/4 v0, 0x3

    const-string v1, "No available form can be built."

    invoke-direct {p1, v0, v1}, Lf4/Z0;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1}, Lf4/Z0;->a()LL4/e;

    move-result-object p1

    invoke-interface {p2, p1}, LL4/f$a;->b(LL4/e;)V

    return-void

    :cond_0
    iget-object v1, p0, Lf4/P;->a:Lf4/W0;

    invoke-interface {v1}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/w;

    invoke-interface {v1, v0}, Lf4/w;->a(Lf4/S;)Lf4/w;

    move-result-object v0

    invoke-interface {v0}, Lf4/w;->b()Lf4/x;

    move-result-object v0

    invoke-interface {v0}, Lf4/x;->a()Lf4/D;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lf4/D;->g(LL4/f$b;LL4/f$a;)V

    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    iget-object v0, p0, Lf4/P;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/S;

    if-nez v0, :cond_0

    const-string v0, "UserMessagingPlatform"

    const-string v1, "Failed to load and cache a form due to null consent form resources."

    nop

    return-void

    :cond_0
    iget-object v1, p0, Lf4/P;->a:Lf4/W0;

    invoke-interface {v1}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/w;

    invoke-interface {v1, v0}, Lf4/w;->a(Lf4/S;)Lf4/w;

    move-result-object v0

    invoke-interface {v0}, Lf4/w;->b()Lf4/x;

    move-result-object v0

    invoke-interface {v0}, Lf4/x;->a()Lf4/D;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lf4/D;->l:Z

    sget-object v1, Lf4/v0;->a:Landroid/os/Handler;

    new-instance v2, Lf4/F;

    invoke-direct {v2, p0, v0}, Lf4/F;-><init>(Lf4/P;Lf4/D;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final d(Lf4/S;)V
    .locals 1

    iget-object v0, p0, Lf4/P;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final e(Landroid/app/Activity;LL4/b$a;)V
    .locals 3

    .prologue
    invoke-static {}, Lf4/v0;->a()V

    invoke-static {p1}, Lf4/a;->a(Landroid/content/Context;)Lf4/a;

    move-result-object v0

    invoke-virtual {v0}, Lf4/a;->b()Lf4/c1;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Lf4/v0;->a:Landroid/os/Handler;

    new-instance v0, Lf4/I;

    invoke-direct {v0, p2}, Lf4/I;-><init>(LL4/b$a;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    invoke-virtual {v0}, Lf4/c1;->d()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lf4/c1;->a()LL4/c$c;

    move-result-object v1

    sget-object v2, LL4/c$c;->D:LL4/c$c;

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Lf4/v0;->a:Landroid/os/Handler;

    new-instance v2, Lf4/J;

    invoke-direct {v2, p2}, Lf4/J;-><init>(LL4/b$a;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {v0, p1}, Lf4/c1;->e(Landroid/app/Activity;)V

    return-void

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lf4/c1;->a()LL4/c$c;

    move-result-object v0

    sget-object v1, LL4/c$c;->D:LL4/c$c;

    if-ne v0, v1, :cond_3

    sget-object p1, Lf4/v0;->a:Landroid/os/Handler;

    new-instance v0, Lf4/K;

    invoke-direct {v0, p2}, Lf4/K;-><init>(LL4/b$a;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_3
    iget-object v0, p0, Lf4/P;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL4/b;

    if-nez v0, :cond_4

    sget-object p1, Lf4/v0;->a:Landroid/os/Handler;

    new-instance v0, Lf4/L;

    invoke-direct {v0, p2}, Lf4/L;-><init>(LL4/b$a;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_4
    invoke-interface {v0, p1, p2}, LL4/b;->a(Landroid/app/Activity;LL4/b$a;)V

    iget-object p1, p0, Lf4/P;->b:Ljava/util/concurrent/Executor;

    new-instance p2, Lf4/M;

    invoke-direct {p2, p0}, Lf4/M;-><init>(Lf4/P;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final f()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lf4/P;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
