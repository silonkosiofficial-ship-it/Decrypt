.class final LI7/y$d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/y$d;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/y$d;


# direct methods
.method constructor <init>(LI7/y$d;)V
    .locals 0

    iput-object p1, p0, LI7/y$d$a;->D:LI7/y$d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LJ7/e;
    .locals 2

    iget-object v0, p0, LI7/y$d$a;->D:LI7/y$d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LI7/z;->a(LI7/y$a;Z)LJ7/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/y$d$a;->a()LJ7/e;

    move-result-object v0

    return-object v0
.end method
