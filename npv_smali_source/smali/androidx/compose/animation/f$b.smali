.class final Landroidx/compose/animation/f$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/animation/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/animation/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/f$b;

    invoke-direct {v0}, Landroidx/compose/animation/f$b;-><init>()V

    sput-object v0, Landroidx/compose/animation/f$b;->D:Landroidx/compose/animation/f$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/o;)J
    .locals 2

    invoke-virtual {p1}, Lu/o;->f()F

    move-result v0

    invoke-virtual {p1}, Lu/o;->g()F

    move-result p1

    invoke-static {v0, p1}, Lo0/m2;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lu/o;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/f$b;->a(Lu/o;)J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object p1

    return-object p1
.end method
