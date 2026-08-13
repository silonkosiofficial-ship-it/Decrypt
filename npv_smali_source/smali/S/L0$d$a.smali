.class final LS/L0$d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/L0$d;->a(LD0/j0;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/util/List;

.field final synthetic E:Ljava/util/List;

.field final synthetic F:Ljava/util/List;

.field final synthetic G:Ljava/util/List;

.field final synthetic H:LS/b0;

.field final synthetic I:I

.field final synthetic J:I

.field final synthetic K:LA/S;

.field final synthetic L:LD0/j0;

.field final synthetic M:I

.field final synthetic N:I

.field final synthetic O:Ljava/lang/Integer;

.field final synthetic P:Ljava/util/List;

.field final synthetic Q:Ljava/lang/Integer;


# direct methods
.method constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;LS/b0;IILA/S;LD0/j0;IILjava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, LS/L0$d$a;->D:Ljava/util/List;

    iput-object p2, p0, LS/L0$d$a;->E:Ljava/util/List;

    iput-object p3, p0, LS/L0$d$a;->F:Ljava/util/List;

    iput-object p4, p0, LS/L0$d$a;->G:Ljava/util/List;

    iput-object p5, p0, LS/L0$d$a;->H:LS/b0;

    iput p6, p0, LS/L0$d$a;->I:I

    iput p7, p0, LS/L0$d$a;->J:I

    iput-object p8, p0, LS/L0$d$a;->K:LA/S;

    iput-object p9, p0, LS/L0$d$a;->L:LD0/j0;

    iput p10, p0, LS/L0$d$a;->M:I

    iput p11, p0, LS/L0$d$a;->N:I

    iput-object p12, p0, LS/L0$d$a;->O:Ljava/lang/Integer;

    iput-object p13, p0, LS/L0$d$a;->P:Ljava/util/List;

    iput-object p14, p0, LS/L0$d$a;->Q:Ljava/lang/Integer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 19

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, LS/L0$d$a;->D:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, LD0/X;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v6 .. v12}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, v0, LS/L0$d$a;->E:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, LD0/X;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v6 .. v12}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    iget-object v1, v0, LS/L0$d$a;->F:Ljava/util/List;

    iget v2, v0, LS/L0$d$a;->I:I

    iget v4, v0, LS/L0$d$a;->J:I

    iget-object v5, v0, LS/L0$d$a;->K:LA/S;

    iget-object v6, v0, LS/L0$d$a;->L:LD0/j0;

    iget v7, v0, LS/L0$d$a;->M:I

    iget v8, v0, LS/L0$d$a;->N:I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v9

    move v10, v3

    :goto_2
    if-ge v10, v9, :cond_2

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v13, v11

    check-cast v13, LD0/X;

    sub-int v11, v2, v4

    div-int/lit8 v11, v11, 0x2

    invoke-interface {v6}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v12

    invoke-interface {v5, v6, v12}, LA/S;->d(LY0/e;LY0/v;)I

    move-result v12

    add-int v14, v11, v12

    sub-int v15, v7, v8

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/16 v16, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v12 .. v18}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_2
    iget-object v1, v0, LS/L0$d$a;->G:Ljava/util/List;

    iget v2, v0, LS/L0$d$a;->M:I

    iget-object v4, v0, LS/L0$d$a;->O:Ljava/lang/Integer;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    move v6, v3

    :goto_3
    if-ge v6, v5, :cond_4

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, LD0/X;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_4

    :cond_3
    move v7, v3

    :goto_4
    sub-int v11, v2, v7

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v14}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    iget-object v1, v0, LS/L0$d$a;->H:LS/b0;

    if-eqz v1, :cond_5

    iget-object v2, v0, LS/L0$d$a;->P:Ljava/util/List;

    iget v4, v0, LS/L0$d$a;->M:I

    iget-object v5, v0, LS/L0$d$a;->Q:Ljava/lang/Integer;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    :goto_5
    if-ge v3, v6, :cond_5

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, LD0/X;

    invoke-virtual {v1}, LS/b0;->b()I

    move-result v10

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    sub-int v11, v4, v7

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v14}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LS/L0$d$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
