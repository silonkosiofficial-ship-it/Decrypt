.class public abstract Lz/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lz/j;LV/n;I)LV/G1;
    .locals 6

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:64)"

    const v2, -0x6b9dfad0

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x2

    invoke-static {v0, v3, v2, v3}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    invoke-interface {p1, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, LV/w0;

    and-int/lit8 v2, p2, 0xe

    xor-int/lit8 v4, v2, 0x6

    const/4 v5, 0x4

    if-le v4, v5, :cond_2

    invoke-interface {p1, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v5, :cond_4

    :cond_3
    const/4 p2, 0x1

    goto :goto_0

    :cond_4
    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez p2, :cond_5

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v4, p2, :cond_6

    :cond_5
    new-instance v4, Lz/f$a;

    invoke-direct {v4, p0, v0, v3}, Lz/f$a;-><init>(Lz/j;LV/w0;Lm7/e;)V

    invoke-interface {p1, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lx7/p;

    invoke-static {p0, v4, p1, v2}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    return-object v0
.end method
