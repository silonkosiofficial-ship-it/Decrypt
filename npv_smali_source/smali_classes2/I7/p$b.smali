.class final LI7/p$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/p;-><init>(LI7/n;LO7/U;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/p;


# direct methods
.method constructor <init>(LI7/p;)V
    .locals 0

    iput-object p1, p0, LI7/p$b;->D:LI7/p;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LI7/p$a;
    .locals 2

    new-instance v0, LI7/p$a;

    iget-object v1, p0, LI7/p$b;->D:LI7/p;

    invoke-direct {v0, v1}, LI7/p$a;-><init>(LI7/p;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/p$b;->a()LI7/p$a;

    move-result-object v0

    return-object v0
.end method
