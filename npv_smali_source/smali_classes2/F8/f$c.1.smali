.class final LF8/f$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/f;-><init>(LE8/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/f;


# direct methods
.method constructor <init>(LF8/f;)V
    .locals 0

    iput-object p1, p0, LF8/f$c;->D:LF8/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF8/f$b;
    .locals 2

    new-instance v0, LF8/f$b;

    iget-object v1, p0, LF8/f$c;->D:LF8/f;

    invoke-virtual {v1}, LF8/f;->g()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, LF8/f$b;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF8/f$c;->a()LF8/f$b;

    move-result-object v0

    return-object v0
.end method
