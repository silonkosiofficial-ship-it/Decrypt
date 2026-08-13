.class final Landroidx/compose/animation/f$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/f;->e(Lu/s0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;LV/n;I)Lt/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/animation/f$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/f$h;

    invoke-direct {v0}, Landroidx/compose/animation/f$h;-><init>()V

    sput-object v0, Landroidx/compose/animation/f$h;->D:Landroidx/compose/animation/f$h;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/s0$b;)Lu/I;
    .locals 2

    const/4 p1, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-static {v1, v1, p1, v0, p1}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/s0$b;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/f$h;->a(Lu/s0$b;)Lu/I;

    move-result-object p1

    return-object p1
.end method
