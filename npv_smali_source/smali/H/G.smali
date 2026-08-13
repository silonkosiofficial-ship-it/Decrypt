.class public abstract LH/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lu/j;

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget-object v0, LH/G$b;->D:LH/G$b;

    invoke-static {v0}, Lu/k;->f(Lx7/l;)Lu/W;

    move-result-object v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v6}, Lu/k;->e(Lu/E;Lu/f0;JILjava/lang/Object;)Lu/Q;

    move-result-object v0

    sput-object v0, LH/G;->a:Lu/j;

    const/4 v0, 0x2

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LH/G;->b:F

    return-void
.end method

.method public static final a(Landroidx/compose/ui/d;LH/w;LS0/V;LS0/L;Lo0/n0;Z)Landroidx/compose/ui/d;
    .locals 0

    .prologue
    if-eqz p5, :cond_0

    new-instance p5, LH/G$a;

    invoke-direct {p5, p4, p1, p2, p3}, LH/G$a;-><init>(Lo0/n0;LH/w;LS0/V;LS0/L;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, p5, p1, p2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/d;Lx7/l;Lx7/q;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final b()F
    .locals 1

    sget v0, LH/G;->b:F

    return v0
.end method
