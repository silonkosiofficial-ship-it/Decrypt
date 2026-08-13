.class public final Lm7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/e;
.implements Lo7/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm7/k$a;
    }
.end annotation


# static fields
.field private static final D:Lm7/k$a;

.field private static final E:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private final C:Lm7/e;

.field private volatile result:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm7/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm7/k$a;-><init>(Ly7/k;)V

    sput-object v0, Lm7/k;->D:Lm7/k$a;

    const-class v0, Ljava/lang/Object;

    const-string v1, "result"

    const-class v2, Lm7/k;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lm7/k;->E:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lm7/e;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln7/a;->D:Ln7/a;

    invoke-direct {p0, p1, v0}, Lm7/k;-><init>(Lm7/e;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lm7/e;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/k;->C:Lm7/e;

    iput-object p2, p0, Lm7/k;->result:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, Lm7/k;->result:Ljava/lang/Object;

    sget-object v1, Ln7/a;->D:Ln7/a;

    if-ne v0, v1, :cond_1

    sget-object v0, Lm7/k;->E:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lm7/k;->result:Ljava/lang/Object;

    :cond_1
    sget-object v1, Ln7/a;->E:Ln7/a;

    if-ne v0, v1, :cond_2

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_2
    instance-of v1, v0, Li7/w$b;

    if-nez v1, :cond_3

    :goto_0
    return-object v0

    :cond_3
    check-cast v0, Li7/w$b;

    iget-object v0, v0, Li7/w$b;->C:Ljava/lang/Throwable;

    throw v0
.end method

.method public e()Lo7/e;
    .locals 2

    .prologue
    iget-object v0, p0, Lm7/k;->C:Lm7/e;

    instance-of v1, v0, Lo7/e;

    if-eqz v1, :cond_0

    check-cast v0, Lo7/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()Lm7/i;
    .locals 1

    iget-object v0, p0, Lm7/k;->C:Lm7/e;

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    return-object v0
.end method

.method public t(Ljava/lang/Object;)V
    .locals 3

    .prologue
    :cond_0
    iget-object v0, p0, Lm7/k;->result:Ljava/lang/Object;

    sget-object v1, Ln7/a;->D:Ln7/a;

    if-ne v0, v1, :cond_1

    sget-object v0, Lm7/k;->E:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, v1, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_1
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    sget-object v0, Lm7/k;->E:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Ln7/a;->E:Ln7/a;

    invoke-static {v0, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm7/k;->C:Lm7/e;

    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SafeContinuation for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm7/k;->C:Lm7/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
