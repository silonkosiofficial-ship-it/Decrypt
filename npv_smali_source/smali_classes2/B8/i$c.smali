.class final LB8/i$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB8/i;-><init>(LB8/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB8/i;


# direct methods
.method constructor <init>(LB8/i;)V
    .locals 0

    iput-object p1, p0, LB8/i$c;->D:LB8/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LB8/i$a;)LO7/e;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/i$c;->D:LB8/i;

    invoke-static {v0, p1}, LB8/i;->a(LB8/i;LB8/i$a;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LB8/i$a;

    invoke-virtual {p0, p1}, LB8/i$c;->a(LB8/i$a;)LO7/e;

    move-result-object p1

    return-object p1
.end method
