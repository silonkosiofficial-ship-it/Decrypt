.class final Landroidx/compose/ui/platform/x$o;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/x;-><init>(Landroidx/compose/ui/platform/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/platform/x;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/x;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/x$o;->D:Landroidx/compose/ui/platform/x;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/n1;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/x$o;->D:Landroidx/compose/ui/platform/x;

    invoke-static {v0, p1}, Landroidx/compose/ui/platform/x;->H(Landroidx/compose/ui/platform/x;Landroidx/compose/ui/platform/n1;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/platform/n1;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/x$o;->a(Landroidx/compose/ui/platform/n1;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
