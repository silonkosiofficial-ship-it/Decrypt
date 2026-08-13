.class final LS/q1$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->d(Landroidx/compose/ui/d;LS/c;IZLV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/w0;

.field final synthetic E:LV/w0;


# direct methods
.method constructor <init>(LV/w0;LV/w0;)V
    .locals 0

    iput-object p1, p0, LS/q1$g;->D:LV/w0;

    iput-object p2, p0, LS/q1$g;->E:LV/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/t;)V
    .locals 3

    .prologue
    iget-object v0, p0, LS/q1$g;->D:LV/w0;

    invoke-interface {p1}, LD0/t;->H()LD0/t;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, LD0/t;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/u;->b(J)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    sget-object v1, LY0/p;->b:LY0/p$a;

    invoke-virtual {v1}, LY0/p$a;->a()J

    move-result-wide v1

    :goto_0
    invoke-static {v0, v1, v2}, LS/q1;->A(LV/w0;J)V

    iget-object v0, p0, LS/q1$g;->E:LV/w0;

    invoke-static {p1}, LD0/u;->a(LD0/t;)Ln0/i;

    move-result-object p1

    invoke-virtual {p1}, Ln0/i;->g()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, LS/q1;->y(LV/w0;J)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/t;

    invoke-virtual {p0, p1}, LS/q1$g;->a(LD0/t;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
