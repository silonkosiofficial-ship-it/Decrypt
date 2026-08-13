.class public final Lb9/k;
.super LW8/J;
.source "SourceFile"

# interfaces
.implements LW8/X;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb9/k$a;
    }
.end annotation


# static fields
.field private static final synthetic K:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private final synthetic E:LW8/X;

.field private final F:LW8/J;

.field private final G:I

.field private final H:Ljava/lang/String;

.field private final I:Lb9/p;

.field private final J:Ljava/lang/Object;

.field private volatile synthetic runningWorkers$volatile:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lb9/k;

    const-string v1, "runningWorkers$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lb9/k;->K:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LW8/J;ILjava/lang/String;)V
    .locals 1

    .prologue
    invoke-direct {p0}, LW8/J;-><init>()V

    instance-of v0, p1, LW8/X;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LW8/X;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, LW8/U;->a()LW8/X;

    move-result-object v0

    :cond_1
    iput-object v0, p0, Lb9/k;->E:LW8/X;

    iput-object p1, p0, Lb9/k;->F:LW8/J;

    iput p2, p0, Lb9/k;->G:I

    iput-object p3, p0, Lb9/k;->H:Ljava/lang/String;

    new-instance p1, Lb9/p;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lb9/p;-><init>(Z)V

    iput-object p1, p0, Lb9/k;->I:Lb9/p;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/k;->J:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic A1(Lb9/k;)Ljava/lang/Runnable;
    .locals 0

    invoke-direct {p0}, Lb9/k;->C1()Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic B1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    sget-object v0, Lb9/k;->K:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final C1()Ljava/lang/Runnable;
    .locals 2

    .prologue
    :goto_0
    iget-object v0, p0, Lb9/k;->I:Lb9/p;

    invoke-virtual {v0}, Lb9/p;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-nez v0, :cond_1

    iget-object v0, p0, Lb9/k;->J:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lb9/k;->B1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    iget-object v1, p0, Lb9/k;->I:Lb9/p;

    invoke-virtual {v1}, Lb9/p;->c()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    invoke-static {}, Lb9/k;->B1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    return-object v0
.end method

.method private final D1()Z
    .locals 3

    .prologue
    iget-object v0, p0, Lb9/k;->J:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lb9/k;->B1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    iget v2, p0, Lb9/k;->G:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v1, v2, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_1
    invoke-static {}, Lb9/k;->B1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static final synthetic z1(Lb9/k;)LW8/J;
    .locals 0

    iget-object p0, p0, Lb9/k;->F:LW8/J;

    return-object p0
.end method


# virtual methods
.method public m1(JLjava/lang/Runnable;Lm7/i;)LW8/f0;
    .locals 1

    iget-object v0, p0, Lb9/k;->E:LW8/X;

    invoke-interface {v0, p1, p2, p3, p4}, LW8/X;->m1(JLjava/lang/Runnable;Lm7/i;)LW8/f0;

    move-result-object p1

    return-object p1
.end method

.method public t1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    iget-object p1, p0, Lb9/k;->I:Lb9/p;

    invoke-virtual {p1, p2}, Lb9/p;->a(Ljava/lang/Object;)Z

    invoke-static {}, Lb9/k;->B1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, Lb9/k;->G:I

    if-ge p1, p2, :cond_1

    invoke-direct {p0}, Lb9/k;->D1()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lb9/k;->C1()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Lb9/k$a;

    invoke-direct {p2, p0, p1}, Lb9/k$a;-><init>(Lb9/k;Ljava/lang/Runnable;)V

    iget-object p1, p0, Lb9/k;->F:LW8/J;

    invoke-virtual {p1, p0, p2}, LW8/J;->t1(Lm7/i;Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    iget-object v0, p0, Lb9/k;->H:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lb9/k;->F:LW8/J;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".limitedParallelism("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lb9/k;->G:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public u1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    iget-object p1, p0, Lb9/k;->I:Lb9/p;

    invoke-virtual {p1, p2}, Lb9/p;->a(Ljava/lang/Object;)Z

    invoke-static {}, Lb9/k;->B1()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, Lb9/k;->G:I

    if-ge p1, p2, :cond_1

    invoke-direct {p0}, Lb9/k;->D1()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lb9/k;->C1()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Lb9/k$a;

    invoke-direct {p2, p0, p1}, Lb9/k$a;-><init>(Lb9/k;Ljava/lang/Runnable;)V

    iget-object p1, p0, Lb9/k;->F:LW8/J;

    invoke-virtual {p1, p0, p2}, LW8/J;->u1(Lm7/i;Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public x0(JLW8/l;)V
    .locals 1

    iget-object v0, p0, Lb9/k;->E:LW8/X;

    invoke-interface {v0, p1, p2, p3}, LW8/X;->x0(JLW8/l;)V

    return-void
.end method

.method public x1(ILjava/lang/String;)LW8/J;
    .locals 1

    .prologue
    invoke-static {p1}, Lb9/l;->a(I)V

    iget v0, p0, Lb9/k;->G:I

    if-lt p1, v0, :cond_0

    invoke-static {p0, p2}, Lb9/l;->b(LW8/J;Ljava/lang/String;)LW8/J;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-super {p0, p1, p2}, LW8/J;->x1(ILjava/lang/String;)LW8/J;

    move-result-object p1

    return-object p1
.end method
