.class final LN/H$b$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/H$b;->f(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
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

    iput-object p1, p0, LN/H$b$b;->D:LY0/e;

    iput-object p2, p0, LN/H$b$b;->E:LV/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lx7/a;)Landroidx/compose/ui/d;
    .locals 14

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    new-instance v1, LN/H$b$b$a;

    invoke-direct {v1, p1}, LN/H$b$b$a;-><init>(Lx7/a;)V

    new-instance v3, LN/H$b$b$b;

    iget-object p1, p0, LN/H$b$b;->D:LY0/e;

    iget-object v2, p0, LN/H$b$b;->E:LV/w0;

    invoke-direct {v3, p1, v2}, LN/H$b$b$b;-><init>(LY0/e;LV/w0;)V

    sget-object p1, Lv/W;->a:Lv/W$a;

    invoke-virtual {p1}, Lv/W$a;->a()Lv/W;

    move-result-object v11

    const/16 v12, 0x1ea

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v0 .. v13}, Lv/K;->f(Landroidx/compose/ui/d;Lx7/l;Lx7/l;Lx7/l;FZJFFZLv/W;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx7/a;

    invoke-virtual {p0, p1}, LN/H$b$b;->a(Lx7/a;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
