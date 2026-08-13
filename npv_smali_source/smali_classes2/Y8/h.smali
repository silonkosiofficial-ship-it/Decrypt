.class public LY8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY8/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY8/h$a;
    }
.end annotation


# static fields
.field private static final synthetic F:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic G:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic H:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic I:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic J:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic K:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic L:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic M:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic N:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private final C:I

.field public final D:Lx7/l;

.field private final E:Lx7/q;

.field private volatile synthetic _closeCause$volatile:Ljava/lang/Object;

.field private volatile synthetic bufferEnd$volatile:J

.field private volatile synthetic bufferEndSegment$volatile:Ljava/lang/Object;

.field private volatile synthetic closeHandler$volatile:Ljava/lang/Object;

.field private volatile synthetic completedExpandBuffersAndPauseFlag$volatile:J

.field private volatile synthetic receiveSegment$volatile:Ljava/lang/Object;

.field private volatile synthetic receivers$volatile:J

.field private volatile synthetic sendSegment$volatile:Ljava/lang/Object;

.field private volatile synthetic sendersAndCloseStatus$volatile:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "sendersAndCloseStatus$volatile"

    const-class v1, LY8/h;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LY8/h;->F:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "receivers$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LY8/h;->G:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "bufferEnd$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LY8/h;->H:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "completedExpandBuffersAndPauseFlag$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LY8/h;->I:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "sendSegment$volatile"

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LY8/h;->J:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "receiveSegment$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LY8/h;->K:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "bufferEndSegment$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LY8/h;->L:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_closeCause$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LY8/h;->M:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "closeHandler$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LY8/h;->N:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(ILx7/l;)V
    .locals 8

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LY8/h;->C:I

    iput-object p2, p0, LY8/h;->D:Lx7/l;

    if-ltz p1, :cond_2

    invoke-static {p1}, LY8/i;->t(I)J

    move-result-wide v0

    iput-wide v0, p0, LY8/h;->bufferEnd$volatile:J

    invoke-direct {p0}, LY8/h;->Z()J

    move-result-wide v0

    iput-wide v0, p0, LY8/h;->completedExpandBuffersAndPauseFlag$volatile:J

    new-instance p1, LY8/p;

    const/4 v5, 0x0

    const/4 v7, 0x3

    const-wide/16 v3, 0x0

    move-object v2, p1

    move-object v6, p0

    invoke-direct/range {v2 .. v7}, LY8/p;-><init>(JLY8/p;LY8/h;I)V

    iput-object p1, p0, LY8/h;->sendSegment$volatile:Ljava/lang/Object;

    iput-object p1, p0, LY8/h;->receiveSegment$volatile:Ljava/lang/Object;

    invoke-direct {p0}, LY8/h;->y0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LY8/i;->n()LY8/p;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iput-object p1, p0, LY8/h;->bufferEndSegment$volatile:Ljava/lang/Object;

    if-eqz p2, :cond_1

    new-instance p1, LY8/e;

    invoke-direct {p1, p0}, LY8/e;-><init>(LY8/h;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LY8/h;->E:Lx7/q;

    invoke-static {}, LY8/i;->l()Lb9/D;

    move-result-object p1

    iput-object p1, p0, LY8/h;->_closeCause$volatile:Ljava/lang/Object;

    return-void

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid channel capacity: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", should be >=0"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final synthetic A(LY8/h;LW8/l;)V
    .locals 0

    invoke-direct {p0, p1}, LY8/h;->I0(LW8/l;)V

    return-void
.end method

.method private final A0()V
    .locals 7

    .prologue
    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v6

    :cond_0
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const/16 v0, 0x3c

    shr-long v0, v2, v0

    long-to-int v0, v0

    if-nez v0, :cond_1

    const-wide v0, 0xfffffffffffffffL

    and-long/2addr v0, v2

    const/4 v4, 0x1

    invoke-static {v0, v1, v4}, LY8/i;->b(JI)J

    move-result-wide v4

    move-object v0, v6

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    return-void
.end method

.method public static final synthetic B(LY8/h;Ljava/lang/Object;LW8/l;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LY8/h;->K0(Ljava/lang/Object;LW8/l;)V

    return-void
.end method

.method private final B0()V
    .locals 7

    .prologue
    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v6

    :cond_0
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide v0, 0xfffffffffffffffL

    and-long/2addr v0, v2

    const/4 v4, 0x3

    invoke-static {v0, v1, v4}, LY8/i;->b(JI)J

    move-result-wide v4

    move-object v0, v6

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public static final synthetic C(LY8/h;LW8/e1;LY8/p;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LY8/h;->P0(LW8/e1;LY8/p;I)V

    return-void
.end method

.method private final C0()V
    .locals 7

    .prologue
    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v6

    :cond_0
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const/16 v0, 0x3c

    shr-long v0, v2, v0

    long-to-int v0, v0

    const-wide v4, 0xfffffffffffffffL

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    return-void

    :cond_1
    and-long v0, v2, v4

    const/4 v4, 0x3

    :goto_0
    invoke-static {v0, v1, v4}, LY8/i;->b(JI)J

    move-result-wide v0

    move-wide v4, v0

    goto :goto_1

    :cond_2
    and-long v0, v2, v4

    const/4 v4, 0x2

    goto :goto_0

    :goto_1
    move-object v0, v6

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public static final synthetic D(LY8/h;LW8/e1;LY8/p;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LY8/h;->Q0(LW8/e1;LY8/p;I)V

    return-void
.end method

.method private final D0(JLY8/p;)V
    .locals 4

    .prologue
    :goto_0
    iget-wide v0, p3, Lb9/A;->c:J

    cmp-long v0, v0, p1

    if-gez v0, :cond_1

    invoke-virtual {p3}, Lb9/b;->f()Lb9/b;

    move-result-object v0

    check-cast v0, LY8/p;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    move-object p3, v0

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p3}, Lb9/A;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p3}, Lb9/b;->f()Lb9/b;

    move-result-object p1

    check-cast p1, LY8/p;

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    move-object p3, p1

    goto :goto_1

    :cond_3
    :goto_2
    invoke-static {}, LY8/h;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    :cond_4
    :goto_3
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb9/A;

    iget-wide v0, p2, Lb9/A;->c:J

    iget-wide v2, p3, Lb9/A;->c:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p3}, Lb9/A;->u()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {p1, p0, p2, p3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p2}, Lb9/A;->p()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p2}, Lb9/b;->n()V

    :cond_7
    :goto_4
    return-void

    :cond_8
    invoke-virtual {p3}, Lb9/A;->p()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p3}, Lb9/b;->n()V

    goto :goto_3
.end method

.method public static final synthetic E(LY8/h;LY8/p;IJLm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, LY8/h;->T0(LY8/p;IJLm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final E0(Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)V
    .locals 0

    iget-object p1, p0, LY8/h;->D:Lx7/l;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p2}, LY8/n;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1, p2, p3}, Lb9/w;->a(Lx7/l;Ljava/lang/Object;Lm7/i;)V

    return-void
.end method

