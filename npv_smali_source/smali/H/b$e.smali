.class final LH/b$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/b;->b(Ljava/lang/String;Lx7/l;Landroidx/compose/ui/d;ZZLM0/P;LH/v;LH/u;ZIILS0/g0;Lx7/l;Lz/l;Lo0/n0;Lx7/q;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS0/V;

.field final synthetic E:LV/w0;


# direct methods
.method constructor <init>(LS0/V;LV/w0;)V
    .locals 0

    iput-object p1, p0, LH/b$e;->D:LS0/V;

    iput-object p2, p0, LH/b$e;->E:LV/w0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    iget-object v0, p0, LH/b$e;->D:LS0/V;

    invoke-virtual {v0}, LS0/V;->h()J

    move-result-wide v0

    iget-object v2, p0, LH/b$e;->E:LV/w0;

    invoke-static {v2}, LH/b;->g(LV/w0;)LS0/V;

    move-result-object v2

    invoke-virtual {v2}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LM0/N;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LH/b$e;->D:LS0/V;

    invoke-virtual {v0}, LS0/V;->g()LM0/N;

    move-result-object v0

    iget-object v1, p0, LH/b$e;->E:LV/w0;

    invoke-static {v1}, LH/b;->g(LV/w0;)LS0/V;

    move-result-object v1

    invoke-virtual {v1}, LS0/V;->g()LM0/N;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, LH/b$e;->E:LV/w0;

    iget-object v1, p0, LH/b$e;->D:LS0/V;

    invoke-static {v0, v1}, LH/b;->h(LV/w0;LS0/V;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LH/b$e;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
