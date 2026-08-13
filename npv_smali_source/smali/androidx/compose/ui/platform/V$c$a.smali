.class final Landroidx/compose/ui/platform/V$c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/V$c;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/platform/C0;

.field final synthetic E:Landroidx/compose/ui/platform/V;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/C0;Landroidx/compose/ui/platform/V;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/V$c$a;->D:Landroidx/compose/ui/platform/C0;

    iput-object p2, p0, Landroidx/compose/ui/platform/V$c$a;->E:Landroidx/compose/ui/platform/V;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/platform/V$c$a;->D:Landroidx/compose/ui/platform/C0;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/C0;->d()V

    iget-object p1, p0, Landroidx/compose/ui/platform/V$c$a;->E:Landroidx/compose/ui/platform/V;

    invoke-static {p1}, Landroidx/compose/ui/platform/V;->d(Landroidx/compose/ui/platform/V;)LS0/X;

    move-result-object p1

    invoke-virtual {p1}, LS0/X;->f()V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/V$c$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
