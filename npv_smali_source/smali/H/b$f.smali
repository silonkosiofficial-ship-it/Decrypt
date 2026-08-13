.class final LH/b$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/b;->b(Ljava/lang/String;Lx7/l;Landroidx/compose/ui/d;ZZLM0/P;LH/v;LH/u;ZIILS0/g0;Lx7/l;Lz/l;Lo0/n0;Lx7/q;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;

.field final synthetic E:LV/w0;

.field final synthetic F:LV/w0;


# direct methods
.method constructor <init>(Lx7/l;LV/w0;LV/w0;)V
    .locals 0

    iput-object p1, p0, LH/b$f;->D:Lx7/l;

    iput-object p2, p0, LH/b$f;->E:LV/w0;

    iput-object p3, p0, LH/b$f;->F:LV/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS0/V;)V
    .locals 3

    .prologue
    iget-object v0, p0, LH/b$f;->E:LV/w0;

    invoke-static {v0, p1}, LH/b;->h(LV/w0;LS0/V;)V

    iget-object v0, p0, LH/b$f;->F:LV/w0;

    invoke-static {v0}, LH/b;->i(LV/w0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LH/b$f;->F:LV/w0;

    invoke-virtual {p1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LH/b;->j(LV/w0;Ljava/lang/String;)V

    if-eqz v0, :cond_0

    iget-object v0, p0, LH/b$f;->D:Lx7/l;

    invoke-virtual {p1}, LS0/V;->i()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS0/V;

    invoke-virtual {p0, p1}, LH/b$f;->a(LS0/V;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
