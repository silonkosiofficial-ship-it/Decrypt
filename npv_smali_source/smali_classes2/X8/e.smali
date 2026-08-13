.class public final LX8/e;
.super LX8/f;
.source "SourceFile"

# interfaces
.implements LW8/X;


# instance fields
.field private final E:Landroid/os/Handler;

.field private final F:Ljava/lang/String;

.field private final G:Z

.field private final H:LX8/e;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LX8/e;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Handler;Ljava/lang/String;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, LX8/e;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Landroid/os/Handler;Ljava/lang/String;Z)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    invoke-direct {p0, v0}, LX8/f;-><init>(Ly7/k;)V

    iput-object p1, p0, LX8/e;->E:Landroid/os/Handler;

    iput-object p2, p0, LX8/e;->F:Ljava/lang/String;

    iput-boolean p3, p0, LX8/e;->G:Z

    if-eqz p3, :cond_0

    move-object p3, p0

    goto :goto_0

    :cond_0
    new-instance p3, LX8/e;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, LX8/e;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    :goto_0
    iput-object p3, p0, LX8/e;->H:LX8/e;

    return-void
.end method

.method public static synthetic C1(LX8/e;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1}, LX8/e;->G1(LX8/e;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic D1(LX8/e;Ljava/lang/Runnable;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2}, LX8/e;->H1(LX8/e;Ljava/lang/Runnable;Ljava/lang/Throwable;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private final E1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 3

    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' was closed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, LW8/C0;->d(Lm7/i;Ljava/util/concurrent/CancellationException;)V

    invoke-static {}, LW8/d0;->b()LW8/J;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LW8/J;->t1(Lm7/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final G1(LX8/e;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p0, p0, LX8/e;->E:Landroid/os/Handler;

    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final H1(LX8/e;Ljava/lang/Runnable;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    iget-object p0, p0, LX8/e;->E:Landroid/os/Handler;

    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic B1()LX8/f;
    .locals 1

    invoke-virtual {p0}, LX8/e;->F1()LX8/e;

    move-result-object v0

    return-object v0
.end method

.method public F1()LX8/e;
    .locals 1

    iget-object v0, p0, LX8/e;->H:LX8/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, LX8/e;

    if-eqz v0, :cond_0

    check-cast p1, LX8/e;

    iget-object v0, p1, LX8/e;->E:Landroid/os/Handler;

    iget-object v1, p0, LX8/e;->E:Landroid/os/Handler;

    if-ne v0, v1, :cond_0

    iget-boolean p1, p1, LX8/e;->G:Z

    iget-boolean v0, p0, LX8/e;->G:Z

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget-object v0, p0, LX8/e;->E:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, LX8/e;->G:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public m1(JLjava/lang/Runnable;Lm7/i;)LW8/f0;
    .locals 3

    .prologue
    iget-object v0, p0, LX8/e;->E:Landroid/os/Handler;

    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    invoke-static {p1, p2, v1, v2}, LE7/j;->h(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p3, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LX8/c;

    invoke-direct {p1, p0, p3}, LX8/c;-><init>(LX8/e;Ljava/lang/Runnable;)V

    return-object p1

    :cond_0
    invoke-direct {p0, p4, p3}, LX8/e;->E1(Lm7/i;Ljava/lang/Runnable;)V

    sget-object p1, LW8/M0;->C:LW8/M0;

    return-object p1
.end method

.method public t1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    iget-object v0, p0, LX8/e;->E:Landroid/os/Handler;

    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2}, LX8/e;->E1(Lm7/i;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    invoke-virtual {p0}, LW8/J0;->A1()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, LX8/e;->F:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, LX8/e;->E:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget-boolean v1, p0, LX8/e;->G:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".immediate"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public v1(Lm7/i;)Z
    .locals 1

    .prologue
    iget-boolean p1, p0, LX8/e;->G:Z

    if-eqz p1, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iget-object v0, p0, LX8/e;->E:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public x0(JLW8/l;)V
    .locals 4

    .prologue
    new-instance v0, LX8/e$a;

    invoke-direct {v0, p3, p0}, LX8/e$a;-><init>(LW8/l;LX8/e;)V

    iget-object v1, p0, LX8/e;->E:Landroid/os/Handler;

    const-wide v2, 0x3fffffffffffffffL    # 1.9999999999999998

    invoke-static {p1, p2, v2, v3}, LE7/j;->h(JJ)J

    move-result-wide p1

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LX8/d;

    invoke-direct {p1, p0, v0}, LX8/d;-><init>(LX8/e;Ljava/lang/Runnable;)V

    invoke-interface {p3, p1}, LW8/l;->G(Lx7/l;)V

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Lm7/e;->getContext()Lm7/i;

    move-result-object p1

    invoke-direct {p0, p1, v0}, LX8/e;->E1(Lm7/i;Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic z1()LW8/J0;
    .locals 1

    invoke-virtual {p0}, LX8/e;->F1()LX8/e;

    move-result-object v0

    return-object v0
.end method
