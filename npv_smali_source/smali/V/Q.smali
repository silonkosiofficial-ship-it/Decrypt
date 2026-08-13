.class public abstract LV/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LV/N;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV/N;

    invoke-direct {v0}, LV/N;-><init>()V

    sput-object v0, LV/Q;->a:LV/N;

    return-void
.end method

.method public static final a(Ljava/lang/Object;Ljava/lang/Object;Lx7/l;LV/n;I)V
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)"

    const v2, 0x552e4d01

    invoke-static {v2, p4, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p3, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p3, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_1

    sget-object p0, LV/n;->a:LV/n$a;

    invoke-virtual {p0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_2

    :cond_1
    new-instance p1, LV/L;

    invoke-direct {p1, p2}, LV/L;-><init>(Lx7/l;)V

    invoke-interface {p3, p1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p1, LV/L;

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-void
.end method

.method public static final b(Ljava/lang/Object;Lx7/l;LV/n;I)V
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)"

    const v2, -0x51c6db9f

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p3

    if-nez p0, :cond_1

    sget-object p0, LV/n;->a:LV/n$a;

    invoke-virtual {p0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p3, p0, :cond_2

    :cond_1
    new-instance p3, LV/L;

    invoke-direct {p3, p1}, LV/L;-><init>(Lx7/l;)V

    invoke-interface {p2, p3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p3, LV/L;

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-void
.end method

.method public static final c([Ljava/lang/Object;Lx7/l;LV/n;I)V
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)"

    const v2, -0x4df0ce72

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    array-length p3, p0

    invoke-static {p0, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    array-length p3, p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v0, p3, :cond_1

    aget-object v2, p0, v0

    invoke-interface {p2, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p0

    if-nez v1, :cond_2

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p0, p3, :cond_3

    :cond_2
    new-instance p0, LV/L;

    invoke-direct {p0, p1}, LV/L;-><init>(Lx7/l;)V

    invoke-interface {p2, p0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_3
    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    return-void
.end method

.method public static final d(Ljava/lang/Object;Ljava/lang/Object;Lx7/p;LV/n;I)V
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)"

    const v2, 0x232e5d65

    invoke-static {v2, p4, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p3}, LV/n;->C()Lm7/i;

    move-result-object p4

    invoke-interface {p3, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p3, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_1

    sget-object p0, LV/n;->a:LV/n$a;

    invoke-virtual {p0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_2

    :cond_1
    new-instance p1, LV/e0;

    invoke-direct {p1, p4, p2}, LV/e0;-><init>(Lm7/i;Lx7/p;)V

    invoke-interface {p3, p1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p1, LV/e0;

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-void
.end method

.method public static final e(Ljava/lang/Object;Lx7/p;LV/n;I)V
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)"

    const v2, 0x4648f105

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2}, LV/n;->C()Lm7/i;

    move-result-object p3

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez p0, :cond_1

    sget-object p0, LV/n;->a:LV/n$a;

    invoke-virtual {p0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne v0, p0, :cond_2

    :cond_1
    new-instance v0, LV/e0;

    invoke-direct {v0, p3, p1}, LV/e0;-><init>(Lm7/i;Lx7/p;)V

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, LV/e0;

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-void
.end method

.method public static final f(Lx7/a;LV/n;I)V
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.SideEffect (Effects.kt:48)"

    const v2, -0x4ccc7149

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1, p0}, LV/n;->m(Lx7/a;)V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-void
.end method

.method public static final synthetic g()LV/N;
    .locals 1

    sget-object v0, LV/Q;->a:LV/N;

    return-object v0
.end method

.method public static final h(Lm7/i;LV/n;)LW8/N;
    .locals 2

    .prologue
    sget-object v0, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p0, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    const/4 p1, 0x0

    invoke-static {p1, p0, p1}, LW8/C0;->b(LW8/z0;ILjava/lang/Object;)LW8/y;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "CoroutineContext supplied to rememberCoroutineScope may not include a parent job"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p1}, LW8/y;->g(Ljava/lang/Throwable;)Z

    :goto_0
    invoke-static {p0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object p0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, LV/n;->C()Lm7/i;

    move-result-object p1

    invoke-interface {p1, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    check-cast v0, LW8/z0;

    invoke-static {v0}, LW8/C0;->a(LW8/z0;)LW8/y;

    move-result-object v0

    invoke-interface {p1, v0}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p1

    invoke-interface {p1, p0}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    goto :goto_0

    :goto_1
    return-object p0
.end method
