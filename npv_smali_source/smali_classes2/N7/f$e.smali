.class final LN7/f$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN7/f;->J0(LO7/G;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO7/G;

.field final synthetic E:Z


# direct methods
.method constructor <init>(LO7/G;Z)V
    .locals 0

    iput-object p1, p0, LN7/f$e;->D:LO7/G;

    iput-boolean p2, p0, LN7/f$e;->E:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LN7/f$b;
    .locals 3

    new-instance v0, LN7/f$b;

    iget-object v1, p0, LN7/f$e;->D:LO7/G;

    iget-boolean v2, p0, LN7/f$e;->E:Z

    invoke-direct {v0, v1, v2}, LN7/f$b;-><init>(LO7/G;Z)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN7/f$e;->a()LN7/f$b;

    move-result-object v0

    return-object v0
.end method
