.class public abstract LF0/T;
.super LD0/X;
.source "SourceFile"

# interfaces
.implements LD0/M;
.implements LF0/X;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/T$b;
    }
.end annotation


# static fields
.field public static final P:LF0/T$b;

.field private static final Q:Lx7/l;


# instance fields
.field private H:LD0/d0;

.field private I:Z

.field private J:Z

.field private K:Z

.field private final L:LD0/X$a;

.field private M:Lr/G;

.field private N:Lr/G;

.field private O:Lr/K;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF0/T$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF0/T$b;-><init>(Ly7/k;)V

    sput-object v0, LF0/T;->P:LF0/T$b;

    sget-object v0, LF0/T$a;->D:LF0/T$a;

    sput-object v0, LF0/T;->Q:Lx7/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LD0/X;-><init>()V

    invoke-static {p0}, LD0/Y;->a(LF0/T;)LD0/X$a;

    move-result-object v0

    iput-object v0, p0, LF0/T;->L:LD0/X$a;

    return-void
.end method

.method private final A1(Lr/L;)V
    .locals 13

    .prologue
    iget-object v0, p1, Lr/W;->b:[Ljava/lang/Object;

    iget-object p1, p1, Lr/W;->a:[J

    array-length v1, p1

    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_4

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    aget-wide v4, p1, v3

    not-long v6, v4

    const/4 v8, 0x7

    shl-long/2addr v6, v8

    and-long/2addr v6, v4

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v6, v8

    cmp-long v6, v6, v8

    if-eqz v6, :cond_3

    sub-int v6, v3, v1

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    move v8, v2

    :goto_1
    if-ge v8, v6, :cond_2

    const-wide/16 v9, 0xff

    and-long/2addr v9, v4

    const-wide/16 v11, 0x80

    cmp-long v9, v9, v11

    if-gez v9, :cond_1

    shl-int/lit8 v9, v3, 0x3

    add-int/2addr v9, v8

    aget-object v9, v0, v9

    check-cast v9, Ljava/lang/ref/WeakReference;

    invoke-virtual {v9}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LF0/J;

    if-eqz v9, :cond_1

    invoke-virtual {p0}, LF0/T;->A0()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-virtual {v9, v2}, LF0/J;->p1(Z)V

    goto :goto_2

    :cond_0
    invoke-virtual {v9, v2}, LF0/J;->t1(Z)V

    :cond_1
    :goto_2
    shr-long/2addr v4, v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    if-ne v6, v7, :cond_4

    :cond_3
    if-eq v3, v1, :cond_4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public static final synthetic e1(LF0/T;LF0/t0;)V
    .locals 0

    invoke-direct {p0, p1}, LF0/T;->h1(LF0/t0;)V

    return-void
.end method

.method private final h1(LF0/t0;)V
    .locals 24

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-boolean v2, v0, LF0/T;->K:Z

    if-eqz v2, :cond_0

    return-void

    :cond_0
    invoke-virtual/range {p1 .. p1}, LF0/t0;->b()LD0/K;

    move-result-object v2

    invoke-interface {v2}, LD0/K;->l()Lx7/l;

    move-result-object v2

    iget-object v3, v0, LF0/T;->O:Lr/K;

    const/4 v8, 0x7

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/4 v11, 0x0

    const/16 v12, 0x8

    if-nez v2, :cond_5

    if-eqz v3, :cond_13

    iget-object v1, v3, Lr/U;->c:[Ljava/lang/Object;

    iget-object v2, v3, Lr/U;->a:[J

    array-length v13, v2

    add-int/lit8 v13, v13, -0x2

    if-ltz v13, :cond_4

    move v14, v11

    :goto_0
    aget-wide v4, v2, v14

    not-long v6, v4

    shl-long/2addr v6, v8

    and-long/2addr v6, v4

    and-long/2addr v6, v9

    cmp-long v6, v6, v9

    if-eqz v6, :cond_3

    sub-int v6, v14, v13

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    rsub-int/lit8 v6, v6, 0x8

    move v7, v11

    :goto_1
    if-ge v7, v6, :cond_2

    const-wide/16 v17, 0xff

    and-long v19, v4, v17

    const-wide/16 v15, 0x80

    cmp-long v19, v19, v15

    if-gez v19, :cond_1

    shl-int/lit8 v19, v14, 0x3

    add-int v19, v19, v7

    aget-object v19, v1, v19

    move-object/from16 v15, v19

    check-cast v15, Lr/L;

    invoke-direct {v0, v15}, LF0/T;->A1(Lr/L;)V

    :cond_1
    shr-long/2addr v4, v12

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    if-ne v6, v12, :cond_4

    :cond_3
    if-eq v14, v13, :cond_4

    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v3}, Lr/K;->i()V

    goto/16 :goto_a

    :cond_5
    iget-object v2, v0, LF0/T;->N:Lr/G;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v2, :cond_6

    new-instance v2, Lr/G;

    invoke-direct {v2, v11, v5, v4}, Lr/G;-><init>(IILy7/k;)V

    iput-object v2, v0, LF0/T;->N:Lr/G;

    :cond_6
    iget-object v6, v0, LF0/T;->M:Lr/G;

    if-nez v6, :cond_7

    new-instance v6, Lr/G;

    invoke-direct {v6, v11, v5, v4}, Lr/G;-><init>(IILy7/k;)V

    iput-object v6, v0, LF0/T;->M:Lr/G;

    :cond_7
    invoke-virtual {v2, v6}, Lr/G;->p(Lr/M;)V

    invoke-virtual {v6}, Lr/G;->i()V

    invoke-virtual/range {p0 .. p0}, LF0/T;->o1()LF0/J;

    move-result-object v5

    invoke-virtual {v5}, LF0/J;->n0()LF0/o0;

    move-result-object v5

    if-eqz v5, :cond_8

    invoke-interface {v5}, LF0/o0;->getSnapshotObserver()LF0/q0;

    move-result-object v5

    if-eqz v5, :cond_8

    sget-object v7, LF0/T;->Q:Lx7/l;

    new-instance v13, LF0/T$c;

    invoke-direct {v13, v1, v0}, LF0/T$c;-><init>(LF0/t0;LF0/T;)V

    invoke-virtual {v5, v1, v7, v13}, LF0/q0;->i(LF0/p0;Lx7/l;Lx7/a;)V

    :cond_8
    if-eqz v3, :cond_d

    iget-object v1, v2, Lr/M;->b:[Ljava/lang/Object;

    iget-object v5, v2, Lr/M;->c:[F

    iget-object v7, v2, Lr/M;->a:[J

    array-length v13, v7

    add-int/lit8 v13, v13, -0x2

    if-ltz v13, :cond_d

    move-object/from16 p1, v5

    move v14, v11

    :goto_2
    aget-wide v4, v7, v14

    not-long v11, v4

    shl-long/2addr v11, v8

    and-long/2addr v11, v4

    and-long/2addr v11, v9

    cmp-long v11, v11, v9

    if-eqz v11, :cond_c

    sub-int v11, v14, v13

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    const/4 v12, 0x0

    :goto_3
    if-ge v12, v11, :cond_b

    const-wide/16 v15, 0xff

    and-long v22, v4, v15

    const-wide/16 v15, 0x80

    cmp-long v20, v22, v15

    if-gez v20, :cond_a

    shl-int/lit8 v20, v14, 0x3

    add-int v20, v20, v12

    aget-object v21, v1, v20

    aget v20, p1, v20

    invoke-static/range {v21 .. v21}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/high16 v15, 0x7fc00000    # Float.NaN

    const/4 v9, 0x0

    invoke-virtual {v6, v9, v15}, Lr/M;->e(Ljava/lang/Object;F)F

    move-result v10

    cmpg-float v10, v10, v20

    if-nez v10, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {v3, v9}, Lr/K;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lr/L;

    if-eqz v10, :cond_a

    invoke-direct {v0, v10}, LF0/T;->A1(Lr/L;)V

    :cond_a
    :goto_4
    const/16 v9, 0x8

    shr-long/2addr v4, v9

    add-int/lit8 v12, v12, 0x1

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto :goto_3

    :cond_b
    const/16 v9, 0x8

    if-ne v11, v9, :cond_d

    :cond_c
    if-eq v14, v13, :cond_d

    add-int/lit8 v14, v14, 0x1

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/4 v11, 0x0

    const/16 v12, 0x8

    goto :goto_2

    :cond_d
    iget-object v1, v6, Lr/M;->b:[Ljava/lang/Object;

    iget-object v3, v6, Lr/M;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_12

    const/4 v5, 0x0

    :goto_5
    aget-wide v6, v3, v5

    not-long v9, v6

    shl-long/2addr v9, v8

    and-long/2addr v9, v6

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_11

    sub-int v9, v5, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v10, 0x0

    :goto_6
    if-ge v10, v9, :cond_10

    const-wide/16 v13, 0xff

    and-long v15, v6, v13

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_f

    shl-int/lit8 v15, v5, 0x3

    add-int/2addr v15, v10

    aget-object v15, v1, v15

    invoke-static {v15}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 v15, 0x0

    invoke-virtual {v2, v15}, Lr/M;->a(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_e

    invoke-virtual/range {p0 .. p0}, LF0/T;->r1()LF0/T;

    move-result-object v8

    if-eqz v8, :cond_e

    invoke-direct {v8, v15}, LF0/T;->w1(LD0/c0;)V

    :cond_e
    :goto_7
    const/16 v8, 0x8

    goto :goto_8

    :cond_f
    const/4 v15, 0x0

    goto :goto_7

    :goto_8
    shr-long/2addr v6, v8

    add-int/lit8 v10, v10, 0x1

    const/4 v8, 0x7

    goto :goto_6

    :cond_10
    const/16 v8, 0x8

    const-wide/16 v13, 0xff

    const/4 v15, 0x0

    const-wide/16 v17, 0x80

    if-ne v9, v8, :cond_12

    goto :goto_9

    :cond_11
    const/16 v8, 0x8

    const-wide/16 v13, 0xff

    const/4 v15, 0x0

    const-wide/16 v17, 0x80

    :goto_9
    if-eq v5, v4, :cond_12

    add-int/lit8 v5, v5, 0x1

    const/4 v8, 0x7

    goto :goto_5

    :cond_12
    invoke-virtual {v2}, Lr/G;->i()V

    :cond_13
    :goto_a
    return-void
.end method

.method private final j1(LD0/c0;)LF0/T;
    .locals 3

    .prologue
    move-object v0, p0

    :goto_0
    iget-object v1, v0, LF0/T;->M:Lr/G;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lr/M;->a(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v0}, LF0/T;->r1()LF0/T;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method private final w1(LD0/c0;)V
    .locals 1

    .prologue
    invoke-direct {p0, p1}, LF0/T;->j1(LD0/c0;)LF0/T;

    move-result-object v0

    iget-object v0, v0, LF0/T;->O:Lr/K;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lr/K;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr/L;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, LF0/T;->A1(Lr/L;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public A0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public synthetic B0(F)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->g(LY0/e;F)F

    move-result p1

    return p1
.end method

.method public abstract B1()V
.end method

.method public final C1(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/T;->K:Z

    return-void
.end method

.method public final D1(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/T;->J:Z

    return-void
.end method

.method public synthetic K0(J)I
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->a(LY0/e;J)I

    move-result p1

    return p1
.end method

.method public synthetic O(F)J
    .locals 2

    invoke-static {p0, p1}, LY0/m;->b(LY0/n;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public O0(IILjava/util/Map;Lx7/l;Lx7/l;)LD0/K;
    .locals 8

    .prologue
    const/high16 v0, -0x1000000

    and-int v1, p1, v0

    if-nez v1, :cond_0

    and-int/2addr v0, p2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Size("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") is out of range. Each dimension must be between 0 and 16777215."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    new-instance v0, LF0/T$d;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, LF0/T$d;-><init>(IILjava/util/Map;Lx7/l;Lx7/l;LF0/T;)V

    return-object v0
.end method

.method public synthetic P(J)J
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->e(LY0/e;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final Q(LD0/a;)I
    .locals 2

    .prologue
    invoke-virtual {p0}, LF0/T;->n1()Z

    move-result v0

    const/high16 v1, -0x80000000

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, LF0/T;->f1(LD0/a;)I

    move-result p1

    if-ne p1, v1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, LD0/X;->u0()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->i(J)I

    move-result v0

    add-int/2addr p1, v0

    return p1
.end method

.method public synthetic S0(F)I
    .locals 0

    invoke-static {p0, p1}, LY0/d;->b(LY0/e;F)I

    move-result p1

    return p1
.end method

.method public synthetic X(J)F
    .locals 0

    invoke-static {p0, p1, p2}, LY0/m;->a(LY0/n;J)F

    move-result p1

    return p1
.end method

.method public synthetic b1(J)J
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->h(LY0/e;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public synthetic f0(IILjava/util/Map;Lx7/l;)LD0/K;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LD0/L;->a(LD0/M;IILjava/util/Map;Lx7/l;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public abstract f1(LD0/a;)I
.end method

.method public g0(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/T;->I:Z

    return-void
.end method

.method public synthetic g1(J)F
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->f(LY0/e;J)F

    move-result p1

    return p1
.end method

.method public final i1(LD0/K;)V
    .locals 13

    .prologue
    if-eqz p1, :cond_0

    new-instance v0, LF0/t0;

    invoke-direct {v0, p1, p0}, LF0/t0;-><init>(LD0/K;LF0/T;)V

    invoke-direct {p0, v0}, LF0/T;->h1(LF0/t0;)V

    goto :goto_2

    :cond_0
    iget-object p1, p0, LF0/T;->O:Lr/K;

    if-eqz p1, :cond_4

    iget-object v0, p1, Lr/U;->c:[Ljava/lang/Object;

    iget-object p1, p1, Lr/U;->a:[J

    array-length v1, p1

    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_4

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    aget-wide v4, p1, v3

    not-long v6, v4

    const/4 v8, 0x7

    shl-long/2addr v6, v8

    and-long/2addr v6, v4

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v6, v8

    cmp-long v6, v6, v8

    if-eqz v6, :cond_3

    sub-int v6, v3, v1

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    move v8, v2

    :goto_1
    if-ge v8, v6, :cond_2

    const-wide/16 v9, 0xff

    and-long/2addr v9, v4

    const-wide/16 v11, 0x80

    cmp-long v9, v9, v11

    if-gez v9, :cond_1

    shl-int/lit8 v9, v3, 0x3

    add-int/2addr v9, v8

    aget-object v9, v0, v9

    check-cast v9, Lr/L;

    invoke-direct {p0, v9}, LF0/T;->A1(Lr/L;)V

    :cond_1
    shr-long/2addr v4, v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    if-ne v6, v7, :cond_4

    :cond_3
    if-eq v3, v1, :cond_4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    iget-object p1, p0, LF0/T;->O:Lr/K;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lr/K;->i()V

    :cond_5
    iget-object p1, p0, LF0/T;->M:Lr/G;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lr/G;->i()V

    :cond_6
    :goto_2
    return-void
.end method

.method public synthetic k0(F)J
    .locals 2

    invoke-static {p0, p1}, LY0/d;->i(LY0/e;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract k1()LF0/T;
.end method

.method public abstract m1()LD0/t;
.end method

.method public abstract n1()Z
.end method

.method public synthetic o0(I)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->d(LY0/e;I)F

    move-result p1

    return p1
.end method

.method public abstract o1()LF0/J;
.end method

.method public synthetic q0(F)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->c(LY0/e;F)F

    move-result p1

    return p1
.end method

.method public abstract q1()LD0/K;
.end method

.method public abstract r1()LF0/T;
.end method

.method public final s1()LD0/X$a;
    .locals 1

    iget-object v0, p0, LF0/T;->L:LD0/X$a;

    return-object v0
.end method

.method public abstract t1()J
.end method

.method public final u1()LD0/d0;
    .locals 1

    .prologue
    iget-object v0, p0, LF0/T;->H:LD0/d0;

    if-nez v0, :cond_0

    new-instance v0, LF0/T$e;

    invoke-direct {v0, p0}, LF0/T$e;-><init>(LF0/T;)V

    :cond_0
    return-object v0
.end method

.method protected final v1(LF0/d0;)V
    .locals 2

    .prologue
    invoke-virtual {p1}, LF0/d0;->o2()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LF0/d0;->o1()LF0/J;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1}, LF0/d0;->e2()LF0/b;

    move-result-object p1

    if-nez v0, :cond_1

    invoke-interface {p1}, LF0/b;->f()LF0/a;

    move-result-object p1

    :goto_1
    invoke-virtual {p1}, LF0/a;->m()V

    goto :goto_2

    :cond_1
    invoke-interface {p1}, LF0/b;->J()LF0/b;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, LF0/b;->f()LF0/a;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public x1()Z
    .locals 1

    iget-boolean v0, p0, LF0/T;->I:Z

    return v0
.end method

.method public final y1()Z
    .locals 1

    iget-boolean v0, p0, LF0/T;->K:Z

    return v0
.end method

.method public final z1()Z
    .locals 1

    iget-boolean v0, p0, LF0/T;->J:Z

    return v0
.end method
