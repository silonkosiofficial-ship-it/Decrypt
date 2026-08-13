.class final Landroidx/compose/ui/focus/FocusOwnerImpl$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/FocusOwnerImpl;->i(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/O;

.field final synthetic E:I


# direct methods
.method constructor <init>(Ly7/O;I)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$f;->D:Ly7/O;

    iput p2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$f;->E:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$f;->D:Ly7/O;

    iget v1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$f;->E:I

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/r;->k(Landroidx/compose/ui/focus/FocusTargetNode;I)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Ly7/O;->C:Ljava/lang/Object;

    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$f;->D:Ly7/O;

    iget-object p1, p1, Ly7/O;->C:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$f;->a(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
