.class public abstract LN/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lu/o;

.field private static final b:Lu/x0;

.field private static final c:J

.field private static final d:Lu/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lu/o;

    const/high16 v1, 0x7fc00000    # Float.NaN

    invoke-direct {v0, v1, v1}, Lu/o;-><init>(FF)V

    sput-object v0, LN/y;->a:Lu/o;

    sget-object v0, LN/y$a;->D:LN/y$a;

    sget-object v1, LN/y$b;->D:LN/y$b;

    invoke-static {v0, v1}, Lu/z0;->a(Lx7/l;Lx7/l;)Lu/x0;

    move-result-object v0

    sput-object v0, LN/y;->b:Lu/x0;

    const v0, 0x3c23d70a    # 0.01f

    invoke-static {v0, v0}, Ln0/h;->a(FF)J

    move-result-wide v0

    sput-wide v0, LN/y;->c:J

    new-instance v8, Lu/l0;

    invoke-static {v0, v1}, Ln0/g;->d(J)Ln0/g;

    move-result-object v5

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lu/l0;-><init>(FFLjava/lang/Object;ILy7/k;)V

    sput-object v8, LN/y;->d:Lu/l0;

    return-void
.end method

.method public static final synthetic a()Lu/o;
    .locals 1

    sget-object v0, LN/y;->a:Lu/o;

    return-object v0
.end method

.method public static final synthetic b(Lx7/a;LV/n;I)LV/G1;
    .locals 0

    invoke-static {p0, p1, p2}, LN/y;->f(Lx7/a;LV/n;I)LV/G1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LV/G1;)J
    .locals 2

    invoke-static {p0}, LN/y;->g(LV/G1;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final d(Landroidx/compose/ui/d;Lx7/a;Lx7/l;)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, LN/y$c;

    invoke-direct {v0, p1, p2}, LN/y$c;-><init>(Lx7/a;Lx7/l;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, v0, p1, p2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/d;Lx7/l;Lx7/q;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Lu/l0;
    .locals 1

    sget-object v0, LN/y;->d:Lu/l0;

    return-object v0
.end method

.method private static final f(Lx7/a;LV/n;I)LV/G1;
    .locals 9

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)"

    const v2, -0x5ec259b1

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p2, v1, :cond_1

    invoke-static {p0}, LV/v1;->e(Lx7/a;)LV/G1;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, LV/G1;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p0, v1, :cond_2

    new-instance p0, Lu/a;

    invoke-static {p2}, LN/y;->g(LV/G1;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/g;->d(J)Ln0/g;

    move-result-object v3

    sget-object v4, LN/y;->b:Lu/x0;

    sget-wide v1, LN/y;->c:J

    invoke-static {v1, v2}, Ln0/g;->d(J)Ln0/g;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Lu/a;-><init>(Ljava/lang/Object;Lu/x0;Ljava/lang/Object;Ljava/lang/String;ILy7/k;)V

    invoke-interface {p1, p0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p0, Lu/a;

    sget-object v1, Li7/M;->a:Li7/M;

    invoke-interface {p1, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_4

    :cond_3
    new-instance v3, LN/y$d;

    const/4 v0, 0x0

    invoke-direct {v3, p2, p0, v0}, LN/y$d;-><init>(LV/G1;Lu/a;Lm7/e;)V

    invoke-interface {p1, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lx7/p;

    const/4 p2, 0x6

    invoke-static {v1, v3, p1, p2}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-virtual {p0}, Lu/a;->g()LV/G1;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    return-object p0
.end method

.method private static final g(LV/G1;)J
    .locals 2

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln0/g;

    invoke-virtual {p0}, Ln0/g;->v()J

    move-result-wide v0

    return-wide v0
.end method
