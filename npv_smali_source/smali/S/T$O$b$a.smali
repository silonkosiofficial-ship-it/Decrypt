.class final LS/T$O$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T$O$b;->a(LC/E;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LE7/i;

.field final synthetic E:LC/K;

.field final synthetic F:LW8/N;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:I

.field final synthetic J:I

.field final synthetic K:Lx7/l;

.field final synthetic L:LS/P0;

.field final synthetic M:LS/M;


# direct methods
.method constructor <init>(LE7/i;LC/K;LW8/N;Ljava/lang/String;Ljava/lang/String;IILx7/l;LS/P0;LS/M;)V
    .locals 0

    iput-object p1, p0, LS/T$O$b$a;->D:LE7/i;

    iput-object p2, p0, LS/T$O$b$a;->E:LC/K;

    iput-object p3, p0, LS/T$O$b$a;->F:LW8/N;

    iput-object p4, p0, LS/T$O$b$a;->G:Ljava/lang/String;

    iput-object p5, p0, LS/T$O$b$a;->H:Ljava/lang/String;

    iput p6, p0, LS/T$O$b$a;->I:I

    iput p7, p0, LS/T$O$b$a;->J:I

    iput-object p8, p0, LS/T$O$b$a;->K:Lx7/l;

    iput-object p9, p0, LS/T$O$b$a;->L:LS/P0;

    iput-object p10, p0, LS/T$O$b$a;->M:LS/M;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LC/o;ILV/n;I)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    move/from16 v3, p2

    move-object/from16 v9, p3

    const/4 v7, 0x1

    const/4 v8, 0x0

    and-int/lit8 v1, p4, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_1

    invoke-interface {v9, v3}, LV/n;->i(I)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p4

    :goto_1
    and-int/lit16 v4, v1, 0x91

    const/16 v5, 0x90

    if-ne v4, v5, :cond_3

    invoke-interface/range {p3 .. p3}, LV/n;->u()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p3 .. p3}, LV/n;->A()V

    goto/16 :goto_8

    :cond_3
    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2034)"

    const v6, 0x3e06a802

    invoke-static {v6, v1, v4, v5}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v4, v0, LS/T$O$b$a;->D:LE7/i;

    invoke-virtual {v4}, LE7/g;->f()I

    move-result v4

    add-int v6, v3, v4

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v10, v6

    invoke-static/range {v10 .. v15}, LS/p;->c(IIIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    sget-object v4, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v5, LU/f;->a:LU/f;

    invoke-virtual {v5}, LU/f;->x()F

    move-result v11

    invoke-virtual {v5}, LU/f;->w()F

    move-result v5

    invoke-static {v4, v11, v5}, Landroidx/compose/foundation/layout/p;->l(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;

    move-result-object v11

    iget-object v4, v0, LS/T$O$b$a;->E:LC/K;

    invoke-interface {v9, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v1, v1, 0x70

    if-ne v1, v2, :cond_5

    move v1, v7

    goto :goto_3

    :cond_5
    move v1, v8

    :goto_3
    or-int/2addr v1, v4

    iget-object v2, v0, LS/T$O$b$a;->F:LW8/N;

    invoke-interface {v9, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LS/T$O$b$a;->G:Ljava/lang/String;

    invoke-interface {v9, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LS/T$O$b$a;->H:Ljava/lang/String;

    invoke-interface {v9, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LS/T$O$b$a;->E:LC/K;

    iget-object v4, v0, LS/T$O$b$a;->F:LW8/N;

    iget-object v5, v0, LS/T$O$b$a;->G:Ljava/lang/String;

    iget-object v12, v0, LS/T$O$b$a;->H:Ljava/lang/String;

    invoke-interface/range {p3 .. p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v13

    if-nez v1, :cond_7

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v13, v1, :cond_6

    goto :goto_4

    :cond_6
    move v14, v6

    goto :goto_5

    :cond_7
    :goto_4
    new-instance v13, LS/T$O$b$a$a;

    move-object v1, v13

    move/from16 v3, p2

    move v14, v6

    move-object v6, v12

    invoke-direct/range {v1 .. v6}, LS/T$O$b$a$a;-><init>(LC/K;ILW8/N;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v9, v13}, LV/n;->K(Ljava/lang/Object;)V

    :goto_5
    check-cast v13, Lx7/l;

    const/4 v1, 0x0

    invoke-static {v11, v8, v13, v7, v1}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    iget v2, v0, LS/T$O$b$a;->I:I

    if-ne v14, v2, :cond_8

    move v2, v7

    goto :goto_6

    :cond_8
    move v2, v8

    :goto_6
    iget v3, v0, LS/T$O$b$a;->J:I

    if-ne v14, v3, :cond_9

    move v3, v7

    goto :goto_7

    :cond_9
    move v3, v8

    :goto_7
    iget-object v4, v0, LS/T$O$b$a;->K:Lx7/l;

    invoke-interface {v9, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v9, v14}, LV/n;->i(I)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, LS/T$O$b$a;->K:Lx7/l;

    invoke-interface/range {p3 .. p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_a

    sget-object v4, LV/n;->a:LV/n$a;

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_b

    :cond_a
    new-instance v6, LS/T$O$b$a$b;

    invoke-direct {v6, v5, v14}, LS/T$O$b$a$b;-><init>(Lx7/l;I)V

    invoke-interface {v9, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v4, v6

    check-cast v4, Lx7/a;

    iget-object v5, v0, LS/T$O$b$a;->L:LS/P0;

    invoke-interface {v5, v14}, LS/P0;->b(I)Z

    move-result v5

    sget-object v6, LT/x;->a:LT/x$a;

    sget v6, LS/C0;->k:I

    invoke-static {v6}, LT/x;->a(I)I

    move-result v6

    invoke-static {v6, v9, v8}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v6

    new-array v11, v7, [Ljava/lang/Object;

    aput-object v10, v11, v8

    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "format(this, *args)"

    invoke-static {v6, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v0, LS/T$O$b$a;->M:LS/M;

    new-instance v11, LS/T$O$b$a$c;

    invoke-direct {v11, v10}, LS/T$O$b$a$c;-><init>(Ljava/lang/String;)V

    const/16 v10, 0x36

    const v12, 0x34952493

    invoke-static {v12, v7, v11, v9, v10}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v10

    const/high16 v11, 0xc00000

    move-object v7, v8

    move-object v8, v10

    move-object/from16 v9, p3

    move v10, v11

    invoke-static/range {v1 .. v10}, LS/T;->x(Landroidx/compose/ui/d;ZZLx7/a;ZLjava/lang/String;LS/M;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, LV/q;->P()V

    :cond_c
    :goto_8
    return-void
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LC/o;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LV/n;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LS/T$O$b$a;->a(LC/o;ILV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
