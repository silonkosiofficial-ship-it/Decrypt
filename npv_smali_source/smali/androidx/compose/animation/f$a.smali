.class final Landroidx/compose/animation/f$a;
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
.field public static final D:Landroidx/compose/animation/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/f$a;

    invoke-direct {v0}, Landroidx/compose/animation/f$a;-><init>()V

    sput-object v0, Landroidx/compose/animation/f$a;->D:Landroidx/compose/animation/f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)Lu/o;
    .locals 2

    new-instance v0, Lu/o;

    invoke-static {p1, p2}, Landroidx/compose/ui/graphics/f;->f(J)F

    move-result v1

    invoke-static {p1, p2}, Landroidx/compose/ui/graphics/f;->g(J)F

    move-result p1

    invoke-direct {v0, v1, p1}, Lu/o;-><init>(FF)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/graphics/f;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/f;->j()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/animation/f$a;->a(J)Lu/o;

    move-result-object p1

    return-object p1
.end method
