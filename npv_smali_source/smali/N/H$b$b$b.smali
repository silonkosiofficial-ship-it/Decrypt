.class final LN/H$b$b$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/H$b$b;->a(Lx7/a;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LY0/e;

.field final synthetic E:LV/w0;


# direct methods
.method constructor <init>(LY0/e;LV/w0;)V
    .locals 0

    iput-object p1, p0, LN/H$b$b$b;->D:LY0/e;

    iput-object p2, p0, LN/H$b$b$b;->E:LV/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    iget-object v0, p0, LN/H$b$b$b;->E:LV/w0;

    iget-object v1, p0, LN/H$b$b$b;->D:LY0/e;

    invoke-static {p1, p2}, LY0/l;->h(J)F

    move-result v2

    invoke-interface {v1, v2}, LY0/e;->S0(F)I

    move-result v2

    invoke-static {p1, p2}, LY0/l;->g(J)F

    move-result p1

    invoke-interface {v1, p1}, LY0/e;->S0(F)I

    move-result p1

    invoke-static {v2, p1}, LY0/u;->a(II)J

    move-result-wide p1

    invoke-static {v0, p1, p2}, LN/H$b;->e(LV/w0;J)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/l;

    invoke-virtual {p1}, LY0/l;->k()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/H$b$b$b;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
