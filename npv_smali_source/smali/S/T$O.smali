.class final LS/T$O;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->o(Landroidx/compose/ui/d;JLx7/l;LS/P0;LT/f;LE7/i;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LT/f;

.field final synthetic E:J

.field final synthetic F:LE7/i;

.field final synthetic G:LS/M;

.field final synthetic H:Landroidx/compose/ui/d;

.field final synthetic I:Lx7/l;

.field final synthetic J:LS/P0;


# direct methods
.method constructor <init>(LT/f;JLE7/i;LS/M;Landroidx/compose/ui/d;Lx7/l;LS/P0;)V
    .locals 0

    iput-object p1, p0, LS/T$O;->D:LT/f;

    iput-wide p2, p0, LS/T$O;->E:J

    iput-object p4, p0, LS/T$O;->F:LE7/i;

    iput-object p5, p0, LS/T$O;->G:LS/M;

    iput-object p6, p0, LS/T$O;->H:Landroidx/compose/ui/d;

    iput-object p7, p0, LS/T$O;->I:Lx7/l;

    iput-object p8, p0, LS/T$O;->J:LS/P0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 24

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move/from16 v1, p2

    const/4 v2, 0x3

    and-int/lit8 v3, v1, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-interface/range {p1 .. p1}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LV/n;->A()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v5, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2005)"

    const v6, 0x4d99a88d    # 3.22245024E8f

    invoke-static {v6, v1, v3, v5}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LS/T$O;->D:LT/f;

    invoke-virtual {v1}, LT/f;->i()LT/e;

    move-result-object v3

    invoke-virtual {v1, v3}, LT/f;->h(LT/e;)LT/j;

    move-result-object v1

    invoke-virtual {v1}, LT/j;->e()I

    move-result v1

    iget-object v3, v0, LS/T$O;->D:LT/f;

    iget-wide v5, v0, LS/T$O;->E:J

    invoke-virtual {v3, v5, v6}, LT/f;->g(J)LT/j;

    move-result-object v3

    invoke-virtual {v3}, LT/j;->e()I

    move-result v3

    iget-object v5, v0, LS/T$O;->F:LE7/i;

    invoke-virtual {v5}, LE7/g;->f()I

    move-result v5

    sub-int v5, v3, v5

    sub-int/2addr v5, v2

    const/4 v6, 0x0

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v5, v6, v11, v6, v4}, LC/L;->b(IILV/n;II)LC/K;

    move-result-object v4

    iget-object v5, v0, LS/T$O;->G:LS/M;

    invoke-virtual {v5}, LS/M;->c()J

    move-result-wide v13

    invoke-interface/range {p1 .. p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    sget-object v7, LV/n;->a:LV/n$a;

    invoke-virtual {v7}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v5, v8, :cond_3

    sget-object v5, Lm7/j;->C:Lm7/j;

    invoke-static {v5, v11}, LV/Q;->h(Lm7/i;LV/n;)LW8/N;

    move-result-object v5

    new-instance v8, LV/C;

    invoke-direct {v8, v5}, LV/C;-><init>(LW8/N;)V

    invoke-interface {v11, v8}, LV/n;->K(Ljava/lang/Object;)V

    move-object v5, v8

    :cond_3
    check-cast v5, LV/C;

    invoke-virtual {v5}, LV/C;->a()LW8/N;

    move-result-object v5

    sget-object v8, LT/x;->a:LT/x$a;

    sget v8, LS/C0;->m:I

    invoke-static {v8}, LT/x;->a(I)I

    move-result v8

    invoke-static {v8, v11, v6}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v8

    sget v9, LS/C0;->n:I

    invoke-static {v9}, LT/x;->a(I)I

    move-result v9

    invoke-static {v9, v11, v6}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v9

    new-instance v10, LC/b$a;

    invoke-direct {v10, v2}, LC/b$a;-><init>(I)V

    iget-object v12, v0, LS/T$O;->H:Landroidx/compose/ui/d;

    const/16 v16, 0x2

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/b;->b(Landroidx/compose/ui/d;JLo0/e2;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v12, LS/T$O$a;->D:LS/T$O$a;

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static {v2, v6, v12, v13, v14}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v6, LA/b;->a:LA/b;

    invoke-virtual {v6}, LA/b;->e()LA/b$f;

    move-result-object v23

    invoke-static {}, LS/T;->D()F

    move-result v12

    invoke-virtual {v6, v12}, LA/b;->n(F)LA/b$f;

    move-result-object v6

    iget-object v12, v0, LS/T$O;->F:LE7/i;

    invoke-interface {v11, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v12

    invoke-interface {v11, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v11, v5}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v11, v8}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v11, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v11, v3}, LV/n;->i(I)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v11, v1}, LV/n;->i(I)Z

    move-result v13

    or-int/2addr v12, v13

    iget-object v13, v0, LS/T$O;->I:Lx7/l;

    invoke-interface {v11, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    iget-object v13, v0, LS/T$O;->J:LS/P0;

    invoke-interface {v11, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    iget-object v13, v0, LS/T$O;->G:LS/M;

    invoke-interface {v11, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    iget-object v13, v0, LS/T$O;->F:LE7/i;

    iget-object v15, v0, LS/T$O;->I:Lx7/l;

    iget-object v14, v0, LS/T$O;->J:LS/P0;

    move-object/from16 p2, v6

    iget-object v6, v0, LS/T$O;->G:LS/M;

    invoke-interface/range {p1 .. p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez v12, :cond_4

    invoke-virtual {v7}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v0, v7, :cond_5

    :cond_4
    new-instance v0, LS/T$O$b;

    move-object v12, v0

    move-object v7, v14

    move-object v14, v4

    move-object/from16 v20, v15

    move-object v15, v5

    move-object/from16 v16, v8

    move-object/from16 v17, v9

    move/from16 v18, v3

    move/from16 v19, v1

    move-object/from16 v21, v7

    move-object/from16 v22, v6

    invoke-direct/range {v12 .. v22}, LS/T$O$b;-><init>(LE7/i;LC/K;LW8/N;Ljava/lang/String;Ljava/lang/String;IILx7/l;LS/P0;LS/M;)V

    invoke-interface {v11, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, Lx7/l;

    const/high16 v12, 0x1b0000

    const/16 v13, 0x198

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, v10

    move-object v3, v4

    move-object v4, v5

    move v5, v6

    move-object/from16 v6, p2

    move-object/from16 v7, v23

    move-object v10, v0

    move-object/from16 v11, p1

    invoke-static/range {v1 .. v13}, LC/h;->a(LC/b;Landroidx/compose/ui/d;LC/K;LA/B;ZLA/b$m;LA/b$e;Lx/p;ZLx7/l;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, LV/q;->P()V

    :cond_6
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$O;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
