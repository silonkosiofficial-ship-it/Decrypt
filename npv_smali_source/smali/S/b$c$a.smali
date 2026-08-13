.class final LS/b$c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/b$c;->b(LD0/M;Ljava/util/List;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/util/List;

.field final synthetic E:LD0/M;

.field final synthetic F:F

.field final synthetic G:I

.field final synthetic H:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;LD0/M;FILjava/util/List;)V
    .locals 0

    iput-object p1, p0, LS/b$c$a;->D:Ljava/util/List;

    iput-object p2, p0, LS/b$c$a;->E:LD0/M;

    iput p3, p0, LS/b$c$a;->F:F

    iput p4, p0, LS/b$c$a;->G:I

    iput-object p5, p0, LS/b$c$a;->H:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 24

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, LS/b$c$a;->D:Ljava/util/List;

    iget-object v8, v0, LS/b$c$a;->E:LD0/M;

    iget v9, v0, LS/b$c$a;->F:F

    iget v10, v0, LS/b$c$a;->G:I

    iget-object v11, v0, LS/b$c$a;->H:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v12

    const/4 v13, 0x0

    move v14, v13

    :goto_0
    if-ge v14, v12, :cond_4

    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/util/List;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v2

    new-array v5, v2, [I

    move v3, v13

    :goto_1
    if-ge v3, v2, :cond_1

    invoke-interface {v15, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LD0/X;

    invoke-virtual {v4}, LD0/X;->I0()I

    move-result v4

    invoke-static {v15}, Lj7/v;->o(Ljava/util/List;)I

    move-result v6

    if-ge v3, v6, :cond_0

    invoke-interface {v8, v9}, LY0/e;->S0(F)I

    move-result v6

    goto :goto_2

    :cond_0
    move v6, v13

    :goto_2
    add-int/2addr v4, v6

    aput v4, v5, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    sget-object v3, LA/b;->a:LA/b;

    invoke-virtual {v3}, LA/b;->c()LA/b$e;

    move-result-object v3

    new-array v7, v2, [I

    move v4, v13

    :goto_3
    if-ge v4, v2, :cond_2

    aput v13, v7, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_2
    invoke-interface {v8}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v6

    move-object v2, v3

    move-object v3, v8

    move v4, v10

    move-object/from16 v16, v7

    invoke-interface/range {v2 .. v7}, LA/b$e;->c(LY0/e;I[ILY0/v;[I)V

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v2

    move v3, v13

    :goto_4
    if-ge v3, v2, :cond_3

    invoke-interface {v15, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v18, v4

    check-cast v18, LD0/X;

    aget v19, v16, v3

    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v20

    const/16 v22, 0x4

    const/16 v23, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, p1

    invoke-static/range {v17 .. v23}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_3
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LS/b$c$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
