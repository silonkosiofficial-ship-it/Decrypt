.class public final Lk9/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/b;


# instance fields
.field private final a:LF7/i;


# direct methods
.method public constructor <init>(LF7/i;)V
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/x;->a:LF7/i;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk9/x;->a:LF7/i;

    invoke-interface {v0, p1}, LF7/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lk9/b$a;->a(Lk9/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, Lk9/x;->a:LF7/i;

    invoke-interface {v0, p1}, LF7/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lk9/x;->a:LF7/i;

    invoke-interface {v0, p1, p2}, LF7/i;->r(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    move-object v0, v1

    goto :goto_1

    :cond_0
    invoke-static {v0, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk9/x;->a:LF7/i;

    invoke-interface {v0}, LF7/b;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
