.class final Lz0/v$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz0/v;->a2()Lz0/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/O;


# direct methods
.method constructor <init>(Ly7/O;)V
    .locals 0

    iput-object p1, p0, Lz0/v$d;->D:Ly7/O;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/v;)Ljava/lang/Boolean;
    .locals 1

    .prologue
    invoke-virtual {p1}, Lz0/v;->b2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lz0/v;->T1(Lz0/v;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz0/v$d;->D:Ly7/O;

    iput-object p1, v0, Ly7/O;->C:Ljava/lang/Object;

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/v;

    invoke-virtual {p0, p1}, Lz0/v$d;->a(Lz0/v;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
