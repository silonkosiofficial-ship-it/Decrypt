.class final Lb8/f$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


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

    iput-object p1, p0, Lb8/f$e;->D:Lb8/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 2

    .prologue
    iget-object v0, p0, Lb8/f$e;->D:Lb8/f;

    invoke-static {v0}, Lv8/c;->k(LO7/h;)Ln8/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lb8/f$e;->D:Lb8/f;

    invoke-virtual {v1}, Lb8/f;->a1()La8/g;

    move-result-object v1

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {v1}, La8/b;->f()LX7/u;

    move-result-object v1

    invoke-interface {v1, v0}, LX7/u;->a(Ln8/b;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/f$e;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
