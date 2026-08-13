.class final LS/X$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/X;->d2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/X;


# direct methods
.method constructor <init>(LS/X;)V
    .locals 0

    iput-object p1, p0, LS/X$b;->D:LS/X;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LR/g;
    .locals 2

    .prologue
    iget-object v0, p0, LS/X$b;->D:LS/X;

    invoke-static {}, LS/I0;->a()LV/O0;

    move-result-object v1

    invoke-static {v0, v1}, LF0/i;->a(LF0/h;LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS/G0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LS/G0;->b()LR/g;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, LS/H0;->a:LS/H0;

    invoke-virtual {v0}, LS/H0;->a()LR/g;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/X$b;->a()LR/g;

    move-result-object v0

    return-object v0
.end method
