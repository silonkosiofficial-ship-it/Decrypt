.class final Ly8/g$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/g;-><init>(LE8/n;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/a;


# direct methods
.method constructor <init>(Lx7/a;)V
    .locals 0

    iput-object p1, p0, Ly8/g$a;->D:Lx7/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ly8/h;
    .locals 2

    .prologue
    iget-object v0, p0, Ly8/g$a;->D:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly8/h;

    instance-of v1, v0, Ly8/a;

    if-eqz v1, :cond_0

    check-cast v0, Ly8/a;

    invoke-virtual {v0}, Ly8/a;->h()Ly8/h;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly8/g$a;->a()Ly8/h;

    move-result-object v0

    return-object v0
.end method
