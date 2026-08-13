.class final LS/w0$l;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/w0;->l(LD0/M;LD0/X;LD0/X;LD0/X;LD0/X;JZF)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/X;

.field final synthetic E:Z

.field final synthetic F:F

.field final synthetic G:LD0/X;

.field final synthetic H:I

.field final synthetic I:F

.field final synthetic J:F

.field final synthetic K:LD0/X;

.field final synthetic L:I

.field final synthetic M:F

.field final synthetic N:LD0/X;

.field final synthetic O:I

.field final synthetic P:F

.field final synthetic Q:I

.field final synthetic R:LD0/M;


# direct methods
.method constructor <init>(LD0/X;ZFLD0/X;IFFLD0/X;IFLD0/X;IFILD0/M;)V
    .locals 0

    iput-object p1, p0, LS/w0$l;->D:LD0/X;

    iput-boolean p2, p0, LS/w0$l;->E:Z

    iput p3, p0, LS/w0$l;->F:F

    iput-object p4, p0, LS/w0$l;->G:LD0/X;

    iput p5, p0, LS/w0$l;->H:I

    iput p6, p0, LS/w0$l;->I:F

    iput p7, p0, LS/w0$l;->J:F

    iput-object p8, p0, LS/w0$l;->K:LD0/X;

    iput p9, p0, LS/w0$l;->L:I

    iput p10, p0, LS/w0$l;->M:F

    iput-object p11, p0, LS/w0$l;->N:LD0/X;

    iput p12, p0, LS/w0$l;->O:I

    iput p13, p0, LS/w0$l;->P:F

    iput p14, p0, LS/w0$l;->Q:I

    iput-object p15, p0, LS/w0$l;->R:LD0/M;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    iget-object v2, v0, LS/w0$l;->D:LD0/X;

    if-eqz v2, :cond_0

    iget v1, v0, LS/w0$l;->Q:I

    iget v3, v0, LS/w0$l;->M:F

    iget-object v4, v0, LS/w0$l;->R:LD0/M;

    iget v5, v0, LS/w0$l;->J:F

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v6

    sub-int/2addr v1, v6

    div-int/lit8 v6, v1, 0x2

    invoke-static {}, LS/w0;->j()F

    move-result v1

    invoke-interface {v4, v1}, LY0/e;->S0(F)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v3, v1

    add-float/2addr v3, v5

    invoke-static {v3}, LA7/a;->d(F)I

    move-result v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p1

    move v3, v6

    move v6, v7

    move-object v7, v8

    invoke-static/range {v1 .. v7}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_0
    iget-boolean v1, v0, LS/w0$l;->E:Z

    if-nez v1, :cond_1

    iget v1, v0, LS/w0$l;->F:F

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v0, LS/w0$l;->G:LD0/X;

    iget v4, v0, LS/w0$l;->H:I

    iget v1, v0, LS/w0$l;->I:F

    iget v2, v0, LS/w0$l;->J:F

    add-float/2addr v1, v2

    invoke-static {v1}, LA7/a;->d(F)I

    move-result v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :goto_0
    iget-object v10, v0, LS/w0$l;->K:LD0/X;

    iget v11, v0, LS/w0$l;->L:I

    iget v1, v0, LS/w0$l;->M:F

    iget v2, v0, LS/w0$l;->J:F

    add-float/2addr v1, v2

    invoke-static {v1}, LA7/a;->d(F)I

    move-result v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v9 .. v15}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    iget-object v2, v0, LS/w0$l;->N:LD0/X;

    iget v3, v0, LS/w0$l;->O:I

    iget v1, v0, LS/w0$l;->P:F

    iget v4, v0, LS/w0$l;->J:F

    add-float/2addr v1, v4

    invoke-static {v1}, LA7/a;->d(F)I

    move-result v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v7}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LS/w0$l;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
