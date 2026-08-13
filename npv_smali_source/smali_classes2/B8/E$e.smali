.class final LB8/E$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB8/E;->t(LB8/E;Li8/q;I)LO7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB8/E;


# direct methods
.method constructor <init>(LB8/E;)V
    .locals 0

    iput-object p1, p0, LB8/E$e;->D:LB8/E;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li8/q;)Li8/q;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/E$e;->D:LB8/E;

    invoke-static {v0}, LB8/E;->c(LB8/E;)LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->j()Lk8/g;

    move-result-object v0

    invoke-static {p1, v0}, Lk8/f;->j(Li8/q;Lk8/g;)Li8/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li8/q;

    invoke-virtual {p0, p1}, LB8/E$e;->a(Li8/q;)Li8/q;

    move-result-object p1

    return-object p1
.end method
