.class final LD/v$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/v$a;->a(Le0/d;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD/q;

.field final synthetic E:Lx7/p;


# direct methods
.method constructor <init>(LD/q;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LD/v$a$b;->D:LD/q;

    iput-object p2, p0, LD/v$a$b;->E:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/j0;J)LD0/K;
    .locals 2

    new-instance v0, LD/x;

    iget-object v1, p0, LD/v$a$b;->D:LD/q;

    invoke-direct {v0, v1, p1}, LD/x;-><init>(LD/q;LD0/j0;)V

    iget-object p1, p0, LD/v$a$b;->E:Lx7/p;

    invoke-static {p2, p3}, LY0/b;->a(J)LY0/b;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD0/K;

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LD0/j0;

    check-cast p2, LY0/b;

    invoke-virtual {p2}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LD/v$a$b;->a(LD0/j0;J)LD0/K;

    move-result-object p1

    return-object p1
.end method
