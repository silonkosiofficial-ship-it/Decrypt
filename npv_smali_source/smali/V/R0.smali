.class public final LV/R0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/e1;
.implements LV/Q0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV/R0$a;
    }
.end annotation


# static fields
.field public static final h:LV/R0$a;

.field public static final i:I


# instance fields
.field private a:I

.field private b:LV/T0;

.field private c:LV/d;

.field private d:Lx7/p;

.field private e:I

.field private f:Lr/H;

.field private g:Lr/K;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LV/R0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LV/R0$a;-><init>(Ly7/k;)V

    sput-object v0, LV/R0;->h:LV/R0$a;

    const/16 v0, 0x8

    sput v0, LV/R0;->i:I

    return-void
.end method

.method public constructor <init>(LV/T0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/R0;->b:LV/T0;

    return-void
.end method

.method private final F(Z)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    iget p1, p0, LV/R0;->a:I

    or-int/lit8 p1, p1, 0x20

    :goto_0
    iput p1, p0, LV/R0;->a:I

    goto :goto_1

    :cond_0
    iget p1, p0, LV/R0;->a:I

    and-int/lit8 p1, p1, -0x21

    goto :goto_0

    :goto_1
    return-void
.end method

.method private final G(Z)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    iget p1, p0, LV/R0;->a:I

    or-int/lit8 p1, p1, 0x10

    :goto_0
    iput p1, p0, LV/R0;->a:I

    goto :goto_1

    :cond_0
    iget p1, p0, LV/R0;->a:I

    and-int/lit8 p1, p1, -0x11

    goto :goto_0

    :goto_1
    return-void
.end method

.method public static final synthetic b(LV/R0;)I
    .locals 0

    iget p0, p0, LV/R0;->e:I

    return p0
.end method

.method public static final synthetic c(LV/R0;)Lr/K;
    .locals 0

    iget-object p0, p0, LV/R0;->g:Lr/K;

    return-object p0
.end method

.method public static final synthetic d(LV/R0;)Lr/H;
    .locals 0

    iget-object p0, p0, LV/R0;->f:Lr/H;

    return-object p0
.end method

.method private final f(LV/J;Lr/K;)Z
    .locals 2

    .prologue
    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LV/J;->c()LV/u1;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, LV/v1;->p()LV/u1;

    move-result-object v0

    :cond_0
    invoke-interface {p1}, LV/J;->p()LV/J$a;

    move-result-object v1

    invoke-interface {v1}, LV/J$a;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, p1}, Lr/U;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, p1}, LV/u1;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private final o()Z
    .locals 1

    .prologue
    iget v0, p0, LV/R0;->a:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final A(LV/d;)V
    .locals 0

    iput-object p1, p0, LV/R0;->c:LV/d;

    return-void
.end method

.method public final B(Z)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    iget p1, p0, LV/R0;->a:I

    or-int/lit8 p1, p1, 0x2

    :goto_0
    iput p1, p0, LV/R0;->a:I

    goto :goto_1

    :cond_0
    iget p1, p0, LV/R0;->a:I

    and-int/lit8 p1, p1, -0x3

    goto :goto_0

    :goto_1
    return-void
.end method

.method public final C(Z)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    iget p1, p0, LV/R0;->a:I

    or-int/lit8 p1, p1, 0x4

    :goto_0
    iput p1, p0, LV/R0;->a:I

    goto :goto_1

    :cond_0
    iget p1, p0, LV/R0;->a:I

    and-int/lit8 p1, p1, -0x5

    goto :goto_0

    :goto_1
    return-void
.end method

.method public final D(Z)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    iget p1, p0, LV/R0;->a:I

    or-int/lit8 p1, p1, 0x40

    :goto_0
    iput p1, p0, LV/R0;->a:I

    goto :goto_1

    :cond_0
    iget p1, p0, LV/R0;->a:I

    and-int/lit8 p1, p1, -0x41

    goto :goto_0

    :goto_1
    return-void
.end method

.method public final E(Z)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    iget p1, p0, LV/R0;->a:I

    or-int/lit8 p1, p1, 0x8

    :goto_0
    iput p1, p0, LV/R0;->a:I

    goto :goto_1

    :cond_0
    iget p1, p0, LV/R0;->a:I

    and-int/lit8 p1, p1, -0x9

    goto :goto_0

    :goto_1
    return-void
