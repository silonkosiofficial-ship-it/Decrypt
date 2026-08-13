.class final LF8/T$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/T;-><init>(LO7/f0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/T;


# direct methods
.method constructor <init>(LF8/T;)V
    .locals 0

    iput-object p1, p0, LF8/T$a;->D:LF8/T;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF8/E;
    .locals 1

    iget-object v0, p0, LF8/T$a;->D:LF8/T;

    invoke-static {v0}, LF8/T;->c(LF8/T;)LO7/f0;

    move-result-object v0

    invoke-static {v0}, LF8/U;->b(LO7/f0;)LF8/E;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF8/T$a;->a()LF8/E;

    move-result-object v0

    return-object v0
.end method
