.class final LD0/i0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/i0;-><init>(LD0/k0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/i0;


# direct methods
.method constructor <init>(LD0/i0;)V
    .locals 0

    iput-object p1, p0, LD0/i0$c;->D:LD0/i0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/J;Lx7/p;)V
    .locals 1

    iget-object v0, p0, LD0/i0$c;->D:LD0/i0;

    invoke-static {v0}, LD0/i0;->b(LD0/i0;)LD0/C;

    move-result-object v0

    invoke-virtual {v0, p2}, LD0/C;->u(Lx7/p;)LD0/I;

    move-result-object p2

    invoke-virtual {p1, p2}, LF0/J;->e(LD0/I;)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/J;

    check-cast p2, Lx7/p;

    invoke-virtual {p0, p1, p2}, LD0/i0$c;->a(LF0/J;Lx7/p;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
