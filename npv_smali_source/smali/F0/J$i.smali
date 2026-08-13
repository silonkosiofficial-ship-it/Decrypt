.class final LF0/J$i;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/J;-><init>(ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/J;


# direct methods
.method constructor <init>(LF0/J;)V
    .locals 0

    iput-object p1, p0, LF0/J$i;->D:LF0/J;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LF0/J$i;->D:LF0/J;

    invoke-virtual {v0}, LF0/J;->V()LF0/O;

    move-result-object v0

    invoke-virtual {v0}, LF0/O;->N()V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/J$i;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
