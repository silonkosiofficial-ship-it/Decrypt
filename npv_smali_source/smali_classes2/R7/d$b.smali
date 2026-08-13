.class final LR7/d$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/d;-><init>(LE8/n;LO7/m;LP7/g;Ln8/f;LO7/a0;LO7/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LR7/d;


# direct methods
.method constructor <init>(LR7/d;)V
    .locals 0

    iput-object p1, p0, LR7/d$b;->D:LR7/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LR7/d$b;->D:LR7/d;

    invoke-virtual {v0}, LR7/d;->U0()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR7/d$b;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
