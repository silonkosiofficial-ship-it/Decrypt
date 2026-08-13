.class final LK/a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/a;->g(LS0/V;LS0/s;Lx7/l;Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS0/V;

.field final synthetic E:LK/a;

.field final synthetic F:LS0/s;

.field final synthetic G:Lx7/l;

.field final synthetic H:Lx7/l;


# direct methods
.method constructor <init>(LS0/V;LK/a;LS0/s;Lx7/l;Lx7/l;)V
    .locals 0

    iput-object p1, p0, LK/a$a;->D:LS0/V;

    iput-object p2, p0, LK/a$a;->E:LK/a;

    iput-object p3, p0, LK/a$a;->F:LS0/s;

    iput-object p4, p0, LK/a$a;->G:Lx7/l;

    iput-object p5, p0, LK/a$a;->H:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK/s0;)V
    .locals 6

    iget-object v1, p0, LK/a$a;->D:LS0/V;

    iget-object v0, p0, LK/a$a;->E:LK/a;

    invoke-virtual {v0}, LK/q0;->i()LK/q0$a;

    move-result-object v2

    iget-object v3, p0, LK/a$a;->F:LS0/s;

    iget-object v4, p0, LK/a$a;->G:Lx7/l;

    iget-object v5, p0, LK/a$a;->H:Lx7/l;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, LK/s0;->l(LS0/V;LK/q0$a;LS0/s;Lx7/l;Lx7/l;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK/s0;

    invoke-virtual {p0, p1}, LK/a$a;->a(LK/s0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
