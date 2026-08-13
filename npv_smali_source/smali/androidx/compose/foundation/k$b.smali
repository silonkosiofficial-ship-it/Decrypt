.class public final Landroidx/compose/foundation/k$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/k;->b(Landroidx/compose/ui/d;Landroidx/compose/foundation/m;ZLx/p;ZZ)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/m;

.field final synthetic E:Z

.field final synthetic F:Lx/p;

.field final synthetic G:Z

.field final synthetic H:Z


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/m;ZLx/p;ZZ)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/k$b;->D:Landroidx/compose/foundation/m;

    iput-boolean p2, p0, Landroidx/compose/foundation/k$b;->E:Z

    iput-object p3, p0, Landroidx/compose/foundation/k$b;->F:Lx/p;

    iput-boolean p4, p0, Landroidx/compose/foundation/k$b;->G:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/k$b;->H:Z

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

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/k$b;->a(Landroidx/compose/ui/platform/G0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
