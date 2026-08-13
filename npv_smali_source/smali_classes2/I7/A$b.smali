.class final LI7/A$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/A;-><init>(LF8/E;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/A;


# direct methods
.method constructor <init>(LI7/A;)V
    .locals 0

    iput-object p1, p0, LI7/A$b;->D:LI7/A;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF7/d;
    .locals 2

    iget-object v0, p0, LI7/A$b;->D:LI7/A;

    invoke-virtual {v0}, LI7/A;->f()LF8/E;

    move-result-object v1

    invoke-static {v0, v1}, LI7/A;->d(LI7/A;LF8/E;)LF7/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/A$b;->a()LF7/d;

    move-result-object v0

    return-object v0
.end method
