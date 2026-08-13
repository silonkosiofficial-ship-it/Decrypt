.class final Lz0/v$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz0/v;->Z1()Lz0/v;
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

    iput-object p1, p0, Lz0/v$c;->D:Ly7/O;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/v;)LF0/D0;
    .locals 2

    .prologue
    sget-object v0, LF0/D0;->C:LF0/D0;

    invoke-static {p1}, Lz0/v;->T1(Lz0/v;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lz0/v$c;->D:Ly7/O;

    iput-object p1, v1, Ly7/O;->C:Ljava/lang/Object;

    invoke-virtual {p1}, Lz0/v;->b2()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object v0, LF0/D0;->D:LF0/D0;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/v;

    invoke-virtual {p0, p1}, Lz0/v$c;->a(Lz0/v;)LF0/D0;

    move-result-object p1

    return-object p1
.end method
