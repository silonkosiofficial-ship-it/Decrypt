.class final LS/q1$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1$a;->b(LD0/M;Ljava/util/List;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/X;

.field final synthetic E:Ljava/util/List;

.field final synthetic F:LD0/X;

.field final synthetic G:J

.field final synthetic H:F

.field final synthetic I:F


# direct methods
.method constructor <init>(LD0/X;Ljava/util/List;LD0/X;JFF)V
    .locals 0

    iput-object p1, p0, LS/q1$a$a;->D:LD0/X;

    iput-object p2, p0, LS/q1$a$a;->E:Ljava/util/List;

    iput-object p3, p0, LS/q1$a$a;->F:LD0/X;

    iput-wide p4, p0, LS/q1$a$a;->G:J

    iput p6, p0, LS/q1$a$a;->H:F

    iput p7, p0, LS/q1$a$a;->I:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 20

    .prologue
    move-object/from16 v0, p0

    iget-object v2, v0, LS/q1$a$a;->D:LD0/X;

    if-eqz v2, :cond_0

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v7}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_0
    iget-object v1, v0, LS/q1$a$a;->E:Ljava/util/List;

    iget-wide v2, v0, LS/q1$a$a;->G:J

    iget v4, v0, LS/q1$a$a;->H:F

    iget v5, v0, LS/q1$a$a;->I:F

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, LD0/X;

    invoke-static {v2, v3}, LY0/b;->l(J)I

    move-result v8

    div-int/lit8 v8, v8, 0x2

    invoke-virtual {v10}, LD0/X;->I0()I

    move-result v9

    div-int/lit8 v9, v9, 0x2

    sub-int/2addr v8, v9

    invoke-static {v2, v3}, LY0/b;->k(J)I

    move-result v9

    div-int/lit8 v9, v9, 0x2

    invoke-virtual {v10}, LD0/X;->w0()I

    move-result v11

    div-int/lit8 v11, v11, 0x2

    sub-int/2addr v9, v11

    float-to-double v11, v4

    int-to-float v13, v7

    mul-float/2addr v13, v5

    float-to-double v13, v13

    const-wide v15, 0x3ff921fb54442d18L    # 1.5707963267948966

    sub-double/2addr v13, v15

    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    move-result-wide v15

    mul-double/2addr v15, v11

    move-object/from16 v17, v1

    move-wide/from16 v18, v2

    int-to-double v1, v8

    add-double/2addr v15, v1

    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    mul-double/2addr v11, v1

    int-to-double v1, v9

    add-double/2addr v11, v1

    invoke-static/range {v15 .. v16}, LA7/a;->c(D)I

    move-result v1

    invoke-static {v11, v12}, LA7/a;->c(D)I

    move-result v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p1

    move v11, v1

    invoke-static/range {v9 .. v15}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, v17

    move-wide/from16 v2, v18

    goto :goto_0

    :cond_1
    iget-object v9, v0, LS/q1$a$a;->F:LD0/X;

    if-eqz v9, :cond_2

    iget-wide v1, v0, LS/q1$a$a;->G:J

    invoke-static {v1, v2}, LY0/b;->n(J)I

    move-result v1

    iget-object v2, v0, LS/q1$a$a;->F:LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v10, v1, 0x2

    iget-wide v1, v0, LS/q1$a$a;->G:J

    invoke-static {v1, v2}, LY0/b;->m(J)I

    move-result v1

    iget-object v2, v0, LS/q1$a$a;->F:LD0/X;

    invoke-virtual {v2}, LD0/X;->w0()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v11, v1, 0x2

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v14}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LS/q1$a$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
