.class public abstract Lx/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lx7/q;

.field private static final b:Lx7/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx/n$a;-><init>(Lm7/e;)V

    sput-object v0, Lx/n;->a:Lx7/q;

    new-instance v0, Lx/n$b;

    invoke-direct {v0, v1}, Lx/n$b;-><init>(Lm7/e;)V

    sput-object v0, Lx/n;->b:Lx7/q;

    return-void
.end method

.method public static final a(Lx7/l;)Lx/o;
    .locals 1

    new-instance v0, Lx/i;

    invoke-direct {v0, p0}, Lx/i;-><init>(Lx7/l;)V

    return-object v0
.end method

.method public static final synthetic b()Lx7/q;
    .locals 1

    sget-object v0, Lx/n;->a:Lx7/q;

    return-object v0
.end method

.method public static final synthetic c()Lx7/q;
    .locals 1

    sget-object v0, Lx/n;->b:Lx7/q;

    return-object v0
.end method

.method public static final synthetic d(JLx/s;)F
    .locals 0

    invoke-static {p0, p1, p2}, Lx/n;->j(JLx/s;)F

    move-result p0

    return p0
.end method

.method public static final synthetic e(JLx/s;)F
    .locals 0

    invoke-static {p0, p1, p2}, Lx/n;->k(JLx/s;)F

    move-result p0

    return p0
.end method

.method public static final synthetic f(J)J
    .locals 0

    invoke-static {p0, p1}, Lx/n;->l(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final g(Landroidx/compose/ui/d;Lx/o;Lx/s;ZLz/l;ZLx7/q;Lx7/q;Z)Landroidx/compose/ui/d;
    .locals 10

    new-instance v9, Landroidx/compose/foundation/gestures/DraggableElement;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/DraggableElement;-><init>(Lx/o;Lx/s;ZLz/l;ZLx7/q;Lx7/q;Z)V

    move-object v0, p0

    invoke-interface {p0, v9}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Landroidx/compose/ui/d;Lx/o;Lx/s;ZLz/l;ZLx7/q;Lx7/q;ZILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 11

    .prologue
    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    move v5, v1

    goto :goto_0

    :cond_0
    move v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move v7, v2

    goto :goto_2

    :cond_2
    move/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    sget-object v1, Lx/n;->a:Lx7/q;

    move-object v8, v1

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    sget-object v1, Lx/n;->b:Lx7/q;

    move-object v9, v1

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_5

    move v10, v2

    goto :goto_5

    :cond_5
    move/from16 v10, p8

    :goto_5
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v2 .. v10}, Lx/n;->g(Landroidx/compose/ui/d;Lx/o;Lx/s;ZLz/l;ZLx7/q;Lx7/q;Z)Landroidx/compose/ui/d;

    move-result-object v0

    return-object v0
.end method

.method public static final i(Lx7/l;LV/n;I)Lx/o;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:135)"

    const v2, -0xaec199d

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 p2, p2, 0xe

    invoke-static {p0, p1, p2}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object p0

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_1

    new-instance p2, Lx/n$c;

    invoke-direct {p2, p0}, Lx/n$c;-><init>(LV/G1;)V

    invoke-static {p2}, Lx/n;->a(Lx7/l;)Lx/o;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, Lx/o;

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    return-object p2
.end method

.method private static final j(JLx/s;)F
    .locals 1

    .prologue
    sget-object v0, Lx/s;->C:Lx/s;

    if-ne p2, v0, :cond_0

    invoke-static {p0, p1}, Ln0/g;->n(J)F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Ln0/g;->m(J)F

    move-result p0

    :goto_0
    return p0
.end method

.method private static final k(JLx/s;)F
    .locals 1

    .prologue
    sget-object v0, Lx/s;->C:Lx/s;

    if-ne p2, v0, :cond_0

    invoke-static {p0, p1}, LY0/A;->i(J)F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LY0/A;->h(J)F

    move-result p0

    :goto_0
    return p0
.end method

.method private static final l(J)J
    .locals 3

    .prologue
    invoke-static {p0, p1}, LY0/A;->h(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LY0/A;->h(J)F

    move-result v0

    :goto_0
    invoke-static {p0, p1}, LY0/A;->i(J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p0, p1}, LY0/A;->i(J)F

    move-result v1

    :goto_1
    invoke-static {v0, v1}, LY0/B;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method
