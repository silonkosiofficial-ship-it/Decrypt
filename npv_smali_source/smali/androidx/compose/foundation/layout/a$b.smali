.class public final Landroidx/compose/foundation/layout/a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/a;->e(Landroidx/compose/ui/d;LD0/a;FF)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/a;

.field final synthetic E:F

.field final synthetic F:F


# direct methods
.method public constructor <init>(LD0/a;FF)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/a$b;->D:LD0/a;

    iput p2, p0, Landroidx/compose/foundation/layout/a$b;->E:F

    iput p3, p0, Landroidx/compose/foundation/layout/a$b;->F:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/G0;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/a$b;->a(Landroidx/compose/ui/platform/G0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
