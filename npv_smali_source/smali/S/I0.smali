.class public abstract LS/I0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LV/O0;

.field private static final b:LV/O0;

.field private static final c:LS/J0;

.field private static final d:LS/J0;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    sget-object v0, LS/I0$b;->D:LS/I0$b;

    invoke-static {v0}, LV/y;->f(Lx7/a;)LV/O0;

    move-result-object v0

    sput-object v0, LS/I0;->a:LV/O0;

    sget-object v0, LS/I0$a;->D:LS/I0$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LV/y;->d(LV/u1;Lx7/a;ILjava/lang/Object;)LV/O0;

    move-result-object v0

    sput-object v0, LS/I0;->b:LV/O0;

    new-instance v0, LS/J0;

    sget-object v7, LY0/i;->D:LY0/i$a;

    invoke-virtual {v7}, LY0/i$a;->c()F

    move-result v3

    sget-object v8, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v8}, Lo0/y0$a;->g()J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v2, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LS/J0;-><init>(ZFJLy7/k;)V

    sput-object v0, LS/I0;->c:LS/J0;

    new-instance v0, LS/J0;

    invoke-virtual {v7}, LY0/i$a;->c()F

    move-result v11

    invoke-virtual {v8}, Lo0/y0$a;->g()J

    move-result-wide v12

    const/4 v14, 0x0

    const/4 v10, 0x0

    move-object v9, v0

    invoke-direct/range {v9 .. v14}, LS/J0;-><init>(ZFJLy7/k;)V

    sput-object v0, LS/I0;->d:LS/J0;

    return-void
.end method

.method public static final a()LV/O0;
    .locals 1

    sget-object v0, LS/I0;->b:LV/O0;

    return-object v0
.end method

.method public static final b(ZFJ)Lv/I;
    .locals 7

    .prologue
    sget-object v0, LY0/i;->D:LY0/i$a;

    invoke-virtual {v0}, LY0/i$a;->c()F

    move-result v0

    invoke-static {p1, v0}, LY0/i;->s(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v0}, Lo0/y0$a;->g()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    sget-object p0, LS/I0;->c:LS/J0;

    return-object p0

    :cond_0
    sget-object p0, LS/I0;->d:LS/J0;

    goto :goto_0

    :cond_1
    new-instance v6, LS/J0;

    const/4 v5, 0x0

    move-object v0, v6

    move v1, p0

    move v2, p1

    move-wide v3, p2

    invoke-direct/range {v0 .. v5}, LS/J0;-><init>(ZFJLy7/k;)V

    move-object p0, v6

    :goto_0
    return-object p0
.end method

.method public static final c(ZFJLV/n;II)Lv/G;
    .locals 7

    .prologue
    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    :cond_0
    move v0, p0

    and-int/lit8 p0, p6, 0x2

    if-eqz p0, :cond_1

    sget-object p0, LY0/i;->D:LY0/i$a;

    invoke-virtual {p0}, LY0/i$a;->c()F

    move-result p1

    :cond_1
    move v1, p1

    and-int/lit8 p0, p6, 0x4

    if-eqz p0, :cond_2

    sget-object p0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {p0}, Lo0/y0$a;->g()J

    move-result-wide p2

    :cond_2
    move-wide v2, p2

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, -0x1

    const-string p1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)"

    const p2, -0x4e6dbd0b

    invoke-static {p2, p5, p0, p1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_3
    const p0, -0x4c54e819

    invoke-interface {p4, p0}, LV/n;->T(I)V

    sget-object p0, LS/I0;->a:LV/O0;

    invoke-interface {p4, p0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_4

    and-int/lit16 v5, p5, 0x3fe

    const/4 v6, 0x0

    move-object v4, p4

    invoke-static/range {v0 .. v6}, LR/p;->f(ZFJLV/n;II)Lv/G;

    move-result-object p0

    goto :goto_0

    :cond_4
    invoke-static {v0, v1, v2, v3}, LS/I0;->b(ZFJ)Lv/I;

    move-result-object p0

    :goto_0
    invoke-interface {p4}, LV/n;->J()V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    return-object p0
.end method
