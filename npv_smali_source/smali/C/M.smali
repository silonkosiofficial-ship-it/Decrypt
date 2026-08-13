.class public abstract LC/M;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LC/K;ZLV/n;I)LD/E;
    .locals 5

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:33)"

    const v2, -0x4a53d505

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-le v0, v3, :cond_1

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 v0, p3, 0x6

    if-ne v0, v3, :cond_3

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    and-int/lit8 v3, p3, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v4, 0x20

    if-le v3, v4, :cond_4

    invoke-interface {p2, p1}, LV/n;->d(Z)Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    and-int/lit8 p1, p3, 0x30

    if-ne p1, v4, :cond_6

    :cond_5
    move v1, v2

    :cond_6
    or-int p1, v0, v1

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p3

    if-nez p1, :cond_7

    sget-object p1, LV/n;->a:LV/n$a;

    invoke-virtual {p1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p3, p1, :cond_8

    :cond_7
    new-instance p3, LC/M$a;

    invoke-direct {p3, p0}, LC/M$a;-><init>(LC/K;)V

    invoke-interface {p2, p3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast p3, LC/M$a;

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    return-object p3
.end method
