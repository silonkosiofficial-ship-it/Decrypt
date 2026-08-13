.class final Lw/c$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/c$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lw/i;


# direct methods
.method constructor <init>(Lw/i;)V
    .locals 0

    iput-object p1, p0, Lw/c$b$a;->D:Lw/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    iget-object v0, p0, Lw/c$b$a;->D:Lw/i;

    new-instance v1, Lw/i$a$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lw/i$a$b;-><init>(JLy7/k;)V

    invoke-virtual {v0, v1}, Lw/i;->b(Lw/i$a;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lw/c$b$a;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
