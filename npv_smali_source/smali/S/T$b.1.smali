.class final LS/T$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->a(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;LS/M;LM0/P;FLx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:Lx7/p;

.field final synthetic F:Lx7/p;

.field final synthetic G:LS/M;

.field final synthetic H:LM0/P;


# direct methods
.method constructor <init>(Lx7/p;Lx7/p;Lx7/p;LS/M;LM0/P;)V
    .locals 0

    iput-object p1, p0, LS/T$b;->D:Lx7/p;

    iput-object p2, p0, LS/T$b;->E:Lx7/p;

    iput-object p3, p0, LS/T$b;->F:Lx7/p;

    iput-object p4, p0, LS/T$b;->G:LS/M;

    iput-object p5, p0, LS/T$b;->H:LM0/P;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 17

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v8, p1

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

    goto/16 :goto_6

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1326)"

    const v4, -0xda65ed2

    invoke-static {v4, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/layout/p;->f(Landroidx/compose/ui/d;FILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v5

    iget-object v6, v0, LS/T$b;->D:Lx7/p;

    iget-object v7, v0, LS/T$b;->E:Lx7/p;

    iget-object v9, v0, LS/T$b;->F:Lx7/p;

    iget-object v10, v0, LS/T$b;->G:LS/M;

    iget-object v11, v0, LS/T$b;->H:LM0/P;

    sget-object v12, LA/b;->a:LA/b;

    invoke-virtual {v12}, LA/b;->g()LA/b$m;

    move-result-object v13

    sget-object v14, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v14}, Lh0/c$a;->k()Lh0/c$b;

    move-result-object v15

    const/4 v2, 0x0

    invoke-static {v13, v15, v8, v2}, LA/i;->a(LA/b$m;Lh0/c$b;LV/n;I)LD0/I;

    move-result-object v13

    invoke-static {v8, v2}, LV/k;->a(LV/n;I)I

    move-result v15

    invoke-interface/range {p1 .. p1}, LV/n;->F()LV/z;

    move-result-object v2

    invoke-static {v8, v5}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v5

    sget-object v16, LF0/g;->a:LF0/g$a;

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->a()Lx7/a;

    move-result-object v3

    invoke-interface/range {p1 .. p1}, LV/n;->v()LV/g;

    move-result-object v4

    instance-of v4, v4, LV/g;

    if-nez v4, :cond_3

    invoke-static {}, LV/k;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LV/n;->t()V

    invoke-interface/range {p1 .. p1}, LV/n;->o()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v8, v3}, LV/n;->B(Lx7/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LV/n;->H()V

    :goto_1
    invoke-static/range {p1 .. p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->c()Lx7/p;

    move-result-object v4

    invoke-static {v3, v13, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->e()Lx7/p;

    move-result-object v4

    invoke-static {v3, v2, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v3}, LV/n;->o()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v4, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_6
    invoke-virtual/range {v16 .. v16}, LF0/g$a;->d()Lx7/p;

    move-result-object v2

    invoke-static {v3, v5, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v2, LA/l;->a:LA/l;

    if-eqz v6, :cond_7

    if-eqz v7, :cond_7

    invoke-virtual {v12}, LA/b;->d()LA/b$f;

    move-result-object v2

    :goto_2
    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    goto :goto_3

    :cond_7
    if-eqz v6, :cond_8

    invoke-virtual {v12}, LA/b;->f()LA/b$e;

    move-result-object v2

    goto :goto_2

    :cond_8
    invoke-virtual {v12}, LA/b;->c()LA/b$e;

    move-result-object v2

    goto :goto_2

    :goto_3
    invoke-static {v1, v3, v4, v5}, Landroidx/compose/foundation/layout/p;->f(Landroidx/compose/ui/d;FILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-virtual {v14}, Lh0/c$a;->i()Lh0/c$c;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v2, v3, v8, v4}, LA/I;->b(LA/b$e;Lh0/c$c;LV/n;I)LD0/I;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v8, v3}, LV/k;->a(LV/n;I)I

    move-result v5

    invoke-interface/range {p1 .. p1}, LV/n;->F()LV/z;

    move-result-object v3

    invoke-static {v8, v1}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->a()Lx7/a;

    move-result-object v12

    invoke-interface/range {p1 .. p1}, LV/n;->v()LV/g;

    move-result-object v13

    instance-of v13, v13, LV/g;

    if-nez v13, :cond_9

    invoke-static {}, LV/k;->c()V

    :cond_9
    invoke-interface/range {p1 .. p1}, LV/n;->t()V

    invoke-interface/range {p1 .. p1}, LV/n;->o()Z

    move-result v13

    if-eqz v13, :cond_a

    invoke-interface {v8, v12}, LV/n;->B(Lx7/a;)V

    goto :goto_4

    :cond_a
    invoke-interface/range {p1 .. p1}, LV/n;->H()V

    :goto_4
    invoke-static/range {p1 .. p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v12

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->c()Lx7/p;

    move-result-object v13

    invoke-static {v12, v2, v13}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->e()Lx7/p;

    move-result-object v2

    invoke-static {v12, v3, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v12}, LV/n;->o()Z

    move-result v3

    if-nez v3, :cond_b

    invoke-interface {v12}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v3, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v12, v3}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v12, v3, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_c
    invoke-virtual/range {v16 .. v16}, LF0/g$a;->d()Lx7/p;

    move-result-object v2

    invoke-static {v12, v1, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v1, LA/M;->a:LA/M;

    const v2, -0x4cbb5268

    invoke-interface {v8, v2}, LV/n;->T(I)V

    if-eqz v6, :cond_d

    new-instance v2, LS/T$b$a;

    invoke-direct {v2, v1, v6}, LS/T$b$a;-><init>(LA/L;Lx7/p;)V

    const/16 v1, 0x36

    const v3, -0x39576ef8

    const/4 v5, 0x1

    invoke-static {v3, v5, v2, v8, v1}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v1

    invoke-static {v11, v1, v8, v4}, LS/m1;->a(LM0/P;Lx7/p;LV/n;I)V

    :cond_d
    invoke-interface/range {p1 .. p1}, LV/n;->J()V

    const v1, -0x4cbb32dc

    invoke-interface {v8, v1}, LV/n;->T(I)V

    if-nez v7, :cond_e

    goto :goto_5

    :cond_e
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v8, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_5
    invoke-interface/range {p1 .. p1}, LV/n;->J()V

    invoke-interface/range {p1 .. p1}, LV/n;->Q()V

    const v1, 0x76eb6036

    invoke-interface {v8, v1}, LV/n;->T(I)V

    if-nez v9, :cond_f

    if-nez v6, :cond_f

    if-eqz v7, :cond_10

    :cond_f
    invoke-virtual {v10}, LS/M;->e()J

    move-result-wide v3

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v1 .. v7}, LS/a0;->a(Landroidx/compose/ui/d;FJLV/n;II)V

    :cond_10
    invoke-interface/range {p1 .. p1}, LV/n;->J()V

    invoke-interface/range {p1 .. p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-static {}, LV/q;->P()V

    :cond_11
    :goto_6
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
