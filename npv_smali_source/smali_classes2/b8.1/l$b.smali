.class final Lb8/l$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/l;->s(Ln8/f;Ljava/util/Collection;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ln8/f;


# direct methods
.method constructor <init>(Ln8/f;)V
    .locals 0

    iput-object p1, p0, Lb8/l$b;->D:Ln8/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly8/h;)Ljava/util/Collection;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/l$b;->D:Ln8/f;

    sget-object v1, LW7/d;->Q:LW7/d;

    invoke-interface {p1, v0, v1}, Ly8/h;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly8/h;

    invoke-virtual {p0, p1}, Lb8/l$b;->a(Ly8/h;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
