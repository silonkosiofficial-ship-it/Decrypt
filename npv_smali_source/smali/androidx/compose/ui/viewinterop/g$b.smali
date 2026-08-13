.class final synthetic Landroidx/compose/ui/viewinterop/g$b;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/g;->Y(Landroidx/compose/ui/focus/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, Landroidx/compose/ui/viewinterop/g;

    const-string v4, "onExit"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Ly7/q;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/focus/d;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d;->o()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/g$b;->s(I)Landroidx/compose/ui/focus/n;

    move-result-object p1

    return-object p1
.end method

.method public final s(I)Landroidx/compose/ui/focus/n;
    .locals 1

    iget-object v0, p0, Ly7/f;->D:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/viewinterop/g;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/viewinterop/g;->V1(I)Landroidx/compose/ui/focus/n;

    move-result-object p1

    return-object p1
.end method
