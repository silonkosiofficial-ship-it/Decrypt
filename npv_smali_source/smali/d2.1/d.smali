.class abstract synthetic Ld2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/lifecycle/Y;LF7/c;Ljava/lang/String;Landroidx/lifecycle/V$c;Lc2/a;)Landroidx/lifecycle/T;
    .locals 6

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    sget-object v0, Landroidx/lifecycle/V;->b:Landroidx/lifecycle/V$b;

    invoke-interface {p0}, Landroidx/lifecycle/Y;->n()Landroidx/lifecycle/X;

    move-result-object p0

    invoke-virtual {v0, p0, p3, p4}, Landroidx/lifecycle/V$b;->a(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;)Landroidx/lifecycle/V;

    move-result-object p0

    goto :goto_0

    :cond_0
    instance-of p3, p0, Landroidx/lifecycle/i;

    if-eqz p3, :cond_1

    sget-object p3, Landroidx/lifecycle/V;->b:Landroidx/lifecycle/V$b;

    invoke-interface {p0}, Landroidx/lifecycle/Y;->n()Landroidx/lifecycle/X;

    move-result-object v0

    check-cast p0, Landroidx/lifecycle/i;

    invoke-interface {p0}, Landroidx/lifecycle/i;->j()Landroidx/lifecycle/V$c;

    move-result-object p0

    invoke-virtual {p3, v0, p0, p4}, Landroidx/lifecycle/V$b;->a(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;)Landroidx/lifecycle/V;

    move-result-object p0

    goto :goto_0

    :cond_1
    sget-object v0, Landroidx/lifecycle/V;->b:Landroidx/lifecycle/V$b;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Landroidx/lifecycle/V$b;->d(Landroidx/lifecycle/V$b;Landroidx/lifecycle/Y;Landroidx/lifecycle/V$c;Lc2/a;ILjava/lang/Object;)Landroidx/lifecycle/V;

    move-result-object p0

    :goto_0
    if-eqz p2, :cond_2

    invoke-virtual {p0, p2, p1}, Landroidx/lifecycle/V;->c(Ljava/lang/String;LF7/c;)Landroidx/lifecycle/T;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1}, Landroidx/lifecycle/V;->a(LF7/c;)Landroidx/lifecycle/T;

    move-result-object p0

    :goto_1
    return-object p0
.end method

.method public static final b(LF7/c;Landroidx/lifecycle/Y;Ljava/lang/String;Landroidx/lifecycle/V$c;Lc2/a;LV/n;II)Landroidx/lifecycle/T;
    .locals 3

    .prologue
    const-string v0, "modelClass"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x63c16600

    invoke-interface {p5, v0}, LV/n;->f(I)V

    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_1

    sget-object p1, Ld2/a;->a:Ld2/a;

    const/4 v1, 0x6

    invoke-virtual {p1, p5, v1}, Ld2/a;->a(LV/n;I)Landroidx/lifecycle/Y;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    and-int/lit8 v1, p7, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object p2, v2

    :cond_2
    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_3

    move-object p3, v2

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_5

    instance-of p4, p1, Landroidx/lifecycle/i;

    if-eqz p4, :cond_4

    move-object p4, p1

    check-cast p4, Landroidx/lifecycle/i;

    invoke-interface {p4}, Landroidx/lifecycle/i;->k()Lc2/a;

    move-result-object p4

    goto :goto_1

    :cond_4
    sget-object p4, Lc2/a$a;->b:Lc2/a$a;

    :cond_5
    :goto_1
    invoke-static {}, LV/q;->H()Z

    move-result p7

    if-eqz p7, :cond_6

    const/4 p7, -0x1

    const-string v1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:102)"

    invoke-static {v0, p6, p7, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-static {p1, p0, p2, p3, p4}, Ld2/c;->a(Landroidx/lifecycle/Y;LF7/c;Ljava/lang/String;Landroidx/lifecycle/V$c;Lc2/a;)Landroidx/lifecycle/T;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    invoke-interface {p5}, LV/n;->P()V

    return-object p0
.end method
