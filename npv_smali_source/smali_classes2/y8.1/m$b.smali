.class final Ly8/m$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/m;-><init>(Ly8/h;LF8/n0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/n0;


# direct methods
.method constructor <init>(LF8/n0;)V
    .locals 0

    iput-object p1, p0, Ly8/m$b;->D:LF8/n0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF8/n0;
    .locals 1

    iget-object v0, p0, Ly8/m$b;->D:LF8/n0;

    invoke-virtual {v0}, LF8/n0;->j()LF8/l0;

    move-result-object v0

    invoke-virtual {v0}, LF8/l0;->c()LF8/n0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly8/m$b;->a()LF8/n0;

    move-result-object v0

    return-object v0
.end method
