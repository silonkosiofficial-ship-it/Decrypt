.class final LS/w0$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/w0;->d(Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZLx7/a;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx7/a;

.field final synthetic b:Lx7/p;

.field final synthetic c:Z


# direct methods
.method constructor <init>(Lx7/a;Lx7/p;Z)V
    .locals 0

    iput-object p1, p0, LS/w0$i;->a:Lx7/a;

    iput-object p2, p0, LS/w0$i;->b:Lx7/p;

    iput-boolean p3, p0, LS/w0$i;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .locals 18

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, LS/w0$i;->a:Lx7/a;

    invoke-interface {v3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v9

    const/16 v16, 0xa

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-wide/from16 v10, p3

    invoke-static/range {v10 .. v17}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v3

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v5

    const/4 v7, 0x0

    :goto_0
    const-string v8, "Collection contains no element matching the predicate."

    if-ge v7, v5, :cond_a

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LD0/G;

    invoke-static {v10}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v11

    const-string v12, "icon"

    invoke-static {v11, v12}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-interface {v10, v3, v4}, LD0/G;->U(J)LD0/X;

    move-result-object v5

    invoke-virtual {v5}, LD0/X;->I0()I

    move-result v7

    invoke-static {}, LS/w0;->g()F

    move-result v10

    const/4 v11, 0x2

    int-to-float v11, v11

    mul-float/2addr v10, v11

    invoke-static {v10}, LY0/i;->q(F)F

    move-result v10

    invoke-interface {v1, v10}, LY0/e;->S0(F)I

    move-result v10

    add-int/2addr v7, v10

    int-to-float v10, v7

    mul-float/2addr v10, v9

    invoke-static {v10}, LA7/a;->d(F)I

    move-result v10

    invoke-virtual {v5}, LD0/X;->w0()I

    move-result v12

    invoke-static {}, LS/w0;->j()F

    move-result v13

    mul-float/2addr v13, v11

    invoke-static {v13}, LY0/i;->q(F)F

    move-result v11

    invoke-interface {v1, v11}, LY0/e;->S0(F)I

    move-result v11

    add-int/2addr v12, v11

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v11

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v11, :cond_8

    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LD0/G;

    invoke-static {v14}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v15

    const-string v6, "indicatorRipple"

    invoke-static {v15, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    sget-object v6, LY0/b;->b:LY0/b$a;

    invoke-virtual {v6, v7, v12}, LY0/b$a;->c(II)J

    move-result-wide v6

    invoke-interface {v14, v6, v7}, LD0/G;->U(J)LD0/X;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v7

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v7, :cond_1

    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, LD0/G;

    invoke-static {v15}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v15

    const-string v13, "indicator"

    invoke-static {v15, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    goto :goto_3

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_1
    const/4 v14, 0x0

    :goto_3
    check-cast v14, LD0/G;

    if-eqz v14, :cond_2

    sget-object v7, LY0/b;->b:LY0/b$a;

    invoke-virtual {v7, v10, v12}, LY0/b$a;->c(II)J

    move-result-wide v10

    invoke-interface {v14, v10, v11}, LD0/G;->U(J)LD0/X;

    move-result-object v7

    goto :goto_4

    :cond_2
    const/4 v7, 0x0

    :goto_4
    iget-object v10, v0, LS/w0$i;->b:Lx7/p;

    if-eqz v10, :cond_5

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_5
    if-ge v11, v10, :cond_4

    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LD0/G;

    invoke-static {v12}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v13

    const-string v14, "label"

    invoke-static {v13, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-interface {v12, v3, v4}, LD0/G;->U(J)LD0/X;

    move-result-object v2

    goto :goto_6

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    :cond_4
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1, v8}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    const/4 v2, 0x0

    :goto_6
    iget-object v3, v0, LS/w0$i;->b:Lx7/p;

    if-nez v3, :cond_6

    move-object/from16 v1, p1

    move-object v2, v5

    move-object v3, v6

    move-object v4, v7

    move-wide/from16 v5, p3

    invoke-static/range {v1 .. v6}, LS/w0;->h(LD0/M;LD0/X;LD0/X;LD0/X;J)LD0/K;

    move-result-object v1

    goto :goto_7

    :cond_6
    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-boolean v8, v0, LS/w0$i;->c:Z

    move-object/from16 v1, p1

    move-object v3, v5

    move-object v4, v6

    move-object v5, v7

    move-wide/from16 v6, p3

    invoke-static/range {v1 .. v9}, LS/w0;->i(LD0/M;LD0/X;LD0/X;LD0/X;LD0/X;JZF)LD0/K;

    move-result-object v1

    :goto_7
    return-object v1

    :cond_7
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_1

    :cond_8
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1, v8}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    :cond_a
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1, v8}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
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
