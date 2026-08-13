.class public abstract Lh0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh0/o$a;
    }
.end annotation


# direct methods
.method public static a()Ljava/util/concurrent/atomic/AtomicReference;
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lh0/o;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    return-object p0
.end method

.method public static final c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;
    .locals 0

    .prologue
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh0/o$a;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lh0/o$a;->b()Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final d(Ljava/util/concurrent/atomic/AtomicReference;Lx7/l;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lh0/o$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, p2, v1}, Lh0/o$b;-><init>(Lx7/l;Ljava/util/concurrent/atomic/AtomicReference;Lx7/p;Lm7/e;)V

    invoke-static {v0, p3}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
