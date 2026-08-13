.class final Landroidx/compose/ui/window/a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/a;->a(Lx7/a;Landroidx/compose/ui/window/i;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/window/k;

.field final synthetic E:Lx7/a;

.field final synthetic F:Landroidx/compose/ui/window/i;

.field final synthetic G:LY0/v;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/k;Lx7/a;Landroidx/compose/ui/window/i;LY0/v;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/a$b;->D:Landroidx/compose/ui/window/k;

    iput-object p2, p0, Landroidx/compose/ui/window/a$b;->E:Lx7/a;

    iput-object p3, p0, Landroidx/compose/ui/window/a$b;->F:Landroidx/compose/ui/window/i;

    iput-object p4, p0, Landroidx/compose/ui/window/a$b;->G:LY0/v;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/window/a$b;->D:Landroidx/compose/ui/window/k;

    iget-object v1, p0, Landroidx/compose/ui/window/a$b;->E:Lx7/a;

    iget-object v2, p0, Landroidx/compose/ui/window/a$b;->F:Landroidx/compose/ui/window/i;

    iget-object v3, p0, Landroidx/compose/ui/window/a$b;->G:LY0/v;

    invoke-virtual {v0, v1, v2, v3}, Landroidx/compose/ui/window/k;->q(Lx7/a;Landroidx/compose/ui/window/i;LY0/v;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/window/a$b;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
