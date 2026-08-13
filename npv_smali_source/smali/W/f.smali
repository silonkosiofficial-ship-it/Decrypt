.class public abstract LW/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LV/k1;LV/d;LV/g;)I
    .locals 0

    invoke-static {p0, p1, p2}, LW/f;->d(LV/k1;LV/d;LV/g;)I

    move-result p0

    return p0
.end method

.method public static final synthetic b(LV/k1;LV/g;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LW/f;->e(LV/k1;LV/g;I)V

    return-void
.end method

.method private static final c(LV/k1;)I
    .locals 6

    .prologue
    invoke-virtual {p0}, LV/k1;->a0()I

    move-result v0

    invoke-virtual {p0}, LV/k1;->c0()I

    move-result v1

    :goto_0
    if-ltz v1, :cond_0

    invoke-virtual {p0, v1}, LV/k1;->r0(I)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, LV/k1;->E0(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    add-int/2addr v1, v2

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v1, v0, :cond_4

    invoke-virtual {p0, v0, v1}, LV/k1;->m0(II)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p0, v1}, LV/k1;->r0(I)Z

    move-result v5

    if-eqz v5, :cond_1

    move v4, v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v1}, LV/k1;->r0(I)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v2

    goto :goto_2

    :cond_3
    invoke-virtual {p0, v1}, LV/k1;->C0(I)I

    move-result v5

    :goto_2
    add-int/2addr v4, v5

    invoke-virtual {p0, v1}, LV/k1;->k0(I)I

    move-result v5

    add-int/2addr v1, v5

    goto :goto_1

    :cond_4
    return v4
.end method

.method private static final d(LV/k1;LV/d;LV/g;)I
    .locals 4

    .prologue
    invoke-virtual {p0, p1}, LV/k1;->F(LV/d;)I

    move-result p1

    invoke-virtual {p0}, LV/k1;->a0()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ge v0, p1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, LV/q;->O(Z)V

    invoke-static {p0, p2, p1}, LW/f;->e(LV/k1;LV/g;I)V

    invoke-static {p0}, LW/f;->c(LV/k1;)I

    move-result v0

    :goto_1
    invoke-virtual {p0}, LV/k1;->a0()I

    move-result v3

    if-ge v3, p1, :cond_3

    invoke-virtual {p0, p1}, LV/k1;->l0(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0}, LV/k1;->q0()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, LV/k1;->a0()I

    move-result v0

    invoke-virtual {p0, v0}, LV/k1;->A0(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0}, LV/g;->d(Ljava/lang/Object;)V

    move v0, v2

    :cond_1
    invoke-virtual {p0}, LV/k1;->g1()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, LV/k1;->V0()I

    move-result v3

    add-int/2addr v0, v3

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, LV/k1;->a0()I

    move-result p0

    if-ne p0, p1, :cond_4

    goto :goto_2

    :cond_4
    move v1, v2

    :goto_2
    invoke-static {v1}, LV/q;->O(Z)V

    return v0
.end method

.method private static final e(LV/k1;LV/g;I)V
    .locals 1

    .prologue
    :goto_0
    invoke-virtual {p0, p2}, LV/k1;->n0(I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LV/k1;->W0()V

    invoke-virtual {p0}, LV/k1;->c0()I

    move-result v0

    invoke-virtual {p0, v0}, LV/k1;->r0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LV/g;->g()V

    :cond_0
    invoke-virtual {p0}, LV/k1;->T()I

    goto :goto_0

    :cond_1
    return-void
.end method
