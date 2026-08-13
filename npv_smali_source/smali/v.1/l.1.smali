.class public abstract Lv/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:Landroidx/compose/ui/d;

.field private static final c:Landroidx/compose/ui/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x1e

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, Lv/l;->a:F

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    new-instance v1, Lv/l$a;

    invoke-direct {v1}, Lv/l$a;-><init>()V

    invoke-static {v0, v1}, Ll0/e;->a(Landroidx/compose/ui/d;Lo0/e2;)Landroidx/compose/ui/d;

    move-result-object v1

    sput-object v1, Lv/l;->b:Landroidx/compose/ui/d;

    new-instance v1, Lv/l$b;

    invoke-direct {v1}, Lv/l$b;-><init>()V

    invoke-static {v0, v1}, Ll0/e;->a(Landroidx/compose/ui/d;Lo0/e2;)Landroidx/compose/ui/d;

    move-result-object v0

    sput-object v0, Lv/l;->c:Landroidx/compose/ui/d;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/d;Lx/s;)Landroidx/compose/ui/d;
    .locals 1

    .prologue
    sget-object v0, Lx/s;->C:Lx/s;

    if-ne p1, v0, :cond_0

    sget-object p1, Lv/l;->c:Landroidx/compose/ui/d;

    goto :goto_0

    :cond_0
    sget-object p1, Lv/l;->b:Landroidx/compose/ui/d;

    :goto_0
    invoke-interface {p0, p1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final b()F
    .locals 1

    sget v0, Lv/l;->a:F

    return v0
.end method
