.class public abstract Laa/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Li7/n;

.field private static final b:Li7/n;

.field private static final c:Li7/n;

.field private static final d:Laa/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Laa/f$a;->D:Laa/f$a;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Laa/f;->a:Li7/n;

    sget-object v0, Laa/f$b;->D:Laa/f$b;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Laa/f;->b:Li7/n;

    sget-object v0, Laa/f$c;->D:Laa/f$c;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Laa/f;->c:Li7/n;

    new-instance v0, Laa/a;

    invoke-direct {v0}, Laa/a;-><init>()V

    sput-object v0, Laa/f;->d:Laa/a;

    return-void
.end method

.method public static final synthetic a()Lo0/E1;
    .locals 1

    invoke-static {}, Laa/f;->e()Lo0/E1;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b()Lu0/d;
    .locals 1

    invoke-static {}, Laa/f;->f()Lu0/d;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic c()Lt0/b;
    .locals 1

    invoke-static {}, Laa/f;->g()Lt0/b;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic d(Ljava/lang/String;Ljava/lang/String;Laa/r;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Laa/f;->j(Ljava/lang/String;Ljava/lang/String;Laa/r;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final e()Lo0/E1;
    .locals 1

    sget-object v0, Laa/f;->a:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo0/E1;

    return-object v0
.end method

.method private static final f()Lu0/d;
    .locals 1

    sget-object v0, Laa/f;->b:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu0/d;

    return-object v0
.end method

.method private static final g()Lt0/b;
    .locals 1

    sget-object v0, Laa/f;->c:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt0/b;

    return-object v0
.end method

.method public static final h(Laa/d;LV/n;I)Lo0/E1;
    .locals 9

    .prologue
    const-string v0, "resource"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6d98f05a

    invoke-interface {p1, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "org.jetbrains.compose.resources.imageResource (ImageResources.kt:56)"

    invoke-static {v0, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Laa/s;->b()LV/O0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p1, v1}, Laa/t;->a(LV/O0;LV/n;I)Laa/r;

    move-result-object v3

    const/4 v0, 0x0

    invoke-static {p1, v0}, Laa/o;->h(LV/n;I)Laa/n;

    move-result-object v4

    sget-object v5, Laa/f$d;->D:Laa/f$d;

    new-instance v6, Laa/f$e;

    const/4 v0, 0x0

    invoke-direct {v6, p0, v4, v3, v0}, Laa/f$e;-><init>(Laa/d;Laa/n;Laa/r;Lm7/e;)V

    and-int/lit8 p2, p2, 0xe

    const v0, 0x8c00

    or-int v8, p2, v0

    move-object v2, p0

    move-object v7, p1

    invoke-static/range {v2 .. v8}, Laa/u;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lx7/a;Lx7/p;LV/n;I)LV/G1;

    move-result-object p0

    invoke-static {p0}, Laa/f;->i(LV/G1;)Lo0/E1;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p1}, LV/n;->J()V

    return-object p0
.end method

.method private static final i(LV/G1;)Lo0/E1;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo0/E1;

    return-object p0
.end method

.method private static final j(Ljava/lang/String;Ljava/lang/String;Laa/r;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Laa/f;->d:Laa/a;

    new-instance v1, Laa/f$f;

    const/4 v2, 0x0

    invoke-direct {v1, p3, p2, p0, v2}, Laa/f$f;-><init>(Lx7/l;Laa/r;Ljava/lang/String;Lm7/e;)V

    invoke-virtual {v0, p1, v1, p4}, Laa/a;->c(Ljava/lang/Object;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Laa/d;LV/n;I)Lt0/b;
    .locals 11

    .prologue
    const-string v0, "resource"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x59f05fb7

    invoke-interface {p1, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "org.jetbrains.compose.resources.painterResource (ImageResources.kt:35)"

    invoke-static {v0, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Laa/o;->e()LV/O0;

    move-result-object v0

    invoke-interface {p1, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laa/b;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Laa/b;->a(LV/n;I)Laa/n;

    move-result-object v0

    const v2, -0x52cf10d3

    invoke-interface {p1, v2}, LV/n;->T(I)V

    and-int/lit8 v2, p2, 0xe

    xor-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x1

    if-le v3, v4, :cond_1

    invoke-interface {p1, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v4, :cond_3

    :cond_2
    move p2, v5

    goto :goto_0

    :cond_3
    move p2, v1

    :goto_0
    invoke-interface {p1, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr p2, v3

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez p2, :cond_4

    sget-object p2, LV/n;->a:LV/n$a;

    invoke-virtual {p2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v3, p2, :cond_5

    :cond_4
    invoke-static {p0, v0}, Laa/o;->f(Laa/m;Laa/n;)Laa/q;

    move-result-object p2

    invoke-virtual {p2}, Laa/q;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Ljava/lang/String;

    invoke-interface {p1}, LV/n;->J()V

    const-string p2, ".xml"

    invoke-static {v3, p2, v5}, LS8/r;->I(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_7

    const p2, -0x71108b6

    invoke-interface {p1, p2}, LV/n;->T(I)V

    invoke-static {p0, p1, v2}, Laa/f;->n(Laa/d;LV/n;I)Lu0/d;

    move-result-object p0

    invoke-static {p0, p1, v1}, Lu0/r;->g(Lu0/d;LV/n;I)Lu0/q;

    move-result-object p0

    invoke-interface {p1}, LV/n;->J()V

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-static {}, LV/q;->P()V

    :cond_6
    invoke-interface {p1}, LV/n;->J()V

    return-object p0

    :cond_7
    const-string p2, ".svg"

    invoke-static {v3, p2, v5}, LS8/r;->I(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_9

    const p2, -0x70f561b

    invoke-interface {p1, p2}, LV/n;->T(I)V

    invoke-static {p0, p1, v2}, Laa/f;->l(Laa/d;LV/n;I)Lt0/b;

    move-result-object p0

    invoke-interface {p1}, LV/n;->J()V

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-static {}, LV/q;->P()V

    :cond_8
    invoke-interface {p1}, LV/n;->J()V

    return-object p0

    :cond_9
    const p2, -0x70e960d

    invoke-interface {p1, p2}, LV/n;->T(I)V

    new-instance p2, Lt0/a;

    invoke-static {p0, p1, v2}, Laa/f;->h(Laa/d;LV/n;I)Lo0/E1;

    move-result-object v4

    const/4 v9, 0x6

    const/4 v10, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v3, p2

    invoke-direct/range {v3 .. v10}, Lt0/a;-><init>(Lo0/E1;JJILy7/k;)V

    invoke-interface {p1}, LV/n;->J()V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_a

    invoke-static {}, LV/q;->P()V

    :cond_a
    invoke-interface {p1}, LV/n;->J()V

    return-object p2
.end method

.method private static final l(Laa/d;LV/n;I)Lt0/b;
    .locals 9

    .prologue
    const v0, 0x51c26473

    invoke-interface {p1, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "org.jetbrains.compose.resources.svgPainter (ImageResources.kt:106)"

    invoke-static {v0, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Laa/s;->b()LV/O0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p1, v1}, Laa/t;->a(LV/O0;LV/n;I)Laa/r;

    move-result-object v3

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v0

    invoke-interface {p1, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LY0/e;

    sget-object v5, Laa/f$g;->D:Laa/f$g;

    new-instance v6, Laa/f$h;

    const/4 v0, 0x0

    invoke-direct {v6, p0, v3, v4, v0}, Laa/f$h;-><init>(Laa/d;Laa/r;LY0/e;Lm7/e;)V

    and-int/lit8 p2, p2, 0xe

    const v0, 0x8c00

    or-int v8, p2, v0

    move-object v2, p0

    move-object v7, p1

    invoke-static/range {v2 .. v8}, Laa/u;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lx7/a;Lx7/p;LV/n;I)LV/G1;

    move-result-object p0

    invoke-static {p0}, Laa/f;->m(LV/G1;)Lt0/b;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p1}, LV/n;->J()V

    return-object p0
.end method

.method private static final m(LV/G1;)Lt0/b;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt0/b;

    return-object p0
.end method

.method public static final n(Laa/d;LV/n;I)Lu0/d;
    .locals 9

    .prologue
    const-string v0, "resource"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x531cda76

    invoke-interface {p1, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "org.jetbrains.compose.resources.vectorResource (ImageResources.kt:86)"

    invoke-static {v0, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Laa/s;->b()LV/O0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p1, v1}, Laa/t;->a(LV/O0;LV/n;I)Laa/r;

    move-result-object v3

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v0

    invoke-interface {p1, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LY0/e;

    sget-object v5, Laa/f$i;->D:Laa/f$i;

    new-instance v6, Laa/f$j;

    const/4 v0, 0x0

    invoke-direct {v6, p0, v3, v4, v0}, Laa/f$j;-><init>(Laa/d;Laa/r;LY0/e;Lm7/e;)V

    and-int/lit8 p2, p2, 0xe

    const v0, 0x8c00

    or-int v8, p2, v0

    move-object v2, p0

    move-object v7, p1

    invoke-static/range {v2 .. v8}, Laa/u;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lx7/a;Lx7/p;LV/n;I)LV/G1;

    move-result-object p0

    invoke-static {p0}, Laa/f;->o(LV/G1;)Lu0/d;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p1}, LV/n;->J()V

    return-object p0
.end method

.method private static final o(LV/G1;)Lu0/d;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lu0/d;

    return-object p0
.end method
