.class final LI7/t$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/t$a;-><init>(LI7/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/t;

.field final synthetic E:LI7/t$a;


# direct methods
.method constructor <init>(LI7/t;LI7/t$a;)V
    .locals 0

    iput-object p1, p0, LI7/t$a$b;->D:LI7/t;

    iput-object p2, p0, LI7/t$a$b;->E:LI7/t$a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 3

    iget-object v0, p0, LI7/t$a$b;->D:LI7/t;

    iget-object v1, p0, LI7/t$a$b;->E:LI7/t$a;

    invoke-virtual {v1}, LI7/t$a;->f()Ly8/h;

    move-result-object v1

    sget-object v2, LI7/n$c;->C:LI7/n$c;

    invoke-virtual {v0, v1, v2}, LI7/n;->u(Ly8/h;LI7/n$c;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/t$a$b;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
