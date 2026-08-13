.class final Landroidx/compose/ui/focus/FocusTargetNode$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/FocusTargetNode;->f2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/O;

.field final synthetic E:Landroidx/compose/ui/focus/FocusTargetNode;


# direct methods
.method constructor <init>(Ly7/O;Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusTargetNode$b;->D:Ly7/O;

    iput-object p2, p0, Landroidx/compose/ui/focus/FocusTargetNode$b;->E:Landroidx/compose/ui/focus/FocusTargetNode;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode$b;->D:Ly7/O;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusTargetNode$b;->E:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusTargetNode;->Y1()Landroidx/compose/ui/focus/j;

    move-result-object v1

    iput-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode$b;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
