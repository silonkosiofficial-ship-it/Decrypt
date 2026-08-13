.class final LS/e$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/e;->a(ZLx7/a;Landroidx/compose/ui/d;JLandroidx/compose/foundation/m;Landroidx/compose/ui/window/s;Lo0/e2;JFFLv/g;Lx7/q;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/w0;


# direct methods
.method constructor <init>(LV/w0;)V
    .locals 0

    iput-object p1, p0, LS/e$c;->D:LV/w0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LY0/r;LY0/r;)V
    .locals 1

    iget-object v0, p0, LS/e$c;->D:LV/w0;

    invoke-static {p1, p2}, LS/s0;->h(LY0/r;LY0/r;)J

    move-result-wide p1

    invoke-static {p1, p2}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY0/r;

    check-cast p2, LY0/r;

    invoke-virtual {p0, p1, p2}, LS/e$c;->a(LY0/r;LY0/r;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
