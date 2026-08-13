.class public abstract Lr1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, Lr1/k;->a:[Z

    return-void
.end method

.method static a(Lr1/f;Lq1/d;Lr1/e;)V
    .locals 6

    .prologue
    const/4 v0, -0x1

    iput v0, p2, Lr1/e;->j:I

    iput v0, p2, Lr1/e;->k:I

    iget-object v0, p0, Lr1/e;->M:[Lr1/e$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v2, Lr1/e$b;->D:Lr1/e$b;

    const/4 v3, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p2, Lr1/e;->M:[Lr1/e$b;

    aget-object v0, v0, v1

    sget-object v1, Lr1/e$b;->F:Lr1/e$b;

    if-ne v0, v1, :cond_0

    iget-object v0, p2, Lr1/e;->B:Lr1/d;

    iget v0, v0, Lr1/d;->e:I

    invoke-virtual {p0}, Lr1/e;->P()I

    move-result v1

    iget-object v4, p2, Lr1/e;->D:Lr1/d;

    iget v4, v4, Lr1/d;->e:I

    sub-int/2addr v1, v4

    iget-object v4, p2, Lr1/e;->B:Lr1/d;

    invoke-virtual {p1, v4}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v5

    iput-object v5, v4, Lr1/d;->g:Lq1/i;

    iget-object v4, p2, Lr1/e;->D:Lr1/d;

    invoke-virtual {p1, v4}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v5

    iput-object v5, v4, Lr1/d;->g:Lq1/i;

    iget-object v4, p2, Lr1/e;->B:Lr1/d;

    iget-object v4, v4, Lr1/d;->g:Lq1/i;

    invoke-virtual {p1, v4, v0}, Lq1/d;->f(Lq1/i;I)V

    iget-object v4, p2, Lr1/e;->D:Lr1/d;

    iget-object v4, v4, Lr1/d;->g:Lq1/i;

    invoke-virtual {p1, v4, v1}, Lq1/d;->f(Lq1/i;I)V

    iput v3, p2, Lr1/e;->j:I

    invoke-virtual {p2, v0, v1}, Lr1/e;->k0(II)V

    :cond_0
    iget-object v0, p0, Lr1/e;->M:[Lr1/e$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    if-eq v0, v2, :cond_3

    iget-object v0, p2, Lr1/e;->M:[Lr1/e$b;

    aget-object v0, v0, v1

    sget-object v1, Lr1/e$b;->F:Lr1/e$b;

    if-ne v0, v1, :cond_3

    iget-object v0, p2, Lr1/e;->C:Lr1/d;

    iget v0, v0, Lr1/d;->e:I

    invoke-virtual {p0}, Lr1/e;->v()I

    move-result p0

    iget-object v1, p2, Lr1/e;->E:Lr1/d;

    iget v1, v1, Lr1/d;->e:I

    sub-int/2addr p0, v1

    iget-object v1, p2, Lr1/e;->C:Lr1/d;

    invoke-virtual {p1, v1}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v2

    iput-object v2, v1, Lr1/d;->g:Lq1/i;

    iget-object v1, p2, Lr1/e;->E:Lr1/d;

    invoke-virtual {p1, v1}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v2

    iput-object v2, v1, Lr1/d;->g:Lq1/i;

    iget-object v1, p2, Lr1/e;->C:Lr1/d;

    iget-object v1, v1, Lr1/d;->g:Lq1/i;

    invoke-virtual {p1, v1, v0}, Lq1/d;->f(Lq1/i;I)V

    iget-object v1, p2, Lr1/e;->E:Lr1/d;

    iget-object v1, v1, Lr1/d;->g:Lq1/i;

    invoke-virtual {p1, v1, p0}, Lq1/d;->f(Lq1/i;I)V

    iget v1, p2, Lr1/e;->Y:I

    if-gtz v1, :cond_1

    invoke-virtual {p2}, Lr1/e;->O()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p2, Lr1/e;->F:Lr1/d;

    invoke-virtual {p1, v1}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v2

    iput-object v2, v1, Lr1/d;->g:Lq1/i;

    iget-object v1, p2, Lr1/e;->F:Lr1/d;

    iget-object v1, v1, Lr1/d;->g:Lq1/i;

    iget v2, p2, Lr1/e;->Y:I

    add-int/2addr v2, v0

    invoke-virtual {p1, v1, v2}, Lq1/d;->f(Lq1/i;I)V

    :cond_2
    iput v3, p2, Lr1/e;->k:I

    invoke-virtual {p2, v0, p0}, Lr1/e;->z0(II)V

    :cond_3
    return-void
.end method

.method public static final b(II)Z
    .locals 0

    .prologue
    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
