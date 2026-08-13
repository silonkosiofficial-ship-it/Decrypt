.class final LS/f$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/f;->g(Landroidx/compose/ui/d;LS/N0;JJJLx7/p;LM0/P;FLA/b$m;LA/b$e;IZLx7/p;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LS/N0;

.field final synthetic b:LA/b$e;

.field final synthetic c:LA/b$m;

.field final synthetic d:I


# direct methods
.method constructor <init>(LS/N0;LA/b$e;LA/b$m;I)V
    .locals 0

    iput-object p1, p0, LS/f$p;->a:LS/N0;

    iput-object p2, p0, LS/f$p;->b:LA/b$e;

    iput-object p3, p0, LS/f$p;->c:LA/b$m;

    iput p4, p0, LS/f$p;->d:I

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
    .locals 25

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const-string v5, "Collection contains no element matching the predicate."

    if-ge v4, v2, :cond_9

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LD0/G;

    invoke-static {v6}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "navigationIcon"

    invoke-static {v7, v8}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-wide/from16 v8, p3

    invoke-static/range {v8 .. v15}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v7

    invoke-interface {v6, v7, v8}, LD0/G;->U(J)LD0/X;

    move-result-object v10

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_7

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LD0/G;

    invoke-static {v6}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "actionIcons"

    invoke-static {v7, v8}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-wide/from16 v11, p3

    invoke-static/range {v11 .. v18}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v7

    invoke-interface {v6, v7, v8}, LD0/G;->U(J)LD0/X;

    move-result-object v16

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v2

    const v4, 0x7fffffff

    if-ne v2, v4, :cond_0

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v2

    :goto_2
    move/from16 v20, v2

    goto :goto_3

    :cond_0
    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v2

    invoke-virtual {v10}, LD0/X;->I0()I

    move-result v6

    sub-int/2addr v2, v6

    invoke-virtual/range {v16 .. v16}, LD0/X;->I0()I

    move-result v6

    sub-int/2addr v2, v6

    invoke-static {v2, v3}, LE7/j;->d(II)I

    move-result v2

    goto :goto_2

    :goto_3
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    move v6, v3

    :goto_4
    if-ge v6, v2, :cond_5

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LD0/G;

    invoke-static {v7}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "title"

    invoke-static {v8, v9}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v23, 0xc

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-wide/from16 v17, p3

    invoke-static/range {v17 .. v24}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v1

    invoke-interface {v7, v1, v2}, LD0/G;->U(J)LD0/X;

    move-result-object v12

    invoke-static {}, LD0/b;->b()LD0/m;

    move-result-object v1

    invoke-interface {v12, v1}, LD0/O;->Q(LD0/a;)I

    move-result v1

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_1

    invoke-static {}, LD0/b;->b()LD0/m;

    move-result-object v1

    invoke-interface {v12, v1}, LD0/O;->Q(LD0/a;)I

    move-result v1

    move/from16 v20, v1

    goto :goto_5

    :cond_1
    move/from16 v20, v3

    :goto_5
    iget-object v1, v0, LS/f$p;->a:LS/N0;

    invoke-interface {v1}, LS/N0;->a()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_6

    :cond_2
    invoke-static {v1}, LA7/a;->d(F)I

    move-result v3

    :goto_6
    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v1

    if-ne v1, v4, :cond_3

    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v1

    :goto_7
    move v4, v1

    goto :goto_8

    :cond_3
    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v1

    add-int/2addr v1, v3

    goto :goto_7

    :goto_8
    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v3

    new-instance v6, LS/f$p$a;

    iget-object v13, v0, LS/f$p;->b:LA/b$e;

    iget-object v1, v0, LS/f$p;->c:LA/b$m;

    iget v2, v0, LS/f$p;->d:I

    move-object v9, v6

    move v11, v4

    move-wide/from16 v14, p3

    move-object/from16 v17, p1

    move-object/from16 v18, v1

    move/from16 v19, v2

    invoke-direct/range {v9 .. v20}, LS/f$p$a;-><init>(LD0/X;ILD0/X;LA/b$e;JLD0/X;LD0/M;LA/b$m;II)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v1

    return-object v1

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_4

    :cond_5
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_7
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_9
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1, v5}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

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
