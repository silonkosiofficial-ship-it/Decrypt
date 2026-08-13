.class public Lf0/c;
.super Lf0/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf0/c$a;
    }
.end annotation


# static fields
.field private static final p:Lf0/c$a;

.field public static final q:I

.field private static final r:[I


# instance fields
.field private final g:Lx7/l;

.field private final h:Lx7/l;

.field private i:I

.field private j:Lr/L;

.field private k:Ljava/util/List;

.field private l:Lf0/n;

.field private m:[I

.field private n:I

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf0/c$a;-><init>(Ly7/k;)V

    sput-object v0, Lf0/c;->p:Lf0/c$a;

    const/16 v0, 0x8

    sput v0, Lf0/c;->q:I

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lf0/c;->r:[I

    return-void
.end method

.method public constructor <init>(ILf0/n;Lx7/l;Lx7/l;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lf0/k;-><init>(ILf0/n;Ly7/k;)V

    iput-object p3, p0, Lf0/c;->g:Lx7/l;

    iput-object p4, p0, Lf0/c;->h:Lx7/l;

    sget-object p1, Lf0/n;->G:Lf0/n$a;

    invoke-virtual {p1}, Lf0/n$a;->a()Lf0/n;

    move-result-object p1

    iput-object p1, p0, Lf0/c;->l:Lf0/n;

    sget-object p1, Lf0/c;->r:[I

    iput-object p1, p0, Lf0/c;->m:[I

    const/4 p1, 0x1

    iput p1, p0, Lf0/c;->n:I

    return-void
.end method

.method private final A()V
    .locals 15

    .prologue
    invoke-virtual {p0}, Lf0/c;->E()Lr/L;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-direct {p0}, Lf0/c;->R()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lf0/c;->P(Lr/L;)V

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v1

    iget-object v2, v0, Lr/W;->b:[Ljava/lang/Object;

    iget-object v0, v0, Lr/W;->a:[J

    array-length v3, v0

    add-int/lit8 v3, v3, -0x2

    if-ltz v3, :cond_5

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    aget-wide v6, v0, v5

    not-long v8, v6

    const/4 v10, 0x7

    shl-long/2addr v8, v10

    and-long/2addr v8, v6

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v8, v10

    cmp-long v8, v8, v10

    if-eqz v8, :cond_4

    sub-int v8, v5, v3

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v8, v8, 0x8

    move v10, v4

    :goto_1
    if-ge v10, v8, :cond_3

    const-wide/16 v11, 0xff

    and-long/2addr v11, v6

    const-wide/16 v13, 0x80

    cmp-long v11, v11, v13

    if-gez v11, :cond_2

    shl-int/lit8 v11, v5, 0x3

    add-int/2addr v11, v10

    aget-object v11, v2, v11

    check-cast v11, Lf0/y;

    invoke-interface {v11}, Lf0/y;->e()Lf0/A;

    move-result-object v11

    :goto_2
    if-eqz v11, :cond_2

    invoke-virtual {v11}, Lf0/A;->f()I

    move-result v12

    if-eq v12, v1, :cond_0

    iget-object v12, p0, Lf0/c;->l:Lf0/n;

    invoke-virtual {v11}, Lf0/A;->f()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lj7/v;->Z(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    :cond_0
    invoke-virtual {v11, v4}, Lf0/A;->h(I)V

    :cond_1
    invoke-virtual {v11}, Lf0/A;->e()Lf0/A;

    move-result-object v11

    goto :goto_2

    :cond_2
    shr-long/2addr v6, v9

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_3
    if-ne v8, v9, :cond_5

    :cond_4
    if-eq v5, v3, :cond_5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lf0/k;->b()V

    return-void
.end method

.method private final N()V
    .locals 3

    .prologue
    iget-object v0, p0, Lf0/c;->m:[I

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lf0/c;->m:[I

    aget v2, v2, v1

    invoke-static {v2}, Lf0/p;->Y(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final R()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lf0/c;->o:Z

    xor-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    const-string v0, "Unsupported operation on a snapshot that has been applied"

    invoke-static {v0}, LV/I0;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final S()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lf0/c;->o:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Lf0/k;->a(Lf0/k;)I

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    const-string v0, "Unsupported operation on a disposed or applied snapshot"

    invoke-static {v0}, LV/I0;->b(Ljava/lang/String;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final B()V
    .locals 4

    .prologue
    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v0

    invoke-virtual {p0, v0}, Lf0/c;->J(I)V

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p0}, Lf0/c;->D()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lf0/k;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v0

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lf0/p;->i()I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    invoke-static {v3}, Lf0/p;->u(I)V

    invoke-virtual {p0, v2}, Lf0/k;->u(I)V

    invoke-static {}, Lf0/p;->j()Lf0/n;

    move-result-object v2

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v3

    invoke-virtual {v2, v3}, Lf0/n;->N(I)Lf0/n;

    move-result-object v2

    invoke-static {v2}, Lf0/p;->v(Lf0/n;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    invoke-virtual {p0}, Lf0/k;->g()Lf0/n;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v2

    invoke-static {v1, v0, v2}, Lf0/p;->z(Lf0/n;II)Lf0/n;

    move-result-object v0

    invoke-virtual {p0, v0}, Lf0/k;->v(Lf0/n;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public C()Lf0/l;
    .locals 21

    .prologue
    move-object/from16 v1, p0

    const/4 v0, 0x1

    invoke-virtual/range {p0 .. p0}, Lf0/c;->E()Lr/L;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-static {}, Lf0/p;->f()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf0/c;

    invoke-static {}, Lf0/p;->j()Lf0/n;

    move-result-object v5

    invoke-static {}, Lf0/p;->f()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf0/a;

    invoke-virtual {v6}, Lf0/k;->f()I

    move-result v6

    invoke-virtual {v5, v6}, Lf0/n;->C(I)Lf0/n;

    move-result-object v5

    invoke-static {v4, v1, v5}, Lf0/p;->n(Lf0/c;Lf0/c;Lf0/n;)Ljava/util/Map;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v5

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    :try_start_0
    invoke-static/range {p0 .. p0}, Lf0/p;->y(Lf0/k;)V

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lr/W;->c()I

    move-result v7

    if-nez v7, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {}, Lf0/p;->f()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf0/a;

    invoke-static {}, Lf0/p;->i()I

    move-result v7

    invoke-static {}, Lf0/p;->j()Lf0/n;

    move-result-object v8

    invoke-virtual {v5}, Lf0/k;->f()I

    move-result v9

    invoke-virtual {v8, v9}, Lf0/n;->C(I)Lf0/n;

    move-result-object v8

    invoke-virtual {v1, v7, v4, v8}, Lf0/c;->I(ILjava/util/Map;Lf0/n;)Lf0/l;

    move-result-object v4

    sget-object v7, Lf0/l$b;->a:Lf0/l$b;

    invoke-static {v4, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v7, :cond_2

    monitor-exit v6

    return-object v4

    :cond_2
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Lf0/c;->c()V

    invoke-static {}, Lf0/p;->g()Lx7/l;

    move-result-object v4

    invoke-static {v5, v4}, Lf0/p;->w(Lf0/k;Lx7/l;)Ljava/lang/Object;

    invoke-virtual {v5}, Lf0/c;->E()Lr/L;

    move-result-object v4

    invoke-virtual {v1, v3}, Lf0/c;->P(Lr/L;)V

    invoke-virtual {v5, v3}, Lf0/c;->P(Lr/L;)V

    :goto_1
    invoke-static {}, Lf0/p;->e()Ljava/util/List;

    move-result-object v5

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_f

    :cond_3
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lf0/c;->c()V

    invoke-static {}, Lf0/p;->f()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf0/a;

    invoke-static {}, Lf0/p;->g()Lx7/l;

    move-result-object v7

    invoke-static {v4, v7}, Lf0/p;->w(Lf0/k;Lx7/l;)Ljava/lang/Object;

    invoke-virtual {v4}, Lf0/c;->E()Lr/L;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lr/W;->e()Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_1

    :cond_4
    move-object v4, v3

    :goto_3
    sget-object v7, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v6

    iput-boolean v0, v1, Lf0/c;->o:Z

    if-eqz v4, :cond_5

    invoke-static {v4}, LX/e;->a(Lr/W;)Ljava/util/Set;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    xor-int/2addr v8, v0

    if-eqz v8, :cond_5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v8, :cond_5

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lx7/p;

    invoke-interface {v10, v7, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/2addr v9, v0

    goto :goto_4

    :cond_5
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lr/W;->e()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-static {v2}, LX/e;->a(Lr/W;)Ljava/util/Set;

    move-result-object v7

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v8, :cond_6

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lx7/p;

    invoke-interface {v10, v7, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/2addr v9, v0

    goto :goto_5

    :cond_6
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    :try_start_2
    invoke-virtual/range {p0 .. p0}, Lf0/c;->r()V

    invoke-static {}, Lf0/p;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const-wide/16 v9, 0xff

    const/4 v11, 0x7

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v14, 0x8

    if-eqz v4, :cond_a

    :try_start_3
    iget-object v15, v4, Lr/W;->b:[Ljava/lang/Object;

    iget-object v4, v4, Lr/W;->a:[J

    array-length v6, v4

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_a

    const/4 v3, 0x0

    :goto_6
    aget-wide v0, v4, v3

    not-long v7, v0

    shl-long/2addr v7, v11

    and-long/2addr v7, v0

    and-long/2addr v7, v12

    cmp-long v7, v7, v12

    if-eqz v7, :cond_9

    sub-int v7, v3, v6

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    rsub-int/lit8 v7, v7, 0x8

    const/4 v8, 0x0

    :goto_7
    if-ge v8, v7, :cond_8

    and-long v19, v0, v9

    const-wide/16 v17, 0x80

    cmp-long v19, v19, v17

    if-gez v19, :cond_7

    shl-int/lit8 v19, v3, 0x3

    add-int v19, v19, v8

    aget-object v19, v15, v19

    check-cast v19, Lf0/y;

    invoke-static/range {v19 .. v19}, Lf0/p;->o(Lf0/y;)V

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object/from16 v1, p0

    goto/16 :goto_e

    :cond_7
    :goto_8
    shr-long/2addr v0, v14

    const/16 v16, 0x1

    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_8
    const/16 v16, 0x1

    if-ne v7, v14, :cond_a

    goto :goto_9

    :cond_9
    const/16 v16, 0x1

    :goto_9
    if-eq v3, v6, :cond_a

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_a
    if-eqz v2, :cond_e

    iget-object v0, v2, Lr/W;->b:[Ljava/lang/Object;

    iget-object v1, v2, Lr/W;->a:[J

    array-length v2, v1

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_e

    const/4 v3, 0x0

    :goto_a
    aget-wide v6, v1, v3

    not-long v9, v6

    shl-long v8, v9, v11

    and-long/2addr v8, v6

    and-long/2addr v8, v12

    cmp-long v4, v8, v12

    if-eqz v4, :cond_d

    sub-int v4, v3, v2

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    rsub-int/lit8 v4, v4, 0x8

    const/4 v8, 0x0

    :goto_b
    const-wide/16 v9, 0xff

    if-ge v8, v4, :cond_c

    and-long v19, v6, v9

    const-wide/16 v17, 0x80

    cmp-long v15, v19, v17

    if-gez v15, :cond_b

    shl-int/lit8 v15, v3, 0x3

    add-int/2addr v15, v8

    aget-object v15, v0, v15

    check-cast v15, Lf0/y;

    invoke-static {v15}, Lf0/p;->o(Lf0/y;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_b
    shr-long/2addr v6, v14

    const/4 v15, 0x1

    add-int/2addr v8, v15

    goto :goto_b

    :cond_c
    const/4 v15, 0x1

    const-wide/16 v17, 0x80

    if-ne v4, v14, :cond_e

    goto :goto_c

    :cond_d
    const-wide/16 v9, 0xff

    const/4 v15, 0x1

    const-wide/16 v17, 0x80

    :goto_c
    if-eq v3, v2, :cond_e

    add-int/2addr v3, v15

    goto :goto_a

    :cond_e
    move-object/from16 v1, p0

    :try_start_4
    iget-object v0, v1, Lf0/c;->k:Ljava/util/List;

    if-eqz v0, :cond_f

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v6, 0x0

    :goto_d
    if-ge v6, v2, :cond_f

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf0/y;

    invoke-static {v3}, Lf0/p;->o(Lf0/y;)V

    const/4 v3, 0x1

    add-int/2addr v6, v3

    goto :goto_d

    :catchall_2
    move-exception v0

    goto :goto_e

    :cond_f
    const/4 v0, 0x0

    iput-object v0, v1, Lf0/c;->k:Ljava/util/List;

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v5

    sget-object v0, Lf0/l$b;->a:Lf0/l$b;

    return-object v0

    :goto_e
    monitor-exit v5

    throw v0

    :goto_f
    monitor-exit v6

    throw v0
.end method

.method public final D()Z
    .locals 1

    iget-boolean v0, p0, Lf0/c;->o:Z

    return v0
.end method

.method public E()Lr/L;
    .locals 1

    iget-object v0, p0, Lf0/c;->j:Lr/L;

    return-object v0
.end method

.method public final F()Lf0/n;
    .locals 1

    iget-object v0, p0, Lf0/c;->l:Lf0/n;

    return-object v0
.end method

.method public final G()[I
    .locals 1

    iget-object v0, p0, Lf0/c;->m:[I

    return-object v0
.end method

.method public H()Lx7/l;
    .locals 1

    iget-object v0, p0, Lf0/c;->g:Lx7/l;

    return-object v0
.end method

.method public final I(ILjava/util/Map;Lf0/n;)Lf0/l;
    .locals 23

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-virtual/range {p0 .. p0}, Lf0/k;->g()Lf0/n;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lf0/k;->f()I

    move-result v4

    invoke-virtual {v3, v4}, Lf0/n;->N(I)Lf0/n;

    move-result-object v3

    iget-object v4, v1, Lf0/c;->l:Lf0/n;

    invoke-virtual {v3, v4}, Lf0/n;->M(Lf0/n;)Lf0/n;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lf0/c;->E()Lr/L;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v5, v4, Lr/W;->b:[Ljava/lang/Object;

    iget-object v6, v4, Lr/W;->a:[J

    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    const/4 v8, 0x0

    if-ltz v7, :cond_10

    move-object v10, v8

    const/4 v11, 0x0

    :goto_0
    aget-wide v12, v6, v11

    not-long v14, v12

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v14, v14, v16

    cmp-long v14, v14, v16

    if-eqz v14, :cond_f

    sub-int v14, v11, v7

    not-int v14, v14

    ushr-int/lit8 v14, v14, 0x1f

    const/16 v15, 0x8

    rsub-int/lit8 v14, v14, 0x8

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v14, :cond_e

    const-wide/16 v17, 0xff

    and-long v17, v12, v17

    const-wide/16 v19, 0x80

    cmp-long v17, v17, v19

    if-gez v17, :cond_d

    shl-int/lit8 v17, v11, 0x3

    add-int v17, v17, v9

    aget-object v17, v5, v17

    move-object/from16 v15, v17

    check-cast v15, Lf0/y;

    invoke-interface {v15}, Lf0/y;->e()Lf0/A;

    move-result-object v2

    move-object/from16 v21, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    move/from16 v5, p1

    move-object/from16 v6, p3

    invoke-static {v2, v5, v6}, Lf0/p;->q(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object v4

    if-nez v4, :cond_0

    :goto_2
    move-object/from16 v22, v3

    goto/16 :goto_4

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lf0/k;->f()I

    move-result v5

    invoke-static {v2, v5, v3}, Lf0/p;->q(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object v5

    if-nez v5, :cond_1

    goto :goto_2

    :cond_1
    move-object/from16 v22, v3

    invoke-virtual {v5}, Lf0/A;->f()I

    move-result v3

    const/4 v6, 0x1

    if-ne v3, v6, :cond_2

    goto/16 :goto_4

    :cond_2
    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    invoke-virtual/range {p0 .. p0}, Lf0/k;->f()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lf0/k;->g()Lf0/n;

    move-result-object v6

    invoke-static {v2, v3, v6}, Lf0/p;->q(Lf0/A;ILf0/n;)Lf0/A;

    move-result-object v2

    if-eqz v2, :cond_b

    if-eqz v0, :cond_3

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf0/A;

    if-nez v3, :cond_4

    :cond_3
    invoke-interface {v15, v5, v4, v2}, Lf0/y;->s(Lf0/A;Lf0/A;Lf0/A;)Lf0/A;

    move-result-object v3

    :cond_4
    if-nez v3, :cond_5

    new-instance v0, Lf0/l$a;

    invoke-direct {v0, v1}, Lf0/l$a;-><init>(Lf0/k;)V

    return-object v0

    :cond_5
    invoke-static {v3, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    if-nez v8, :cond_6

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :cond_6
    invoke-virtual {v4}, Lf0/A;->d()Lf0/A;

    move-result-object v2

    invoke-static {v15, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v10, :cond_7

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    :cond_7
    invoke-interface {v10, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    if-nez v8, :cond_9

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :cond_9
    invoke-static {v3, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    invoke-static {v15, v3}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    goto :goto_3

    :cond_a
    invoke-virtual {v5}, Lf0/A;->d()Lf0/A;

    move-result-object v2

    invoke-static {v15, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    :goto_3
    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_b
    invoke-static {}, Lf0/p;->p()Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_c
    :goto_4
    const/16 v2, 0x8

    goto :goto_5

    :cond_d
    move-object/from16 v22, v3

    move-object/from16 v21, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    move v2, v15

    :goto_5
    shr-long/2addr v12, v2

    const/4 v3, 0x1

    add-int/2addr v9, v3

    move v15, v2

    move-object/from16 v5, v19

    move-object/from16 v6, v20

    move-object/from16 v4, v21

    move-object/from16 v3, v22

    goto/16 :goto_1

    :cond_e
    move-object/from16 v22, v3

    move-object/from16 v21, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    move v2, v15

    const/4 v3, 0x1

    if-ne v14, v2, :cond_11

    goto :goto_6

    :cond_f
    move-object/from16 v22, v3

    move-object/from16 v21, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    const/4 v3, 0x1

    :goto_6
    if-eq v11, v7, :cond_11

    add-int/2addr v11, v3

    move-object/from16 v5, v19

    move-object/from16 v6, v20

    move-object/from16 v4, v21

    move-object/from16 v3, v22

    goto/16 :goto_0

    :cond_10
    move-object/from16 v21, v4

    move-object v10, v8

    :cond_11
    if-eqz v8, :cond_12

    invoke-virtual/range {p0 .. p0}, Lf0/c;->B()V

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_7
    if-ge v2, v0, :cond_12

    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li7/u;

    invoke-virtual {v3}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf0/y;

    invoke-virtual {v3}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf0/A;

    invoke-virtual/range {p0 .. p0}, Lf0/k;->f()I

    move-result v5

    invoke-virtual {v3, v5}, Lf0/A;->h(I)V

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    :try_start_0
    invoke-interface {v4}, Lf0/y;->e()Lf0/A;

    move-result-object v6

    invoke-virtual {v3, v6}, Lf0/A;->g(Lf0/A;)V

    invoke-interface {v4, v3}, Lf0/y;->C(Lf0/A;)V

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v5

    const/4 v3, 0x1

    add-int/2addr v2, v3

    goto :goto_7

    :catchall_0
    move-exception v0

    monitor-exit v5

    throw v0

    :cond_12
    if-eqz v10, :cond_15

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    const/4 v9, 0x0

    :goto_8
    if-ge v9, v0, :cond_13

    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf0/y;

    move-object/from16 v3, v21

    invoke-virtual {v3, v2}, Lr/L;->x(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    add-int/2addr v9, v2

    goto :goto_8

    :cond_13
    iget-object v0, v1, Lf0/c;->k:Ljava/util/List;

    if-nez v0, :cond_14

    goto :goto_9

    :cond_14
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, v10}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v10

    :goto_9
    iput-object v10, v1, Lf0/c;->k:Ljava/util/List;

    :cond_15
    sget-object v0, Lf0/l$b;->a:Lf0/l$b;

    return-object v0
.end method

.method public final J(I)V
    .locals 2

    .prologue
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf0/c;->l:Lf0/n;

    invoke-virtual {v1, p1}, Lf0/n;->N(I)Lf0/n;

    move-result-object p1

    iput-object p1, p0, Lf0/c;->l:Lf0/n;

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final K(Lf0/n;)V
    .locals 2

    .prologue
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf0/c;->l:Lf0/n;

    invoke-virtual {v1, p1}, Lf0/n;->M(Lf0/n;)Lf0/n;

    move-result-object p1

    iput-object p1, p0, Lf0/c;->l:Lf0/n;

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final L(I)V
    .locals 1

    .prologue
    if-ltz p1, :cond_0

    iget-object v0, p0, Lf0/c;->m:[I

    invoke-static {v0, p1}, Lj7/n;->E([II)[I

    move-result-object p1

    iput-object p1, p0, Lf0/c;->m:[I

    :cond_0
    return-void
.end method

.method public final M([I)V
    .locals 2

    .prologue
    array-length v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lf0/c;->m:[I

    array-length v1, v0

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0, p1}, Lj7/n;->F([I[I)[I

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lf0/c;->m:[I

    return-void
.end method

.method public final O(Z)V
    .locals 0

    iput-boolean p1, p0, Lf0/c;->o:Z

    return-void
.end method

.method public P(Lr/L;)V
    .locals 0

    iput-object p1, p0, Lf0/c;->j:Lr/L;

    return-void
.end method

.method public Q(Lx7/l;Lx7/l;)Lf0/c;
    .locals 8

    .prologue
    invoke-virtual {p0}, Lf0/k;->z()V

    invoke-direct {p0}, Lf0/c;->S()V

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v0

    invoke-virtual {p0, v0}, Lf0/c;->J(I)V

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lf0/p;->i()I

    move-result v2

    add-int/lit8 v1, v2, 0x1

    invoke-static {v1}, Lf0/p;->u(I)V

    invoke-static {}, Lf0/p;->j()Lf0/n;

    move-result-object v1

    invoke-virtual {v1, v2}, Lf0/n;->N(I)Lf0/n;

    move-result-object v1

    invoke-static {v1}, Lf0/p;->v(Lf0/n;)V

    invoke-virtual {p0}, Lf0/k;->g()Lf0/n;

    move-result-object v1

    invoke-virtual {v1, v2}, Lf0/n;->N(I)Lf0/n;

    move-result-object v3

    invoke-virtual {p0, v3}, Lf0/k;->v(Lf0/n;)V

    new-instance v7, Lf0/d;

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v1, v3, v2}, Lf0/p;->z(Lf0/n;II)Lf0/n;

    move-result-object v3

    invoke-virtual {p0}, Lf0/c;->H()Lx7/l;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {p1, v1, v6, v4, v5}, Lf0/p;->L(Lx7/l;Lx7/l;ZILjava/lang/Object;)Lx7/l;

    move-result-object v4

    invoke-virtual {p0}, Lf0/c;->k()Lx7/l;

    move-result-object p1

    invoke-static {p2, p1}, Lf0/p;->m(Lx7/l;Lx7/l;)Lx7/l;

    move-result-object v5

    move-object v1, v7

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, Lf0/d;-><init>(ILf0/n;Lx7/l;Lx7/l;Lf0/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    invoke-virtual {p0}, Lf0/c;->D()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lf0/k;->e()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result p1

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object p2

    monitor-enter p2

    :try_start_1
    invoke-static {}, Lf0/p;->i()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-static {v1}, Lf0/p;->u(I)V

    invoke-virtual {p0, v0}, Lf0/k;->u(I)V

    invoke-static {}, Lf0/p;->j()Lf0/n;

    move-result-object v0

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Lf0/n;->N(I)Lf0/n;

    move-result-object v0

    invoke-static {v0}, Lf0/p;->v(Lf0/n;)V

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p2

    invoke-virtual {p0}, Lf0/k;->g()Lf0/n;

    move-result-object p2

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v0

    invoke-static {p2, p1, v0}, Lf0/p;->z(Lf0/n;II)Lf0/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf0/k;->v(Lf0/n;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_0
    :goto_0
    return-object v7

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public c()V
    .locals 2

    invoke-static {}, Lf0/p;->j()Lf0/n;

    move-result-object v0

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Lf0/n;->C(I)Lf0/n;

    move-result-object v0

    iget-object v1, p0, Lf0/c;->l:Lf0/n;

    invoke-virtual {v0, v1}, Lf0/n;->s(Lf0/n;)Lf0/n;

    move-result-object v0

    invoke-static {v0}, Lf0/p;->v(Lf0/n;)V

    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lf0/k;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lf0/k;->d()V

    invoke-virtual {p0, p0}, Lf0/c;->n(Lf0/k;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic h()Lx7/l;
    .locals 1

    invoke-virtual {p0}, Lf0/c;->H()Lx7/l;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lf0/c;->i:I

    return v0
.end method

.method public k()Lx7/l;
    .locals 1

    iget-object v0, p0, Lf0/c;->h:Lx7/l;

    return-object v0
.end method

.method public m(Lf0/k;)V
    .locals 0

    iget p1, p0, Lf0/c;->n:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lf0/c;->n:I

    return-void
.end method

.method public n(Lf0/k;)V
    .locals 0

    .prologue
    iget p1, p0, Lf0/c;->n:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, "no pending nested snapshots"

    invoke-static {p1}, LV/I0;->a(Ljava/lang/String;)V

    :cond_1
    iget p1, p0, Lf0/c;->n:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lf0/c;->n:I

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lf0/c;->o:Z

    if-nez p1, :cond_2

    invoke-direct {p0}, Lf0/c;->A()V

    :cond_2
    return-void
.end method

.method public o()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lf0/c;->o:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lf0/k;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lf0/c;->B()V

    :cond_1
    :goto_0
    return-void
.end method

.method public p(Lf0/y;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lf0/c;->E()Lr/L;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lr/X;->a()Lr/L;

    move-result-object v0

    invoke-virtual {p0, v0}, Lf0/c;->P(Lr/L;)V

    :cond_0
    invoke-virtual {v0, p1}, Lr/L;->h(Ljava/lang/Object;)Z

    return-void
.end method

.method public r()V
    .locals 0

    invoke-direct {p0}, Lf0/c;->N()V

    invoke-super {p0}, Lf0/k;->r()V

    return-void
.end method

.method public w(I)V
    .locals 0

    iput p1, p0, Lf0/c;->i:I

    return-void
.end method

.method public x(Lx7/l;)Lf0/k;
    .locals 8

    .prologue
    invoke-virtual {p0}, Lf0/k;->z()V

    invoke-direct {p0}, Lf0/c;->S()V

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v0

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v1

    invoke-virtual {p0, v1}, Lf0/c;->J(I)V

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lf0/p;->i()I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    invoke-static {v3}, Lf0/p;->u(I)V

    invoke-static {}, Lf0/p;->j()Lf0/n;

    move-result-object v3

    invoke-virtual {v3, v2}, Lf0/n;->N(I)Lf0/n;

    move-result-object v3

    invoke-static {v3}, Lf0/p;->v(Lf0/n;)V

    new-instance v3, Lf0/e;

    invoke-virtual {p0}, Lf0/k;->g()Lf0/n;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    invoke-static {v4, v0, v2}, Lf0/p;->z(Lf0/n;II)Lf0/n;

    move-result-object v0

    invoke-virtual {p0}, Lf0/c;->H()Lx7/l;

    move-result-object v4

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {p1, v4, v7, v5, v6}, Lf0/p;->L(Lx7/l;Lx7/l;ZILjava/lang/Object;)Lx7/l;

    move-result-object p1

    invoke-direct {v3, v2, v0, p1, p0}, Lf0/e;-><init>(ILf0/n;Lx7/l;Lf0/k;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v1

    invoke-virtual {p0}, Lf0/c;->D()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lf0/k;->e()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result p1

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_1
    invoke-static {}, Lf0/p;->i()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    invoke-static {v2}, Lf0/p;->u(I)V

    invoke-virtual {p0, v1}, Lf0/k;->u(I)V

    invoke-static {}, Lf0/p;->j()Lf0/n;

    move-result-object v1

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Lf0/n;->N(I)Lf0/n;

    move-result-object v1

    invoke-static {v1}, Lf0/p;->v(Lf0/n;)V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    invoke-virtual {p0}, Lf0/k;->g()Lf0/n;

    move-result-object v0

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0}, Lf0/k;->f()I

    move-result v1

    invoke-static {v0, p1, v1}, Lf0/p;->z(Lf0/n;II)Lf0/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf0/k;->v(Lf0/n;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_0
    :goto_0
    return-object v3

    :catchall_1
    move-exception p1

    monitor-exit v1

    throw p1
.end method
