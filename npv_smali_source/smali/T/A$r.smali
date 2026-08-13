.class final LT/A$r;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/A;->u(Landroidx/compose/ui/d;Lo0/B0;Lo0/e2;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lo0/e2;

.field final synthetic E:Lo0/B0;


# direct methods
.method constructor <init>(Lo0/e2;Lo0/B0;)V
    .locals 0

    iput-object p1, p0, LT/A$r;->D:Lo0/e2;

    iput-object p2, p0, LT/A$r;->E:Lo0/B0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ll0/d;)Ll0/h;
    .locals 4

    iget-object v0, p0, LT/A$r;->D:Lo0/e2;

    invoke-virtual {p1}, Ll0/d;->i()J

    move-result-wide v1

    invoke-virtual {p1}, Ll0/d;->getLayoutDirection()LY0/v;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3, p1}, Lo0/e2;->a(JLY0/v;LY0/e;)Lo0/L1;

    move-result-object v0

    new-instance v1, LT/A$r$a;

    iget-object v2, p0, LT/A$r;->E:Lo0/B0;

    invoke-direct {v1, v0, v2}, LT/A$r$a;-><init>(Lo0/L1;Lo0/B0;)V

    invoke-virtual {p1, v1}, Ll0/d;->k(Lx7/l;)Ll0/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll0/d;

    invoke-virtual {p0, p1}, LT/A$r;->a(Ll0/d;)Ll0/h;

    move-result-object p1

    return-object p1
.end method
