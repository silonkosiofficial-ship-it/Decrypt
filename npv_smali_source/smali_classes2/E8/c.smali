.class public final LE8/c;
.super LE8/d;
.source "SourceFile"


# instance fields
.field private final c:Ljava/lang/Runnable;

.field private final d:Lx7/l;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;Lx7/l;)V
    .locals 1

    const-string v0, "checkCancelled"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interruptedExceptionHandler"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    invoke-direct {p0, v0, p1, p2}, LE8/c;-><init>(Ljava/util/concurrent/locks/Lock;Ljava/lang/Runnable;Lx7/l;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/locks/Lock;Ljava/lang/Runnable;Lx7/l;)V
    .locals 1

    const-string v0, "lock"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkCancelled"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interruptedExceptionHandler"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LE8/d;-><init>(Ljava/util/concurrent/locks/Lock;)V

    iput-object p2, p0, LE8/c;->c:Ljava/lang/Runnable;

    iput-object p3, p0, LE8/c;->d:Lx7/l;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .prologue
    :goto_0
    :try_start_0
    invoke-virtual {p0}, LE8/d;->c()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x32

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/locks/Lock;->tryLock(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LE8/c;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, LE8/c;->d:Lx7/l;

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
