.class final synthetic Landroidx/compose/ui/platform/r$i;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/r;-><init>(Landroid/content/Context;Lm7/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, Landroidx/compose/ui/platform/r;

    const-string v4, "registerOnEndApplyChangesListener"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Ly7/q;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx7/a;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/r$i;->s(Lx7/a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final s(Lx7/a;)V
    .locals 1

    iget-object v0, p0, Ly7/f;->D:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/r;->x(Lx7/a;)V

    return-void
.end method
