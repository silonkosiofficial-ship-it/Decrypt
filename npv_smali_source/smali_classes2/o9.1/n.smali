.class public final Lo9/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo9/n;

.field private static final b:I

.field private static final c:Lo9/k;

.field private static final d:I

.field private static final e:I

.field private static final f:Ljava/lang/String;

.field private static final g:I

.field private static final h:I

.field private static final i:Ljava/util/concurrent/atomic/AtomicReferenceArray;

.field private static final j:Ljava/util/concurrent/atomic/AtomicReferenceArray;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    new-instance v0, Lo9/n;

    invoke-direct {v0}, Lo9/n;-><init>()V

    sput-object v0, Lo9/n;->a:Lo9/n;

    const/high16 v0, 0x10000

    sput v0, Lo9/n;->b:I

    sget-object v1, Lo9/k;->h:Lo9/k$a;

    const/4 v0, 0x0

    new-array v2, v0, [B

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v6}, Lo9/k$a;->b([BIILo9/l;Z)Lo9/k;

    move-result-object v1

    sput-object v1, Lo9/n;->c:Lo9/k;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v1

    sput v1, Lo9/n;->d:I

    div-int/lit8 v3, v1, 0x2

    invoke-static {v3, v2}, LE7/j;->d(II)I

    move-result v2

    sput v2, Lo9/n;->e:I

    const-string v3, "java.vm.name"

    invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Dalvik"

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "0"

    goto :goto_0

    :cond_0
    const-string v3, "4194304"

    :goto_0
    sput-object v3, Lo9/n;->f:Ljava/lang/String;

    const-string v4, "kotlinx.io.pool.size.bytes"

    invoke-static {v4, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getProperty(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, LS8/r;->v(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3, v0}, LE7/j;->d(II)I

    move-result v0

    :cond_1
    sput v0, Lo9/n;->g:I

    div-int/2addr v0, v2

    const/16 v3, 0x2000

    invoke-static {v0, v3}, LE7/j;->d(II)I

    move-result v0

    sput v0, Lo9/n;->h:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    sput-object v0, Lo9/n;->i:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    sput-object v0, Lo9/n;->j:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(J)I
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    and-long/2addr p1, v0

    long-to-int p1, p1

    return p1
.end method

.method private final b()I
    .locals 4

    sget v0, Lo9/n;->d:I

    int-to-long v0, v0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lo9/n;->a(J)I

    move-result v0

    return v0
.end method

.method private final c()I
    .locals 4

    sget v0, Lo9/n;->e:I

    int-to-long v0, v0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lo9/n;->a(J)I

    move-result v0

    return v0
.end method

.method public static final d(Lo9/k;)V
    .locals 6

    .prologue
    const-string v0, "segment"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo9/k;->e()Lo9/k;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lo9/k;->g()Lo9/k;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lo9/k;->c()Lo9/l;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo9/l;->c()Z

    move-result v0

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    sget-object v0, Lo9/n;->i:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    sget-object v2, Lo9/n;->a:Lo9/n;

    invoke-direct {v2}, Lo9/n;->b()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3}, Lo9/k;->s(I)V

    iput-boolean v1, p0, Lo9/k;->e:Z

    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo9/k;

    sget-object v4, Lo9/n;->c:Lo9/k;

    if-eq v1, v4, :cond_1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lo9/k;->d()I

    move-result v4

    goto :goto_0

    :cond_2
    move v4, v3

    :goto_0
    sget v5, Lo9/n;->b:I

    if-lt v4, v5, :cond_4

    sget v0, Lo9/n;->g:I

    if-lez v0, :cond_3

    invoke-static {p0}, Lo9/n;->e(Lo9/k;)V

    :cond_3
    return-void

    :cond_4
    invoke-virtual {p0, v1}, Lo9/k;->r(Lo9/k;)V

    add-int/lit16 v4, v4, 0x2000

    invoke-virtual {p0, v4}, Lo9/k;->q(I)V

    invoke-static {v0, v2, v1, p0}, LY8/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final e(Lo9/k;)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo9/k;->s(I)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lo9/k;->e:Z

    sget-object v1, Lo9/n;->a:Lo9/n;

    invoke-direct {v1}, Lo9/n;->c()I

    move-result v1

    sget-object v2, Lo9/n;->j:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move v3, v0

    :cond_0
    :goto_0
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo9/k;

    sget-object v5, Lo9/n;->c:Lo9/k;

    if-eq v4, v5, :cond_0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lo9/k;->d()I

    move-result v5

    goto :goto_1

    :cond_1
    move v5, v0

    :goto_1
    add-int/lit16 v5, v5, 0x2000

    sget v6, Lo9/n;->h:I

    if-le v5, v6, :cond_3

    sget v4, Lo9/n;->e:I

    if-ge v3, v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v4, v4, -0x1

    and-int/2addr v1, v4

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p0, v4}, Lo9/k;->r(Lo9/k;)V

    invoke-virtual {p0, v5}, Lo9/k;->q(I)V

    invoke-static {v2, v1, v4, p0}, LY8/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-void
.end method

.method public static final f()Lo9/k;
    .locals 5

    .prologue
    sget-object v0, Lo9/n;->i:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    sget-object v1, Lo9/n;->a:Lo9/n;

    invoke-direct {v1}, Lo9/n;->b()I

    move-result v1

    :goto_0
    sget-object v2, Lo9/n;->c:Lo9/k;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo9/k;

    invoke-static {v3, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    if-nez v3, :cond_2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    sget v0, Lo9/n;->g:I

    if-lez v0, :cond_1

    invoke-static {}, Lo9/n;->g()Lo9/k;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v0, Lo9/k;->h:Lo9/k$a;

    invoke-virtual {v0}, Lo9/k$a;->a()Lo9/k;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {v3}, Lo9/k;->e()Lo9/k;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    invoke-virtual {v3, v2}, Lo9/k;->r(Lo9/k;)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo9/k;->q(I)V

    return-object v3
.end method

.method private static final g()Lo9/k;
    .locals 6

    .prologue
    sget-object v0, Lo9/n;->j:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    sget-object v1, Lo9/n;->a:Lo9/n;

    invoke-direct {v1}, Lo9/n;->c()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    sget-object v4, Lo9/n;->c:Lo9/k;

    invoke-virtual {v0, v1, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo9/k;

    invoke-static {v5, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    if-nez v5, :cond_2

    invoke-virtual {v0, v1, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    sget v4, Lo9/n;->e:I

    if-ge v3, v4, :cond_1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v4, v4, -0x1

    and-int/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sget-object v0, Lo9/k;->h:Lo9/k$a;

    invoke-virtual {v0}, Lo9/k$a;->a()Lo9/k;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {v5}, Lo9/k;->e()Lo9/k;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    invoke-virtual {v5, v4}, Lo9/k;->r(Lo9/k;)V

    invoke-virtual {v5, v2}, Lo9/k;->q(I)V

    return-object v5
.end method

.method public static final h()Lo9/l;
    .locals 1

    new-instance v0, Lo9/j;

    invoke-direct {v0}, Lo9/j;-><init>()V

    return-object v0
.end method
