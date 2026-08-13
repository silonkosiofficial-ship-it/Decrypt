.class final Lr8/d$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr8/d;->b(LO7/a;LO7/a;ZZZLG8/g;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO7/a;

.field final synthetic E:LO7/a;


# direct methods
.method constructor <init>(LO7/a;LO7/a;)V
    .locals 0

    iput-object p1, p0, Lr8/d$b;->D:LO7/a;

    iput-object p2, p0, Lr8/d$b;->E:LO7/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/m;LO7/m;)Ljava/lang/Boolean;
    .locals 1

    .prologue
    iget-object v0, p0, Lr8/d$b;->D:LO7/a;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lr8/d$b;->E:LO7/a;

    invoke-static {p2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/m;

    check-cast p2, LO7/m;

    invoke-virtual {p0, p1, p2}, Lr8/d$b;->a(LO7/m;LO7/m;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
