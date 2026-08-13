.class final LI7/j$c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/j$c;->a()Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO7/X;


# direct methods
.method constructor <init>(LO7/X;)V
    .locals 0

    iput-object p1, p0, LI7/j$c$a;->D:LO7/X;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LO7/Q;
    .locals 1

    iget-object v0, p0, LI7/j$c$a;->D:LO7/X;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/j$c$a;->a()LO7/Q;

    move-result-object v0

    return-object v0
.end method
