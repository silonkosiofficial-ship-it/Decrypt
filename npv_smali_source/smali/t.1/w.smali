.class public abstract Lt/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lu/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1, v0}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    sput-object v0, Lt/w;->a:Lu/l0;

    return-void
.end method

.method public static final a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;
    .locals 10

    .prologue
    move-object v6, p5

    move/from16 v0, p6

    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_0

    sget-object v1, Lt/w;->a:Lu/l0;

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object v2, p2

    :goto_0
    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_1

    const-string v1, "ColorAnimation"

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, p3

    :goto_1
    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, p4

    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, -0x1

    const-string v3, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)"

    const v7, -0x1aef6ee4

    invoke-static {v7, v0, v1, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_3
    invoke-static {p0, p1}, Lo0/y0;->r(J)Lp0/c;

    move-result-object v1

    invoke-interface {p5, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_4

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_5

    :cond_4
    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-static {v1}, Lt/j;->a(Lo0/y0$a;)Lx7/l;

    move-result-object v1

    invoke-static {p0, p1}, Lo0/y0;->r(J)Lp0/c;

    move-result-object v3

    invoke-interface {v1, v3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lu/x0;

    invoke-interface {p5, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v1, v3

    check-cast v1, Lu/x0;

    invoke-static {p0, p1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v3

    and-int/lit8 v7, v0, 0xe

    shl-int/lit8 v8, v0, 0x3

    and-int/lit16 v8, v8, 0x380

    or-int/2addr v7, v8

    shl-int/lit8 v0, v0, 0x6

    const v8, 0xe000

    and-int/2addr v8, v0

    or-int/2addr v7, v8

    const/high16 v8, 0x70000

    and-int/2addr v0, v8

    or-int/2addr v7, v0

    const/16 v8, 0x8

    const/4 v9, 0x0

    move-object v0, v3

    move-object v3, v9

    move-object v6, p5

    invoke-static/range {v0 .. v8}, Lu/c;->e(Ljava/lang/Object;Lu/x0;Lu/j;Ljava/lang/Object;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object v0

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LV/q;->P()V

    :cond_6
    return-object v0
.end method
