.class public abstract LC9/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lc2/a;)LC9/z;
    .locals 0

    invoke-static {p0}, LC9/x;->c(Lc2/a;)LC9/z;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;LV/n;II)LC9/v;
    .locals 9

    .prologue
    const v0, -0x448108f2

    invoke-interface {p1, v0}, LV/n;->T(I)V

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p0, 0x0

    :cond_0
    move-object v3, p0

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, -0x1

    const-string p3, "moe.tlaster.precompose.navigation.rememberNavigator (Navigator.kt:15)"

    invoke-static {v0, p2, p0, p3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    const p0, 0x17926ab1

    invoke-interface {p1, p0}, LV/n;->T(I)V

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object p0

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p0, p3, :cond_2

    new-instance p0, LC9/w;

    invoke-direct {p0}, LC9/w;-><init>()V

    invoke-interface {p1, p0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p0, Lx7/l;

    invoke-interface {p1}, LV/n;->J()V

    shl-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0x70

    or-int/lit16 p2, p2, 0x180

    const p3, 0x18ff324a

    invoke-interface {p1, p3}, LV/n;->f(I)V

    sget-object p3, Ld2/a;->a:Ld2/a;

    const/4 v0, 0x6

    invoke-virtual {p3, p1, v0}, Ld2/a;->a(LV/n;I)Landroidx/lifecycle/Y;

    move-result-object v2

    if-eqz v2, :cond_5

    const-class p3, LC9/z;

    invoke-static {p3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    new-instance v0, Lc2/c;

    invoke-direct {v0}, Lc2/c;-><init>()V

    invoke-static {p3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p3

    invoke-virtual {v0, p3, p0}, Lc2/c;->a(LF7/c;Lx7/l;)V

    invoke-virtual {v0}, Lc2/c;->b()Landroidx/lifecycle/V$c;

    move-result-object v4

    instance-of p0, v2, Landroidx/lifecycle/i;

    if-eqz p0, :cond_3

    move-object p0, v2

    check-cast p0, Landroidx/lifecycle/i;

    invoke-interface {p0}, Landroidx/lifecycle/i;->k()Lc2/a;

    move-result-object p0

    :goto_0
    move-object v5, p0

    goto :goto_1

    :cond_3
    sget-object p0, Lc2/a$a;->b:Lc2/a$a;

    goto :goto_0

    :goto_1
    shl-int/lit8 p0, p2, 0x3

    and-int/lit16 v7, p0, 0x380

    const/4 v8, 0x0

    move-object v6, p1

    invoke-static/range {v1 .. v8}, Ld2/c;->b(LF7/c;Landroidx/lifecycle/Y;Ljava/lang/String;Landroidx/lifecycle/V$c;Lc2/a;LV/n;II)Landroidx/lifecycle/T;

    move-result-object p0

    invoke-interface {p1}, LV/n;->P()V

    check-cast p0, LC9/z;

    invoke-virtual {p0}, LC9/z;->i()LC9/v;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    invoke-interface {p1}, LV/n;->J()V

    return-object p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final c(Lc2/a;)LC9/z;
    .locals 1

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, LC9/z;

    invoke-direct {p0}, LC9/z;-><init>()V

    return-object p0
.end method
