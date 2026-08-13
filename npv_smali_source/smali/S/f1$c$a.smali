.class final LS/f1$c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/f1$c;->e(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/G1;


# direct methods
.method constructor <init>(LV/G1;)V
    .locals 0

    iput-object p1, p0, LS/f1$c$a;->D:LV/G1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LY0/e;)J
    .locals 2

    iget-object v0, p0, LS/f1$c$a;->D:LV/G1;

    invoke-static {v0}, LS/f1$c;->a(LV/G1;)F

    move-result v0

    invoke-interface {p1, v0}, LY0/e;->S0(F)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, LY0/q;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/e;

    invoke-virtual {p0, p1}, LS/f1$c$a;->a(LY0/e;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->b(J)LY0/p;

    move-result-object p1

    return-object p1
.end method
