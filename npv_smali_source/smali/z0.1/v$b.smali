.class final Lz0/v$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz0/v;->Y1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/K;


# direct methods
.method constructor <init>(Ly7/K;)V
    .locals 0

    iput-object p1, p0, Lz0/v$b;->D:Ly7/K;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/v;)LF0/D0;
    .locals 1

    .prologue
    invoke-static {p1}, Lz0/v;->T1(Lz0/v;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz0/v$b;->D:Ly7/K;

    const/4 v0, 0x0

    iput-boolean v0, p1, Ly7/K;->C:Z

    sget-object p1, LF0/D0;->E:LF0/D0;

    goto :goto_0

    :cond_0
    sget-object p1, LF0/D0;->C:LF0/D0;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/v;

    invoke-virtual {p0, p1}, Lz0/v$b;->a(Lz0/v;)LF0/D0;

    move-result-object p1

    return-object p1
.end method
