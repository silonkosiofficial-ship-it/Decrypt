.class final LI7/j$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/j;-><init>()V
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

    iput-object p1, p0, LI7/j$b;->D:LI7/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LI7/j$b;->D:LI7/j;

    invoke-virtual {v0}, LI7/j;->A()LO7/b;

    move-result-object v0

    invoke-static {v0}, LI7/M;->e(LP7/a;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/j$b;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
