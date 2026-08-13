.class final LI7/j$d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/j$d;->a()LI7/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/j;


# direct methods
.method constructor <init>(LI7/j;)V
    .locals 0

    iput-object p1, p0, LI7/j$d$a;->D:LI7/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/reflect/Type;
    .locals 1

    .prologue
    iget-object v0, p0, LI7/j$d$a;->D:LI7/j;

    invoke-static {v0}, LI7/j;->f(LI7/j;)Ljava/lang/reflect/Type;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, LI7/j$d$a;->D:LI7/j;

    invoke-virtual {v0}, LI7/j;->s()LJ7/e;

    move-result-object v0

    invoke-interface {v0}, LJ7/e;->l()Ljava/lang/reflect/Type;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/j$d$a;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method
