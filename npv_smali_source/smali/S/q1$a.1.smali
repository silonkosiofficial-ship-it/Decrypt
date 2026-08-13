.class final LS/q1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->a(Landroidx/compose/ui/d;FLx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F


# direct methods
.method constructor <init>(F)V
    .locals 0

    iput p1, p0, LS/q1$a;->a:F

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
    .locals 19

    .prologue
    move-object/from16 v0, p2

    move-object/from16 v1, p0

    iget v2, v1, LS/q1$a;->a:F

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LY0/e;->B0(F)F

    move-result v10

    const/16 v17, 0xa

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-wide/from16 v11, p3

    invoke-static/range {v11 .. v18}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v4

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    if-ge v8, v6, :cond_1

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, LD0/G;

    invoke-static {v11}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v12

    sget-object v13, LS/l0;->C:LS/l0;

    if-eq v12, v13, :cond_0

    invoke-static {v11}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v11

    sget-object v12, LS/l0;->D:LS/l0;

    if-eq v11, v12, :cond_0

    invoke-interface {v2, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    move v9, v7

    :goto_1
    if-ge v9, v8, :cond_2

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LD0/G;

    invoke-interface {v11, v4, v5}, LD0/G;->U(J)LD0/X;

    move-result-object v11

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    move v8, v7

    :goto_2
    const/4 v9, 0x0

    if-ge v8, v2, :cond_4

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, LD0/G;

    invoke-static {v12}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v12

    sget-object v13, LS/l0;->C:LS/l0;

    if-ne v12, v13, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_4
    move-object v11, v9

    :goto_3
    check-cast v11, LD0/G;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    :goto_4
    if-ge v7, v2, :cond_6

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, LD0/G;

    invoke-static {v12}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v12

    sget-object v13, LS/l0;->D:LS/l0;

    if-ne v12, v13, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_6
    move-object v8, v9

    :goto_5
    check-cast v8, LD0/G;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v0

    int-to-float v0, v0

    const v2, 0x40c90fdb

    div-float v0, v2, v0

    if-eqz v11, :cond_7

    invoke-interface {v11, v4, v5}, LD0/G;->U(J)LD0/X;

    move-result-object v2

    goto :goto_6

    :cond_7
    move-object v2, v9

    :goto_6
    if-eqz v8, :cond_8

    invoke-interface {v8, v4, v5}, LD0/G;->U(J)LD0/X;

    move-result-object v4

    move-object v7, v4

    goto :goto_7

    :cond_8
    move-object v7, v9

    :goto_7
    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v12

    invoke-static/range {p3 .. p4}, LY0/b;->m(J)I

    move-result v13

    new-instance v14, LS/q1$a$a;

    move-object v4, v14

    move-object v5, v2

    move-wide/from16 v8, p3

    move v11, v0

    invoke-direct/range {v4 .. v11}, LS/q1$a$a;-><init>(LD0/X;Ljava/util/List;LD0/X;JFF)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object/from16 v3, p1

    move v4, v12

    move v5, v13

    move-object v7, v14

    invoke-static/range {v3 .. v9}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v0

    return-object v0
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
