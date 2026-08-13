.class public final LS/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(FFFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LS/m;->a:F

    iput p2, p0, LS/m;->b:F

    iput p3, p0, LS/m;->c:F

    iput p4, p0, LS/m;->d:F

    iput p5, p0, LS/m;->e:F

    return-void
.end method

.method public synthetic constructor <init>(FFFFFLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LS/m;-><init>(FFFFF)V

    return-void
.end method

.method public static final synthetic a(LS/m;)F
    .locals 0

    iget p0, p0, LS/m;->c:F

    return p0
.end method

.method public static final synthetic b(LS/m;)F
    .locals 0

    iget p0, p0, LS/m;->d:F

    return p0
.end method

.method public static final synthetic c(LS/m;)F
    .locals 0

    iget p0, p0, LS/m;->b:F

    return p0
.end method

.method private final d(ZLz/j;LV/n;I)LV/G1;
    .locals 18

    .prologue
    move-object/from16 v7, p0

    move/from16 v3, p1

    move-object/from16 v0, p2

    move-object/from16 v8, p3

    move/from16 v1, p4

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v4, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:938)"

    const v5, -0x4e3b51fe

    invoke-static {v5, v1, v2, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface/range {p3 .. p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, LV/n;->a:LV/n$a;

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_1

    invoke-static {}, LV/v1;->f()Lf0/r;

    move-result-object v2

    invoke-interface {v8, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Lf0/r;

    and-int/lit8 v5, v1, 0x70

    xor-int/lit8 v5, v5, 0x30

    const/16 v6, 0x20

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-le v5, v6, :cond_2

    invoke-interface {v8, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    and-int/lit8 v5, v1, 0x30

    if-ne v5, v6, :cond_4

    :cond_3
    move v5, v9

    goto :goto_0

    :cond_4
    move v5, v10

    :goto_0
    invoke-interface/range {p3 .. p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_5

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_6

    :cond_5
    new-instance v6, LS/m$a;

    const/4 v5, 0x0

    invoke-direct {v6, v0, v2, v5}, LS/m$a;-><init>(Lz/j;Lf0/r;Lm7/e;)V

    invoke-interface {v8, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v6, Lx7/p;

    shr-int/lit8 v5, v1, 0x3

    and-int/lit8 v5, v5, 0xe

    invoke-static {v0, v6, v8, v5}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-static {v2}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lz/i;

    if-nez v3, :cond_7

    iget v0, v7, LS/m;->e:F

    :goto_1
    move v2, v0

    goto :goto_2

    :cond_7
    instance-of v0, v5, Lz/n$b;

    if-eqz v0, :cond_8

    iget v0, v7, LS/m;->b:F

    goto :goto_1

    :cond_8
    instance-of v0, v5, Lz/g;

    if-eqz v0, :cond_9

    iget v0, v7, LS/m;->d:F

    goto :goto_1

    :cond_9
    instance-of v0, v5, Lz/d;

    if-eqz v0, :cond_a

    iget v0, v7, LS/m;->c:F

    goto :goto_1

    :cond_a
    iget v0, v7, LS/m;->a:F

    goto :goto_1

    :goto_2
    invoke-interface/range {p3 .. p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v0, v6, :cond_b

    new-instance v0, Lu/a;

    invoke-static {v2}, LY0/i;->m(F)LY0/i;

    move-result-object v12

    sget-object v6, LY0/i;->D:LY0/i$a;

    invoke-static {v6}, Lu/z0;->b(LY0/i$a;)Lu/x0;

    move-result-object v13

    const/16 v16, 0xc

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v11, v0

    invoke-direct/range {v11 .. v17}, Lu/a;-><init>(Ljava/lang/Object;Lu/x0;Ljava/lang/Object;Ljava/lang/String;ILy7/k;)V

    invoke-interface {v8, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v11, v0

    check-cast v11, Lu/a;

    invoke-static {v2}, LY0/i;->m(F)LY0/i;

    move-result-object v12

    invoke-interface {v8, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v8, v2}, LV/n;->h(F)Z

    move-result v6

    or-int/2addr v0, v6

    and-int/lit8 v6, v1, 0xe

    xor-int/lit8 v6, v6, 0x6

    const/4 v13, 0x4

    if-le v6, v13, :cond_c

    invoke-interface {v8, v3}, LV/n;->d(Z)Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    and-int/lit8 v6, v1, 0x6

    if-ne v6, v13, :cond_e

    :cond_d
    move v6, v9

    goto :goto_3

    :cond_e
    move v6, v10

    :goto_3
    or-int/2addr v0, v6

    and-int/lit16 v6, v1, 0x380

    xor-int/lit16 v6, v6, 0x180

    const/16 v13, 0x100

    if-le v6, v13, :cond_f

    invoke-interface {v8, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_f
    and-int/lit16 v1, v1, 0x180

    if-ne v1, v13, :cond_10

    goto :goto_4

    :cond_10
    move v9, v10

    :cond_11
    :goto_4
    or-int/2addr v0, v9

    invoke-interface {v8, v5}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface/range {p3 .. p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_12

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_13

    :cond_12
    new-instance v9, LS/m$b;

    const/4 v6, 0x0

    move-object v0, v9

    move-object v1, v11

    move/from16 v3, p1

    move-object/from16 v4, p0

    invoke-direct/range {v0 .. v6}, LS/m$b;-><init>(Lu/a;FZLS/m;Lz/i;Lm7/e;)V

    invoke-interface {v8, v9}, LV/n;->K(Ljava/lang/Object;)V

    move-object v1, v9

    :cond_13
    check-cast v1, Lx7/p;

    invoke-static {v12, v1, v8, v10}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-virtual {v11}, Lu/a;->g()LV/G1;

    move-result-object v0

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-static {}, LV/q;->P()V

    :cond_14
    return-object v0
.end method


# virtual methods
.method public final e(ZLz/j;LV/n;I)LV/G1;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:930)"

    const v2, -0x79e5feb9

    invoke-static {v2, p4, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit16 p4, p4, 0x3fe

    invoke-direct {p0, p1, p2, p3, p4}, LS/m;->d(ZLz/j;LV/n;I)LV/G1;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    instance-of v2, p1, LS/m;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget v2, p0, LS/m;->a:F

    check-cast p1, LS/m;

    iget v3, p1, LS/m;->a:F

    invoke-static {v2, v3}, LY0/i;->s(FF)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget v2, p0, LS/m;->b:F

    iget v3, p1, LS/m;->b:F

    invoke-static {v2, v3}, LY0/i;->s(FF)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget v2, p0, LS/m;->c:F

    iget v3, p1, LS/m;->c:F

    invoke-static {v2, v3}, LY0/i;->s(FF)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget v2, p0, LS/m;->d:F

    iget v3, p1, LS/m;->d:F

    invoke-static {v2, v3}, LY0/i;->s(FF)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget v2, p0, LS/m;->e:F

    iget p1, p1, LS/m;->e:F

    invoke-static {v2, p1}, LY0/i;->s(FF)Z

    move-result p1

    if-nez p1, :cond_6

    return v1

    :cond_6
    return v0

    :cond_7
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LS/m;->a:F

    invoke-static {v0}, LY0/i;->t(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LS/m;->b:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LS/m;->c:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LS/m;->d:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LS/m;->e:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
