.class final LS/g1$c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/g1$c;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:Lx7/p;

.field final synthetic F:Lx7/q;


# direct methods
.method constructor <init>(Lx7/p;Lx7/p;Lx7/q;)V
    .locals 0

    iput-object p1, p0, LS/g1$c$a;->D:Lx7/p;

    iput-object p2, p0, LS/g1$c$a;->E:Lx7/p;

    iput-object p3, p0, LS/g1$c$a;->F:Lx7/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/j0;J)LD0/K;
    .locals 20

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v12, p1

    invoke-static/range {p2 .. p3}, LY0/b;->l(J)I

    move-result v13

    sget-object v1, LS/h1;->C:LS/h1;

    iget-object v2, v0, LS/g1$c$a;->D:Lx7/p;

    invoke-interface {v12, v1, v2}, LD0/j0;->c1(Ljava/lang/Object;Lx7/p;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    new-instance v5, Ly7/M;

    invoke-direct {v5}, Ly7/M;-><init>()V

    if-lez v2, :cond_0

    div-int v3, v13, v2

    iput v3, v5, Ly7/M;->C:I

    :cond_0
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    move v7, v3

    :goto_0
    if-ge v7, v6, :cond_1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LD0/G;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    iget v9, v5, Ly7/M;->C:I

    invoke-interface {v8, v9}, LD0/n;->t(I)I

    move-result v8

    invoke-static {v8, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v11

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    move v7, v3

    :goto_1
    if-ge v7, v6, :cond_2

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LD0/G;

    iget v9, v5, Ly7/M;->C:I

    move-wide/from16 v14, p2

    move/from16 v16, v9

    move/from16 v17, v9

    move/from16 v18, v11

    move/from16 v19, v11

    invoke-static/range {v14 .. v19}, LY0/b;->c(JIIII)J

    move-result-wide v9

    invoke-interface {v8, v9, v10}, LD0/G;->U(J)LD0/X;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    :goto_2
    if-ge v3, v2, :cond_3

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LD0/G;

    invoke-interface {v6, v11}, LD0/n;->T(I)I

    move-result v6

    iget v7, v5, Ly7/M;->C:I

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-interface {v12, v6}, LY0/e;->o0(I)F

    move-result v6

    invoke-static {}, LS/d1;->m()F

    move-result v7

    const/4 v8, 0x2

    int-to-float v8, v8

    mul-float/2addr v7, v8

    invoke-static {v7}, LY0/i;->q(F)F

    move-result v7

    sub-float/2addr v6, v7

    invoke-static {v6}, LY0/i;->q(F)F

    move-result v6

    invoke-static {v6}, LY0/i;->m(F)LY0/i;

    move-result-object v6

    const/16 v7, 0x18

    int-to-float v7, v7

    invoke-static {v7}, LY0/i;->q(F)F

    move-result v7

    invoke-static {v7}, LY0/i;->m(F)LY0/i;

    move-result-object v7

    invoke-static {v6, v7}, Ll7/a;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, LY0/i;

    invoke-virtual {v6}, LY0/i;->v()F

    move-result v6

    new-instance v7, LS/e1;

    iget v8, v5, Ly7/M;->C:I

    invoke-interface {v12, v8}, LY0/e;->o0(I)F

    move-result v8

    int-to-float v9, v3

    mul-float/2addr v8, v9

    invoke-static {v8}, LY0/i;->q(F)F

    move-result v8

    iget v9, v5, Ly7/M;->C:I

    invoke-interface {v12, v9}, LY0/e;->o0(I)F

    move-result v9

    const/4 v14, 0x0

    invoke-direct {v7, v8, v9, v6, v14}, LS/e1;-><init>(FFFLy7/k;)V

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    new-instance v14, LS/g1$c$a$a;

    iget-object v6, v0, LS/g1$c$a;->E:Lx7/p;

    iget-object v9, v0, LS/g1$c$a;->F:Lx7/q;

    move-object v1, v14

    move-object v2, v4

    move-object/from16 v3, p1

    move-object v4, v6

    move-wide/from16 v6, p2

    move v8, v11

    move v15, v11

    move v11, v13

    invoke-direct/range {v1 .. v11}, LS/g1$c$a$a;-><init>(Ljava/util/List;LD0/j0;Lx7/p;Ly7/M;JILx7/q;Ljava/util/List;I)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    move v2, v13

    move v3, v15

    move-object v5, v14

    invoke-static/range {v1 .. v7}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LD0/j0;

    check-cast p2, LY0/b;

    invoke-virtual {p2}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LS/g1$c$a;->a(LD0/j0;J)LD0/K;

    move-result-object p1

    return-object p1
.end method
