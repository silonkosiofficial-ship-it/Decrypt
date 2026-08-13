.class public abstract Lf0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lx7/l;

.field private static final b:LV/B1;

.field private static final c:Ljava/lang/Object;

.field private static d:Lf0/n;

.field private static e:I

.field private static final f:Lf0/m;

.field private static final g:Lf0/v;

.field private static h:Ljava/util/List;

.field private static i:Ljava/util/List;

.field private static final j:Ljava/util/concurrent/atomic/AtomicReference;

.field private static final k:Lf0/k;

.field private static l:LV/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lf0/p$b;->D:Lf0/p$b;

    sput-object v0, Lf0/p;->a:Lx7/l;

    new-instance v0, LV/B1;

    invoke-direct {v0}, LV/B1;-><init>()V

    sput-object v0, Lf0/p;->b:LV/B1;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf0/p;->c:Ljava/lang/Object;

    sget-object v0, Lf0/n;->G:Lf0/n$a;

    invoke-virtual {v0}, Lf0/n$a;->a()Lf0/n;

    move-result-object v1

    sput-object v1, Lf0/p;->d:Lf0/n;

    const/4 v1, 0x2

    sput v1, Lf0/p;->e:I

    new-instance v1, Lf0/m;

    invoke-direct {v1}, Lf0/m;-><init>()V

    sput-object v1, Lf0/p;->f:Lf0/m;

    new-instance v1, Lf0/v;

    invoke-direct {v1}, Lf0/v;-><init>()V

    sput-object v1, Lf0/p;->g:Lf0/v;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    sput-object v1, Lf0/p;->h:Ljava/util/List;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    sput-object v1, Lf0/p;->i:Ljava/util/List;

    new-instance v1, Lf0/a;

    sget v2, Lf0/p;->e:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lf0/p;->e:I

    invoke-virtual {v0}, Lf0/n$a;->a()Lf0/n;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lf0/a;-><init>(ILf0/n;)V

    sget-object v0, Lf0/p;->d:Lf0/n;

    invoke-virtual {v1}, Lf0/k;->f()I

    move-result v2

    invoke-virtual {v0, v2}, Lf0/n;->N(I)Lf0/n;

    move-result-object v0

    sput-object v0, Lf0/p;->d:Lf0/n;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lf0/p;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/k;

    sput-object v0, Lf0/p;->k:Lf0/k;

    new-instance v0, LV/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LV/h;-><init>(I)V

    sput-object v0, Lf0/p;->l:LV/h;

    return-void
.end method

