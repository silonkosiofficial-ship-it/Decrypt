.class final Landroidx/compose/ui/window/b$d;
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

.field final synthetic E:Landroidx/compose/ui/window/r;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/l;Landroidx/compose/ui/window/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/b$d;->D:Landroidx/compose/ui/window/l;

    iput-object p2, p0, Landroidx/compose/ui/window/b$d;->E:Landroidx/compose/ui/window/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 1

    iget-object p1, p0, Landroidx/compose/ui/window/b$d;->D:Landroidx/compose/ui/window/l;

    iget-object v0, p0, Landroidx/compose/ui/window/b$d;->E:Landroidx/compose/ui/window/r;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/window/l;->setPositionProvider(Landroidx/compose/ui/window/r;)V

    iget-object p1, p0, Landroidx/compose/ui/window/b$d;->D:Landroidx/compose/ui/window/l;

    invoke-virtual {p1}, Landroidx/compose/ui/window/l;->y()V

    new-instance p1, Landroidx/compose/ui/window/b$d$a;

    invoke-direct {p1}, Landroidx/compose/ui/window/b$d$a;-><init>()V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/b$d;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
