.class final Lb8/f$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/f;-><init>(La8/g;LO7/m;Le8/g;LO7/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/f;


# direct methods
.method constructor <init>(Lb8/f;)V
    .locals 0

    iput-object p1, p0, Lb8/f$f;->D:Lb8/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LG8/g;)Lb8/g;
    .locals 7

    .prologue
    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lb8/g;

    iget-object v0, p0, Lb8/f$f;->D:Lb8/f;

    invoke-static {v0}, Lb8/f;->U0(Lb8/f;)La8/g;

    move-result-object v2

    iget-object v3, p0, Lb8/f$f;->D:Lb8/f;

    invoke-virtual {v3}, Lb8/f;->Y0()Le8/g;

    move-result-object v4

    iget-object v0, p0, Lb8/f$f;->D:Lb8/f;

    invoke-static {v0}, Lb8/f;->T0(Lb8/f;)LO7/e;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lb8/f$f;->D:Lb8/f;

    invoke-static {v0}, Lb8/f;->V0(Lb8/f;)Lb8/g;

    move-result-object v6

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lb8/g;-><init>(La8/g;LO7/e;Le8/g;ZLb8/g;)V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG8/g;

    invoke-virtual {p0, p1}, Lb8/f$f;->a(LG8/g;)Lb8/g;

    move-result-object p1

    return-object p1
.end method
