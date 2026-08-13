.class final Landroidx/compose/foundation/f;
.super Landroidx/compose/foundation/a;
.source "SourceFile"

# interfaces
.implements LF0/v0;


# instance fields
.field private l0:Ljava/lang/String;

.field private m0:Lx7/a;

.field private n0:Lx7/a;


# direct methods
.method private constructor <init>(Lx7/a;Ljava/lang/String;Lx7/a;Lx7/a;Lz/l;Lv/I;ZLjava/lang/String;LK0/h;)V
    .locals 9

    move-object v8, p0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p5

    move-object v2, p6

    move/from16 v3, p7

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move-object v6, p1

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/a;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ly7/k;)V

    move-object v0, p2

    iput-object v0, v8, Landroidx/compose/foundation/f;->l0:Ljava/lang/String;

    move-object v0, p3

    iput-object v0, v8, Landroidx/compose/foundation/f;->m0:Lx7/a;

    move-object v0, p4

    iput-object v0, v8, Landroidx/compose/foundation/f;->n0:Lx7/a;

    return-void
.end method

.method public synthetic constructor <init>(Lx7/a;Ljava/lang/String;Lx7/a;Lx7/a;Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p9}, Landroidx/compose/foundation/f;-><init>(Lx7/a;Ljava/lang/String;Lx7/a;Lx7/a;Lz/l;Lv/I;ZLjava/lang/String;LK0/h;)V

    return-void
.end method

.method public static final synthetic s2(Landroidx/compose/foundation/f;)Lx7/a;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/f;->n0:Lx7/a;

    return-object p0
.end method

.method public static final synthetic t2(Landroidx/compose/foundation/f;)Lx7/a;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/f;->m0:Lx7/a;

    return-object p0
.end method


# virtual methods
.method public f2(LK0/w;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/f;->m0:Lx7/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/f;->l0:Ljava/lang/String;

    new-instance v1, Landroidx/compose/foundation/f$a;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/f$a;-><init>(Landroidx/compose/foundation/f;)V

    invoke-static {p1, v0, v1}, LK0/u;->y(LK0/w;Ljava/lang/String;Lx7/a;)V

    :cond_0
    return-void
.end method

.method public g2(Lz0/K;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-virtual {p0}, Landroidx/compose/foundation/a;->l2()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/f;->n0:Lx7/a;

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/compose/foundation/f$b;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/f$b;-><init>(Landroidx/compose/foundation/f;)V

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {p0}, Landroidx/compose/foundation/a;->l2()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/f;->m0:Lx7/a;

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/compose/foundation/f$c;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/f$c;-><init>(Landroidx/compose/foundation/f;)V

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    new-instance v5, Landroidx/compose/foundation/f$d;

    invoke-direct {v5, p0, v1}, Landroidx/compose/foundation/f$d;-><init>(Landroidx/compose/foundation/f;Lm7/e;)V

    new-instance v6, Landroidx/compose/foundation/f$e;

    invoke-direct {v6, p0}, Landroidx/compose/foundation/f$e;-><init>(Landroidx/compose/foundation/f;)V

    move-object v2, p1

    move-object v7, p2

    invoke-static/range {v2 .. v7}, Lx/D;->i(Lz0/K;Lx7/l;Lx7/l;Lx7/q;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public u2(Lx7/a;Ljava/lang/String;Lx7/a;Lx7/a;Lz/l;Lv/I;ZLjava/lang/String;LK0/h;)V
    .locals 9

    .prologue
    move-object v7, p0

    move-object v0, p2

    move-object v1, p3

    move-object v2, p4

    iget-object v3, v7, Landroidx/compose/foundation/f;->l0:Ljava/lang/String;

    invoke-static {v3, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    iput-object v0, v7, Landroidx/compose/foundation/f;->l0:Ljava/lang/String;

    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    :cond_0
    iget-object v0, v7, Landroidx/compose/foundation/f;->m0:Lx7/a;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_0
    if-nez v1, :cond_2

    move v5, v3

    goto :goto_1

    :cond_2
    move v5, v4

    :goto_1
    if-eq v0, v5, :cond_3

    invoke-virtual {p0}, Landroidx/compose/foundation/a;->i2()V

    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    move v0, v3

    goto :goto_2

    :cond_3
    move v0, v4

    :goto_2
    iput-object v1, v7, Landroidx/compose/foundation/f;->m0:Lx7/a;

    iget-object v1, v7, Landroidx/compose/foundation/f;->n0:Lx7/a;

    if-nez v1, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    move v1, v4

    :goto_3
    if-nez v2, :cond_5

    move v4, v3

    :cond_5
    if-eq v1, v4, :cond_6

    move v0, v3

    :cond_6
    iput-object v2, v7, Landroidx/compose/foundation/f;->n0:Lx7/a;

    invoke-virtual {p0}, Landroidx/compose/foundation/a;->l2()Z

    move-result v1

    move/from16 v4, p7

    if-eq v1, v4, :cond_7

    move v8, v3

    goto :goto_4

    :cond_7
    move v8, v0

    :goto_4
    move-object v0, p0

    move-object v1, p5

    move-object v2, p6

    move/from16 v3, p7

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move-object v6, p1

    invoke-virtual/range {v0 .. v6}, Landroidx/compose/foundation/a;->r2(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;)V

    if-eqz v8, :cond_8

    invoke-virtual {p0}, Landroidx/compose/foundation/a;->p2()Li7/M;

    :cond_8
    return-void
.end method