.method private static final A(Lx7/l;)Ljava/lang/Object;
    .locals 17

    .prologue
    const/4 v0, 0x1

    sget-object v1, Lf0/p;->k:Lf0/k;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/a;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    sget-object v2, Lf0/p;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lf0/a;

    invoke-virtual {v3}, Lf0/c;->E()Lr/L;

    move-result-object v3

    if-eqz v3, :cond_0

    sget-object v4, Lf0/p;->l:LV/h;

    invoke-virtual {v4, v0}, LV/h;->a(I)I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_0
    :goto_0
    move-object v4, v2

    check-cast v4, Lf0/k;

    move-object/from16 v5, p0

    invoke-static {v4, v5}, Lf0/p;->a0(Lf0/k;Lx7/l;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    const/4 v1, 0x0

    if-eqz v3, :cond_2

    const/4 v5, -0x1

    :try_start_1
    sget-object v6, Lf0/p;->h:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    move v8, v1

    :goto_1
    if-ge v8, v7, :cond_1

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lx7/p;

    invoke-static {v3}, LX/e;->a(Lr/W;)Ljava/util/Set;

    move-result-object v10

    invoke-interface {v9, v10, v2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    add-int/2addr v8, v0

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_1
    sget-object v2, Lf0/p;->l:LV/h;

    invoke-virtual {v2, v5}, LV/h;->a(I)I

    goto :goto_3

    :goto_2
    sget-object v1, Lf0/p;->l:LV/h;

    invoke-virtual {v1, v5}, LV/h;->a(I)I

    throw v0

    :cond_2
    :goto_3
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_2
    invoke-static {}, Lf0/p;->C()V

    if-eqz v3, :cond_7

    iget-object v5, v3, Lr/W;->b:[Ljava/lang/Object;

    iget-object v3, v3, Lr/W;->a:[J

    array-length v6, v3

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_6

    move v7, v1

    :goto_4
    aget-wide v8, v3, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_5

    sub-int v10, v7, v6

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v1

    :goto_5
    if-ge v12, v10, :cond_4

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_3

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v13, v5, v13

    check-cast v13, Lf0/y;

    invoke-static {v13}, Lf0/p;->U(Lf0/y;)V

    goto :goto_6

    :catchall_2
    move-exception v0

    goto :goto_7

    :cond_3
    :goto_6
    shr-long/2addr v8, v11

    add-int/2addr v12, v0

    goto :goto_5

    :cond_4
    if-ne v10, v11, :cond_6

    :cond_5
    if-eq v7, v6, :cond_6

    add-int/2addr v7, v0

    goto :goto_4

    :cond_6
    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_7
    monitor-exit v2

    return-object v4

    :goto_7
    monitor-exit v2

    throw v0

    :goto_8
    monitor-exit v1

    throw v0
.end method

.method private static final B()V
    .locals 1

    sget-object v0, Lf0/p$a;->D:Lf0/p$a;

    invoke-static {v0}, Lf0/p;->A(Lx7/l;)Ljava/lang/Object;

    return-void
.end method

.method private static final C()V
    .locals 7

    .prologue
    sget-object v0, Lf0/p;->g:Lf0/v;

    invoke-virtual {v0}, Lf0/v;->e()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    const/4 v5, 0x0

    if-ge v3, v1, :cond_3

    invoke-virtual {v0}, Lf0/v;->f()[LV/N1;

    move-result-object v6

    aget-object v6, v6, v3

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    :cond_0
    if-eqz v5, :cond_2

    check-cast v5, Lf0/y;

    invoke-static {v5}, Lf0/p;->T(Lf0/y;)Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    if-nez v5, :cond_2

    if-eq v4, v3, :cond_1

    invoke-virtual {v0}, Lf0/v;->f()[LV/N1;

    move-result-object v5

    aput-object v6, v5, v4

    invoke-virtual {v0}, Lf0/v;->d()[I

    move-result-object v5

    invoke-virtual {v0}, Lf0/v;->d()[I

    move-result-object v6

    aget v6, v6, v3

    aput v6, v5, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    move v3, v4

    :goto_1
    if-ge v3, v1, :cond_4

    invoke-virtual {v0}, Lf0/v;->f()[LV/N1;

    move-result-object v6

    aput-object v5, v6, v3

    invoke-virtual {v0}, Lf0/v;->d()[I

    move-result-object v6

    aput v2, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    if-eq v4, v1, :cond_5

    invoke-virtual {v0, v4}, Lf0/v;->g(I)V

    :cond_5
    return-void
.end method

.method private static final D(Lf0/k;Lx7/l;Z)Lf0/k;
    .locals 8

    .prologue
    instance-of v0, p0, Lf0/c;

    if-nez v0, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lf0/D;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1, p2}, Lf0/D;-><init>(Lf0/k;Lx7/l;ZZ)V

    goto :goto_3

    :cond_1
    :goto_0
    new-instance v1, Lf0/C;

    if-eqz v0, :cond_2

    check-cast p0, Lf0/c;

    :goto_1
    move-object v3, p0

    goto :goto_2

    :cond_2
    const/4 p0, 0x0

    goto :goto_1

    :goto_2
    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v1

    move-object v4, p1

    move v7, p2

    invoke-direct/range {v2 .. v7}, Lf0/C;-><init>(Lf0/c;Lx7/l;Lx7/l;ZZ)V

    move-object v0, v1

    :goto_3
    return-object v0
.end method

.method static synthetic E(Lf0/k;Lx7/l;ZILjava/lang/Object;)Lf0/k;
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-static {p0, p1, p2}, Lf0/p;->D(Lf0/k;Lx7/l;Z)Lf0/k;

    move-result-object p0

    return-object p0
.end method

.method public static final F(Lf0/A;)Lf0/A;
    .locals 3

    .prologue
    sget-object v0, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v0}, Lf0/k$a;->c()Lf0/k;

    move-result-object v1

    invoke-virtual {v1}, Lf0/k;->f()I

    move-result v2

    invoke-virtual {v1}, Lf0/k;->g()Lf0/n;

    move-result-object v1

    invoke-static {p0, v2, v1}, Lf0/p;->W(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-virtual {v0}, Lf0/k$a;->c()Lf0/k;

    move-result-object v0

    invoke-virtual {v0}, Lf0/k;->f()I

    move-result v2

    invoke-virtual {v0}, Lf0/k;->g()Lf0/n;

    move-result-object v0

    invoke-static {p0, v2, v0}, Lf0/p;->W(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    if-eqz p0, :cond_0

    move-object v1, p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lf0/p;->V()Ljava/lang/Void;

    new-instance p0, Li7/k;

    invoke-direct {p0}, Li7/k;-><init>()V

    throw p0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0

    :cond_1
    :goto_0
    return-object v1
.end method

.method public static final G(Lf0/A;Lf0/k;)Lf0/A;
    .locals 1

    .prologue
    invoke-virtual {p1}, Lf0/k;->f()I

    move-result v0

    invoke-virtual {p1}, Lf0/k;->g()Lf0/n;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lf0/p;->W(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    invoke-static {}, Lf0/p;->V()Ljava/lang/Void;

    new-instance p0, Li7/k;

    invoke-direct {p0}, Li7/k;-><init>()V

    throw p0
.end method

.method public static final H()Lf0/k;
    .locals 1

    .prologue
    sget-object v0, Lf0/p;->b:LV/B1;

    invoke-virtual {v0}, LV/B1;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/k;

    if-nez v0, :cond_0

    sget-object v0, Lf0/p;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/k;

    :cond_0
    return-object v0
.end method

.method public static final I()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lf0/p;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public static final J()Lf0/k;
    .locals 1

    sget-object v0, Lf0/p;->k:Lf0/k;

    return-object v0
.end method

.method private static final K(Lx7/l;Lx7/l;Z)Lx7/l;
    .locals 0

    .prologue
    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    if-eq p0, p1, :cond_1

    new-instance p2, Lf0/p$c;

    invoke-direct {p2, p0, p1}, Lf0/p$c;-><init>(Lx7/l;Lx7/l;)V

    move-object p0, p2

    goto :goto_1

    :cond_1
    if-nez p0, :cond_2

    move-object p0, p1

    :cond_2
    :goto_1
    return-object p0
.end method

.method static synthetic L(Lx7/l;Lx7/l;ZILjava/lang/Object;)Lx7/l;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-static {p0, p1, p2}, Lf0/p;->K(Lx7/l;Lx7/l;Z)Lx7/l;

    move-result-object p0

    return-object p0
.end method

.method private static final M(Lx7/l;Lx7/l;)Lx7/l;
    .locals 1

    .prologue
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-eq p0, p1, :cond_0

    new-instance v0, Lf0/p$d;

    invoke-direct {v0, p0, p1}, Lf0/p$d;-><init>(Lx7/l;Lx7/l;)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    if-nez p0, :cond_1

    move-object p0, p1

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static final N(Lf0/A;Lf0/y;)Lf0/A;
    .locals 2

    .prologue
    invoke-static {p1}, Lf0/p;->d0(Lf0/y;)Lf0/A;

    move-result-object v0

    const v1, 0x7fffffff

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lf0/A;->h(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lf0/A;->d()Lf0/A;

    move-result-object v0

    invoke-virtual {v0, v1}, Lf0/A;->h(I)V

    invoke-interface {p1}, Lf0/y;->e()Lf0/A;

    move-result-object p0

    invoke-virtual {v0, p0}, Lf0/A;->g(Lf0/A;)V

    const-string p0, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16"

    invoke-static {v0, p0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lf0/y;->C(Lf0/A;)V

    const-string p0, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked"

    invoke-static {v0, p0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public static final O(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;
    .locals 1

    .prologue
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {p0, p1, p2}, Lf0/p;->P(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static final P(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;
    .locals 0

    invoke-static {p0, p1}, Lf0/p;->N(Lf0/A;Lf0/y;)Lf0/A;

    move-result-object p1

    invoke-virtual {p1, p0}, Lf0/A;->c(Lf0/A;)V

    invoke-virtual {p2}, Lf0/k;->f()I

    move-result p0

    invoke-virtual {p1, p0}, Lf0/A;->h(I)V

    return-object p1
.end method

.method public static final Q(Lf0/k;Lf0/y;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lf0/k;->j()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lf0/k;->w(I)V

    invoke-virtual {p0}, Lf0/k;->k()Lx7/l;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final R(Lf0/c;Lf0/c;Lf0/n;)Ljava/util/Map;
    .locals 20

    .prologue
    invoke-virtual/range {p1 .. p1}, Lf0/c;->E()Lr/L;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lf0/k;->f()I

    move-result v1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lf0/k;->g()Lf0/n;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lf0/k;->f()I

    move-result v4

    invoke-virtual {v3, v4}, Lf0/n;->N(I)Lf0/n;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lf0/c;->F()Lf0/n;

    move-result-object v4

    invoke-virtual {v3, v4}, Lf0/n;->M(Lf0/n;)Lf0/n;

    move-result-object v3

    iget-object v4, v0, Lr/W;->b:[Ljava/lang/Object;

    iget-object v0, v0, Lr/W;->a:[J

    array-length v5, v0

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_b

    move-object v8, v2

    const/4 v7, 0x0

    :goto_0
    aget-wide v9, v0, v7

    not-long v11, v9

    const/4 v13, 0x7

    shl-long/2addr v11, v13

    and-long/2addr v11, v9

    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v11, v13

    cmp-long v11, v11, v13

    if-eqz v11, :cond_9

    sub-int v11, v7, v5

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v11, :cond_8

    const-wide/16 v14, 0xff

    and-long/2addr v14, v9

    const-wide/16 v16, 0x80

    cmp-long v14, v14, v16

    if-gez v14, :cond_7

    shl-int/lit8 v14, v7, 0x3

    add-int/2addr v14, v13

    aget-object v14, v4, v14

    check-cast v14, Lf0/y;

    invoke-interface {v14}, Lf0/y;->e()Lf0/A;

    move-result-object v15

    move-object/from16 v6, p2

    invoke-static {v15, v1, v6}, Lf0/p;->W(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object v12

    if-nez v12, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {v15, v1, v3}, Lf0/p;->W(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object v2

    if-nez v2, :cond_3

    :cond_2
    :goto_2
    move-object/from16 v18, v0

    move/from16 v19, v1

    :goto_3
    const/4 v0, 0x0

    goto :goto_4

    :cond_3
    invoke-static {v12, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_2

    move-object/from16 v18, v0

    invoke-virtual/range {p1 .. p1}, Lf0/k;->f()I

    move-result v0

    move/from16 v19, v1

    invoke-virtual/range {p1 .. p1}, Lf0/k;->g()Lf0/n;

    move-result-object v1

    invoke-static {v15, v0, v1}, Lf0/p;->W(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {v14, v2, v12, v0}, Lf0/y;->s(Lf0/A;Lf0/A;Lf0/A;)Lf0/A;

    move-result-object v0

    if-eqz v0, :cond_5

    if-nez v8, :cond_4

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    :cond_4
    move-object v1, v8

    invoke-interface {v8, v12, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v8, v1

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    return-object v0

    :cond_6
    invoke-static {}, Lf0/p;->V()Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :goto_4
    const/16 v1, 0x8

    goto :goto_5

    :cond_7
    move-object/from16 v6, p2

    move-object/from16 v18, v0

    move/from16 v19, v1

    move-object v0, v2

    move v1, v12

    :goto_5
    shr-long/2addr v9, v1

    add-int/lit8 v13, v13, 0x1

    move-object v2, v0

    move v12, v1

    move-object/from16 v0, v18

    move/from16 v1, v19

    goto :goto_1

    :cond_8
    move-object/from16 v6, p2

    move-object/from16 v18, v0

    move/from16 v19, v1

    move-object v0, v2

    move v1, v12

    if-ne v11, v1, :cond_c

    goto :goto_6

    :cond_9
    move-object/from16 v6, p2

    move-object/from16 v18, v0

    move/from16 v19, v1

    move-object v0, v2

    :goto_6
    if-eq v7, v5, :cond_a

    add-int/lit8 v7, v7, 0x1

    move-object v2, v0

    move-object/from16 v0, v18

    move/from16 v1, v19

    goto/16 :goto_0

    :cond_a
    move-object v2, v8

    goto :goto_7

    :cond_b
    move-object v0, v2

    :goto_7
    move-object v8, v2

    :cond_c
    return-object v8
.end method

.method public static final S(Lf0/A;Lf0/y;Lf0/k;Lf0/A;)Lf0/A;
    .locals 2

    .prologue
    invoke-virtual {p2}, Lf0/k;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Lf0/k;->p(Lf0/y;)V

    :cond_0
    invoke-virtual {p2}, Lf0/k;->f()I

    move-result v0

    invoke-virtual {p3}, Lf0/A;->f()I

    move-result v1

    if-ne v1, v0, :cond_1

    return-object p3

    :cond_1
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {p0, p1}, Lf0/p;->N(Lf0/A;Lf0/y;)Lf0/A;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    invoke-virtual {p0, v0}, Lf0/A;->h(I)V

    invoke-virtual {p3}, Lf0/A;->f()I

    move-result p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_2

    invoke-virtual {p2, p1}, Lf0/k;->p(Lf0/y;)V

    :cond_2
    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method private static final T(Lf0/y;)Z
    .locals 10

    .prologue
    invoke-interface {p0}, Lf0/y;->e()Lf0/A;

    move-result-object v0

    sget-object v1, Lf0/p;->f:Lf0/m;

    sget v2, Lf0/p;->e:I

    invoke-virtual {v1, v2}, Lf0/m;->e(I)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v2

    move v5, v3

    :goto_0
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lf0/A;->f()I

    move-result v6

    if-eqz v6, :cond_7

    if-ge v6, v1, :cond_6

    if-nez v2, :cond_0

    add-int/lit8 v5, v5, 0x1

    move-object v2, v0

    goto :goto_4

    :cond_0
    invoke-virtual {v0}, Lf0/A;->f()I

    move-result v6

    invoke-virtual {v2}, Lf0/A;->f()I

    move-result v7

    if-ge v6, v7, :cond_1

    move-object v6, v2

    move-object v2, v0

    goto :goto_1

    :cond_1
    move-object v6, v0

    :goto_1
    if-nez v4, :cond_5

    invoke-interface {p0}, Lf0/y;->e()Lf0/A;

    move-result-object v4

    move-object v7, v4

    :goto_2
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lf0/A;->f()I

    move-result v8

    if-lt v8, v1, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v7}, Lf0/A;->f()I

    move-result v8

    invoke-virtual {v4}, Lf0/A;->f()I

    move-result v9

    if-ge v8, v9, :cond_3

    move-object v7, v4

    :cond_3
    invoke-virtual {v4}, Lf0/A;->e()Lf0/A;

    move-result-object v4

    goto :goto_2

    :cond_4
    move-object v4, v7

    :cond_5
    :goto_3
    invoke-virtual {v2, v3}, Lf0/A;->h(I)V

    invoke-virtual {v2, v4}, Lf0/A;->c(Lf0/A;)V

    move-object v2, v6

    goto :goto_4

    :cond_6
    add-int/lit8 v5, v5, 0x1

    :cond_7
    :goto_4
    invoke-virtual {v0}, Lf0/A;->e()Lf0/A;

    move-result-object v0

    goto :goto_0

    :cond_8
    const/4 p0, 0x1

    if-le v5, p0, :cond_9

    move v3, p0

    :cond_9
    return v3
.end method

.method private static final U(Lf0/y;)V
    .locals 1

    .prologue
    invoke-static {p0}, Lf0/p;->T(Lf0/y;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lf0/p;->g:Lf0/v;

    invoke-virtual {v0, p0}, Lf0/v;->a(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private static final V()Ljava/lang/Void;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final W(Lf0/A;ILf0/n;)Lf0/A;
    .locals 4

    .prologue
    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    if-eqz p0, :cond_2

    invoke-static {p0, p1, p2}, Lf0/p;->f0(Lf0/A;ILf0/n;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lf0/A;->f()I

    move-result v2

    invoke-virtual {p0}, Lf0/A;->f()I

    move-result v3

    if-ge v2, v3, :cond_1

    :goto_1
    move-object v1, p0

    :cond_1
    invoke-virtual {p0}, Lf0/A;->e()Lf0/A;

    move-result-object p0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    return-object v1

    :cond_3
    return-object v0
.end method

.method public static final X(Lf0/A;Lf0/y;)Lf0/A;
    .locals 3

    .prologue
    sget-object v0, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v0}, Lf0/k$a;->c()Lf0/k;

    move-result-object v1

    invoke-virtual {v1}, Lf0/k;->h()Lx7/l;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v1}, Lf0/k;->f()I

    move-result v2

    invoke-virtual {v1}, Lf0/k;->g()Lf0/n;

    move-result-object v1

    invoke-static {p0, v2, v1}, Lf0/p;->W(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object p0

    if-nez p0, :cond_2

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object p0

    monitor-enter p0

    :try_start_0
    invoke-virtual {v0}, Lf0/k$a;->c()Lf0/k;

    move-result-object v0

    invoke-interface {p1}, Lf0/y;->e()Lf0/A;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9"

    invoke-static {p1, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lf0/k;->f()I

    move-result v1

    invoke-virtual {v0}, Lf0/k;->g()Lf0/n;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lf0/p;->W(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    monitor-exit p0

    move-object p0, p1

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-static {}, Lf0/p;->V()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_2
    :goto_0
    return-object p0
.end method

.method public static final Y(I)V
    .locals 1

    sget-object v0, Lf0/p;->f:Lf0/m;

    invoke-virtual {v0, p0}, Lf0/m;->f(I)V

    return-void
.end method

.method private static final Z()Ljava/lang/Void;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot modify a state object in a read-only snapshot"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic a(Lx7/l;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lf0/p;->A(Lx7/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final a0(Lf0/k;Lx7/l;)Ljava/lang/Object;
    .locals 5

    .prologue
    sget-object v0, Lf0/p;->d:Lf0/n;

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Lf0/n;->C(I)Lf0/n;

    move-result-object v0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    sget v1, Lf0/p;->e:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lf0/p;->e:I

    sget-object v2, Lf0/p;->d:Lf0/n;

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v3

    invoke-virtual {v2, v3}, Lf0/n;->C(I)Lf0/n;

    move-result-object v2

    sput-object v2, Lf0/p;->d:Lf0/n;

    sget-object v2, Lf0/p;->j:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v3, Lf0/a;

    sget-object v4, Lf0/p;->d:Lf0/n;

    invoke-direct {v3, v1, v4}, Lf0/a;-><init>(ILf0/n;)V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lf0/k;->d()V

    sget-object p0, Lf0/p;->d:Lf0/n;

    invoke-virtual {p0, v1}, Lf0/n;->N(I)Lf0/n;

    move-result-object p0

    sput-object p0, Lf0/p;->d:Lf0/n;

    sget-object p0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static final synthetic b()V
    .locals 0

    invoke-static {}, Lf0/p;->B()V

    return-void
.end method

.method private static final b0(Lx7/l;)Lf0/k;
    .locals 1

    new-instance v0, Lf0/p$e;

    invoke-direct {v0, p0}, Lf0/p$e;-><init>(Lx7/l;)V

    invoke-static {v0}, Lf0/p;->A(Lx7/l;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf0/k;

    return-object p0
.end method

.method public static final synthetic c()V
    .locals 0

    invoke-static {}, Lf0/p;->C()V

    return-void
.end method

.method public static final c0(ILf0/n;)I
    .locals 1

    .prologue
    invoke-virtual {p1, p0}, Lf0/n;->E(I)I

    move-result p0

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    sget-object v0, Lf0/p;->f:Lf0/m;

    invoke-virtual {v0, p0}, Lf0/m;->a(I)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return p0

    :catchall_0
    move-exception p0

    monitor-exit p1

    throw p0
.end method

.method public static final synthetic d(Lf0/k;Lx7/l;Z)Lf0/k;
    .locals 0

    invoke-static {p0, p1, p2}, Lf0/p;->D(Lf0/k;Lx7/l;Z)Lf0/k;

    move-result-object p0

    return-object p0
.end method

.method private static final d0(Lf0/y;)Lf0/A;
    .locals 5

    .prologue
    invoke-interface {p0}, Lf0/y;->e()Lf0/A;

    move-result-object p0

    sget-object v0, Lf0/p;->f:Lf0/m;

    sget v1, Lf0/p;->e:I

    invoke-virtual {v0, v1}, Lf0/m;->e(I)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sget-object v1, Lf0/n;->G:Lf0/n$a;

    invoke-virtual {v1}, Lf0/n$a;->a()Lf0/n;

    move-result-object v1

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lf0/A;->f()I

    move-result v4

    if-nez v4, :cond_0

    return-object p0

    :cond_0
    invoke-static {p0, v0, v1}, Lf0/p;->f0(Lf0/A;ILf0/n;)Z

    move-result v4

    if-eqz v4, :cond_3

    if-nez v3, :cond_1

    move-object v3, p0

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lf0/A;->f()I

    move-result v0

    invoke-virtual {v3}, Lf0/A;->f()I

    move-result v1

    if-ge v0, v1, :cond_2

    goto :goto_1

    :cond_2
    move-object p0, v3

    :goto_1
    return-object p0

    :cond_3
    :goto_2
    invoke-virtual {p0}, Lf0/A;->e()Lf0/A;

    move-result-object p0

    goto :goto_0

    :cond_4
    return-object v2
.end method

.method public static final synthetic e()Ljava/util/List;
    .locals 1

    sget-object v0, Lf0/p;->h:Ljava/util/List;

    return-object v0
.end method

.method private static final e0(IILf0/n;)Z
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    if-gt p1, p0, :cond_0

    invoke-virtual {p2, p1}, Lf0/n;->D(I)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final synthetic f()Ljava/util/concurrent/atomic/AtomicReference;
    .locals 1

    sget-object v0, Lf0/p;->j:Ljava/util/concurrent/atomic/AtomicReference;

    return-object v0
.end method

.method private static final f0(Lf0/A;ILf0/n;)Z
    .locals 0

    invoke-virtual {p0}, Lf0/A;->f()I

    move-result p0

    invoke-static {p1, p0, p2}, Lf0/p;->e0(IILf0/n;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic g()Lx7/l;
    .locals 1

    sget-object v0, Lf0/p;->a:Lx7/l;

    return-object v0
.end method

.method private static final g0(Lf0/k;)V
    .locals 3

    .prologue
    sget-object v0, Lf0/p;->d:Lf0/n;

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Lf0/n;->D(I)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Snapshot is not open: id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", disposed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lf0/k;->e()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", applied="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    instance-of v1, p0, Lf0/c;

    if-eqz v1, :cond_0

    check-cast p0, Lf0/c;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lf0/c;->D()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    goto :goto_1

    :cond_1
    const-string p0, "read-only"

    :goto_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", lowestPin="

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object p0

    monitor-enter p0

    :try_start_0
    sget-object v1, Lf0/p;->f:Lf0/m;

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Lf0/m;->e(I)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2
    return-void
.end method

.method public static final synthetic h()Ljava/util/List;
    .locals 1

    sget-object v0, Lf0/p;->i:Ljava/util/List;

    return-object v0
.end method

.method public static final h0(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;
    .locals 4

    .prologue
    invoke-virtual {p2}, Lf0/k;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Lf0/k;->p(Lf0/y;)V

    :cond_0
    invoke-virtual {p2}, Lf0/k;->f()I

    move-result v0

    invoke-virtual {p2}, Lf0/k;->g()Lf0/n;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lf0/p;->W(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lf0/A;->f()I

    move-result v1

    invoke-virtual {p2}, Lf0/k;->f()I

    move-result v2

    if-ne v1, v2, :cond_1

    return-object p0

    :cond_1
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-interface {p1}, Lf0/y;->e()Lf0/A;

    move-result-object v2

    invoke-virtual {p2}, Lf0/k;->g()Lf0/n;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lf0/p;->W(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lf0/A;->f()I

    move-result v3

    if-ne v3, v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v2, p1, p2}, Lf0/p;->P(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v1

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord"

    invoke-static {v2, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf0/A;->f()I

    move-result p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    invoke-virtual {p2, p1}, Lf0/k;->p(Lf0/y;)V

    :cond_3
    return-object v2

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_4
    :try_start_1
    invoke-static {}, Lf0/p;->V()Ljava/lang/Void;

    new-instance p0, Li7/k;

    invoke-direct {p0}, Li7/k;-><init>()V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit v1

    throw p0

    :cond_5
    invoke-static {}, Lf0/p;->V()Ljava/lang/Void;

    new-instance p0, Li7/k;

    invoke-direct {p0}, Li7/k;-><init>()V

    throw p0
.end method

.method public static final synthetic i()I
    .locals 1

    sget v0, Lf0/p;->e:I

    return v0
.end method

.method public static final synthetic j()Lf0/n;
    .locals 1

    sget-object v0, Lf0/p;->d:Lf0/n;

    return-object v0
.end method

.method public static final synthetic k()LV/B1;
    .locals 1

    sget-object v0, Lf0/p;->b:LV/B1;

    return-object v0
.end method

.method public static final synthetic l(Lx7/l;Lx7/l;Z)Lx7/l;
    .locals 0

    invoke-static {p0, p1, p2}, Lf0/p;->K(Lx7/l;Lx7/l;Z)Lx7/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lx7/l;Lx7/l;)Lx7/l;
    .locals 0

    invoke-static {p0, p1}, Lf0/p;->M(Lx7/l;Lx7/l;)Lx7/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lf0/c;Lf0/c;Lf0/n;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1, p2}, Lf0/p;->R(Lf0/c;Lf0/c;Lf0/n;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lf0/y;)V
    .locals 0

    invoke-static {p0}, Lf0/p;->U(Lf0/y;)V

    return-void
.end method

.method public static final synthetic p()Ljava/lang/Void;
    .locals 1

    invoke-static {}, Lf0/p;->V()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic q(Lf0/A;ILf0/n;)Lf0/A;
    .locals 0

    invoke-static {p0, p1, p2}, Lf0/p;->W(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r()Ljava/lang/Void;
    .locals 1

    invoke-static {}, Lf0/p;->Z()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic s(Ljava/util/List;)V
    .locals 0

    sput-object p0, Lf0/p;->h:Ljava/util/List;

    return-void
.end method

.method public static final synthetic t(Ljava/util/List;)V
    .locals 0

    sput-object p0, Lf0/p;->i:Ljava/util/List;

    return-void
.end method

.method public static final synthetic u(I)V
    .locals 0

    sput p0, Lf0/p;->e:I

    return-void
.end method

.method public static final synthetic v(Lf0/n;)V
    .locals 0

    sput-object p0, Lf0/p;->d:Lf0/n;

    return-void
.end method

.method public static final synthetic w(Lf0/k;Lx7/l;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lf0/p;->a0(Lf0/k;Lx7/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic x(Lx7/l;)Lf0/k;
    .locals 0

    invoke-static {p0}, Lf0/p;->b0(Lx7/l;)Lf0/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y(Lf0/k;)V
    .locals 0

    invoke-static {p0}, Lf0/p;->g0(Lf0/k;)V

    return-void
.end method

.method public static final z(Lf0/n;II)Lf0/n;
    .locals 0

    .prologue
    :goto_0
    if-ge p1, p2, :cond_0

    invoke-virtual {p0, p1}, Lf0/n;->N(I)Lf0/n;

    move-result-object p0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method
