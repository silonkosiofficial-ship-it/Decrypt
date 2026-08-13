.class final Landroidx/compose/ui/window/b$f;
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


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/b$f;->D:Landroidx/compose/ui/window/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/t;)V
    .locals 1

    invoke-interface {p1}, LD0/t;->b0()LD0/t;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/compose/ui/window/b$f;->D:Landroidx/compose/ui/window/l;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/window/l;->w(LD0/t;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/t;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/b$f;->a(LD0/t;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
