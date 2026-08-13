.class final LM1/j$p;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j;-><init>(LM1/w;Ljava/util/List;LM1/d;LW8/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LM1/j;


# direct methods
.method constructor <init>(LM1/j;)V
    .locals 0

    iput-object p1, p0, LM1/j$p;->D:LM1/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LM1/x;
    .locals 1

    iget-object v0, p0, LM1/j$p;->D:LM1/j;

    invoke-static {v0}, LM1/j;->f(LM1/j;)LM1/w;

    move-result-object v0

    invoke-interface {v0}, LM1/w;->a()LM1/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM1/j$p;->a()LM1/x;

    move-result-object v0

    return-object v0
.end method
