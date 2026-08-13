.class public final La8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La8/i;


# instance fields
.field public a:Lw8/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le8/g;)LO7/e;
    .locals 1

    const-string v0, "javaClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, La8/j;->b()Lw8/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lw8/c;->b(Le8/g;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lw8/c;
    .locals 1

    .prologue
    iget-object v0, p0, La8/j;->a:Lw8/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "resolver"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c(Lw8/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, La8/j;->a:Lw8/c;

    return-void
.end method
