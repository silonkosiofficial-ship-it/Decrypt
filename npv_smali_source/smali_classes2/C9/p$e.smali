.class final LC9/p$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC9/p;->g(LC9/v;Ljava/lang/String;Landroidx/compose/ui/d;LE9/a;LC9/O;Lx7/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LV/G1;

.field final synthetic D:LV/G1;

.field final synthetic E:LC9/v;

.field final synthetic F:LE9/a;

.field final synthetic G:LV/q0;

.field final synthetic H:LV/w0;

.field final synthetic I:LV/G1;

.field final synthetic J:Le0/d;

.field final synthetic K:LV/G1;


# direct methods
.method constructor <init>(LV/G1;LC9/O;LV/G1;LC9/v;LE9/a;LV/q0;LV/w0;LV/G1;Le0/d;LV/G1;)V
    .locals 0

    iput-object p1, p0, LC9/p$e;->C:LV/G1;

    iput-object p3, p0, LC9/p$e;->D:LV/G1;

    iput-object p4, p0, LC9/p$e;->E:LC9/v;

    iput-object p5, p0, LC9/p$e;->F:LE9/a;

    iput-object p6, p0, LC9/p$e;->G:LV/q0;

    iput-object p7, p0, LC9/p$e;->H:LV/w0;

    iput-object p8, p0, LC9/p$e;->I:LV/G1;

    iput-object p9, p0, LC9/p$e;->J:Le0/d;

    iput-object p10, p0, LC9/p$e;->K:LV/G1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LV/w0;LV/q0;LV/G1;LV/G1;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, LC9/p$e;->t(LV/w0;LV/q0;LV/G1;LV/G1;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(LE9/a;LC9/v;LV/G1;Landroidx/compose/animation/d;)Lt/k;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LC9/p$e;->p(LE9/a;LC9/v;LV/G1;Landroidx/compose/animation/d;)Lt/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LC9/g;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, LC9/p$e;->s(LC9/g;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(LC9/g;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, LC9/p$e;->y(LC9/g;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(LV/w0;)Lu/g0;
    .locals 0

    invoke-static {p0}, LC9/p$e;->n(LV/w0;)Lu/g0;

    move-result-object p0

    return-object p0
.end method

.method private static final n(LV/w0;)Lu/g0;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lu/g0;

    return-object p0
.end method

.method private static final p(LE9/a;LC9/v;LV/G1;Landroidx/compose/animation/d;)Lt/k;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LC9/v;->b()LC9/i;

    move-result-object v0

    invoke-interface {p3}, Lu/s0$b;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC9/g;

    invoke-virtual {v0, v1}, LC9/i;->a(LC9/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, LC9/p$e;->x(LV/G1;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p3}, Lu/s0$b;->d()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, LC9/g;

    goto :goto_1

    :cond_0
    invoke-interface {p3}, Lu/s0$b;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual {v0}, LC9/g;->h()LE9/a;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    move-object p0, v0

    :goto_2
    invoke-virtual {p1}, LC9/v;->b()LC9/i;

    move-result-object p1

    invoke-interface {p3}, Lu/s0$b;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LC9/g;

    invoke-virtual {p1, p3}, LC9/i;->a(LC9/g;)Z

    move-result p1

    const/4 p3, 0x0

    if-eqz p1, :cond_3

    invoke-static {p2}, LC9/p$e;->x(LV/G1;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_3

    :cond_2
    new-instance p1, Lt/k;

    invoke-interface {p0}, LE9/a;->f()Landroidx/compose/animation/h;

    move-result-object p2

    invoke-interface {p0}, LE9/a;->d()Landroidx/compose/animation/j;

    move-result-object v0

    invoke-interface {p0}, LE9/a;->c()F

    move-result p0

    invoke-direct {p1, p2, v0, p0, p3}, Lt/k;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;FLt/x;)V

    goto :goto_4

    :cond_3
    :goto_3
    new-instance p1, Lt/k;

    invoke-interface {p0}, LE9/a;->e()Landroidx/compose/animation/h;

    move-result-object p2

    invoke-interface {p0}, LE9/a;->b()Landroidx/compose/animation/j;

    move-result-object v0

    invoke-interface {p0}, LE9/a;->a()F

    move-result p0

    invoke-direct {p1, p2, v0, p0, p3}, Lt/k;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;FLt/x;)V

    :goto_4
    return-object p1
.end method

.method private static final s(LC9/g;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LC9/g;->m()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final t(LV/w0;LV/q0;LV/G1;LV/G1;)Z
    .locals 0

    .prologue
    invoke-static {p0}, LC9/p;->x(LV/w0;)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {p1}, LC9/p;->v(LV/q0;)F

    move-result p0

    const/4 p1, 0x0

    cmpg-float p0, p0, p1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, LC9/p;->B(LV/G1;)LC9/g;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p3}, LC9/p;->z(LV/G1;)LC9/g;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LC9/g;->k()LD9/c;

    :cond_1
    const/4 p0, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method private static final x(LV/G1;)Z
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final y(LC9/g;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LC9/g;->m()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/g;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LC9/p$e;->m(LA/g;LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final m(LA/g;LV/n;I)V
    .locals 22

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    const-string v2, "$this$BoxWithConstraints"

    invoke-static {v1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-interface {v10, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v2, v1, 0x13

    const/16 v4, 0x12

    if-ne v2, v4, :cond_3

    invoke-interface/range {p2 .. p2}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LV/n;->A()V

    goto/16 :goto_9

    :cond_3
    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v4, "moe.tlaster.precompose.navigation.NavHost.<anonymous> (NavHost.kt:132)"

    const v5, -0x6a73f5a1

    invoke-static {v5, v1, v2, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v1, v0, LC9/p$e;->C:LV/G1;

    invoke-static {v1}, LC9/p;->A(LV/G1;)LC9/g;

    move-result-object v1

    const v2, -0x6abf4c72

    invoke-interface {v10, v2}, LV/n;->T(I)V

    if-nez v1, :cond_5

    goto/16 :goto_7

    :cond_5
    iget-object v2, v0, LC9/p$e;->D:LV/G1;

    iget-object v4, v0, LC9/p$e;->E:LC9/v;

    iget-object v5, v0, LC9/p$e;->F:LE9/a;

    iget-object v6, v0, LC9/p$e;->G:LV/q0;

    iget-object v7, v0, LC9/p$e;->H:LV/w0;

    iget-object v8, v0, LC9/p$e;->I:LV/G1;

    iget-object v9, v0, LC9/p$e;->J:Le0/d;

    invoke-virtual {v1}, LC9/g;->o()LC9/O;

    const v13, -0x6abf4c84

    invoke-interface {v10, v13}, LV/n;->T(I)V

    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    invoke-static {v7}, LC9/p;->x(LV/w0;)Z

    move-result v13

    invoke-static {v2}, LC9/p;->B(LV/G1;)LC9/g;

    move-result-object v14

    invoke-static {v8}, LC9/p;->z(LV/G1;)LC9/g;

    move-result-object v15

    const v11, -0x24e26efb

    invoke-interface {v10, v11}, LV/n;->T(I)V

    invoke-interface {v10, v13}, LV/n;->d(Z)Z

    move-result v11

    invoke-interface {v10, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-interface {v10, v15}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-interface/range {p2 .. p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_6

    sget-object v11, LV/n;->a:LV/n$a;

    invoke-virtual {v11}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v13, v11, :cond_7

    :cond_6
    new-instance v11, LC9/q;

    invoke-direct {v11, v7, v6, v2, v8}, LC9/q;-><init>(LV/w0;LV/q0;LV/G1;LV/G1;)V

    invoke-static {v11}, LV/v1;->e(Lx7/a;)LV/G1;

    move-result-object v13

    invoke-interface {v10, v13}, LV/n;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v8, v13

    check-cast v8, LV/G1;

    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    invoke-static {v8}, LC9/p$e;->x(LV/G1;)Z

    move-result v11

    const/16 v15, 0x30

    const-string v14, "entry"

    if-eqz v11, :cond_c

    const v11, -0x77651828

    invoke-interface {v10, v11}, LV/n;->T(I)V

    const v11, -0x24e2391c

    invoke-interface {v10, v11}, LV/n;->T(I)V

    invoke-interface {v10, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v11

    invoke-interface/range {p2 .. p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_8

    sget-object v11, LV/n;->a:LV/n$a;

    invoke-virtual {v11}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v13, v11, :cond_9

    :cond_8
    new-instance v11, Lu/g0;

    invoke-direct {v11, v1}, Lu/g0;-><init>(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-static {v11, v1, v3, v1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v13

    invoke-interface {v10, v13}, LV/n;->K(Ljava/lang/Object;)V

    :cond_9
    move-object v1, v13

    check-cast v1, LV/w0;

    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    invoke-static {v6}, LC9/p;->v(LV/q0;)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const v11, -0x24e22164

    invoke-interface {v10, v11}, LV/n;->T(I)V

    invoke-interface {v10, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v11

    invoke-interface {v10, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-interface {v10, v4}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    const/4 v13, 0x0

    invoke-interface {v10, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    or-int v11, v11, v16

    invoke-interface/range {p2 .. p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_b

    sget-object v11, LV/n;->a:LV/n$a;

    invoke-virtual {v11}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v13, v11, :cond_a

    goto :goto_3

    :cond_a
    move-object/from16 v21, v14

    const/4 v12, 0x0

    goto :goto_4

    :cond_b
    :goto_3
    new-instance v11, LC9/p$e$b;

    const/16 v20, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move-object v13, v11

    move-object/from16 v21, v14

    move-object v14, v4

    move-object/from16 v15, v16

    move-object/from16 v16, v6

    move-object/from16 v17, v1

    move-object/from16 v18, v2

    move-object/from16 v19, v7

    invoke-direct/range {v13 .. v20}, LC9/p$e$b;-><init>(LC9/v;Lx/a;LV/q0;LV/w0;LV/G1;LV/w0;Lm7/e;)V

    invoke-interface {v10, v11}, LV/n;->K(Ljava/lang/Object;)V

    :goto_4
    check-cast v13, Lx7/p;

    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    invoke-static {v3, v13, v10, v12}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-static {v1}, LC9/p$e;->n(LV/w0;)Lu/g0;

    move-result-object v1

    sget v2, Lu/g0;->s:I

    const/16 v3, 0x30

    or-int/2addr v2, v3

    move-object/from16 v6, v21

    invoke-static {v1, v6, v10, v2, v12}, Lu/u0;->f(Lu/v0;Ljava/lang/String;LV/n;II)Lu/s0;

    move-result-object v1

    :goto_5
    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    goto :goto_6

    :cond_c
    move-object v6, v14

    move v3, v15

    const/4 v12, 0x0

    const v2, -0x7753a17f

    invoke-interface {v10, v2}, LV/n;->T(I)V

    invoke-static {v1, v6, v10, v3, v12}, Lu/u0;->g(Ljava/lang/Object;Ljava/lang/String;LV/n;II)Lu/s0;

    move-result-object v1

    goto :goto_5

    :goto_6
    const v2, -0x24e18a0a

    invoke-interface {v10, v2}, LV/n;->T(I)V

    invoke-interface {v10, v4}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v10, v8}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v10, v5}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface/range {p2 .. p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_d

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_e

    :cond_d
    new-instance v3, LC9/r;

    invoke-direct {v3, v5, v4, v8}, LC9/r;-><init>(LE9/a;LC9/v;LV/G1;)V

    invoke-interface {v10, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v3, Lx7/l;

    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    const v2, -0x772fa7f4

    invoke-interface {v10, v2}, LV/n;->T(I)V

    const v2, -0x24e07066

    invoke-interface {v10, v2}, LV/n;->T(I)V

    invoke-interface/range {p2 .. p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, LV/n;->a:LV/n$a;

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_f

    new-instance v2, LC9/s;

    invoke-direct {v2}, LC9/s;-><init>()V

    invoke-interface {v10, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_f
    move-object v5, v2

    check-cast v5, Lx7/l;

    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    new-instance v2, LC9/p$e$a;

    invoke-direct {v2, v9}, LC9/p$e$a;-><init>(Le0/d;)V

    const v4, -0x585e9b53

    const/16 v6, 0x36

    const/4 v7, 0x1

    invoke-static {v4, v7, v2, v10, v6}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v8

    const v9, 0x36000

    const/4 v11, 0x5

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v6, v8

    move-object/from16 v7, p2

    move v8, v9

    move v9, v11

    invoke-static/range {v1 .. v9}, Landroidx/compose/animation/a;->b(Lu/s0;Landroidx/compose/ui/d;Lx7/l;Lh0/c;Lx7/l;Lx7/r;LV/n;II)V

    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    sget-object v1, Li7/M;->a:Li7/M;

    :goto_7
    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    iget-object v1, v0, LC9/p$e;->K:LV/G1;

    invoke-static {v1}, LC9/p;->C(LV/G1;)LC9/g;

    move-result-object v1

    if-nez v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, v0, LC9/p$e;->J:Le0/d;

    const v3, -0x24e04b06

    invoke-interface {v10, v3}, LV/n;->T(I)V

    invoke-interface/range {p2 .. p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LV/n;->a:LV/n$a;

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_11

    new-instance v3, LC9/t;

    invoke-direct {v3}, LC9/t;-><init>()V

    invoke-interface {v10, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_11
    move-object v6, v3

    check-cast v6, Lx7/l;

    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    new-instance v3, LC9/p$e$c;

    invoke-direct {v3, v2}, LC9/p$e$c;-><init>(Le0/d;)V

    const v2, 0x7bb122f0

    const/16 v4, 0x36

    const/4 v5, 0x1

    invoke-static {v2, v5, v3, v10, v4}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v7

    const/high16 v9, 0x1b0000

    const/16 v11, 0x1e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v8, p2

    move v10, v11

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/a;->a(Ljava/lang/Object;Landroidx/compose/ui/d;Lx7/l;Lh0/c;Ljava/lang/String;Lx7/l;Lx7/r;LV/n;II)V

    :goto_8
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-static {}, LV/q;->P()V

    :cond_12
    :goto_9
    return-void
.end method