.method public static final synthetic F(LY8/h;LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, LY8/h;->h1(LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final F0(Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)V
    .locals 0

    iget-object p1, p0, LY8/h;->D:Lx7/l;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1, p2, p3}, Lb9/w;->a(Lx7/l;Ljava/lang/Object;Lm7/i;)V

    return-void
.end method

.method public static final synthetic G(LY8/h;LY8/p;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 0

    invoke-direct/range {p0 .. p7}, LY8/h;->j1(LY8/p;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result p0

    return p0
.end method

.method private final H(Lx7/l;)LF7/f;
    .locals 0

    new-instance p1, LY8/h$b;

    invoke-direct {p1, p0}, LY8/h$b;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method private final H0(LW8/l;)V
    .locals 2

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, LY8/n;->b:LY8/n$b;

    invoke-virtual {p0}, LY8/h;->b0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LY8/n$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LY8/n;->b(Ljava/lang/Object;)LY8/n;

    move-result-object v0

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void
.end method

.method private final I(Lx7/l;Ljava/lang/Object;)Lx7/q;
    .locals 1

    new-instance v0, LY8/f;

    invoke-direct {v0, p1, p2}, LY8/f;-><init>(Lx7/l;Ljava/lang/Object;)V

    return-object v0
.end method

.method private final I0(LW8/l;)V
    .locals 1

    sget-object v0, Li7/w;->D:Li7/w$a;

    invoke-direct {p0}, LY8/h;->e0()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void
.end method

.method private static final J(Lx7/l;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p4}, Lb9/w;->a(Lx7/l;Ljava/lang/Object;Lm7/i;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private final J0(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    new-instance v0, LW8/n;

    invoke-static {p2}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    iget-object v1, p0, LY8/h;->D:Lx7/l;

    if-eqz v1, :cond_0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, p1, v3, v2, v3}, Lb9/w;->c(Lx7/l;Ljava/lang/Object;Lb9/S;ILjava/lang/Object;)Lb9/S;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LY8/h;->i0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {p1, v1}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_0
    sget-object v1, Li7/w;->D:Li7/w$a;

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LY8/h;->i0()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_0

    :goto_1
    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_1
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method private final K(Lx7/l;)LF7/f;
    .locals 0

    new-instance p1, LY8/h$c;

    invoke-direct {p1, p0}, LY8/h$c;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method private final K0(Ljava/lang/Object;LW8/l;)V
    .locals 2

    .prologue
    iget-object v0, p0, LY8/h;->D:Lx7/l;

    if-eqz v0, :cond_0

    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lb9/w;->a(Lx7/l;Ljava/lang/Object;Lm7/i;)V

    :cond_0
    invoke-virtual {p0}, LY8/h;->i0()Ljava/lang/Throwable;

    move-result-object p1

    sget-object v0, Li7/w;->D:Li7/w$a;

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void
.end method

.method private final L(J)Z
    .locals 4

    .prologue
    invoke-direct {p0}, LY8/h;->Z()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    invoke-virtual {p0}, LY8/h;->h0()J

    move-result-wide v0

    iget v2, p0, LY8/h;->C:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

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

.method private final N(LY8/p;J)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Lb9/j;->b(Ljava/lang/Object;ILy7/k;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    const/4 v2, -0x1

    if-eqz p1, :cond_6

    sget v3, LY8/i;->b:I

    sub-int/2addr v3, v1

    :goto_1
    if-ge v2, v3, :cond_5

    iget-wide v4, p1, Lb9/A;->c:J

    sget v6, LY8/i;->b:I

    int-to-long v6, v6

    mul-long/2addr v4, v6

    int-to-long v6, v3

    add-long/2addr v4, v6

    cmp-long v4, v4, p2

    if-ltz v4, :cond_6

    :cond_0
    invoke-virtual {p1, v3}, LY8/p;->B(I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-static {}, LY8/i;->k()Lb9/D;

    move-result-object v5

    if-ne v4, v5, :cond_1

    goto :goto_3

    :cond_1
    instance-of v5, v4, LY8/D;

    if-eqz v5, :cond_2

    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v5

    invoke-virtual {p1, v3, v4, v5}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    check-cast v4, LY8/D;

    iget-object v4, v4, LY8/D;->a:LW8/e1;

    :goto_2
    invoke-static {v0, v4}, Lb9/j;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v3, v1}, LY8/p;->C(IZ)V

    goto :goto_4

    :cond_2
    instance-of v5, v4, LW8/e1;

    if-eqz v5, :cond_4

    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v5

    invoke-virtual {p1, v3, v4, v5}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_2

    :cond_3
    :goto_3
    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v5

    invoke-virtual {p1, v3, v4, v5}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1}, Lb9/A;->t()V

    :cond_4
    :goto_4
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lb9/b;->h()Lb9/b;

    move-result-object p1

    check-cast p1, LY8/p;

    goto :goto_0

    :cond_6
    if-eqz v0, :cond_8

    instance-of p1, v0, Ljava/util/ArrayList;

    if-nez p1, :cond_7

    check-cast v0, LW8/e1;

    invoke-direct {p0, v0}, LY8/h;->W0(LW8/e1;)V

    goto :goto_6

    :cond_7
    const-string p1, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"

    invoke-static {v0, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v1

    :goto_5
    if-ge v2, p1, :cond_8

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LW8/e1;

    invoke-direct {p0, p2}, LY8/h;->W0(LW8/e1;)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_5

    :cond_8
    :goto_6
    return-void
.end method

.method private static final N0(LY8/h;Le9/a;Ljava/lang/Object;Ljava/lang/Object;)Lx7/q;
    .locals 0

    new-instance p2, LY8/g;

    invoke-direct {p2, p3, p0, p1}, LY8/g;-><init>(Ljava/lang/Object;LY8/h;Le9/a;)V

    return-object p2
.end method

.method private final O()LY8/p;
    .locals 6

    .prologue
    invoke-static {}, LY8/h;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LY8/h;->j0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY8/p;

    iget-wide v2, v1, Lb9/A;->c:J

    move-object v4, v0

    check-cast v4, LY8/p;

    iget-wide v4, v4, Lb9/A;->c:J

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    move-object v0, v1

    :cond_0
    invoke-static {}, LY8/h;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY8/p;

    iget-wide v2, v1, Lb9/A;->c:J

    move-object v4, v0

    check-cast v4, LY8/p;

    iget-wide v4, v4, Lb9/A;->c:J

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    move-object v0, v1

    :cond_1
    check-cast v0, Lb9/b;

    invoke-static {v0}, Lb9/a;->b(Lb9/b;)Lb9/b;

    move-result-object v0

    check-cast v0, LY8/p;

    return-object v0
.end method

.method private static final O0(Ljava/lang/Object;LY8/h;Le9/a;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)Li7/M;
    .locals 0

    .prologue
    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object p3

    if-eq p0, p3, :cond_0

    iget-object p1, p1, LY8/h;->D:Lx7/l;

    invoke-interface {p2}, Le9/a;->getContext()Lm7/i;

    move-result-object p2

    invoke-static {p1, p0, p2}, Lb9/w;->a(Lx7/l;Ljava/lang/Object;Lm7/i;)V

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private final P0(LW8/e1;LY8/p;I)V
    .locals 0

    invoke-virtual {p0}, LY8/h;->M0()V

    invoke-interface {p1, p2, p3}, LW8/e1;->b(Lb9/A;I)V

    return-void
.end method

.method private final Q(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LY8/h;->R(J)LY8/p;

    move-result-object p1

    invoke-direct {p0, p1}, LY8/h;->V0(LY8/p;)V

    return-void
.end method

.method private final Q0(LW8/e1;LY8/p;I)V
    .locals 1

    sget v0, LY8/i;->b:I

    add-int/2addr p3, v0

    invoke-interface {p1, p2, p3}, LW8/e1;->b(Lb9/A;I)V

    return-void
.end method

.method private final R(J)LY8/p;
    .locals 5

    .prologue
    invoke-direct {p0}, LY8/h;->O()LY8/p;

    move-result-object v0

    invoke-virtual {p0}, LY8/h;->x0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, LY8/h;->z0(LY8/p;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v1, v2}, LY8/h;->T(J)V

    :cond_0
    invoke-direct {p0, v0, p1, p2}, LY8/h;->N(LY8/p;J)V

    return-object v0
.end method

.method static synthetic R0(LY8/h;Lm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-static {}, LY8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY8/p;

    :cond_0
    :goto_0
    invoke-virtual {p0}, LY8/h;->u0()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static {}, LY8/h;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v8

    sget v1, LY8/i;->b:I

    int-to-long v2, v1

    div-long v2, v8, v2

    int-to-long v4, v1

    rem-long v4, v8, v4

    long-to-int v1, v4

    iget-wide v4, v0, Lb9/A;->c:J

    cmp-long v4, v4, v2

    if-eqz v4, :cond_2

    invoke-static {p0, v2, v3, v0}, LY8/h;->p(LY8/h;JLY8/p;)LY8/p;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :cond_2
    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, v0

    move v4, v1

    move-wide v5, v8

    invoke-static/range {v2 .. v7}, LY8/h;->F(LY8/h;LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, LY8/i;->r()Lb9/D;

    move-result-object v3

    if-eq v2, v3, :cond_5

    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object v3

    if-ne v2, v3, :cond_3

    invoke-virtual {p0}, LY8/h;->l0()J

    move-result-wide v1

    cmp-long v1, v8, v1

    if-gez v1, :cond_0

    invoke-virtual {v0}, Lb9/b;->c()V

    goto :goto_0

    :cond_3
    invoke-static {}, LY8/i;->s()Lb9/D;

    move-result-object v3

    if-ne v2, v3, :cond_4

    move-object v2, p0

    move-object v3, v0

    move v4, v1

    move-wide v5, v8

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, LY8/h;->U0(LY8/p;IJLm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-virtual {v0}, Lb9/b;->c()V

    return-object v2

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-direct {p0}, LY8/h;->e0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lb9/C;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method

.method private final S()V
    .locals 0

    invoke-virtual {p0}, LY8/h;->m()Z

    return-void
.end method

.method static synthetic S0(LY8/h;Lm7/e;)Ljava/lang/Object;
    .locals 13

    .prologue
    instance-of v0, p1, LY8/h$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LY8/h$d;

    iget v1, v0, LY8/h$d;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LY8/h$d;->H:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, LY8/h$d;

    invoke-direct {v0, p0, p1}, LY8/h$d;-><init>(LY8/h;Lm7/e;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, LY8/h$d;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, v6, LY8/h$d;->H:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    check-cast p1, LY8/n;

    invoke-virtual {p1}, LY8/n;->l()Ljava/lang/Object;

    move-result-object p0

    goto/16 :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-static {}, LY8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY8/p;

    :cond_3
    :goto_2
    invoke-virtual {p0}, LY8/h;->u0()Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object p1, LY8/n;->b:LY8/n$b;

    invoke-virtual {p0}, LY8/h;->b0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {p1, p0}, LY8/n$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_3

    :cond_4
    invoke-static {}, LY8/h;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v4

    sget v1, LY8/i;->b:I

    int-to-long v7, v1

    div-long v7, v4, v7

    int-to-long v9, v1

    rem-long v9, v4, v9

    long-to-int v3, v9

    iget-wide v9, p1, Lb9/A;->c:J

    cmp-long v1, v9, v7

    if-eqz v1, :cond_6

    invoke-static {p0, v7, v8, p1}, LY8/h;->p(LY8/h;JLY8/p;)LY8/p;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, v1

    :cond_6
    const/4 v12, 0x0

    move-object v7, p0

    move-object v8, p1

    move v9, v3

    move-wide v10, v4

    invoke-static/range {v7 .. v12}, LY8/h;->F(LY8/h;LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LY8/i;->r()Lb9/D;

    move-result-object v7

    if-eq v1, v7, :cond_a

    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object v7

    if-ne v1, v7, :cond_7

    invoke-virtual {p0}, LY8/h;->l0()J

    move-result-wide v7

    cmp-long v1, v4, v7

    if-gez v1, :cond_3

    invoke-virtual {p1}, Lb9/b;->c()V

    goto :goto_2

    :cond_7
    invoke-static {}, LY8/i;->s()Lb9/D;

    move-result-object v7

    if-ne v1, v7, :cond_8

    iput v2, v6, LY8/h$d;->H:I

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, LY8/h;->T0(LY8/p;IJLm7/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_9

    return-object v0

    :cond_8
    invoke-virtual {p1}, Lb9/b;->c()V

    sget-object p0, LY8/n;->b:LY8/n$b;

    invoke-virtual {p0, v1}, LY8/n$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :cond_9
    :goto_3
    return-object p0

    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final T0(LY8/p;IJLm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    instance-of v0, p5, LY8/h$e;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, LY8/h$e;

    iget v1, v0, LY8/h$e;->L:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LY8/h$e;->L:I

    goto :goto_0

    :cond_0
    new-instance v0, LY8/h$e;

    invoke-direct {v0, p0, p5}, LY8/h$e;-><init>(LY8/h;Lm7/e;)V

    :goto_0
    iget-object p5, v0, LY8/h$e;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LY8/h$e;->L:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LY8/h$e;->G:Ljava/lang/Object;

    check-cast p1, LY8/p;

    iget-object p1, v0, LY8/h$e;->F:Ljava/lang/Object;

    check-cast p1, LY8/h;

    invoke-static {p5}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Li7/x;->b(Ljava/lang/Object;)V

    iput-object p0, v0, LY8/h$e;->F:Ljava/lang/Object;

    iput-object p1, v0, LY8/h$e;->G:Ljava/lang/Object;

    iput p2, v0, LY8/h$e;->H:I

    iput-wide p3, v0, LY8/h$e;->I:J

    iput v3, v0, LY8/h$e;->L:I

    invoke-static {v0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object p5

    invoke-static {p5}, LW8/p;->b(Lm7/e;)LW8/n;

    move-result-object p5

    :try_start_0
    new-instance v8, LY8/A;

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>"

    invoke-static {p5, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, p5}, LY8/A;-><init>(LW8/n;)V

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-wide v5, p3

    move-object v7, v8

    invoke-static/range {v2 .. v7}, LY8/h;->F(LY8/h;LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, LY8/i;->r()Lb9/D;

    move-result-object v3

    if-ne v2, v3, :cond_3

    invoke-static {p0, v8, p1, p2}, LY8/h;->C(LY8/h;LW8/e1;LY8/p;I)V

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_3
    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object p2

    const/4 v9, 0x0

    if-ne v2, p2, :cond_d

    invoke-virtual {p0}, LY8/h;->l0()J

    move-result-wide v2

    cmp-long p2, p3, v2

    if-gez p2, :cond_4

    invoke-virtual {p1}, Lb9/b;->c()V

    :cond_4
    invoke-static {}, LY8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY8/p;

    :cond_5
    :goto_1
    invoke-virtual {p0}, LY8/h;->u0()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-static {p0, p5}, LY8/h;->z(LY8/h;LW8/l;)V

    goto/16 :goto_3

    :cond_6
    invoke-static {}, LY8/h;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide p2

    sget p4, LY8/i;->b:I

    int-to-long v2, p4

    div-long v2, p2, v2

    int-to-long v4, p4

    rem-long v4, p2, v4

    long-to-int p4, v4

    iget-wide v4, p1, Lb9/A;->c:J

    cmp-long v4, v4, v2

    if-eqz v4, :cond_8

    invoke-static {p0, v2, v3, p1}, LY8/h;->p(LY8/h;JLY8/p;)LY8/p;

    move-result-object v2

    if-nez v2, :cond_7

    goto :goto_1

    :cond_7
    move-object p1, v2

    :cond_8
    move-object v2, p0

    move-object v3, p1

    move v4, p4

    move-wide v5, p2

    move-object v7, v8

    invoke-static/range {v2 .. v7}, LY8/h;->F(LY8/h;LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, LY8/i;->r()Lb9/D;

    move-result-object v3

    if-ne v2, v3, :cond_9

    invoke-static {p0, v8, p1, p4}, LY8/h;->C(LY8/h;LW8/e1;LY8/p;I)V

    goto :goto_3

    :cond_9
    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object p4

    if-ne v2, p4, :cond_a

    invoke-virtual {p0}, LY8/h;->l0()J

    move-result-wide v2

    cmp-long p2, p2, v2

    if-gez p2, :cond_5

    invoke-virtual {p1}, Lb9/b;->c()V

    goto :goto_1

    :cond_a
    invoke-static {}, LY8/i;->s()Lb9/D;

    move-result-object p2

    if-eq v2, p2, :cond_c

    invoke-virtual {p1}, Lb9/b;->c()V

    sget-object p1, LY8/n;->b:LY8/n$b;

    invoke-virtual {p1, v2}, LY8/n$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LY8/n;->b(Ljava/lang/Object;)LY8/n;

    move-result-object p1

    iget-object p2, p0, LY8/h;->D:Lx7/l;

    if-eqz p2, :cond_b

    invoke-static {p0, p2}, LY8/h;->n(LY8/h;Lx7/l;)LF7/f;

    move-result-object v9

    :cond_b
    check-cast v9, Lx7/q;

    :goto_2
    invoke-virtual {p5, p1, v9}, LW8/n;->C(Ljava/lang/Object;Lx7/q;)V

    goto :goto_3

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    invoke-virtual {p1}, Lb9/b;->c()V

    sget-object p1, LY8/n;->b:LY8/n$b;

    invoke-virtual {p1, v2}, LY8/n$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LY8/n;->b(Ljava/lang/Object;)LY8/n;

    move-result-object p1

    iget-object p2, p0, LY8/h;->D:Lx7/l;

    if-eqz p2, :cond_e

    invoke-static {p0, p2}, LY8/h;->n(LY8/h;Lx7/l;)LF7/f;

    move-result-object v9

    :cond_e
    check-cast v9, Lx7/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_3
    invoke-virtual {p5}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p5

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p5, p1, :cond_f

    invoke-static {v0}, Lo7/h;->c(Lm7/e;)V

    :cond_f
    if-ne p5, v1, :cond_10

    return-object v1

    :cond_10
    :goto_4
    check-cast p5, LY8/n;

    invoke-virtual {p5}, LY8/n;->l()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :goto_5
    invoke-virtual {p5}, LW8/n;->Q()V

    throw p1
.end method

.method private final U()V
    .locals 14

    .prologue
    invoke-direct {p0}, LY8/h;->y0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, LY8/h;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY8/p;

    :cond_1
    :goto_0
    invoke-static {}, LY8/h;->Y()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v7

    sget v9, LY8/i;->b:I

    int-to-long v1, v9

    div-long v2, v7, v1

    invoke-virtual {p0}, LY8/h;->l0()J

    move-result-wide v4

    cmp-long v1, v4, v7

    const/4 v10, 0x0

    const/4 v11, 0x1

    const-wide/16 v12, 0x0

    iget-wide v4, v0, Lb9/A;->c:J

    if-gtz v1, :cond_3

    cmp-long v1, v4, v2

    if-gez v1, :cond_2

    invoke-virtual {v0}, Lb9/b;->f()Lb9/b;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-direct {p0, v2, v3, v0}, LY8/h;->D0(JLY8/p;)V

    :cond_2
    invoke-static {p0, v12, v13, v11, v10}, LY8/h;->p0(LY8/h;JILjava/lang/Object;)V

    return-void

    :cond_3
    cmp-long v1, v4, v2

    if-eqz v1, :cond_5

    move-object v1, p0

    move-object v4, v0

    move-wide v5, v7

    invoke-direct/range {v1 .. v6}, LY8/h;->V(JLY8/p;J)LY8/p;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    move-object v0, v1

    :cond_5
    int-to-long v1, v9

    rem-long v1, v7, v1

    long-to-int v1, v1

    invoke-direct {p0, v0, v1, v7, v8}, LY8/h;->f1(LY8/p;IJ)Z

    move-result v1

    invoke-static {p0, v12, v13, v11, v10}, LY8/h;->p0(LY8/h;JILjava/lang/Object;)V

    if-eqz v1, :cond_1

    return-void
.end method

.method private final U0(LY8/p;IJLm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-static {p5}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v0

    invoke-static {v0}, LW8/p;->b(Lm7/e;)LW8/n;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    move-object v6, v0

    :try_start_0
    invoke-static/range {v1 .. v6}, LY8/h;->F(LY8/h;LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LY8/i;->r()Lb9/D;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-static {p0, v0, p1, p2}, LY8/h;->C(LY8/h;LW8/e1;LY8/p;I)V

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object p2

    const/4 v7, 0x0

    if-ne v1, p2, :cond_b

    invoke-virtual {p0}, LY8/h;->l0()J

    move-result-wide v1

    cmp-long p2, p3, v1

    if-gez p2, :cond_1

    invoke-virtual {p1}, Lb9/b;->c()V

    :cond_1
    invoke-static {}, LY8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY8/p;

    :cond_2
    :goto_0
    invoke-virtual {p0}, LY8/h;->u0()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {p0, v0}, LY8/h;->A(LY8/h;LW8/l;)V

    goto/16 :goto_2

    :cond_3
    invoke-static {}, LY8/h;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide p2

    sget p4, LY8/i;->b:I

    int-to-long v1, p4

    div-long v1, p2, v1

    int-to-long v3, p4

    rem-long v3, p2, v3

    long-to-int p4, v3

    iget-wide v3, p1, Lb9/A;->c:J

    cmp-long v3, v3, v1

    if-eqz v3, :cond_5

    invoke-static {p0, v1, v2, p1}, LY8/h;->p(LY8/h;JLY8/p;)LY8/p;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    move-object p1, v1

    :cond_5
    move-object v1, p0

    move-object v2, p1

    move v3, p4

    move-wide v4, p2

    move-object v6, v0

    invoke-static/range {v1 .. v6}, LY8/h;->F(LY8/h;LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LY8/i;->r()Lb9/D;

    move-result-object v2

    if-ne v1, v2, :cond_7

    instance-of p2, v0, LW8/e1;

    if-eqz p2, :cond_6

    move-object v7, v0

    :cond_6
    if-eqz v7, :cond_d

    invoke-static {p0, v7, p1, p4}, LY8/h;->C(LY8/h;LW8/e1;LY8/p;I)V

    goto :goto_2

    :cond_7
    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object p4

    if-ne v1, p4, :cond_8

    invoke-virtual {p0}, LY8/h;->l0()J

    move-result-wide v1

    cmp-long p2, p2, v1

    if-gez p2, :cond_2

    invoke-virtual {p1}, Lb9/b;->c()V

    goto :goto_0

    :cond_8
    invoke-static {}, LY8/i;->s()Lb9/D;

    move-result-object p2

    if-eq v1, p2, :cond_a

    invoke-virtual {p1}, Lb9/b;->c()V

    iget-object p1, p0, LY8/h;->D:Lx7/l;

    if-eqz p1, :cond_9

    invoke-static {p0, p1}, LY8/h;->i(LY8/h;Lx7/l;)LF7/f;

    move-result-object v7

    :cond_9
    check-cast v7, Lx7/q;

    :goto_1
    invoke-virtual {v0, v1, v7}, LW8/n;->C(Ljava/lang/Object;Lx7/q;)V

    goto :goto_2

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-virtual {p1}, Lb9/b;->c()V

    iget-object p1, p0, LY8/h;->D:Lx7/l;

    if-eqz p1, :cond_c

    invoke-static {p0, p1}, LY8/h;->i(LY8/h;Lx7/l;)LF7/f;

    move-result-object v7

    :cond_c
    check-cast v7, Lx7/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_d
    :goto_2
    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_e

    invoke-static {p5}, Lo7/h;->c(Lm7/e;)V

    :cond_e
    return-object p1

    :goto_3
    invoke-virtual {v0}, LW8/n;->Q()V

    throw p1
.end method

.method private final V(JLY8/p;J)LY8/p;
    .locals 15

    .prologue
    move-object v6, p0

    move-wide/from16 v0, p1

    invoke-static {}, LY8/h;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    invoke-static {}, LY8/i;->y()LF7/f;

    move-result-object v3

    check-cast v3, Lx7/p;

    move-object/from16 v4, p3

    :goto_0
    invoke-static {v4, v0, v1, v3}, Lb9/a;->c(Lb9/A;JLx7/p;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lb9/B;->c(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    invoke-static {v5}, Lb9/B;->b(Ljava/lang/Object;)Lb9/A;

    move-result-object v7

    :cond_0
    :goto_1
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lb9/A;

    iget-wide v9, v8, Lb9/A;->c:J

    iget-wide v11, v7, Lb9/A;->c:J

    cmp-long v9, v9, v11

    if-ltz v9, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v7}, Lb9/A;->u()Z

    move-result v9

    if-nez v9, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v2, p0, v8, v7}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v8}, Lb9/A;->p()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v8}, Lb9/b;->n()V

    goto :goto_2

    :cond_3
    invoke-virtual {v7}, Lb9/A;->p()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-virtual {v7}, Lb9/b;->n()V

    goto :goto_1

    :cond_4
    :goto_2
    invoke-static {v5}, Lb9/B;->c(Ljava/lang/Object;)Z

    move-result v2

    const/4 v7, 0x1

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    if-eqz v2, :cond_6

    invoke-direct {p0}, LY8/h;->S()V

    invoke-direct/range {p0 .. p3}, LY8/h;->D0(JLY8/p;)V

    :cond_5
    invoke-static {p0, v8, v9, v7, v10}, LY8/h;->p0(LY8/h;JILjava/lang/Object;)V

    goto :goto_3

    :cond_6
    invoke-static {v5}, Lb9/B;->b(Ljava/lang/Object;)Lb9/A;

    move-result-object v2

    move-object v11, v2

    check-cast v11, LY8/p;

    iget-wide v2, v11, Lb9/A;->c:J

    cmp-long v0, v2, v0

    if-lez v0, :cond_7

    invoke-static {}, LY8/h;->Y()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    const-wide/16 v1, 0x1

    add-long v2, p4, v1

    iget-wide v4, v11, Lb9/A;->c:J

    sget v12, LY8/i;->b:I

    int-to-long v13, v12

    mul-long/2addr v4, v13

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-wide v0, v11, Lb9/A;->c:J

    int-to-long v2, v12

    mul-long/2addr v0, v2

    sub-long v0, v0, p4

    invoke-direct {p0, v0, v1}, LY8/h;->o0(J)V

    goto :goto_3

    :cond_7
    move-object v10, v11

    :goto_3
    return-object v10
.end method

.method private final V0(LY8/p;)V
    .locals 11

    .prologue
    iget-object v0, p0, LY8/h;->D:Lx7/l;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Lb9/j;->b(Ljava/lang/Object;ILy7/k;)Ljava/lang/Object;

    move-result-object v3

    :cond_0
    sget v4, LY8/i;->b:I

    sub-int/2addr v4, v2

    :goto_0
    const/4 v5, -0x1

    if-ge v5, v4, :cond_b

    iget-wide v6, p1, Lb9/A;->c:J

    sget v8, LY8/i;->b:I

    int-to-long v8, v8

    mul-long/2addr v6, v8

    int-to-long v8, v4

    add-long/2addr v6, v8

    :cond_1
    invoke-virtual {p1, v4}, LY8/p;->B(I)Ljava/lang/Object;

    move-result-object v8

    invoke-static {}, LY8/i;->f()Lb9/D;

    move-result-object v9

    if-eq v8, v9, :cond_c

    sget-object v9, LY8/i;->d:Lb9/D;

    if-ne v8, v9, :cond_3

    invoke-virtual {p0}, LY8/h;->h0()J

    move-result-wide v9

    cmp-long v9, v6, v9

    if-ltz v9, :cond_c

    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v9

    invoke-virtual {p1, v4, v8, v9}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    if-eqz v0, :cond_2

    invoke-virtual {p1, v4}, LY8/p;->A(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v5, v1}, Lb9/w;->b(Lx7/l;Ljava/lang/Object;Lb9/S;)Lb9/S;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-virtual {p1, v4}, LY8/p;->w(I)V

    :goto_2
    invoke-virtual {p1}, Lb9/A;->t()V

    goto :goto_6

    :cond_3
    invoke-static {}, LY8/i;->k()Lb9/D;

    move-result-object v9

    if-eq v8, v9, :cond_a

    if-nez v8, :cond_4

    goto :goto_5

    :cond_4
    instance-of v9, v8, LW8/e1;

    if-nez v9, :cond_7

    instance-of v9, v8, LY8/D;

    if-eqz v9, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {}, LY8/i;->p()Lb9/D;

    move-result-object v9

    if-eq v8, v9, :cond_c

    invoke-static {}, LY8/i;->q()Lb9/D;

    move-result-object v9

    if-ne v8, v9, :cond_6

    goto :goto_7

    :cond_6
    invoke-static {}, LY8/i;->p()Lb9/D;

    move-result-object v9

    if-eq v8, v9, :cond_1

    goto :goto_6

    :cond_7
    :goto_3
    invoke-virtual {p0}, LY8/h;->h0()J

    move-result-wide v9

    cmp-long v9, v6, v9

    if-ltz v9, :cond_c

    instance-of v9, v8, LY8/D;

    if-eqz v9, :cond_8

    move-object v9, v8

    check-cast v9, LY8/D;

    iget-object v9, v9, LY8/D;->a:LW8/e1;

    goto :goto_4

    :cond_8
    move-object v9, v8

    check-cast v9, LW8/e1;

    :goto_4
    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v10

    invoke-virtual {p1, v4, v8, v10}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    if-eqz v0, :cond_9

    invoke-virtual {p1, v4}, LY8/p;->A(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v5, v1}, Lb9/w;->b(Lx7/l;Ljava/lang/Object;Lb9/S;)Lb9/S;

    move-result-object v1

    :cond_9
    invoke-static {v3, v9}, Lb9/j;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_1

    :cond_a
    :goto_5
    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v9

    invoke-virtual {p1, v4, v8, v9}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_2

    :goto_6
    add-int/lit8 v4, v4, -0x1

    goto/16 :goto_0

    :cond_b
    invoke-virtual {p1}, Lb9/b;->h()Lb9/b;

    move-result-object p1

    check-cast p1, LY8/p;

    if-nez p1, :cond_0

    :cond_c
    :goto_7
    if-eqz v3, :cond_e

    instance-of p1, v3, Ljava/util/ArrayList;

    if-nez p1, :cond_d

    check-cast v3, LW8/e1;

    invoke-direct {p0, v3}, LY8/h;->X0(LW8/e1;)V

    goto :goto_9

    :cond_d
    const-string p1, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"

    invoke-static {v3, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v2

    :goto_8
    if-ge v5, p1, :cond_e

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW8/e1;

    invoke-direct {p0, v0}, LY8/h;->X0(LW8/e1;)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_8

    :cond_e
    :goto_9
    if-nez v1, :cond_f

    return-void

    :cond_f
    throw v1
.end method

.method private final W(JLY8/p;)LY8/p;
    .locals 9

    .prologue
    invoke-static {}, LY8/h;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {}, LY8/i;->y()LF7/f;

    move-result-object v1

    check-cast v1, Lx7/p;

    :goto_0
    invoke-static {p3, p1, p2, v1}, Lb9/a;->c(Lb9/A;JLx7/p;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lb9/B;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v2}, Lb9/B;->b(Ljava/lang/Object;)Lb9/A;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb9/A;

    iget-wide v5, v4, Lb9/A;->c:J

    iget-wide v7, v3, Lb9/A;->c:J

    cmp-long v5, v5, v7

    if-ltz v5, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v3}, Lb9/A;->u()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v0, p0, v4, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Lb9/A;->p()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v4}, Lb9/b;->n()V

    goto :goto_2

    :cond_3
    invoke-virtual {v3}, Lb9/A;->p()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Lb9/b;->n()V

    goto :goto_1

    :cond_4
    :goto_2
    invoke-static {v2}, Lb9/B;->c(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-direct {p0}, LY8/h;->S()V

    iget-wide p1, p3, Lb9/A;->c:J

    sget v0, LY8/i;->b:I

    int-to-long v2, v0

    mul-long/2addr p1, v2

    invoke-virtual {p0}, LY8/h;->l0()J

    move-result-wide v2

    cmp-long p1, p1, v2

    if-gez p1, :cond_a

    :goto_3
    invoke-virtual {p3}, Lb9/b;->c()V

    goto :goto_6

    :cond_5
    invoke-static {v2}, Lb9/B;->b(Ljava/lang/Object;)Lb9/A;

    move-result-object p3

    check-cast p3, LY8/p;

    invoke-direct {p0}, LY8/h;->y0()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-direct {p0}, LY8/h;->Z()J

    move-result-wide v2

    sget v0, LY8/i;->b:I

    int-to-long v4, v0

    div-long/2addr v2, v4

    cmp-long v0, p1, v2

    if-gtz v0, :cond_8

    invoke-static {}, LY8/h;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_6
    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb9/A;

    iget-wide v3, v2, Lb9/A;->c:J

    iget-wide v5, p3, Lb9/A;->c:J

    cmp-long v3, v3, v5

    if-gez v3, :cond_8

    invoke-virtual {p3}, Lb9/A;->u()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-static {v0, p0, v2, p3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v2}, Lb9/A;->p()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v2}, Lb9/b;->n()V

    goto :goto_5

    :cond_7
    invoke-virtual {p3}, Lb9/A;->p()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p3}, Lb9/b;->n()V

    goto :goto_4

    :cond_8
    :goto_5
    iget-wide v2, p3, Lb9/A;->c:J

    cmp-long p1, v2, p1

    if-lez p1, :cond_9

    sget p1, LY8/i;->b:I

    int-to-long v4, p1

    mul-long/2addr v2, v4

    invoke-direct {p0, v2, v3}, LY8/h;->l1(J)V

    iget-wide v2, p3, Lb9/A;->c:J

    int-to-long p1, p1

    mul-long/2addr v2, p1

    invoke-virtual {p0}, LY8/h;->l0()J

    move-result-wide p1

    cmp-long p1, v2, p1

    if-gez p1, :cond_a

    goto :goto_3

    :cond_9
    move-object v1, p3

    :cond_a
    :goto_6
    return-object v1
.end method

.method private final W0(LW8/e1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LY8/h;->Y0(LW8/e1;Z)V

    return-void
.end method

.method private final X(JLY8/p;)LY8/p;
    .locals 9

    .prologue
    invoke-static {}, LY8/h;->j0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {}, LY8/i;->y()LF7/f;

    move-result-object v1

    check-cast v1, Lx7/p;

    :goto_0
    invoke-static {p3, p1, p2, v1}, Lb9/a;->c(Lb9/A;JLx7/p;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lb9/B;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v2}, Lb9/B;->b(Ljava/lang/Object;)Lb9/A;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb9/A;

    iget-wide v5, v4, Lb9/A;->c:J

    iget-wide v7, v3, Lb9/A;->c:J

    cmp-long v5, v5, v7

    if-ltz v5, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v3}, Lb9/A;->u()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v0, p0, v4, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Lb9/A;->p()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v4}, Lb9/b;->n()V

    goto :goto_2

    :cond_3
    invoke-virtual {v3}, Lb9/A;->p()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Lb9/b;->n()V

    goto :goto_1

    :cond_4
    :goto_2
    invoke-static {v2}, Lb9/B;->c(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-direct {p0}, LY8/h;->S()V

    iget-wide p1, p3, Lb9/A;->c:J

    sget v0, LY8/i;->b:I

    int-to-long v2, v0

    mul-long/2addr p1, v2

    invoke-virtual {p0}, LY8/h;->h0()J

    move-result-wide v2

    cmp-long p1, p1, v2

    if-gez p1, :cond_7

    :goto_3
    invoke-virtual {p3}, Lb9/b;->c()V

    goto :goto_4

    :cond_5
    invoke-static {v2}, Lb9/B;->b(Ljava/lang/Object;)Lb9/A;

    move-result-object p3

    check-cast p3, LY8/p;

    iget-wide v2, p3, Lb9/A;->c:J

    cmp-long p1, v2, p1

    if-lez p1, :cond_6

    sget p1, LY8/i;->b:I

    int-to-long v4, p1

    mul-long/2addr v2, v4

    invoke-direct {p0, v2, v3}, LY8/h;->n1(J)V

    iget-wide v2, p3, Lb9/A;->c:J

    int-to-long p1, p1

    mul-long/2addr v2, p1

    invoke-virtual {p0}, LY8/h;->h0()J

    move-result-wide p1

    cmp-long p1, v2, p1

    if-gez p1, :cond_7

    goto :goto_3

    :cond_6
    move-object v1, p3

    :cond_7
    :goto_4
    return-object v1
.end method

.method private final X0(LW8/e1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LY8/h;->Y0(LW8/e1;Z)V

    return-void
.end method

.method private static final synthetic Y()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    sget-object v0, LY8/h;->H:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final Y0(LW8/e1;Z)V
    .locals 2

    .prologue
    instance-of v0, p1, LW8/l;

    if-eqz v0, :cond_1

    check-cast p1, Lm7/e;

    sget-object v0, Li7/w;->D:Li7/w$a;

    if-eqz p2, :cond_0

    invoke-direct {p0}, LY8/h;->e0()Ljava/lang/Throwable;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LY8/h;->i0()Ljava/lang/Throwable;

    move-result-object p2

    :goto_0
    invoke-static {p2}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    :goto_1
    invoke-static {p2}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Lm7/e;->t(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    instance-of p2, p1, LY8/A;

    if-eqz p2, :cond_2

    check-cast p1, LY8/A;

    iget-object p1, p1, LY8/A;->C:LW8/n;

    sget-object p2, Li7/w;->D:Li7/w$a;

    sget-object p2, LY8/n;->b:LY8/n$b;

    invoke-virtual {p0}, LY8/h;->b0()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p2, v0}, LY8/n$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LY8/n;->b(Ljava/lang/Object;)LY8/n;

    move-result-object p2

    goto :goto_1

    :cond_2
    instance-of p2, p1, LY8/h$a;

    if-eqz p2, :cond_3

    check-cast p1, LY8/h$a;

    invoke-virtual {p1}, LY8/h$a;->j()V

    :goto_2
    return-void

    :cond_3
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected waiter: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final Z()J
    .locals 2

    invoke-static {}, LY8/h;->Y()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic Z0(LY8/h;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 13

    .prologue
    invoke-static {}, LY8/h;->u()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY8/p;

    :cond_0
    :goto_0
    invoke-static {}, LY8/h;->v()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long/2addr v3, v1

    invoke-static {p0, v1, v2}, LY8/h;->w(LY8/h;J)Z

    move-result v1

    sget v2, LY8/i;->b:I

    int-to-long v5, v2

    div-long v5, v3, v5

    int-to-long v7, v2

    rem-long v7, v3, v7

    long-to-int v2, v7

    iget-wide v7, v0, Lb9/A;->c:J

    cmp-long v7, v7, v5

    if-eqz v7, :cond_2

    invoke-static {p0, v5, v6, v0}, LY8/h;->q(LY8/h;JLY8/p;)LY8/p;

    move-result-object v5

    if-nez v5, :cond_1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1, p2}, LY8/h;->J0(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_9

    return-object p0

    :cond_1
    move-object v0, v5

    :cond_2
    const/4 v11, 0x0

    move-object v5, p0

    move-object v6, v0

    move v7, v2

    move-object v8, p1

    move-wide v9, v3

    move v12, v1

    invoke-static/range {v5 .. v12}, LY8/h;->G(LY8/h;LY8/p;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v5

    if-eqz v5, :cond_8

    const/4 v6, 0x1

    if-eq v5, v6, :cond_9

    const/4 v6, 0x2

    if-eq v5, v6, :cond_7

    const/4 v1, 0x3

    if-eq v5, v1, :cond_6

    const/4 v1, 0x4

    if-eq v5, v1, :cond_4

    const/4 v1, 0x5

    if-eq v5, v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lb9/b;->c()V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, LY8/h;->h0()J

    move-result-wide v1

    cmp-long v1, v3, v1

    if-gez v1, :cond_5

    invoke-virtual {v0}, Lb9/b;->c()V

    :cond_5
    invoke-direct {p0, p1, p2}, LY8/h;->J0(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_9

    return-object p0

    :cond_6
    move-object v5, p0

    move-object v6, v0

    move v7, v2

    move-object v8, p1

    move-wide v9, v3

    move-object v11, p2

    invoke-direct/range {v5 .. v11}, LY8/h;->a1(LY8/p;ILjava/lang/Object;JLm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_9

    return-object p0

    :cond_7
    if-eqz v1, :cond_9

    invoke-virtual {v0}, Lb9/A;->t()V

    invoke-direct {p0, p1, p2}, LY8/h;->J0(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_9

    return-object p0

    :cond_8
    invoke-virtual {v0}, Lb9/b;->c()V

    :cond_9
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final synthetic a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LY8/h;->L:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final a1(LY8/p;ILjava/lang/Object;JLm7/e;)Ljava/lang/Object;
    .locals 20

    .prologue
    move-object/from16 v9, p0

    move-object/from16 v0, p3

    invoke-static/range {p6 .. p6}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    invoke-static {v1}, LW8/p;->b(Lm7/e;)LW8/n;

    move-result-object v10

    const/4 v8, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    move-object v7, v10

    :try_start_0
    invoke-static/range {v1 .. v8}, LY8/h;->G(LY8/h;LY8/p;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_10

    const/4 v11, 0x1

    if-eq v1, v11, :cond_f

    const/4 v12, 0x2

    if-eq v1, v12, :cond_e

    const/4 v13, 0x4

    if-eq v1, v13, :cond_d

    const-string v14, "unexpected"

    const/4 v15, 0x5

    if-ne v1, v15, :cond_c

    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lb9/b;->c()V

    invoke-static {}, LY8/h;->u()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY8/p;

    :cond_0
    :goto_0
    invoke-static {}, LY8/h;->v()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide v4, 0xfffffffffffffffL

    and-long v16, v2, v4

    invoke-static {v9, v2, v3}, LY8/h;->w(LY8/h;J)Z

    move-result v18

    sget v2, LY8/i;->b:I

    int-to-long v3, v2

    div-long v3, v16, v3

    int-to-long v5, v2

    rem-long v5, v16, v5

    long-to-int v8, v5

    iget-wide v5, v1, Lb9/A;->c:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_3

    invoke-static {v9, v3, v4, v1}, LY8/h;->q(LY8/h;JLY8/p;)LY8/p;

    move-result-object v2

    if-nez v2, :cond_2

    if-eqz v18, :cond_0

    :cond_1
    :goto_1
    invoke-static {v9, v0, v10}, LY8/h;->B(LY8/h;Ljava/lang/Object;LW8/l;)V

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_2
    move-object v7, v2

    goto :goto_2

    :cond_3
    move-object v7, v1

    :goto_2
    move-object/from16 v1, p0

    move-object v2, v7

    move v3, v8

    move-object/from16 v4, p3

    move-wide/from16 v5, v16

    move-object/from16 p1, v7

    move-object v7, v10

    move/from16 v19, v8

    move/from16 v8, v18

    invoke-static/range {v1 .. v8}, LY8/h;->G(LY8/h;LY8/p;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v1

    if-eqz v1, :cond_b

    if-eq v1, v11, :cond_a

    if-eq v1, v12, :cond_7

    const/4 v2, 0x3

    if-eq v1, v2, :cond_6

    if-eq v1, v13, :cond_5

    if-eq v1, v15, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lb9/b;->c()V

    :goto_3
    move-object/from16 v1, p1

    goto :goto_0

    :cond_5
    invoke-virtual/range {p0 .. p0}, LY8/h;->h0()J

    move-result-wide v1

    cmp-long v1, v16, v1

    if-gez v1, :cond_1

    invoke-virtual/range {p1 .. p1}, Lb9/b;->c()V

    goto :goto_1

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    if-eqz v18, :cond_8

    invoke-virtual/range {p1 .. p1}, Lb9/A;->t()V

    goto :goto_1

    :cond_8
    instance-of v0, v10, LW8/e1;

    if-eqz v0, :cond_9

    move-object v0, v10

    goto :goto_4

    :cond_9
    const/4 v0, 0x0

    :goto_4
    if-eqz v0, :cond_11

    move-object/from16 v2, p1

    move/from16 v1, v19

    invoke-static {v9, v0, v2, v1}, LY8/h;->D(LY8/h;LW8/e1;LY8/p;I)V

    goto :goto_6

    :cond_a
    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    invoke-interface {v10, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    goto :goto_6

    :cond_b
    move-object/from16 v2, p1

    invoke-virtual {v2}, Lb9/b;->c()V

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    invoke-virtual/range {p0 .. p0}, LY8/h;->h0()J

    move-result-wide v1

    cmp-long v1, p4, v1

    if-gez v1, :cond_1

    invoke-virtual/range {p1 .. p1}, Lb9/b;->c()V

    goto/16 :goto_1

    :cond_e
    move-object/from16 v0, p1

    move/from16 v1, p2

    invoke-static {v9, v10, v0, v1}, LY8/h;->D(LY8/h;LW8/e1;LY8/p;I)V

    goto :goto_6

    :cond_f
    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    :cond_10
    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, Lb9/b;->c()V

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :cond_11
    :goto_6
    invoke-virtual {v10}, LW8/n;->x()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_12

    invoke-static/range {p6 .. p6}, Lo7/h;->c(Lm7/e;)V

    :cond_12
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_13

    return-object v0

    :cond_13
    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0

    :goto_7
    invoke-virtual {v10}, LW8/n;->Q()V

    throw v0
.end method

.method private final b1(J)Z
    .locals 2

    .prologue
    invoke-direct {p0, p1, p2}, LY8/h;->w0(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-wide v0, 0xfffffffffffffffL

    and-long/2addr p1, v0

    invoke-direct {p0, p1, p2}, LY8/h;->L(J)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private static final synthetic c0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LY8/h;->N:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final c1(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, LY8/A;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LY8/A;

    iget-object p1, p1, LY8/A;->C:LW8/n;

    sget-object v0, LY8/n;->b:LY8/n$b;

    invoke-virtual {v0, p2}, LY8/n$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LY8/n;->b(Ljava/lang/Object;)LY8/n;

    move-result-object p2

    iget-object v0, p0, LY8/h;->D:Lx7/l;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, LY8/h;->K(Lx7/l;)LF7/f;

    move-result-object v1

    :cond_0
    :goto_0
    check-cast v1, Lx7/q;

    invoke-static {p1, p2, v1}, LY8/i;->u(LW8/l;Ljava/lang/Object;Lx7/q;)Z

    move-result p1

    goto :goto_1

    :cond_1
    instance-of v0, p1, LY8/h$a;

    if-eqz v0, :cond_2

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LY8/h$a;

    invoke-virtual {p1, p2}, LY8/h$a;->i(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_1

    :cond_2
    instance-of v0, p1, LW8/l;

    if-eqz v0, :cond_3

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LW8/l;

    iget-object v0, p0, LY8/h;->D:Lx7/l;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, LY8/h;->H(Lx7/l;)LF7/f;

    move-result-object v1

    goto :goto_0

    :goto_1
    return p1

    :cond_3
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected receiver type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private static final synthetic d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    sget-object v0, LY8/h;->I:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final d1(Ljava/lang/Object;LY8/p;I)Z
    .locals 1

    .prologue
    instance-of p2, p1, LW8/l;

    if-eqz p2, :cond_0

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"

    invoke-static {p1, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LW8/l;

    sget-object p2, Li7/M;->a:Li7/M;

    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-static {p1, p2, v0, p3, v0}, LY8/i;->C(LW8/l;Ljava/lang/Object;Lx7/q;ILjava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unexpected waiter: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static synthetic e(Ljava/lang/Object;LY8/h;Le9/a;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)Li7/M;
    .locals 0

    invoke-static/range {p0 .. p5}, LY8/h;->O0(Ljava/lang/Object;LY8/h;Le9/a;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private final e0()Ljava/lang/Throwable;
    .locals 2

    .prologue
    invoke-virtual {p0}, LY8/h;->b0()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LY8/t;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, LY8/t;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public static synthetic f(LY8/h;Le9/a;Ljava/lang/Object;Ljava/lang/Object;)Lx7/q;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LY8/h;->N0(LY8/h;Le9/a;Ljava/lang/Object;Ljava/lang/Object;)Lx7/q;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LY8/h;->K:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final f1(LY8/p;IJ)Z
    .locals 3

    .prologue
    invoke-virtual {p1, p2}, LY8/p;->B(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/e1;

    if-eqz v1, :cond_1

    invoke-static {}, LY8/h;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    cmp-long v1, p3, v1

    if-ltz v1, :cond_1

    invoke-static {}, LY8/i;->p()Lb9/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v0, p1, p2}, LY8/h;->d1(Ljava/lang/Object;LY8/p;I)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, LY8/i;->d:Lb9/D;

    invoke-virtual {p1, p2, p3}, LY8/p;->F(ILjava/lang/Object;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, LY8/i;->j()Lb9/D;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LY8/p;->F(ILjava/lang/Object;)V

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, LY8/p;->C(IZ)V

    move p1, p3

    :goto_0
    return p1

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, LY8/h;->g1(LY8/p;IJ)Z

    move-result p1

    return p1
.end method

.method public static synthetic g(Lx7/l;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LY8/h;->J(Lx7/l;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    sget-object v0, LY8/h;->G:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final g1(LY8/p;IJ)Z
    .locals 6

    .prologue
    :cond_0
    :goto_0
    invoke-virtual {p1, p2}, LY8/p;->B(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/e1;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    invoke-static {}, LY8/h;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v4

    cmp-long v1, p3, v4

    if-gez v1, :cond_1

    new-instance v1, LY8/D;

    move-object v2, v0

    check-cast v2, LW8/e1;

    invoke-direct {v1, v2}, LY8/D;-><init>(LW8/e1;)V

    invoke-virtual {p1, p2, v0, v1}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_1
    invoke-static {}, LY8/i;->p()Lb9/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0, p1, p2}, LY8/h;->d1(Ljava/lang/Object;LY8/p;I)Z

    move-result p3

    if-eqz p3, :cond_2

    sget-object p3, LY8/i;->d:Lb9/D;

    invoke-virtual {p1, p2, p3}, LY8/p;->F(ILjava/lang/Object;)V

    move v2, v3

    goto :goto_1

    :cond_2
    invoke-static {}, LY8/i;->j()Lb9/D;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LY8/p;->F(ILjava/lang/Object;)V

    invoke-virtual {p1, p2, v2}, LY8/p;->C(IZ)V

    :goto_1
    return v2

    :cond_3
    invoke-static {}, LY8/i;->j()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_4

    return v2

    :cond_4
    if-nez v0, :cond_5

    invoke-static {}, LY8/i;->k()Lb9/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_5
    sget-object v1, LY8/i;->d:Lb9/D;

    if-ne v0, v1, :cond_6

    return v3

    :cond_6
    invoke-static {}, LY8/i;->o()Lb9/D;

    move-result-object v1

    if-eq v0, v1, :cond_a

    invoke-static {}, LY8/i;->f()Lb9/D;

    move-result-object v1

    if-eq v0, v1, :cond_a

    invoke-static {}, LY8/i;->i()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_8

    return v3

    :cond_8
    invoke-static {}, LY8/i;->q()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_9

    goto/16 :goto_0

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unexpected cell state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    :goto_2
    return v3
.end method

.method private final h1(LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-virtual {p1, p2}, LY8/p;->B(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long/2addr v1, v3

    cmp-long v1, p3, v1

    if-ltz v1, :cond_2

    if-nez p5, :cond_0

    invoke-static {}, LY8/i;->s()Lb9/D;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1, p2, v0, p5}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, LY8/h;->U()V

    invoke-static {}, LY8/i;->r()Lb9/D;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v1, LY8/i;->d:Lb9/D;

    if-ne v0, v1, :cond_2

    invoke-static {}, LY8/i;->f()Lb9/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, LY8/h;->U()V

    invoke-virtual {p1, p2}, LY8/p;->D(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-direct/range {p0 .. p5}, LY8/h;->i1(LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic i(LY8/h;Lx7/l;)LF7/f;
    .locals 0

    invoke-direct {p0, p1}, LY8/h;->H(Lx7/l;)LF7/f;

    move-result-object p0

    return-object p0
.end method

.method private final i1(LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    :cond_0
    invoke-virtual {p1, p2}, LY8/p;->B(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-static {}, LY8/i;->k()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_1

    goto/16 :goto_1

    :cond_1
    sget-object v1, LY8/i;->d:Lb9/D;

    if-ne v0, v1, :cond_2

    invoke-static {}, LY8/i;->f()Lb9/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LY8/h;->U()V

    invoke-virtual {p1, p2}, LY8/p;->D(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, LY8/i;->j()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_3

    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, LY8/i;->o()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_4

    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_5

    invoke-direct {p0}, LY8/h;->U()V

    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-static {}, LY8/i;->p()Lb9/D;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-static {}, LY8/i;->q()Lb9/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    instance-of p3, v0, LY8/D;

    if-eqz p3, :cond_6

    check-cast v0, LY8/D;

    iget-object v0, v0, LY8/D;->a:LW8/e1;

    :cond_6
    invoke-direct {p0, v0, p1, p2}, LY8/h;->d1(Ljava/lang/Object;LY8/p;I)Z

    move-result p4

    if-eqz p4, :cond_7

    invoke-static {}, LY8/i;->f()Lb9/D;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LY8/p;->F(ILjava/lang/Object;)V

    invoke-direct {p0}, LY8/h;->U()V

    invoke-virtual {p1, p2}, LY8/p;->D(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_7
    invoke-static {}, LY8/i;->j()Lb9/D;

    move-result-object p4

    invoke-virtual {p1, p2, p4}, LY8/p;->F(ILjava/lang/Object;)V

    const/4 p4, 0x0

    invoke-virtual {p1, p2, p4}, LY8/p;->C(IZ)V

    if-eqz p3, :cond_8

    invoke-direct {p0}, LY8/h;->U()V

    :cond_8
    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_9
    :goto_1
    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long/2addr v1, v3

    cmp-long v1, p3, v1

    if-gez v1, :cond_a

    invoke-static {}, LY8/i;->o()Lb9/D;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LY8/h;->U()V

    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object p1

    return-object p1

    :cond_a
    if-nez p5, :cond_b

    invoke-static {}, LY8/i;->s()Lb9/D;

    move-result-object p1

    return-object p1

    :cond_b
    invoke-virtual {p1, p2, v0, p5}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LY8/h;->U()V

    invoke-static {}, LY8/i;->r()Lb9/D;

    move-result-object p1

    return-object p1
.end method

.method private static final synthetic j0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LY8/h;->J:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final j1(LY8/p;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 3

    .prologue
    invoke-virtual {p1, p2, p3}, LY8/p;->G(ILjava/lang/Object;)V

    if-eqz p7, :cond_0

    invoke-direct/range {p0 .. p7}, LY8/h;->k1(LY8/p;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1, p2}, LY8/p;->B(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    invoke-direct {p0, p4, p5}, LY8/h;->L(J)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    sget-object v0, LY8/i;->d:Lb9/D;

    invoke-virtual {p1, p2, v2, v0}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    return v1

    :cond_1
    if-nez p6, :cond_2

    const/4 p1, 0x3

    return p1

    :cond_2
    invoke-virtual {p1, p2, v2, p6}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 p1, 0x2

    return p1

    :cond_3
    instance-of v2, v0, LW8/e1;

    if-eqz v2, :cond_6

    invoke-virtual {p1, p2}, LY8/p;->w(I)V

    invoke-direct {p0, v0, p3}, LY8/h;->c1(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-static {}, LY8/i;->f()Lb9/D;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LY8/p;->F(ILjava/lang/Object;)V

    invoke-virtual {p0}, LY8/h;->L0()V

    const/4 p1, 0x0

    goto :goto_0

    :cond_4
    invoke-static {}, LY8/i;->i()Lb9/D;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LY8/p;->x(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {}, LY8/i;->i()Lb9/D;

    move-result-object p4

    if-eq p3, p4, :cond_5

    invoke-virtual {p1, p2, v1}, LY8/p;->C(IZ)V

    :cond_5
    const/4 p1, 0x5

    :goto_0
    return p1

    :cond_6
    invoke-direct/range {p0 .. p7}, LY8/h;->k1(LY8/p;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result p1

    return p1
.end method

.method public static final synthetic k(LY8/h;Lx7/l;Ljava/lang/Object;)Lx7/q;
    .locals 0

    invoke-direct {p0, p1, p2}, LY8/h;->I(Lx7/l;Ljava/lang/Object;)Lx7/q;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    sget-object v0, LY8/h;->F:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final k1(LY8/p;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 5

    .prologue
    :cond_0
    invoke-virtual {p1, p2}, LY8/p;->B(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_4

    invoke-direct {p0, p4, p5}, LY8/h;->L(J)Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    if-nez p7, :cond_1

    sget-object v0, LY8/i;->d:Lb9/D;

    invoke-virtual {p1, p2, v4, v0}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_1
    if-eqz p7, :cond_2

    invoke-static {}, LY8/i;->j()Lb9/D;

    move-result-object v0

    invoke-virtual {p1, p2, v4, v0}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, v2}, LY8/p;->C(IZ)V

    return v1

    :cond_2
    if-nez p6, :cond_3

    const/4 p1, 0x3

    return p1

    :cond_3
    invoke-virtual {p1, p2, v4, p6}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x2

    return p1

    :cond_4
    invoke-static {}, LY8/i;->k()Lb9/D;

    move-result-object v4

    if-ne v0, v4, :cond_5

    sget-object v1, LY8/i;->d:Lb9/D;

    invoke-virtual {p1, p2, v0, v1}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_5
    invoke-static {}, LY8/i;->i()Lb9/D;

    move-result-object p4

    const/4 p5, 0x5

    if-ne v0, p4, :cond_6

    invoke-virtual {p1, p2}, LY8/p;->w(I)V

    return p5

    :cond_6
    invoke-static {}, LY8/i;->o()Lb9/D;

    move-result-object p4

    if-ne v0, p4, :cond_7

    invoke-virtual {p1, p2}, LY8/p;->w(I)V

    return p5

    :cond_7
    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object p4

    invoke-virtual {p1, p2}, LY8/p;->w(I)V

    if-ne v0, p4, :cond_8

    invoke-direct {p0}, LY8/h;->S()V

    return v1

    :cond_8
    instance-of p4, v0, LY8/D;

    if-eqz p4, :cond_9

    check-cast v0, LY8/D;

    iget-object v0, v0, LY8/D;->a:LW8/e1;

    :cond_9
    invoke-direct {p0, v0, p3}, LY8/h;->c1(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-static {}, LY8/i;->f()Lb9/D;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LY8/p;->F(ILjava/lang/Object;)V

    invoke-virtual {p0}, LY8/h;->L0()V

    goto :goto_0

    :cond_a
    invoke-static {}, LY8/i;->i()Lb9/D;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LY8/p;->x(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {}, LY8/i;->i()Lb9/D;

    move-result-object p4

    if-eq p3, p4, :cond_b

    invoke-virtual {p1, p2, v3}, LY8/p;->C(IZ)V

    :cond_b
    move v2, p5

    :goto_0
    return v2
.end method

.method private final l1(J)V
    .locals 7

    .prologue
    invoke-static {}, LY8/h;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    cmp-long v1, v3, p1

    if-ltz v1, :cond_1

    return-void

    :cond_1
    invoke-static {}, LY8/h;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    move-object v2, p0

    move-wide v5, p1

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private static final synthetic m0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LY8/h;->M:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method public static final synthetic n(LY8/h;Lx7/l;)LF7/f;
    .locals 0

    invoke-direct {p0, p1}, LY8/h;->K(Lx7/l;)LF7/f;

    move-result-object p0

    return-object p0
.end method

.method private final n1(J)V
    .locals 7

    .prologue
    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide v1, 0xfffffffffffffffL

    and-long/2addr v1, v3

    cmp-long v5, v1, p1

    if-ltz v5, :cond_1

    return-void

    :cond_1
    const/16 v5, 0x3c

    shr-long v5, v3, v5

    long-to-int v5, v5

    invoke-static {v1, v2, v5}, LY8/i;->b(JI)J

    move-result-wide v5

    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private final o0(J)V
    .locals 4

    .prologue
    invoke-static {}, LY8/h;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    move-result-wide p1

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    and-long/2addr p1, v0

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_0

    :goto_0
    invoke-static {}, LY8/h;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide p1

    and-long/2addr p1, v0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final synthetic p(LY8/h;JLY8/p;)LY8/p;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LY8/h;->W(JLY8/p;)LY8/p;

    move-result-object p0

    return-object p0
.end method

.method static synthetic p0(LY8/h;JILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-wide/16 p1, 0x1

    :cond_0
    invoke-direct {p0, p1, p2}, LY8/h;->o0(J)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic q(LY8/h;JLY8/p;)LY8/p;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LY8/h;->X(JLY8/p;)LY8/p;

    move-result-object p0

    return-object p0
.end method

.method private final q0()V
    .locals 3

    .prologue
    invoke-static {}, LY8/h;->c0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {}, LY8/i;->d()Lb9/D;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-static {}, LY8/i;->e()Lb9/D;

    move-result-object v2

    :goto_0
    invoke-static {v0, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    if-nez v1, :cond_2

    return-void

    :cond_2
    const/4 v0, 0x1

    invoke-static {v1, v0}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/l;

    check-cast v1, Lx7/l;

    invoke-virtual {p0}, LY8/h;->b0()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic r(LY8/h;)Ljava/lang/Throwable;
    .locals 0

    invoke-direct {p0}, LY8/h;->e0()Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method private final r0(LY8/p;IJ)Z
    .locals 4

    .prologue
    :cond_0
    invoke-virtual {p1, p2}, LY8/p;->B(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-static {}, LY8/i;->k()Lb9/D;

    move-result-object v2

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, LY8/i;->d:Lb9/D;

    const/4 p2, 0x1

    if-ne v0, p1, :cond_2

    return p2

    :cond_2
    invoke-static {}, LY8/i;->j()Lb9/D;

    move-result-object p1

    if-ne v0, p1, :cond_3

    return v1

    :cond_3
    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object p1

    if-ne v0, p1, :cond_4

    return v1

    :cond_4
    invoke-static {}, LY8/i;->f()Lb9/D;

    move-result-object p1

    if-ne v0, p1, :cond_5

    return v1

    :cond_5
    invoke-static {}, LY8/i;->o()Lb9/D;

    move-result-object p1

    if-ne v0, p1, :cond_6

    return v1

    :cond_6
    invoke-static {}, LY8/i;->p()Lb9/D;

    move-result-object p1

    if-ne v0, p1, :cond_7

    return p2

    :cond_7
    invoke-static {}, LY8/i;->q()Lb9/D;

    move-result-object p1

    if-ne v0, p1, :cond_8

    return v1

    :cond_8
    invoke-virtual {p0}, LY8/h;->h0()J

    move-result-wide v2

    cmp-long p1, p3, v2

    if-nez p1, :cond_9

    move v1, p2

    :cond_9
    return v1

    :cond_a
    :goto_0
    invoke-static {}, LY8/i;->o()Lb9/D;

    move-result-object v2

    invoke-virtual {p1, p2, v0, v2}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LY8/h;->U()V

    return v1
.end method

.method public static final synthetic s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    invoke-static {}, LY8/h;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    invoke-static {}, LY8/h;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method private final t0(JZ)Z
    .locals 6

    .prologue
    const/16 v0, 0x3c

    shr-long v0, p1, v0

    long-to-int v0, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    const-wide v4, 0xfffffffffffffffL

    if-eq v0, v3, :cond_2

    const/4 p3, 0x3

    if-ne v0, p3, :cond_1

    and-long/2addr p1, v4

    invoke-direct {p0, p1, p2}, LY8/h;->Q(J)V

    :cond_0
    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "unexpected close status: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    and-long/2addr p1, v4

    invoke-direct {p0, p1, p2}, LY8/h;->R(J)LY8/p;

    if-eqz p3, :cond_0

    invoke-virtual {p0}, LY8/h;->n0()Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method public static final synthetic u()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    invoke-static {}, LY8/h;->j0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic v()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method private final v0(J)Z
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, LY8/h;->t0(JZ)Z

    move-result p1

    return p1
.end method

.method public static final synthetic w(LY8/h;J)Z
    .locals 0

    invoke-direct {p0, p1, p2}, LY8/h;->w0(J)Z

    move-result p0

    return p0
.end method

.method private final w0(J)Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LY8/h;->t0(JZ)Z

    move-result p1

    return p1
.end method

.method public static final synthetic x(LY8/h;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LY8/h;->E0(Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)V

    return-void
.end method

.method public static final synthetic y(LY8/h;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LY8/h;->F0(Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)V

    return-void
.end method

.method private final y0()Z
    .locals 4

    .prologue
    invoke-direct {p0}, LY8/h;->Z()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static final synthetic z(LY8/h;LW8/l;)V
    .locals 0

    invoke-direct {p0, p1}, LY8/h;->H0(LW8/l;)V

    return-void
.end method

.method private final z0(LY8/p;)J
    .locals 7

    .prologue
    :cond_0
    sget v0, LY8/i;->b:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const-wide/16 v1, -0x1

    const/4 v3, -0x1

    if-ge v3, v0, :cond_5

    iget-wide v3, p1, Lb9/A;->c:J

    sget v5, LY8/i;->b:I

    int-to-long v5, v5

    mul-long/2addr v3, v5

    int-to-long v5, v0

    add-long/2addr v3, v5

    invoke-virtual {p0}, LY8/h;->h0()J

    move-result-wide v5

    cmp-long v5, v3, v5

    if-gez v5, :cond_1

    return-wide v1

    :cond_1
    invoke-virtual {p1, v0}, LY8/p;->B(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {}, LY8/i;->k()Lb9/D;

    move-result-object v2

    if-ne v1, v2, :cond_2

    goto :goto_1

    :cond_2
    sget-object v2, LY8/i;->d:Lb9/D;

    if-ne v1, v2, :cond_4

    return-wide v3

    :cond_3
    :goto_1
    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, LY8/p;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lb9/A;->t()V

    :cond_4
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lb9/b;->h()Lb9/b;

    move-result-object p1

    check-cast p1, LY8/p;

    if-nez p1, :cond_0

    return-wide v1
.end method


# virtual methods
.method protected G0()V
    .locals 0

    return-void
.end method

.method protected L0()V
    .locals 0

    return-void
.end method

.method public M(Ljava/lang/Throwable;)Z
    .locals 1

    .prologue
    if-nez p1, :cond_0

    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string v0, "Channel was cancelled"

    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LY8/h;->P(Ljava/lang/Throwable;Z)Z

    move-result p1

    return p1
.end method

.method protected M0()V
    .locals 0

    return-void
.end method

.method protected P(Ljava/lang/Throwable;Z)Z
    .locals 2

    .prologue
    if-eqz p2, :cond_0

    invoke-direct {p0}, LY8/h;->A0()V

    :cond_0
    invoke-static {}, LY8/h;->m0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {}, LY8/i;->l()Lb9/D;

    move-result-object v1

    invoke-static {v0, p0, v1, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p2, :cond_1

    invoke-direct {p0}, LY8/h;->B0()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, LY8/h;->C0()V

    :goto_0
    invoke-direct {p0}, LY8/h;->S()V

    invoke-virtual {p0}, LY8/h;->G0()V

    if-eqz p1, :cond_2

    invoke-direct {p0}, LY8/h;->q0()V

    :cond_2
    return p1
.end method

.method protected final T(J)V
    .locals 10

    .prologue
    invoke-static {}, LY8/h;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY8/p;

    :cond_0
    :goto_0
    invoke-static {}, LY8/h;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v8

    iget v1, p0, LY8/h;->C:I

    int-to-long v1, v1

    add-long/2addr v1, v8

    invoke-direct {p0}, LY8/h;->Z()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    cmp-long v1, p1, v1

    if-gez v1, :cond_1

    return-void

    :cond_1
    invoke-static {}, LY8/h;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    const-wide/16 v3, 0x1

    add-long v6, v8, v3

    move-object v3, p0

    move-wide v4, v8

    invoke-virtual/range {v2 .. v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, LY8/i;->b:I

    int-to-long v2, v1

    div-long v2, v8, v2

    int-to-long v4, v1

    rem-long v4, v8, v4

    long-to-int v4, v4

    iget-wide v5, v0, Lb9/A;->c:J

    cmp-long v1, v5, v2

    if-eqz v1, :cond_3

    invoke-direct {p0, v2, v3, v0}, LY8/h;->W(JLY8/p;)LY8/p;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :cond_3
    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, v0

    move-wide v5, v8

    invoke-direct/range {v2 .. v7}, LY8/h;->h1(LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object v2

    if-ne v1, v2, :cond_4

    invoke-virtual {p0}, LY8/h;->l0()J

    move-result-wide v1

    cmp-long v1, v8, v1

    if-gez v1, :cond_0

    invoke-virtual {v0}, Lb9/b;->c()V

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Lb9/b;->c()V

    iget-object v2, p0, LY8/h;->D:Lx7/l;

    if-eqz v2, :cond_0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v1, v4, v3, v4}, Lb9/w;->c(Lx7/l;Ljava/lang/Object;Lb9/S;ILjava/lang/Object;)Lb9/S;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    throw v1
.end method

.method public a()Ljava/lang/Object;
    .locals 11

    .prologue
    invoke-static {}, LY8/h;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, LY8/h;->v0(J)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v0, LY8/n;->b:LY8/n$b;

    invoke-virtual {p0}, LY8/h;->b0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LY8/n$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    const-wide v4, 0xfffffffffffffffL

    and-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    sget-object v0, LY8/n;->b:LY8/n$b;

    invoke-virtual {v0}, LY8/n$b;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, LY8/i;->i()Lb9/D;

    move-result-object v0

    invoke-static {}, LY8/h;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY8/p;

    :goto_0
    invoke-virtual {p0}, LY8/h;->u0()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v0, LY8/n;->b:LY8/n$b;

    invoke-virtual {p0}, LY8/h;->b0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LY8/n$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_3

    :cond_2
    invoke-static {}, LY8/h;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v7

    sget v2, LY8/i;->b:I

    int-to-long v3, v2

    div-long v3, v7, v3

    int-to-long v5, v2

    rem-long v5, v7, v5

    long-to-int v9, v5

    iget-wide v5, v1, Lb9/A;->c:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_4

    invoke-static {p0, v3, v4, v1}, LY8/h;->p(LY8/h;JLY8/p;)LY8/p;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    move-object v10, v2

    goto :goto_1

    :cond_4
    move-object v10, v1

    :goto_1
    move-object v1, p0

    move-object v2, v10

    move v3, v9

    move-wide v4, v7

    move-object v6, v0

    invoke-static/range {v1 .. v6}, LY8/h;->F(LY8/h;LY8/p;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LY8/i;->r()Lb9/D;

    move-result-object v2

    if-ne v1, v2, :cond_7

    instance-of v1, v0, LW8/e1;

    if-eqz v1, :cond_5

    check-cast v0, LW8/e1;

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_6

    invoke-static {p0, v0, v10, v9}, LY8/h;->C(LY8/h;LW8/e1;LY8/p;I)V

    :cond_6
    invoke-virtual {p0, v7, v8}, LY8/h;->o1(J)V

    invoke-virtual {v10}, Lb9/A;->t()V

    sget-object v0, LY8/n;->b:LY8/n$b;

    invoke-virtual {v0}, LY8/n$b;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :cond_7
    invoke-static {}, LY8/i;->h()Lb9/D;

    move-result-object v2

    if-ne v1, v2, :cond_9

    invoke-virtual {p0}, LY8/h;->l0()J

    move-result-wide v1

    cmp-long v1, v7, v1

    if-gez v1, :cond_8

    invoke-virtual {v10}, Lb9/b;->c()V

    :cond_8
    move-object v1, v10

    goto :goto_0

    :cond_9
    invoke-static {}, LY8/i;->s()Lb9/D;

    move-result-object v0

    if-eq v1, v0, :cond_a

    invoke-virtual {v10}, Lb9/b;->c()V

    sget-object v0, LY8/n;->b:LY8/n$b;

    invoke-virtual {v0, v1}, LY8/n$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    return-object v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LY8/h;->R0(LY8/h;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final b0()Ljava/lang/Throwable;
    .locals 1

    invoke-static {}, LY8/h;->m0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    return-object v0
.end method

.method public c(Ljava/lang/Throwable;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LY8/h;->P(Ljava/lang/Throwable;Z)Z

    move-result p1

    return p1
.end method

.method public d(Lx7/l;)V
    .locals 4

    .prologue
    invoke-static {}, LY8/h;->c0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, LY8/h;->c0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LY8/i;->d()Lb9/D;

    move-result-object v2

    if-ne v1, v2, :cond_2

    invoke-static {}, LY8/h;->c0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {}, LY8/i;->d()Lb9/D;

    move-result-object v2

    invoke-static {}, LY8/i;->e()Lb9/D;

    move-result-object v3

    invoke-static {v1, p0, v2, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LY8/h;->b0()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    invoke-static {}, LY8/i;->e()Lb9/D;

    move-result-object p1

    if-ne v1, p1, :cond_3

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Another handler was already registered and successfully invoked"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Another handler is already registered: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected final e1(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .prologue
    move-object/from16 v8, p0

    sget-object v9, LY8/i;->d:Lb9/D;

    invoke-static {}, LY8/h;->u()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY8/p;

    :cond_0
    :goto_0
    invoke-static {}, LY8/h;->v()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long v10, v1, v3

    invoke-static {v8, v1, v2}, LY8/h;->w(LY8/h;J)Z

    move-result v12

    sget v13, LY8/i;->b:I

    int-to-long v1, v13

    div-long v1, v10, v1

    int-to-long v3, v13

    rem-long v3, v10, v3

    long-to-int v14, v3

    iget-wide v3, v0, Lb9/A;->c:J

    cmp-long v3, v3, v1

    if-eqz v3, :cond_2

    invoke-static {v8, v1, v2, v0}, LY8/h;->q(LY8/h;JLY8/p;)LY8/p;

    move-result-object v1

    if-nez v1, :cond_1

    if-eqz v12, :cond_0

    sget-object v0, LY8/n;->b:LY8/n$b;

    invoke-virtual/range {p0 .. p0}, LY8/h;->i0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LY8/n$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    move-object v15, v1

    goto :goto_1

    :cond_2
    move-object v15, v0

    :goto_1
    move-object/from16 v0, p0

    move-object v1, v15

    move v2, v14

    move-object/from16 v3, p1

    move-wide v4, v10

    move-object v6, v9

    move v7, v12

    invoke-static/range {v0 .. v7}, LY8/h;->G(LY8/h;LY8/p;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v0

    if-eqz v0, :cond_c

    const/4 v1, 0x1

    if-eq v0, v1, :cond_b

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    const/4 v1, 0x3

    if-eq v0, v1, :cond_6

    const/4 v1, 0x4

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v15}, Lb9/b;->c()V

    :goto_2
    move-object v0, v15

    goto :goto_0

    :cond_4
    invoke-virtual/range {p0 .. p0}, LY8/h;->h0()J

    move-result-wide v0

    cmp-long v0, v10, v0

    if-gez v0, :cond_5

    invoke-virtual {v15}, Lb9/b;->c()V

    :cond_5
    sget-object v0, LY8/n;->b:LY8/n$b;

    invoke-virtual/range {p0 .. p0}, LY8/h;->i0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LY8/n$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    if-eqz v12, :cond_8

    invoke-virtual {v15}, Lb9/A;->t()V

    sget-object v0, LY8/n;->b:LY8/n$b;

    invoke-virtual/range {p0 .. p0}, LY8/h;->i0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LY8/n$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_8
    instance-of v0, v9, LW8/e1;

    if-eqz v0, :cond_9

    check-cast v9, LW8/e1;

    goto :goto_3

    :cond_9
    const/4 v9, 0x0

    :goto_3
    if-eqz v9, :cond_a

    invoke-static {v8, v9, v15, v14}, LY8/h;->D(LY8/h;LW8/e1;LY8/p;I)V

    :cond_a
    iget-wide v0, v15, Lb9/A;->c:J

    int-to-long v2, v13

    mul-long/2addr v0, v2

    int-to-long v2, v14

    add-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, LY8/h;->T(J)V

    sget-object v0, LY8/n;->b:LY8/n$b;

    sget-object v1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, v1}, LY8/n$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_b
    sget-object v0, LY8/n;->b:LY8/n$b;

    sget-object v1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, v1}, LY8/n$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_c
    invoke-virtual {v15}, Lb9/b;->c()V

    sget-object v0, LY8/n;->b:LY8/n$b;

    sget-object v1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, v1}, LY8/n$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LY8/h;->Z0(LY8/h;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h0()J
    .locals 2

    invoke-static {}, LY8/h;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method protected final i0()Ljava/lang/Throwable;
    .locals 2

    .prologue
    invoke-virtual {p0}, LY8/h;->b0()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LY8/u;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, LY8/u;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public iterator()LY8/l;
    .locals 1

    new-instance v0, LY8/h$a;

    invoke-direct {v0, p0}, LY8/h$a;-><init>(LY8/h;)V

    return-object v0
.end method

.method public j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .prologue
    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LY8/h;->b1(J)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LY8/n;->b:LY8/n$b;

    invoke-virtual {p1}, LY8/n$b;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LY8/i;->j()Lb9/D;

    move-result-object v8

    invoke-static {}, LY8/h;->u()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY8/p;

    :cond_1
    :goto_0
    invoke-static {}, LY8/h;->v()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long v9, v1, v3

    invoke-static {p0, v1, v2}, LY8/h;->w(LY8/h;J)Z

    move-result v11

    sget v1, LY8/i;->b:I

    int-to-long v2, v1

    div-long v2, v9, v2

    int-to-long v4, v1

    rem-long v4, v9, v4

    long-to-int v12, v4

    iget-wide v4, v0, Lb9/A;->c:J

    cmp-long v1, v4, v2

    if-eqz v1, :cond_4

    invoke-static {p0, v2, v3, v0}, LY8/h;->q(LY8/h;JLY8/p;)LY8/p;

    move-result-object v1

    if-nez v1, :cond_3

    if-eqz v11, :cond_1

    :cond_2
    :goto_1
    sget-object p1, LY8/n;->b:LY8/n$b;

    invoke-virtual {p0}, LY8/h;->i0()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, LY8/n$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_6

    :cond_3
    move-object v13, v1

    goto :goto_2

    :cond_4
    move-object v13, v0

    :goto_2
    move-object v0, p0

    move-object v1, v13

    move v2, v12

    move-object v3, p1

    move-wide v4, v9

    move-object v6, v8

    move v7, v11

    invoke-static/range {v0 .. v7}, LY8/h;->G(LY8/h;LY8/p;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v0

    if-eqz v0, :cond_d

    const/4 v1, 0x1

    if-eq v0, v1, :cond_c

    const/4 v1, 0x2

    if-eq v0, v1, :cond_8

    const/4 v1, 0x3

    if-eq v0, v1, :cond_7

    const/4 v1, 0x4

    if-eq v0, v1, :cond_6

    const/4 v1, 0x5

    if-eq v0, v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v13}, Lb9/b;->c()V

    :goto_3
    move-object v0, v13

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, LY8/h;->h0()J

    move-result-wide v0

    cmp-long p1, v9, v0

    if-gez p1, :cond_2

    invoke-virtual {v13}, Lb9/b;->c()V

    goto :goto_1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unexpected"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    if-eqz v11, :cond_9

    invoke-virtual {v13}, Lb9/A;->t()V

    goto :goto_1

    :cond_9
    instance-of p1, v8, LW8/e1;

    if-eqz p1, :cond_a

    check-cast v8, LW8/e1;

    goto :goto_4

    :cond_a
    const/4 v8, 0x0

    :goto_4
    if-eqz v8, :cond_b

    invoke-static {p0, v8, v13, v12}, LY8/h;->D(LY8/h;LW8/e1;LY8/p;I)V

    :cond_b
    invoke-virtual {v13}, Lb9/A;->t()V

    sget-object p1, LY8/n;->b:LY8/n$b;

    invoke-virtual {p1}, LY8/n$b;->b()Ljava/lang/Object;

    move-result-object p1

    goto :goto_6

    :cond_c
    :goto_5
    sget-object p1, LY8/n;->b:LY8/n$b;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p1, v0}, LY8/n$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_6

    :cond_d
    invoke-virtual {v13}, Lb9/b;->c()V

    goto :goto_5

    :goto_6
    return-object p1
.end method

.method public l(Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LY8/h;->S0(LY8/h;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l0()J
    .locals 4

    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide v2, 0xfffffffffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public m()Z
    .locals 2

    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LY8/h;->w0(J)Z

    move-result v0

    return v0
.end method

.method public final n0()Z
    .locals 9

    .prologue
    :cond_0
    :goto_0
    invoke-static {}, LY8/h;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY8/p;

    invoke-virtual {p0}, LY8/h;->h0()J

    move-result-wide v3

    invoke-virtual {p0}, LY8/h;->l0()J

    move-result-wide v1

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    if-gtz v1, :cond_1

    return v2

    :cond_1
    sget v1, LY8/i;->b:I

    int-to-long v5, v1

    div-long v5, v3, v5

    iget-wide v7, v0, Lb9/A;->c:J

    cmp-long v7, v7, v5

    if-eqz v7, :cond_2

    invoke-direct {p0, v5, v6, v0}, LY8/h;->W(JLY8/p;)LY8/p;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {}, LY8/h;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY8/p;

    iget-wide v0, v0, Lb9/A;->c:J

    cmp-long v0, v0, v5

    if-gez v0, :cond_0

    return v2

    :cond_2
    invoke-virtual {v0}, Lb9/b;->c()V

    int-to-long v1, v1

    rem-long v1, v3, v1

    long-to-int v1, v1

    invoke-direct {p0, v0, v1, v3, v4}, LY8/h;->r0(LY8/p;IJ)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    invoke-static {}, LY8/h;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    const-wide/16 v5, 0x1

    add-long/2addr v5, v3

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    goto :goto_0
.end method

.method public final o(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    invoke-virtual {p0, p1}, LY8/h;->M(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final o1(J)V
    .locals 16

    .prologue
    move-object/from16 v6, p0

    invoke-direct/range {p0 .. p0}, LY8/h;->y0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct/range {p0 .. p0}, LY8/h;->Z()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-lez v0, :cond_0

    invoke-static {}, LY8/i;->g()I

    move-result v0

    const/4 v7, 0x0

    move v1, v7

    :goto_0
    const-wide v8, 0x3fffffffffffffffL    # 1.9999999999999998

    if-ge v1, v0, :cond_2

    invoke-direct/range {p0 .. p0}, LY8/h;->Z()J

    move-result-wide v2

    invoke-static {}, LY8/h;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v4

    and-long/2addr v4, v8

    cmp-long v4, v2, v4

    if-nez v4, :cond_1

    invoke-direct/range {p0 .. p0}, LY8/h;->Z()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-static {}, LY8/h;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v10

    :cond_3
    invoke-virtual {v10, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    and-long v0, v2, v8

    const/4 v11, 0x1

    invoke-static {v0, v1, v11}, LY8/i;->a(JZ)J

    move-result-wide v4

    move-object v0, v10

    move-object/from16 v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_4
    :goto_1
    invoke-direct/range {p0 .. p0}, LY8/h;->Z()J

    move-result-wide v0

    invoke-static {}, LY8/h;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    and-long v4, v2, v8

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    and-long/2addr v12, v2

    const-wide/16 v14, 0x0

    cmp-long v10, v12, v14

    if-eqz v10, :cond_5

    move v10, v11

    goto :goto_2

    :cond_5
    move v10, v7

    :goto_2
    cmp-long v12, v0, v4

    if-nez v12, :cond_7

    invoke-direct/range {p0 .. p0}, LY8/h;->Z()J

    move-result-wide v12

    cmp-long v0, v0, v12

    if-nez v0, :cond_7

    invoke-static {}, LY8/h;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v12

    :cond_6
    invoke-virtual {v12, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    and-long v0, v2, v8

    invoke-static {v0, v1, v7}, LY8/i;->a(JZ)J

    move-result-wide v4

    move-object v0, v12

    move-object/from16 v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_6

    return-void

    :cond_7
    if-nez v10, :cond_4

    invoke-static {}, LY8/h;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-static {v4, v5, v11}, LY8/i;->a(JZ)J

    move-result-wide v4

    move-object/from16 v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    goto :goto_1
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    .prologue
    move-object/from16 v0, p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const/16 v4, 0x3c

    shr-long/2addr v2, v4

    long-to-int v2, v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "cancelled,"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v2, "closed,"

    goto :goto_0

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "capacity="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v0, LY8/h;->C:I

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v5, 0x2c

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "data=["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v2, v3, [LY8/p;

    invoke-static {}, LY8/h;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/4 v6, 0x0

    aput-object v3, v2, v6

    invoke-static {}, LY8/h;->j0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/4 v7, 0x1

    aput-object v3, v2, v7

    invoke-static {}, LY8/h;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v2}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, LY8/p;

    invoke-static {}, LY8/i;->n()LY8/p;

    move-result-object v9

    if-eq v8, v9, :cond_2

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v3

    check-cast v4, LY8/p;

    iget-wide v8, v4, Lb9/A;->c:J

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, LY8/p;

    iget-wide v10, v10, Lb9/A;->c:J

    cmp-long v12, v8, v10

    if-lez v12, :cond_6

    move-object v3, v4

    move-wide v8, v10

    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_5

    :goto_3
    check-cast v3, LY8/p;

    invoke-virtual/range {p0 .. p0}, LY8/h;->h0()J

    move-result-wide v10

    invoke-virtual/range {p0 .. p0}, LY8/h;->l0()J

    move-result-wide v12

    :goto_4
    sget v2, LY8/i;->b:I

    move v4, v6

    :goto_5
    if-ge v4, v2, :cond_12

    iget-wide v8, v3, Lb9/A;->c:J

    sget v14, LY8/i;->b:I

    int-to-long v14, v14

    mul-long/2addr v8, v14

    int-to-long v14, v4

    add-long/2addr v8, v14

    cmp-long v14, v8, v12

    if-ltz v14, :cond_7

    cmp-long v15, v8, v10

    if-gez v15, :cond_13

    :cond_7
    invoke-virtual {v3, v4}, LY8/p;->B(I)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v3, v4}, LY8/p;->A(I)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v15, LW8/l;

    if-eqz v7, :cond_a

    cmp-long v7, v8, v10

    if-gez v7, :cond_8

    if-ltz v14, :cond_8

    const-string v7, "receive"

    goto/16 :goto_7

    :cond_8
    if-gez v14, :cond_9

    if-ltz v7, :cond_9

    const-string v7, "send"

    goto/16 :goto_7

    :cond_9
    const-string v7, "cont"

    goto/16 :goto_7

    :cond_a
    instance-of v7, v15, LY8/A;

    if-eqz v7, :cond_b

    const-string v7, "receiveCatching"

    goto/16 :goto_7

    :cond_b
    instance-of v7, v15, LY8/D;

    if-eqz v7, :cond_c

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "EB("

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v8, 0x29

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_7

    :cond_c
    invoke-static {}, LY8/i;->q()Lb9/D;

    move-result-object v7

    invoke-static {v15, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    invoke-static {}, LY8/i;->p()Lb9/D;

    move-result-object v7

    invoke-static {v15, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    goto :goto_6

    :cond_d
    if-eqz v15, :cond_11

    invoke-static {}, LY8/i;->k()Lb9/D;

    move-result-object v7

    invoke-static {v15, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    invoke-static {}, LY8/i;->f()Lb9/D;

    move-result-object v7

    invoke-static {v15, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    invoke-static {}, LY8/i;->o()Lb9/D;

    move-result-object v7

    invoke-static {v15, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    invoke-static {}, LY8/i;->i()Lb9/D;

    move-result-object v7

    invoke-static {v15, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    invoke-static {}, LY8/i;->j()Lb9/D;

    move-result-object v7

    invoke-static {v15, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    invoke-static {}, LY8/i;->z()Lb9/D;

    move-result-object v7

    invoke-static {v15, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    goto :goto_9

    :cond_e
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_7

    :cond_f
    :goto_6
    const-string v7, "resuming_sender"

    :goto_7
    if-eqz v6, :cond_10

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v9, 0x28

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "),"

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_8
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_9

    :cond_10
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_8

    :cond_11
    :goto_9
    add-int/lit8 v4, v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    goto/16 :goto_5

    :cond_12
    invoke-virtual {v3}, Lb9/b;->f()Lb9/b;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LY8/p;

    if-nez v3, :cond_15

    :cond_13
    invoke-static {v1}, LS8/r;->z1(Ljava/lang/CharSequence;)C

    move-result v2

    if-ne v2, v5, :cond_14

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/4 v4, 0x1

    sub-int/2addr v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "deleteCharAt(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_14
    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_15
    const/4 v6, 0x0

    const/4 v7, 0x1

    goto/16 :goto_4

    :cond_16
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    throw v1
.end method

.method public u0()Z
    .locals 2

    invoke-static {}, LY8/h;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LY8/h;->v0(J)Z

    move-result v0

    return v0
.end method

.method protected x0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
