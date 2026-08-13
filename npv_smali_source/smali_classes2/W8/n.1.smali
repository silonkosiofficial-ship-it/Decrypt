.class public LW8/n;
.super LW8/a0;
.source "SourceFile"

# interfaces
.implements LW8/l;
.implements Lo7/e;
.implements LW8/e1;


# static fields
.field private static final synthetic H:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field private static final synthetic I:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic J:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private final F:Lm7/e;

.field private final G:Lm7/i;

.field private volatile synthetic _decisionAndIndex$volatile:I

.field private volatile synthetic _parentHandle$volatile:Ljava/lang/Object;

.field private volatile synthetic _state$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_decisionAndIndex$volatile"

    const-class v1, LW8/n;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LW8/n;->H:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v0, "_state$volatile"

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LW8/n;->I:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LW8/n;->J:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lm7/e;I)V
    .locals 0

    invoke-direct {p0, p2}, LW8/a0;-><init>(I)V

    iput-object p1, p0, LW8/n;->F:Lm7/e;

    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object p1

    iput-object p1, p0, LW8/n;->G:Lm7/i;

    const p1, 0x1fffffff

    iput p1, p0, LW8/n;->_decisionAndIndex$volatile:I

    sget-object p1, LW8/d;->a:LW8/d;

    iput-object p1, p0, LW8/n;->_state$volatile:Ljava/lang/Object;

    return-void
.end method

