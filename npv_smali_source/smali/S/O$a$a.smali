.class final LS/O$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/O$a;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/q;

.field final synthetic E:Lx7/p;

.field final synthetic F:Lx7/p;


# direct methods
.method constructor <init>(Lx7/q;Lx7/p;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LS/O$a$a;->D:Lx7/q;

    iput-object p2, p0, LS/O$a$a;->E:Lx7/p;

    iput-object p3, p0, LS/O$a$a;->F:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LV/n;->A()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:90)"

    const v4, -0x65b2947b

    invoke-static {v4, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, LA/b;->a:LA/b;

    invoke-virtual {v1}, LA/b;->d()LA/b$f;

    move-result-object v1

    iget-object v2, v0, LS/O$a$a;->D:Lx7/q;

    iget-object v3, v0, LS/O$a$a;->E:Lx7/p;

    iget-object v4, v0, LS/O$a$a;->F:Lx7/p;

    sget-object v5, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v6, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v6}, Lh0/c$a;->k()Lh0/c$b;

    move-result-object v8

    const/4 v9, 0x6

    invoke-static {v1, v8, v7, v9}, LA/i;->a(LA/b$m;Lh0/c$b;LV/n;I)LD0/I;

    move-result-object v1

    const/4 v8, 0x0

    invoke-static {v7, v8}, LV/k;->a(LV/n;I)I

    move-result v10

    invoke-interface/range {p1 .. p1}, LV/n;->F()LV/z;

    move-result-object v11

    invoke-static {v7, v5}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v12

    sget-object v13, LF0/g;->a:LF0/g$a;

    invoke-virtual {v13}, LF0/g$a;->a()Lx7/a;

    move-result-object v14

    invoke-interface/range {p1 .. p1}, LV/n;->v()LV/g;

    move-result-object v15

    instance-of v15, v15, LV/g;

    if-nez v15, :cond_3

    invoke-static {}, LV/k;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LV/n;->t()V

    invoke-interface/range {p1 .. p1}, LV/n;->o()Z

    move-result v15

    if-eqz v15, :cond_4

    invoke-interface {v7, v14}, LV/n;->B(Lx7/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LV/n;->H()V

    :goto_1
    invoke-static/range {p1 .. p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v14

    invoke-virtual {v13}, LF0/g$a;->c()Lx7/p;

    move-result-object v15

    invoke-static {v14, v1, v15}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v13}, LF0/g$a;->e()Lx7/p;

    move-result-object v1

    invoke-static {v14, v11, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v13}, LF0/g$a;->b()Lx7/p;

    move-result-object v1

    invoke-interface {v14}, LV/n;->o()Z

    move-result v11

    if-nez v11, :cond_5

    invoke-interface {v14}, LV/n;->g()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v11, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    :cond_5
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v14, v11}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v14, v10, v1}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_6
    invoke-virtual {v13}, LF0/g$a;->d()Lx7/p;

    move-result-object v1

    invoke-static {v14, v12, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v1, LA/l;->a:LA/l;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-interface {v1, v5, v10, v8}, LA/k;->a(Landroidx/compose/ui/d;FZ)Landroidx/compose/ui/d;

    move-result-object v10

    invoke-virtual {v6}, Lh0/c$a;->o()Lh0/c;

    move-result-object v11

    invoke-static {v11, v8}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v11

    invoke-static {v7, v8}, LV/k;->a(LV/n;I)I

    move-result v12

    invoke-interface/range {p1 .. p1}, LV/n;->F()LV/z;

    move-result-object v14

    invoke-static {v7, v10}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v10

    invoke-virtual {v13}, LF0/g$a;->a()Lx7/a;

    move-result-object v15

    invoke-interface/range {p1 .. p1}, LV/n;->v()LV/g;

    move-result-object v8

    instance-of v8, v8, LV/g;

    if-nez v8, :cond_7

    invoke-static {}, LV/k;->c()V

    :cond_7
    invoke-interface/range {p1 .. p1}, LV/n;->t()V

    invoke-interface/range {p1 .. p1}, LV/n;->o()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v7, v15}, LV/n;->B(Lx7/a;)V

    goto :goto_2

    :cond_8
    invoke-interface/range {p1 .. p1}, LV/n;->H()V

    :goto_2
    invoke-static/range {p1 .. p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v8

    invoke-virtual {v13}, LF0/g$a;->c()Lx7/p;

    move-result-object v15

    invoke-static {v8, v11, v15}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v13}, LF0/g$a;->e()Lx7/p;

    move-result-object v11

    invoke-static {v8, v14, v11}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v13}, LF0/g$a;->b()Lx7/p;

    move-result-object v11

    invoke-interface {v8}, LV/n;->o()Z

    move-result v14

    if-nez v14, :cond_9

    invoke-interface {v8}, LV/n;->g()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_a

    :cond_9
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v8, v14}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v8, v12, v11}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_a
    invoke-virtual {v13}, LF0/g$a;->d()Lx7/p;

    move-result-object v11

    invoke-static {v8, v10, v11}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v8, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v2, v1, v7, v8}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, LV/n;->Q()V

    invoke-virtual {v6}, Lh0/c$a;->j()Lh0/c$b;

    move-result-object v2

    invoke-interface {v1, v5, v2}, LA/k;->b(Landroidx/compose/ui/d;Lh0/c$b;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-static {}, LS/O;->d()LA/B;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/m;->h(Landroidx/compose/ui/d;LA/B;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-virtual {v6}, Lh0/c$a;->o()Lh0/c;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v2

    invoke-static {v7, v5}, LV/k;->a(LV/n;I)I

    move-result v5

    invoke-interface/range {p1 .. p1}, LV/n;->F()LV/z;

    move-result-object v6

    invoke-static {v7, v1}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-virtual {v13}, LF0/g$a;->a()Lx7/a;

    move-result-object v8

    invoke-interface/range {p1 .. p1}, LV/n;->v()LV/g;

    move-result-object v10

    instance-of v10, v10, LV/g;

    if-nez v10, :cond_b

    invoke-static {}, LV/k;->c()V

    :cond_b
    invoke-interface/range {p1 .. p1}, LV/n;->t()V

    invoke-interface/range {p1 .. p1}, LV/n;->o()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v7, v8}, LV/n;->B(Lx7/a;)V

    goto :goto_3

    :cond_c
    invoke-interface/range {p1 .. p1}, LV/n;->H()V

    :goto_3
    invoke-static/range {p1 .. p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v8

    invoke-virtual {v13}, LF0/g$a;->c()Lx7/p;

    move-result-object v10

    invoke-static {v8, v2, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v13}, LF0/g$a;->e()Lx7/p;

    move-result-object v2

    invoke-static {v8, v6, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v13}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v8}, LV/n;->o()Z

    move-result v6

    if-nez v6, :cond_d

    invoke-interface {v8}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    :cond_d
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_e
    invoke-virtual {v13}, LF0/g$a;->d()Lx7/p;

    move-result-object v2

    invoke-static {v8, v1, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v1, LU/g;->a:LU/g;

    invoke-virtual {v1}, LU/g;->a()LU/e;

    move-result-object v2

    invoke-static {v2, v7, v9}, LS/A;->h(LU/e;LV/n;I)J

    move-result-wide v5

    invoke-virtual {v1}, LU/g;->b()LU/L;

    move-result-object v1

    invoke-static {v1, v7, v9}, LS/B1;->c(LU/L;LV/n;I)LM0/P;

    move-result-object v8

    new-instance v1, LS/O$a$a$a;

    invoke-direct {v1, v3, v4}, LS/O$a$a$a;-><init>(Lx7/p;Lx7/p;)V

    const/16 v2, 0x36

    const v3, 0x264973ca

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, v7, v2}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v4

    const/16 v9, 0x180

    move-wide v1, v5

    move-object v3, v8

    move-object/from16 v5, p1

    move v6, v9

    invoke-static/range {v1 .. v6}, LT/w;->a(JLM0/P;Lx7/p;LV/n;I)V

    invoke-interface/range {p1 .. p1}, LV/n;->Q()V

    invoke-interface/range {p1 .. p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, LV/q;->P()V

    :cond_f
    :goto_4
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/O$a$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
