.class final LH/h$v;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h;->p(Landroidx/compose/ui/d;LH/w;LN/F;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/w;

.field final synthetic E:LN/F;


# direct methods
.method constructor <init>(LH/w;LN/F;)V
    .locals 0

    iput-object p1, p0, LH/h$v;->D:LH/w;

    iput-object p2, p0, LH/h$v;->E:LN/F;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 2

    .prologue
    iget-object v0, p0, LH/h$v;->D:LH/w;

    invoke-virtual {v0}, LH/w;->d()LH/l;

    move-result-object v0

    sget-object v1, LH/l;->D:LH/l;

    if-ne v0, v1, :cond_0

    invoke-static {p1}, LH/p;->a(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LH/h$v;->E:LN/F;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LN/F;->u(LN/F;Ln0/g;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx0/b;

    invoke-virtual {p1}, Lx0/b;->f()Landroid/view/KeyEvent;

    move-result-object p1

    invoke-virtual {p0, p1}, LH/h$v;->a(Landroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
