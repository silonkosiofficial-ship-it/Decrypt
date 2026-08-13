.class final LS/w0$k;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/w0;->k(LD0/M;LD0/X;LD0/X;LD0/X;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/X;

.field final synthetic E:LD0/X;

.field final synthetic F:I

.field final synthetic G:I

.field final synthetic H:LD0/X;

.field final synthetic I:I

.field final synthetic J:I

.field final synthetic K:I

.field final synthetic L:I


# direct methods
.method constructor <init>(LD0/X;LD0/X;IILD0/X;IIII)V
    .locals 0

    iput-object p1, p0, LS/w0$k;->D:LD0/X;

    iput-object p2, p0, LS/w0$k;->E:LD0/X;

    iput p3, p0, LS/w0$k;->F:I

    iput p4, p0, LS/w0$k;->G:I

    iput-object p5, p0, LS/w0$k;->H:LD0/X;

    iput p6, p0, LS/w0$k;->I:I

    iput p7, p0, LS/w0$k;->J:I

    iput p8, p0, LS/w0$k;->K:I

    iput p9, p0, LS/w0$k;->L:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    iget-object v2, v0, LS/w0$k;->D:LD0/X;

    if-eqz v2, :cond_0

    iget v1, v0, LS/w0$k;->K:I

    iget v3, v0, LS/w0$k;->L:I

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v4

    sub-int/2addr v1, v4

    div-int/lit8 v4, v1, 0x2

    invoke-virtual {v2}, LD0/X;->w0()I

    move-result v1

    sub-int/2addr v3, v1

    div-int/lit8 v5, v3, 0x2

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v1, p1

    move v3, v4

    move v4, v5

    move v5, v8

    invoke-static/range {v1 .. v7}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_0
    iget-object v10, v0, LS/w0$k;->E:LD0/X;

    iget v11, v0, LS/w0$k;->F:I

    iget v12, v0, LS/w0$k;->G:I

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v9 .. v15}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    iget-object v2, v0, LS/w0$k;->H:LD0/X;

    iget v3, v0, LS/w0$k;->I:I

    iget v4, v0, LS/w0$k;->J:I

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

    invoke-virtual {p0, p1}, LS/w0$k;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
