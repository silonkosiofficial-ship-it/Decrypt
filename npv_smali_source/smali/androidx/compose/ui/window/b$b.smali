.class final Landroidx/compose/ui/window/b$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/r;Lx7/a;Landroidx/compose/ui/window/s;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/window/l;

.field final synthetic E:Lx7/a;

.field final synthetic F:Landroidx/compose/ui/window/s;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:LY0/v;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/l;Lx7/a;Landroidx/compose/ui/window/s;Ljava/lang/String;LY0/v;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/b$b;->D:Landroidx/compose/ui/window/l;

    iput-object p2, p0, Landroidx/compose/ui/window/b$b;->E:Lx7/a;

    iput-object p3, p0, Landroidx/compose/ui/window/b$b;->F:Landroidx/compose/ui/window/s;

    iput-object p4, p0, Landroidx/compose/ui/window/b$b;->G:Ljava/lang/String;

    iput-object p5, p0, Landroidx/compose/ui/window/b$b;->H:LY0/v;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 4

    iget-object p1, p0, Landroidx/compose/ui/window/b$b;->D:Landroidx/compose/ui/window/l;

    invoke-virtual {p1}, Landroidx/compose/ui/window/l;->s()V

    iget-object p1, p0, Landroidx/compose/ui/window/b$b;->D:Landroidx/compose/ui/window/l;

    iget-object v0, p0, Landroidx/compose/ui/window/b$b;->E:Lx7/a;

    iget-object v1, p0, Landroidx/compose/ui/window/b$b;->F:Landroidx/compose/ui/window/s;

    iget-object v2, p0, Landroidx/compose/ui/window/b$b;->G:Ljava/lang/String;

    iget-object v3, p0, Landroidx/compose/ui/window/b$b;->H:LY0/v;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroidx/compose/ui/window/l;->u(Lx7/a;Landroidx/compose/ui/window/s;Ljava/lang/String;LY0/v;)V

    iget-object p1, p0, Landroidx/compose/ui/window/b$b;->D:Landroidx/compose/ui/window/l;

    new-instance v0, Landroidx/compose/ui/window/b$b$a;

    invoke-direct {v0, p1}, Landroidx/compose/ui/window/b$b$a;-><init>(Landroidx/compose/ui/window/l;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/b$b;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
