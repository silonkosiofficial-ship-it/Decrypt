.class final Landroidx/compose/ui/platform/V$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/V;->b(Landroidx/compose/ui/platform/Q0;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/platform/Q0;

.field final synthetic E:Landroidx/compose/ui/platform/V;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/Q0;Landroidx/compose/ui/platform/V;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/V$b;->D:Landroidx/compose/ui/platform/Q0;

    iput-object p2, p0, Landroidx/compose/ui/platform/V$b;->E:Landroidx/compose/ui/platform/V;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LW8/N;)Landroidx/compose/ui/platform/C0;
    .locals 3

    new-instance p1, Landroidx/compose/ui/platform/C0;

    iget-object v0, p0, Landroidx/compose/ui/platform/V$b;->D:Landroidx/compose/ui/platform/Q0;

    new-instance v1, Landroidx/compose/ui/platform/V$b$a;

    iget-object v2, p0, Landroidx/compose/ui/platform/V$b;->E:Landroidx/compose/ui/platform/V;

    invoke-direct {v1, v2}, Landroidx/compose/ui/platform/V$b$a;-><init>(Landroidx/compose/ui/platform/V;)V

    invoke-direct {p1, v0, v1}, Landroidx/compose/ui/platform/C0;-><init>(Landroidx/compose/ui/platform/Q0;Lx7/a;)V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/V$b;->a(LW8/N;)Landroidx/compose/ui/platform/C0;

    move-result-object p1

    return-object p1
.end method