.end method

.method public final H(Z)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    iget p1, p0, LV/R0;->a:I

    or-int/lit8 p1, p1, 0x1

    :goto_0
    iput p1, p0, LV/R0;->a:I

    goto :goto_1

    :cond_0
    iget p1, p0, LV/R0;->a:I

    and-int/lit8 p1, p1, -0x2

    goto :goto_0

    :goto_1
    return-void
.end method

.method public final I(I)V
    .locals 0

    iput p1, p0, LV/R0;->e:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LV/R0;->G(Z)V

    return-void
.end method

.method public a(Lx7/p;)V
    .locals 0

    iput-object p1, p0, LV/R0;->d:Lx7/p;

    return-void
.end method

.method public final e(LV/T0;)V
    .locals 0

    iput-object p1, p0, LV/R0;->b:LV/T0;

    return-void
.end method

.method public final g(LV/n;)V
    .locals 2

    .prologue
    iget-object v0, p0, LV/R0;->d:Lx7/p;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid restart scope"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(I)Lx7/l;
    .locals 19

    .prologue
    move-object/from16 v0, p0

    move/from16 v1, p1

    iget-object v2, v0, LV/R0;->f:Lr/H;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-virtual/range {p0 .. p0}, LV/R0;->p()Z

    move-result v4

    if-nez v4, :cond_3

    iget-object v4, v2, Lr/N;->b:[Ljava/lang/Object;

    iget-object v5, v2, Lr/N;->c:[I

    iget-object v6, v2, Lr/N;->a:[J

    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    if-ltz v7, :cond_3

    const/4 v8, 0x0

    move v9, v8

    :goto_0
    aget-wide v10, v6, v9

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_2

    sub-int v12, v9, v7

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    move v14, v8

    :goto_1
    if-ge v14, v12, :cond_1

    const-wide/16 v15, 0xff

    and-long/2addr v15, v10

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_0

    shl-int/lit8 v15, v9, 0x3

    add-int/2addr v15, v14

    aget-object v16, v4, v15

    aget v15, v5, v15

    if-eq v15, v1, :cond_0

    new-instance v3, LV/R0$b;

    invoke-direct {v3, v0, v1, v2}, LV/R0$b;-><init>(LV/R0;ILr/H;)V

    goto :goto_2

    :cond_0
    shr-long/2addr v10, v13

    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    :cond_1
    if-ne v12, v13, :cond_3

    :cond_2
    if-eq v9, v7, :cond_3

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-object v3
.end method

.method public final i()LV/d;
    .locals 1

    iget-object v0, p0, LV/R0;->c:LV/d;

    return-object v0
.end method

.method public invalidate()V
    .locals 2

    .prologue
    iget-object v0, p0, LV/R0;->b:LV/T0;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, LV/T0;->g(LV/R0;Ljava/lang/Object;)LV/a0;

    :cond_0
    return-void
.end method

.method public final j()Z
    .locals 1

    .prologue
    iget-object v0, p0, LV/R0;->d:Lx7/p;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final k()Z
    .locals 1

    .prologue
    iget v0, p0, LV/R0;->a:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l()Z
    .locals 1

    .prologue
    iget v0, p0, LV/R0;->a:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final m()Z
    .locals 1

    .prologue
    iget v0, p0, LV/R0;->a:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final n()Z
    .locals 1

    .prologue
    iget v0, p0, LV/R0;->a:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final p()Z
    .locals 1

    .prologue
    iget v0, p0, LV/R0;->a:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final q()Z
    .locals 2

    .prologue
    iget v0, p0, LV/R0;->a:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final r()Z
    .locals 2

    .prologue
    iget-object v0, p0, LV/R0;->b:LV/T0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LV/R0;->c:LV/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LV/d;->b()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final s(Ljava/lang/Object;)LV/a0;
    .locals 1

    .prologue
    iget-object v0, p0, LV/R0;->b:LV/T0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, LV/T0;->g(LV/R0;Ljava/lang/Object;)LV/a0;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, LV/a0;->C:LV/a0;

    :cond_1
    return-object p1
.end method

.method public final t()Z
    .locals 1

    .prologue
    iget-object v0, p0, LV/R0;->g:Lr/K;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final u(Ljava/lang/Object;)Z
    .locals 17

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget-object v3, v0, LV/R0;->g:Lr/K;

    if-nez v3, :cond_1

    return v2

    :cond_1
    instance-of v4, v1, LV/J;

    if-eqz v4, :cond_2

    check-cast v1, LV/J;

    invoke-direct {v0, v1, v3}, LV/R0;->f(LV/J;Lr/K;)Z

    move-result v2

    goto :goto_2

    :cond_2
    instance-of v4, v1, Lr/W;

    if-eqz v4, :cond_7

    check-cast v1, Lr/W;

    invoke-virtual {v1}, Lr/W;->e()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_6

    iget-object v4, v1, Lr/W;->b:[Ljava/lang/Object;

    iget-object v1, v1, Lr/W;->a:[J

    array-length v6, v1

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_6

    move v7, v5

    :goto_0
    aget-wide v8, v1, v7

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

    move v12, v5

    :goto_1
    if-ge v12, v10, :cond_4

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_3

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v13, v4, v13

    instance-of v14, v13, LV/J;

    if-eqz v14, :cond_7

    check-cast v13, LV/J;

    invoke-direct {v0, v13, v3}, LV/R0;->f(LV/J;Lr/K;)Z

    move-result v13

    if-eqz v13, :cond_3

    goto :goto_2

    :cond_3
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_4
    if-ne v10, v11, :cond_6

    :cond_5
    if-eq v7, v6, :cond_6

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_6
    move v2, v5

    :cond_7
    :goto_2
    return v2
.end method

.method public final v(LV/J;Ljava/lang/Object;)V
    .locals 4

    .prologue
    iget-object v0, p0, LV/R0;->g:Lr/K;

    if-nez v0, :cond_0

    new-instance v0, Lr/K;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lr/K;-><init>(IILy7/k;)V

    iput-object v0, p0, LV/R0;->g:Lr/K;

    :cond_0
    invoke-virtual {v0, p1, p2}, Lr/K;->s(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final w(Ljava/lang/Object;)Z
    .locals 5

    .prologue
    invoke-direct {p0}, LV/R0;->o()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LV/R0;->f:Lr/H;

    const/4 v2, 0x1

    if-nez v0, :cond_1

    new-instance v0, Lr/H;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lr/H;-><init>(IILy7/k;)V

    iput-object v0, p0, LV/R0;->f:Lr/H;

    :cond_1
    iget v3, p0, LV/R0;->e:I

    const/4 v4, -0x1

    invoke-virtual {v0, p1, v3, v4}, Lr/H;->p(Ljava/lang/Object;II)I

    move-result p1

    iget v0, p0, LV/R0;->e:I

    if-ne p1, v0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public final x()V
    .locals 1

    .prologue
    iget-object v0, p0, LV/R0;->b:LV/T0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, LV/T0;->f(LV/R0;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LV/R0;->b:LV/T0;

    iput-object v0, p0, LV/R0;->f:Lr/H;

    iput-object v0, p0, LV/R0;->g:Lr/K;

    return-void
.end method

.method public final y()V
    .locals 17

    .prologue
    move-object/from16 v1, p0

    iget-object v0, v1, LV/R0;->b:LV/T0;

    if-eqz v0, :cond_4

    iget-object v2, v1, LV/R0;->f:Lr/H;

    if-eqz v2, :cond_4

    const/4 v3, 0x1

    invoke-direct {v1, v3}, LV/R0;->F(Z)V

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, v2, Lr/N;->b:[Ljava/lang/Object;

    iget-object v5, v2, Lr/N;->c:[I

    iget-object v2, v2, Lr/N;->a:[J

    array-length v6, v2

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_3

    move v7, v3

    :goto_0
    aget-wide v8, v2, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_2

    sub-int v10, v7, v6

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v3

    :goto_1
    if-ge v12, v10, :cond_1

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_0

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v14, v4, v13

    aget v13, v5, v13

    invoke-interface {v0, v14}, LV/T0;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    :goto_2
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_1
    if-ne v10, v11, :cond_3

    :cond_2
    if-eq v7, v6, :cond_3

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    invoke-direct {v1, v3}, LV/R0;->F(Z)V

    goto :goto_4

    :goto_3
    invoke-direct {v1, v3}, LV/R0;->F(Z)V

    throw v0

    :cond_4
    :goto_4
    return-void
.end method

.method public final z()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LV/R0;->G(Z)V

    return-void
.end method
