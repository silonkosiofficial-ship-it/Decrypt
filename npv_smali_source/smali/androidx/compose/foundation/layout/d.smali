.class public abstract Landroidx/compose/foundation/layout/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/HashMap;

.field private static final b:Ljava/util/HashMap;

.field private static final c:LD0/I;

.field private static final d:LD0/I;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    invoke-static {v0}, Landroidx/compose/foundation/layout/d;->d(Z)Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Landroidx/compose/foundation/layout/d;->a:Ljava/util/HashMap;

    const/4 v0, 0x0

    invoke-static {v0}, Landroidx/compose/foundation/layout/d;->d(Z)Ljava/util/HashMap;

    move-result-object v1

    sput-object v1, Landroidx/compose/foundation/layout/d;->b:Ljava/util/HashMap;

    new-instance v1, Landroidx/compose/foundation/layout/e;

    sget-object v2, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v2}, Lh0/c$a;->o()Lh0/c;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroidx/compose/foundation/layout/e;-><init>(Lh0/c;Z)V

    sput-object v1, Landroidx/compose/foundation/layout/d;->c:LD0/I;

    sget-object v0, Landroidx/compose/foundation/layout/d$b;->a:Landroidx/compose/foundation/layout/d$b;

    sput-object v0, Landroidx/compose/foundation/layout/d;->d:LD0/I;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/d;LV/n;I)V
    .locals 7

    .prologue
    const v0, -0xc96ce69

    invoke-interface {p1, v0}, LV/n;->r(I)LV/n;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LV/n;->A()V

    goto/16 :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.layout.Box (Box.kt:236)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v0, Landroidx/compose/foundation/layout/d;->d:LD0/I;

    const/4 v1, 0x0

    invoke-static {p1, v1}, LV/k;->a(LV/n;I)I

    move-result v1

    invoke-static {p1, p0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    invoke-interface {p1}, LV/n;->F()LV/z;

    move-result-object v3

    sget-object v4, LF0/g;->a:LF0/g$a;

    invoke-virtual {v4}, LF0/g$a;->a()Lx7/a;

    move-result-object v5

    invoke-interface {p1}, LV/n;->v()LV/g;

    move-result-object v6

    instance-of v6, v6, LV/g;

    if-nez v6, :cond_5

    invoke-static {}, LV/k;->c()V

    :cond_5
    invoke-interface {p1}, LV/n;->t()V

    invoke-interface {p1}, LV/n;->o()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {p1, v5}, LV/n;->B(Lx7/a;)V

    goto :goto_3

    :cond_6
    invoke-interface {p1}, LV/n;->H()V

    :goto_3
    invoke-static {p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v5

    invoke-virtual {v4}, LF0/g$a;->c()Lx7/p;

    move-result-object v6

    invoke-static {v5, v0, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->e()Lx7/p;

    move-result-object v0

    invoke-static {v5, v3, v0}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->d()Lx7/p;

    move-result-object v0

    invoke-static {v5, v2, v0}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->b()Lx7/p;

    move-result-object v0

    invoke-interface {v5}, LV/n;->o()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-interface {v5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v1, v0}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_8
    invoke-interface {p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_4
    invoke-interface {p1}, LV/n;->x()LV/e1;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance v0, Landroidx/compose/foundation/layout/d$a;

    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/layout/d$a;-><init>(Landroidx/compose/ui/d;I)V

    invoke-interface {p1, v0}, LV/e1;->a(Lx7/p;)V

    :cond_a
    return-void
.end method

.method public static final synthetic b(LD0/G;)Z
    .locals 0

    invoke-static {p0}, Landroidx/compose/foundation/layout/d;->g(LD0/G;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(LD0/X$a;LD0/X;LD0/G;LY0/v;IILh0/c;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Landroidx/compose/foundation/layout/d;->i(LD0/X$a;LD0/X;LD0/G;LY0/v;IILh0/c;)V

    return-void
.end method

.method private static final d(Z)Ljava/util/HashMap;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sget-object v1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v1}, Lh0/c$a;->o()Lh0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLh0/c;)V

    invoke-virtual {v1}, Lh0/c$a;->m()Lh0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLh0/c;)V

    invoke-virtual {v1}, Lh0/c$a;->n()Lh0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLh0/c;)V

    invoke-virtual {v1}, Lh0/c$a;->h()Lh0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLh0/c;)V

    invoke-virtual {v1}, Lh0/c$a;->e()Lh0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLh0/c;)V

    invoke-virtual {v1}, Lh0/c$a;->f()Lh0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLh0/c;)V

    invoke-virtual {v1}, Lh0/c$a;->d()Lh0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLh0/c;)V

    invoke-virtual {v1}, Lh0/c$a;->b()Lh0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLh0/c;)V

    invoke-virtual {v1}, Lh0/c$a;->c()Lh0/c;

    move-result-object v1

    invoke-static {v0, p0, v1}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLh0/c;)V

    return-object v0
.end method

.method private static final e(Ljava/util/HashMap;ZLh0/c;)V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/e;

    invoke-direct {v0, p2, p1}, Landroidx/compose/foundation/layout/e;-><init>(Lh0/c;Z)V

    invoke-virtual {p0, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final f(LD0/G;)Landroidx/compose/foundation/layout/c;
    .locals 1

    .prologue
    invoke-interface {p0}, LD0/n;->Z()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroidx/compose/foundation/layout/c;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/compose/foundation/layout/c;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final g(LD0/G;)Z
    .locals 0

    .prologue
    invoke-static {p0}, Landroidx/compose/foundation/layout/d;->f(LD0/G;)Landroidx/compose/foundation/layout/c;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/c;->U1()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final h(Lh0/c;Z)LD0/I;
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    sget-object v0, Landroidx/compose/foundation/layout/d;->a:Ljava/util/HashMap;

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/compose/foundation/layout/d;->b:Ljava/util/HashMap;

    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD0/I;

    if-nez v0, :cond_1

    new-instance v0, Landroidx/compose/foundation/layout/e;

    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/layout/e;-><init>(Lh0/c;Z)V

    :cond_1
    return-object v0
.end method

.method private static final i(LD0/X$a;LD0/X;LD0/G;LY0/v;IILh0/c;)V
    .locals 13

    .prologue
    invoke-static {p2}, Landroidx/compose/foundation/layout/d;->f(LD0/G;)Landroidx/compose/foundation/layout/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/c;->T1()Lh0/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object/from16 v1, p6

    :goto_1
    invoke-virtual {p1}, LD0/X;->I0()I

    move-result v0

    invoke-virtual {p1}, LD0/X;->w0()I

    move-result v2

    invoke-static {v0, v2}, LY0/u;->a(II)J

    move-result-wide v2

    invoke-static/range {p4 .. p5}, LY0/u;->a(II)J

    move-result-wide v4

    move-object/from16 v6, p3

    invoke-interface/range {v1 .. v6}, Lh0/c;->a(JJLY0/v;)J

    move-result-wide v8

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v6, p0

    move-object v7, p1

    invoke-static/range {v6 .. v12}, LD0/X$a;->j(LD0/X$a;LD0/X;JFILjava/lang/Object;)V

    return-void
.end method
