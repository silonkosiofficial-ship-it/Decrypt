.class final LS/l1$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/l1;->b(LD0/M;Ljava/util/List;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/X;

.field final synthetic E:I

.field final synthetic F:I

.field final synthetic G:LD0/X;

.field final synthetic H:LD0/X;

.field final synthetic I:LD0/X;

.field final synthetic J:LD0/X;

.field final synthetic K:LD0/X;

.field final synthetic L:LD0/X;

.field final synthetic M:LD0/X;

.field final synthetic N:LD0/X;

.field final synthetic O:LS/l1;

.field final synthetic P:I

.field final synthetic Q:LD0/M;


# direct methods
.method constructor <init>(LD0/X;IILD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LS/l1;ILD0/M;)V
    .locals 0

    iput-object p1, p0, LS/l1$c;->D:LD0/X;

    iput p2, p0, LS/l1$c;->E:I

    iput p3, p0, LS/l1$c;->F:I

    iput-object p4, p0, LS/l1$c;->G:LD0/X;

    iput-object p5, p0, LS/l1$c;->H:LD0/X;

    iput-object p6, p0, LS/l1$c;->I:LD0/X;

    iput-object p7, p0, LS/l1$c;->J:LD0/X;

    iput-object p8, p0, LS/l1$c;->K:LD0/X;

    iput-object p9, p0, LS/l1$c;->L:LD0/X;

    iput-object p10, p0, LS/l1$c;->M:LD0/X;

    iput-object p11, p0, LS/l1$c;->N:LD0/X;

    iput-object p12, p0, LS/l1$c;->O:LS/l1;

    iput p13, p0, LS/l1$c;->P:I

    iput-object p14, p0, LS/l1$c;->Q:LD0/M;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 32

    .prologue
    move-object/from16 v0, p0

    iget-object v5, v0, LS/l1$c;->D:LD0/X;

    if-eqz v5, :cond_0

    iget v2, v0, LS/l1$c;->E:I

    iget v3, v0, LS/l1$c;->F:I

    iget-object v4, v0, LS/l1$c;->G:LD0/X;

    iget-object v6, v0, LS/l1$c;->H:LD0/X;

    iget-object v7, v0, LS/l1$c;->I:LD0/X;

    iget-object v8, v0, LS/l1$c;->J:LD0/X;

    iget-object v9, v0, LS/l1$c;->K:LD0/X;

    iget-object v10, v0, LS/l1$c;->L:LD0/X;

    iget-object v11, v0, LS/l1$c;->M:LD0/X;

    iget-object v12, v0, LS/l1$c;->N:LD0/X;

    iget-object v1, v0, LS/l1$c;->O:LS/l1;

    invoke-static {v1}, LS/l1;->g(LS/l1;)Z

    move-result v13

    iget v1, v0, LS/l1$c;->P:I

    move v14, v1

    iget-object v15, v0, LS/l1$c;->D:LD0/X;

    invoke-virtual {v15}, LD0/X;->w0()I

    move-result v15

    add-int/2addr v15, v1

    iget-object v1, v0, LS/l1$c;->O:LS/l1;

    invoke-static {v1}, LS/l1;->d(LS/l1;)F

    move-result v16

    iget-object v1, v0, LS/l1$c;->Q:LD0/M;

    invoke-interface {v1}, LY0/e;->getDensity()F

    move-result v17

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v17}, LS/k1;->e(LD0/X$a;IILD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;ZIIFF)V

    goto :goto_0

    :cond_0
    iget v1, v0, LS/l1$c;->E:I

    iget v2, v0, LS/l1$c;->F:I

    iget-object v3, v0, LS/l1$c;->G:LD0/X;

    iget-object v4, v0, LS/l1$c;->H:LD0/X;

    iget-object v5, v0, LS/l1$c;->I:LD0/X;

    iget-object v6, v0, LS/l1$c;->J:LD0/X;

    iget-object v7, v0, LS/l1$c;->K:LD0/X;

    iget-object v8, v0, LS/l1$c;->L:LD0/X;

    iget-object v9, v0, LS/l1$c;->M:LD0/X;

    iget-object v10, v0, LS/l1$c;->N:LD0/X;

    iget-object v11, v0, LS/l1$c;->O:LS/l1;

    invoke-static {v11}, LS/l1;->g(LS/l1;)Z

    move-result v29

    iget-object v11, v0, LS/l1$c;->Q:LD0/M;

    invoke-interface {v11}, LY0/e;->getDensity()F

    move-result v30

    iget-object v11, v0, LS/l1$c;->O:LS/l1;

    invoke-static {v11}, LS/l1;->f(LS/l1;)LA/B;

    move-result-object v31

    move-object/from16 v18, p1

    move/from16 v19, v1

    move/from16 v20, v2

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object/from16 v26, v8

    move-object/from16 v27, v9

    move-object/from16 v28, v10

    invoke-static/range {v18 .. v31}, LS/k1;->f(LD0/X$a;IILD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;ZFLA/B;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LS/l1$c;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
