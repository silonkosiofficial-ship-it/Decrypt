.class public abstract LA/N;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/d;LV/n;I)V
    .locals 5

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)"

    const v2, -0x4581923

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LA/O;->a:LA/O;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LV/k;->a(LV/n;I)I

    move-result v0

    invoke-static {p1, p0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    invoke-interface {p1}, LV/n;->F()LV/z;

    move-result-object v1

    sget-object v2, LF0/g;->a:LF0/g$a;

    invoke-virtual {v2}, LF0/g$a;->a()Lx7/a;

    move-result-object v3

    invoke-interface {p1}, LV/n;->v()LV/g;

    move-result-object v4

    instance-of v4, v4, LV/g;

    if-nez v4, :cond_1

    invoke-static {}, LV/k;->c()V

    :cond_1
    invoke-interface {p1}, LV/n;->t()V

    invoke-interface {p1}, LV/n;->o()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1, v3}, LV/n;->B(Lx7/a;)V

    goto :goto_0

    :cond_2
    invoke-interface {p1}, LV/n;->H()V

    :goto_0
    invoke-static {p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v3

    invoke-virtual {v2}, LF0/g$a;->c()Lx7/p;

    move-result-object v4

    invoke-static {v3, p2, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v2}, LF0/g$a;->e()Lx7/p;

    move-result-object p2

    invoke-static {v3, v1, p2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v2}, LF0/g$a;->d()Lx7/p;

    move-result-object p2

    invoke-static {v3, p0, p2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v2}, LF0/g$a;->b()Lx7/p;

    move-result-object p0

    invoke-interface {v3}, LV/n;->o()Z

    move-result p2

    if-nez p2, :cond_3

    invoke-interface {v3}, LV/n;->g()Ljava/lang/Object;

    move-result-object p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p2, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v3, p2}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v3, p2, p0}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_4
    invoke-interface {p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    return-void
.end method
