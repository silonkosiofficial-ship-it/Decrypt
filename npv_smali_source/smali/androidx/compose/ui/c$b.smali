.class final Landroidx/compose/ui/c$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/c;->d(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/n;


# direct methods
.method constructor <init>(LV/n;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/c$b;->D:LV/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;Landroidx/compose/ui/d$b;)Landroidx/compose/ui/d;
    .locals 3

    .prologue
    instance-of v0, p2, Landroidx/compose/ui/b;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/compose/ui/b;

    invoke-virtual {p2}, Landroidx/compose/ui/b;->g()Lx7/q;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>"

    invoke-static {p2, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-static {p2, v0}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx7/q;

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    iget-object v1, p0, Landroidx/compose/ui/c$b;->D:LV/n;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p2, v0, v1, v2}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/compose/ui/d;

    iget-object v0, p0, Landroidx/compose/ui/c$b;->D:LV/n;

    invoke-static {v0, p2}, Landroidx/compose/ui/c;->a(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    :cond_0
    invoke-interface {p1, p2}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d;

    check-cast p2, Landroidx/compose/ui/d$b;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/c$b;->a(Landroidx/compose/ui/d;Landroidx/compose/ui/d$b;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