.method private static final synthetic A()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    sget-object v0, LW8/n;->H:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private static final synthetic B()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LW8/n;->J:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LW8/n;->I:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final H()LW8/f0;
    .locals 5

    .prologue
    invoke-virtual {p0}, LW8/n;->getContext()Lm7/i;

    move-result-object v0

    sget-object v1, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    check-cast v0, LW8/z0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v2, LW8/r;

    invoke-direct {v2, p0}, LW8/r;-><init>(LW8/n;)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v3, v1}, LW8/C0;->o(LW8/z0;ZLW8/E0;ILjava/lang/Object;)LW8/f0;

    move-result-object v0

    invoke-static {}, LW8/n;->B()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    invoke-static {v2, p0, v1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v0
.end method

.method private final I(Ljava/lang/Object;)V
    .locals 20

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    instance-of v3, v11, LW8/d;

    if-eqz v3, :cond_1

    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {v3, v0, v11, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_1
    instance-of v3, v11, LW8/k;

    if-nez v3, :cond_e

    instance-of v3, v11, Lb9/A;

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    instance-of v3, v11, LW8/A;

    if-eqz v3, :cond_8

    move-object v2, v11

    check-cast v2, LW8/A;

    invoke-virtual {v2}, LW8/A;->c()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-direct {v0, v1, v11}, LW8/n;->N(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    instance-of v3, v11, LW8/q;

    if-eqz v3, :cond_7

    instance-of v3, v11, LW8/A;

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    move-object v2, v4

    :goto_1
    if-eqz v2, :cond_5

    iget-object v4, v2, LW8/A;->a:Ljava/lang/Throwable;

    :cond_5
    instance-of v2, v1, LW8/k;

    if-eqz v2, :cond_6

    check-cast v1, LW8/k;

    invoke-virtual {v0, v1, v4}, LW8/n;->m(LW8/k;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_6
    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lb9/A;

    invoke-direct {v0, v1, v4}, LW8/n;->o(Lb9/A;Ljava/lang/Throwable;)V

    :cond_7
    :goto_2
    return-void

    :cond_8
    instance-of v3, v11, LW8/z;

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"

    if-eqz v3, :cond_c

    move-object v12, v11

    check-cast v12, LW8/z;

    iget-object v3, v12, LW8/z;->b:LW8/k;

    if-eqz v3, :cond_9

    invoke-direct {v0, v1, v11}, LW8/n;->N(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_9
    instance-of v3, v1, Lb9/A;

    if-eqz v3, :cond_a

    return-void

    :cond_a
    invoke-static {v1, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v14, v1

    check-cast v14, LW8/k;

    invoke-virtual {v12}, LW8/z;->c()Z

    move-result v3

    if-eqz v3, :cond_b

    iget-object v1, v12, LW8/z;->e:Ljava/lang/Throwable;

    invoke-virtual {v0, v14, v1}, LW8/n;->m(LW8/k;Ljava/lang/Throwable;)V

    return-void

    :cond_b
    const/16 v18, 0x1d

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v12 .. v19}, LW8/z;->b(LW8/z;Ljava/lang/Object;LW8/k;Lx7/q;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)LW8/z;

    move-result-object v3

    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    invoke-static {v4, v0, v11, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_c
    instance-of v3, v1, Lb9/A;

    if-eqz v3, :cond_d

    return-void

    :cond_d
    invoke-static {v1, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v1

    check-cast v5, LW8/k;

    new-instance v12, LW8/z;

    const/16 v9, 0x1c

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v12

    move-object v4, v11

    invoke-direct/range {v3 .. v10}, LW8/z;-><init>(Ljava/lang/Object;LW8/k;Lx7/q;Ljava/lang/Object;Ljava/lang/Throwable;ILy7/k;)V

    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {v3, v0, v11, v12}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_e
    :goto_3
    invoke-direct {v0, v1, v11}, LW8/n;->N(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0
.end method

.method private final M()Z
    .locals 2

    .prologue
    iget v0, p0, LW8/a0;->E:I

    invoke-static {v0}, LW8/b0;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LW8/n;->F:Lm7/e;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lb9/h;

    invoke-virtual {v0}, Lb9/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final N(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "It\'s prohibited to register multiple handlers, tried to register "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", already has "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final T(Lx7/l;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)Li7/M;
    .locals 0

    invoke-interface {p0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static synthetic V(LW8/n;Ljava/lang/Object;ILx7/q;ILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LW8/n;->U(Ljava/lang/Object;ILx7/q;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: resumeImpl"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final W(LW8/N0;Ljava/lang/Object;ILx7/q;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    instance-of v0, p2, LW8/A;

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p3}, LW8/b0;->b(I)Z

    move-result p3

    if-nez p3, :cond_1

    if-nez p5, :cond_1

    goto :goto_2

    :cond_1
    if-nez p4, :cond_2

    instance-of p3, p1, LW8/k;

    if-nez p3, :cond_2

    if-eqz p5, :cond_4

    :cond_2
    new-instance p3, LW8/z;

    instance-of v0, p1, LW8/k;

    if-eqz v0, :cond_3

    check-cast p1, LW8/k;

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, p3

    move-object v1, p2

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v7}, LW8/z;-><init>(Ljava/lang/Object;LW8/k;Lx7/q;Ljava/lang/Object;Ljava/lang/Throwable;ILy7/k;)V

    move-object p2, p3

    :cond_4
    :goto_2
    return-object p2
.end method

.method private final X()Z
    .locals 6

    .prologue
    invoke-static {}, LW8/n;->A()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    shr-int/lit8 v2, v1, 0x1d

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {}, LW8/n;->A()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v2

    const v4, 0x1fffffff

    and-int/2addr v4, v1

    const/high16 v5, 0x40000000    # 2.0f

    add-int/2addr v5, v4

    invoke-virtual {v2, p0, v1, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    return v3
.end method

.method private final Y(Ljava/lang/Object;Ljava/lang/Object;Lx7/q;)Lb9/D;
    .locals 9

    .prologue
    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LW8/N0;

    if-eqz v2, :cond_1

    move-object v4, v1

    check-cast v4, LW8/N0;

    iget v6, p0, LW8/a0;->E:I

    move-object v3, p0

    move-object v5, p1

    move-object v7, p3

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, LW8/n;->W(LW8/N0;Ljava/lang/Object;ILx7/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {v3, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, LW8/n;->r()V

    sget-object p1, LW8/o;->a:Lb9/D;

    return-object p1

    :cond_1
    instance-of p1, v1, LW8/z;

    const/4 p3, 0x0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    check-cast v1, LW8/z;

    iget-object p1, v1, LW8/z;->d:Ljava/lang/Object;

    if-ne p1, p2, :cond_2

    sget-object p3, LW8/o;->a:Lb9/D;

    :cond_2
    return-object p3
.end method

.method private final Z()Z
    .locals 5

    .prologue
    invoke-static {}, LW8/n;->A()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    shr-int/lit8 v2, v1, 0x1d

    if-eqz v2, :cond_2

    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already suspended"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {}, LW8/n;->A()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v2

    const v3, 0x1fffffff

    and-int/2addr v3, v1

    const/high16 v4, 0x20000000

    add-int/2addr v4, v3

    invoke-virtual {v2, p0, v1, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0
.end method

.method public static synthetic j(Lx7/l;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LW8/n;->T(Lx7/l;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Already resumed, but proposed with update "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final o(Lb9/A;Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    invoke-static {}, LW8/n;->A()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x1fffffff

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    :try_start_0
    invoke-virtual {p0}, LW8/n;->getContext()Lm7/i;

    move-result-object v1

    invoke-virtual {p1, v0, p2, v1}, Lb9/A;->s(ILjava/lang/Throwable;Lm7/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, LW8/n;->getContext()Lm7/i;

    move-result-object p2

    new-instance v0, LW8/B;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LW8/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, LW8/L;->a(Lm7/i;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The index for Segment.onCancellation(..) is broken"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final p(Ljava/lang/Throwable;)Z
    .locals 2

    .prologue
    invoke-direct {p0}, LW8/n;->M()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, LW8/n;->F:Lm7/e;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lb9/h;

    invoke-virtual {v0, p1}, Lb9/h;->q(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method private final r()V
    .locals 1

    .prologue
    invoke-direct {p0}, LW8/n;->M()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LW8/n;->q()V

    :cond_0
    return-void
.end method

.method private final u(I)V
    .locals 1

    .prologue
    invoke-direct {p0}, LW8/n;->X()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0, p1}, LW8/b0;->a(LW8/a0;I)V

    return-void
.end method

.method private final w()LW8/f0;
    .locals 1

    invoke-static {}, LW8/n;->B()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW8/f0;

    return-object v0
.end method

.method private final z()Ljava/lang/String;
    .locals 2

    .prologue
    invoke-virtual {p0}, LW8/n;->y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/N0;

    if-eqz v1, :cond_0

    const-string v0, "Active"

    goto :goto_0

    :cond_0
    instance-of v0, v0, LW8/q;

    if-eqz v0, :cond_1

    const-string v0, "Cancelled"

    goto :goto_0

    :cond_1
    const-string v0, "Completed"

    :goto_0
    return-object v0
.end method


# virtual methods
.method public C(Ljava/lang/Object;Lx7/q;)V
    .locals 1

    iget v0, p0, LW8/a0;->E:I

    invoke-virtual {p0, p1, v0, p2}, LW8/n;->U(Ljava/lang/Object;ILx7/q;)V

    return-void
.end method

.method public E()V
    .locals 2

    .prologue
    invoke-direct {p0}, LW8/n;->H()LW8/f0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LW8/n;->L()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, LW8/f0;->e()V

    invoke-static {}, LW8/n;->B()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sget-object v1, LW8/M0;->C:LW8/M0;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public F(LW8/J;Ljava/lang/Object;)V
    .locals 6

    .prologue
    iget-object v0, p0, LW8/n;->F:Lm7/e;

    instance-of v1, v0, Lb9/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lb9/h;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    iget-object v2, v0, Lb9/h;->F:LW8/J;

    :cond_1
    if-ne v2, p1, :cond_2

    const/4 p1, 0x4

    :goto_1
    move v2, p1

    goto :goto_2

    :cond_2
    iget p1, p0, LW8/a0;->E:I

    goto :goto_1

    :goto_2
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, LW8/n;->V(LW8/n;Ljava/lang/Object;ILx7/q;ILjava/lang/Object;)V

    return-void
.end method

.method public G(Lx7/l;)V
    .locals 1

    new-instance v0, LW8/k$a;

    invoke-direct {v0, p1}, LW8/k$a;-><init>(Lx7/l;)V

    invoke-static {p0, v0}, LW8/p;->c(LW8/l;LW8/k;)V

    return-void
.end method

.method public J(Ljava/lang/Object;)V
    .locals 0

    iget p1, p0, LW8/a0;->E:I

    invoke-direct {p0, p1}, LW8/n;->u(I)V

    return-void
.end method

.method public final K(LW8/k;)V
    .locals 0

    invoke-direct {p0, p1}, LW8/n;->I(Ljava/lang/Object;)V

    return-void
.end method

.method public L()Z
    .locals 1

    invoke-virtual {p0}, LW8/n;->y()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, LW8/N0;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected O()Ljava/lang/String;
    .locals 1

    const-string v0, "CancellableContinuation"

    return-object v0
.end method

.method public final P(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    invoke-direct {p0, p1}, LW8/n;->p(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LW8/n;->k(Ljava/lang/Throwable;)Z

    invoke-direct {p0}, LW8/n;->r()V

    return-void
.end method

.method public final Q()V
    .locals 2

    .prologue
    iget-object v0, p0, LW8/n;->F:Lm7/e;

    instance-of v1, v0, Lb9/h;

    if-eqz v1, :cond_0

    check-cast v0, Lb9/h;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Lb9/h;->u(LW8/l;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LW8/n;->q()V

    invoke-virtual {p0, v0}, LW8/n;->k(Ljava/lang/Throwable;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method public final R()Z
    .locals 2

    .prologue
    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/z;

    if-eqz v1, :cond_0

    check-cast v0, LW8/z;

    iget-object v0, v0, LW8/z;->d:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LW8/n;->q()V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {}, LW8/n;->A()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    const v1, 0x1fffffff

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sget-object v1, LW8/d;->a:LW8/d;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0
.end method

.method public S(Ljava/lang/Object;Lx7/l;)V
    .locals 2

    .prologue
    iget v0, p0, LW8/a0;->E:I

    if-eqz p2, :cond_0

    new-instance v1, LW8/m;

    invoke-direct {v1, p2}, LW8/m;-><init>(Lx7/l;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0, v1}, LW8/n;->U(Ljava/lang/Object;ILx7/q;)V

    return-void
.end method

.method public final U(Ljava/lang/Object;ILx7/q;)V
    .locals 9

    .prologue
    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LW8/N0;

    if-eqz v2, :cond_1

    move-object v4, v1

    check-cast v4, LW8/N0;

    const/4 v8, 0x0

    move-object v3, p0

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    invoke-direct/range {v3 .. v8}, LW8/n;->W(LW8/N0;Ljava/lang/Object;ILx7/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {v3, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, LW8/n;->r()V

    invoke-direct {p0, p2}, LW8/n;->u(I)V

    return-void

    :cond_1
    instance-of p2, v1, LW8/q;

    if-eqz p2, :cond_3

    check-cast v1, LW8/q;

    invoke-virtual {v1}, LW8/q;->e()Z

    move-result p2

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    iget-object p2, v1, LW8/A;->a:Ljava/lang/Throwable;

    invoke-virtual {p0, p3, p2, p1}, LW8/n;->n(Lx7/q;Ljava/lang/Throwable;Ljava/lang/Object;)V

    :cond_2
    return-void

    :cond_3
    invoke-direct {p0, p1}, LW8/n;->l(Ljava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 19

    .prologue
    move-object/from16 v0, p0

    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    instance-of v2, v10, LW8/N0;

    if-nez v2, :cond_4

    instance-of v2, v10, LW8/A;

    if-eqz v2, :cond_1

    return-void

    :cond_1
    instance-of v2, v10, LW8/z;

    if-eqz v2, :cond_3

    move-object v2, v10

    check-cast v2, LW8/z;

    invoke-virtual {v2}, LW8/z;->c()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_2

    const/16 v17, 0xf

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v11, v2

    move-object/from16 v16, p2

    invoke-static/range {v11 .. v18}, LW8/z;->b(LW8/z;Ljava/lang/Object;LW8/k;Lx7/q;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)LW8/z;

    move-result-object v3

    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    invoke-static {v4, v0, v10, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    move-object/from16 v11, p2

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0, v11}, LW8/z;->d(LW8/n;Ljava/lang/Throwable;)V

    return-void

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Must be called at most once"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    move-object/from16 v11, p2

    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v12

    new-instance v13, LW8/z;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v13

    move-object v3, v10

    move-object/from16 v7, p2

    invoke-direct/range {v2 .. v9}, LW8/z;-><init>(Ljava/lang/Object;LW8/k;Lx7/q;Ljava/lang/Object;Ljava/lang/Throwable;ILy7/k;)V

    invoke-static {v12, v0, v10, v13}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Not completed"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(Lb9/A;I)V
    .locals 4

    .prologue
    invoke-static {}, LW8/n;->A()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x1fffffff

    and-int v3, v1, v2

    if-ne v3, v2, :cond_1

    shr-int/lit8 v2, v1, 0x1d

    shl-int/lit8 v2, v2, 0x1d

    add-int/2addr v2, p2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, LW8/n;->I(Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "invokeOnCancellation should be called at most once"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Lm7/e;
    .locals 1

    iget-object v0, p0, LW8/n;->F:Lm7/e;

    return-object v0
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    .prologue
    invoke-super {p0, p1}, LW8/a0;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public e()Lo7/e;
    .locals 2

    .prologue
    iget-object v0, p0, LW8/n;->F:Lm7/e;

    instance-of v1, v0, Lo7/e;

    if-eqz v1, :cond_0

    check-cast v0, Lo7/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public f()Z
    .locals 1

    invoke-virtual {p0}, LW8/n;->y()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, LW8/N0;

    return v0
.end method

.method public g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    instance-of v0, p1, LW8/z;

    if-eqz v0, :cond_0

    check-cast p1, LW8/z;

    iget-object p1, p1, LW8/z;->a:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public getContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LW8/n;->G:Lm7/i;

    return-object v0
.end method

.method public i()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LW8/n;->y()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public isCancelled()Z
    .locals 1

    invoke-virtual {p0}, LW8/n;->y()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, LW8/q;

    return v0
.end method

.method public k(Ljava/lang/Throwable;)Z
    .locals 6

    .prologue
    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LW8/N0;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    return v3

    :cond_1
    new-instance v2, LW8/q;

    instance-of v4, v1, LW8/k;

    const/4 v5, 0x1

    if-nez v4, :cond_2

    instance-of v4, v1, Lb9/A;

    if-eqz v4, :cond_3

    :cond_2
    move v3, v5

    :cond_3
    invoke-direct {v2, p0, p1, v3}, LW8/q;-><init>(Lm7/e;Ljava/lang/Throwable;Z)V

    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {v3, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    check-cast v0, LW8/N0;

    instance-of v2, v0, LW8/k;

    if-eqz v2, :cond_4

    check-cast v1, LW8/k;

    invoke-virtual {p0, v1, p1}, LW8/n;->m(LW8/k;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_4
    instance-of v0, v0, Lb9/A;

    if-eqz v0, :cond_5

    check-cast v1, Lb9/A;

    invoke-direct {p0, v1, p1}, LW8/n;->o(Lb9/A;Ljava/lang/Throwable;)V

    :cond_5
    :goto_0
    invoke-direct {p0}, LW8/n;->r()V

    iget p1, p0, LW8/a0;->E:I

    invoke-direct {p0, p1}, LW8/n;->u(I)V

    return v5
.end method

.method public final m(LW8/k;Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    :try_start_0
    invoke-interface {p1, p2}, LW8/k;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, LW8/n;->getContext()Lm7/i;

    move-result-object p2

    new-instance v0, LW8/B;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LW8/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, LW8/L;->a(Lm7/i;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final n(Lx7/q;Ljava/lang/Throwable;Ljava/lang/Object;)V
    .locals 2

    .prologue
    :try_start_0
    invoke-virtual {p0}, LW8/n;->getContext()Lm7/i;

    move-result-object v0

    invoke-interface {p1, p2, p3, v0}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, LW8/n;->getContext()Lm7/i;

    move-result-object p2

    new-instance p3, LW8/B;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Exception in resume onCancellation handler for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0, p1}, LW8/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, p3}, LW8/L;->a(Lm7/i;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final q()V
    .locals 2

    .prologue
    invoke-direct {p0}, LW8/n;->w()LW8/f0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, LW8/f0;->e()V

    invoke-static {}, LW8/n;->B()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sget-object v1, LW8/M0;->C:LW8/M0;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public s(Ljava/lang/Object;Ljava/lang/Object;Lx7/q;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LW8/n;->Y(Ljava/lang/Object;Ljava/lang/Object;Lx7/q;)Lb9/D;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/Object;)V
    .locals 6

    invoke-static {p1, p0}, LW8/C;->c(Ljava/lang/Object;LW8/l;)Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, LW8/a0;->E:I

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LW8/n;->V(LW8/n;Ljava/lang/Object;ILx7/q;ILjava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LW8/n;->O()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LW8/n;->F:Lm7/e;

    invoke-static {v1}, LW8/S;->c(Lm7/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LW8/n;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LW8/S;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v(LW8/z0;)Ljava/lang/Throwable;
    .locals 0

    invoke-interface {p1}, LW8/z0;->e0()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method

.method public final x()Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-direct {p0}, LW8/n;->M()Z

    move-result v0

    invoke-direct {p0}, LW8/n;->Z()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0}, LW8/n;->w()LW8/f0;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-direct {p0}, LW8/n;->H()LW8/f0;

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, LW8/n;->Q()V

    :cond_1
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p0}, LW8/n;->Q()V

    :cond_3
    invoke-virtual {p0}, LW8/n;->y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/A;

    if-nez v1, :cond_6

    iget v1, p0, LW8/a0;->E:I

    invoke-static {v1}, LW8/b0;->b(I)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, LW8/n;->getContext()Lm7/i;

    move-result-object v1

    sget-object v2, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v1, v2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v1

    check-cast v1, LW8/z0;

    if-eqz v1, :cond_5

    invoke-interface {v1}, LW8/z0;->f()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    invoke-interface {v1}, LW8/z0;->e0()Ljava/util/concurrent/CancellationException;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LW8/n;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    throw v1

    :cond_5
    :goto_0
    invoke-virtual {p0, v0}, LW8/n;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_6
    check-cast v0, LW8/A;

    iget-object v0, v0, LW8/A;->a:Ljava/lang/Throwable;

    throw v0
.end method

.method public final y()Ljava/lang/Object;
    .locals 1

    invoke-static {}, LW8/n;->D()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
