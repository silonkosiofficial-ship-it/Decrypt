.class public abstract LV/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LV/n;I)I
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:228)"

    const v2, 0x1f4264f3

    invoke-static {v2, p1, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p0}, LV/n;->L()I

    move-result p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return p0
.end method

.method public static final b(LV/n;I)LV/Q0;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:196)"

    const v2, 0x178a93e7

    invoke-static {v2, p1, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p0}, LV/n;->b()LV/Q0;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p0, p1}, LV/n;->z(LV/Q0;)V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "no recompose scope found"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid applier"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final d(LV/n;I)LV/s;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:484)"

    const v2, -0x457c7c0c

    invoke-static {v2, p1, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p0}, LV/n;->M()LV/s;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p0
.end method
