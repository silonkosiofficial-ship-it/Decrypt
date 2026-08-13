.class public final Lm1/f;
.super Lm1/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/f$a;
    }
.end annotation


# static fields
.field public static final h1:Lm1/f$a;

.field public static final i1:I

.field private static final j1:Z


# instance fields
.field private H0:Ln1/b;

.field private I0:Ln1/e;

.field private J0:I

.field private K0:Ln1/b$c;

.field private L0:Z

.field private M0:Le1/d;

.field private N0:I

.field private O0:I

.field private P0:I

.field private Q0:I

.field private R0:I

.field private S0:I

.field private T0:[Lm1/c;

.field private U0:[Lm1/c;

.field private V0:I

.field private W0:Z

.field private X0:Z

.field private Y0:Z

.field private Z0:Ljava/lang/String;

.field private a1:I

.field private b1:Ljava/lang/ref/WeakReference;

.field private c1:Ljava/lang/ref/WeakReference;

.field private d1:Ljava/lang/ref/WeakReference;

.field private e1:Ljava/lang/ref/WeakReference;

.field private f1:Ljava/util/HashSet;

.field private g1:Ln1/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm1/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm1/f$a;-><init>(Ly7/k;)V

    sput-object v0, Lm1/f;->h1:Lm1/f$a;

    const/16 v0, 0x8

    sput v0, Lm1/f;->i1:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lm1/m;-><init>(II)V

    new-instance p1, Ln1/b;

    invoke-direct {p1, p0}, Ln1/b;-><init>(Lm1/f;)V

    iput-object p1, p0, Lm1/f;->H0:Ln1/b;

    new-instance p1, Ln1/e;

    invoke-direct {p1, p0}, Ln1/e;-><init>(Lm1/f;)V

    iput-object p1, p0, Lm1/f;->I0:Ln1/e;

    new-instance p1, Le1/d;

    invoke-direct {p1}, Le1/d;-><init>()V

    iput-object p1, p0, Lm1/f;->M0:Le1/d;

    const/4 p1, 0x4

    new-array p2, p1, [Lm1/c;

    iput-object p2, p0, Lm1/f;->T0:[Lm1/c;

    new-array p1, p1, [Lm1/c;

    iput-object p1, p0, Lm1/f;->U0:[Lm1/c;

    const/16 p1, 0x101

    iput p1, p0, Lm1/f;->V0:I

    const-string p1, "ConstraintLayout"

    iput-object p1, p0, Lm1/f;->Z0:Ljava/lang/String;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lm1/f;->f1:Ljava/util/HashSet;

    new-instance p1, Ln1/b$b;

    invoke-direct {p1}, Ln1/b$b;-><init>()V

    iput-object p1, p0, Lm1/f;->g1:Ln1/b$b;

    return-void
.end method

.method private final M2()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm1/f;->R0:I

    iput v0, p0, Lm1/f;->S0:I

    return-void
.end method

.method public static final synthetic i2()Z
    .locals 1

    sget-boolean v0, Lm1/f;->j1:Z

    return v0
.end method

.method private final l2(Lm1/e;)V
    .locals 5

    .prologue
    iget v0, p0, Lm1/f;->R0:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lm1/f;->U0:[Lm1/c;

    array-length v2, v1

    if-lt v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Lm1/c;

    iput-object v0, p0, Lm1/f;->U0:[Lm1/c;

    :cond_0
    iget-object v0, p0, Lm1/f;->U0:[Lm1/c;

    iget v1, p0, Lm1/f;->R0:I

    new-instance v2, Lm1/c;

    const/4 v3, 0x0

    invoke-virtual {p0}, Lm1/f;->J2()Z

    move-result v4

    invoke-direct {v2, p1, v3, v4}, Lm1/c;-><init>(Lm1/e;IZ)V

    aput-object v2, v0, v1

    iget p1, p0, Lm1/f;->R0:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lm1/f;->R0:I

    return-void
.end method

.method private final o2(Lm1/d;Le1/i;)V
    .locals 3

    iget-object v0, p0, Lm1/f;->M0:Le1/d;

    invoke-virtual {v0, p1}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object p1

    iget-object v0, p0, Lm1/f;->M0:Le1/d;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v0, p2, p1, v1, v2}, Le1/d;->l(Le1/i;Le1/i;II)V

    return-void
.end method

.method private final p2(Lm1/d;Le1/i;)V
    .locals 3

    iget-object v0, p0, Lm1/f;->M0:Le1/d;

    invoke-virtual {v0, p1}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object p1

    iget-object v0, p0, Lm1/f;->M0:Le1/d;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v0, p1, p2, v1, v2}, Le1/d;->l(Le1/i;Le1/i;II)V

    return-void
.end method

.method private final q2(Lm1/e;)V
    .locals 5

    .prologue
    iget v0, p0, Lm1/f;->S0:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lm1/f;->T0:[Lm1/c;

    array-length v3, v2

    if-lt v0, v3, :cond_0

    array-length v0, v2

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v2, "copyOf(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Lm1/c;

    iput-object v0, p0, Lm1/f;->T0:[Lm1/c;

    :cond_0
    iget-object v0, p0, Lm1/f;->T0:[Lm1/c;

    iget v2, p0, Lm1/f;->S0:I

    new-instance v3, Lm1/c;

    invoke-virtual {p0}, Lm1/f;->J2()Z

    move-result v4

    invoke-direct {v3, p1, v1, v4}, Lm1/c;-><init>(Lm1/e;IZ)V

    aput-object v3, v0, v2

    iget p1, p0, Lm1/f;->S0:I

    add-int/2addr p1, v1

    iput p1, p0, Lm1/f;->S0:I

    return-void
.end method


# virtual methods
.method public final A2()I
    .locals 1

    iget v0, p0, Lm1/f;->N0:I

    return v0
.end method

.method public final B2()I
    .locals 1

    iget v0, p0, Lm1/f;->O0:I

    return v0
.end method

.method public final C2()[Lm1/c;
    .locals 1

    iget-object v0, p0, Lm1/f;->T0:[Lm1/c;

    return-object v0
.end method

.method public final D2()I
    .locals 1

    iget v0, p0, Lm1/f;->S0:I

    return v0
.end method

.method public final E2()Ln1/b$c;
    .locals 1

    iget-object v0, p0, Lm1/f;->K0:Ln1/b$c;

    return-object v0
.end method

.method public final F2()I
    .locals 1

    iget v0, p0, Lm1/f;->V0:I

    return v0
.end method

.method public final G2()Le1/d;
    .locals 1

    iget-object v0, p0, Lm1/f;->M0:Le1/d;

    return-object v0
.end method

.method public final H2()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final I2()V
    .locals 1

    iget-object v0, p0, Lm1/f;->I0:Ln1/e;

    invoke-virtual {v0}, Ln1/e;->j()V

    return-void
.end method

.method public final J2()Z
    .locals 1

    iget-boolean v0, p0, Lm1/f;->L0:Z

    return v0
.end method

.method public K1(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lm1/f;->Z0:Ljava/lang/String;

    return-void
.end method

.method public final K2(IIIIIIIII)J
    .locals 12

    move-object v11, p0

    move/from16 v3, p8

    iput v3, v11, Lm1/f;->N0:I

    move/from16 v4, p9

    iput v4, v11, Lm1/f;->O0:I

    iget-object v0, v11, Lm1/f;->H0:Ln1/b;

    move-object v1, p0

    move v2, p1

    move v5, p2

    move v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    invoke-virtual/range {v0 .. v10}, Ln1/b;->d(Lm1/f;IIIIIIIII)J

    move-result-wide v0

    return-wide v0
.end method

.method public final L2(I)Z
    .locals 1

    .prologue
    iget v0, p0, Lm1/f;->V0:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final N2(Ln1/b$c;)V
    .locals 1

    iput-object p1, p0, Lm1/f;->K0:Ln1/b$c;

    iget-object v0, p0, Lm1/f;->I0:Ln1/e;

    invoke-virtual {v0, p1}, Ln1/e;->m(Ln1/b$c;)V

    return-void
.end method

.method public final O2(I)V
    .locals 1

    iput p1, p0, Lm1/f;->V0:I

    sget-object p1, Le1/d;->s:Le1/d$a;

    const/16 v0, 0x200

    invoke-virtual {p0, v0}, Lm1/f;->L2(I)Z

    move-result v0

    invoke-virtual {p1, v0}, Le1/d$a;->f(Z)V

    return-void
.end method

.method public final P2(I)V
    .locals 0

    iput p1, p0, Lm1/f;->J0:I

    return-void
.end method

.method public final Q2(Le1/d;[Z)Z
    .locals 5

    .prologue
    const-string v0, "flags"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    aput-boolean v1, p2, v0

    const/16 p2, 0x40

    invoke-virtual {p0, p2}, Lm1/f;->L2(I)Z

    move-result p2

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lm1/e;->Z1(Le1/d;Z)V

    invoke-virtual {p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "get(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lm1/e;

    invoke-virtual {v3, p1, p2}, Lm1/e;->Z1(Le1/d;Z)V

    invoke-virtual {v3}, Lm1/e;->G0()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public final R2()V
    .locals 1

    iget-object v0, p0, Lm1/f;->H0:Ln1/b;

    invoke-virtual {v0, p0}, Ln1/b;->e(Lm1/f;)V

    return-void
.end method

.method public W0()V
    .locals 1

    iget-object v0, p0, Lm1/f;->M0:Le1/d;

    invoke-virtual {v0}, Le1/d;->H()V

    const/4 v0, 0x0

    iput v0, p0, Lm1/f;->N0:I

    iput v0, p0, Lm1/f;->P0:I

    iput v0, p0, Lm1/f;->O0:I

    iput v0, p0, Lm1/f;->Q0:I

    iput-boolean v0, p0, Lm1/f;->W0:Z

    invoke-super {p0}, Lm1/m;->W0()V

    return-void
.end method

.method public Y1(ZZ)V
    .locals 4

    .prologue
    invoke-super {p0, p1, p2}, Lm1/e;->Y1(ZZ)V

    invoke-virtual {p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "get(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm1/e;

    invoke-virtual {v2, p1, p2}, Lm1/e;->Y1(ZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e2()V
    .locals 23

    .prologue
    move-object/from16 v1, p0

    sget-boolean v0, Lm1/f;->j1:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v3, "\n#####################################"

    invoke-virtual {v0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v3, "##          CL LAYOUT PASS           ##"

    invoke-virtual {v0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v3, "#####################################\n"

    invoke-virtual {v0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iput v2, v1, Lm1/f;->a1:I

    :cond_0
    invoke-virtual {v1, v2}, Lm1/e;->A1(I)V

    invoke-virtual {v1, v2}, Lm1/e;->B1(I)V

    iput-boolean v2, v1, Lm1/f;->X0:Z

    iput-boolean v2, v1, Lm1/f;->Y0:Z

    invoke-virtual/range {p0 .. p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lm1/e;->B0()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lm1/e;->w()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v5

    const/4 v6, 0x1

    aget-object v5, v5, v6

    invoke-virtual/range {p0 .. p0}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v7

    aget-object v7, v7, v2

    iget v8, v1, Lm1/f;->J0:I

    const-string v9, "get(...)"

    if-nez v8, :cond_3

    sget-object v8, Lm1/k;->a:Lm1/k$a;

    iget v10, v1, Lm1/f;->V0:I

    invoke-virtual {v8, v10, v6}, Lm1/k$a;->b(II)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Ln1/h;->a:Ln1/h$a;

    invoke-virtual/range {p0 .. p0}, Lm1/f;->E2()Ln1/b$c;

    move-result-object v10

    invoke-virtual {v8, v1, v10}, Ln1/h$a;->i(Lm1/f;Ln1/b$c;)V

    move v8, v2

    :goto_0
    if-ge v8, v3, :cond_3

    invoke-virtual/range {p0 .. p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v13, v10

    check-cast v13, Lm1/e;

    invoke-virtual {v13}, Lm1/e;->P0()Z

    move-result v10

    if-eqz v10, :cond_2

    instance-of v10, v13, Lm1/h;

    if-nez v10, :cond_2

    instance-of v10, v13, Lm1/a;

    if-nez v10, :cond_2

    instance-of v10, v13, Lm1/l;

    if-nez v10, :cond_2

    invoke-virtual {v13}, Lm1/e;->O0()Z

    move-result v10

    if-nez v10, :cond_2

    invoke-virtual {v13, v2}, Lm1/e;->r(I)Lm1/e$b;

    move-result-object v10

    invoke-virtual {v13, v6}, Lm1/e;->r(I)Lm1/e$b;

    move-result-object v11

    sget-object v12, Lm1/e$b;->E:Lm1/e$b;

    if-ne v10, v12, :cond_1

    invoke-virtual {v13}, Lm1/e;->Q()I

    move-result v10

    if-eq v10, v6, :cond_1

    if-ne v11, v12, :cond_1

    invoke-virtual {v13}, Lm1/e;->P()I

    move-result v10

    if-eq v10, v6, :cond_1

    goto :goto_1

    :cond_1
    new-instance v15, Ln1/b$b;

    invoke-direct {v15}, Ln1/b$b;-><init>()V

    sget-object v11, Lm1/f;->h1:Lm1/f$a;

    iget-object v14, v1, Lm1/f;->K0:Ln1/b$c;

    sget-object v10, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {v10}, Ln1/b$b$a;->a()I

    move-result v16

    const/4 v12, 0x0

    invoke-virtual/range {v11 .. v16}, Lm1/f$a;->a(ILm1/e;Ln1/b$c;Ln1/b$b;I)Z

    :cond_2
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_3
    const/4 v8, 0x2

    if-le v3, v8, :cond_9

    sget-object v10, Lm1/e$b;->D:Lm1/e$b;

    if-eq v7, v10, :cond_4

    if-ne v5, v10, :cond_9

    :cond_4
    sget-object v11, Lm1/k;->a:Lm1/k$a;

    iget v12, v1, Lm1/f;->V0:I

    const/16 v13, 0x400

    invoke-virtual {v11, v12, v13}, Lm1/k$a;->b(II)Z

    move-result v11

    if-eqz v11, :cond_9

    sget-object v11, Ln1/i;->a:Ln1/i$a;

    invoke-virtual/range {p0 .. p0}, Lm1/f;->E2()Ln1/b$c;

    move-result-object v12

    invoke-virtual {v11, v1, v12}, Ln1/i$a;->c(Lm1/f;Ln1/b$c;)Z

    move-result v11

    if-eqz v11, :cond_9

    if-ne v7, v10, :cond_6

    invoke-virtual/range {p0 .. p0}, Lm1/e;->B0()I

    move-result v11

    if-ge v0, v11, :cond_5

    if-lez v0, :cond_5

    invoke-virtual {v1, v0}, Lm1/e;->U1(I)V

    iput-boolean v6, v1, Lm1/f;->X0:Z

    goto :goto_2

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lm1/e;->B0()I

    move-result v0

    :cond_6
    :goto_2
    if-ne v5, v10, :cond_8

    invoke-virtual/range {p0 .. p0}, Lm1/e;->w()I

    move-result v10

    if-ge v4, v10, :cond_7

    if-lez v4, :cond_7

    invoke-virtual {v1, v4}, Lm1/e;->m1(I)V

    iput-boolean v6, v1, Lm1/f;->Y0:Z

    goto :goto_3

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lm1/e;->w()I

    move-result v4

    :cond_8
    :goto_3
    move v10, v4

    move v4, v0

    move v0, v6

    goto :goto_4

    :cond_9
    move v10, v4

    move v4, v0

    move v0, v2

    :goto_4
    const/16 v11, 0x40

    invoke-virtual {v1, v11}, Lm1/f;->L2(I)Z

    move-result v12

    if-nez v12, :cond_b

    const/16 v12, 0x80

    invoke-virtual {v1, v12}, Lm1/f;->L2(I)Z

    move-result v12

    if-eqz v12, :cond_a

    goto :goto_5

    :cond_a
    move v12, v2

    goto :goto_6

    :cond_b
    :goto_5
    move v12, v6

    :goto_6
    iget-object v13, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual {v13, v2}, Le1/d;->I(Z)V

    iget-object v13, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual {v13, v2}, Le1/d;->K(Z)V

    iget v13, v1, Lm1/f;->V0:I

    if-eqz v13, :cond_c

    if-eqz v12, :cond_c

    iget-object v12, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual {v12, v6}, Le1/d;->K(Z)V

    :cond_c
    invoke-virtual/range {p0 .. p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lm1/e;->A()Lm1/e$b;

    move-result-object v13

    sget-object v14, Lm1/e$b;->D:Lm1/e$b;

    if-eq v13, v14, :cond_e

    invoke-virtual/range {p0 .. p0}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v13

    if-ne v13, v14, :cond_d

    goto :goto_7

    :cond_d
    move v13, v2

    goto :goto_8

    :cond_e
    :goto_7
    move v13, v6

    :goto_8
    invoke-direct/range {p0 .. p0}, Lm1/f;->M2()V

    move v14, v2

    :goto_9
    if-ge v14, v3, :cond_10

    invoke-virtual/range {p0 .. p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v15

    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v15, Lm1/e;

    instance-of v2, v15, Lm1/m;

    if-eqz v2, :cond_f

    check-cast v15, Lm1/m;

    invoke-virtual {v15}, Lm1/m;->e2()V

    :cond_f
    add-int/lit8 v14, v14, 0x1

    const/4 v2, 0x0

    goto :goto_9

    :cond_10
    invoke-virtual {v1, v11}, Lm1/f;->L2(I)Z

    move-result v2

    move v11, v0

    move v14, v6

    const/4 v0, 0x0

    :goto_a
    if-eqz v14, :cond_24

    add-int/lit8 v15, v0, 0x1

    :try_start_0
    iget-object v0, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual {v0}, Le1/d;->H()V

    invoke-direct/range {p0 .. p0}, Lm1/f;->M2()V

    sget-boolean v0, Lm1/f;->j1:Z

    if-eqz v0, :cond_14

    invoke-virtual/range {p0 .. p0}, Lm1/e;->q()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v0, :cond_11

    :try_start_1
    const-string v0, "root"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_b

    :catch_0
    move-exception v0

    goto/16 :goto_10

    :cond_11
    :goto_b
    :try_start_2
    iget-object v6, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual {v1, v6, v0}, Lm1/e;->d1(Le1/d;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_c
    if-ge v0, v3, :cond_13

    invoke-virtual/range {p0 .. p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lm1/e;

    invoke-virtual {v6}, Lm1/e;->q()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_12

    iget-object v8, v1, Lm1/f;->M0:Le1/d;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move/from16 v18, v14

    :try_start_3
    invoke-virtual {v6}, Lm1/e;->q()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6, v8, v14}, Lm1/e;->d1(Le1/d;Ljava/lang/String;)V

    goto :goto_d

    :catch_1
    move-exception v0

    move/from16 v14, v18

    goto/16 :goto_10

    :catch_2
    move-exception v0

    move/from16 v18, v14

    goto/16 :goto_10

    :cond_12
    move/from16 v18, v14

    :goto_d
    add-int/lit8 v0, v0, 0x1

    move/from16 v14, v18

    const/4 v8, 0x2

    goto :goto_c

    :cond_13
    move/from16 v18, v14

    goto :goto_f

    :cond_14
    move/from16 v18, v14

    iget-object v0, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual {v1, v0}, Lm1/e;->j(Le1/d;)V

    const/4 v0, 0x0

    :goto_e
    if-ge v0, v3, :cond_15

    invoke-virtual/range {p0 .. p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lm1/e;

    iget-object v8, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual {v6, v8}, Lm1/e;->j(Le1/d;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_e

    :cond_15
    :goto_f
    iget-object v0, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual {v1, v0}, Lm1/f;->k2(Le1/d;)Z

    move-result v14
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    iget-object v0, v1, Lm1/f;->b1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_16

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_16

    iget-object v0, v1, Lm1/f;->b1:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v0, Lm1/d;

    iget-object v8, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual/range {p0 .. p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v6

    invoke-virtual {v8, v6}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v1, v0, v6}, Lm1/f;->p2(Lm1/d;Le1/i;)V

    const/4 v0, 0x0

    iput-object v0, v1, Lm1/f;->b1:Ljava/lang/ref/WeakReference;

    :cond_16
    iget-object v0, v1, Lm1/f;->d1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_17

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_17

    iget-object v0, v1, Lm1/f;->d1:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v0, Lm1/d;

    iget-object v6, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual/range {p0 .. p0}, Lm1/e;->G()Lm1/d;

    move-result-object v8

    invoke-virtual {v6, v8}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v1, v0, v6}, Lm1/f;->o2(Lm1/d;Le1/i;)V

    const/4 v0, 0x0

    iput-object v0, v1, Lm1/f;->d1:Ljava/lang/ref/WeakReference;

    :cond_17
    iget-object v0, v1, Lm1/f;->c1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_18

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_18

    iget-object v0, v1, Lm1/f;->c1:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v0, Lm1/d;

    iget-object v6, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual/range {p0 .. p0}, Lm1/e;->L()Lm1/d;

    move-result-object v8

    invoke-virtual {v6, v8}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v1, v0, v6}, Lm1/f;->p2(Lm1/d;Le1/i;)V

    const/4 v0, 0x0

    iput-object v0, v1, Lm1/f;->c1:Ljava/lang/ref/WeakReference;

    :cond_18
    iget-object v0, v1, Lm1/f;->e1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_19

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_19

    iget-object v0, v1, Lm1/f;->e1:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v0, Lm1/d;

    iget-object v6, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual/range {p0 .. p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v8

    invoke-virtual {v6, v8}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v1, v0, v6}, Lm1/f;->o2(Lm1/d;Le1/i;)V

    const/4 v0, 0x0

    iput-object v0, v1, Lm1/f;->e1:Ljava/lang/ref/WeakReference;

    :cond_19
    if-eqz v14, :cond_1a

    iget-object v0, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual {v0}, Le1/d;->D()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_11

    :goto_10
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "EXCEPTION : "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v6, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_1a
    :goto_11
    iget-object v0, v1, Lm1/f;->M0:Le1/d;

    if-eqz v14, :cond_1b

    sget-object v6, Lm1/k;->a:Lm1/k$a;

    invoke-virtual {v6}, Lm1/k$a;->c()[Z

    move-result-object v6

    invoke-virtual {v1, v0, v6}, Lm1/f;->Q2(Le1/d;[Z)Z

    move-result v0

    goto :goto_13

    :cond_1b
    invoke-virtual {v1, v0, v2}, Lm1/e;->Z1(Le1/d;Z)V

    const/4 v0, 0x0

    :goto_12
    if-ge v0, v3, :cond_1c

    invoke-virtual/range {p0 .. p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lm1/e;

    iget-object v8, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual {v6, v8, v2}, Lm1/e;->Z1(Le1/d;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_12

    :cond_1c
    const/4 v0, 0x0

    :goto_13
    const/16 v6, 0x8

    if-eqz v13, :cond_20

    if-ge v15, v6, :cond_20

    sget-object v8, Lm1/k;->a:Lm1/k$a;

    invoke-virtual {v8}, Lm1/k$a;->c()[Z

    move-result-object v8

    const/4 v14, 0x2

    aget-boolean v8, v8, v14

    if-eqz v8, :cond_20

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    :goto_14
    move/from16 v19, v0

    if-ge v8, v3, :cond_1d

    invoke-virtual/range {p0 .. p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/e;

    invoke-virtual {v0}, Lm1/e;->g0()I

    move-result v20

    invoke-virtual {v0}, Lm1/e;->B0()I

    move-result v21

    move/from16 v22, v2

    add-int v2, v20, v21

    invoke-static {v14, v2}, Ljava/lang/Math;->max(II)I

    move-result v14

    invoke-virtual {v0}, Lm1/e;->h0()I

    move-result v2

    invoke-virtual {v0}, Lm1/e;->w()I

    move-result v0

    add-int/2addr v2, v0

    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/lit8 v8, v8, 0x1

    move/from16 v0, v19

    move/from16 v2, v22

    goto :goto_14

    :cond_1d
    move/from16 v22, v2

    invoke-virtual/range {p0 .. p0}, Lm1/e;->Y()I

    move-result v0

    invoke-static {v0, v14}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lm1/e;->X()I

    move-result v2

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    sget-object v6, Lm1/e$b;->D:Lm1/e$b;

    if-ne v7, v6, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lm1/e;->B0()I

    move-result v8

    if-ge v8, v0, :cond_1e

    invoke-virtual {v1, v0}, Lm1/e;->U1(I)V

    invoke-virtual/range {p0 .. p0}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v0

    const/4 v8, 0x0

    aput-object v6, v0, v8

    const/4 v11, 0x1

    const/16 v19, 0x1

    :cond_1e
    if-ne v5, v6, :cond_1f

    invoke-virtual/range {p0 .. p0}, Lm1/e;->w()I

    move-result v0

    if-ge v0, v2, :cond_1f

    invoke-virtual {v1, v2}, Lm1/e;->m1(I)V

    invoke-virtual/range {p0 .. p0}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v6, v0, v2

    const/4 v0, 0x1

    const/4 v11, 0x1

    goto :goto_16

    :cond_1f
    :goto_15
    move/from16 v0, v19

    goto :goto_16

    :cond_20
    move/from16 v19, v0

    move/from16 v22, v2

    goto :goto_15

    :goto_16
    invoke-virtual/range {p0 .. p0}, Lm1/e;->Y()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lm1/e;->B0()I

    move-result v6

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lm1/e;->X()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lm1/e;->w()I

    move-result v8

    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    if-nez v11, :cond_22

    invoke-virtual/range {p0 .. p0}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v8

    const/4 v14, 0x0

    aget-object v8, v8, v14

    sget-object v14, Lm1/e$b;->D:Lm1/e$b;

    if-ne v8, v14, :cond_21

    if-lez v4, :cond_21

    if-le v2, v4, :cond_21

    const/4 v2, 0x1

    iput-boolean v2, v1, Lm1/f;->X0:Z

    invoke-virtual/range {p0 .. p0}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v0

    sget-object v8, Lm1/e$b;->C:Lm1/e$b;

    const/4 v11, 0x0

    aput-object v8, v0, v11

    invoke-virtual {v1, v4}, Lm1/e;->U1(I)V

    move v0, v2

    move v11, v0

    goto :goto_17

    :cond_21
    const/4 v2, 0x1

    :goto_17
    invoke-virtual/range {p0 .. p0}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v8

    aget-object v8, v8, v2

    if-ne v8, v14, :cond_22

    if-lez v10, :cond_22

    if-le v6, v10, :cond_22

    iput-boolean v2, v1, Lm1/f;->Y0:Z

    invoke-virtual/range {p0 .. p0}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v0

    sget-object v6, Lm1/e$b;->C:Lm1/e$b;

    aput-object v6, v0, v2

    invoke-virtual {v1, v10}, Lm1/e;->m1(I)V

    const/16 v0, 0x8

    const/4 v11, 0x1

    const/4 v14, 0x1

    goto :goto_18

    :cond_22
    move v14, v0

    const/16 v0, 0x8

    :goto_18
    if-le v15, v0, :cond_23

    move v0, v15

    move/from16 v2, v22

    const/4 v6, 0x1

    const/4 v8, 0x2

    const/4 v14, 0x0

    goto/16 :goto_a

    :cond_23
    move v0, v15

    move/from16 v2, v22

    const/4 v6, 0x1

    const/4 v8, 0x2

    goto/16 :goto_a

    :cond_24
    const-string v0, "null cannot be cast to non-null type java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget>{ kotlin.collections.TypeAliasesKt.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> }"

    invoke-static {v12, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Lm1/m;->h2(Ljava/util/ArrayList;)V

    if-eqz v11, :cond_25

    invoke-virtual/range {p0 .. p0}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v0

    const/4 v2, 0x0

    aput-object v7, v0, v2

    invoke-virtual/range {p0 .. p0}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v5, v0, v2

    :cond_25
    iget-object v0, v1, Lm1/f;->M0:Le1/d;

    invoke-virtual {v0}, Le1/d;->y()Le1/c;

    move-result-object v0

    invoke-virtual {v1, v0}, Lm1/m;->Z0(Le1/c;)V

    return-void
.end method

.method public final j2(Lm1/e;I)V
    .locals 1

    .prologue
    const-string v0, "constraintWidget"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lm1/f;->q2(Lm1/e;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lm1/f;->l2(Lm1/e;)V

    :goto_0
    return-void
.end method

.method public final k2(Le1/d;)Z
    .locals 13

    .prologue
    const-string v0, "system"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lm1/f;->j1:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "\n#######################################"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iget v2, p0, Lm1/f;->a1:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "##    ADD CHILDREN TO SOLVER  ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") ##"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v2, "#######################################\n"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iget v0, p0, Lm1/f;->a1:I

    add-int/2addr v0, v1

    iput v0, p0, Lm1/f;->a1:I

    :cond_0
    const/16 v0, 0x40

    invoke-virtual {p0, v0}, Lm1/f;->L2(I)Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lm1/e;->d(Le1/d;Z)V

    invoke-virtual {p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    const-string v6, "get(...)"

    if-ge v4, v2, :cond_2

    invoke-virtual {p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/e;

    invoke-virtual {v7, v3, v3}, Lm1/e;->v1(IZ)V

    invoke-virtual {v7, v1, v3}, Lm1/e;->v1(IZ)V

    instance-of v6, v7, Lm1/a;

    if-eqz v6, :cond_1

    move v5, v1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-eqz v5, :cond_4

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_4

    invoke-virtual {p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lm1/e;

    instance-of v7, v5, Lm1/a;

    if-eqz v7, :cond_3

    check-cast v5, Lm1/a;

    invoke-virtual {v5}, Lm1/a;->k2()V

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    iget-object v4, p0, Lm1/f;->f1:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->clear()V

    move v4, v3

    :goto_2
    if-ge v4, v2, :cond_7

    invoke-virtual {p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lm1/e;

    invoke-virtual {v5}, Lm1/e;->c()Z

    move-result v7

    if-eqz v7, :cond_6

    instance-of v7, v5, Lm1/l;

    if-eqz v7, :cond_5

    iget-object v7, p0, Lm1/f;->f1:Ljava/util/HashSet;

    invoke-virtual {v7, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-virtual {v5, p1, v0}, Lm1/e;->d(Le1/d;Z)V

    :cond_6
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_7
    :goto_4
    iget-object v4, p0, Lm1/f;->f1:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    move-result v4

    if-lez v4, :cond_b

    iget-object v4, p0, Lm1/f;->f1:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    move-result v4

    iget-object v5, p0, Lm1/f;->f1:Ljava/util/HashSet;

    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm1/e;

    const-string v8, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.VirtualLayout"

    invoke-static {v7, v8}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/l;

    iget-object v8, p0, Lm1/f;->f1:Ljava/util/HashSet;

    invoke-virtual {v7, v8}, Lm1/l;->f2(Ljava/util/HashSet;)Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-virtual {v7, p1, v0}, Lm1/e;->d(Le1/d;Z)V

    iget-object v5, p0, Lm1/f;->f1:Ljava/util/HashSet;

    invoke-virtual {v5, v7}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_9
    iget-object v5, p0, Lm1/f;->f1:Ljava/util/HashSet;

    invoke-virtual {v5}, Ljava/util/HashSet;->size()I

    move-result v5

    if-ne v4, v5, :cond_7

    iget-object v4, p0, Lm1/f;->f1:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm1/e;

    invoke-virtual {v5, p1, v0}, Lm1/e;->d(Le1/d;Z)V

    goto :goto_5

    :cond_a
    iget-object v4, p0, Lm1/f;->f1:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->clear()V

    goto :goto_4

    :cond_b
    sget-object v4, Le1/d;->s:Le1/d$a;

    invoke-virtual {v4}, Le1/d$a;->e()Z

    move-result v4

    if-eqz v4, :cond_f

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    move v5, v3

    :goto_6
    if-ge v5, v2, :cond_d

    invoke-virtual {p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/e;

    invoke-virtual {v7}, Lm1/e;->c()Z

    move-result v8

    if-nez v8, :cond_c

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_c
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_d
    invoke-virtual {p0}, Lm1/e;->A()Lm1/e$b;

    move-result-object v2

    sget-object v5, Lm1/e$b;->D:Lm1/e$b;

    if-ne v2, v5, :cond_e

    move v11, v3

    goto :goto_7

    :cond_e
    move v11, v1

    :goto_7
    const/4 v12, 0x0

    move-object v7, p0

    move-object v8, p0

    move-object v9, p1

    move-object v10, v4

    invoke-virtual/range {v7 .. v12}, Lm1/e;->b(Lm1/f;Le1/d;Ljava/util/HashSet;IZ)V

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm1/e;

    sget-object v5, Lm1/k;->a:Lm1/k$a;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5, p0, p1, v4}, Lm1/k$a;->a(Lm1/f;Le1/d;Lm1/e;)V

    invoke-virtual {v4, p1, v0}, Lm1/e;->d(Le1/d;Z)V

    goto :goto_8

    :cond_f
    move v4, v3

    :goto_9
    if-ge v4, v2, :cond_15

    invoke-virtual {p0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lm1/e;

    instance-of v7, v5, Lm1/f;

    if-eqz v7, :cond_13

    invoke-virtual {v5}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v7

    aget-object v7, v7, v3

    invoke-virtual {v5}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v8

    aget-object v8, v8, v1

    sget-object v9, Lm1/e$b;->D:Lm1/e$b;

    if-ne v7, v9, :cond_10

    sget-object v10, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {v5, v10}, Lm1/e;->r1(Lm1/e$b;)V

    :cond_10
    if-ne v8, v9, :cond_11

    sget-object v10, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {v5, v10}, Lm1/e;->P1(Lm1/e$b;)V

    :cond_11
    invoke-virtual {v5, p1, v0}, Lm1/e;->d(Le1/d;Z)V

    if-ne v7, v9, :cond_12

    invoke-virtual {v5, v7}, Lm1/e;->r1(Lm1/e$b;)V

    :cond_12
    if-ne v8, v9, :cond_14

    invoke-virtual {v5, v8}, Lm1/e;->P1(Lm1/e$b;)V

    goto :goto_a

    :cond_13
    sget-object v7, Lm1/k;->a:Lm1/k$a;

    invoke-virtual {v7, p0, p1, v5}, Lm1/k$a;->a(Lm1/f;Le1/d;Lm1/e;)V

    invoke-virtual {v5}, Lm1/e;->c()Z

    move-result v7

    if-nez v7, :cond_14

    invoke-virtual {v5, p1, v0}, Lm1/e;->d(Le1/d;Z)V

    :cond_14
    :goto_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_15
    iget v0, p0, Lm1/f;->R0:I

    const/4 v2, 0x0

    if-lez v0, :cond_16

    sget-object v0, Lm1/b;->a:Lm1/b$a;

    invoke-virtual {v0, p0, p1, v2, v3}, Lm1/b$a;->b(Lm1/f;Le1/d;Ljava/util/ArrayList;I)V

    :cond_16
    iget v0, p0, Lm1/f;->S0:I

    if-lez v0, :cond_17

    sget-object v0, Lm1/b;->a:Lm1/b$a;

    invoke-virtual {v0, p0, p1, v2, v1}, Lm1/b$a;->b(Lm1/f;Le1/d;Ljava/util/ArrayList;I)V

    :cond_17
    return v1
.end method

.method public final m2(Lm1/d;)V
    .locals 2

    .prologue
    const-string v0, "right"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/f;->e1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lm1/d;->e()I

    move-result v0

    iget-object v1, p0, Lm1/f;->e1:Ljava/lang/ref/WeakReference;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v1, Lm1/d;

    invoke-virtual {v1}, Lm1/d;->e()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lm1/f;->e1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public final n2(Lm1/d;)V
    .locals 2

    .prologue
    const-string v0, "left"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/f;->c1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lm1/d;->e()I

    move-result v0

    iget-object v1, p0, Lm1/f;->c1:Ljava/lang/ref/WeakReference;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v1, Lm1/d;

    invoke-virtual {v1}, Lm1/d;->e()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lm1/f;->c1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public final r2(Lm1/d;)V
    .locals 3

    .prologue
    const-string v0, "bottom"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/f;->d1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/d;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lm1/d;->e()I

    move-result v0

    iget-object v2, p0, Lm1/f;->d1:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/d;

    :cond_1
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->e()I

    move-result v1

    if-le v0, v1, :cond_3

    :cond_2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lm1/f;->d1:Ljava/lang/ref/WeakReference;

    :cond_3
    return-void
.end method

.method public final s2(Lm1/d;)V
    .locals 2

    .prologue
    const-string v0, "top"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/f;->b1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lm1/d;->e()I

    move-result v0

    iget-object v1, p0, Lm1/f;->b1:Ljava/lang/ref/WeakReference;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v1, Lm1/d;

    invoke-virtual {v1}, Lm1/d;->e()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lm1/f;->b1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public final t2(Z)Z
    .locals 1

    iget-object v0, p0, Lm1/f;->I0:Ln1/e;

    invoke-virtual {v0, p1}, Ln1/e;->f(Z)Z

    move-result p1

    return p1
.end method

.method public u0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm1/f;->Z0:Ljava/lang/String;

    return-object v0
.end method

.method public final u2(Z)Z
    .locals 1

    iget-object v0, p0, Lm1/f;->I0:Ln1/e;

    invoke-virtual {v0, p1}, Ln1/e;->g(Z)Z

    move-result p1

    return p1
.end method

.method public final v2(ZI)Z
    .locals 1

    iget-object v0, p0, Lm1/f;->I0:Ln1/e;

    invoke-virtual {v0, p1, p2}, Ln1/e;->h(ZI)Z

    move-result p1

    return p1
.end method

.method public final w2()[Lm1/c;
    .locals 1

    iget-object v0, p0, Lm1/f;->U0:[Lm1/c;

    return-object v0
.end method

.method public final x2()I
    .locals 1

    iget v0, p0, Lm1/f;->R0:I

    return v0
.end method

.method public final y2()Ln1/b$b;
    .locals 1

    iget-object v0, p0, Lm1/f;->g1:Ln1/b$b;

    return-object v0
.end method

.method public final z2()Le1/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
