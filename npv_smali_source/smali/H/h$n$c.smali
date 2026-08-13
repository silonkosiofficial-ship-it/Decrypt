.class final LH/h$n$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h$n;->a(LK0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/w;

.field final synthetic E:LK0/w;


# direct methods
.method constructor <init>(LH/w;LK0/w;)V
    .locals 0

    iput-object p1, p0, LH/h$n$c;->D:LH/w;

    iput-object p2, p0, LH/h$n$c;->E:LK0/w;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LM0/d;)Ljava/lang/Boolean;
    .locals 9

    .prologue
    const/4 v0, 0x1

    iget-object v1, p0, LH/h$n$c;->D:LH/w;

    invoke-virtual {v1}, LH/w;->g()LS0/d0;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, LH/h$n$c;->D:LH/w;

    sget-object v3, LH/H;->a:LH/H$a;

    new-instance v4, LS0/f;

    invoke-direct {v4}, LS0/f;-><init>()V

    new-instance v5, LS0/a;

    invoke-direct {v5, p1, v0}, LS0/a;-><init>(LM0/d;I)V

    const/4 v6, 0x2

    new-array v6, v6, [LS0/i;

    const/4 v7, 0x0

    aput-object v4, v6, v7

    aput-object v5, v6, v0

    invoke-static {v6}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2}, LH/w;->n()LS0/k;

    move-result-object v4

    invoke-virtual {v2}, LH/w;->m()Lx7/l;

    move-result-object v2

    invoke-virtual {v3, v0, v4, v2, v1}, LH/H$a;->g(Ljava/util/List;LS0/k;Lx7/l;LS0/d0;)V

    sget-object v0, Li7/M;->a:Li7/M;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, LH/h$n$c;->D:LH/w;

    invoke-virtual {v0}, LH/w;->m()Lx7/l;

    move-result-object v0

    new-instance v8, LS0/V;

    invoke-virtual {p1}, LM0/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LM0/d;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, LM0/O;->a(I)J

    move-result-wide v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LS0/V;-><init>(Ljava/lang/String;JLM0/N;ILy7/k;)V

    invoke-interface {v0, v8}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM0/d;

    invoke-virtual {p0, p1}, LH/h$n$c;->a(LM0/d;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
