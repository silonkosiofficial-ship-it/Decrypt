.class final LS/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/b;->b(FFLx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F


# direct methods
.method constructor <init>(FF)V
    .locals 0

    iput p1, p0, LS/b$c;->a:F

    iput p2, p0, LS/b$c;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final d(Ljava/util/List;Ly7/M;LD0/M;FJLD0/X;)Z
    .locals 0

    .prologue
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_1

    iget p0, p1, Ly7/M;->C:I

    invoke-interface {p2, p3}, LY0/e;->S0(F)I

    move-result p1

    add-int/2addr p0, p1

    invoke-virtual {p6}, LD0/X;->I0()I

    move-result p1

    add-int/2addr p0, p1

    invoke-static {p4, p5}, LY0/b;->l(J)I

    move-result p1

    if-gt p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static final f(Ljava/util/List;Ly7/M;LD0/M;FLjava/util/List;Ljava/util/List;Ly7/M;Ljava/util/List;Ly7/M;Ly7/M;)V
    .locals 1

    .prologue
    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget v0, p1, Ly7/M;->C:I

    invoke-interface {p2, p3}, LY0/e;->S0(F)I

    move-result p2

    add-int/2addr v0, p2

    iput v0, p1, Ly7/M;->C:I

    :cond_0
    move-object p2, p4

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    const/4 p3, 0x0

    invoke-interface {p0, p3, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    check-cast p5, Ljava/util/Collection;

    iget p0, p6, Ly7/M;->C:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p5, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    check-cast p7, Ljava/util/Collection;

    iget p0, p1, Ly7/M;->C:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p7, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget p0, p1, Ly7/M;->C:I

    iget p2, p6, Ly7/M;->C:I

    add-int/2addr p0, p2

    iput p0, p1, Ly7/M;->C:I

    iget p0, p8, Ly7/M;->C:I

    iget p1, p9, Ly7/M;->C:I

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    iput p0, p8, Ly7/M;->C:I

    invoke-interface {p4}, Ljava/util/List;->clear()V

    iput p3, p9, Ly7/M;->C:I

    iput p3, p6, Ly7/M;->C:I

    return-void
.end method


# virtual methods
.method public synthetic a(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->b(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final b(LD0/M;Ljava/util/List;J)LD0/K;
    .locals 24

    .prologue
    move-object/from16 v0, p0

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ly7/M;

    invoke-direct {v14}, Ly7/M;-><init>()V

    new-instance v15, Ly7/M;

    invoke-direct {v15}, Ly7/M;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ly7/M;

    invoke-direct {v9}, Ly7/M;-><init>()V

    new-instance v8, Ly7/M;

    invoke-direct {v8}, Ly7/M;-><init>()V

    iget v7, v0, LS/b$c;->a:F

    iget v5, v0, LS/b$c;->b:F

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v6

    const/4 v1, 0x0

    move v4, v1

    :goto_0
    if-ge v4, v6, :cond_2

    move-object/from16 v3, p2

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD0/G;

    move-object/from16 v16, v13

    move-object/from16 v17, v14

    move-wide/from16 v13, p3

    invoke-interface {v1, v13, v14}, LD0/G;->U(J)LD0/X;

    move-result-object v2

    move-object v1, v10

    move-object/from16 v18, v2

    move-object v2, v9

    move-object/from16 v3, p1

    move/from16 v19, v4

    move v4, v7

    move/from16 v20, v5

    move/from16 v21, v6

    move-wide/from16 v5, p3

    move v13, v7

    move-object/from16 v7, v18

    invoke-static/range {v1 .. v7}, LS/b$c;->d(Ljava/util/List;Ly7/M;LD0/M;FJLD0/X;)Z

    move-result v1

    if-nez v1, :cond_0

    move-object v1, v11

    move-object v2, v15

    move-object/from16 v3, p1

    move/from16 v4, v20

    move-object v5, v10

    move-object v6, v12

    move-object v7, v8

    move-object v14, v8

    move-object/from16 v8, v16

    move-object/from16 v22, v9

    move-object/from16 v9, v17

    move-object/from16 v23, v10

    move-object/from16 v10, v22

    invoke-static/range {v1 .. v10}, LS/b$c;->f(Ljava/util/List;Ly7/M;LD0/M;FLjava/util/List;Ljava/util/List;Ly7/M;Ljava/util/List;Ly7/M;Ly7/M;)V

    goto :goto_1

    :cond_0
    move-object v14, v8

    move-object/from16 v22, v9

    move-object/from16 v23, v10

    :goto_1
    invoke-interface/range {v23 .. v23}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    move-object/from16 v10, v22

    iget v1, v10, Ly7/M;->C:I

    move-object/from16 v9, p1

    invoke-interface {v9, v13}, LY0/e;->S0(F)I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v10, Ly7/M;->C:I

    :goto_2
    move-object/from16 v1, v18

    move-object/from16 v5, v23

    goto :goto_3

    :cond_1
    move-object/from16 v9, p1

    move-object/from16 v10, v22

    goto :goto_2

    :goto_3
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget v2, v10, Ly7/M;->C:I

    invoke-virtual {v1}, LD0/X;->I0()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v10, Ly7/M;->C:I

    iget v2, v14, Ly7/M;->C:I

    invoke-virtual {v1}, LD0/X;->w0()I

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v14, Ly7/M;->C:I

    add-int/lit8 v4, v19, 0x1

    move-object v9, v10

    move v7, v13

    move-object v8, v14

    move-object/from16 v13, v16

    move-object/from16 v14, v17

    move/from16 v6, v21

    move-object v10, v5

    move/from16 v5, v20

    goto/16 :goto_0

    :cond_2
    move-object v5, v10

    move-object/from16 v16, v13

    move-object/from16 v17, v14

    move-object v14, v8

    move-object v10, v9

    move-object/from16 v9, p1

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_3

    iget v4, v0, LS/b$c;->b:F

    move-object v1, v11

    move-object v2, v15

    move-object/from16 v3, p1

    move-object v6, v12

    move-object v7, v14

    move-object/from16 v8, v16

    move-object/from16 v9, v17

    invoke-static/range {v1 .. v10}, LS/b$c;->f(Ljava/util/List;Ly7/M;LD0/M;FLjava/util/List;Ljava/util/List;Ly7/M;Ljava/util/List;Ly7/M;Ly7/M;)V

    :cond_3
    move-object/from16 v1, v17

    iget v1, v1, Ly7/M;->C:I

    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v7

    iget v1, v15, Ly7/M;->C:I

    invoke-static/range {p3 .. p4}, LY0/b;->m(J)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v8

    new-instance v9, LS/b$c$a;

    iget v4, v0, LS/b$c;->a:F

    move-object v1, v9

    move-object v2, v11

    move-object/from16 v3, p1

    move v5, v7

    move-object/from16 v6, v16

    invoke-direct/range {v1 .. v6}, LS/b$c$a;-><init>(Ljava/util/List;LD0/M;FILjava/util/List;)V

    const/4 v1, 0x4

    const/4 v10, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, p1

    move v3, v7

    move v4, v8

    move-object v6, v9

    move v7, v1

    move-object v8, v10

    invoke-static/range {v2 .. v8}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v1

    return-object v1
.end method

.method public synthetic c(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->d(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public synthetic e(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->c(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public synthetic j(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->a(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method
