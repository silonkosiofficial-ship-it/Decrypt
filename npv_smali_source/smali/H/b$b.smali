.class final LH/b$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/b;->a(LS0/V;Lx7/l;Landroidx/compose/ui/d;ZZLM0/P;LH/v;LH/u;ZIILS0/g0;Lx7/l;Lz/l;Lo0/n0;Lx7/q;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS0/V;

.field final synthetic E:Lx7/l;


# direct methods
.method constructor <init>(LS0/V;Lx7/l;)V
    .locals 0

    iput-object p1, p0, LH/b$b;->D:LS0/V;

    iput-object p2, p0, LH/b$b;->E:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS0/V;)V
    .locals 1

    .prologue
    iget-object v0, p0, LH/b$b;->D:LS0/V;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LH/b$b;->E:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS0/V;

    invoke-virtual {p0, p1}, LH/b$b;->a(LS0/V;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
