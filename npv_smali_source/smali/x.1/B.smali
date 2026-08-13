.class public abstract Lx/B;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/l;)Lx/A;
    .locals 1

    new-instance v0, Lx/k;

    invoke-direct {v0, p0}, Lx/k;-><init>(Lx7/l;)V

    return-object v0
.end method

.method public static final b(Lx7/l;LV/n;I)Lx/A;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:161)"

    const v2, -0xac19cfe

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 p2, p2, 0xe

    invoke-static {p0, p1, p2}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object p0

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_1

    new-instance p2, Lx/B$a;

    invoke-direct {p2, p0}, Lx/B$a;-><init>(LV/G1;)V

    invoke-static {p2}, Lx/B;->a(Lx7/l;)Lx/A;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, Lx/A;

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    return-object p2
.end method
