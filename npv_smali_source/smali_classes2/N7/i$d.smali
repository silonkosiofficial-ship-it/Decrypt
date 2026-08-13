.class public final LN7/i$d;
.super LR7/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN7/i;->l(LE8/n;)LF8/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>(LO7/G;Ln8/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LR7/z;-><init>(LO7/G;Ln8/c;)V

    return-void
.end method


# virtual methods
.method public O0()Ly8/h$b;
    .locals 1

    sget-object v0, Ly8/h$b;->b:Ly8/h$b;

    return-object v0
.end method

.method public bridge synthetic u()Ly8/h;
    .locals 1

    invoke-virtual {p0}, LN7/i$d;->O0()Ly8/h$b;

    move-result-object v0

    return-object v0
.end method
