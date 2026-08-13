.class final LN/s$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/s;->h(Lz0/c;LN/h;LN/d;Lz0/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/h;

.field final synthetic E:LN/q;


# direct methods
.method constructor <init>(LN/h;LN/q;)V
    .locals 0

    iput-object p1, p0, LN/s$d;->D:LN/h;

    iput-object p2, p0, LN/s$d;->E:LN/q;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/B;)V
    .locals 4

    .prologue
    iget-object v0, p0, LN/s$d;->D:LN/h;

    invoke-virtual {p1}, Lz0/B;->h()J

    move-result-wide v1

    iget-object v3, p0, LN/s$d;->E:LN/q;

    invoke-interface {v0, v1, v2, v3}, LN/h;->c(JLN/q;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lz0/B;->a()V

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/B;

    invoke-virtual {p0, p1}, LN/s$d;->a(Lz0/B;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
